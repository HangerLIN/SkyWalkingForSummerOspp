// Generated from java-escape by ANTLR 4.11.1
package org.apache.skywalking.promql.rt.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PromQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, DOT=2, COMMA=3, L_PAREN=4, R_PAREN=5, L_BRACKET=6, R_BRACKET=7, 
		L_BRACE=8, R_BRACE=9, EQ=10, SUB=11, ADD=12, MUL=13, DIV=14, MOD=15, DEQ=16, 
		NEQ=17, LTE=18, LT=19, GTE=20, GT=21, NUMBER=22, DURATION=23, NAME_STRING=24, 
		VALUE_STRING=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOL", "DOT", "COMMA", "L_PAREN", "R_PAREN", "L_BRACKET", "R_BRACKET", 
			"L_BRACE", "R_BRACE", "EQ", "SUB", "ADD", "MUL", "DIV", "MOD", "DEQ", 
			"NEQ", "LTE", "LT", "GTE", "GT", "NUMBER", "DURATION", "NAME_STRING", 
			"VALUE_STRING", "Digit", "NameLetter", "WS"
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


	public PromQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PromQLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001a\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0004\u0015l\b\u0015\u000b\u0015\f\u0015m\u0001\u0015\u0001\u0015"+
		"\u0004\u0015r\b\u0015\u000b\u0015\f\u0015s\u0003\u0015v\b\u0015\u0001"+
		"\u0016\u0004\u0016y\b\u0016\u000b\u0016\f\u0016z\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0080\b\u0016\u0001\u0017\u0004\u0017\u0083\b"+
		"\u0017\u000b\u0017\f\u0017\u0084\u0001\u0018\u0001\u0018\u0005\u0018\u0089"+
		"\b\u0018\n\u0018\f\u0018\u008c\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0091\b\u0018\n\u0018\f\u0018\u0094\t\u0018\u0001\u0018\u0003"+
		"\u0018\u0097\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0004\u001b\u009e\b\u001b\u000b\u001b\f\u001b\u009f\u0001\u001b"+
		"\u0001\u001b\u0002\u008a\u0092\u0000\u001c\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u00005\u0000"+
		"7\u001a\u0001\u0000\u0007\u0002\u0000BBbb\u0002\u0000OOoo\u0002\u0000"+
		"LLll\u0005\u0000ddhhmmssww\u0001\u000009\u0004\u000009AZ__az\u0003\u0000"+
		"\t\n\r\r  \u00aa\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00019\u0001\u0000\u0000\u0000\u0003>\u0001"+
		"\u0000\u0000\u0000\u0005@\u0001\u0000\u0000\u0000\u0007B\u0001\u0000\u0000"+
		"\u0000\tD\u0001\u0000\u0000\u0000\u000bF\u0001\u0000\u0000\u0000\rH\u0001"+
		"\u0000\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000\u0011L\u0001\u0000\u0000"+
		"\u0000\u0013N\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017"+
		"R\u0001\u0000\u0000\u0000\u0019T\u0001\u0000\u0000\u0000\u001bV\u0001"+
		"\u0000\u0000\u0000\u001dX\u0001\u0000\u0000\u0000\u001fZ\u0001\u0000\u0000"+
		"\u0000!]\u0001\u0000\u0000\u0000#`\u0001\u0000\u0000\u0000%c\u0001\u0000"+
		"\u0000\u0000\'e\u0001\u0000\u0000\u0000)h\u0001\u0000\u0000\u0000+k\u0001"+
		"\u0000\u0000\u0000-x\u0001\u0000\u0000\u0000/\u0082\u0001\u0000\u0000"+
		"\u00001\u0096\u0001\u0000\u0000\u00003\u0098\u0001\u0000\u0000\u00005"+
		"\u009a\u0001\u0000\u0000\u00007\u009d\u0001\u0000\u0000\u00009:\u0007"+
		"\u0000\u0000\u0000:;\u0007\u0001\u0000\u0000;<\u0007\u0001\u0000\u0000"+
		"<=\u0007\u0002\u0000\u0000=\u0002\u0001\u0000\u0000\u0000>?\u0005.\u0000"+
		"\u0000?\u0004\u0001\u0000\u0000\u0000@A\u0005,\u0000\u0000A\u0006\u0001"+
		"\u0000\u0000\u0000BC\u0005(\u0000\u0000C\b\u0001\u0000\u0000\u0000DE\u0005"+
		")\u0000\u0000E\n\u0001\u0000\u0000\u0000FG\u0005[\u0000\u0000G\f\u0001"+
		"\u0000\u0000\u0000HI\u0005]\u0000\u0000I\u000e\u0001\u0000\u0000\u0000"+
		"JK\u0005{\u0000\u0000K\u0010\u0001\u0000\u0000\u0000LM\u0005}\u0000\u0000"+
		"M\u0012\u0001\u0000\u0000\u0000NO\u0005=\u0000\u0000O\u0014\u0001\u0000"+
		"\u0000\u0000PQ\u0005-\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000RS\u0005"+
		"+\u0000\u0000S\u0018\u0001\u0000\u0000\u0000TU\u0005*\u0000\u0000U\u001a"+
		"\u0001\u0000\u0000\u0000VW\u0005/\u0000\u0000W\u001c\u0001\u0000\u0000"+
		"\u0000XY\u0005%\u0000\u0000Y\u001e\u0001\u0000\u0000\u0000Z[\u0005=\u0000"+
		"\u0000[\\\u0005=\u0000\u0000\\ \u0001\u0000\u0000\u0000]^\u0005!\u0000"+
		"\u0000^_\u0005=\u0000\u0000_\"\u0001\u0000\u0000\u0000`a\u0005<\u0000"+
		"\u0000ab\u0005=\u0000\u0000b$\u0001\u0000\u0000\u0000cd\u0005<\u0000\u0000"+
		"d&\u0001\u0000\u0000\u0000ef\u0005>\u0000\u0000fg\u0005=\u0000\u0000g"+
		"(\u0001\u0000\u0000\u0000hi\u0005>\u0000\u0000i*\u0001\u0000\u0000\u0000"+
		"jl\u00033\u0019\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nu\u0001\u0000\u0000"+
		"\u0000oq\u0003\u0003\u0001\u0000pr\u00033\u0019\u0000qp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tv\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000v,\u0001\u0000\u0000\u0000wy\u00033\u0019\u0000xw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{\u007f\u0001\u0000\u0000\u0000|}\u0005m\u0000"+
		"\u0000}\u0080\u0005s\u0000\u0000~\u0080\u0007\u0003\u0000\u0000\u007f"+
		"|\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080.\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u00035\u001a\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u00850\u0001\u0000\u0000"+
		"\u0000\u0086\u008a\u0005\'\u0000\u0000\u0087\u0089\t\u0000\u0000\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008d\u0097\u0005\'\u0000\u0000\u008e\u0092\u0005\"\u0000\u0000\u008f"+
		"\u0091\t\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0095\u0097\u0005\"\u0000\u0000\u0096\u0086\u0001"+
		"\u0000\u0000\u0000\u0096\u008e\u0001\u0000\u0000\u0000\u00972\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0007\u0004\u0000\u0000\u00994\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0007\u0005\u0000\u0000\u009b6\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0007\u0006\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0006\u001b\u0000\u0000\u00a28\u0001\u0000\u0000\u0000\u000b"+
		"\u0000msuz\u007f\u0084\u008a\u0092\u0096\u009f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}