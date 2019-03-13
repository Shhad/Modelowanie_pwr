tree grammar TExpr3;

options {
  tokenVocab=Expr;

  ASTLabelType=CommonTree;

  output=template;
  superClass = TreeParserTmpl;
}

@header {
package tb.antlr.kompilator;
}

@members {
  Integer numer = 0;
}
prog    : (e+=expr | d+=decl)* -> template(name={$e},deklaracje={$d}) "<deklaracje> start: <name;separator=\" \n\"> ";

decl  :
        ^(VAR i1=ID) {globals.newSymbol($ID.text);} -> dek(n={$ID.text})
    ;
    catch [RuntimeException ex] {errorID(ex,$i1);}

expr    : ^(PLUS  e1=expr e2=expr) -> dodaj(p1={$e1.st},p2={$e2.st})
        | ^(MINUS e1=expr e2=expr) -> odejmij(p1={$e1.st},p2={$e2.st})
        | ^(MUL   e1=expr e2=expr) -> pomnoz(p1={$e1.st},p2={$e2.st})
        | ^(DIV   e1=expr e2=expr) -> podziel(p1={$e1.st},p2={$e2.st})
        | ^(PODST i1=ID   e2=expr) ->podst(p1={$e1.st},p2={$e2.st})
        | ^(LOOP  e1=expr e2=expr) ->  while(p1={$e1.st},p2={$e2.st})
        | INT  {numer++;}          -> int(i={$INT.text},j={numer.toString()})
        
    ;
    