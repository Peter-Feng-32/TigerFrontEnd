import org.antlr.v4.runtime.*;
@SuppressWarnings("deprecation")
public class TigerLexicalErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Driver.lexicalError = true;

    }
}
