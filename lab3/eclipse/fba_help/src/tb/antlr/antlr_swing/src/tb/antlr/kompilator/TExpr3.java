// $ANTLR 3.4 /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g 2019-03-13 15:39:55

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIV", "ID", "INT", "LOOP", "LP", "MINUS", "MUL", "NL", "PLUS", "PODST", "RP", "VAR", "WS"
    };

    public static final int EOF=-1;
    public static final int DIV=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int LOOP=7;
    public static final int LP=8;
    public static final int MINUS=9;
    public static final int MUL=10;
    public static final int NL=11;
    public static final int PLUS=12;
    public static final int PODST=13;
    public static final int RP=14;
    public static final int VAR=15;
    public static final int WS=16;

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
    public String getGrammarFileName() { return "/home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g"; }


      Integer numer = 0;


    public static class prog_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prog"
    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:19:1: prog : (e+= expr |d+= decl )* -> template(name=$edeklaracje=$d) \"<deklaracje> start: <name;separator=\" \\n\"> \";
    public final TExpr3.prog_return prog() throws RecognitionException {
        TExpr3.prog_return retval = new TExpr3.prog_return();
        retval.start = input.LT(1);


        List list_e=null;
        List list_d=null;
        RuleReturnScope e = null;
        RuleReturnScope d = null;
        try {
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:19:9: ( (e+= expr |d+= decl )* -> template(name=$edeklaracje=$d) \"<deklaracje> start: <name;separator=\" \\n\"> \")
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:19:11: (e+= expr |d+= decl )*
            {
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:19:11: (e+= expr |d+= decl )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DIV||(LA1_0 >= INT && LA1_0 <= LOOP)||(LA1_0 >= MINUS && LA1_0 <= MUL)||(LA1_0 >= PLUS && LA1_0 <= PODST)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==VAR) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:19:12: e+= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_prog66);
            	    e=expr();

            	    state._fsp--;

            	    if (list_e==null) list_e=new ArrayList();
            	    list_e.add(e.getTemplate());


            	    }
            	    break;
            	case 2 :
            	    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:19:22: d+= decl
            	    {
            	    pushFollow(FOLLOW_decl_in_prog72);
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
            // 19:32: -> template(name=$edeklaracje=$d) \"<deklaracje> start: <name;separator=\" \\n\"> \"
            {
                retval.st = new StringTemplate(templateLib, "<deklaracje> start: <name;separator=\" \\n\"> ",new STAttrMap().put("name", list_e).put("deklaracje", list_d));
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
    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:21:1: decl : ^( VAR i1= ID ) -> dek(n=$ID.text);
    public final TExpr3.decl_return decl() throws RecognitionException {
        TExpr3.decl_return retval = new TExpr3.decl_return();
        retval.start = input.LT(1);


        CommonTree i1=null;

        try {
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:21:7: ( ^( VAR i1= ID ) -> dek(n=$ID.text))
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:22:9: ^( VAR i1= ID )
            {
            match(input,VAR,FOLLOW_VAR_in_decl107); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,ID,FOLLOW_ID_in_decl111); 

            match(input, Token.UP, null); 


            globals.newSymbol((i1!=null?i1.getText():null));

            // TEMPLATE REWRITE
            // 22:53: -> dek(n=$ID.text)
            {
                retval.st = templateLib.getInstanceOf("dek",new STAttrMap().put("n", (i1!=null?i1.getText():null)));
            }



            }

        }
        catch (RuntimeException ex) {
            errorID(ex,i1);
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
    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:26:1: expr : ( ^( PLUS e1= expr e2= expr ) -> dodaj(p1=$e1.stp2=$e2.st)| ^( MINUS e1= expr e2= expr ) -> odejmij(p1=$e1.stp2=$e2.st)| ^( MUL e1= expr e2= expr ) -> pomnoz(p1=$e1.stp2=$e2.st)| ^( DIV e1= expr e2= expr ) -> podziel(p1=$e1.stp2=$e2.st)| ^( PODST i1= ID e2= expr ) -> podst(p1=$e1.stp2=$e2.st)| ^( LOOP e1= expr e2= expr ) -> while(p1=$e1.stp2=$e2.st)| INT -> int(i=$INT.textj=numer.toString()));
    public final TExpr3.expr_return expr() throws RecognitionException {
        TExpr3.expr_return retval = new TExpr3.expr_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        CommonTree INT1=null;
        TExpr3.expr_return e1 =null;

        TExpr3.expr_return e2 =null;


        try {
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:26:9: ( ^( PLUS e1= expr e2= expr ) -> dodaj(p1=$e1.stp2=$e2.st)| ^( MINUS e1= expr e2= expr ) -> odejmij(p1=$e1.stp2=$e2.st)| ^( MUL e1= expr e2= expr ) -> pomnoz(p1=$e1.stp2=$e2.st)| ^( DIV e1= expr e2= expr ) -> podziel(p1=$e1.stp2=$e2.st)| ^( PODST i1= ID e2= expr ) -> podst(p1=$e1.stp2=$e2.st)| ^( LOOP e1= expr e2= expr ) -> while(p1=$e1.stp2=$e2.st)| INT -> int(i=$INT.textj=numer.toString()))
            int alt2=7;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt2=1;
                }
                break;
            case MINUS:
                {
                alt2=2;
                }
                break;
            case MUL:
                {
                alt2=3;
                }
                break;
            case DIV:
                {
                alt2=4;
                }
                break;
            case PODST:
                {
                alt2=5;
                }
                break;
            case LOOP:
                {
                alt2=6;
                }
                break;
            case INT:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:26:11: ^( PLUS e1= expr e2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr150); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr155);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr159);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 26:36: -> dodaj(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("dodaj",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:27:11: ^( MINUS e1= expr e2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr186); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr190);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr194);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 27:36: -> odejmij(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("odejmij",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:28:11: ^( MUL e1= expr e2= expr )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expr221); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr227);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr231);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 28:36: -> pomnoz(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("pomnoz",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:29:11: ^( DIV e1= expr e2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr258); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr264);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr268);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 29:36: -> podziel(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("podziel",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:30:11: ^( PODST i1= ID e2= expr )
                    {
                    match(input,PODST,FOLLOW_PODST_in_expr295); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr299); 

                    pushFollow(FOLLOW_expr_in_expr305);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 30:36: -> podst(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("podst",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:31:11: ^( LOOP e1= expr e2= expr )
                    {
                    match(input,LOOP,FOLLOW_LOOP_in_expr331); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr336);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr340);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 31:36: -> while(p1=$e1.stp2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("while",new STAttrMap().put("p1", (e1!=null?e1.st:null)).put("p2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/kompilator/TExpr3.g:32:11: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr367); 

                    numer++;

                    // TEMPLATE REWRITE
                    // 32:36: -> int(i=$INT.textj=numer.toString())
                    {
                        retval.st = templateLib.getInstanceOf("int",new STAttrMap().put("i", (INT1!=null?INT1.getText():null)).put("j", numer.toString()));
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


 

    public static final BitSet FOLLOW_expr_in_prog66 = new BitSet(new long[]{0x000000000000B6D2L});
    public static final BitSet FOLLOW_decl_in_prog72 = new BitSet(new long[]{0x000000000000B6D2L});
    public static final BitSet FOLLOW_VAR_in_decl107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_decl111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr155 = new BitSet(new long[]{0x00000000000036D0L});
    public static final BitSet FOLLOW_expr_in_expr159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr190 = new BitSet(new long[]{0x00000000000036D0L});
    public static final BitSet FOLLOW_expr_in_expr194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr227 = new BitSet(new long[]{0x00000000000036D0L});
    public static final BitSet FOLLOW_expr_in_expr231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr264 = new BitSet(new long[]{0x00000000000036D0L});
    public static final BitSet FOLLOW_expr_in_expr268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PODST_in_expr295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr299 = new BitSet(new long[]{0x00000000000036D0L});
    public static final BitSet FOLLOW_expr_in_expr305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOP_in_expr331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr336 = new BitSet(new long[]{0x00000000000036D0L});
    public static final BitSet FOLLOW_expr_in_expr340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr367 = new BitSet(new long[]{0x0000000000000002L});

}