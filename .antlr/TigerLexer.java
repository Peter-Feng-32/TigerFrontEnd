// Generated from Tiger.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TigerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "MAIN", "ARRAY", "BREAK", "DO", "IF", "ELSE", "FOR", 
			"FUNCTION", "LET", "IN", "OF", "THEN", "TO", "VAR", "WHILE", "ENDIF", 
			"BEGIN", "END", "ENDDO", "RETURN", "INT", "FLOAT", "COMMA", "COLON", 
			"SEMICOLON", "LEFT_PARENS", "RIGHT_PARENS", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "EQUAL", "LESS", "LESS_EQUAL", 
			"NOT_EQUAL", "GREATER", "GREATER_EQUAL", "AND", "OR", "ASSIGNMENT", "INTLIT", 
			"FLOATLIT", "ID"
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


	public TigerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tiger.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0122\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2c\n\2\r\2\16\2d\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*"+
		"\3+\3+\3,\3,\3-\3-\3-\3.\6.\u0110\n.\r.\16.\u0111\3/\3/\3/\7/\u0117\n"+
		"/\f/\16/\u011a\13/\3\60\3\60\7\60\u011e\n\60\f\60\16\60\u0121\13\60\3"+
		"n\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\6\5\2\13\f\17\17"+
		"\"\"\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\2\u0126\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3b\3\2\2\2\5h\3\2\2\2\7v\3\2\2"+
		"\2\t{\3\2\2\2\13\u0081\3\2\2\2\r\u0087\3\2\2\2\17\u008a\3\2\2\2\21\u008d"+
		"\3\2\2\2\23\u0092\3\2\2\2\25\u0096\3\2\2\2\27\u009f\3\2\2\2\31\u00a3\3"+
		"\2\2\2\33\u00a6\3\2\2\2\35\u00a9\3\2\2\2\37\u00ae\3\2\2\2!\u00b1\3\2\2"+
		"\2#\u00b5\3\2\2\2%\u00bb\3\2\2\2\'\u00c1\3\2\2\2)\u00c7\3\2\2\2+\u00cb"+
		"\3\2\2\2-\u00d1\3\2\2\2/\u00d8\3\2\2\2\61\u00dc\3\2\2\2\63\u00e2\3\2\2"+
		"\2\65\u00e4\3\2\2\2\67\u00e6\3\2\2\29\u00e8\3\2\2\2;\u00ea\3\2\2\2=\u00ec"+
		"\3\2\2\2?\u00ee\3\2\2\2A\u00f0\3\2\2\2C\u00f2\3\2\2\2E\u00f4\3\2\2\2G"+
		"\u00f6\3\2\2\2I\u00f8\3\2\2\2K\u00fa\3\2\2\2M\u00fc\3\2\2\2O\u00ff\3\2"+
		"\2\2Q\u0102\3\2\2\2S\u0104\3\2\2\2U\u0107\3\2\2\2W\u0109\3\2\2\2Y\u010b"+
		"\3\2\2\2[\u010f\3\2\2\2]\u0113\3\2\2\2_\u011b\3\2\2\2ac\t\2\2\2ba\3\2"+
		"\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\2\2\2g\4\3\2\2\2hi\7"+
		"\61\2\2ij\7,\2\2jn\3\2\2\2km\13\2\2\2lk\3\2\2\2mp\3\2\2\2no\3\2\2\2nl"+
		"\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7,\2\2rs\7\61\2\2st\3\2\2\2tu\b\3\2\2u"+
		"\6\3\2\2\2vw\7o\2\2wx\7c\2\2xy\7k\2\2yz\7p\2\2z\b\3\2\2\2{|\7c\2\2|}\7"+
		"t\2\2}~\7t\2\2~\177\7c\2\2\177\u0080\7{\2\2\u0080\n\3\2\2\2\u0081\u0082"+
		"\7d\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7m\2\2\u0086\f\3\2\2\2\u0087\u0088\7f\2\2\u0088\u0089\7q\2\2\u0089"+
		"\16\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\20\3\2\2\2\u008d"+
		"\u008e\7g\2\2\u008e\u008f\7n\2\2\u008f\u0090\7u\2\2\u0090\u0091\7g\2\2"+
		"\u0091\22\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7q\2\2\u0094\u0095\7"+
		"t\2\2\u0095\24\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7w\2\2\u0098\u0099"+
		"\7p\2\2\u0099\u009a\7e\2\2\u009a\u009b\7v\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7q\2\2\u009d\u009e\7p\2\2\u009e\26\3\2\2\2\u009f\u00a0\7n\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\u00a2\7v\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4"+
		"\u00a5\7p\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7h\2\2\u00a8"+
		"\34\3\2\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7p\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7q\2\2\u00b0"+
		" \3\2\2\2\u00b1\u00b2\7x\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\"\3\2\2\2\u00b5\u00b6\7y\2\2\u00b6\u00b7\7j\2\2\u00b7\u00b8\7k\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc"+
		"\u00bd\7p\2\2\u00bd\u00be\7f\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7h\2\2"+
		"\u00c0&\3\2\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7i\2"+
		"\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6(\3\2\2\2\u00c7\u00c8\7"+
		"g\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7f\2\2\u00ca*\3\2\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7f\2\2\u00cf"+
		"\u00d0\7q\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\u00d4\7v\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7p\2\2"+
		"\u00d7.\3\2\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7v\2"+
		"\2\u00db\60\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7n\2\2\u00de\u00df"+
		"\7q\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7v\2\2\u00e1\62\3\2\2\2\u00e2\u00e3"+
		"\7.\2\2\u00e3\64\3\2\2\2\u00e4\u00e5\7<\2\2\u00e5\66\3\2\2\2\u00e6\u00e7"+
		"\7=\2\2\u00e78\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9:\3\2\2\2\u00ea\u00eb\7"+
		"+\2\2\u00eb<\3\2\2\2\u00ec\u00ed\7]\2\2\u00ed>\3\2\2\2\u00ee\u00ef\7_"+
		"\2\2\u00ef@\3\2\2\2\u00f0\u00f1\7-\2\2\u00f1B\3\2\2\2\u00f2\u00f3\7/\2"+
		"\2\u00f3D\3\2\2\2\u00f4\u00f5\7,\2\2\u00f5F\3\2\2\2\u00f6\u00f7\7\61\2"+
		"\2\u00f7H\3\2\2\2\u00f8\u00f9\7?\2\2\u00f9J\3\2\2\2\u00fa\u00fb\7>\2\2"+
		"\u00fbL\3\2\2\2\u00fc\u00fd\7>\2\2\u00fd\u00fe\7?\2\2\u00feN\3\2\2\2\u00ff"+
		"\u0100\7>\2\2\u0100\u0101\7@\2\2\u0101P\3\2\2\2\u0102\u0103\7@\2\2\u0103"+
		"R\3\2\2\2\u0104\u0105\7@\2\2\u0105\u0106\7?\2\2\u0106T\3\2\2\2\u0107\u0108"+
		"\7(\2\2\u0108V\3\2\2\2\u0109\u010a\7~\2\2\u010aX\3\2\2\2\u010b\u010c\7"+
		"<\2\2\u010c\u010d\7?\2\2\u010dZ\3\2\2\2\u010e\u0110\t\3\2\2\u010f\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\\\3\2\2\2\u0113\u0114\5[.\2\u0114\u0118\7\60\2\2\u0115\u0117\t\3\2\2"+
		"\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119^\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011f\t\4\2\2\u011c"+
		"\u011e\t\5\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120`\3\2\2\2\u0121\u011f\3\2\2\2\b\2dn\u0111"+
		"\u0118\u011f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}