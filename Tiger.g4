/*
 ANTLR Grammar for Tiger language.
 */

grammar Tiger;

/*
 
 Parsing rules. Lowercase.
 */

tiger_program:
	MAIN LET declaration_statement IN BEGIN stat_seq END;
declaration_statement:
	var_declaration_list func_declaration_list;
var_declaration_list: // emtpy
	| var_declaration var_declaration_list;
var_declaration: VAR id_list COLON type optional_init SEMICOLON;
func_declaration_list: // emtpy
	| func_declaration func_declaration_list;
func_declaration:
	FUNCTION ID LEFT_PARENS param_list RIGHT_PARENS ret_type BEGIN stat_seq END;
type:
	type_id
	| ARRAY LEFT_BRACKET INTLIT RIGHT_BRACKET OF type_id;
type_id: INT | FLOAT;
id_list: ID id_list_comma;
id_list_comma: | COMMA id_list;
optional_init: // empty
	| ASSIGNMENT cons;
param_list: // empty
	| param param_list_tail;
param_list_tail: // empty
	| COMMA param param_list_tail;
ret_type: //empty
	| COLON type;
param: ID COLON type;
stat_seq: stat stat_seq_tail;
stat_seq_tail: | stat stat_seq_tail;
stat:
	IF expr_or THEN stat_seq stat_if
	| WHILE expr_or DO stat_seq ENDDO SEMICOLON
	| FOR ID ASSIGNMENT expr_or TO expr_or DO stat_seq ENDDO SEMICOLON
	| ID prefix
	| BREAK SEMICOLON
	| RETURN expr_or SEMICOLON
	| LET declaration_statement IN stat_seq END;
stat_if: ENDIF SEMICOLON | ELSE stat_seq ENDIF SEMICOLON;
prefix:
	LEFT_PARENS expr_list RIGHT_PARENS SEMICOLON
	| lvalue_tail ASSIGNMENT assign;
assign:
	cons expr_mul_ expr_div_ expr_plus_ expr_minus_ expr_eq_ expr_noteq_ expr_great_ expr_less_
		expr_greateq_ expr_lesseq_ expr_and_ expr_or_ SEMICOLON
	| LEFT_PARENS expr_or RIGHT_PARENS expr_mul_ expr_div_ expr_plus_ expr_minus_ expr_eq_
		expr_noteq_ expr_great_ expr_less_ expr_greateq_ expr_lesseq_ expr_and_ expr_or_ SEMICOLON
	| ID id;
id:
	lvalue_tail expr_mul_ expr_div_ expr_plus_ expr_minus_ expr_eq_ expr_noteq_ expr_great_
		expr_less_ expr_greateq_ expr_lesseq_ expr_and_ expr_or_ SEMICOLON
	| LEFT_PARENS expr_list RIGHT_PARENS SEMICOLON;
// Levels of experssion to handle operator precedence
expr_or: expr_and expr_or_;
expr_or_: OR expr_and expr_or_ |;
expr_and: expr_lesseq expr_and_;
expr_and_: AND expr_lesseq expr_and_ |;
expr_lesseq: expr_greateq expr_lesseq_;
expr_lesseq_: LESS_EQUAL expr_greateq expr_lesseq_ |;
expr_greateq: expr_less expr_greateq_;
expr_greateq_: GREATER_EQUAL expr_less expr_greateq_ |;
expr_less: expr_great expr_less_;
expr_less_: LESS expr_great expr_less_ |;
expr_great: expr_noteq expr_great_;
expr_great_: GREATER expr_noteq expr_great_ |;
expr_noteq: expr_eq expr_noteq_;
expr_noteq_: NOT_EQUAL expr_eq expr_noteq_ |;
expr_eq: expr_minus expr_eq_;
expr_eq_: EQUAL expr_minus expr_eq_ |;
expr_minus: expr_plus expr_minus_;
expr_minus_: MINUS expr_plus expr_minus_ |;
expr_plus: expr_div expr_plus_;
expr_plus_: PLUS expr_div expr_plus_ |;
expr_div: expr_mul expr_div_;
expr_div_: DIVIDE expr_mul expr_div_ |;
expr_mul: expr_paren expr_mul_;
expr_mul_: MULTIPLY expr_paren expr_mul_ |;
expr_paren: cons | lvalue | LEFT_PARENS expr_or RIGHT_PARENS;

cons: INTLIT | FLOATLIT;
expr_list: | expr_or expr_list_tail;
expr_list_tail: COMMA expr_or expr_list_tail |;
lvalue: ID lvalue_tail;
lvalue_tail: LEFT_BRACKET expr_or RIGHT_BRACKET |;
//IGNORE THIS RULE.  STRICTLY MADE FOR TESTING PURPOSES 
test: MAIN GREATER_EQUAL ID;

/*
 Lexing rules. Uppercase. Rules are applied top to bottom. In the case that more than one.
 */

//Whitespace skip
WS: [ \r\t\n]+ -> skip;

//Nesting is not allowed.  /* /* This should not work.  Match the first '/*' to the first '*/' by using shortest match regex symbol ?: .*? */ */
COMMENT: '/*' .*? '*/' -> skip;

//Reserved Keywords
MAIN: 'main';
ARRAY: 'array';
BREAK: 'break';
DO: 'do';
IF: 'if';
ELSE: 'else';
FOR: 'for';
FUNCTION: 'function';
LET: 'let';
IN: 'in';
OF: 'of';
THEN: 'then';
TO: 'to';
VAR: 'var';
WHILE: 'while';
ENDIF: 'endif';
BEGIN: 'begin';
END: 'end';
ENDDO: 'enddo';
RETURN: 'return';
INT: 'int';
FLOAT: 'float';

//Punctuation
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
LEFT_PARENS: '(';
RIGHT_PARENS: ')';
LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';

//Binary Operators:
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
EQUAL: '=';
LESS: '<';
LESS_EQUAL: '<=';
NOT_EQUAL: '<>';
GREATER: '>';
GREATER_EQUAL: '>=';
AND: '&';
OR: '|';

ASSIGNMENT: ':=';

/** An integer literal is a non-empty sequence of digits. */
INTLIT: [0-9]+;

/** A float literal must consist of a non-empty sequence of digits, a radix (i.e., a decimal point),
 and a (possibly empty) sequence of digits.
 */
FLOATLIT: INTLIT '.' [0-9]*;

/** An identifier is a sequence of one or more letters, digits, and underscores. It must start with
 a letter, followed by zero or more of letter, digit or underscore.
 */
ID: [a-zA-Z]([A-Za-z0-9_])*;

