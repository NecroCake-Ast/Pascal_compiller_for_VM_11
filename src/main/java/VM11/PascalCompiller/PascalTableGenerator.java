package VM11.PascalCompiller;

import VM11.PascalCompiller.Data.Variable;
import VM11.PascalCompiller.Data.Variable.Modifier;
import VM11.PascalCompiller.Data.Variable.Type;
import VM11.PascalCompiller.Exceptions.ArithmeticException;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalBaseVisitor;
import ru.NecroCake.VM11.Compillers.PascalCompiller.PascalParser.*;

/*!
 * \brief Генератор таблицы переменных
 */
public class PascalTableGenerator extends PascalBaseVisitor<Object> {	
	private Modifier getModifier(DeclareContext ctx) {
		if (ctx.INDEX() != null)
			return Modifier.MOD_ARRAY;
		return Modifier.MOD_NONE;
	}
	
	private int getSize(Type type, DeclareContext ctx) {
		int size = 1;
		if (ctx.INDEX() != null) {
			String arrSize = ctx.INDEX().getText();
			size = Integer.parseInt(arrSize.substring(1, arrSize.indexOf(']')));
		}
		return size;
	}

	private void checkExprPr1(Expr_pr1Context expr, Type type) throws ArithmeticException {
		if (expr.variable() != null) {
			String name = expr.variable().NAME().getText();
			Variable var = Main.Variables.Find(name);
			if (var == null) {
				Main.Errors.UnknownVariableError(expr.variable().start.getLine(), name);;
				throw new ArithmeticException();
			}
			else if (var.getType() != type && type != Type.VT_NONE) {
				Main.Errors.TypeCastError(expr.variable().start.getLine(), var.getType(), type);
				throw new ArithmeticException();
			}
		}
		
		else if (expr.unsigned_real_number() != null && (type == Type.VT_INTEGER || type == Type.VT_UNSIGNED_INTEGER)) {
			Main.Errors.TypeCastError(expr.start.getLine(), Type.VT_FLOAT, type);
			throw new ArithmeticException();
		}
	}
	
	private void checkExprPr2(Expr_pr2Context expr, Type type) throws ArithmeticException {
		checkExprPr1(expr.expr_pr1(), type);
	}
	
	private void checkExprPr3(Expr_pr3Context expr, Type type) throws ArithmeticException {
		checkExprPr2(expr.expr_pr2(), type);
		if (expr.expr_pr3() != null) {
			if (type == Type.VT_FLOAT) {
				if (expr.KW_DIV() != null) {
					Main.Errors.InvalidOperationError(expr.start.getLine(), "div", type);
					throw new ArithmeticException();
				}
				if (expr.KW_MOD() != null) {
					Main.Errors.InvalidOperationError(expr.start.getLine(), "mod", type);
				}
			}
			checkExprPr3(expr.expr_pr3(), type);
		}
	}
	
	private void checkExpr(ExprContext expr, Type type) throws ArithmeticException {
		checkExprPr3(expr.expr_pr3(), type);
		if (expr.expr() != null)
			checkExpr(expr.expr(), type);
	}
	
	private void isCorrectArithmetic(DeclareContext ctx, Type type, Modifier modifier) throws ArithmeticException {
		if (ctx.set() != null) {
			if (ctx.set().STRING() != null) {
				Main.Errors.TypeCastError(ctx.start.getLine(), Type.VT_CHAR, type);
				throw new ArithmeticException();
			}
			else if (ctx.set().expr() != null)
				checkExpr(ctx.set().expr(), type);
		}
	}
	
	@Override
	public Object visitDeclare(DeclareContext ctx) {
		Type type = Variable.GetTypeByName(ctx.TYPE().getText());
		if (type != Type.VT_NONE) {
			Modifier modifier = getModifier(ctx);
			int size = getSize(type, ctx);
			String value = "";
			try {
				isCorrectArithmetic(ctx, type, modifier);
			} catch (Exception e) {}
			for (var name : ctx.NAME())
			{
				Variable var = new Variable();
				var.setName(name.getText());
				var.setSize(size);
				var.setModifier(modifier);
				var.setValue(value);
				var.setType(Variable.GetTypeByName(ctx.TYPE().getText()));
				Main.Variables.Add(var);
			}
		}
		return super.visitDeclare(ctx);
	}
	
	@Override
	public Object visitSet_operator(Set_operatorContext ctx) {
		int line = ctx.start.getLine();
		for (var name : ctx.name_list().variable())
			if (Main.Variables.Find(name.NAME().getText()) == null)
				Main.Errors.UnknownVariableError(line, name.NAME().getText());
		return super.visitSet_operator(ctx);
	}
	
	@Override
	public Object visitCompare(CompareContext ctx) {
		try {
			Type type = LogicExpressionAnalyzer.getCompareType(ctx);
			checkExpr(ctx.expr().get(0), type);
			checkExpr(ctx.expr().get(1), type);
		} catch (Exception e) {}
		return super.visitCompare(ctx);
	}

	@Override
	public Object visitRead_operator(Read_operatorContext ctx) {
		for (var curName : ctx.name_list().variable())
			if (Main.Variables.Find(curName.NAME().getText()) == null)
				Main.Errors.UnknownVariableError(curName.start.getLine(), curName.NAME().getText());
		return super.visitRead_operator(ctx);
	}
	
	@Override
	public Object visitWrite_operator(Write_operatorContext ctx) {
		for (var curParam : ctx.param_list().param())
			if (curParam.NAME() != null && Main.Variables.Find(curParam.NAME().getText()) == null)
				Main.Errors.UnknownVariableError(curParam.start.getLine(), curParam.NAME().getText());
		return super.visitWrite_operator(ctx);
	}
}
