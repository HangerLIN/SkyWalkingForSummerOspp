// Generated from java-escape by ANTLR 4.11.1
package org.apache.skywalking.mqe.rt.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MQEParser}.
 */
public interface MQEParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MQEParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(MQEParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(MQEParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trendOP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrendOP(MQEParser.TrendOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trendOP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrendOP(MQEParser.TrendOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParensOp(MQEParser.ParensOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParensOp(MQEParser.ParensOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivModOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivModOp(MQEParser.MulDivModOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivModOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivModOp(MQEParser.MulDivModOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relablesOP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelablesOP(MQEParser.RelablesOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relablesOP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelablesOP(MQEParser.RelablesOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(MQEParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(MQEParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(MQEParser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(MQEParser.AddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code topNOP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTopNOP(MQEParser.TopNOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code topNOP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTopNOP(MQEParser.TopNOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregationOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAggregationOp(MQEParser.AggregationOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregationOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAggregationOp(MQEParser.AggregationOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateLabelsOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAggregateLabelsOp(MQEParser.AggregateLabelsOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateLabelsOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAggregateLabelsOp(MQEParser.AggregateLabelsOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNode}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprNode(MQEParser.ExprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNode}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprNode(MQEParser.ExprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathematicalOperator0OP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathematicalOperator0OP(MQEParser.MathematicalOperator0OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathematicalOperator0OP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathematicalOperator0OP(MQEParser.MathematicalOperator0OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOperatorOP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperatorOP(MQEParser.LogicalOperatorOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOperatorOP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperatorOP(MQEParser.LogicalOperatorOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathematicalOperator1OP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathematicalOperator1OP(MQEParser.MathematicalOperator1OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathematicalOperator1OP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathematicalOperator1OP(MQEParser.MathematicalOperator1OPContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(MQEParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(MQEParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#expressionNode}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNode(MQEParser.ExpressionNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#expressionNode}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNode(MQEParser.ExpressionNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MQEParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MQEParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#mulDivMod}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(MQEParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#mulDivMod}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(MQEParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(MQEParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(MQEParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#metricName}.
	 * @param ctx the parse tree
	 */
	void enterMetricName(MQEParser.MetricNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#metricName}.
	 * @param ctx the parse tree
	 */
	void exitMetricName(MQEParser.MetricNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#metric}.
	 * @param ctx the parse tree
	 */
	void enterMetric(MQEParser.MetricContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#metric}.
	 * @param ctx the parse tree
	 */
	void exitMetric(MQEParser.MetricContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(MQEParser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(MQEParser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#labelValue}.
	 * @param ctx the parse tree
	 */
	void enterLabelValue(MQEParser.LabelValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#labelValue}.
	 * @param ctx the parse tree
	 */
	void exitLabelValue(MQEParser.LabelValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(MQEParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(MQEParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalar(MQEParser.ScalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalar(MQEParser.ScalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(MQEParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(MQEParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#mathematical_operator0}.
	 * @param ctx the parse tree
	 */
	void enterMathematical_operator0(MQEParser.Mathematical_operator0Context ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#mathematical_operator0}.
	 * @param ctx the parse tree
	 */
	void exitMathematical_operator0(MQEParser.Mathematical_operator0Context ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#mathematical_operator1}.
	 * @param ctx the parse tree
	 */
	void enterMathematical_operator1(MQEParser.Mathematical_operator1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#mathematical_operator1}.
	 * @param ctx the parse tree
	 */
	void exitMathematical_operator1(MQEParser.Mathematical_operator1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#trend}.
	 * @param ctx the parse tree
	 */
	void enterTrend(MQEParser.TrendContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#trend}.
	 * @param ctx the parse tree
	 */
	void exitTrend(MQEParser.TrendContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#topN}.
	 * @param ctx the parse tree
	 */
	void enterTopN(MQEParser.TopNContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#topN}.
	 * @param ctx the parse tree
	 */
	void exitTopN(MQEParser.TopNContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(MQEParser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(MQEParser.Logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#relabels}.
	 * @param ctx the parse tree
	 */
	void enterRelabels(MQEParser.RelabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#relabels}.
	 * @param ctx the parse tree
	 */
	void exitRelabels(MQEParser.RelabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MQEParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MQEParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(MQEParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(MQEParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#aggregateLabels}.
	 * @param ctx the parse tree
	 */
	void enterAggregateLabels(MQEParser.AggregateLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#aggregateLabels}.
	 * @param ctx the parse tree
	 */
	void exitAggregateLabels(MQEParser.AggregateLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQEParser#aggregateLabelsFunc}.
	 * @param ctx the parse tree
	 */
	void enterAggregateLabelsFunc(MQEParser.AggregateLabelsFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQEParser#aggregateLabelsFunc}.
	 * @param ctx the parse tree
	 */
	void exitAggregateLabelsFunc(MQEParser.AggregateLabelsFuncContext ctx);
}