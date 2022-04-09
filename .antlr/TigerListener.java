// Generated from Tiger.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TigerParser}.
 */
public interface TigerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TigerParser#tiger_program}.
	 * @param ctx the parse tree
	 */
	void enterTiger_program(TigerParser.Tiger_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#tiger_program}.
	 * @param ctx the parse tree
	 */
	void exitTiger_program(TigerParser.Tiger_programContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(TigerParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(TigerParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#var_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration_list(TigerParser.Var_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#var_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration_list(TigerParser.Var_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(TigerParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(TigerParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#func_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declaration_list(TigerParser.Func_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#func_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declaration_list(TigerParser.Func_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declaration(TigerParser.Func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declaration(TigerParser.Func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TigerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TigerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#type_id}.
	 * @param ctx the parse tree
	 */
	void enterType_id(TigerParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#type_id}.
	 * @param ctx the parse tree
	 */
	void exitType_id(TigerParser.Type_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(TigerParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(TigerParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#id_list_comma}.
	 * @param ctx the parse tree
	 */
	void enterId_list_comma(TigerParser.Id_list_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#id_list_comma}.
	 * @param ctx the parse tree
	 */
	void exitId_list_comma(TigerParser.Id_list_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#optional_init}.
	 * @param ctx the parse tree
	 */
	void enterOptional_init(TigerParser.Optional_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#optional_init}.
	 * @param ctx the parse tree
	 */
	void exitOptional_init(TigerParser.Optional_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(TigerParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(TigerParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#param_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_list_tail(TigerParser.Param_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#param_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_list_tail(TigerParser.Param_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#ret_type}.
	 * @param ctx the parse tree
	 */
	void enterRet_type(TigerParser.Ret_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#ret_type}.
	 * @param ctx the parse tree
	 */
	void exitRet_type(TigerParser.Ret_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(TigerParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(TigerParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#stat_seq}.
	 * @param ctx the parse tree
	 */
	void enterStat_seq(TigerParser.Stat_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#stat_seq}.
	 * @param ctx the parse tree
	 */
	void exitStat_seq(TigerParser.Stat_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#stat_seq_tail}.
	 * @param ctx the parse tree
	 */
	void enterStat_seq_tail(TigerParser.Stat_seq_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#stat_seq_tail}.
	 * @param ctx the parse tree
	 */
	void exitStat_seq_tail(TigerParser.Stat_seq_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TigerParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TigerParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#stat_if}.
	 * @param ctx the parse tree
	 */
	void enterStat_if(TigerParser.Stat_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#stat_if}.
	 * @param ctx the parse tree
	 */
	void exitStat_if(TigerParser.Stat_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(TigerParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(TigerParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TigerParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TigerParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TigerParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TigerParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or(TigerParser.Expr_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or(TigerParser.Expr_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_or_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_(TigerParser.Expr_or_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_or_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_(TigerParser.Expr_or_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and(TigerParser.Expr_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and(TigerParser.Expr_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_and_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and_(TigerParser.Expr_and_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_and_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and_(TigerParser.Expr_and_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_lesseq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_lesseq(TigerParser.Expr_lesseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_lesseq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_lesseq(TigerParser.Expr_lesseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_lesseq_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_lesseq_(TigerParser.Expr_lesseq_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_lesseq_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_lesseq_(TigerParser.Expr_lesseq_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_greateq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_greateq(TigerParser.Expr_greateqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_greateq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_greateq(TigerParser.Expr_greateqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_greateq_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_greateq_(TigerParser.Expr_greateq_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_greateq_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_greateq_(TigerParser.Expr_greateq_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_less}.
	 * @param ctx the parse tree
	 */
	void enterExpr_less(TigerParser.Expr_lessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_less}.
	 * @param ctx the parse tree
	 */
	void exitExpr_less(TigerParser.Expr_lessContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_less_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_less_(TigerParser.Expr_less_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_less_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_less_(TigerParser.Expr_less_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_great}.
	 * @param ctx the parse tree
	 */
	void enterExpr_great(TigerParser.Expr_greatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_great}.
	 * @param ctx the parse tree
	 */
	void exitExpr_great(TigerParser.Expr_greatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_great_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_great_(TigerParser.Expr_great_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_great_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_great_(TigerParser.Expr_great_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_noteq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_noteq(TigerParser.Expr_noteqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_noteq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_noteq(TigerParser.Expr_noteqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_noteq_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_noteq_(TigerParser.Expr_noteq_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_noteq_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_noteq_(TigerParser.Expr_noteq_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(TigerParser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(TigerParser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_eq_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq_(TigerParser.Expr_eq_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_eq_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq_(TigerParser.Expr_eq_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_minus}.
	 * @param ctx the parse tree
	 */
	void enterExpr_minus(TigerParser.Expr_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_minus}.
	 * @param ctx the parse tree
	 */
	void exitExpr_minus(TigerParser.Expr_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_minus_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_minus_(TigerParser.Expr_minus_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_minus_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_minus_(TigerParser.Expr_minus_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_plus}.
	 * @param ctx the parse tree
	 */
	void enterExpr_plus(TigerParser.Expr_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_plus}.
	 * @param ctx the parse tree
	 */
	void exitExpr_plus(TigerParser.Expr_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_plus_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_plus_(TigerParser.Expr_plus_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_plus_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_plus_(TigerParser.Expr_plus_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_div}.
	 * @param ctx the parse tree
	 */
	void enterExpr_div(TigerParser.Expr_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_div}.
	 * @param ctx the parse tree
	 */
	void exitExpr_div(TigerParser.Expr_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_div_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_div_(TigerParser.Expr_div_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_div_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_div_(TigerParser.Expr_div_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_mul}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mul(TigerParser.Expr_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_mul}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mul(TigerParser.Expr_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_mul_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mul_(TigerParser.Expr_mul_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_mul_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mul_(TigerParser.Expr_mul_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_paren}.
	 * @param ctx the parse tree
	 */
	void enterExpr_paren(TigerParser.Expr_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_paren}.
	 * @param ctx the parse tree
	 */
	void exitExpr_paren(TigerParser.Expr_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#cons}.
	 * @param ctx the parse tree
	 */
	void enterCons(TigerParser.ConsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#cons}.
	 * @param ctx the parse tree
	 */
	void exitCons(TigerParser.ConsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(TigerParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(TigerParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(TigerParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(TigerParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(TigerParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(TigerParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#lvalue_tail}.
	 * @param ctx the parse tree
	 */
	void enterLvalue_tail(TigerParser.Lvalue_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#lvalue_tail}.
	 * @param ctx the parse tree
	 */
	void exitLvalue_tail(TigerParser.Lvalue_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TigerParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(TigerParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TigerParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(TigerParser.TestContext ctx);
}