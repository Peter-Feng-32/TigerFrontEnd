import org.antlr.v4.runtime.*;

public class TigerLexicalErrorListener extends BaseErrorListener {

   public static final TigerLexicalErrorListener INSTANCE = new TigerLexicalErrorListener();


    @Override
    public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Driver.k = 1;

    }
}
