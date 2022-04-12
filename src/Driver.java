import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
public class Driver {
    public static int k = 0;
    public static void main(String[] args) throws IOException{
        String filename = args[0];
        CharStream c = CharStreams.fromFileName(filename);
        TigerBaseErrorListener tbel = new TigerBaseErrorListener();
        TigerLexer tlex = new TigerLexer(c);
        tlex.addErrorListener(tbel);
        BufferedTokenStream bts = new BufferedTokenStream(tlex);
        TigerParser tpars = new TigerParser(bts);
        tpars.addErrorListener(tbel);
        tpars.tiger_program();
        if (k == 0) {
            System.out.println("successful parse");
        }
    }
}
