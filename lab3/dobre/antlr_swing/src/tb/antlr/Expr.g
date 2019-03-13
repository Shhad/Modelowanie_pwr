grammar Expr;

options {
  output=AST;
  ASTLabelType=CommonTree;
}

@header {
package tb.antlr;
}

@lexer::header {
package tb.antlr;
}

prog
    : (stat )+ EOF!;


stat
    : expr NL -> expr
    | ID PODST expr NL -> ^(PODST ID expr)
    | VAR ID NL -> ^(VAR ID)
    | VAR ID PODST expr NL -> ^(PODST VAR ID expr) 
    | IF LP warExpr RP expr NL -> ^(IF warExpr expr)
    ;

expr
    : multExpr
      ( PLUS^ multExpr
      | MINUS^ multExpr
      )*
    ;

multExpr
    : atom
      ( MUL^ atom
      | DIV^ atom
      )*
    ;

atom
    : INT
    | ID
    | LP! expr RP!
    ;
    
warExpr
    : expr (
       GRETHAN^  expr
     | LOWTHAN^  expr
     | LOWEQUTHAN^ expr
     | GRETHANEXAN^ expr
     | EXANTHAN^ expr)
    ;
VAR :'int';

IF: 'if' ;

ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT : '0'..'9'+;

NL : '\r'? '\n' ;

WS : (' ' | '\t')+ {$channel = HIDDEN;} ;

LOWTHAN  : '<';
LOWEQUTHAN : '=<';
GRETHAN  : '>';
GRETHANEXAN : '=>';
EXANTHAN  : '==';
 
LP
	:	'('
	;

RP
	:	')'
	;

PODST
	:	'='
	;

PLUS
	:	'+'
	;

MINUS
	:	'-'
	;

MUL
	:	'*'
	;

DIV
	:	'/'
	;
