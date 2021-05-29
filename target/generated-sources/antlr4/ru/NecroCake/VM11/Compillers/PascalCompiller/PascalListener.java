// Generated from ru/NecroCake/VM11/Compillers/PascalCompiller/Pascal.g4 by ANTLR 4.9.2
package ru.NecroCake.VM11.Compillers.PascalCompiller;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(PascalParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(PascalParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(PascalParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(PascalParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(PascalParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(PascalParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(PascalParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(PascalParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#read_operator}.
	 * @param ctx the parse tree
	 */
	void enterRead_operator(PascalParser.Read_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#read_operator}.
	 * @param ctx the parse tree
	 */
	void exitRead_operator(PascalParser.Read_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#write_operator}.
	 * @param ctx the parse tree
	 */
	void enterWrite_operator(PascalParser.Write_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#write_operator}.
	 * @param ctx the parse tree
	 */
	void exitWrite_operator(PascalParser.Write_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#if_operator}.
	 * @param ctx the parse tree
	 */
	void enterIf_operator(PascalParser.If_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#if_operator}.
	 * @param ctx the parse tree
	 */
	void exitIf_operator(PascalParser.If_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#else_operator}.
	 * @param ctx the parse tree
	 */
	void enterElse_operator(PascalParser.Else_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#else_operator}.
	 * @param ctx the parse tree
	 */
	void exitElse_operator(PascalParser.Else_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#while_operator}.
	 * @param ctx the parse tree
	 */
	void enterWhile_operator(PascalParser.While_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#while_operator}.
	 * @param ctx the parse tree
	 */
	void exitWhile_operator(PascalParser.While_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#set_operator}.
	 * @param ctx the parse tree
	 */
	void enterSet_operator(PascalParser.Set_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#set_operator}.
	 * @param ctx the parse tree
	 */
	void exitSet_operator(PascalParser.Set_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(PascalParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(PascalParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PascalParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PascalParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#expr_pr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr_pr3(PascalParser.Expr_pr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#expr_pr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr_pr3(PascalParser.Expr_pr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#expr_pr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr_pr2(PascalParser.Expr_pr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#expr_pr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr_pr2(PascalParser.Expr_pr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#expr_pr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr_pr1(PascalParser.Expr_pr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#expr_pr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr_pr1(PascalParser.Expr_pr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(PascalParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(PascalParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#unsigned_real_number}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_real_number(PascalParser.Unsigned_real_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#unsigned_real_number}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_real_number(PascalParser.Unsigned_real_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#real_number}.
	 * @param ctx the parse tree
	 */
	void enterReal_number(PascalParser.Real_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#real_number}.
	 * @param ctx the parse tree
	 */
	void exitReal_number(PascalParser.Real_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(PascalParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(PascalParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PascalParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PascalParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(PascalParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(PascalParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#name_list}.
	 * @param ctx the parse tree
	 */
	void enterName_list(PascalParser.Name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#name_list}.
	 * @param ctx the parse tree
	 */
	void exitName_list(PascalParser.Name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(PascalParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(PascalParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#any_number}.
	 * @param ctx the parse tree
	 */
	void enterAny_number(PascalParser.Any_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#any_number}.
	 * @param ctx the parse tree
	 */
	void exitAny_number(PascalParser.Any_numberContext ctx);
}