// $ANTLR 3.2 Sep 23, 2009 12:02:23 src/grammar/TLTreeWalker.g 2014-02-25 19:58:35

  package tl.parser;
  import tl.*;
  import tl.tree.*;
  import tl.tree.functions.*;
  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TLTreeWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "RETURN", "STATEMENTS", "ASSIGNMENT", "FUNC_CALL", "EXP", "EXP_LIST", "ID_LIST", "IF", "TERNARY", "UNARY_MIN", "NEGATE", "FUNCTION", "INDEXES", "LIST", "LOOKUP", "Return", "Identifier", "Println", "Print", "Assert", "Size", "Move", "End", "If", "Do", "Else", "Def", "For", "To", "While", "In", "Number", "Bool", "Null", "String", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Int", "Digit", "Comment", "Space"
    };
    public static final int FUNCTION=16;
    public static final int End=27;
    public static final int LT=49;
    public static final int OParen=59;
    public static final int Assert=24;
    public static final int TERNARY=13;
    public static final int EXP_LIST=10;
    public static final int While=34;
    public static final int ID_LIST=11;
    public static final int Add=50;
    public static final int QMark=64;
    public static final int EOF=-1;
    public static final int Identifier=21;
    public static final int Int=66;
    public static final int FUNC_CALL=8;
    public static final int IF=12;
    public static final int Space=69;
    public static final int Size=25;
    public static final int Assign=62;
    public static final int CParen=60;
    public static final int Number=36;
    public static final int To=33;
    public static final int Comment=68;
    public static final int EXP=9;
    public static final int GTEquals=44;
    public static final int Print=23;
    public static final int CBrace=56;
    public static final int RETURN=5;
    public static final int Do=29;
    public static final int String=39;
    public static final int Or=40;
    public static final int Return=20;
    public static final int Move=26;
    public static final int If=28;
    public static final int Null=38;
    public static final int And=41;
    public static final int CBracket=58;
    public static final int Println=22;
    public static final int In=35;
    public static final int Bool=37;
    public static final int NEquals=43;
    public static final int Subtract=51;
    public static final int Modulus=54;
    public static final int Multiply=52;
    public static final int OBrace=55;
    public static final int NEGATE=15;
    public static final int INDEXES=17;
    public static final int Colon=65;
    public static final int Excl=47;
    public static final int Digit=67;
    public static final int LIST=18;
    public static final int For=32;
    public static final int Divide=53;
    public static final int Def=31;
    public static final int SColon=61;
    public static final int LOOKUP=19;
    public static final int OBracket=57;
    public static final int BLOCK=4;
    public static final int STATEMENTS=6;
    public static final int GT=48;
    public static final int UNARY_MIN=14;
    public static final int ASSIGNMENT=7;
    public static final int Else=30;
    public static final int Equals=42;
    public static final int Comma=63;
    public static final int Pow=46;
    public static final int LTEquals=45;

    // delegates
    // delegators


        public TLTreeWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public TLTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TLTreeWalker.tokenNames; }
    public String getGrammarFileName() { return "src/grammar/TLTreeWalker.g"; }


      public Map<String, Function> functions = null;
      Scope currentScope = null;
      
      public TLTreeWalker(CommonTreeNodeStream nodes, Map<String, Function> fns) {
        this(nodes, null, fns);
      }
      
      public TLTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, Function> fns) {
        super(nds);
        currentScope = sc;
        functions = fns;
      }



    // $ANTLR start "walk"
    // src/grammar/TLTreeWalker.g:32:1: walk returns [TLNode node] : block ;
    public final TLNode walk() throws RecognitionException {
        TLNode node = null;

        TLNode block1 = null;


        try {
            // src/grammar/TLTreeWalker.g:33:3: ( block )
            // src/grammar/TLTreeWalker.g:33:6: block
            {
            pushFollow(FOLLOW_block_in_walk50);
            block1=block();

            state._fsp--;

            node = block1;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "walk"


    // $ANTLR start "block"
    // src/grammar/TLTreeWalker.g:36:1: block returns [TLNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
    public final TLNode block() throws RecognitionException {
        TLNode node = null;

        TLNode statement2 = null;

        TLNode expression3 = null;



          BlockNode bn = new BlockNode();
          node = bn;
          Scope scope = new Scope(currentScope);
          currentScope = scope;

        try {
            // src/grammar/TLTreeWalker.g:46:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // src/grammar/TLTreeWalker.g:46:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block81); 

            match(input, Token.DOWN, null); 
            match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block94); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // src/grammar/TLTreeWalker.g:47:23: ( statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=ASSIGNMENT && LA1_0<=FUNC_CALL)||LA1_0==IF||LA1_0==For||LA1_0==While) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // src/grammar/TLTreeWalker.g:47:24: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_block97);
                	    statement2=statement();

                	    state._fsp--;

                	    bn.addStatement(statement2);

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            match(input,RETURN,FOLLOW_RETURN_in_block117); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // src/grammar/TLTreeWalker.g:48:23: ( expression )?
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=TERNARY && LA2_0<=NEGATE)||LA2_0==LOOKUP||(LA2_0>=In && LA2_0<=Null)||(LA2_0>=Or && LA2_0<=Pow)||(LA2_0>=GT && LA2_0<=Modulus)) ) {
                    alt2=1;
                }
                switch (alt2) {
                    case 1 :
                        // src/grammar/TLTreeWalker.g:48:24: expression
                        {
                        pushFollow(FOLLOW_expression_in_block124);
                        expression3=expression();

                        state._fsp--;

                        bn.addReturn(expression3);  

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            match(input, Token.UP, null); 

            }


              currentScope = currentScope.parent();

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "block"


    // $ANTLR start "statement"
    // src/grammar/TLTreeWalker.g:52:1: statement returns [TLNode node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement );
    public final TLNode statement() throws RecognitionException {
        TLNode node = null;

        TLNode assignment4 = null;

        TLNode functionCall5 = null;

        TLNode ifStatement6 = null;

        TLNode forStatement7 = null;

        TLNode whileStatement8 = null;


        try {
            // src/grammar/TLTreeWalker.g:53:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement )
            int alt3=5;
            switch ( input.LA(1) ) {
            case ASSIGNMENT:
                {
                alt3=1;
                }
                break;
            case FUNC_CALL:
                {
                alt3=2;
                }
                break;
            case IF:
                {
                alt3=3;
                }
                break;
            case For:
                {
                alt3=4;
                }
                break;
            case While:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // src/grammar/TLTreeWalker.g:53:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement156);
                    assignment4=assignment();

                    state._fsp--;

                    node = assignment4;

                    }
                    break;
                case 2 :
                    // src/grammar/TLTreeWalker.g:54:6: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_statement169);
                    functionCall5=functionCall();

                    state._fsp--;

                    node = functionCall5;

                    }
                    break;
                case 3 :
                    // src/grammar/TLTreeWalker.g:55:6: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement180);
                    ifStatement6=ifStatement();

                    state._fsp--;

                    node = ifStatement6;

                    }
                    break;
                case 4 :
                    // src/grammar/TLTreeWalker.g:56:6: forStatement
                    {
                    pushFollow(FOLLOW_forStatement_in_statement192);
                    forStatement7=forStatement();

                    state._fsp--;

                    node = forStatement7;

                    }
                    break;
                case 5 :
                    // src/grammar/TLTreeWalker.g:57:6: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement203);
                    whileStatement8=whileStatement();

                    state._fsp--;

                    node = whileStatement8;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "statement"


    // $ANTLR start "assignment"
    // src/grammar/TLTreeWalker.g:60:1: assignment returns [TLNode node] : ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression ) ;
    public final TLNode assignment() throws RecognitionException {
        TLNode node = null;

        CommonTree i=null;
        java.util.List<TLNode> x = null;

        TLNode e = null;


        try {
            // src/grammar/TLTreeWalker.g:61:3: ( ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression ) )
            // src/grammar/TLTreeWalker.g:61:6: ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment224); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment228); 
            // src/grammar/TLTreeWalker.g:61:33: (x= indexes )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INDEXES) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // src/grammar/TLTreeWalker.g:61:33: x= indexes
                    {
                    pushFollow(FOLLOW_indexes_in_assignment232);
                    x=indexes();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_assignment237);
            e=expression();

            state._fsp--;


            match(input, Token.UP, null); 
            node = new AssignmentNode((i!=null?i.getText():null), x, e, currentScope);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "functionCall"
    // src/grammar/TLTreeWalker.g:65:1: functionCall returns [TLNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL Move expression ) );
    public final TLNode functionCall() throws RecognitionException {
        TLNode node = null;

        TLNode expression9 = null;


        try {
            // src/grammar/TLTreeWalker.g:66:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL Move expression ) )
            int alt7=6;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==FUNC_CALL) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case Identifier:
                        {
                        alt7=1;
                        }
                        break;
                    case Println:
                        {
                        alt7=2;
                        }
                        break;
                    case Print:
                        {
                        alt7=3;
                        }
                        break;
                    case Assert:
                        {
                        alt7=4;
                        }
                        break;
                    case Size:
                        {
                        alt7=5;
                        }
                        break;
                    case Move:
                        {
                        alt7=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // src/grammar/TLTreeWalker.g:66:6: ^( FUNC_CALL Identifier ( exprList )? )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall265); 

                    match(input, Token.DOWN, null); 
                    match(input,Identifier,FOLLOW_Identifier_in_functionCall267); 
                    // src/grammar/TLTreeWalker.g:66:29: ( exprList )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==EXP_LIST) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:66:29: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_functionCall269);
                            exprList();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // src/grammar/TLTreeWalker.g:67:6: ^( FUNC_CALL Println ( expression )? )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall279); 

                    match(input, Token.DOWN, null); 
                    match(input,Println,FOLLOW_Println_in_functionCall281); 
                    // src/grammar/TLTreeWalker.g:67:26: ( expression )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=TERNARY && LA6_0<=NEGATE)||LA6_0==LOOKUP||(LA6_0>=In && LA6_0<=Null)||(LA6_0>=Or && LA6_0<=Pow)||(LA6_0>=GT && LA6_0<=Modulus)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:67:26: expression
                            {
                            pushFollow(FOLLOW_expression_in_functionCall283);
                            expression9=expression();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    node = new PrintlnNode(expression9);

                    }
                    break;
                case 3 :
                    // src/grammar/TLTreeWalker.g:68:6: ^( FUNC_CALL Print expression )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall295); 

                    match(input, Token.DOWN, null); 
                    match(input,Print,FOLLOW_Print_in_functionCall297); 
                    pushFollow(FOLLOW_expression_in_functionCall299);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // src/grammar/TLTreeWalker.g:69:6: ^( FUNC_CALL Assert expression )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall308); 

                    match(input, Token.DOWN, null); 
                    match(input,Assert,FOLLOW_Assert_in_functionCall310); 
                    pushFollow(FOLLOW_expression_in_functionCall312);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // src/grammar/TLTreeWalker.g:70:6: ^( FUNC_CALL Size expression )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall321); 

                    match(input, Token.DOWN, null); 
                    match(input,Size,FOLLOW_Size_in_functionCall323); 
                    pushFollow(FOLLOW_expression_in_functionCall325);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // src/grammar/TLTreeWalker.g:71:6: ^( FUNC_CALL Move expression )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall334); 

                    match(input, Token.DOWN, null); 
                    match(input,Move,FOLLOW_Move_in_functionCall336); 
                    pushFollow(FOLLOW_expression_in_functionCall338);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "functionCall"


    // $ANTLR start "ifStatement"
    // src/grammar/TLTreeWalker.g:74:1: ifStatement returns [TLNode node] : ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) ;
    public final TLNode ifStatement() throws RecognitionException {
        TLNode node = null;

        TLNode b1 = null;

        TLNode b2 = null;

        TLNode expression10 = null;



          IfNode ifNode = new IfNode();
          node = ifNode;

        try {
            // src/grammar/TLTreeWalker.g:79:3: ( ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) )
            // src/grammar/TLTreeWalker.g:79:6: ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? )
            {
            match(input,IF,FOLLOW_IF_in_ifStatement364); 

            match(input, Token.DOWN, null); 
            // src/grammar/TLTreeWalker.g:80:8: ( ^( EXP expression b1= block ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==EXP) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==DOWN) ) {
                        int LA8_3 = input.LA(3);

                        if ( ((LA8_3>=TERNARY && LA8_3<=NEGATE)||LA8_3==LOOKUP||(LA8_3>=In && LA8_3<=Null)||(LA8_3>=Or && LA8_3<=Pow)||(LA8_3>=GT && LA8_3<=Modulus)) ) {
                            alt8=1;
                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // src/grammar/TLTreeWalker.g:80:9: ^( EXP expression b1= block )
            	    {
            	    match(input,EXP,FOLLOW_EXP_in_ifStatement376); 

            	    match(input, Token.DOWN, null); 
            	    pushFollow(FOLLOW_expression_in_ifStatement378);
            	    expression10=expression();

            	    state._fsp--;

            	    pushFollow(FOLLOW_block_in_ifStatement382);
            	    b1=block();

            	    state._fsp--;


            	    match(input, Token.UP, null); 
            	    ifNode.addChoice(expression10, b1);  

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // src/grammar/TLTreeWalker.g:81:8: ( ^( EXP b2= block ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EXP) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src/grammar/TLTreeWalker.g:81:9: ^( EXP b2= block )
                    {
                    match(input,EXP,FOLLOW_EXP_in_ifStatement399); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_block_in_ifStatement403);
                    b2=block();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    ifNode.addChoice(new AtomNode(true), b2);

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "forStatement"
    // src/grammar/TLTreeWalker.g:85:1: forStatement returns [TLNode node] : ^( For Identifier expression expression block ) ;
    public final TLNode forStatement() throws RecognitionException {
        TLNode node = null;

        try {
            // src/grammar/TLTreeWalker.g:86:3: ( ^( For Identifier expression expression block ) )
            // src/grammar/TLTreeWalker.g:86:6: ^( For Identifier expression expression block )
            {
            match(input,For,FOLLOW_For_in_forStatement448); 

            match(input, Token.DOWN, null); 
            match(input,Identifier,FOLLOW_Identifier_in_forStatement450); 
            pushFollow(FOLLOW_expression_in_forStatement452);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_forStatement454);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_block_in_forStatement456);
            block();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "forStatement"


    // $ANTLR start "whileStatement"
    // src/grammar/TLTreeWalker.g:89:1: whileStatement returns [TLNode node] : ^( While expression block ) ;
    public final TLNode whileStatement() throws RecognitionException {
        TLNode node = null;

        try {
            // src/grammar/TLTreeWalker.g:90:3: ( ^( While expression block ) )
            // src/grammar/TLTreeWalker.g:90:6: ^( While expression block )
            {
            match(input,While,FOLLOW_While_in_whileStatement476); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_whileStatement478);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_block_in_whileStatement480);
            block();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "whileStatement"


    // $ANTLR start "idList"
    // src/grammar/TLTreeWalker.g:93:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
    public final java.util.List<String> idList() throws RecognitionException {
        java.util.List<String> i = null;

        try {
            // src/grammar/TLTreeWalker.g:94:3: ( ^( ID_LIST ( Identifier )+ ) )
            // src/grammar/TLTreeWalker.g:94:6: ^( ID_LIST ( Identifier )+ )
            {
            match(input,ID_LIST,FOLLOW_ID_LIST_in_idList500); 

            match(input, Token.DOWN, null); 
            // src/grammar/TLTreeWalker.g:94:16: ( Identifier )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Identifier) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/grammar/TLTreeWalker.g:94:16: Identifier
            	    {
            	    match(input,Identifier,FOLLOW_Identifier_in_idList502); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return i;
    }
    // $ANTLR end "idList"


    // $ANTLR start "exprList"
    // src/grammar/TLTreeWalker.g:97:1: exprList returns [java.util.List<TLNode> e] : ^( EXP_LIST ( expression )+ ) ;
    public final java.util.List<TLNode> exprList() throws RecognitionException {
        java.util.List<TLNode> e = null;

        try {
            // src/grammar/TLTreeWalker.g:98:3: ( ^( EXP_LIST ( expression )+ ) )
            // src/grammar/TLTreeWalker.g:98:6: ^( EXP_LIST ( expression )+ )
            {
            match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList523); 

            match(input, Token.DOWN, null); 
            // src/grammar/TLTreeWalker.g:98:17: ( expression )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=TERNARY && LA11_0<=NEGATE)||LA11_0==LOOKUP||(LA11_0>=In && LA11_0<=Null)||(LA11_0>=Or && LA11_0<=Pow)||(LA11_0>=GT && LA11_0<=Modulus)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/grammar/TLTreeWalker.g:98:17: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_exprList525);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "exprList"


    // $ANTLR start "expression"
    // src/grammar/TLTreeWalker.g:101:1: expression returns [TLNode node] : ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' expression expression ) | ^( '&&' expression expression ) | ^( '==' expression expression ) | ^( '!=' expression expression ) | ^( '>=' expression expression ) | ^( '<=' expression expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup );
    public final TLNode expression() throws RecognitionException {
        TLNode node = null;

        CommonTree Number11=null;
        TLNode a = null;

        TLNode b = null;

        TLNode lookup12 = null;


        try {
            // src/grammar/TLTreeWalker.g:102:3: ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' expression expression ) | ^( '&&' expression expression ) | ^( '==' expression expression ) | ^( '!=' expression expression ) | ^( '>=' expression expression ) | ^( '<=' expression expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup )
            int alt12=22;
            switch ( input.LA(1) ) {
            case TERNARY:
                {
                alt12=1;
                }
                break;
            case In:
                {
                alt12=2;
                }
                break;
            case Or:
                {
                alt12=3;
                }
                break;
            case And:
                {
                alt12=4;
                }
                break;
            case Equals:
                {
                alt12=5;
                }
                break;
            case NEquals:
                {
                alt12=6;
                }
                break;
            case GTEquals:
                {
                alt12=7;
                }
                break;
            case LTEquals:
                {
                alt12=8;
                }
                break;
            case GT:
                {
                alt12=9;
                }
                break;
            case LT:
                {
                alt12=10;
                }
                break;
            case Add:
                {
                alt12=11;
                }
                break;
            case Subtract:
                {
                alt12=12;
                }
                break;
            case Multiply:
                {
                alt12=13;
                }
                break;
            case Divide:
                {
                alt12=14;
                }
                break;
            case Modulus:
                {
                alt12=15;
                }
                break;
            case Pow:
                {
                alt12=16;
                }
                break;
            case UNARY_MIN:
                {
                alt12=17;
                }
                break;
            case NEGATE:
                {
                alt12=18;
                }
                break;
            case Number:
                {
                alt12=19;
                }
                break;
            case Bool:
                {
                alt12=20;
                }
                break;
            case Null:
                {
                alt12=21;
                }
                break;
            case LOOKUP:
                {
                alt12=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // src/grammar/TLTreeWalker.g:102:6: ^( TERNARY expression expression expression )
                    {
                    match(input,TERNARY,FOLLOW_TERNARY_in_expression546); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression548);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression550);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression552);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // src/grammar/TLTreeWalker.g:103:6: ^( In expression expression )
                    {
                    match(input,In,FOLLOW_In_in_expression561); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression563);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression565);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // src/grammar/TLTreeWalker.g:104:6: ^( '||' expression expression )
                    {
                    match(input,Or,FOLLOW_Or_in_expression574); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression576);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression578);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // src/grammar/TLTreeWalker.g:105:6: ^( '&&' expression expression )
                    {
                    match(input,And,FOLLOW_And_in_expression587); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression589);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression591);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // src/grammar/TLTreeWalker.g:106:6: ^( '==' expression expression )
                    {
                    match(input,Equals,FOLLOW_Equals_in_expression600); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression602);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression604);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // src/grammar/TLTreeWalker.g:107:6: ^( '!=' expression expression )
                    {
                    match(input,NEquals,FOLLOW_NEquals_in_expression613); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression615);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression617);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // src/grammar/TLTreeWalker.g:108:6: ^( '>=' expression expression )
                    {
                    match(input,GTEquals,FOLLOW_GTEquals_in_expression626); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression628);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression630);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // src/grammar/TLTreeWalker.g:109:6: ^( '<=' expression expression )
                    {
                    match(input,LTEquals,FOLLOW_LTEquals_in_expression639); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression641);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression643);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // src/grammar/TLTreeWalker.g:110:6: ^( '>' a= expression b= expression )
                    {
                    match(input,GT,FOLLOW_GT_in_expression652); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression656);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression660);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new GTNode(a, b);

                    }
                    break;
                case 10 :
                    // src/grammar/TLTreeWalker.g:111:6: ^( '<' a= expression b= expression )
                    {
                    match(input,LT,FOLLOW_LT_in_expression671); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression675);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression679);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new LTNode(a, b);

                    }
                    break;
                case 11 :
                    // src/grammar/TLTreeWalker.g:112:6: ^( '+' a= expression b= expression )
                    {
                    match(input,Add,FOLLOW_Add_in_expression690); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression694);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression698);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new AddNode(a, b);

                    }
                    break;
                case 12 :
                    // src/grammar/TLTreeWalker.g:113:6: ^( '-' a= expression b= expression )
                    {
                    match(input,Subtract,FOLLOW_Subtract_in_expression709); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression713);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression717);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new SubtractNode(a, b);

                    }
                    break;
                case 13 :
                    // src/grammar/TLTreeWalker.g:114:6: ^( '*' a= expression b= expression )
                    {
                    match(input,Multiply,FOLLOW_Multiply_in_expression728); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression732);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression736);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new MultNode(a, b);

                    }
                    break;
                case 14 :
                    // src/grammar/TLTreeWalker.g:115:6: ^( '/' a= expression b= expression )
                    {
                    match(input,Divide,FOLLOW_Divide_in_expression747); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression751);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression755);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new DivideNode(a, b);

                    }
                    break;
                case 15 :
                    // src/grammar/TLTreeWalker.g:116:6: ^( '%' a= expression b= expression )
                    {
                    match(input,Modulus,FOLLOW_Modulus_in_expression766); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression770);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression774);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new ModNode(a, b);

                    }
                    break;
                case 16 :
                    // src/grammar/TLTreeWalker.g:118:6: ^( '^' expression expression )
                    {
                    match(input,Pow,FOLLOW_Pow_in_expression786); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression788);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression790);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // src/grammar/TLTreeWalker.g:119:6: ^( UNARY_MIN expression )
                    {
                    match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression799); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression801);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // src/grammar/TLTreeWalker.g:120:6: ^( NEGATE expression )
                    {
                    match(input,NEGATE,FOLLOW_NEGATE_in_expression810); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression812);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // src/grammar/TLTreeWalker.g:121:6: Number
                    {
                    Number11=(CommonTree)match(input,Number,FOLLOW_Number_in_expression820); 
                    node = new AtomNode(Double.parseDouble((Number11!=null?Number11.getText():null)));

                    }
                    break;
                case 20 :
                    // src/grammar/TLTreeWalker.g:122:6: Bool
                    {
                    match(input,Bool,FOLLOW_Bool_in_expression829); 

                    }
                    break;
                case 21 :
                    // src/grammar/TLTreeWalker.g:123:6: Null
                    {
                    match(input,Null,FOLLOW_Null_in_expression836); 

                    }
                    break;
                case 22 :
                    // src/grammar/TLTreeWalker.g:124:6: lookup
                    {
                    pushFollow(FOLLOW_lookup_in_expression843);
                    lookup12=lookup();

                    state._fsp--;

                    node = lookup12;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "expression"


    // $ANTLR start "lookup"
    // src/grammar/TLTreeWalker.g:127:1: lookup returns [TLNode node] : ( ^( LOOKUP functionCall ( indexes )? ) | ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) );
    public final TLNode lookup() throws RecognitionException {
        TLNode node = null;

        CommonTree i=null;
        java.util.List<TLNode> x = null;


        try {
            // src/grammar/TLTreeWalker.g:128:3: ( ^( LOOKUP functionCall ( indexes )? ) | ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) )
            int alt18=5;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LOOKUP) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case Identifier:
                        {
                        alt18=4;
                        }
                        break;
                    case String:
                        {
                        alt18=5;
                        }
                        break;
                    case TERNARY:
                    case UNARY_MIN:
                    case NEGATE:
                    case LOOKUP:
                    case In:
                    case Number:
                    case Bool:
                    case Null:
                    case Or:
                    case And:
                    case Equals:
                    case NEquals:
                    case GTEquals:
                    case LTEquals:
                    case Pow:
                    case GT:
                    case LT:
                    case Add:
                    case Subtract:
                    case Multiply:
                    case Divide:
                    case Modulus:
                        {
                        alt18=3;
                        }
                        break;
                    case FUNC_CALL:
                        {
                        alt18=1;
                        }
                        break;
                    case LIST:
                        {
                        alt18=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // src/grammar/TLTreeWalker.g:128:6: ^( LOOKUP functionCall ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup875); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_functionCall_in_lookup877);
                    functionCall();

                    state._fsp--;

                    // src/grammar/TLTreeWalker.g:128:28: ( indexes )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==INDEXES) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:128:28: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup879);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // src/grammar/TLTreeWalker.g:129:6: ^( LOOKUP list ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup889); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_list_in_lookup891);
                    list();

                    state._fsp--;

                    // src/grammar/TLTreeWalker.g:129:20: ( indexes )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==INDEXES) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:129:20: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup893);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // src/grammar/TLTreeWalker.g:130:6: ^( LOOKUP expression ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup903); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_lookup905);
                    expression();

                    state._fsp--;

                    // src/grammar/TLTreeWalker.g:130:26: ( indexes )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==INDEXES) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:130:26: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup907);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // src/grammar/TLTreeWalker.g:131:6: ^( LOOKUP i= Identifier (x= indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup918); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup922); 
                    // src/grammar/TLTreeWalker.g:131:29: (x= indexes )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==INDEXES) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:131:29: x= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup926);
                            x=indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                            node = (x != null) ? 
                              new LookupNode(new IdentifierNode((i!=null?i.getText():null), currentScope), x) : 
                              new IdentifierNode((i!=null?i.getText():null), currentScope);
                          

                    }
                    break;
                case 5 :
                    // src/grammar/TLTreeWalker.g:137:6: ^( LOOKUP String ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup945); 

                    match(input, Token.DOWN, null); 
                    match(input,String,FOLLOW_String_in_lookup947); 
                    // src/grammar/TLTreeWalker.g:137:22: ( indexes )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==INDEXES) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:137:22: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup949);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "lookup"


    // $ANTLR start "list"
    // src/grammar/TLTreeWalker.g:140:1: list returns [TLNode node] : ^( LIST ( exprList )? ) ;
    public final TLNode list() throws RecognitionException {
        TLNode node = null;

        try {
            // src/grammar/TLTreeWalker.g:141:3: ( ^( LIST ( exprList )? ) )
            // src/grammar/TLTreeWalker.g:141:6: ^( LIST ( exprList )? )
            {
            match(input,LIST,FOLLOW_LIST_in_list972); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // src/grammar/TLTreeWalker.g:141:13: ( exprList )?
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==EXP_LIST) ) {
                    alt19=1;
                }
                switch (alt19) {
                    case 1 :
                        // src/grammar/TLTreeWalker.g:141:13: exprList
                        {
                        pushFollow(FOLLOW_exprList_in_list974);
                        exprList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "list"


    // $ANTLR start "indexes"
    // src/grammar/TLTreeWalker.g:144:1: indexes returns [java.util.List<TLNode> e] : ^( INDEXES ( expression )+ ) ;
    public final java.util.List<TLNode> indexes() throws RecognitionException {
        java.util.List<TLNode> e = null;

        TLNode expression13 = null;


        e = new java.util.ArrayList<TLNode>();
        try {
            // src/grammar/TLTreeWalker.g:146:3: ( ^( INDEXES ( expression )+ ) )
            // src/grammar/TLTreeWalker.g:146:6: ^( INDEXES ( expression )+ )
            {
            match(input,INDEXES,FOLLOW_INDEXES_in_indexes1000); 

            match(input, Token.DOWN, null); 
            // src/grammar/TLTreeWalker.g:146:16: ( expression )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=TERNARY && LA20_0<=NEGATE)||LA20_0==LOOKUP||(LA20_0>=In && LA20_0<=Null)||(LA20_0>=Or && LA20_0<=Pow)||(LA20_0>=GT && LA20_0<=Modulus)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/grammar/TLTreeWalker.g:146:17: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_indexes1003);
            	    expression13=expression();

            	    state._fsp--;

            	    e.add(expression13);

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "indexes"

    // Delegated rules


 

    public static final BitSet FOLLOW_block_in_walk50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block81 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATEMENTS_in_block94 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_block97 = new BitSet(new long[]{0x0000000500001188L});
    public static final BitSet FOLLOW_RETURN_in_block117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_block124 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_in_statement156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statement192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_assignment228 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_indexes_in_assignment232 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_assignment237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_functionCall267 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_exprList_in_functionCall269 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Println_in_functionCall281 = new BitSet(new long[]{0x007F7F78000AE008L});
    public static final BitSet FOLLOW_expression_in_functionCall283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Print_in_functionCall297 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_functionCall299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall308 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Assert_in_functionCall310 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_functionCall312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Size_in_functionCall323 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_functionCall325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Move_in_functionCall336 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_functionCall338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifStatement364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXP_in_ifStatement376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifStatement378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_ifStatement382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_ifStatement399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_ifStatement403 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_For_in_forStatement448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_forStatement450 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_forStatement452 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_forStatement454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_forStatement456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_While_in_whileStatement476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_whileStatement478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_whileStatement480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_LIST_in_idList500 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_idList502 = new BitSet(new long[]{0x0000000000200008L});
    public static final BitSet FOLLOW_EXP_LIST_in_exprList523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_exprList525 = new BitSet(new long[]{0x007F7F78000AE008L});
    public static final BitSet FOLLOW_TERNARY_in_expression546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression548 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression550 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_In_in_expression561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression563 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Or_in_expression574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression576 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_And_in_expression587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression589 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Equals_in_expression600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression602 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression604 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEquals_in_expression613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression615 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTEquals_in_expression626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression628 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTEquals_in_expression639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression641 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_expression652 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression656 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression660 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expression671 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression675 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression679 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Add_in_expression690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression694 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression698 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Subtract_in_expression709 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression713 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression717 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Multiply_in_expression728 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression732 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression736 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Divide_in_expression747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression751 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression755 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Modulus_in_expression766 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression770 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression774 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Pow_in_expression786 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression788 = new BitSet(new long[]{0x007F7F78000AE000L});
    public static final BitSet FOLLOW_expression_in_expression790 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MIN_in_expression799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression801 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATE_in_expression810 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression812 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Number_in_expression820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_expression829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Null_in_expression836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_expression843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionCall_in_lookup877 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_indexes_in_lookup879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup889 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_in_lookup891 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_indexes_in_lookup893 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup903 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_lookup905 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_indexes_in_lookup907 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup918 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_lookup922 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_indexes_in_lookup926 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_String_in_lookup947 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_indexes_in_lookup949 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_in_list972 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprList_in_list974 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEXES_in_indexes1000 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_indexes1003 = new BitSet(new long[]{0x007F7F78000AE008L});

}