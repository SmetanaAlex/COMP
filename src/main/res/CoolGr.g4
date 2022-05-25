grammar CoolGrammar;

//Parser
program : class+ (COMMENT)*;
type: INT | STRING | TYPE | BOOL | OBJECT;
value: ID COLON type;
attribute_without_semicolon : value (ASSIGN expr)?;
attribute : attribute_without_semicolon SEMICOLON;

assigment : (value | ID) ASSIGN (expr | new) SEMICOLON;

parameters : attribute_without_semicolon (COMMA attribute_without_semicolon)*;

method : (ID | MAIN) LPAREN (parameters)? RPAREN COLON type LBRACE (expr*) RBRACE SEMICOLON;

conditional : IF expr THEN expr ELSE expr FI SEMICOLON;

loop : WHILE expr LOOP expr POOL;

block : LBRACE ((expr SEMICOLON)*) RBRACE;

let : LET (parameters)+ IN expr;

case_option: value CASE_ARROW expr SEMICOLON;

switch_case: CASE expr OF (case_option)+ ESAC;

new : NEW type;

isvoid : ISVOID expr;

ariphemitic_operation: PLUS | MINUS | DIV | MUL | EQUALS | LESS |LESSOREQUALS;

class : CLASS (TYPE | MAIN) (INHERITS TYPE)? LBRACE (attribute)* (method)* RBRACE SEMICOLON;

expr : attribute
    | assigment
    | expr DOT ID LPAREN (expr)? RPAREN
    | ID LPAREN (expr)? RPAREN
    | expr ATSYM type DOT ID LPAREN (expr)? RPAREN
    | conditional
    | loop
    | block
    | let
    | switch_case
    | new
    | isvoid
    | expr ariphemitic_operation expr
    | LPAREN expr RPAREN
    | ID
    | TRUE
    | FALSE
    | STRING_VALUE
    | NUM
    | ERROR
    | COMMENT;

//Lexer
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
EQUALS: '=';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
DOT: '.';
SEMICOLON: ';';
COLON: ':';
LESS: '<';
LESSOREQUALS: '<=';
ASSIGN: '<-';
CASE_ARROW: '=>';
TILDE: '~';
ATSYM: '@';

NOT: ('n'|'N')('o')('t');
TRUE: ('t'|'T')('r')('u')('e');
FALSE: ('f'|'F')('a')('l')('s')('e');

IF: ('i'|'I')('f');
FI: ('f'|'F')('i');
THEN: ('t'|'T')('h')('e')('n');
ELSE: ('e'|'E')('l')('s')('e');
CASE: ('c'|'C')('a')('s')('e');
ESAC: ('e'|'E')('s')('a')('c');
WHILE: ('w'|'W')('h')('i')('l')('e');
LOOP: ('l'|'L')('o')('o'|)('p');
POOL: ('p'|'P')('o')('o')('l');
CLASS: ('c'|'C')('l')('a')('s')('s');
IN: ('i'|'I')('n');
INHERITS: ('i'|'I')('n')('h')('e')('r')('i')('t')('s');
OF: ('o'|'O')('f');
LET: ('l'|'L')('e')('t');
NEW: ('n'|'N')('e')('w');
ISVOID: ('i'|'I')('s')('v')('o')('i')('d');

WS: [ \t\r\n]+ ->skip;

NUM: [0-9]+;
STRING_VALUE: '"'('_'|' '|','|'.'|'!'|'@'|'$'|'&'|'+'|'-'|'*'|'/'|'|'|'_'|'%'|'#'|'('|')'|'{'|'}'|[a-zA-Z]|[0-9])*'"';
COMMENT: '--'('_'|' '|','|'.'|'!'|'@'|'$'|'&'|'+'|'-'|'*'|'/'|'|'|'_'|'%'|'#'|'('|')'|'{'|'}'|[a-zA-Z]|[0-9])*'--';

INT: 'Int';
BOOL: 'Bool';
STRING: 'String';
OBJECT:'Object';
MAIN:('M'|'m')('ain');

TYPE: [A-Z][a-zA-Z0-9]*;
ID: [a-z]('_'|[a-zA-Z]|[0-9])*;
ERROR: . ;