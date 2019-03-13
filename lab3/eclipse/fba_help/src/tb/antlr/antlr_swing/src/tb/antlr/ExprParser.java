// $ANTLR 3.4 /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g 2019-03-13 15:42:07

package tb.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:16:1: prog : ( stat )+ EOF !;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        ExprParser.stat_return stat1 =null;


        CommonTree EOF2_tree=null;

        try {
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:17:5: ( ( stat )+ EOF !)
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:17:7: ( stat )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:17:7: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= LP)||LA1_0==NL||LA1_0==VAR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:17:8: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog49);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog54); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:19:1: stat : ( expr NL -> expr | VAR ID NL -> ^( VAR ID ) | ID PODST expr NL -> ^( PODST ID expr ) | LOOP LP expr RP expr NL -> ^( LOOP expr expr ) | NL ->);
    public final ExprParser.stat_return stat() throws RecognitionException {
        ExprParser.stat_return retval = new ExprParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NL4=null;
        Token VAR5=null;
        Token ID6=null;
        Token NL7=null;
        Token ID8=null;
        Token PODST9=null;
        Token NL11=null;
        Token LOOP12=null;
        Token LP13=null;
        Token RP15=null;
        Token NL17=null;
        Token NL18=null;
        ExprParser.expr_return expr3 =null;

        ExprParser.expr_return expr10 =null;

        ExprParser.expr_return expr14 =null;

        ExprParser.expr_return expr16 =null;


        CommonTree NL4_tree=null;
        CommonTree VAR5_tree=null;
        CommonTree ID6_tree=null;
        CommonTree NL7_tree=null;
        CommonTree ID8_tree=null;
        CommonTree PODST9_tree=null;
        CommonTree NL11_tree=null;
        CommonTree LOOP12_tree=null;
        CommonTree LP13_tree=null;
        CommonTree RP15_tree=null;
        CommonTree NL17_tree=null;
        CommonTree NL18_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_LOOP=new RewriteRuleTokenStream(adaptor,"token LOOP");
        RewriteRuleTokenStream stream_PODST=new RewriteRuleTokenStream(adaptor,"token PODST");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:20:5: ( expr NL -> expr | VAR ID NL -> ^( VAR ID ) | ID PODST expr NL -> ^( PODST ID expr ) | LOOP LP expr RP expr NL -> ^( LOOP expr expr ) | NL ->)
            int alt2=5;
            switch ( input.LA(1) ) {
            case INT:
            case LP:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==PODST) ) {
                    alt2=3;
                }
                else if ( (LA2_2==DIV||(LA2_2 >= MINUS && LA2_2 <= PLUS)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case VAR:
                {
                alt2=2;
                }
                break;
            case LOOP:
                {
                alt2=4;
                }
                break;
            case NL:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:20:7: expr NL
                    {
                    pushFollow(FOLLOW_expr_in_stat67);
                    expr3=expr();

                    state._fsp--;

                    stream_expr.add(expr3.getTree());

                    NL4=(Token)match(input,NL,FOLLOW_NL_in_stat69);  
                    stream_NL.add(NL4);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 20:15: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:24:7: VAR ID NL
                    {
                    VAR5=(Token)match(input,VAR,FOLLOW_VAR_in_stat89);  
                    stream_VAR.add(VAR5);


                    ID6=(Token)match(input,ID,FOLLOW_ID_in_stat91);  
                    stream_ID.add(ID6);


                    NL7=(Token)match(input,NL,FOLLOW_NL_in_stat93);  
                    stream_NL.add(NL7);


                    // AST REWRITE
                    // elements: VAR, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 24:17: -> ^( VAR ID )
                    {
                        // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:24:20: ^( VAR ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_VAR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:25:7: ID PODST expr NL
                    {
                    ID8=(Token)match(input,ID,FOLLOW_ID_in_stat109);  
                    stream_ID.add(ID8);


                    PODST9=(Token)match(input,PODST,FOLLOW_PODST_in_stat111);  
                    stream_PODST.add(PODST9);


                    pushFollow(FOLLOW_expr_in_stat113);
                    expr10=expr();

                    state._fsp--;

                    stream_expr.add(expr10.getTree());

                    NL11=(Token)match(input,NL,FOLLOW_NL_in_stat115);  
                    stream_NL.add(NL11);


                    // AST REWRITE
                    // elements: PODST, ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 25:24: -> ^( PODST ID expr )
                    {
                        // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:25:27: ^( PODST ID expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_PODST.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:26:7: LOOP LP expr RP expr NL
                    {
                    LOOP12=(Token)match(input,LOOP,FOLLOW_LOOP_in_stat133);  
                    stream_LOOP.add(LOOP12);


                    LP13=(Token)match(input,LP,FOLLOW_LP_in_stat135);  
                    stream_LP.add(LP13);


                    pushFollow(FOLLOW_expr_in_stat137);
                    expr14=expr();

                    state._fsp--;

                    stream_expr.add(expr14.getTree());

                    RP15=(Token)match(input,RP,FOLLOW_RP_in_stat139);  
                    stream_RP.add(RP15);


                    pushFollow(FOLLOW_expr_in_stat141);
                    expr16=expr();

                    state._fsp--;

                    stream_expr.add(expr16.getTree());

                    NL17=(Token)match(input,NL,FOLLOW_NL_in_stat143);  
                    stream_NL.add(NL17);


                    // AST REWRITE
                    // elements: LOOP, expr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 26:31: -> ^( LOOP expr expr )
                    {
                        // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:26:34: ^( LOOP expr expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_LOOP.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:27:7: NL
                    {
                    NL18=(Token)match(input,NL,FOLLOW_NL_in_stat161);  
                    stream_NL.add(NL18);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 27:10: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:31:1: expr : multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS20=null;
        Token MINUS22=null;
        ExprParser.multExpr_return multExpr19 =null;

        ExprParser.multExpr_return multExpr21 =null;

        ExprParser.multExpr_return multExpr23 =null;


        CommonTree PLUS20_tree=null;
        CommonTree MINUS22_tree=null;

        try {
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:32:5: ( multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* )
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:32:7: multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_expr181);
            multExpr19=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr19.getTree());

            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:33:7: ( PLUS ^ multExpr | MINUS ^ multExpr )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PLUS) ) {
                    alt3=1;
                }
                else if ( (LA3_0==MINUS) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:33:9: PLUS ^ multExpr
            	    {
            	    PLUS20=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr191); 
            	    PLUS20_tree = 
            	    (CommonTree)adaptor.create(PLUS20)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(PLUS20_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr194);
            	    multExpr21=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr21.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:34:9: MINUS ^ multExpr
            	    {
            	    MINUS22=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr204); 
            	    MINUS22_tree = 
            	    (CommonTree)adaptor.create(MINUS22)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS22_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr207);
            	    multExpr23=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr23.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:38:1: multExpr : atom ( MUL ^ atom | DIV ^ atom )* ;
    public final ExprParser.multExpr_return multExpr() throws RecognitionException {
        ExprParser.multExpr_return retval = new ExprParser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MUL25=null;
        Token DIV27=null;
        ExprParser.atom_return atom24 =null;

        ExprParser.atom_return atom26 =null;

        ExprParser.atom_return atom28 =null;


        CommonTree MUL25_tree=null;
        CommonTree DIV27_tree=null;

        try {
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:39:5: ( atom ( MUL ^ atom | DIV ^ atom )* )
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:39:7: atom ( MUL ^ atom | DIV ^ atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_multExpr237);
            atom24=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom24.getTree());

            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:40:7: ( MUL ^ atom | DIV ^ atom )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==MUL) ) {
                    alt4=1;
                }
                else if ( (LA4_0==DIV) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:40:9: MUL ^ atom
            	    {
            	    MUL25=(Token)match(input,MUL,FOLLOW_MUL_in_multExpr247); 
            	    MUL25_tree = 
            	    (CommonTree)adaptor.create(MUL25)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MUL25_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_multExpr250);
            	    atom26=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom26.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:41:9: DIV ^ atom
            	    {
            	    DIV27=(Token)match(input,DIV,FOLLOW_DIV_in_multExpr260); 
            	    DIV27_tree = 
            	    (CommonTree)adaptor.create(DIV27)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(DIV27_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_multExpr263);
            	    atom28=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom28.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:45:1: atom : ( INT | ID | LP ! expr RP !);
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT29=null;
        Token ID30=null;
        Token LP31=null;
        Token RP33=null;
        ExprParser.expr_return expr32 =null;


        CommonTree INT29_tree=null;
        CommonTree ID30_tree=null;
        CommonTree LP31_tree=null;
        CommonTree RP33_tree=null;

        try {
            // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:46:5: ( INT | ID | LP ! expr RP !)
            int alt5=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                alt5=2;
                }
                break;
            case LP:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:46:7: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT29=(Token)match(input,INT,FOLLOW_INT_in_atom289); 
                    INT29_tree = 
                    (CommonTree)adaptor.create(INT29)
                    ;
                    adaptor.addChild(root_0, INT29_tree);


                    }
                    break;
                case 2 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:47:7: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID30=(Token)match(input,ID,FOLLOW_ID_in_atom297); 
                    ID30_tree = 
                    (CommonTree)adaptor.create(ID30)
                    ;
                    adaptor.addChild(root_0, ID30_tree);


                    }
                    break;
                case 3 :
                    // /home/uml/git/antlr_swingfba/antlr_swing/src/tb/antlr/antlr_swing/src/tb/antlr/Expr.g:48:7: LP ! expr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LP31=(Token)match(input,LP,FOLLOW_LP_in_atom305); 

                    pushFollow(FOLLOW_expr_in_atom308);
                    expr32=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr32.getTree());

                    RP33=(Token)match(input,RP,FOLLOW_RP_in_atom310); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog49 = new BitSet(new long[]{0x00000000000089E0L});
    public static final BitSet FOLLOW_EOF_in_prog54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat67 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_stat69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_stat89 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_stat91 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_stat93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat109 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PODST_in_stat111 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_expr_in_stat113 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_stat115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_stat133 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LP_in_stat135 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_expr_in_stat137 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RP_in_stat139 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_expr_in_stat141 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NL_in_stat143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_stat161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr181 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_PLUS_in_expr191 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_multExpr_in_expr194 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_MINUS_in_expr204 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_multExpr_in_expr207 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_atom_in_multExpr237 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_MUL_in_multExpr247 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_atom_in_multExpr250 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_DIV_in_multExpr260 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_atom_in_multExpr263 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_INT_in_atom289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom305 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_expr_in_atom308 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RP_in_atom310 = new BitSet(new long[]{0x0000000000000002L});

}