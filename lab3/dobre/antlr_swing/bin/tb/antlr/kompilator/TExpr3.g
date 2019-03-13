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

prog    : (e+=expr | d+=decl)* -> template(name={$e},deklaracje={$d}) "<deklaracje><name>";

decl    :
          ^(VAR ID)                    -> declareVar(i={$ID.text})
          | ^(PODST i1=ID   e2=expr)   -> initializeVar(i1={$i1.text}, e2={$e2.st})
          | ^(PODST VAR i1=ID e2=expr) -> initializeVar(i1={$i1.text}, e2={$e2.st})
    ; 

expr    : ^(PLUS  e1=expr e2=expr)                           -> dodaj(p1={$e1.st},p2={$e2.st})
        | ^(MINUS e1=expr e2=expr)                           -> odejmij(p1={$e1.st},p2={$e2.st})
        | ^(MUL   e1=expr e2=expr)                           -> pomnoz(p1={$e1.st},p2={$e2.st})
        | ^(DIV   e1=expr e2=expr)                           -> podziel(p1={$e1.st},p2={$e2.st})
        | ^(IF ^(GRETHAN e1=expr e2=expr) e3= expr)          -> winksze(e1={$e1.st},e2={$e2.st},e3={$e3.st})
        | ^(IF ^(GRETHANEXAN e1=expr e2=expr) e3=expr)       -> winkszeRowne(e1={$e1.st},e2={$e2.st},e3={$e3.st})
        | ^(IF ^(LOWTHAN e1=expr e2=expr) e3=expr)           -> mnijsze(e1={$e1.st},e2={$e2.st},e3={$e3.st})
        | ^(IF ^(LOWEQUTHAN e1=expr e2=expr) e3=expr)        -> mnijszeRowne(e1={$e1.st},e2={$e2.st},e3={$e3.st})
        | ^(IF ^(EXANTHAN e1=expr e2=expr) e3=expr)          -> rowne(e1={$e1.st},e2={$e2.st},e3={$e3.st})
        | INT                                                -> int(i={$INT.text})
        | ID                                                 -> readVar(i={$ID.text})
    ;