// $ANTLR 3.4 /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g 2019-03-13 15:39:54

package tb.antlr.interpreter;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TExpr1 extends MyTreeParser {
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
    public MyTreeParser[] getDelegates() {
        return new MyTreeParser[] {};
    }

    // delegators


    public TExpr1(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TExpr1(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TExpr1.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g"; }



    // $ANTLR start "prog"
    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:1: prog : (e= expr )* ;
    public final void prog() throws RecognitionException {
        TExpr1.expr_return e =null;


        try {
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:9: ( (e= expr )* )
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:11: (e= expr )*
            {
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:11: (e= expr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DIV||LA1_0==INT||(LA1_0 >= MINUS && LA1_0 <= MUL)||(LA1_0 >= PLUS && LA1_0 <= PODST)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:12: e= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_prog51);
            	    e=expr();

            	    state._fsp--;


            	    drukuj ((e!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e.start),input.getTreeAdaptor().getTokenStopIndex(e.start))):null) + " = " + (e!=null?e.out:null).toString());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"


    public static class expr_return extends TreeRuleReturnScope {
        public Integer out;
    };


    // $ANTLR start "expr"
    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:16:1: expr returns [Integer out] : ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | INT );
    public final TExpr1.expr_return expr() throws RecognitionException {
        TExpr1.expr_return retval = new TExpr1.expr_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        CommonTree INT1=null;
        TExpr1.expr_return e1 =null;

        TExpr1.expr_return e2 =null;


        try {
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:17:8: ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | INT )
            int alt2=6;
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
            case INT:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:17:10: ^( PLUS e1= expr e2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr76); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr81);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr85);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.out = (e1!=null?e1.out:null) + (e2!=null?e2.out:null);

                    }
                    break;
                case 2 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:18:11: ^( MINUS e1= expr e2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr101); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr105);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr109);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.out = (e1!=null?e1.out:null) - (e2!=null?e2.out:null);

                    }
                    break;
                case 3 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:19:11: ^( MUL e1= expr e2= expr )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expr125); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr131);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr135);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.out = (e1!=null?e1.out:null) * (e2!=null?e2.out:null);

                    }
                    break;
                case 4 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:20:11: ^( DIV e1= expr e2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr151); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr157);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr161);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.out = (e1!=null?e1.out:null) / (e2!=null?e2.out:null);

                    }
                    break;
                case 5 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:21:11: ^( PODST i1= ID e2= expr )
                    {
                    match(input,PODST,FOLLOW_PODST_in_expr177); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr181); 

                    pushFollow(FOLLOW_expr_in_expr187);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 6 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:22:11: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr200); 

                    retval.out = getInt((INT1!=null?INT1.getText():null));

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


 

    public static final BitSet FOLLOW_expr_in_prog51 = new BitSet(new long[]{0x0000000000003652L});
    public static final BitSet FOLLOW_PLUS_in_expr76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr81 = new BitSet(new long[]{0x0000000000003650L});
    public static final BitSet FOLLOW_expr_in_expr85 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr105 = new BitSet(new long[]{0x0000000000003650L});
    public static final BitSet FOLLOW_expr_in_expr109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr131 = new BitSet(new long[]{0x0000000000003650L});
    public static final BitSet FOLLOW_expr_in_expr135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr157 = new BitSet(new long[]{0x0000000000003650L});
    public static final BitSet FOLLOW_expr_in_expr161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PODST_in_expr177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr181 = new BitSet(new long[]{0x0000000000003650L});
    public static final BitSet FOLLOW_expr_in_expr187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr200 = new BitSet(new long[]{0x0000000000000002L});

}