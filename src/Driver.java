import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
public class Driver {
    public static boolean lexicalError = false;
    public static boolean syntaxError = false;
    public static void main(String[] args) throws IOException{
        String filename = args[0];
        CharStream c = CharStreams.fromFileName(filename);
        TigerLexer tlex = new TigerLexer(c);
        tlex.addErrorListener(TigerLexicalErrorListener.INSTANCE);
        BufferedTokenStream bts = new BufferedTokenStream(tlex);
        TigerParser tpars = new TigerParser(bts);
        tpars.removeErrorListeners();
        tpars.addErrorListener(TigerBaseErrorListener.INSTANCE);
        tpars.tiger_program();
        if (!syntaxError && !lexicalError) {
            System.out.println("successful parse");
        } 
    }
}
