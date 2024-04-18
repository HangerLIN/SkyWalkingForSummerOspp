// Generated from java-escape by ANTLR 4.11.1
package org.apache.skywalking.logql.rt.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogQLParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(LogQLParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogQLParser#streamSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreamSelector(LogQLParser.StreamSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogQLParser#labelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelName(LogQLParser.LabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogQLParser#labelValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelValue(LogQLParser.LabelValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogQLParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(LogQLParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogQLParser#labelList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelList(LogQLParser.LabelListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogQLParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(LogQLParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogQLParser#filterValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterValue(LogQLParser.FilterValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogQLParser#lineFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineFilter(LogQLParser.LineFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogQLParser#lineFilterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineFilterList(LogQLParser.LineFilterListContext ctx);
}