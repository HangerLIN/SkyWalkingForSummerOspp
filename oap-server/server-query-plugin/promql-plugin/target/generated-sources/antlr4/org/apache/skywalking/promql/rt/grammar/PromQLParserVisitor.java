// Generated from java-escape by ANTLR 4.11.1
package org.apache.skywalking.promql.rt.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PromQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PromQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PromQLParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(PromQLParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNode}
	 * labeled alternative in {@link PromQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNode(PromQLParser.ExprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivModOp}
	 * labeled alternative in {@link PromQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModOp(PromQLParser.MulDivModOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareOp}
	 * labeled alternative in {@link PromQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOp(PromQLParser.CompareOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubOp}
	 * labeled alternative in {@link PromQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(PromQLParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#expressionNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNode(PromQLParser.ExpressionNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#addSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(PromQLParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#mulDivMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(PromQLParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(PromQLParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#metricName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetricName(PromQLParser.MetricNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#metricInstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetricInstant(PromQLParser.MetricInstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#metricRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetricRange(PromQLParser.MetricRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#labelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelName(PromQLParser.LabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#labelValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelValue(PromQLParser.LabelValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(PromQLParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#labelList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelList(PromQLParser.LabelListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(PromQLParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PromQLParser#badRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadRange(PromQLParser.BadRangeContext ctx);
}