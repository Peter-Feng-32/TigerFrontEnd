// Generated from Tiger.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TigerParser}.
 */
public interface TigerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TigerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TigerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TigerParser.ProgramContext ctx);
}