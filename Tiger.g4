/*
 ANTLR Grammar for Tiger language.
 */

grammar Tiger;

/*
 
 Parsing rules. Lowercase.
 */

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

