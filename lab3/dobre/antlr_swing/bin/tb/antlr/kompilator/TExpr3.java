// $ANTLR 3.4 /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g 2019-03-13 15:29:04

package tb.antlr.kompilator;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class TExpr3 extends TreeParserTmpl {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIV", "EXANTHAN", "GRETHAN", "GRETHANEXAN", "ID", "IF", "INT", "LOWEQUTHAN", "LOWTHAN", "LP", "MINUS", "MUL", "NL", "PLUS", "PODST", "RP", "VAR", "WS"
    };

    public static final int EOF=-1;
    public static final int DIV=4;
    public static final int EXANTHAN=5;
    public static final int GRETHAN=6;
    public static final int GRETHANEXAN=7;
    public static final int ID=8;
    public static final int IF=9;
    public static final int INT=10;
    public static final int LOWEQUTHAN=11;
    public static final int LOWTHAN=12;
    public static final int LP=13;
    public static final int MINUS=14;
    public static final int MUL=15;
    public static final int NL=16;
    public static final int PLUS=17;
    public static final int PODST=18;
    public static final int RP=19;
    public static final int VAR=20;
    public static final int WS=21;

    // delegates
    public TreeParserTmpl[] getDelegates() {
        return new TreeParserTmpl[] {};
    }

    // delegators


    public TExpr3(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TExpr3(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("TExpr3Templates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return TExpr3.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g"; }


    public static class prog_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prog"
    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:16:1: prog : (e+= expr |d+= decl )* -> template(name=$edeklaracje=$d) \"<deklaracje><name>\";
    public final TExpr3.prog_return prog() throws RecognitionException {
        TExpr3.prog_return retval = new TExpr3.prog_return();
        retval.start = input.LT(1);


        List list_e=null;
        List list_d=null;
        RuleReturnScope e = null;
        RuleReturnScope d = null;
        try {
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:16:9: ( (e+= expr |d+= decl )* -> template(name=$edeklaracje=$d) \"<deklaracje><name>\")
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:16:11: (e+= expr |d+= decl )*
            {
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:16:11: (e+= expr |d+= decl )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DIV||(LA1_0 >= ID && LA1_0 <= INT)||(LA1_0 >= MINUS && LA1_0 <= MUL)||LA1_0==PLUS) ) {
                    alt1=1;
                }
                else if ( (LA1_0==PODST||LA1_0==VAR) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:16:12: e+= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_prog61);
            	    e=expr();

            	    state._fsp--;

            	    if (list_e==null) list_e=new ArrayList();
            	    list_e.add(e.getTemplate());


            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:16:22: d+= decl
            	    {
            	    pushFollow(FOLLOW_decl_in_prog67);
            	    d=decl();

            	    state._fsp--;

            	    if (list_d==null) list_d=new ArrayList();
            	    list_d.add(d.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // TEMPLATE REWRITE
            // 16:32: -> template(name=$edeklaracje=$d) \"<deklaracje><name>\"
            {
                retval.st = new StringTemplate(templateLib, "<deklaracje><name>",new STAttrMap().put("name", list_e).put("deklaracje", list_d));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class decl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "decl"
    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:18:1: decl : ( ^( VAR ID ) -> declareVar(i=$ID.text)| ^( PODST i1= ID e2= expr ) -> initializeVar(i1=$i1.texte2=$e2.st)| ^( PODST VAR i1= ID e2= expr ) -> initializeVar(i1=$i1.texte2=$e2.st));
    public final TExpr3.decl_return decl() throws RecognitionException {
        TExpr3.decl_return retval = new TExpr3.decl_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        CommonTree ID1=null;
        TExpr3.expr_return e2 =null;


        try {
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:18:9: ( ^( VAR ID ) -> declareVar(i=$ID.text)| ^( PODST i1= ID e2= expr ) -> initializeVar(i1=$i1.texte2=$e2.st)| ^( PODST VAR i1= ID e2= expr ) -> initializeVar(i1=$i1.texte2=$e2.st))
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VAR) ) {
                alt2=1;
            }
            else if ( (LA2_0==PODST) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==DOWN) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==ID) ) {
                        alt2=2;
                    }
                    else if ( (LA2_3==VAR) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:19:11: ^( VAR ID )
                    {
                    match(input,VAR,FOLLOW_VAR_in_decl106); 

                    match(input, Token.DOWN, null); 
                    ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_decl108); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 19:40: -> declareVar(i=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("declareVar",new STAttrMap().put("i", (ID1!=null?ID1.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:20:13: ^( PODST i1= ID e2= expr )
                    {
                    match(input,PODST,FOLLOW_PODST_in_decl152); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_decl156); 

                    pushFollow(FOLLOW_expr_in_decl162);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 20:40: -> initializeVar(i1=$i1.texte2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("initializeVar",new STAttrMap().put("i1", (i1!=null?i1.getText():null)).put("e2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:21:13: ^( PODST VAR i1= ID e2= expr )
                    {
                    match(input,PODST,FOLLOW_PODST_in_decl194); 

                    match(input, Token.DOWN, null); 
                    match(input,VAR,FOLLOW_VAR_in_decl196); 

                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_decl200); 

                    pushFollow(FOLLOW_expr_in_decl204);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 21:40: -> initializeVar(i1=$i1.texte2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("initializeVar",new STAttrMap().put("i1", (i1!=null?i1.getText():null)).put("e2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decl"


    public static class expr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "expr"
    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:24:1: expr : ( ^( PLUS e1= expr e2= expr ) -> dodaj(p1=$e1.stp2=$e2.st)| ^( MINUS e1= expr e2= expr ) -> odejmij(p1=$e1.stp2=$e2.st)| ^( MUL e1= expr e2= expr ) -> pomnoz(p1=$e1.stp2=$e2.st)| ^( DIV e1= expr e2= expr ) -> podziel(p1=$e1.stp2=$e2.st)| ^( IF ^( GRETHAN e1= expr e2= expr ) e3= expr ) -> winksze(e1=$e1.ste2=$e2.ste3=$e3.st)| ^( IF ^( GRETHANEXAN e1= expr e2= expr ) e3= expr ) -> winkszeRowne(e1=$e1.ste2=$e2.ste3=$e3.st)| ^( IF ^( LOWTHAN e1= expr e2= expr ) e3= expr ) -> mnijsze(e1=$e1.ste2=$e2.ste3=$e3.st)| ^( IF ^( LOWEQUTHAN e1= expr e2= expr ) e3= expr ) -> mnijszeRowne(e1=$e1.ste2=$e2.ste3=$e3.st)| ^( IF ^( EXANTHAN e1= expr e2= expr ) e3= expr ) -> rowne(e1=$e1.ste2=$e2.ste3=$e3.st)| INT -> int(i=$INT.text)| ID -> readVar(i=$ID.text));
    public final TExpr3.expr_return expr() throws RecognitionException {
        TExpr3.expr_return retval = new TExpr3.expr_return();
        retval.start = input.LT(1);


        CommonTree INT2=null;
        CommonTree ID3=null;
        TExpr3.expr_return e1 =null;

        TExpr3.expr_return e2 =null;

        TExpr3.expr_return e3 =null;


        try {
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:24:9: ( ^( PLUS e1= expr e2= expr ) -> dodaj(p1=$e1.stp2=$e2.st)| ^( MINUS e1= expr e2= expr ) -> odejmij(p1=$e1.stp2=$e2.st)| ^( MUL e1= expr e2= expr ) -> pomnoz(p1=$e1.stp2=$e2.st)| ^( DIV e1= expr e2= expr ) -> podziel(p1=$e1.stp2=$e2.st)| ^( IF ^( GRETHAN e1= expr e2= expr ) e3= expr ) -> winksze(e1=$e1.ste2=$e2.ste3=$e3.st)| ^( IF ^( GRETHANEXAN e1= expr e2= expr ) e3= expr ) -> winkszeRowne(e1=$e1.ste2=$e2.ste3=$e3.st)| ^( IF ^( LOWTHAN e1= expr e2= expr ) e3= expr ) -> mnijsze(e1=$e1.ste2=$e2.ste3=$e3.st)| ^( IF ^( LOWEQUTHAN e1= expr e2= expr ) e3= expr ) -> mnijszeRowne(e1=$e1.ste2=$e2.ste3=$e3.st)| ^( IF ^( EXANTHAN e1= expr e2= expr ) e3= expr ) -> rowne(e1=$e1.ste2=$e2.ste3=$e3.st)| INT -> int(i=$INT.text)| ID -> readVar(i=$ID.text))
            int alt3=11;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt3=1;
                }
                break;
            case MINUS:
                {
                alt3=2;
                }
                break;
            case MUL:
                {
                alt3=3;
                }
                break;
            case DIV:
                {
                alt3=4;
                }
                break;
            case IF:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case GRETHAN:
                        {
                        alt3=5;
                        }
                        break;
                    case GRETHANEXAN:
                        {
                        alt3=6;
                        }
                        break;
                    case LOWTHAN:
                        {
                        alt3=7;
                        }
                        break;
                    case LOWEQUTHAN:
                        {
                        alt3=8;
                        }
                        break;
                    case EXANTHAN:
                        {
                        alt3=9;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 8, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt3=10;
                }
                break;
            case ID:
                {
                alt3=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:24:11: ^( PLUS e1= expr e2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr237); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr242);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr246);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 24:62: -> dodaj(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("dodaj",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:25:11: ^( MINUS e1= expr e2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr299); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr303);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr307);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 25:62: -> odejmij(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("odejmij",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:26:11: ^( MUL e1= expr e2= expr )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expr360); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr366);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr370);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 26:62: -> pomnoz(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("pomnoz",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:27:11: ^( DIV e1= expr e2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr423); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr429);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr433);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 27:62: -> podziel(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("podziel",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:28:11: ^( IF ^( GRETHAN e1= expr e2= expr ) e3= expr )
                    {
                    match(input,IF,FOLLOW_IF_in_expr486); 

                    match(input, Token.DOWN, null); 
                    match(input,GRETHAN,FOLLOW_GRETHAN_in_expr489); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr493);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr497);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    pushFollow(FOLLOW_expr_in_expr503);
                    e3=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 28:62: -> winksze(e1=$e1.ste2=$e2.ste3=$e3.st)
                    {
                        retval.st = templateLib.getInstanceOf("winksze",new STAttrMap().put("e1", (e1!=null?e1.st:null)).put("e2", (e2!=null?e2.st:null)).put("e3", (e3!=null?e3.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:29:11: ^( IF ^( GRETHANEXAN e1= expr e2= expr ) e3= expr )
                    {
                    match(input,IF,FOLLOW_IF_in_expr543); 

                    match(input, Token.DOWN, null); 
                    match(input,GRETHANEXAN,FOLLOW_GRETHANEXAN_in_expr546); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr550);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr554);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    pushFollow(FOLLOW_expr_in_expr559);
                    e3=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 29:62: -> winkszeRowne(e1=$e1.ste2=$e2.ste3=$e3.st)
                    {
                        retval.st = templateLib.getInstanceOf("winkszeRowne",new STAttrMap().put("e1", (e1!=null?e1.st:null)).put("e2", (e2!=null?e2.st:null)).put("e3", (e3!=null?e3.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:30:11: ^( IF ^( LOWTHAN e1= expr e2= expr ) e3= expr )
                    {
                    match(input,IF,FOLLOW_IF_in_expr596); 

                    match(input, Token.DOWN, null); 
                    match(input,LOWTHAN,FOLLOW_LOWTHAN_in_expr599); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr603);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr607);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    pushFollow(FOLLOW_expr_in_expr612);
                    e3=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 30:62: -> mnijsze(e1=$e1.ste2=$e2.ste3=$e3.st)
                    {
                        retval.st = templateLib.getInstanceOf("mnijsze",new STAttrMap().put("e1", (e1!=null?e1.st:null)).put("e2", (e2!=null?e2.st:null)).put("e3", (e3!=null?e3.st:null)));
                    }



                    }
                    break;
                case 8 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:31:11: ^( IF ^( LOWEQUTHAN e1= expr e2= expr ) e3= expr )
                    {
                    match(input,IF,FOLLOW_IF_in_expr653); 

                    match(input, Token.DOWN, null); 
                    match(input,LOWEQUTHAN,FOLLOW_LOWEQUTHAN_in_expr656); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr660);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr664);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    pushFollow(FOLLOW_expr_in_expr669);
                    e3=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 31:62: -> mnijszeRowne(e1=$e1.ste2=$e2.ste3=$e3.st)
                    {
                        retval.st = templateLib.getInstanceOf("mnijszeRowne",new STAttrMap().put("e1", (e1!=null?e1.st:null)).put("e2", (e2!=null?e2.st:null)).put("e3", (e3!=null?e3.st:null)));
                    }



                    }
                    break;
                case 9 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:32:11: ^( IF ^( EXANTHAN e1= expr e2= expr ) e3= expr )
                    {
                    match(input,IF,FOLLOW_IF_in_expr707); 

                    match(input, Token.DOWN, null); 
                    match(input,EXANTHAN,FOLLOW_EXANTHAN_in_expr710); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr714);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr718);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    pushFollow(FOLLOW_expr_in_expr723);
                    e3=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 32:62: -> rowne(e1=$e1.ste2=$e2.ste3=$e3.st)
                    {
                        retval.st = templateLib.getInstanceOf("rowne",new STAttrMap().put("e1", (e1!=null?e1.st:null)).put("e2", (e2!=null?e2.st:null)).put("e3", (e3!=null?e3.st:null)));
                    }



                    }
                    break;
                case 10 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:33:11: INT
                    {
                    INT2=(CommonTree)match(input,INT,FOLLOW_INT_in_expr762); 

                    // TEMPLATE REWRITE
                    // 33:62: -> int(i=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("int",new STAttrMap().put("i", (INT2!=null?INT2.getText():null)));
                    }



                    }
                    break;
                case 11 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/kompilator/TExpr3.g:34:11: ID
                    {
                    ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_expr830); 

                    // TEMPLATE REWRITE
                    // 34:62: -> readVar(i=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("readVar",new STAttrMap().put("i", (ID3!=null?ID3.getText():null)));
                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_prog61 = new BitSet(new long[]{0x000000000016C712L});
    public static final BitSet FOLLOW_decl_in_prog67 = new BitSet(new long[]{0x000000000016C712L});
    public static final BitSet FOLLOW_VAR_in_decl106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_decl108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PODST_in_decl152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_decl156 = new BitSet(new long[]{0x000000000002C710L});
    public static final BitSet FOLLOW_expr_in_decl162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PODST_in_decl194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_in_decl196 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_decl200 = new BitSet(new long[]{0x000000000002C710L});
    public static final BitSet FOLLOW_expr_in_decl204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr242 = new BitSet(new long[]{0x000000000002C710L});
    public static final BitSet FOLLOW_expr_in_expr246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr303 = new BitSet(new long[]{0x000000000002C710L});
    public static final BitSet FOLLOW_expr_in_expr307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr366 = new BitSet(new long[]{0x000000000002C710L});
    public static final BitSet FOLLOW_expr_in_expr370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr429 = new BitSet(new long[]{0x000000000002C710L});
    public static final BitSet FOLLOW_expr_in_expr433 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_expr486 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GRETHAN_in_expr489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr493 = new BitSet(new long[]{0x000000000002C710L});
    public static final BitSet FOLLOW_expr_in_expr497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_expr503 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_expr543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GRETHANEXAN_in_expr546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr550 = new BitSet(new long[]{0x000000000002C710L});
    public static final BitSet FOLLOW_expr_in_expr554 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_expr559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_expr596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOWTHAN_in_expr599 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr603 = new BitSet(new long[]{0x000000000002C710L});
    public static final BitSet FOLLOW_expr_in_expr607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_expr612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_expr653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOWEQUTHAN_in_expr656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr660 = new BitSet(new long[]{0x000000000002C710L});
    public static final BitSet FOLLOW_expr_in_expr664 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_expr669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_expr707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXANTHAN_in_expr710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr714 = new BitSet(new long[]{0x000000000002C710L});
    public static final BitSet FOLLOW_expr_in_expr718 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_expr723 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr830 = new BitSet(new long[]{0x0000000000000002L});

}