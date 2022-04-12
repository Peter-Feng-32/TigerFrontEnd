import org.antlr.v4.runtime.*;
public class TigerBaseErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Driver.k = 1;
    }
}
