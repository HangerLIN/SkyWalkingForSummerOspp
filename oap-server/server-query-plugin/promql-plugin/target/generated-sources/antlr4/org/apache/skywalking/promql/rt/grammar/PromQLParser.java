// Generated from java-escape by ANTLR 4.11.1
package org.apache.skywalking.promql.rt.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PromQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, DOT=2, COMMA=3, L_PAREN=4, R_PAREN=5, L_BRACKET=6, R_BRACKET=7, 
		L_BRACE=8, R_BRACE=9, EQ=10, SUB=11, ADD=12, MUL=13, DIV=14, MOD=15, DEQ=16, 
		NEQ=17, LTE=18, LT=19, GTE=20, GT=21, NUMBER=22, DURATION=23, NAME_STRING=24, 
		VALUE_STRING=25, WS=26;
	public static final int
		RULE_root = 0, RULE_expression = 1, RULE_expressionNode = 2, RULE_addSub = 3, 
		RULE_mulDivMod = 4, RULE_compare = 5, RULE_metricName = 6, RULE_metricInstant = 7, 
		RULE_metricRange = 8, RULE_labelName = 9, RULE_labelValue = 10, RULE_label = 11, 
		RULE_labelList = 12, RULE_numberLiteral = 13, RULE_badRange = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expression", "expressionNode", "addSub", "mulDivMod", "compare", 
			"metricName", "metricInstant", "metricRange", "labelName", "labelValue", 
			"label", "labelList", "numberLiteral", "badRange"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'.'", "','", "'('", "')'", "'['", "']'", "'{'", "'}'", "'='", 
			"'-'", "'+'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<='", "'<'", "'>='", 
			"'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL", "DOT", "COMMA", "L_PAREN", "R_PAREN", "L_BRACKET", "R_BRACKET", 
			"L_BRACE", "R_BRACE", "EQ", "SUB", "ADD", "MUL", "DIV", "MOD", "DEQ", 
			"NEQ", "LTE", "LT", "GTE", "GT", "NUMBER", "DURATION", "NAME_STRING", 
			"VALUE_STRING", "WS"
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

	public PromQLParser(TokenStream input) {
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
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
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
	public static class ExprNodeContext extends ExpressionContext {
		public ExpressionNodeContext expressionNode() {
			return getRuleContext(ExpressionNodeContext.class,0);
		}
		public ExprNodeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterExprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitExprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitExprNode(this);
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
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterMulDivModOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitMulDivModOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitMulDivModOp(this);
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
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitCompareOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitCompareOp(this);
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
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterAddSubOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitAddSubOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitAddSubOp(this);
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
			{
			_localctx = new ExprNodeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(33);
			expressionNode();
			}
			_ctx.stop = _input.LT(-1);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(47);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(35);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(36);
						mulDivMod();
						setState(37);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(39);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(40);
						addSub();
						setState(41);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new CompareOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(43);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(44);
						compare();
						setState(45);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class ExpressionNodeContext extends ParserRuleContext {
		public MetricInstantContext metricInstant() {
			return getRuleContext(MetricInstantContext.class,0);
		}
		public MetricRangeContext metricRange() {
			return getRuleContext(MetricRangeContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public BadRangeContext badRange() {
			return getRuleContext(BadRangeContext.class,0);
		}
		public ExpressionNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterExpressionNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitExpressionNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitExpressionNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNodeContext expressionNode() throws RecognitionException {
		ExpressionNodeContext _localctx = new ExpressionNodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressionNode);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				metricInstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				metricRange();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				numberLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				badRange();
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
	public static class AddSubContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PromQLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PromQLParser.SUB, 0); }
		public AddSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubContext addSub() throws RecognitionException {
		AddSubContext _localctx = new AddSubContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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
		public TerminalNode MUL() { return getToken(PromQLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PromQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PromQLParser.MOD, 0); }
		public MulDivModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivModContext mulDivMod() throws RecognitionException {
		MulDivModContext _localctx = new MulDivModContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0) ) {
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
		public TerminalNode DEQ() { return getToken(PromQLParser.DEQ, 0); }
		public TerminalNode NEQ() { return getToken(PromQLParser.NEQ, 0); }
		public TerminalNode LTE() { return getToken(PromQLParser.LTE, 0); }
		public TerminalNode LT() { return getToken(PromQLParser.LT, 0); }
		public TerminalNode GTE() { return getToken(PromQLParser.GTE, 0); }
		public TerminalNode GT() { return getToken(PromQLParser.GT, 0); }
		public TerminalNode BOOL() { return getToken(PromQLParser.BOOL, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL) {
				{
				setState(63);
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
		public TerminalNode NAME_STRING() { return getToken(PromQLParser.NAME_STRING, 0); }
		public MetricNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metricName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterMetricName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitMetricName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitMetricName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetricNameContext metricName() throws RecognitionException {
		MetricNameContext _localctx = new MetricNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_metricName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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
	public static class MetricInstantContext extends ParserRuleContext {
		public MetricNameContext metricName() {
			return getRuleContext(MetricNameContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(PromQLParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(PromQLParser.R_BRACE, 0); }
		public LabelListContext labelList() {
			return getRuleContext(LabelListContext.class,0);
		}
		public MetricInstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metricInstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterMetricInstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitMetricInstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitMetricInstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetricInstantContext metricInstant() throws RecognitionException {
		MetricInstantContext _localctx = new MetricInstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_metricInstant);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				metricName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				metricName();
				setState(70);
				match(L_BRACE);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME_STRING) {
					{
					setState(71);
					labelList();
					}
				}

				setState(74);
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
	public static class MetricRangeContext extends ParserRuleContext {
		public MetricInstantContext metricInstant() {
			return getRuleContext(MetricInstantContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(PromQLParser.L_BRACKET, 0); }
		public TerminalNode DURATION() { return getToken(PromQLParser.DURATION, 0); }
		public TerminalNode R_BRACKET() { return getToken(PromQLParser.R_BRACKET, 0); }
		public MetricRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metricRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterMetricRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitMetricRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitMetricRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetricRangeContext metricRange() throws RecognitionException {
		MetricRangeContext _localctx = new MetricRangeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_metricRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			metricInstant();
			setState(79);
			match(L_BRACKET);
			setState(80);
			match(DURATION);
			setState(81);
			match(R_BRACKET);
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
		public TerminalNode NAME_STRING() { return getToken(PromQLParser.NAME_STRING, 0); }
		public LabelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterLabelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitLabelName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitLabelName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelNameContext labelName() throws RecognitionException {
		LabelNameContext _localctx = new LabelNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_labelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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
	public static class LabelValueContext extends ParserRuleContext {
		public TerminalNode VALUE_STRING() { return getToken(PromQLParser.VALUE_STRING, 0); }
		public LabelValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterLabelValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitLabelValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitLabelValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelValueContext labelValue() throws RecognitionException {
		LabelValueContext _localctx = new LabelValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_labelValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
		public TerminalNode EQ() { return getToken(PromQLParser.EQ, 0); }
		public LabelValueContext labelValue() {
			return getRuleContext(LabelValueContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			labelName();
			setState(88);
			match(EQ);
			setState(89);
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
	public static class LabelListContext extends ParserRuleContext {
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PromQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PromQLParser.COMMA, i);
		}
		public LabelListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterLabelList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitLabelList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitLabelList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelListContext labelList() throws RecognitionException {
		LabelListContext _localctx = new LabelListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_labelList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			label();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				label();
				}
				}
				setState(98);
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
	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PromQLParser.NUMBER, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numberLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(NUMBER);
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
	public static class BadRangeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PromQLParser.NUMBER, 0); }
		public TerminalNode L_BRACKET() { return getToken(PromQLParser.L_BRACKET, 0); }
		public TerminalNode DURATION() { return getToken(PromQLParser.DURATION, 0); }
		public TerminalNode R_BRACKET() { return getToken(PromQLParser.R_BRACKET, 0); }
		public BadRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_badRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).enterBadRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PromQLParserListener ) ((PromQLParserListener)listener).exitBadRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromQLParserVisitor ) return ((PromQLParserVisitor<? extends T>)visitor).visitBadRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BadRangeContext badRange() throws RecognitionException {
		BadRangeContext _localctx = new BadRangeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_badRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(NUMBER);
			setState(102);
			match(L_BRACKET);
			setState(103);
			match(DURATION);
			setState(104);
			match(R_BRACKET);
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
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001ak\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u0001"+
		"3\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"9\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005A\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007I\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007M\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f_\b\f\n\f\f\fb\t\f\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0000\u0001\u0002\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0003\u0001\u0000\u000b\f\u0001"+
		"\u0000\r\u000f\u0001\u0000\u0010\u0015e\u0000\u001e\u0001\u0000\u0000"+
		"\u0000\u0002 \u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000\u0006"+
		":\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\n>\u0001\u0000\u0000"+
		"\u0000\fB\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010"+
		"N\u0001\u0000\u0000\u0000\u0012S\u0001\u0000\u0000\u0000\u0014U\u0001"+
		"\u0000\u0000\u0000\u0016W\u0001\u0000\u0000\u0000\u0018[\u0001\u0000\u0000"+
		"\u0000\u001ac\u0001\u0000\u0000\u0000\u001ce\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0003\u0002\u0001\u0000\u001f\u0001\u0001\u0000\u0000\u0000 !\u0006"+
		"\u0001\uffff\uffff\u0000!\"\u0003\u0004\u0002\u0000\"1\u0001\u0000\u0000"+
		"\u0000#$\n\u0003\u0000\u0000$%\u0003\b\u0004\u0000%&\u0003\u0002\u0001"+
		"\u0004&0\u0001\u0000\u0000\u0000\'(\n\u0002\u0000\u0000()\u0003\u0006"+
		"\u0003\u0000)*\u0003\u0002\u0001\u0003*0\u0001\u0000\u0000\u0000+,\n\u0001"+
		"\u0000\u0000,-\u0003\n\u0005\u0000-.\u0003\u0002\u0001\u0002.0\u0001\u0000"+
		"\u0000\u0000/#\u0001\u0000\u0000\u0000/\'\u0001\u0000\u0000\u0000/+\u0001"+
		"\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000049\u0003\u000e\u0007\u000059\u0003\u0010\b\u000069\u0003\u001a"+
		"\r\u000079\u0003\u001c\u000e\u000084\u0001\u0000\u0000\u000085\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u00009\u0005"+
		"\u0001\u0000\u0000\u0000:;\u0007\u0000\u0000\u0000;\u0007\u0001\u0000"+
		"\u0000\u0000<=\u0007\u0001\u0000\u0000=\t\u0001\u0000\u0000\u0000>@\u0007"+
		"\u0002\u0000\u0000?A\u0005\u0001\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A\u000b\u0001\u0000\u0000\u0000BC\u0005\u0018"+
		"\u0000\u0000C\r\u0001\u0000\u0000\u0000DM\u0003\f\u0006\u0000EF\u0003"+
		"\f\u0006\u0000FH\u0005\b\u0000\u0000GI\u0003\u0018\f\u0000HG\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005"+
		"\t\u0000\u0000KM\u0001\u0000\u0000\u0000LD\u0001\u0000\u0000\u0000LE\u0001"+
		"\u0000\u0000\u0000M\u000f\u0001\u0000\u0000\u0000NO\u0003\u000e\u0007"+
		"\u0000OP\u0005\u0006\u0000\u0000PQ\u0005\u0017\u0000\u0000QR\u0005\u0007"+
		"\u0000\u0000R\u0011\u0001\u0000\u0000\u0000ST\u0005\u0018\u0000\u0000"+
		"T\u0013\u0001\u0000\u0000\u0000UV\u0005\u0019\u0000\u0000V\u0015\u0001"+
		"\u0000\u0000\u0000WX\u0003\u0012\t\u0000XY\u0005\n\u0000\u0000YZ\u0003"+
		"\u0014\n\u0000Z\u0017\u0001\u0000\u0000\u0000[`\u0003\u0016\u000b\u0000"+
		"\\]\u0005\u0003\u0000\u0000]_\u0003\u0016\u000b\u0000^\\\u0001\u0000\u0000"+
		"\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000a\u0019\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"cd\u0005\u0016\u0000\u0000d\u001b\u0001\u0000\u0000\u0000ef\u0005\u0016"+
		"\u0000\u0000fg\u0005\u0006\u0000\u0000gh\u0005\u0017\u0000\u0000hi\u0005"+
		"\u0007\u0000\u0000i\u001d\u0001\u0000\u0000\u0000\u0007/18@HL`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}