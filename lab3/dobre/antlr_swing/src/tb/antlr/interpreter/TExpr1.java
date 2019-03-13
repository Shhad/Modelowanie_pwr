// $ANTLR 3.4 /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g 2019-03-13 15:28:59

package tb.antlr.interpreter;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TExpr1 extends MyTreeParser {
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
    public String getGrammarFileName() { return "/home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g"; }



    // $ANTLR start "prog"
    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:1: prog : (e= expr )* ;
    public final void prog() throws RecognitionException {
        TExpr1.expr_return e =null;


        try {
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:9: ( (e= expr )* )
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:11: (e= expr )*
            {
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:11: (e= expr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DIV||LA1_0==ID||LA1_0==INT||(LA1_0 >= MINUS && LA1_0 <= MUL)||(LA1_0 >= PLUS && LA1_0 <= PODST)||LA1_0==VAR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:12: e= expr
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
    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:16:1: expr returns [Integer out] : ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | ^( VAR i1= ID ) | ^( PODST VAR i1= ID e2= expr ) | INT | ID );
    public final TExpr1.expr_return expr() throws RecognitionException {
        TExpr1.expr_return retval = new TExpr1.expr_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        CommonTree INT1=null;
        CommonTree ID2=null;
        TExpr1.expr_return e1 =null;

        TExpr1.expr_return e2 =null;


        try {
            // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:17:9: ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | ^( VAR i1= ID ) | ^( PODST VAR i1= ID e2= expr ) | INT | ID )
            int alt2=9;
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
                int LA2_5 = input.LA(2);

                if ( (LA2_5==DOWN) ) {
                    int LA2_9 = input.LA(3);

                    if ( (LA2_9==ID) ) {
                        alt2=5;
                    }
                    else if ( (LA2_9==VAR) ) {
                        alt2=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 9, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;

                }
                }
                break;
            case VAR:
                {
                alt2=6;
                }
                break;
            case INT:
                {
                alt2=8;
                }
                break;
            case ID:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:17:11: ^( PLUS e1= expr e2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr77); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr82);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr86);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     retval.out = sum((e1!=null?e1.out:null), (e2!=null?e2.out:null)); 

                    }
                    break;
                case 2 :
                    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:18:11: ^( MINUS e1= expr e2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr104); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr108);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr112);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     retval.out = difference((e1!=null?e1.out:null), (e2!=null?e2.out:null)); 

                    }
                    break;
                case 3 :
                    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:19:11: ^( MUL e1= expr e2= expr )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expr130); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr136);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr140);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     retval.out = multiply((e1!=null?e1.out:null), (e2!=null?e2.out:null)); 

                    }
                    break;
                case 4 :
                    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:20:11: ^( DIV e1= expr e2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr158); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr164);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr168);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     retval.out = divide((e1!=null?e1.out:null), (e2!=null?e2.out:null)); 

                    }
                    break;
                case 5 :
                    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:21:11: ^( PODST i1= ID e2= expr )
                    {
                    match(input,PODST,FOLLOW_PODST_in_expr186); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr190); 

                    pushFollow(FOLLOW_expr_in_expr196);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     retval.out = podstaw((i1!=null?i1.getText():null), (e2!=null?e2.out:null)); 

                    }
                    break;
                case 6 :
                    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:22:11: ^( VAR i1= ID )
                    {
                    match(input,VAR,FOLLOW_VAR_in_expr214); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr218); 

                    match(input, Token.UP, null); 


                     retval.out = initialize((i1!=null?i1.getText():null)); 

                    }
                    break;
                case 7 :
                    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:23:11: ^( PODST VAR i1= ID e2= expr )
                    {
                    match(input,PODST,FOLLOW_PODST_in_expr251); 

                    match(input, Token.DOWN, null); 
                    match(input,VAR,FOLLOW_VAR_in_expr253); 

                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr257); 

                    pushFollow(FOLLOW_expr_in_expr261);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     retval.out = initialize((i1!=null?i1.getText():null), (e2!=null?e2.out:null)); 

                    }
                    break;
                case 8 :
                    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:24:11: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr276); 

                     retval.out = getInt((INT1!=null?INT1.getText():null)); 

                    }
                    break;
                case 9 :
                    // /home/uml/Pulpit/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:25:11: ID
                    {
                    ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_expr313); 

                     retval.out = getValue((ID2!=null?ID2.getText():null)); 

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


 

    public static final BitSet FOLLOW_expr_in_prog51 = new BitSet(new long[]{0x000000000016C512L});
    public static final BitSet FOLLOW_PLUS_in_expr77 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr82 = new BitSet(new long[]{0x000000000016C510L});
    public static final BitSet FOLLOW_expr_in_expr86 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr104 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr108 = new BitSet(new long[]{0x000000000016C510L});
    public static final BitSet FOLLOW_expr_in_expr112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr136 = new BitSet(new long[]{0x000000000016C510L});
    public static final BitSet FOLLOW_expr_in_expr140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr164 = new BitSet(new long[]{0x000000000016C510L});
    public static final BitSet FOLLOW_expr_in_expr168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PODST_in_expr186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr190 = new BitSet(new long[]{0x000000000016C510L});
    public static final BitSet FOLLOW_expr_in_expr196 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_expr214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PODST_in_expr251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_in_expr253 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_expr257 = new BitSet(new long[]{0x000000000016C510L});
    public static final BitSet FOLLOW_expr_in_expr261 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr313 = new BitSet(new long[]{0x0000000000000002L});

}