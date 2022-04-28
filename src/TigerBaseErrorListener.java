import org.antlr.v4.runtime.*;
@SuppressWarnings("deprecation")
public class TigerBaseErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Driver.syntaxError = true;
        if (!Driver.lexicalError)
        {
            Parser parser = (Parser) recognizer;

            TokenStream tokens = parser.getInputStream();

            String offSymText = ((Token) offendingSymbol).getText();

            System.out.println();
            System.out.println("Generated Error Message: " + msg);
            System.out.println("Syntax error at line " + line + ": " + "at symbol \"" + offSymText + "\": ");
            if (e != null)
            {
                System.out.println("Expecting possible tokens: " + e.getExpectedTokens().toString(recognizer.getTokenNames()));
            }
        }
    }
}
