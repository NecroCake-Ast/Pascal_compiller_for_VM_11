// Generated from ru/NecroCake/VM11/Compillers/PascalCompiller/Pascal.g4 by ANTLR 4.9.2
package ru.NecroCake.VM11.Compillers.PascalCompiller;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PascalParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(PascalParser.ProgrammContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(PascalParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PascalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(PascalParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(PascalParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#read_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_operator(PascalParser.Read_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#write_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_operator(PascalParser.Write_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#if_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_operator(PascalParser.If_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#else_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_operator(PascalParser.Else_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#while_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_operator(PascalParser.While_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#set_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_operator(PascalParser.Set_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(PascalParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PascalParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#expr_pr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_pr3(PascalParser.Expr_pr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#expr_pr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_pr2(PascalParser.Expr_pr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#expr_pr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_pr1(PascalParser.Expr_pr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(PascalParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#unsigned_real_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_real_number(PascalParser.Unsigned_real_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#real_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_number(PascalParser.Real_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(PascalParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PascalParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PascalParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(PascalParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_list(PascalParser.Name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(PascalParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#any_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_number(PascalParser.Any_numberContext ctx);
}