package VM11.PascalCompiller;

import java.util.ArrayList;

import VM11.PascalCompiller.Data.AdditionVariableCount;
import VM11.PascalCompiller.Data.CodeLine;
import VM11.PascalCompiller.Data.Variable;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalBaseVisitor;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.BlockContext;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.Declare_blockContext;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.If_operatorContext;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.OperatorContext;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.ProgrammContext;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.Read_operatorContext;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.Set_operatorContext;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.While_operatorContext;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.Write_operatorContext;

/*!
 * \brief Генератор кода
 */
public class PascalCodeGenerator extends PascalBaseVisitor<Object> {
	private ArrayList<CodeLine> _code;
	private int ifCnt;
	private int whileCnt;
	private int additionIntVariableCnt;
	private int additionRealVariableCnt;
	
	public PascalCodeGenerator(ArrayList<CodeLine> code) {
		_code = code;
	}
	
	/*!
	 * \brief Генерация метки для начала блока if
	 */
	private String ifStartLabel() {
		return "if_" + ifCnt + "_start";
	}

	/*!
	 * \brief Генерация метки для конца блока if
	 */
	private String ifEndLabel() {
		return "if_" + ifCnt + "_end";
	}

	/*!
	 * \brief Генерация метки для конца ветки else
	 */
	private String elseLabel() {
		return "else_" + ifCnt + "_end";
	}
	
	/*!
	 * \brief Генерация метки для начала блока while
	 */
	private String whilePredicateLabel() {
		return "while_" + whileCnt + "_predicate";
	}
	
	/*!
	 * \brief Генерация метки для начала блока while
	 */
	private String whileStartLabel() {
		return "while_" + whileCnt + "_start";
	}

	/*!
	 * \brief Генерация метки для конца блока while
	 */
	private String whileEndLabel() {
		return "while_" + whileCnt + "_end";
	}
	
	private void updateAdditionVariableCnt(AdditionVariableCount cnt) {
		if (cnt.getIntCnt() > additionIntVariableCnt)
			additionIntVariableCnt = cnt.getIntCnt();
		if (cnt.getRealCnt() > additionRealVariableCnt)
			additionRealVariableCnt = cnt.getRealCnt();
	}
	
	/*!
	 * \brief Генерация кода блока объявления переменных
	 */
	private void compileDelcareBlock(Declare_blockContext ctx) {
		for (var curDeclare : ctx.declare())
		{
			String line = Variable.GetTypeByName(curDeclare.TYPE().getText()) + " ";
			for (var curName : curDeclare.NAME())
				line += curName.getText() + " ";
			if (curDeclare.set() != null)
				line += "= " + curDeclare.set().expr().getText().trim();
			String comment = "line " + curDeclare.start.getLine();;
			_code.add(new CodeLine(line, comment));
		}
	}
	
	/*!
	 * \brief Генерация кода оператора ввода переменных
	 */
	private void compileReadLn(Read_operatorContext ctx) {
		for (var curVariable : ctx.name_list().variable()) {
			_code.add(new CodeLine("read $1", "line " + curVariable.start.getLine()));
			_code.add(new CodeLine("sv " + curVariable.NAME().getText(),
					"line " + curVariable.start.getLine()));
		}
	}
	
	/*!
	 * \brief Генерация кода оператора вывода
	 */
	private void compileWriteLn(Write_operatorContext ctx) {
		for (var curParam : ctx.param_list().param()) {
			if (curParam.NAME() != null) {
				_code.add(new CodeLine("ld " + curParam.NAME().getText(),
						"line " + curParam.start.getLine()));
				_code.add(new CodeLine("print $1", 
						"line " + curParam.start.getLine()));
			}
			else if (curParam.value().STRING() != null) {
				_code.add(new CodeLine("print_str " + curParam.value().STRING().toString(),
						"line " + curParam.start.getLine()));
			}
		}
	}

	/*!
	 * \brief Генерация кода оператора присваивания
	 */
	private void compileSet(Set_operatorContext ctx) {
		if (ctx.set().expr() != null) {
			ExpressionAnalyzer generator = new ExpressionAnalyzer(_code);
			AdditionVariableCount cnt = generator.Compile(ctx, ExpressionAnalyzer.startRegister);
			updateAdditionVariableCnt(cnt);
		}
	}
	
	/*!
	 * \brief Генерация кода оператора if
	 */
	private void compileIf(If_operatorContext ctx) {
		LogicExpressionAnalyzer generator = new LogicExpressionAnalyzer(_code);
		ifCnt++;
		AdditionVariableCount cnt = generator.Compile(ctx.compare());
		updateAdditionVariableCnt(cnt);
		_code.add(new CodeLine("igoto " + ifStartLabel(), "if true, execute code"));
		_code.add(new CodeLine("goto " + ifEndLabel(), "else skip"));
		_code.add(new CodeLine(ifStartLabel() + ":", "start if"));
		if (ctx.block() != null)
			compileCodeBlock(ctx.block());
		else if (ctx.operator() != null)
			compileOperator(ctx.operator());
		if (ctx.else_operator() != null)
			_code.add(new CodeLine("goto " + elseLabel(), "skip else code"));
		_code.add(new CodeLine(ifEndLabel() + ":", "end if"));
		if (ctx.else_operator() != null) {
			if (ctx.else_operator().block() != null)
				compileCodeBlock(ctx.else_operator().block());
			else if (ctx.else_operator().operator() != null)
				compileOperator(ctx.else_operator().operator());
			_code.add(new CodeLine(elseLabel() + ":", "end else"));
		}
	}

	/*!
	 * \brief Генерация кода оператора while
	 */
	private void compileWhile(While_operatorContext ctx) {
		LogicExpressionAnalyzer generator = new LogicExpressionAnalyzer(_code);
		whileCnt++;
		_code.add(new CodeLine(whilePredicateLabel() + ":", "line " + ctx.start.getLine()));
		AdditionVariableCount cnt = generator.Compile(ctx.compare());
		updateAdditionVariableCnt(cnt);
		_code.add(new CodeLine("igoto " + whileStartLabel(), "if true, execute code"));
		_code.add(new CodeLine("goto " + whileEndLabel(), "else scip"));
		_code.add(new CodeLine(whileStartLabel() + ":", "start cycle"));
		if (ctx.block() != null)
			compileCodeBlock(ctx.block());
		else if (ctx.operator() != null)
			compileOperator(ctx.operator());
		_code.add(new CodeLine("goto " + whilePredicateLabel(), "back to predicate"));
		_code.add(new CodeLine(whileEndLabel() + ":", "end cycle"));
	}
	
	/*!
	 * \brief Генерация кода операторов
	 */
	private void compileOperator(OperatorContext op) {
		if (op.read_operator() != null)
			compileReadLn(op.read_operator());
		else if (op.write_operator() != null)
			compileWriteLn(op.write_operator());
		else if (op.set_operator() != null)
			compileSet(op.set_operator());
		else if (op.if_operator() != null)
			compileIf(op.if_operator());
		else if (op.while_operator() != null)
			compileWhile(op.while_operator());
	}
	
	/*!
	 * \brief Генерация кода блока операторов
	 */
	private void compileCodeBlock(BlockContext block) {
		var Operators = block.operator();
		for (var curOperator : Operators) {
			compileOperator(curOperator);
		}
	}
	
	/*!
	 * \brief Генерация кода объявления дополнительных переменных
	 */
	private void genAdditionVariableCode() {
		if (additionIntVariableCnt != 0) {
			String additionIntVariableCode = Variable.INT_TYPE_NAME + " ";
			for (int i = 0; i < additionIntVariableCnt; i++)
				additionIntVariableCode += "!" + (i + 1) + " ";
			_code.add(0, new CodeLine(additionIntVariableCode, "addition int variable"));
		}
		if (additionRealVariableCnt != 0) {
			String additionRealVariableCode = Variable.FLOAT_TYPE_NAME + " ";
			for (int i = 0; i < additionRealVariableCnt; i++)
				additionRealVariableCode += "!f" + (i + 1) + " ";
			_code.add(0, new CodeLine(additionRealVariableCode, "addition float variable"));
		}
	}
	
	/*!
	 * \brief Посещение токена programm
	 * 
	 * Начальная точка генерации кода
	 */
	@Override
	public Object visitProgramm(ProgrammContext ctx) {
		ifCnt = whileCnt = 0;
		compileDelcareBlock(ctx.declare_block());
		compileCodeBlock(ctx.block());
		genAdditionVariableCode();
		return super.visitProgramm(ctx);
	}
}
