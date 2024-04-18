// Generated from java-escape by ANTLR 4.11.1
package org.apache.skywalking.mqe.rt.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MQEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MQEParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MQEParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(MQEParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trendOP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrendOP(MQEParser.TrendOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensOp(MQEParser.ParensOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivModOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModOp(MQEParser.MulDivModOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relablesOP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelablesOP(MQEParser.RelablesOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOp(MQEParser.CompareOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(MQEParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code topNOP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopNOP(MQEParser.TopNOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregationOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationOp(MQEParser.AggregationOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregateLabelsOp}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateLabelsOp(MQEParser.AggregateLabelsOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNode}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNode(MQEParser.ExprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathematicalOperator0OP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathematicalOperator0OP(MQEParser.MathematicalOperator0OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOperatorOP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperatorOP(MQEParser.LogicalOperatorOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathematicalOperator1OP}
	 * labeled alternative in {@link MQEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathematicalOperator1OP(MQEParser.MathematicalOperator1OPContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(MQEParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#expressionNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNode(MQEParser.ExpressionNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#addSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(MQEParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#mulDivMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(MQEParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(MQEParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#metricName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetricName(MQEParser.MetricNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#metric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetric(MQEParser.MetricContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#labelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelName(MQEParser.LabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#labelValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelValue(MQEParser.LabelValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(MQEParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar(MQEParser.ScalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(MQEParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#mathematical_operator0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathematical_operator0(MQEParser.Mathematical_operator0Context ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#mathematical_operator1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathematical_operator1(MQEParser.Mathematical_operator1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#trend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrend(MQEParser.TrendContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#topN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopN(MQEParser.TopNContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(MQEParser.Logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#relabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelabels(MQEParser.RelabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MQEParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(MQEParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#aggregateLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateLabels(MQEParser.AggregateLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQEParser#aggregateLabelsFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateLabelsFunc(MQEParser.AggregateLabelsFuncContext ctx);
}