// Generated from java-escape by ANTLR 4.11.1
package org.apache.skywalking.logql.rt.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LogQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONTAINS=1, NOT_CONTAINS=2, L_ACCENT=3, COMMA=4, L_BRACE=5, R_BRACE=6, 
		EQ=7, NAME_STRING=8, VALUE_STRING=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONTAINS", "NOT_CONTAINS", "L_ACCENT", "COMMA", "L_BRACE", "R_BRACE", 
			"EQ", "NAME_STRING", "VALUE_STRING", "NameLetter", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|='", "'!='", "'`'", "','", "'{'", "'}'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONTAINS", "NOT_CONTAINS", "L_ACCENT", "COMMA", "L_BRACE", "R_BRACE", 
			"EQ", "NAME_STRING", "VALUE_STRING", "WS"
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


	public LogQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LogQLLexer.g4"; }

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
		"\u0004\u0000\nO\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007)\b\u0007"+
		"\u000b\u0007\f\u0007*\u0001\b\u0001\b\u0005\b/\b\b\n\b\f\b2\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b7\b\b\n\b\f\b:\t\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b?\b\b\n\b\f\bB\t\b\u0001\b\u0003\bE\b\b\u0001\t\u0001\t\u0001\n\u0004"+
		"\nJ\b\n\u000b\n\f\nK\u0001\n\u0001\n\u000308@\u0000\u000b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\u0000\u0015\n\u0001\u0000\u0002\u0004\u000009AZ__az\u0003"+
		"\u0000\t\n\r\r  T\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u001a\u0001\u0000\u0000"+
		"\u0000\u0005\u001d\u0001\u0000\u0000\u0000\u0007\u001f\u0001\u0000\u0000"+
		"\u0000\t!\u0001\u0000\u0000\u0000\u000b#\u0001\u0000\u0000\u0000\r%\u0001"+
		"\u0000\u0000\u0000\u000f(\u0001\u0000\u0000\u0000\u0011D\u0001\u0000\u0000"+
		"\u0000\u0013F\u0001\u0000\u0000\u0000\u0015I\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0005|\u0000\u0000\u0018\u0019\u0005=\u0000\u0000\u0019\u0002\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005!\u0000\u0000\u001b\u001c\u0005=\u0000"+
		"\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d\u001e\u0005`\u0000\u0000"+
		"\u001e\u0006\u0001\u0000\u0000\u0000\u001f \u0005,\u0000\u0000 \b\u0001"+
		"\u0000\u0000\u0000!\"\u0005{\u0000\u0000\"\n\u0001\u0000\u0000\u0000#"+
		"$\u0005}\u0000\u0000$\f\u0001\u0000\u0000\u0000%&\u0005=\u0000\u0000&"+
		"\u000e\u0001\u0000\u0000\u0000\')\u0003\u0013\t\u0000(\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+\u0010\u0001\u0000\u0000\u0000,0\u0005\'\u0000\u0000-/\t"+
		"\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000013\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u00003E\u0005\'\u0000\u000048\u0005\"\u0000"+
		"\u000057\t\u0000\u0000\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009;\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000;E\u0005\"\u0000\u0000<@\u0005`"+
		"\u0000\u0000=?\t\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AC\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CE\u0005`\u0000\u0000D,\u0001"+
		"\u0000\u0000\u0000D4\u0001\u0000\u0000\u0000D<\u0001\u0000\u0000\u0000"+
		"E\u0012\u0001\u0000\u0000\u0000FG\u0007\u0000\u0000\u0000G\u0014\u0001"+
		"\u0000\u0000\u0000HJ\u0007\u0001\u0000\u0000IH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0006\n\u0000\u0000N\u0016\u0001\u0000"+
		"\u0000\u0000\u0007\u0000*08@DK\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}