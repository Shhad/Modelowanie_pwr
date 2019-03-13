// $ANTLR 3.4 /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g 2019-03-13 15:29:05

package tb.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
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
    public String getGrammarFileName() { return "/home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:16:1: prog : ( stat )+ EOF !;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        ExprParser.stat_return stat1 =null;


        CommonTree EOF2_tree=null;

        try {
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:17:5: ( ( stat )+ EOF !)
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:17:7: ( stat )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:17:7: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= INT)||LA1_0==LP||LA1_0==VAR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:17:8: stat
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
    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:20:1: stat : ( expr NL -> expr | ID PODST expr NL -> ^( PODST ID expr ) | VAR ID NL -> ^( VAR ID ) | VAR ID PODST expr NL -> ^( PODST VAR ID expr ) | IF LP warExpr RP expr NL -> ^( IF warExpr expr ) );
    public final ExprParser.stat_return stat() throws RecognitionException {
        ExprParser.stat_return retval = new ExprParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NL4=null;
        Token ID5=null;
        Token PODST6=null;
        Token NL8=null;
        Token VAR9=null;
        Token ID10=null;
        Token NL11=null;
        Token VAR12=null;
        Token ID13=null;
        Token PODST14=null;
        Token NL16=null;
        Token IF17=null;
        Token LP18=null;
        Token RP20=null;
        Token NL22=null;
        ExprParser.expr_return expr3 =null;

        ExprParser.expr_return expr7 =null;

        ExprParser.expr_return expr15 =null;

        ExprParser.warExpr_return warExpr19 =null;

        ExprParser.expr_return expr21 =null;


        CommonTree NL4_tree=null;
        CommonTree ID5_tree=null;
        CommonTree PODST6_tree=null;
        CommonTree NL8_tree=null;
        CommonTree VAR9_tree=null;
        CommonTree ID10_tree=null;
        CommonTree NL11_tree=null;
        CommonTree VAR12_tree=null;
        CommonTree ID13_tree=null;
        CommonTree PODST14_tree=null;
        CommonTree NL16_tree=null;
        CommonTree IF17_tree=null;
        CommonTree LP18_tree=null;
        CommonTree RP20_tree=null;
        CommonTree NL22_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_PODST=new RewriteRuleTokenStream(adaptor,"token PODST");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_warExpr=new RewriteRuleSubtreeStream(adaptor,"rule warExpr");
        try {
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:21:5: ( expr NL -> expr | ID PODST expr NL -> ^( PODST ID expr ) | VAR ID NL -> ^( VAR ID ) | VAR ID PODST expr NL -> ^( PODST VAR ID expr ) | IF LP warExpr RP expr NL -> ^( IF warExpr expr ) )
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
                    alt2=2;
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
                int LA2_3 = input.LA(2);

                if ( (LA2_3==ID) ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6==NL) ) {
                        alt2=3;
                    }
                    else if ( (LA2_6==PODST) ) {
                        alt2=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }
                }
                break;
            case IF:
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
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:21:7: expr NL
                    {
                    pushFollow(FOLLOW_expr_in_stat68);
                    expr3=expr();

                    state._fsp--;

                    stream_expr.add(expr3.getTree());

                    NL4=(Token)match(input,NL,FOLLOW_NL_in_stat70);  
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
                    // 21:15: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:22:7: ID PODST expr NL
                    {
                    ID5=(Token)match(input,ID,FOLLOW_ID_in_stat82);  
                    stream_ID.add(ID5);


                    PODST6=(Token)match(input,PODST,FOLLOW_PODST_in_stat84);  
                    stream_PODST.add(PODST6);


                    pushFollow(FOLLOW_expr_in_stat86);
                    expr7=expr();

                    state._fsp--;

                    stream_expr.add(expr7.getTree());

                    NL8=(Token)match(input,NL,FOLLOW_NL_in_stat88);  
                    stream_NL.add(NL8);


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
                    // 22:24: -> ^( PODST ID expr )
                    {
                        // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:22:27: ^( PODST ID expr )
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
                case 3 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:23:7: VAR ID NL
                    {
                    VAR9=(Token)match(input,VAR,FOLLOW_VAR_in_stat106);  
                    stream_VAR.add(VAR9);


                    ID10=(Token)match(input,ID,FOLLOW_ID_in_stat108);  
                    stream_ID.add(ID10);


                    NL11=(Token)match(input,NL,FOLLOW_NL_in_stat110);  
                    stream_NL.add(NL11);


                    // AST REWRITE
                    // elements: ID, VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 23:17: -> ^( VAR ID )
                    {
                        // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:23:20: ^( VAR ID )
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
                case 4 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:24:7: VAR ID PODST expr NL
                    {
                    VAR12=(Token)match(input,VAR,FOLLOW_VAR_in_stat126);  
                    stream_VAR.add(VAR12);


                    ID13=(Token)match(input,ID,FOLLOW_ID_in_stat128);  
                    stream_ID.add(ID13);


                    PODST14=(Token)match(input,PODST,FOLLOW_PODST_in_stat130);  
                    stream_PODST.add(PODST14);


                    pushFollow(FOLLOW_expr_in_stat132);
                    expr15=expr();

                    state._fsp--;

                    stream_expr.add(expr15.getTree());

                    NL16=(Token)match(input,NL,FOLLOW_NL_in_stat134);  
                    stream_NL.add(NL16);


                    // AST REWRITE
                    // elements: PODST, ID, VAR, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 24:28: -> ^( PODST VAR ID expr )
                    {
                        // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:24:31: ^( PODST VAR ID expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_PODST.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VAR.nextNode()
                        );

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
                case 5 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:25:7: IF LP warExpr RP expr NL
                    {
                    IF17=(Token)match(input,IF,FOLLOW_IF_in_stat155);  
                    stream_IF.add(IF17);


                    LP18=(Token)match(input,LP,FOLLOW_LP_in_stat157);  
                    stream_LP.add(LP18);


                    pushFollow(FOLLOW_warExpr_in_stat159);
                    warExpr19=warExpr();

                    state._fsp--;

                    stream_warExpr.add(warExpr19.getTree());

                    RP20=(Token)match(input,RP,FOLLOW_RP_in_stat161);  
                    stream_RP.add(RP20);


                    pushFollow(FOLLOW_expr_in_stat163);
                    expr21=expr();

                    state._fsp--;

                    stream_expr.add(expr21.getTree());

                    NL22=(Token)match(input,NL,FOLLOW_NL_in_stat165);  
                    stream_NL.add(NL22);


                    // AST REWRITE
                    // elements: warExpr, IF, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 25:32: -> ^( IF warExpr expr )
                    {
                        // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:25:35: ^( IF warExpr expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_warExpr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

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
    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:28:1: expr : multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS24=null;
        Token MINUS26=null;
        ExprParser.multExpr_return multExpr23 =null;

        ExprParser.multExpr_return multExpr25 =null;

        ExprParser.multExpr_return multExpr27 =null;


        CommonTree PLUS24_tree=null;
        CommonTree MINUS26_tree=null;

        try {
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:29:5: ( multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* )
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:29:7: multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_expr192);
            multExpr23=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr23.getTree());

            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:30:7: ( PLUS ^ multExpr | MINUS ^ multExpr )*
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
            	    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:30:9: PLUS ^ multExpr
            	    {
            	    PLUS24=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr202); 
            	    PLUS24_tree = 
            	    (CommonTree)adaptor.create(PLUS24)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(PLUS24_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr205);
            	    multExpr25=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr25.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:31:9: MINUS ^ multExpr
            	    {
            	    MINUS26=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr215); 
            	    MINUS26_tree = 
            	    (CommonTree)adaptor.create(MINUS26)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS26_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr218);
            	    multExpr27=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr27.getTree());

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
    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:35:1: multExpr : atom ( MUL ^ atom | DIV ^ atom )* ;
    public final ExprParser.multExpr_return multExpr() throws RecognitionException {
        ExprParser.multExpr_return retval = new ExprParser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MUL29=null;
        Token DIV31=null;
        ExprParser.atom_return atom28 =null;

        ExprParser.atom_return atom30 =null;

        ExprParser.atom_return atom32 =null;


        CommonTree MUL29_tree=null;
        CommonTree DIV31_tree=null;

        try {
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:36:5: ( atom ( MUL ^ atom | DIV ^ atom )* )
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:36:7: atom ( MUL ^ atom | DIV ^ atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_multExpr244);
            atom28=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom28.getTree());

            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:37:7: ( MUL ^ atom | DIV ^ atom )*
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
            	    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:37:9: MUL ^ atom
            	    {
            	    MUL29=(Token)match(input,MUL,FOLLOW_MUL_in_multExpr254); 
            	    MUL29_tree = 
            	    (CommonTree)adaptor.create(MUL29)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MUL29_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_multExpr257);
            	    atom30=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom30.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:38:9: DIV ^ atom
            	    {
            	    DIV31=(Token)match(input,DIV,FOLLOW_DIV_in_multExpr267); 
            	    DIV31_tree = 
            	    (CommonTree)adaptor.create(DIV31)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(DIV31_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_multExpr270);
            	    atom32=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom32.getTree());

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
    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:42:1: atom : ( INT | ID | LP ! expr RP !);
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT33=null;
        Token ID34=null;
        Token LP35=null;
        Token RP37=null;
        ExprParser.expr_return expr36 =null;


        CommonTree INT33_tree=null;
        CommonTree ID34_tree=null;
        CommonTree LP35_tree=null;
        CommonTree RP37_tree=null;

        try {
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:43:5: ( INT | ID | LP ! expr RP !)
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
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:43:7: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT33=(Token)match(input,INT,FOLLOW_INT_in_atom296); 
                    INT33_tree = 
                    (CommonTree)adaptor.create(INT33)
                    ;
                    adaptor.addChild(root_0, INT33_tree);


                    }
                    break;
                case 2 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:44:7: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID34=(Token)match(input,ID,FOLLOW_ID_in_atom304); 
                    ID34_tree = 
                    (CommonTree)adaptor.create(ID34)
                    ;
                    adaptor.addChild(root_0, ID34_tree);


                    }
                    break;
                case 3 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:45:7: LP ! expr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LP35=(Token)match(input,LP,FOLLOW_LP_in_atom312); 

                    pushFollow(FOLLOW_expr_in_atom315);
                    expr36=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr36.getTree());

                    RP37=(Token)match(input,RP,FOLLOW_RP_in_atom317); 

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


    public static class warExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "warExpr"
    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:48:1: warExpr : expr ( GRETHAN ^ expr | LOWTHAN ^ expr | LOWEQUTHAN ^ expr | GRETHANEXAN ^ expr | EXANTHAN ^ expr ) ;
    public final ExprParser.warExpr_return warExpr() throws RecognitionException {
        ExprParser.warExpr_return retval = new ExprParser.warExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GRETHAN39=null;
        Token LOWTHAN41=null;
        Token LOWEQUTHAN43=null;
        Token GRETHANEXAN45=null;
        Token EXANTHAN47=null;
        ExprParser.expr_return expr38 =null;

        ExprParser.expr_return expr40 =null;

        ExprParser.expr_return expr42 =null;

        ExprParser.expr_return expr44 =null;

        ExprParser.expr_return expr46 =null;

        ExprParser.expr_return expr48 =null;


        CommonTree GRETHAN39_tree=null;
        CommonTree LOWTHAN41_tree=null;
        CommonTree LOWEQUTHAN43_tree=null;
        CommonTree GRETHANEXAN45_tree=null;
        CommonTree EXANTHAN47_tree=null;

        try {
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:49:5: ( expr ( GRETHAN ^ expr | LOWTHAN ^ expr | LOWEQUTHAN ^ expr | GRETHANEXAN ^ expr | EXANTHAN ^ expr ) )
            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:49:7: expr ( GRETHAN ^ expr | LOWTHAN ^ expr | LOWEQUTHAN ^ expr | GRETHANEXAN ^ expr | EXANTHAN ^ expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_warExpr339);
            expr38=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr38.getTree());

            // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:49:12: ( GRETHAN ^ expr | LOWTHAN ^ expr | LOWEQUTHAN ^ expr | GRETHANEXAN ^ expr | EXANTHAN ^ expr )
            int alt6=5;
            switch ( input.LA(1) ) {
            case GRETHAN:
                {
                alt6=1;
                }
                break;
            case LOWTHAN:
                {
                alt6=2;
                }
                break;
            case LOWEQUTHAN:
                {
                alt6=3;
                }
                break;
            case GRETHANEXAN:
                {
                alt6=4;
                }
                break;
            case EXANTHAN:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:50:8: GRETHAN ^ expr
                    {
                    GRETHAN39=(Token)match(input,GRETHAN,FOLLOW_GRETHAN_in_warExpr350); 
                    GRETHAN39_tree = 
                    (CommonTree)adaptor.create(GRETHAN39)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GRETHAN39_tree, root_0);


                    pushFollow(FOLLOW_expr_in_warExpr354);
                    expr40=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr40.getTree());

                    }
                    break;
                case 2 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:51:8: LOWTHAN ^ expr
                    {
                    LOWTHAN41=(Token)match(input,LOWTHAN,FOLLOW_LOWTHAN_in_warExpr363); 
                    LOWTHAN41_tree = 
                    (CommonTree)adaptor.create(LOWTHAN41)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LOWTHAN41_tree, root_0);


                    pushFollow(FOLLOW_expr_in_warExpr367);
                    expr42=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr42.getTree());

                    }
                    break;
                case 3 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:52:8: LOWEQUTHAN ^ expr
                    {
                    LOWEQUTHAN43=(Token)match(input,LOWEQUTHAN,FOLLOW_LOWEQUTHAN_in_warExpr376); 
                    LOWEQUTHAN43_tree = 
                    (CommonTree)adaptor.create(LOWEQUTHAN43)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LOWEQUTHAN43_tree, root_0);


                    pushFollow(FOLLOW_expr_in_warExpr379);
                    expr44=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr44.getTree());

                    }
                    break;
                case 4 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:53:8: GRETHANEXAN ^ expr
                    {
                    GRETHANEXAN45=(Token)match(input,GRETHANEXAN,FOLLOW_GRETHANEXAN_in_warExpr388); 
                    GRETHANEXAN45_tree = 
                    (CommonTree)adaptor.create(GRETHANEXAN45)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GRETHANEXAN45_tree, root_0);


                    pushFollow(FOLLOW_expr_in_warExpr391);
                    expr46=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr46.getTree());

                    }
                    break;
                case 5 :
                    // /home/uml/Pulpit/antlr_swing/bin/tb/antlr/Expr.g:54:8: EXANTHAN ^ expr
                    {
                    EXANTHAN47=(Token)match(input,EXANTHAN,FOLLOW_EXANTHAN_in_warExpr400); 
                    EXANTHAN47_tree = 
                    (CommonTree)adaptor.create(EXANTHAN47)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EXANTHAN47_tree, root_0);


                    pushFollow(FOLLOW_expr_in_warExpr403);
                    expr48=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr48.getTree());

                    }
                    break;

            }


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
    // $ANTLR end "warExpr"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog49 = new BitSet(new long[]{0x0000000000102700L});
    public static final BitSet FOLLOW_EOF_in_prog54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat68 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_stat70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat82 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PODST_in_stat84 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_expr_in_stat86 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_stat88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_stat106 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_stat108 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_stat110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_stat126 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_stat128 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PODST_in_stat130 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_expr_in_stat132 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_stat134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_stat155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LP_in_stat157 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_warExpr_in_stat159 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RP_in_stat161 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_expr_in_stat163 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NL_in_stat165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr192 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_PLUS_in_expr202 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_multExpr_in_expr205 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_MINUS_in_expr215 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_multExpr_in_expr218 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_atom_in_multExpr244 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_MUL_in_multExpr254 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_atom_in_multExpr257 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_DIV_in_multExpr267 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_atom_in_multExpr270 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_INT_in_atom296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom312 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_expr_in_atom315 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RP_in_atom317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_warExpr339 = new BitSet(new long[]{0x00000000000018E0L});
    public static final BitSet FOLLOW_GRETHAN_in_warExpr350 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_expr_in_warExpr354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWTHAN_in_warExpr363 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_expr_in_warExpr367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWEQUTHAN_in_warExpr376 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_expr_in_warExpr379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRETHANEXAN_in_warExpr388 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_expr_in_warExpr391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXANTHAN_in_warExpr400 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_expr_in_warExpr403 = new BitSet(new long[]{0x0000000000000002L});

}