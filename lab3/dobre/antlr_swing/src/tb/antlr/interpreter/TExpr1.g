tree grammar TExpr1;

options {
	tokenVocab=Expr;

	ASTLabelType=CommonTree;
    superClass=MyTreeParser;
}

@header {
package tb.antlr.interpreter;
}

prog    : (e=expr {drukuj ($e.text + " = " + $e.out.toString());})* ;

expr returns [Integer out]
        : ^(PLUS  e1=expr e2=expr)   { $out = sum($e1.out, $e2.out); }
        | ^(MINUS e1=expr e2=expr)   { $out = difference($e1.out, $e2.out); }
        | ^(MUL   e1=expr e2=expr)   { $out = multiply($e1.out, $e2.out); }
        | ^(DIV   e1=expr e2=expr)   { $out = divide($e1.out, $e2.out); }
        | ^(PODST i1=ID   e2=expr)   { $out = podstaw($i1.text, $e2.out); }
        | ^(VAR i1=ID)                  { $out = initialize($i1.text); }
        | ^(PODST VAR i1=ID e2=expr) { $out = initialize($i1.text, $e2.out); }
        | INT                        { $out = getInt($INT.text); }
        | ID                         { $out = getValue($ID.text); }
        ;
