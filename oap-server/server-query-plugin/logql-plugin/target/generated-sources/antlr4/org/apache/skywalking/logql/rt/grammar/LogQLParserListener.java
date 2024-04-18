// Generated from java-escape by ANTLR 4.11.1
package org.apache.skywalking.logql.rt.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogQLParser}.
 */
public interface LogQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogQLParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(LogQLParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogQLParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(LogQLParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogQLParser#streamSelector}.
	 * @param ctx the parse tree
	 */
	void enterStreamSelector(LogQLParser.StreamSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogQLParser#streamSelector}.
	 * @param ctx the parse tree
	 */
	void exitStreamSelector(LogQLParser.StreamSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogQLParser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(LogQLParser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogQLParser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(LogQLParser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogQLParser#labelValue}.
	 * @param ctx the parse tree
	 */
	void enterLabelValue(LogQLParser.LabelValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogQLParser#labelValue}.
	 * @param ctx the parse tree
	 */
	void exitLabelValue(LogQLParser.LabelValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogQLParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(LogQLParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogQLParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(LogQLParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogQLParser#labelList}.
	 * @param ctx the parse tree
	 */
	void enterLabelList(LogQLParser.LabelListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogQLParser#labelList}.
	 * @param ctx the parse tree
	 */
	void exitLabelList(LogQLParser.LabelListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(LogQLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogQLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(LogQLParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogQLParser#filterValue}.
	 * @param ctx the parse tree
	 */
	void enterFilterValue(LogQLParser.FilterValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogQLParser#filterValue}.
	 * @param ctx the parse tree
	 */
	void exitFilterValue(LogQLParser.FilterValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogQLParser#lineFilter}.
	 * @param ctx the parse tree
	 */
	void enterLineFilter(LogQLParser.LineFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogQLParser#lineFilter}.
	 * @param ctx the parse tree
	 */
	void exitLineFilter(LogQLParser.LineFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogQLParser#lineFilterList}.
	 * @param ctx the parse tree
	 */
	void enterLineFilterList(LogQLParser.LineFilterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogQLParser#lineFilterList}.
	 * @param ctx the parse tree
	 */
	void exitLineFilterList(LogQLParser.LineFilterListContext ctx);
}