package org.example.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CoolParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CoolParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CoolParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CoolParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#attribute_without_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_without_semicolon(CoolParser.Attribute_without_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#attribute_without_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_without_semicolon(CoolParser.Attribute_without_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(CoolParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(CoolParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(CoolParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(CoolParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(CoolParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(CoolParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(CoolParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(CoolParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(CoolParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(CoolParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(CoolParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(CoolParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(CoolParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(CoolParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#case_option}.
	 * @param ctx the parse tree
	 */
	void enterCase_option(CoolParser.Case_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#case_option}.
	 * @param ctx the parse tree
	 */
	void exitCase_option(CoolParser.Case_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(CoolParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(CoolParser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser}.
	 * @param ctx the parse tree
	 */
	void enterNew(CoolParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser}.
	 * @param ctx the parse tree
	 */
	void exitNew(CoolParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#isvoid}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#isvoid}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#ariphemitic_operation}.
	 * @param ctx the parse tree
	 */
	void enterAriphemitic_operation(CoolParser.Ariphemitic_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#ariphemitic_operation}.
	 * @param ctx the parse tree
	 */
	void exitAriphemitic_operation(CoolParser.Ariphemitic_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser}.
	 * @param ctx the parse tree
	 */
	void enterClass(CoolParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser}.
	 * @param ctx the parse tree
	 */
	void exitClass(CoolParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CoolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CoolParser.ExprContext ctx);
}