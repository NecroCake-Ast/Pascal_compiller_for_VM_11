package VM11.PascalCompiller;



import java.util.ArrayList;

import VM11.PascalCompiller.Data.AdditionVariableCount;
import VM11.PascalCompiller.Data.CodeLine;
import VM11.PascalCompiller.Data.Variable;
import VM11.PascalCompiller.Data.Variable.Type;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.ExprContext;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.Expr_pr1Context;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.Expr_pr2Context;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.Expr_pr3Context;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.Set_operatorContext;

/*!
 * \brief Генератор кода арифметических выражений
 */
public class ExpressionAnalyzer {
	protected ArrayList<CodeLine> _code;
	
	public ExpressionAnalyzer(ArrayList<CodeLine> code) {
		_code = code;
	}
	
	/*! \brief Начальный регистр (1 используется только для пересылки) */
	public static final int startRegister = 2;
	/*! \brief Регистр, после которого требуется сохранять первый операнд в память */
	public static final int lastLeftOperandRegister = 6;
	/*! \brief Регистр, после которого второй операнд надо пересылать в следующий регистр */
	public static final int lastRightOperandRegister = lastLeftOperandRegister + 1;
	
	/*!
	 *  \brief Является ли выражение вещественным
	 *  
	 *   Влияет на запись арифметических операторов
	 */
	protected boolean isRealType;
	protected int additionIntVariableCnt;   //!< Количество дополнительных целочисленных переменных
	protected int additionRealVariableCnt;  //!< Количество дополнительных вещественных переменных

	/*!
	 * \brief Сохранение регистра в память в случае переполнения
	 * 
	 * Записывает предпоследний регистр в память,
	 * если номер текущего регистра превысил lastLeftOperandRegister
	 */
	protected void saveRegister(int savingRegister, int exprDeep) {
		if (exprDeep > lastLeftOperandRegister) {
			_code.add(new CodeLine("cpy $" + savingRegister + " $1",
					"$" + savingRegister + " >> $1"));
			String saveCode = "sv !" + (isRealType ? "f" : "") + (exprDeep - lastLeftOperandRegister);
			_code.add(new CodeLine (saveCode, "$1 >> !" + (exprDeep - lastLeftOperandRegister)));
		}
	}

	/*!
	 * \brief Загрузка регистра из памяти в случае переполнения
	 * 
	 * Считывает предпоследний регистр из память,
	 * если номер текущего регистра превысил lastLeftOperandRegister
	 */
	protected void restoreRegister(int restoredRegister, int exprDeep) {
		if (exprDeep > lastLeftOperandRegister) {
			String loadCode = "ld !" + (isRealType ? "f" : "") + (exprDeep - lastLeftOperandRegister);
			_code.add(new CodeLine(loadCode, "$1 << !" + (exprDeep - lastLeftOperandRegister)));
			_code.add(new CodeLine("cpy $1 $" + restoredRegister,
					"$1 >> $" + restoredRegister));
		}
	}
	
	protected void calculateAdditionVariableCount(int register) {
		int additionCnt = register - lastRightOperandRegister;
		if (isRealType)
			additionRealVariableCnt = Math.max(additionRealVariableCnt, additionCnt);
		else
			additionIntVariableCnt = Math.max(additionIntVariableCnt, additionCnt);
	}
	
	/*!
	 * \brief Генерация кода для операторов сложения и вычитания
	 */
	protected void genExprCode(ExprContext ctx, int register) {
		String exprCode = isRealType ? "f" : "";
		String comment = ctx.expr_pr3().getText() + " | ";
		if (ctx.KW_PLUS() != null) {
			exprCode += "add ";
			comment += "+ |";
		}
		else if (ctx.KW_MINUS() != null) {
			exprCode += "sub ";
			comment += "- |";
		}
		int realRegister = register > lastRightOperandRegister ? lastRightOperandRegister : register;
		exprCode += "$" + realRegister + " $" + (realRegister + 1);
		comment += " " + ctx.expr().getText();
		_code.add(new CodeLine(exprCode, comment));
	}

	/*!
	 * Генерация кода для операторов умножения и деления
	 */
	protected void genExprPr3Code(Expr_pr3Context ctx, int register) {
		String exprCode = isRealType ? "f" : "";
		String comment = ctx.expr_pr2().getText() + " | ";
		if (ctx.KW_MULT() != null) {
			exprCode += "mul ";
			comment += "* |";
		}
		else if (ctx.KW_DIV() != null) {
			exprCode += "div ";
			comment += "div |";
		}
		else if (ctx.KW_SLASH() != null) {
			exprCode += "div ";
			comment += "/ |";
		}
		int realRegister = register > lastRightOperandRegister ? lastRightOperandRegister : register;
		exprCode += "$" + realRegister + " $" + (realRegister + 1);
		comment += " " + ctx.expr_pr3().getText();
		_code.add(new CodeLine(exprCode, comment));
	}
	
	/*!
	 * \brief Рекурсивная генерация кода для выражений с наивысшим приоритетом
	 */
	protected void compileExprPr1(Expr_pr1Context ctx, int register) {
		calculateAdditionVariableCount(register);
		int realRegister = register > lastRightOperandRegister ? lastRightOperandRegister : register;
		if (ctx.expr() != null)
			compileExpr(ctx.expr(), register);
		else if (ctx.variable() != null) {
			_code.add(new CodeLine("ld " + ctx.variable().getText(),
					"$1 << " + ctx.variable().getText()));
			_code.add(new CodeLine("cpy $1 $" + realRegister,
					"$1 >> $" + realRegister));
		}
		else if (ctx.NUMBER() != null) {
			String loadCode = (isRealType ? "f" : "") + "ldconst " + ctx.NUMBER();
			_code.add(new CodeLine(loadCode, "$1 << " + ctx.NUMBER()));
			_code.add(new CodeLine("cpy $1 $" + realRegister,
					"$1 >> $" + realRegister));
		}
		else if (ctx.unsigned_real_number() != null) {
			_code.add(new CodeLine("fldconst " + ctx.unsigned_real_number().getText(),
					"$1 << " + ctx.unsigned_real_number()));
			_code.add(new CodeLine("cpy $1 $" + realRegister,
					"$1 >> $" + realRegister));
		}
	}
	
	/*!
	 * Рекурсивная генерация кода выражения с высоким приоритетом
	 */
	protected void compileExprPr2(Expr_pr2Context ctx, int register) {
		calculateAdditionVariableCount(register);
		compileExprPr1(ctx.expr_pr1(), register);
		if (ctx.KW_MINUS() != null) {
			int realRegister = register > lastRightOperandRegister ? lastRightOperandRegister : register;
			_code.add(new CodeLine("cpy $" + realRegister + " $" + (realRegister + 1),
					"$" + realRegister + " >> $" + (realRegister + 1)));
			_code.add(new CodeLine("clr $" + realRegister,
					"$" + realRegister + " << 0"));
			if (isRealType)
				_code.add(new CodeLine("fsub $" + realRegister + " $" + (realRegister + 1),
						"| - |" + ctx.expr_pr1().getText()));
			else
				_code.add(new CodeLine("sub $" + realRegister + " $" + (realRegister + 1),
						"| - |" + ctx.expr_pr1().getText()));
		}
	}
	
	/*!
	 * Рекурсивная генерация кода для выражения с средним приоритетом
	 */
	protected void compileExprPr3(Expr_pr3Context ctx, int register) {
		calculateAdditionVariableCount(register);
		compileExprPr2(ctx.expr_pr2(), register);                     // Обработка левого операнда
		if (ctx.expr_pr3() != null) {                                 // Если существует правый операнд
			saveRegister(lastRightOperandRegister, register);         // | Сохранение 7 регистра, если свободные регистры заполнены
			compileExprPr3(ctx.expr_pr3(), register + 1);             // | Обработка правого операнд
			if (register > lastLeftOperandRegister)                   // | Если свободные регистры закончились
				_code.add(new CodeLine("cpy $7 $8", "$7 >> $8")); // | | 7 регистр перемещается в 8 для выполнения операции
			restoreRegister(lastRightOperandRegister, register);      // | Восстновление 7 регистра, если он был сохранён
			genExprPr3Code(ctx, register);                            // | Генерация код операции
		}
	}
	
	/*!
	 * Рекурсивная генерация кода для выражения с наименьшим приоритетом
	 */
	protected void compileExpr(ExprContext ctx, int register) {
		calculateAdditionVariableCount(register);
		compileExprPr3(ctx.expr_pr3(), register);                     // Обработка левого операнд
		if (ctx.expr() != null) {                                     // Если существует правый операнд
			saveRegister(lastRightOperandRegister, register);         // | Сохранение 7 регистра, если свободные регистры заполнены
			compileExpr(ctx.expr(), register + 1);                    // | Обработка правого операнд
			if (register > lastLeftOperandRegister)                   // | Если свободные регистры закончились
				_code.add(new CodeLine("cpy $7 $8", "$7 >> $8")); // | | 7 регистр перемещается в 8 для выполнения операции
			restoreRegister(lastRightOperandRegister, register);      // | Восстновление 7 регистра, если он был сохранён
			genExprCode(ctx, register);                               // | Генерация кода операции
		}
	}
	
	/*!
	 * Генерация кода для переданного выражения
	 */
	public AdditionVariableCount Compile(Set_operatorContext ctx, int register) {
		additionIntVariableCnt = additionRealVariableCnt = 0;
		Variable firstVar = Main.Variables.Find(ctx.name_list().variable().get(0).NAME().getText());
		isRealType = firstVar.getType() == Type.VT_FLOAT;
		compileExpr(ctx.set().expr(), register);
		_code.add(new CodeLine("cpy $" + register + " $1", "line " + ctx.start.getLine()));
		for (var curName : ctx.name_list().variable()) {
			String setCode = "sv " + curName.NAME().getText();
			if (curName.INDEX() != null)
				setCode += curName.INDEX().getText();
			_code.add(new CodeLine(setCode, "line " + ctx.start.getLine()));
		}
		return new AdditionVariableCount(additionIntVariableCnt, additionRealVariableCnt);
	}
}
