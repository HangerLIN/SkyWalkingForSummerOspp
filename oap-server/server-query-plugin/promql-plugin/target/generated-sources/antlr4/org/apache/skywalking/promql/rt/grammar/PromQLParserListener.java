// Generated from java-escape by ANTLR 4.11.1
package org.apache.skywalking.promql.rt.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PromQLParser}.
 */
public interface PromQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PromQLParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(PromQLParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(PromQLParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNode}
	 * labeled alternative in {@link PromQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprNode(PromQLParser.ExprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNode}
	 * labeled alternative in {@link PromQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprNode(PromQLParser.ExprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivModOp}
	 * labeled alternative in {@link PromQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivModOp(PromQLParser.MulDivModOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivModOp}
	 * labeled alternative in {@link PromQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivModOp(PromQLParser.MulDivModOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareOp}
	 * labeled alternative in {@link PromQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(PromQLParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareOp}
	 * labeled alternative in {@link PromQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(PromQLParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubOp}
	 * labeled alternative in {@link PromQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(PromQLParser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubOp}
	 * labeled alternative in {@link PromQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(PromQLParser.AddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#expressionNode}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNode(PromQLParser.ExpressionNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#expressionNode}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNode(PromQLParser.ExpressionNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(PromQLParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(PromQLParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#mulDivMod}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(PromQLParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#mulDivMod}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(PromQLParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(PromQLParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(PromQLParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#metricName}.
	 * @param ctx the parse tree
	 */
	void enterMetricName(PromQLParser.MetricNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#metricName}.
	 * @param ctx the parse tree
	 */
	void exitMetricName(PromQLParser.MetricNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#metricInstant}.
	 * @param ctx the parse tree
	 */
	void enterMetricInstant(PromQLParser.MetricInstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#metricInstant}.
	 * @param ctx the parse tree
	 */
	void exitMetricInstant(PromQLParser.MetricInstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#metricRange}.
	 * @param ctx the parse tree
	 */
	void enterMetricRange(PromQLParser.MetricRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#metricRange}.
	 * @param ctx the parse tree
	 */
	void exitMetricRange(PromQLParser.MetricRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(PromQLParser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(PromQLParser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#labelValue}.
	 * @param ctx the parse tree
	 */
	void enterLabelValue(PromQLParser.LabelValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#labelValue}.
	 * @param ctx the parse tree
	 */
	void exitLabelValue(PromQLParser.LabelValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(PromQLParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(PromQLParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#labelList}.
	 * @param ctx the parse tree
	 */
	void enterLabelList(PromQLParser.LabelListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#labelList}.
	 * @param ctx the parse tree
	 */
	void exitLabelList(PromQLParser.LabelListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(PromQLParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(PromQLParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PromQLParser#badRange}.
	 * @param ctx the parse tree
	 */
	void enterBadRange(PromQLParser.BadRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PromQLParser#badRange}.
	 * @param ctx the parse tree
	 */
	void exitBadRange(PromQLParser.BadRangeContext ctx);
}