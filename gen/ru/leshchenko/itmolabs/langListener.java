// Generated from C:/Users/lesch/IdeaProjects/CompilerANTLR/src/main/java/ru/leshchenko/itmolabs/lang.g4 by ANTLR 4.13.1
package ru.leshchenko.itmolabs;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link langParser}.
 */
public interface langListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link langParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(langParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(langParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(langParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(langParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(langParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(langParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(langParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(langParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(langParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(langParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(langParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(langParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(langParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(langParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#factorial}.
	 * @param ctx the parse tree
	 */
	void enterFactorial(langParser.FactorialContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#factorial}.
	 * @param ctx the parse tree
	 */
	void exitFactorial(langParser.FactorialContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(langParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(langParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(langParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(langParser.PrintContext ctx);
}