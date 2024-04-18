// Generated from java-escape by ANTLR 4.11.1
package org.apache.skywalking.mqe.rt.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MQEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, GENERAL_LABEL_NAME=2, DOT=3, COMMA=4, L_PAREN=5, R_PAREN=6, L_BRACKET=7, 
		R_BRACKET=8, L_BRACE=9, R_BRACE=10, EQ=11, SUB=12, ADD=13, MUL=14, DIV=15, 
		MOD=16, DEQ=17, NEQ=18, LTE=19, LT=20, GTE=21, GT=22, AVG=23, COUNT=24, 
		LATEST=25, MAX=26, MIN=27, SUM=28, ABS=29, CEIL=30, FLOOR=31, ROUND=32, 
		INCREASE=33, RATE=34, TOP_N=35, VIEW_AS_SEQ=36, RELABELS=37, ASC=38, DES=39, 
		AGGREGATE_LABELS=40, INTEGER=41, DECIMAL=42, NAME_STRING=43, VALUE_STRING=44, 
		WS=45;
	public static final int
		RULE_root = 0, RULE_expression = 1, RULE_expressionList = 2, RULE_expressionNode = 3, 
		RULE_addSub = 4, RULE_mulDivMod = 5, RULE_compare = 6, RULE_metricName = 7, 
		RULE_metric = 8, RULE_labelName = 9, RULE_labelValue = 10, RULE_label = 11, 
		RULE_scalar = 12, RULE_aggregation = 13, RULE_mathematical_operator0 = 14, 
		RULE_mathematical_operator1 = 15, RULE_trend = 16, RULE_topN = 17, RULE_logical_operator = 18, 
		RULE_relabels = 19, RULE_parameter = 20, RULE_order = 21, RULE_aggregateLabels = 22, 
		RULE_aggregateLabelsFunc = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expression", "expressionList", "expressionNode", "addSub", "mulDivMod", 
			"compare", "metricName", "metric", "labelName", "labelValue", "label", 
			"scalar", "aggregation", "mathematical_operator0", "mathematical_operator1", 
			"trend", "topN", "logical_operator", "relabels", "parameter", "order", 
			"aggregateLabels", "aggregateLabelsFunc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'_'", "'.'", "','", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'='", "'-'", "'+'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<='", "'<'", 
			"'>='", "'>'", "'avg'", "'count'", "'latest'", "'max'", "'min'", "'sum'", 
			"'abs'", "'ceil'", "'floor'", "'round'", "'increase'", "'rate'", "'top_n'", 
			"'view_as_seq'", "'relabels'", null, null, "'aggregate_labels'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL", "GENERAL_LABEL_NAME", "DOT", "COMMA", "L_PAREN", "R_PAREN", 
			"L_BRACKET", "R_BRACKET", "L_BRACE", "R_BRACE", "EQ", "SUB", "ADD", "MUL", 
			"DIV", "MOD", "DEQ", "NEQ", "LTE", "LT", "GTE", "GT", "AVG", "COUNT", 
			"LATEST", "MAX", "MIN", "SUM", "ABS", "CEIL", "FLOOR", "ROUND", "INCREASE", 
			"RATE", "TOP_N", "VIEW_AS_SEQ", "RELABELS", "ASC", "DES", "AGGREGATE_LABELS", 
			"INTEGER", "DECIMAL", "NAME_STRING", "VALUE_STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MQEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrendOPContext extends ExpressionContext {
		public TrendContext trend() {
			return getRuleContext(TrendContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(MQEParser.L_PAREN, 0); }
		public MetricContext metric() {
			return getRuleContext(MetricContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MQEParser.COMMA, 0); }
		public TerminalNode INTEGER() { return getToken(MQEParser.INTEGER, 0); }
		public TerminalNode R_PAREN() { return getToken(MQEParser.R_PAREN, 0); }
		public TrendOPContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterTrendOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitTrendOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitTrendOP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensOpContext extends ExpressionContext {
		public TerminalNode L_PAREN() { return getToken(MQEParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MQEParser.R_PAREN, 0); }
		public ParensOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterParensOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitParensOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitParensOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivModContext mulDivMod() {
			return getRuleContext(MulDivModContext.class,0);
		}
		public MulDivModOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterMulDivModOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitMulDivModOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitMulDivModOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelablesOPContext extends ExpressionContext {
		public RelabelsContext relabels() {
			return getRuleContext(RelabelsContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(MQEParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MQEParser.COMMA, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MQEParser.R_PAREN, 0); }
		public RelablesOPContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterRelablesOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitRelablesOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitRelablesOP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public CompareOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitCompareOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitCompareOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubOpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubContext addSub() {
			return getRuleContext(AddSubContext.class,0);
		}
		public AddSubOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterAddSubOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitAddSubOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitAddSubOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TopNOPContext extends ExpressionContext {
		public TopNContext topN() {
			return getRuleContext(TopNContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(MQEParser.L_PAREN, 0); }
		public MetricContext metric() {
			return getRuleContext(MetricContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MQEParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQEParser.COMMA, i);
		}
		public TerminalNode INTEGER() { return getToken(MQEParser.INTEGER, 0); }
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MQEParser.R_PAREN, 0); }
		public TopNOPContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterTopNOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitTopNOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitTopNOP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AggregationOpContext extends ExpressionContext {
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(MQEParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MQEParser.R_PAREN, 0); }
		public AggregationOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterAggregationOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitAggregationOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitAggregationOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AggregateLabelsOpContext extends ExpressionContext {
		public AggregateLabelsContext aggregateLabels() {
			return getRuleContext(AggregateLabelsContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(MQEParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MQEParser.COMMA, 0); }
		public AggregateLabelsFuncContext aggregateLabelsFunc() {
			return getRuleContext(AggregateLabelsFuncContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MQEParser.R_PAREN, 0); }
		public AggregateLabelsOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterAggregateLabelsOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitAggregateLabelsOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitAggregateLabelsOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNodeContext extends ExpressionContext {
		public ExpressionNodeContext expressionNode() {
			return getRuleContext(ExpressionNodeContext.class,0);
		}
		public ExprNodeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterExprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitExprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitExprNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathematicalOperator0OPContext extends ExpressionContext {
		public Mathematical_operator0Context mathematical_operator0() {
			return getRuleContext(Mathematical_operator0Context.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(MQEParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MQEParser.R_PAREN, 0); }
		public MathematicalOperator0OPContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterMathematicalOperator0OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitMathematicalOperator0OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitMathematicalOperator0OP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOperatorOPContext extends ExpressionContext {
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(MQEParser.L_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MQEParser.R_PAREN, 0); }
		public LogicalOperatorOPContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterLogicalOperatorOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitLogicalOperatorOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitLogicalOperatorOP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathematicalOperator1OPContext extends ExpressionContext {
		public Mathematical_operator1Context mathematical_operator1() {
			return getRuleContext(Mathematical_operator1Context.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(MQEParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MQEParser.COMMA, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MQEParser.R_PAREN, 0); }
		public MathematicalOperator1OPContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterMathematicalOperator1OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitMathematicalOperator1OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitMathematicalOperator1OP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new ExprNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				expressionNode();
				}
				break;
			case 2:
				{
				_localctx = new ParensOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(L_PAREN);
				setState(53);
				expression(0);
				setState(54);
				match(R_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new AggregationOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				aggregation();
				setState(57);
				match(L_PAREN);
				setState(58);
				expression(0);
				setState(59);
				match(R_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new MathematicalOperator0OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				mathematical_operator0();
				setState(62);
				match(L_PAREN);
				setState(63);
				expression(0);
				setState(64);
				match(R_PAREN);
				}
				break;
			case 5:
				{
				_localctx = new MathematicalOperator1OPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				mathematical_operator1();
				setState(67);
				match(L_PAREN);
				setState(68);
				expression(0);
				setState(69);
				match(COMMA);
				setState(70);
				parameter();
				setState(71);
				match(R_PAREN);
				}
				break;
			case 6:
				{
				_localctx = new TrendOPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				trend();
				setState(74);
				match(L_PAREN);
				setState(75);
				metric();
				setState(76);
				match(COMMA);
				setState(77);
				match(INTEGER);
				setState(78);
				match(R_PAREN);
				}
				break;
			case 7:
				{
				_localctx = new LogicalOperatorOPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				logical_operator();
				setState(81);
				match(L_PAREN);
				setState(82);
				expressionList();
				setState(83);
				match(R_PAREN);
				}
				break;
			case 8:
				{
				_localctx = new TopNOPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				topN();
				setState(86);
				match(L_PAREN);
				setState(87);
				metric();
				setState(88);
				match(COMMA);
				setState(89);
				match(INTEGER);
				setState(90);
				match(COMMA);
				setState(91);
				order();
				setState(92);
				match(R_PAREN);
				}
				break;
			case 9:
				{
				_localctx = new RelablesOPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				relabels();
				setState(95);
				match(L_PAREN);
				setState(96);
				expression(0);
				setState(97);
				match(COMMA);
				setState(98);
				label();
				setState(99);
				match(R_PAREN);
				}
				break;
			case 10:
				{
				_localctx = new AggregateLabelsOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				aggregateLabels();
				setState(102);
				match(L_PAREN);
				setState(103);
				expression(0);
				setState(104);
				match(COMMA);
				setState(105);
				aggregateLabelsFunc();
				setState(106);
				match(R_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(111);
						mulDivMod();
						setState(112);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(115);
						addSub();
						setState(116);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new CompareOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(119);
						compare();
						setState(120);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MQEParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQEParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			expression(0);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(128);
				match(COMMA);
				setState(129);
				expression(0);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNodeContext extends ParserRuleContext {
		public MetricContext metric() {
			return getRuleContext(MetricContext.class,0);
		}
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public ExpressionNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterExpressionNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitExpressionNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitExpressionNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNodeContext expressionNode() throws RecognitionException {
		ExpressionNodeContext _localctx = new ExpressionNodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionNode);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				metric();
				}
				break;
			case INTEGER:
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				scalar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MQEParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MQEParser.SUB, 0); }
		public AddSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubContext addSub() throws RecognitionException {
		AddSubContext _localctx = new AddSubContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==SUB || _la==ADD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(MQEParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MQEParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MQEParser.MOD, 0); }
		public MulDivModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivModContext mulDivMod() throws RecognitionException {
		MulDivModContext _localctx = new MulDivModContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ParserRuleContext {
		public TerminalNode DEQ() { return getToken(MQEParser.DEQ, 0); }
		public TerminalNode NEQ() { return getToken(MQEParser.NEQ, 0); }
		public TerminalNode LTE() { return getToken(MQEParser.LTE, 0); }
		public TerminalNode LT() { return getToken(MQEParser.LT, 0); }
		public TerminalNode GTE() { return getToken(MQEParser.GTE, 0); }
		public TerminalNode GT() { return getToken(MQEParser.GT, 0); }
		public TerminalNode BOOL() { return getToken(MQEParser.BOOL, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8257536L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL) {
				{
				setState(144);
				match(BOOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetricNameContext extends ParserRuleContext {
		public TerminalNode NAME_STRING() { return getToken(MQEParser.NAME_STRING, 0); }
		public MetricNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metricName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterMetricName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitMetricName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitMetricName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetricNameContext metricName() throws RecognitionException {
		MetricNameContext _localctx = new MetricNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_metricName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(NAME_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetricContext extends ParserRuleContext {
		public MetricNameContext metricName() {
			return getRuleContext(MetricNameContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(MQEParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(MQEParser.R_BRACE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public MetricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterMetric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitMetric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitMetric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetricContext metric() throws RecognitionException {
		MetricContext _localctx = new MetricContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_metric);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				metricName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				metricName();
				setState(151);
				match(L_BRACE);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GENERAL_LABEL_NAME) {
					{
					setState(152);
					label();
					}
				}

				setState(155);
				match(R_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelNameContext extends ParserRuleContext {
		public TerminalNode GENERAL_LABEL_NAME() { return getToken(MQEParser.GENERAL_LABEL_NAME, 0); }
		public LabelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterLabelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitLabelName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitLabelName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelNameContext labelName() throws RecognitionException {
		LabelNameContext _localctx = new LabelNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_labelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(GENERAL_LABEL_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelValueContext extends ParserRuleContext {
		public TerminalNode VALUE_STRING() { return getToken(MQEParser.VALUE_STRING, 0); }
		public LabelValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterLabelValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitLabelValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitLabelValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelValueContext labelValue() throws RecognitionException {
		LabelValueContext _localctx = new LabelValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_labelValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(VALUE_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public LabelNameContext labelName() {
			return getRuleContext(LabelNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(MQEParser.EQ, 0); }
		public LabelValueContext labelValue() {
			return getRuleContext(LabelValueContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			labelName();
			setState(164);
			match(EQ);
			setState(165);
			labelValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScalarContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MQEParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(MQEParser.DECIMAL, 0); }
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(MQEParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(MQEParser.COUNT, 0); }
		public TerminalNode LATEST() { return getToken(MQEParser.LATEST, 0); }
		public TerminalNode SUM() { return getToken(MQEParser.SUM, 0); }
		public TerminalNode MAX() { return getToken(MQEParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(MQEParser.MIN, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aggregation);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(AVG);
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(COUNT);
				}
				break;
			case LATEST:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(LATEST);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(SUM);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(MAX);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				match(MIN);
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 7);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mathematical_operator0Context extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(MQEParser.ABS, 0); }
		public TerminalNode CEIL() { return getToken(MQEParser.CEIL, 0); }
		public TerminalNode FLOOR() { return getToken(MQEParser.FLOOR, 0); }
		public Mathematical_operator0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematical_operator0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterMathematical_operator0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitMathematical_operator0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitMathematical_operator0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mathematical_operator0Context mathematical_operator0() throws RecognitionException {
		Mathematical_operator0Context _localctx = new Mathematical_operator0Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_mathematical_operator0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mathematical_operator1Context extends ParserRuleContext {
		public TerminalNode ROUND() { return getToken(MQEParser.ROUND, 0); }
		public Mathematical_operator1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematical_operator1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterMathematical_operator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitMathematical_operator1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitMathematical_operator1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mathematical_operator1Context mathematical_operator1() throws RecognitionException {
		Mathematical_operator1Context _localctx = new Mathematical_operator1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_mathematical_operator1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ROUND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrendContext extends ParserRuleContext {
		public TerminalNode INCREASE() { return getToken(MQEParser.INCREASE, 0); }
		public TerminalNode RATE() { return getToken(MQEParser.RATE, 0); }
		public TrendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterTrend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitTrend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitTrend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrendContext trend() throws RecognitionException {
		TrendContext _localctx = new TrendContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_trend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==INCREASE || _la==RATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopNContext extends ParserRuleContext {
		public TerminalNode TOP_N() { return getToken(MQEParser.TOP_N, 0); }
		public TopNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterTopN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitTopN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitTopN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopNContext topN() throws RecognitionException {
		TopNContext _localctx = new TopNContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_topN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(TOP_N);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode VIEW_AS_SEQ() { return getToken(MQEParser.VIEW_AS_SEQ, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitLogical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logical_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(VIEW_AS_SEQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelabelsContext extends ParserRuleContext {
		public TerminalNode RELABELS() { return getToken(MQEParser.RELABELS, 0); }
		public RelabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterRelabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitRelabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitRelabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelabelsContext relabels() throws RecognitionException {
		RelabelsContext _localctx = new RelabelsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relabels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(RELABELS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MQEParser.INTEGER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(MQEParser.ASC, 0); }
		public TerminalNode DES() { return getToken(MQEParser.DES, 0); }
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregateLabelsContext extends ParserRuleContext {
		public TerminalNode AGGREGATE_LABELS() { return getToken(MQEParser.AGGREGATE_LABELS, 0); }
		public AggregateLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterAggregateLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitAggregateLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitAggregateLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateLabelsContext aggregateLabels() throws RecognitionException {
		AggregateLabelsContext _localctx = new AggregateLabelsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_aggregateLabels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(AGGREGATE_LABELS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregateLabelsFuncContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(MQEParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(MQEParser.SUM, 0); }
		public TerminalNode MAX() { return getToken(MQEParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(MQEParser.MIN, 0); }
		public AggregateLabelsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateLabelsFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).enterAggregateLabelsFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQEParserListener ) ((MQEParserListener)listener).exitAggregateLabelsFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQEParserVisitor ) return ((MQEParserVisitor<? extends T>)visitor).visitAggregateLabelsFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateLabelsFuncContext aggregateLabelsFunc() throws RecognitionException {
		AggregateLabelsFuncContext _localctx = new AggregateLabelsFuncContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_aggregateLabelsFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 478150656L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00c7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001m\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001{\b\u0001\n\u0001\f\u0001~\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u0083\b\u0002\n\u0002\f\u0002\u0086\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u008a\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0092\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009a\b\b\u0001"+
		"\b\u0001\b\u0003\b\u009e\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b1\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0000\u0001\u0002\u0018\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000"+
		"\b\u0001\u0000\f\r\u0001\u0000\u000e\u0010\u0001\u0000\u0011\u0016\u0001"+
		"\u0000)*\u0001\u0000\u001d\u001f\u0001\u0000!\"\u0001\u0000&\'\u0002\u0000"+
		"\u0017\u0017\u001a\u001c\u00c5\u00000\u0001\u0000\u0000\u0000\u0002l\u0001"+
		"\u0000\u0000\u0000\u0004\u007f\u0001\u0000\u0000\u0000\u0006\u0089\u0001"+
		"\u0000\u0000\u0000\b\u008b\u0001\u0000\u0000\u0000\n\u008d\u0001\u0000"+
		"\u0000\u0000\f\u008f\u0001\u0000\u0000\u0000\u000e\u0093\u0001\u0000\u0000"+
		"\u0000\u0010\u009d\u0001\u0000\u0000\u0000\u0012\u009f\u0001\u0000\u0000"+
		"\u0000\u0014\u00a1\u0001\u0000\u0000\u0000\u0016\u00a3\u0001\u0000\u0000"+
		"\u0000\u0018\u00a7\u0001\u0000\u0000\u0000\u001a\u00b0\u0001\u0000\u0000"+
		"\u0000\u001c\u00b2\u0001\u0000\u0000\u0000\u001e\u00b4\u0001\u0000\u0000"+
		"\u0000 \u00b6\u0001\u0000\u0000\u0000\"\u00b8\u0001\u0000\u0000\u0000"+
		"$\u00ba\u0001\u0000\u0000\u0000&\u00bc\u0001\u0000\u0000\u0000(\u00be"+
		"\u0001\u0000\u0000\u0000*\u00c0\u0001\u0000\u0000\u0000,\u00c2\u0001\u0000"+
		"\u0000\u0000.\u00c4\u0001\u0000\u0000\u000001\u0003\u0002\u0001\u0000"+
		"1\u0001\u0001\u0000\u0000\u000023\u0006\u0001\uffff\uffff\u00003m\u0003"+
		"\u0006\u0003\u000045\u0005\u0005\u0000\u000056\u0003\u0002\u0001\u0000"+
		"67\u0005\u0006\u0000\u00007m\u0001\u0000\u0000\u000089\u0003\u001a\r\u0000"+
		"9:\u0005\u0005\u0000\u0000:;\u0003\u0002\u0001\u0000;<\u0005\u0006\u0000"+
		"\u0000<m\u0001\u0000\u0000\u0000=>\u0003\u001c\u000e\u0000>?\u0005\u0005"+
		"\u0000\u0000?@\u0003\u0002\u0001\u0000@A\u0005\u0006\u0000\u0000Am\u0001"+
		"\u0000\u0000\u0000BC\u0003\u001e\u000f\u0000CD\u0005\u0005\u0000\u0000"+
		"DE\u0003\u0002\u0001\u0000EF\u0005\u0004\u0000\u0000FG\u0003(\u0014\u0000"+
		"GH\u0005\u0006\u0000\u0000Hm\u0001\u0000\u0000\u0000IJ\u0003 \u0010\u0000"+
		"JK\u0005\u0005\u0000\u0000KL\u0003\u0010\b\u0000LM\u0005\u0004\u0000\u0000"+
		"MN\u0005)\u0000\u0000NO\u0005\u0006\u0000\u0000Om\u0001\u0000\u0000\u0000"+
		"PQ\u0003$\u0012\u0000QR\u0005\u0005\u0000\u0000RS\u0003\u0004\u0002\u0000"+
		"ST\u0005\u0006\u0000\u0000Tm\u0001\u0000\u0000\u0000UV\u0003\"\u0011\u0000"+
		"VW\u0005\u0005\u0000\u0000WX\u0003\u0010\b\u0000XY\u0005\u0004\u0000\u0000"+
		"YZ\u0005)\u0000\u0000Z[\u0005\u0004\u0000\u0000[\\\u0003*\u0015\u0000"+
		"\\]\u0005\u0006\u0000\u0000]m\u0001\u0000\u0000\u0000^_\u0003&\u0013\u0000"+
		"_`\u0005\u0005\u0000\u0000`a\u0003\u0002\u0001\u0000ab\u0005\u0004\u0000"+
		"\u0000bc\u0003\u0016\u000b\u0000cd\u0005\u0006\u0000\u0000dm\u0001\u0000"+
		"\u0000\u0000ef\u0003,\u0016\u0000fg\u0005\u0005\u0000\u0000gh\u0003\u0002"+
		"\u0001\u0000hi\u0005\u0004\u0000\u0000ij\u0003.\u0017\u0000jk\u0005\u0006"+
		"\u0000\u0000km\u0001\u0000\u0000\u0000l2\u0001\u0000\u0000\u0000l4\u0001"+
		"\u0000\u0000\u0000l8\u0001\u0000\u0000\u0000l=\u0001\u0000\u0000\u0000"+
		"lB\u0001\u0000\u0000\u0000lI\u0001\u0000\u0000\u0000lP\u0001\u0000\u0000"+
		"\u0000lU\u0001\u0000\u0000\u0000l^\u0001\u0000\u0000\u0000le\u0001\u0000"+
		"\u0000\u0000m|\u0001\u0000\u0000\u0000no\n\u000b\u0000\u0000op\u0003\n"+
		"\u0005\u0000pq\u0003\u0002\u0001\fq{\u0001\u0000\u0000\u0000rs\n\n\u0000"+
		"\u0000st\u0003\b\u0004\u0000tu\u0003\u0002\u0001\u000bu{\u0001\u0000\u0000"+
		"\u0000vw\n\t\u0000\u0000wx\u0003\f\u0006\u0000xy\u0003\u0002\u0001\ny"+
		"{\u0001\u0000\u0000\u0000zn\u0001\u0000\u0000\u0000zr\u0001\u0000\u0000"+
		"\u0000zv\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0003\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000\u007f\u0084\u0003\u0002\u0001\u0000\u0080\u0081"+
		"\u0005\u0004\u0000\u0000\u0081\u0083\u0003\u0002\u0001\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0005"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a"+
		"\u0003\u0010\b\u0000\u0088\u008a\u0003\u0018\f\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0007\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0007\u0000\u0000\u0000\u008c\t\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0007\u0001\u0000\u0000\u008e\u000b\u0001\u0000"+
		"\u0000\u0000\u008f\u0091\u0007\u0002\u0000\u0000\u0090\u0092\u0005\u0001"+
		"\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\r\u0001\u0000\u0000\u0000\u0093\u0094\u0005+\u0000"+
		"\u0000\u0094\u000f\u0001\u0000\u0000\u0000\u0095\u009e\u0003\u000e\u0007"+
		"\u0000\u0096\u0097\u0003\u000e\u0007\u0000\u0097\u0099\u0005\t\u0000\u0000"+
		"\u0098\u009a\u0003\u0016\u000b\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\n\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d"+
		"\u0095\u0001\u0000\u0000\u0000\u009d\u0096\u0001\u0000\u0000\u0000\u009e"+
		"\u0011\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0002\u0000\u0000\u00a0"+
		"\u0013\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005,\u0000\u0000\u00a2\u0015"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003\u0012\t\u0000\u00a4\u00a5\u0005"+
		"\u000b\u0000\u0000\u00a5\u00a6\u0003\u0014\n\u0000\u00a6\u0017\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0007\u0003\u0000\u0000\u00a8\u0019\u0001\u0000"+
		"\u0000\u0000\u00a9\u00b1\u0005\u0017\u0000\u0000\u00aa\u00b1\u0005\u0018"+
		"\u0000\u0000\u00ab\u00b1\u0005\u0019\u0000\u0000\u00ac\u00b1\u0005\u001c"+
		"\u0000\u0000\u00ad\u00b1\u0005\u001a\u0000\u0000\u00ae\u00b1\u0005\u001b"+
		"\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u001b\u0001\u0000\u0000\u0000\u00b2\u00b3\u0007\u0004"+
		"\u0000\u0000\u00b3\u001d\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005 \u0000"+
		"\u0000\u00b5\u001f\u0001\u0000\u0000\u0000\u00b6\u00b7\u0007\u0005\u0000"+
		"\u0000\u00b7!\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005#\u0000\u0000\u00b9"+
		"#\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005$\u0000\u0000\u00bb%\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005%\u0000\u0000\u00bd\'\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005)\u0000\u0000\u00bf)\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0007\u0006\u0000\u0000\u00c1+\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005(\u0000\u0000\u00c3-\u0001\u0000\u0000\u0000\u00c4\u00c5\u0007"+
		"\u0007\u0000\u0000\u00c5/\u0001\u0000\u0000\u0000\tlz|\u0084\u0089\u0091"+
		"\u0099\u009d\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}