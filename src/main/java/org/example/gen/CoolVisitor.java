package org.example.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CoolParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CoolParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#attribute_without_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_without_semicolon(CoolParser.Attribute_without_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(CoolParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(CoolParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(CoolParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(CoolParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(CoolParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(CoolParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CoolParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(CoolParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#case_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_option(CoolParser.Case_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(CoolParser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(CoolParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#isvoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#ariphemitic_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAriphemitic_operation(CoolParser.Ariphemitic_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(CoolParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CoolParser.ExprContext ctx);
}