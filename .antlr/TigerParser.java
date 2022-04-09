// Generated from /Users/Peter/Desktop/CS4240Project3/Tiger.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TigerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, MAIN=3, ARRAY=4, BREAK=5, DO=6, IF=7, ELSE=8, FOR=9, 
		FUNCTION=10, LET=11, IN=12, OF=13, THEN=14, TO=15, VAR=16, WHILE=17, ENDIF=18, 
		BEGIN=19, END=20, ENDDO=21, RETURN=22, INT=23, FLOAT=24, COMMA=25, COLON=26, 
		SEMICOLON=27, LEFT_PARENS=28, RIGHT_PARENS=29, LEFT_BRACKET=30, RIGHT_BRACKET=31, 
		PLUS=32, MINUS=33, MULTIPLY=34, DIVIDE=35, EQUAL=36, LESS=37, LESS_EQUAL=38, 
		NOT_EQUAL=39, GREATER=40, GREATER_EQUAL=41, AND=42, OR=43, ASSIGNMENT=44, 
		INTLIT=45, FLOATLIT=46, ID=47;
	public static final int
		RULE_program = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'main'", "'array'", "'break'", "'do'", "'if'", "'else'", 
			"'for'", "'function'", "'let'", "'in'", "'of'", "'then'", "'to'", "'var'", 
			"'while'", "'endif'", "'begin'", "'end'", "'enddo'", "'return'", "'int'", 
			"'float'", "','", "':'", "';'", "'('", "')'", "'['", "']'", "'+'", "'-'", 
			"'*'", "'/'", "'='", "'<'", "'<='", "'<>'", "'>'", "'>='", "'&'", "'|'", 
			"':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "MAIN", "ARRAY", "BREAK", "DO", "IF", "ELSE", 
			"FOR", "FUNCTION", "LET", "IN", "OF", "THEN", "TO", "VAR", "WHILE", "ENDIF", 
			"BEGIN", "END", "ENDDO", "RETURN", "INT", "FLOAT", "COMMA", "COLON", 
			"SEMICOLON", "LEFT_PARENS", "RIGHT_PARENS", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "EQUAL", "LESS", "LESS_EQUAL", 
			"NOT_EQUAL", "GREATER", "GREATER_EQUAL", "AND", "OR", "ASSIGNMENT", "INTLIT", 
			"FLOATLIT", "ID"
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
	public String getGrammarFileName() { return "Tiger.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TigerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(TigerParser.MAIN, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(TigerParser.GREATER_EQUAL, 0); }
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(MAIN);
			setState(3);
			match(GREATER_EQUAL);
			setState(4);
			match(ID);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\t\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\7\2\4\3\2\2\2\4\5\7\5\2\2\5\6\7+\2\2\6"+
		"\7\7\61\2\2\7\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}