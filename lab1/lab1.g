grammar lab1;

plik : (expr NL+)* EOF;
expr : term ((PLUS term | MINUS term))* ;
term : atom (MUL atom | DIV atom)*;
atom : INT
| (NP expr RP)
;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        ) {$channel=HIDDEN;}
    ;

PLUS	: '+'
	;

MUL	: '*'
	;

DIV	: '/'
	;

MINUS	: '-'
	;

NL	: '\n'
	;

NP	:'('
	;

RP	:')'
	;
