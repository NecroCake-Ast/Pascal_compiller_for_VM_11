package VM11.PascalCompiller;

import java.util.ArrayList;

import VM11.PascalCompiller.Data.AdditionVariableCount;
import VM11.PascalCompiller.Data.CodeLine;
import VM11.PascalCompiller.Data.Variable;
import VM11.PascalCompiller.Data.Variable.Type;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.CompareContext;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.ExprContext;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.Expr_pr1Context;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.Expr_pr2Context;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.Expr_pr3Context;

/*!
 * \brief Генератор кода логических выражений
 */
public class LogicExpressionAnalyzer extends ExpressionAnalyzer {

	public LogicExpressionAnalyzer(ArrayList<CodeLine> code) {
		super(code);
	}

	private static Type getTypeExprPr1(Expr_pr1Context ctx) {
		if (ctx.unsigned_real_number() != null)
			return Type.VT_FLOAT;
		else if (ctx.variable() != null) {
			String name = ctx.variable().NAME().getText();
			Variable var = Main.Variables.Find(name);
			if (var != null)
				return var.getType();
			Main.Errors.UnknownVariableError(ctx.variable().start.getLine(), name);
		}
		else if (ctx.expr() != null)
			return getExprType(ctx.expr());
		return Type.VT_NONE;
	}
	
	private static Type getTypeExprPr2(Expr_pr2Context ctx) {
		Type type = getTypeExprPr1(ctx.expr_pr1());
		return type;
	}
	
	private static Type getTypeExprPr3(Expr_pr3Context ctx) {
		Type type = getTypeExprPr2(ctx.expr_pr2());
		if (type != Type.VT_NONE && ctx.expr_pr3() != null)
			type = getTypeExprPr3(ctx.expr_pr3());
		return type;
	}
	
	private static Type getExprType(ExprContext ctx) {
		Type type = getTypeExprPr3(ctx.expr_pr3());
		if (type != Type.VT_NONE && ctx.expr() != null)
			type = getExprType(ctx.expr());
		return type;
	}
	
	public static Type getCompareType(CompareContext ctx) {
		Type type = getExprType(ctx.expr().get(0));
		if (type == Type.VT_NONE) {
			type = getExprType(ctx.expr().get(1));
			if (type == Type.VT_NONE)
				type = Type.VT_INTEGER;
		}
		return type;
	}
	
	/*!
	 * \brief Генерация кода оператора сравнения
	 */
	public AdditionVariableCount Compile(CompareContext cmp) {
		additionIntVariableCnt = additionRealVariableCnt = 0;
		isRealType = getCompareType(cmp) == Type.VT_FLOAT;
		compileExpr(cmp.expr().get(0), startRegister);
		compileExpr(cmp.expr().get(1), startRegister + 1);
		String prefix = isRealType ? "f" : "";
		switch (cmp.COMPAR_OPS().getText()) {
			case "<":
				_code.add(new CodeLine(prefix + "cl $2 $3", "line " + cmp.start.getLine()));
				break;
			case "<=":
				_code.add(new CodeLine(prefix + "cle $2 $3", "line " + cmp.start.getLine()));
				break;
			case "=":
				_code.add(new CodeLine(prefix + "ce $2 $3", "line " + cmp.start.getLine()));
				break;
			case ">":
				_code.add(new CodeLine(prefix + "cg $2 $3", "line " + cmp.start.getLine()));
				break;
			case ">=":
				_code.add(new CodeLine(prefix + "cge $2 $3", "line " + cmp.start.getLine()));
				break;
		}
		return new AdditionVariableCount(additionIntVariableCnt, additionRealVariableCnt);
	}
}
