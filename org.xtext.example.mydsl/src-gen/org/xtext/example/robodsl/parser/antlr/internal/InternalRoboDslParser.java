package org.xtext.example.robodsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.robodsl.services.RoboDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRoboDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENTSTRING", "RULE_TRACESTRING", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Script'", "'runs'", "'as'", "'end'", "'turnLeft'", "'trace'", "'drop'", "'step'", "'pick'", "'dropMark'", "'pickMark'", "'destroyWall'", "'buildWall'", "'row:'", "'col:'", "'if'", "'do'", "'else'", "'while'", "'Repeat'", "'times'", "'or'", "'and'", "'not'", "'('", "')'", "'full'", "'mark'", "'wall'", "'ahead'", "'heading'", "'north'", "'east'", "'south'", "'west'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_TRACESTRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_COMMENTSTRING=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRoboDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRoboDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRoboDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRoboDsl.g"; }



     	private RoboDslGrammarAccess grammarAccess;

        public InternalRoboDslParser(TokenStream input, RoboDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EScript";
       	}

       	@Override
       	protected RoboDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEScript"
    // InternalRoboDsl.g:64:1: entryRuleEScript returns [EObject current=null] : iv_ruleEScript= ruleEScript EOF ;
    public final EObject entryRuleEScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEScript = null;


        try {
            // InternalRoboDsl.g:64:48: (iv_ruleEScript= ruleEScript EOF )
            // InternalRoboDsl.g:65:2: iv_ruleEScript= ruleEScript EOF
            {
             newCompositeNode(grammarAccess.getEScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEScript=ruleEScript();

            state._fsp--;

             current =iv_ruleEScript; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEScript"


    // $ANTLR start "ruleEScript"
    // InternalRoboDsl.g:71:1: ruleEScript returns [EObject current=null] : ( () otherlv_1= 'Script' ( (lv_Name_2_0= ruleEString ) ) otherlv_3= 'runs' otherlv_4= 'as' ( (lv_mainbody_5_0= ruleMainBody ) ) otherlv_6= 'end' ) ;
    public final EObject ruleEScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_Name_2_0 = null;

        EObject lv_mainbody_5_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:77:2: ( ( () otherlv_1= 'Script' ( (lv_Name_2_0= ruleEString ) ) otherlv_3= 'runs' otherlv_4= 'as' ( (lv_mainbody_5_0= ruleMainBody ) ) otherlv_6= 'end' ) )
            // InternalRoboDsl.g:78:2: ( () otherlv_1= 'Script' ( (lv_Name_2_0= ruleEString ) ) otherlv_3= 'runs' otherlv_4= 'as' ( (lv_mainbody_5_0= ruleMainBody ) ) otherlv_6= 'end' )
            {
            // InternalRoboDsl.g:78:2: ( () otherlv_1= 'Script' ( (lv_Name_2_0= ruleEString ) ) otherlv_3= 'runs' otherlv_4= 'as' ( (lv_mainbody_5_0= ruleMainBody ) ) otherlv_6= 'end' )
            // InternalRoboDsl.g:79:3: () otherlv_1= 'Script' ( (lv_Name_2_0= ruleEString ) ) otherlv_3= 'runs' otherlv_4= 'as' ( (lv_mainbody_5_0= ruleMainBody ) ) otherlv_6= 'end'
            {
            // InternalRoboDsl.g:79:3: ()
            // InternalRoboDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEScriptAccess().getEScriptAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEScriptAccess().getScriptKeyword_1());
            		
            // InternalRoboDsl.g:90:3: ( (lv_Name_2_0= ruleEString ) )
            // InternalRoboDsl.g:91:4: (lv_Name_2_0= ruleEString )
            {
            // InternalRoboDsl.g:91:4: (lv_Name_2_0= ruleEString )
            // InternalRoboDsl.g:92:5: lv_Name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEScriptAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_Name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEScriptRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_2_0,
            						"org.xtext.example.robodsl.RoboDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getEScriptAccess().getRunsKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getEScriptAccess().getAsKeyword_4());
            		
            // InternalRoboDsl.g:117:3: ( (lv_mainbody_5_0= ruleMainBody ) )
            // InternalRoboDsl.g:118:4: (lv_mainbody_5_0= ruleMainBody )
            {
            // InternalRoboDsl.g:118:4: (lv_mainbody_5_0= ruleMainBody )
            // InternalRoboDsl.g:119:5: lv_mainbody_5_0= ruleMainBody
            {

            					newCompositeNode(grammarAccess.getEScriptAccess().getMainbodyMainBodyParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_mainbody_5_0=ruleMainBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEScriptRule());
            					}
            					set(
            						current,
            						"mainbody",
            						lv_mainbody_5_0,
            						"org.xtext.example.robodsl.RoboDsl.MainBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEScriptAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEScript"


    // $ANTLR start "entryRuleCommand"
    // InternalRoboDsl.g:144:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalRoboDsl.g:144:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalRoboDsl.g:145:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalRoboDsl.g:151:1: ruleCommand returns [EObject current=null] : (this_EComment_0= ruleEComment | this_IfStatement_1= ruleIfStatement | this_WhileStatement_2= ruleWhileStatement | this_RepeateStatement_3= ruleRepeateStatement | this_TurnLeftCmd_4= ruleTurnLeftCmd | this_TraceCmd_5= ruleTraceCmd | this_DropCmd_6= ruleDropCmd | this_StepCmd_7= ruleStepCmd | this_PickCmd_8= rulePickCmd | this_DropMarkCmd_9= ruleDropMarkCmd | this_PickMarkCmd_10= rulePickMarkCmd | this_DestroyWallCmd_11= ruleDestroyWallCmd | this_BuildWallCmd_12= ruleBuildWallCmd ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_EComment_0 = null;

        EObject this_IfStatement_1 = null;

        EObject this_WhileStatement_2 = null;

        EObject this_RepeateStatement_3 = null;

        EObject this_TurnLeftCmd_4 = null;

        EObject this_TraceCmd_5 = null;

        EObject this_DropCmd_6 = null;

        EObject this_StepCmd_7 = null;

        EObject this_PickCmd_8 = null;

        EObject this_DropMarkCmd_9 = null;

        EObject this_PickMarkCmd_10 = null;

        EObject this_DestroyWallCmd_11 = null;

        EObject this_BuildWallCmd_12 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:157:2: ( (this_EComment_0= ruleEComment | this_IfStatement_1= ruleIfStatement | this_WhileStatement_2= ruleWhileStatement | this_RepeateStatement_3= ruleRepeateStatement | this_TurnLeftCmd_4= ruleTurnLeftCmd | this_TraceCmd_5= ruleTraceCmd | this_DropCmd_6= ruleDropCmd | this_StepCmd_7= ruleStepCmd | this_PickCmd_8= rulePickCmd | this_DropMarkCmd_9= ruleDropMarkCmd | this_PickMarkCmd_10= rulePickMarkCmd | this_DestroyWallCmd_11= ruleDestroyWallCmd | this_BuildWallCmd_12= ruleBuildWallCmd ) )
            // InternalRoboDsl.g:158:2: (this_EComment_0= ruleEComment | this_IfStatement_1= ruleIfStatement | this_WhileStatement_2= ruleWhileStatement | this_RepeateStatement_3= ruleRepeateStatement | this_TurnLeftCmd_4= ruleTurnLeftCmd | this_TraceCmd_5= ruleTraceCmd | this_DropCmd_6= ruleDropCmd | this_StepCmd_7= ruleStepCmd | this_PickCmd_8= rulePickCmd | this_DropMarkCmd_9= ruleDropMarkCmd | this_PickMarkCmd_10= rulePickMarkCmd | this_DestroyWallCmd_11= ruleDestroyWallCmd | this_BuildWallCmd_12= ruleBuildWallCmd )
            {
            // InternalRoboDsl.g:158:2: (this_EComment_0= ruleEComment | this_IfStatement_1= ruleIfStatement | this_WhileStatement_2= ruleWhileStatement | this_RepeateStatement_3= ruleRepeateStatement | this_TurnLeftCmd_4= ruleTurnLeftCmd | this_TraceCmd_5= ruleTraceCmd | this_DropCmd_6= ruleDropCmd | this_StepCmd_7= ruleStepCmd | this_PickCmd_8= rulePickCmd | this_DropMarkCmd_9= ruleDropMarkCmd | this_PickMarkCmd_10= rulePickMarkCmd | this_DestroyWallCmd_11= ruleDestroyWallCmd | this_BuildWallCmd_12= ruleBuildWallCmd )
            int alt1=13;
            switch ( input.LA(1) ) {
            case RULE_COMMENTSTRING:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            case 32:
                {
                alt1=4;
                }
                break;
            case 17:
                {
                alt1=5;
                }
                break;
            case 18:
                {
                alt1=6;
                }
                break;
            case 19:
                {
                alt1=7;
                }
                break;
            case 20:
                {
                alt1=8;
                }
                break;
            case 21:
                {
                alt1=9;
                }
                break;
            case 22:
                {
                alt1=10;
                }
                break;
            case 23:
                {
                alt1=11;
                }
                break;
            case 24:
                {
                alt1=12;
                }
                break;
            case 25:
                {
                alt1=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRoboDsl.g:159:3: this_EComment_0= ruleEComment
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getECommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EComment_0=ruleEComment();

                    state._fsp--;


                    			current = this_EComment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRoboDsl.g:168:3: this_IfStatement_1= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getIfStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_1=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRoboDsl.g:177:3: this_WhileStatement_2= ruleWhileStatement
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getWhileStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_2=ruleWhileStatement();

                    state._fsp--;


                    			current = this_WhileStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRoboDsl.g:186:3: this_RepeateStatement_3= ruleRepeateStatement
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRepeateStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RepeateStatement_3=ruleRepeateStatement();

                    state._fsp--;


                    			current = this_RepeateStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRoboDsl.g:195:3: this_TurnLeftCmd_4= ruleTurnLeftCmd
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getTurnLeftCmdParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnLeftCmd_4=ruleTurnLeftCmd();

                    state._fsp--;


                    			current = this_TurnLeftCmd_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRoboDsl.g:204:3: this_TraceCmd_5= ruleTraceCmd
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getTraceCmdParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_TraceCmd_5=ruleTraceCmd();

                    state._fsp--;


                    			current = this_TraceCmd_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRoboDsl.g:213:3: this_DropCmd_6= ruleDropCmd
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDropCmdParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropCmd_6=ruleDropCmd();

                    state._fsp--;


                    			current = this_DropCmd_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRoboDsl.g:222:3: this_StepCmd_7= ruleStepCmd
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getStepCmdParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_StepCmd_7=ruleStepCmd();

                    state._fsp--;


                    			current = this_StepCmd_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRoboDsl.g:231:3: this_PickCmd_8= rulePickCmd
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getPickCmdParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_PickCmd_8=rulePickCmd();

                    state._fsp--;


                    			current = this_PickCmd_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRoboDsl.g:240:3: this_DropMarkCmd_9= ruleDropMarkCmd
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDropMarkCmdParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropMarkCmd_9=ruleDropMarkCmd();

                    state._fsp--;


                    			current = this_DropMarkCmd_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRoboDsl.g:249:3: this_PickMarkCmd_10= rulePickMarkCmd
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getPickMarkCmdParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_PickMarkCmd_10=rulePickMarkCmd();

                    state._fsp--;


                    			current = this_PickMarkCmd_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalRoboDsl.g:258:3: this_DestroyWallCmd_11= ruleDestroyWallCmd
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDestroyWallCmdParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_DestroyWallCmd_11=ruleDestroyWallCmd();

                    state._fsp--;


                    			current = this_DestroyWallCmd_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalRoboDsl.g:267:3: this_BuildWallCmd_12= ruleBuildWallCmd
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getBuildWallCmdParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuildWallCmd_12=ruleBuildWallCmd();

                    state._fsp--;


                    			current = this_BuildWallCmd_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleMainBody"
    // InternalRoboDsl.g:279:1: entryRuleMainBody returns [EObject current=null] : iv_ruleMainBody= ruleMainBody EOF ;
    public final EObject entryRuleMainBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainBody = null;


        try {
            // InternalRoboDsl.g:279:49: (iv_ruleMainBody= ruleMainBody EOF )
            // InternalRoboDsl.g:280:2: iv_ruleMainBody= ruleMainBody EOF
            {
             newCompositeNode(grammarAccess.getMainBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainBody=ruleMainBody();

            state._fsp--;

             current =iv_ruleMainBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMainBody"


    // $ANTLR start "ruleMainBody"
    // InternalRoboDsl.g:286:1: ruleMainBody returns [EObject current=null] : ( () ( ( (lv_command_1_0= ruleCommand ) ) ( (lv_command_2_0= ruleCommand ) )* ) ) ;
    public final EObject ruleMainBody() throws RecognitionException {
        EObject current = null;

        EObject lv_command_1_0 = null;

        EObject lv_command_2_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:292:2: ( ( () ( ( (lv_command_1_0= ruleCommand ) ) ( (lv_command_2_0= ruleCommand ) )* ) ) )
            // InternalRoboDsl.g:293:2: ( () ( ( (lv_command_1_0= ruleCommand ) ) ( (lv_command_2_0= ruleCommand ) )* ) )
            {
            // InternalRoboDsl.g:293:2: ( () ( ( (lv_command_1_0= ruleCommand ) ) ( (lv_command_2_0= ruleCommand ) )* ) )
            // InternalRoboDsl.g:294:3: () ( ( (lv_command_1_0= ruleCommand ) ) ( (lv_command_2_0= ruleCommand ) )* )
            {
            // InternalRoboDsl.g:294:3: ()
            // InternalRoboDsl.g:295:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainBodyAccess().getMainBodyAction_0(),
            					current);
            			

            }

            // InternalRoboDsl.g:301:3: ( ( (lv_command_1_0= ruleCommand ) ) ( (lv_command_2_0= ruleCommand ) )* )
            // InternalRoboDsl.g:302:4: ( (lv_command_1_0= ruleCommand ) ) ( (lv_command_2_0= ruleCommand ) )*
            {
            // InternalRoboDsl.g:302:4: ( (lv_command_1_0= ruleCommand ) )
            // InternalRoboDsl.g:303:5: (lv_command_1_0= ruleCommand )
            {
            // InternalRoboDsl.g:303:5: (lv_command_1_0= ruleCommand )
            // InternalRoboDsl.g:304:6: lv_command_1_0= ruleCommand
            {

            						newCompositeNode(grammarAccess.getMainBodyAccess().getCommandCommandParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_8);
            lv_command_1_0=ruleCommand();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMainBodyRule());
            						}
            						add(
            							current,
            							"command",
            							lv_command_1_0,
            							"org.xtext.example.robodsl.RoboDsl.Command");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalRoboDsl.g:321:4: ( (lv_command_2_0= ruleCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENTSTRING||(LA2_0>=17 && LA2_0<=25)||LA2_0==28||(LA2_0>=31 && LA2_0<=32)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRoboDsl.g:322:5: (lv_command_2_0= ruleCommand )
            	    {
            	    // InternalRoboDsl.g:322:5: (lv_command_2_0= ruleCommand )
            	    // InternalRoboDsl.g:323:6: lv_command_2_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getMainBodyAccess().getCommandCommandParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_command_2_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainBodyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"command",
            	    							lv_command_2_0,
            	    							"org.xtext.example.robodsl.RoboDsl.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainBody"


    // $ANTLR start "entryRuleSubBody"
    // InternalRoboDsl.g:345:1: entryRuleSubBody returns [EObject current=null] : iv_ruleSubBody= ruleSubBody EOF ;
    public final EObject entryRuleSubBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubBody = null;


        try {
            // InternalRoboDsl.g:345:48: (iv_ruleSubBody= ruleSubBody EOF )
            // InternalRoboDsl.g:346:2: iv_ruleSubBody= ruleSubBody EOF
            {
             newCompositeNode(grammarAccess.getSubBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubBody=ruleSubBody();

            state._fsp--;

             current =iv_ruleSubBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubBody"


    // $ANTLR start "ruleSubBody"
    // InternalRoboDsl.g:352:1: ruleSubBody returns [EObject current=null] : ( () ( (lv_command_1_0= ruleCommand ) ) ( (lv_command_2_0= ruleCommand ) )* ) ;
    public final EObject ruleSubBody() throws RecognitionException {
        EObject current = null;

        EObject lv_command_1_0 = null;

        EObject lv_command_2_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:358:2: ( ( () ( (lv_command_1_0= ruleCommand ) ) ( (lv_command_2_0= ruleCommand ) )* ) )
            // InternalRoboDsl.g:359:2: ( () ( (lv_command_1_0= ruleCommand ) ) ( (lv_command_2_0= ruleCommand ) )* )
            {
            // InternalRoboDsl.g:359:2: ( () ( (lv_command_1_0= ruleCommand ) ) ( (lv_command_2_0= ruleCommand ) )* )
            // InternalRoboDsl.g:360:3: () ( (lv_command_1_0= ruleCommand ) ) ( (lv_command_2_0= ruleCommand ) )*
            {
            // InternalRoboDsl.g:360:3: ()
            // InternalRoboDsl.g:361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubBodyAccess().getSubBodyAction_0(),
            					current);
            			

            }

            // InternalRoboDsl.g:367:3: ( (lv_command_1_0= ruleCommand ) )
            // InternalRoboDsl.g:368:4: (lv_command_1_0= ruleCommand )
            {
            // InternalRoboDsl.g:368:4: (lv_command_1_0= ruleCommand )
            // InternalRoboDsl.g:369:5: lv_command_1_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getSubBodyAccess().getCommandCommandParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_command_1_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubBodyRule());
            					}
            					add(
            						current,
            						"command",
            						lv_command_1_0,
            						"org.xtext.example.robodsl.RoboDsl.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRoboDsl.g:386:3: ( (lv_command_2_0= ruleCommand ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMENTSTRING||(LA3_0>=17 && LA3_0<=25)||LA3_0==28||(LA3_0>=31 && LA3_0<=32)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRoboDsl.g:387:4: (lv_command_2_0= ruleCommand )
            	    {
            	    // InternalRoboDsl.g:387:4: (lv_command_2_0= ruleCommand )
            	    // InternalRoboDsl.g:388:5: lv_command_2_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getSubBodyAccess().getCommandCommandParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_command_2_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"command",
            	    						lv_command_2_0,
            	    						"org.xtext.example.robodsl.RoboDsl.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubBody"


    // $ANTLR start "entryRuleEComment"
    // InternalRoboDsl.g:409:1: entryRuleEComment returns [EObject current=null] : iv_ruleEComment= ruleEComment EOF ;
    public final EObject entryRuleEComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEComment = null;


        try {
            // InternalRoboDsl.g:409:49: (iv_ruleEComment= ruleEComment EOF )
            // InternalRoboDsl.g:410:2: iv_ruleEComment= ruleEComment EOF
            {
             newCompositeNode(grammarAccess.getECommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEComment=ruleEComment();

            state._fsp--;

             current =iv_ruleEComment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEComment"


    // $ANTLR start "ruleEComment"
    // InternalRoboDsl.g:416:1: ruleEComment returns [EObject current=null] : ( () ( (lv_comment_1_0= RULE_COMMENTSTRING ) ) ) ;
    public final EObject ruleEComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_1_0=null;


        	enterRule();

        try {
            // InternalRoboDsl.g:422:2: ( ( () ( (lv_comment_1_0= RULE_COMMENTSTRING ) ) ) )
            // InternalRoboDsl.g:423:2: ( () ( (lv_comment_1_0= RULE_COMMENTSTRING ) ) )
            {
            // InternalRoboDsl.g:423:2: ( () ( (lv_comment_1_0= RULE_COMMENTSTRING ) ) )
            // InternalRoboDsl.g:424:3: () ( (lv_comment_1_0= RULE_COMMENTSTRING ) )
            {
            // InternalRoboDsl.g:424:3: ()
            // InternalRoboDsl.g:425:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECommentAccess().getECommentAction_0(),
            					current);
            			

            }

            // InternalRoboDsl.g:431:3: ( (lv_comment_1_0= RULE_COMMENTSTRING ) )
            // InternalRoboDsl.g:432:4: (lv_comment_1_0= RULE_COMMENTSTRING )
            {
            // InternalRoboDsl.g:432:4: (lv_comment_1_0= RULE_COMMENTSTRING )
            // InternalRoboDsl.g:433:5: lv_comment_1_0= RULE_COMMENTSTRING
            {
            lv_comment_1_0=(Token)match(input,RULE_COMMENTSTRING,FOLLOW_2); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getECommentAccess().getCommentCOMMENTSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getECommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.xtext.example.robodsl.RoboDsl.COMMENTSTRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEComment"


    // $ANTLR start "entryRuleTurnLeftCmd"
    // InternalRoboDsl.g:453:1: entryRuleTurnLeftCmd returns [EObject current=null] : iv_ruleTurnLeftCmd= ruleTurnLeftCmd EOF ;
    public final EObject entryRuleTurnLeftCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnLeftCmd = null;


        try {
            // InternalRoboDsl.g:453:52: (iv_ruleTurnLeftCmd= ruleTurnLeftCmd EOF )
            // InternalRoboDsl.g:454:2: iv_ruleTurnLeftCmd= ruleTurnLeftCmd EOF
            {
             newCompositeNode(grammarAccess.getTurnLeftCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnLeftCmd=ruleTurnLeftCmd();

            state._fsp--;

             current =iv_ruleTurnLeftCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnLeftCmd"


    // $ANTLR start "ruleTurnLeftCmd"
    // InternalRoboDsl.g:460:1: ruleTurnLeftCmd returns [EObject current=null] : ( () otherlv_1= 'turnLeft' ) ;
    public final EObject ruleTurnLeftCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoboDsl.g:466:2: ( ( () otherlv_1= 'turnLeft' ) )
            // InternalRoboDsl.g:467:2: ( () otherlv_1= 'turnLeft' )
            {
            // InternalRoboDsl.g:467:2: ( () otherlv_1= 'turnLeft' )
            // InternalRoboDsl.g:468:3: () otherlv_1= 'turnLeft'
            {
            // InternalRoboDsl.g:468:3: ()
            // InternalRoboDsl.g:469:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnLeftCmdAccess().getTurnLeftCmdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnLeftCmdAccess().getTurnLeftKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnLeftCmd"


    // $ANTLR start "entryRuleTraceCmd"
    // InternalRoboDsl.g:483:1: entryRuleTraceCmd returns [EObject current=null] : iv_ruleTraceCmd= ruleTraceCmd EOF ;
    public final EObject entryRuleTraceCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceCmd = null;


        try {
            // InternalRoboDsl.g:483:49: (iv_ruleTraceCmd= ruleTraceCmd EOF )
            // InternalRoboDsl.g:484:2: iv_ruleTraceCmd= ruleTraceCmd EOF
            {
             newCompositeNode(grammarAccess.getTraceCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraceCmd=ruleTraceCmd();

            state._fsp--;

             current =iv_ruleTraceCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraceCmd"


    // $ANTLR start "ruleTraceCmd"
    // InternalRoboDsl.g:490:1: ruleTraceCmd returns [EObject current=null] : ( () otherlv_1= 'trace' ( (lv_trace_2_0= RULE_TRACESTRING ) ) ) ;
    public final EObject ruleTraceCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_trace_2_0=null;


        	enterRule();

        try {
            // InternalRoboDsl.g:496:2: ( ( () otherlv_1= 'trace' ( (lv_trace_2_0= RULE_TRACESTRING ) ) ) )
            // InternalRoboDsl.g:497:2: ( () otherlv_1= 'trace' ( (lv_trace_2_0= RULE_TRACESTRING ) ) )
            {
            // InternalRoboDsl.g:497:2: ( () otherlv_1= 'trace' ( (lv_trace_2_0= RULE_TRACESTRING ) ) )
            // InternalRoboDsl.g:498:3: () otherlv_1= 'trace' ( (lv_trace_2_0= RULE_TRACESTRING ) )
            {
            // InternalRoboDsl.g:498:3: ()
            // InternalRoboDsl.g:499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraceCmdAccess().getTraceCmdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTraceCmdAccess().getTraceKeyword_1());
            		
            // InternalRoboDsl.g:509:3: ( (lv_trace_2_0= RULE_TRACESTRING ) )
            // InternalRoboDsl.g:510:4: (lv_trace_2_0= RULE_TRACESTRING )
            {
            // InternalRoboDsl.g:510:4: (lv_trace_2_0= RULE_TRACESTRING )
            // InternalRoboDsl.g:511:5: lv_trace_2_0= RULE_TRACESTRING
            {
            lv_trace_2_0=(Token)match(input,RULE_TRACESTRING,FOLLOW_2); 

            					newLeafNode(lv_trace_2_0, grammarAccess.getTraceCmdAccess().getTraceTRACESTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTraceCmdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"trace",
            						lv_trace_2_0,
            						"org.xtext.example.robodsl.RoboDsl.TRACESTRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraceCmd"


    // $ANTLR start "entryRuleDropCmd"
    // InternalRoboDsl.g:531:1: entryRuleDropCmd returns [EObject current=null] : iv_ruleDropCmd= ruleDropCmd EOF ;
    public final EObject entryRuleDropCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropCmd = null;


        try {
            // InternalRoboDsl.g:531:48: (iv_ruleDropCmd= ruleDropCmd EOF )
            // InternalRoboDsl.g:532:2: iv_ruleDropCmd= ruleDropCmd EOF
            {
             newCompositeNode(grammarAccess.getDropCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropCmd=ruleDropCmd();

            state._fsp--;

             current =iv_ruleDropCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropCmd"


    // $ANTLR start "ruleDropCmd"
    // InternalRoboDsl.g:538:1: ruleDropCmd returns [EObject current=null] : ( () otherlv_1= 'drop' ) ;
    public final EObject ruleDropCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoboDsl.g:544:2: ( ( () otherlv_1= 'drop' ) )
            // InternalRoboDsl.g:545:2: ( () otherlv_1= 'drop' )
            {
            // InternalRoboDsl.g:545:2: ( () otherlv_1= 'drop' )
            // InternalRoboDsl.g:546:3: () otherlv_1= 'drop'
            {
            // InternalRoboDsl.g:546:3: ()
            // InternalRoboDsl.g:547:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDropCmdAccess().getDropCmdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDropCmdAccess().getDropKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropCmd"


    // $ANTLR start "entryRuleStepCmd"
    // InternalRoboDsl.g:561:1: entryRuleStepCmd returns [EObject current=null] : iv_ruleStepCmd= ruleStepCmd EOF ;
    public final EObject entryRuleStepCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepCmd = null;


        try {
            // InternalRoboDsl.g:561:48: (iv_ruleStepCmd= ruleStepCmd EOF )
            // InternalRoboDsl.g:562:2: iv_ruleStepCmd= ruleStepCmd EOF
            {
             newCompositeNode(grammarAccess.getStepCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepCmd=ruleStepCmd();

            state._fsp--;

             current =iv_ruleStepCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepCmd"


    // $ANTLR start "ruleStepCmd"
    // InternalRoboDsl.g:568:1: ruleStepCmd returns [EObject current=null] : ( () otherlv_1= 'step' ) ;
    public final EObject ruleStepCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoboDsl.g:574:2: ( ( () otherlv_1= 'step' ) )
            // InternalRoboDsl.g:575:2: ( () otherlv_1= 'step' )
            {
            // InternalRoboDsl.g:575:2: ( () otherlv_1= 'step' )
            // InternalRoboDsl.g:576:3: () otherlv_1= 'step'
            {
            // InternalRoboDsl.g:576:3: ()
            // InternalRoboDsl.g:577:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepCmdAccess().getStepCmdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStepCmdAccess().getStepKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepCmd"


    // $ANTLR start "entryRulePickCmd"
    // InternalRoboDsl.g:591:1: entryRulePickCmd returns [EObject current=null] : iv_rulePickCmd= rulePickCmd EOF ;
    public final EObject entryRulePickCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePickCmd = null;


        try {
            // InternalRoboDsl.g:591:48: (iv_rulePickCmd= rulePickCmd EOF )
            // InternalRoboDsl.g:592:2: iv_rulePickCmd= rulePickCmd EOF
            {
             newCompositeNode(grammarAccess.getPickCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePickCmd=rulePickCmd();

            state._fsp--;

             current =iv_rulePickCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePickCmd"


    // $ANTLR start "rulePickCmd"
    // InternalRoboDsl.g:598:1: rulePickCmd returns [EObject current=null] : ( () otherlv_1= 'pick' ) ;
    public final EObject rulePickCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoboDsl.g:604:2: ( ( () otherlv_1= 'pick' ) )
            // InternalRoboDsl.g:605:2: ( () otherlv_1= 'pick' )
            {
            // InternalRoboDsl.g:605:2: ( () otherlv_1= 'pick' )
            // InternalRoboDsl.g:606:3: () otherlv_1= 'pick'
            {
            // InternalRoboDsl.g:606:3: ()
            // InternalRoboDsl.g:607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPickCmdAccess().getPickCmdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPickCmdAccess().getPickKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePickCmd"


    // $ANTLR start "entryRuleDropMarkCmd"
    // InternalRoboDsl.g:621:1: entryRuleDropMarkCmd returns [EObject current=null] : iv_ruleDropMarkCmd= ruleDropMarkCmd EOF ;
    public final EObject entryRuleDropMarkCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropMarkCmd = null;


        try {
            // InternalRoboDsl.g:621:52: (iv_ruleDropMarkCmd= ruleDropMarkCmd EOF )
            // InternalRoboDsl.g:622:2: iv_ruleDropMarkCmd= ruleDropMarkCmd EOF
            {
             newCompositeNode(grammarAccess.getDropMarkCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropMarkCmd=ruleDropMarkCmd();

            state._fsp--;

             current =iv_ruleDropMarkCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropMarkCmd"


    // $ANTLR start "ruleDropMarkCmd"
    // InternalRoboDsl.g:628:1: ruleDropMarkCmd returns [EObject current=null] : ( () otherlv_1= 'dropMark' ( (lv_location_2_0= ruleLocation ) ) ) ;
    public final EObject ruleDropMarkCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_location_2_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:634:2: ( ( () otherlv_1= 'dropMark' ( (lv_location_2_0= ruleLocation ) ) ) )
            // InternalRoboDsl.g:635:2: ( () otherlv_1= 'dropMark' ( (lv_location_2_0= ruleLocation ) ) )
            {
            // InternalRoboDsl.g:635:2: ( () otherlv_1= 'dropMark' ( (lv_location_2_0= ruleLocation ) ) )
            // InternalRoboDsl.g:636:3: () otherlv_1= 'dropMark' ( (lv_location_2_0= ruleLocation ) )
            {
            // InternalRoboDsl.g:636:3: ()
            // InternalRoboDsl.g:637:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDropMarkCmdAccess().getDropMarkCmdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDropMarkCmdAccess().getDropMarkKeyword_1());
            		
            // InternalRoboDsl.g:647:3: ( (lv_location_2_0= ruleLocation ) )
            // InternalRoboDsl.g:648:4: (lv_location_2_0= ruleLocation )
            {
            // InternalRoboDsl.g:648:4: (lv_location_2_0= ruleLocation )
            // InternalRoboDsl.g:649:5: lv_location_2_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getDropMarkCmdAccess().getLocationLocationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_location_2_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropMarkCmdRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_2_0,
            						"org.xtext.example.robodsl.RoboDsl.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropMarkCmd"


    // $ANTLR start "entryRulePickMarkCmd"
    // InternalRoboDsl.g:670:1: entryRulePickMarkCmd returns [EObject current=null] : iv_rulePickMarkCmd= rulePickMarkCmd EOF ;
    public final EObject entryRulePickMarkCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePickMarkCmd = null;


        try {
            // InternalRoboDsl.g:670:52: (iv_rulePickMarkCmd= rulePickMarkCmd EOF )
            // InternalRoboDsl.g:671:2: iv_rulePickMarkCmd= rulePickMarkCmd EOF
            {
             newCompositeNode(grammarAccess.getPickMarkCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePickMarkCmd=rulePickMarkCmd();

            state._fsp--;

             current =iv_rulePickMarkCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePickMarkCmd"


    // $ANTLR start "rulePickMarkCmd"
    // InternalRoboDsl.g:677:1: rulePickMarkCmd returns [EObject current=null] : ( () otherlv_1= 'pickMark' ( (lv_location_2_0= ruleLocation ) ) ) ;
    public final EObject rulePickMarkCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_location_2_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:683:2: ( ( () otherlv_1= 'pickMark' ( (lv_location_2_0= ruleLocation ) ) ) )
            // InternalRoboDsl.g:684:2: ( () otherlv_1= 'pickMark' ( (lv_location_2_0= ruleLocation ) ) )
            {
            // InternalRoboDsl.g:684:2: ( () otherlv_1= 'pickMark' ( (lv_location_2_0= ruleLocation ) ) )
            // InternalRoboDsl.g:685:3: () otherlv_1= 'pickMark' ( (lv_location_2_0= ruleLocation ) )
            {
            // InternalRoboDsl.g:685:3: ()
            // InternalRoboDsl.g:686:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPickMarkCmdAccess().getPickMarkCmdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPickMarkCmdAccess().getPickMarkKeyword_1());
            		
            // InternalRoboDsl.g:696:3: ( (lv_location_2_0= ruleLocation ) )
            // InternalRoboDsl.g:697:4: (lv_location_2_0= ruleLocation )
            {
            // InternalRoboDsl.g:697:4: (lv_location_2_0= ruleLocation )
            // InternalRoboDsl.g:698:5: lv_location_2_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getPickMarkCmdAccess().getLocationLocationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_location_2_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPickMarkCmdRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_2_0,
            						"org.xtext.example.robodsl.RoboDsl.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePickMarkCmd"


    // $ANTLR start "entryRuleDestroyWallCmd"
    // InternalRoboDsl.g:719:1: entryRuleDestroyWallCmd returns [EObject current=null] : iv_ruleDestroyWallCmd= ruleDestroyWallCmd EOF ;
    public final EObject entryRuleDestroyWallCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestroyWallCmd = null;


        try {
            // InternalRoboDsl.g:719:55: (iv_ruleDestroyWallCmd= ruleDestroyWallCmd EOF )
            // InternalRoboDsl.g:720:2: iv_ruleDestroyWallCmd= ruleDestroyWallCmd EOF
            {
             newCompositeNode(grammarAccess.getDestroyWallCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestroyWallCmd=ruleDestroyWallCmd();

            state._fsp--;

             current =iv_ruleDestroyWallCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestroyWallCmd"


    // $ANTLR start "ruleDestroyWallCmd"
    // InternalRoboDsl.g:726:1: ruleDestroyWallCmd returns [EObject current=null] : ( () otherlv_1= 'destroyWall' ( (lv_location_2_0= ruleLocation ) ) ) ;
    public final EObject ruleDestroyWallCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_location_2_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:732:2: ( ( () otherlv_1= 'destroyWall' ( (lv_location_2_0= ruleLocation ) ) ) )
            // InternalRoboDsl.g:733:2: ( () otherlv_1= 'destroyWall' ( (lv_location_2_0= ruleLocation ) ) )
            {
            // InternalRoboDsl.g:733:2: ( () otherlv_1= 'destroyWall' ( (lv_location_2_0= ruleLocation ) ) )
            // InternalRoboDsl.g:734:3: () otherlv_1= 'destroyWall' ( (lv_location_2_0= ruleLocation ) )
            {
            // InternalRoboDsl.g:734:3: ()
            // InternalRoboDsl.g:735:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDestroyWallCmdAccess().getDestroyWallCmdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDestroyWallCmdAccess().getDestroyWallKeyword_1());
            		
            // InternalRoboDsl.g:745:3: ( (lv_location_2_0= ruleLocation ) )
            // InternalRoboDsl.g:746:4: (lv_location_2_0= ruleLocation )
            {
            // InternalRoboDsl.g:746:4: (lv_location_2_0= ruleLocation )
            // InternalRoboDsl.g:747:5: lv_location_2_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getDestroyWallCmdAccess().getLocationLocationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_location_2_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDestroyWallCmdRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_2_0,
            						"org.xtext.example.robodsl.RoboDsl.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestroyWallCmd"


    // $ANTLR start "entryRuleBuildWallCmd"
    // InternalRoboDsl.g:768:1: entryRuleBuildWallCmd returns [EObject current=null] : iv_ruleBuildWallCmd= ruleBuildWallCmd EOF ;
    public final EObject entryRuleBuildWallCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildWallCmd = null;


        try {
            // InternalRoboDsl.g:768:53: (iv_ruleBuildWallCmd= ruleBuildWallCmd EOF )
            // InternalRoboDsl.g:769:2: iv_ruleBuildWallCmd= ruleBuildWallCmd EOF
            {
             newCompositeNode(grammarAccess.getBuildWallCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildWallCmd=ruleBuildWallCmd();

            state._fsp--;

             current =iv_ruleBuildWallCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuildWallCmd"


    // $ANTLR start "ruleBuildWallCmd"
    // InternalRoboDsl.g:775:1: ruleBuildWallCmd returns [EObject current=null] : ( () otherlv_1= 'buildWall' ( (lv_location_2_0= ruleLocation ) ) ) ;
    public final EObject ruleBuildWallCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_location_2_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:781:2: ( ( () otherlv_1= 'buildWall' ( (lv_location_2_0= ruleLocation ) ) ) )
            // InternalRoboDsl.g:782:2: ( () otherlv_1= 'buildWall' ( (lv_location_2_0= ruleLocation ) ) )
            {
            // InternalRoboDsl.g:782:2: ( () otherlv_1= 'buildWall' ( (lv_location_2_0= ruleLocation ) ) )
            // InternalRoboDsl.g:783:3: () otherlv_1= 'buildWall' ( (lv_location_2_0= ruleLocation ) )
            {
            // InternalRoboDsl.g:783:3: ()
            // InternalRoboDsl.g:784:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBuildWallCmdAccess().getBuildWallCmdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getBuildWallCmdAccess().getBuildWallKeyword_1());
            		
            // InternalRoboDsl.g:794:3: ( (lv_location_2_0= ruleLocation ) )
            // InternalRoboDsl.g:795:4: (lv_location_2_0= ruleLocation )
            {
            // InternalRoboDsl.g:795:4: (lv_location_2_0= ruleLocation )
            // InternalRoboDsl.g:796:5: lv_location_2_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getBuildWallCmdAccess().getLocationLocationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_location_2_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuildWallCmdRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_2_0,
            						"org.xtext.example.robodsl.RoboDsl.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuildWallCmd"


    // $ANTLR start "entryRuleLocation"
    // InternalRoboDsl.g:817:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalRoboDsl.g:817:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalRoboDsl.g:818:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalRoboDsl.g:824:1: ruleLocation returns [EObject current=null] : ( () otherlv_1= 'row:' ( (lv_row_2_0= ruleEInteger ) ) otherlv_3= 'col:' ( (lv_col_4_0= ruleEInteger ) ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_row_2_0 = null;

        AntlrDatatypeRuleToken lv_col_4_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:830:2: ( ( () otherlv_1= 'row:' ( (lv_row_2_0= ruleEInteger ) ) otherlv_3= 'col:' ( (lv_col_4_0= ruleEInteger ) ) ) )
            // InternalRoboDsl.g:831:2: ( () otherlv_1= 'row:' ( (lv_row_2_0= ruleEInteger ) ) otherlv_3= 'col:' ( (lv_col_4_0= ruleEInteger ) ) )
            {
            // InternalRoboDsl.g:831:2: ( () otherlv_1= 'row:' ( (lv_row_2_0= ruleEInteger ) ) otherlv_3= 'col:' ( (lv_col_4_0= ruleEInteger ) ) )
            // InternalRoboDsl.g:832:3: () otherlv_1= 'row:' ( (lv_row_2_0= ruleEInteger ) ) otherlv_3= 'col:' ( (lv_col_4_0= ruleEInteger ) )
            {
            // InternalRoboDsl.g:832:3: ()
            // InternalRoboDsl.g:833:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocationAccess().getLocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getRowKeyword_1());
            		
            // InternalRoboDsl.g:843:3: ( (lv_row_2_0= ruleEInteger ) )
            // InternalRoboDsl.g:844:4: (lv_row_2_0= ruleEInteger )
            {
            // InternalRoboDsl.g:844:4: (lv_row_2_0= ruleEInteger )
            // InternalRoboDsl.g:845:5: lv_row_2_0= ruleEInteger
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getRowEIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_row_2_0=ruleEInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"row",
            						lv_row_2_0,
            						"org.xtext.example.robodsl.RoboDsl.EInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getColKeyword_3());
            		
            // InternalRoboDsl.g:866:3: ( (lv_col_4_0= ruleEInteger ) )
            // InternalRoboDsl.g:867:4: (lv_col_4_0= ruleEInteger )
            {
            // InternalRoboDsl.g:867:4: (lv_col_4_0= ruleEInteger )
            // InternalRoboDsl.g:868:5: lv_col_4_0= ruleEInteger
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getColEIntegerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_col_4_0=ruleEInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"col",
            						lv_col_4_0,
            						"org.xtext.example.robodsl.RoboDsl.EInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleIfStatement"
    // InternalRoboDsl.g:889:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalRoboDsl.g:889:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalRoboDsl.g:890:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalRoboDsl.g:896:1: ruleIfStatement returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_conditionmodel_2_0= ruleConditionModel ) ) otherlv_3= 'do' ( (lv_subbody_4_0= ruleSubBody ) ) (otherlv_5= 'else' otherlv_6= 'do' ( (lv_elsebody_7_0= ruleSubBody ) ) )? otherlv_8= 'end' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_conditionmodel_2_0 = null;

        EObject lv_subbody_4_0 = null;

        EObject lv_elsebody_7_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:902:2: ( ( () otherlv_1= 'if' ( (lv_conditionmodel_2_0= ruleConditionModel ) ) otherlv_3= 'do' ( (lv_subbody_4_0= ruleSubBody ) ) (otherlv_5= 'else' otherlv_6= 'do' ( (lv_elsebody_7_0= ruleSubBody ) ) )? otherlv_8= 'end' ) )
            // InternalRoboDsl.g:903:2: ( () otherlv_1= 'if' ( (lv_conditionmodel_2_0= ruleConditionModel ) ) otherlv_3= 'do' ( (lv_subbody_4_0= ruleSubBody ) ) (otherlv_5= 'else' otherlv_6= 'do' ( (lv_elsebody_7_0= ruleSubBody ) ) )? otherlv_8= 'end' )
            {
            // InternalRoboDsl.g:903:2: ( () otherlv_1= 'if' ( (lv_conditionmodel_2_0= ruleConditionModel ) ) otherlv_3= 'do' ( (lv_subbody_4_0= ruleSubBody ) ) (otherlv_5= 'else' otherlv_6= 'do' ( (lv_elsebody_7_0= ruleSubBody ) ) )? otherlv_8= 'end' )
            // InternalRoboDsl.g:904:3: () otherlv_1= 'if' ( (lv_conditionmodel_2_0= ruleConditionModel ) ) otherlv_3= 'do' ( (lv_subbody_4_0= ruleSubBody ) ) (otherlv_5= 'else' otherlv_6= 'do' ( (lv_elsebody_7_0= ruleSubBody ) ) )? otherlv_8= 'end'
            {
            // InternalRoboDsl.g:904:3: ()
            // InternalRoboDsl.g:905:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfStatementAccess().getIfStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getIfKeyword_1());
            		
            // InternalRoboDsl.g:915:3: ( (lv_conditionmodel_2_0= ruleConditionModel ) )
            // InternalRoboDsl.g:916:4: (lv_conditionmodel_2_0= ruleConditionModel )
            {
            // InternalRoboDsl.g:916:4: (lv_conditionmodel_2_0= ruleConditionModel )
            // InternalRoboDsl.g:917:5: lv_conditionmodel_2_0= ruleConditionModel
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionmodelConditionModelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_conditionmodel_2_0=ruleConditionModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"conditionmodel",
            						lv_conditionmodel_2_0,
            						"org.xtext.example.robodsl.RoboDsl.ConditionModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getDoKeyword_3());
            		
            // InternalRoboDsl.g:938:3: ( (lv_subbody_4_0= ruleSubBody ) )
            // InternalRoboDsl.g:939:4: (lv_subbody_4_0= ruleSubBody )
            {
            // InternalRoboDsl.g:939:4: (lv_subbody_4_0= ruleSubBody )
            // InternalRoboDsl.g:940:5: lv_subbody_4_0= ruleSubBody
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getSubbodySubBodyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_subbody_4_0=ruleSubBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"subbody",
            						lv_subbody_4_0,
            						"org.xtext.example.robodsl.RoboDsl.SubBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRoboDsl.g:957:3: (otherlv_5= 'else' otherlv_6= 'do' ( (lv_elsebody_7_0= ruleSubBody ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoboDsl.g:958:4: otherlv_5= 'else' otherlv_6= 'do' ( (lv_elsebody_7_0= ruleSubBody ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getDoKeyword_5_1());
                    			
                    // InternalRoboDsl.g:966:4: ( (lv_elsebody_7_0= ruleSubBody ) )
                    // InternalRoboDsl.g:967:5: (lv_elsebody_7_0= ruleSubBody )
                    {
                    // InternalRoboDsl.g:967:5: (lv_elsebody_7_0= ruleSubBody )
                    // InternalRoboDsl.g:968:6: lv_elsebody_7_0= ruleSubBody
                    {

                    						newCompositeNode(grammarAccess.getIfStatementAccess().getElsebodySubBodyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elsebody_7_0=ruleSubBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    						}
                    						set(
                    							current,
                    							"elsebody",
                    							lv_elsebody_7_0,
                    							"org.xtext.example.robodsl.RoboDsl.SubBody");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalRoboDsl.g:994:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalRoboDsl.g:994:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalRoboDsl.g:995:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;

             current =iv_ruleWhileStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalRoboDsl.g:1001:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' ( (lv_conditionmodel_2_0= ruleConditionModel ) ) otherlv_3= 'do' ( (lv_subbody_4_0= ruleSubBody ) ) otherlv_5= 'end' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_conditionmodel_2_0 = null;

        EObject lv_subbody_4_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:1007:2: ( ( () otherlv_1= 'while' ( (lv_conditionmodel_2_0= ruleConditionModel ) ) otherlv_3= 'do' ( (lv_subbody_4_0= ruleSubBody ) ) otherlv_5= 'end' ) )
            // InternalRoboDsl.g:1008:2: ( () otherlv_1= 'while' ( (lv_conditionmodel_2_0= ruleConditionModel ) ) otherlv_3= 'do' ( (lv_subbody_4_0= ruleSubBody ) ) otherlv_5= 'end' )
            {
            // InternalRoboDsl.g:1008:2: ( () otherlv_1= 'while' ( (lv_conditionmodel_2_0= ruleConditionModel ) ) otherlv_3= 'do' ( (lv_subbody_4_0= ruleSubBody ) ) otherlv_5= 'end' )
            // InternalRoboDsl.g:1009:3: () otherlv_1= 'while' ( (lv_conditionmodel_2_0= ruleConditionModel ) ) otherlv_3= 'do' ( (lv_subbody_4_0= ruleSubBody ) ) otherlv_5= 'end'
            {
            // InternalRoboDsl.g:1009:3: ()
            // InternalRoboDsl.g:1010:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileStatementAccess().getWhileStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
            		
            // InternalRoboDsl.g:1020:3: ( (lv_conditionmodel_2_0= ruleConditionModel ) )
            // InternalRoboDsl.g:1021:4: (lv_conditionmodel_2_0= ruleConditionModel )
            {
            // InternalRoboDsl.g:1021:4: (lv_conditionmodel_2_0= ruleConditionModel )
            // InternalRoboDsl.g:1022:5: lv_conditionmodel_2_0= ruleConditionModel
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionmodelConditionModelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_conditionmodel_2_0=ruleConditionModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"conditionmodel",
            						lv_conditionmodel_2_0,
            						"org.xtext.example.robodsl.RoboDsl.ConditionModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getDoKeyword_3());
            		
            // InternalRoboDsl.g:1043:3: ( (lv_subbody_4_0= ruleSubBody ) )
            // InternalRoboDsl.g:1044:4: (lv_subbody_4_0= ruleSubBody )
            {
            // InternalRoboDsl.g:1044:4: (lv_subbody_4_0= ruleSubBody )
            // InternalRoboDsl.g:1045:5: lv_subbody_4_0= ruleSubBody
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getSubbodySubBodyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_subbody_4_0=ruleSubBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"subbody",
            						lv_subbody_4_0,
            						"org.xtext.example.robodsl.RoboDsl.SubBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWhileStatementAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleRepeateStatement"
    // InternalRoboDsl.g:1070:1: entryRuleRepeateStatement returns [EObject current=null] : iv_ruleRepeateStatement= ruleRepeateStatement EOF ;
    public final EObject entryRuleRepeateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeateStatement = null;


        try {
            // InternalRoboDsl.g:1070:57: (iv_ruleRepeateStatement= ruleRepeateStatement EOF )
            // InternalRoboDsl.g:1071:2: iv_ruleRepeateStatement= ruleRepeateStatement EOF
            {
             newCompositeNode(grammarAccess.getRepeateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeateStatement=ruleRepeateStatement();

            state._fsp--;

             current =iv_ruleRepeateStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepeateStatement"


    // $ANTLR start "ruleRepeateStatement"
    // InternalRoboDsl.g:1077:1: ruleRepeateStatement returns [EObject current=null] : ( () otherlv_1= 'Repeat' ( (lv_count_2_0= ruleEInteger ) ) otherlv_3= 'times' ( (lv_subbody_4_0= ruleSubBody ) ) otherlv_5= 'end' ) ;
    public final EObject ruleRepeateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_count_2_0 = null;

        EObject lv_subbody_4_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:1083:2: ( ( () otherlv_1= 'Repeat' ( (lv_count_2_0= ruleEInteger ) ) otherlv_3= 'times' ( (lv_subbody_4_0= ruleSubBody ) ) otherlv_5= 'end' ) )
            // InternalRoboDsl.g:1084:2: ( () otherlv_1= 'Repeat' ( (lv_count_2_0= ruleEInteger ) ) otherlv_3= 'times' ( (lv_subbody_4_0= ruleSubBody ) ) otherlv_5= 'end' )
            {
            // InternalRoboDsl.g:1084:2: ( () otherlv_1= 'Repeat' ( (lv_count_2_0= ruleEInteger ) ) otherlv_3= 'times' ( (lv_subbody_4_0= ruleSubBody ) ) otherlv_5= 'end' )
            // InternalRoboDsl.g:1085:3: () otherlv_1= 'Repeat' ( (lv_count_2_0= ruleEInteger ) ) otherlv_3= 'times' ( (lv_subbody_4_0= ruleSubBody ) ) otherlv_5= 'end'
            {
            // InternalRoboDsl.g:1085:3: ()
            // InternalRoboDsl.g:1086:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepeateStatementAccess().getRepeateStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRepeateStatementAccess().getRepeatKeyword_1());
            		
            // InternalRoboDsl.g:1096:3: ( (lv_count_2_0= ruleEInteger ) )
            // InternalRoboDsl.g:1097:4: (lv_count_2_0= ruleEInteger )
            {
            // InternalRoboDsl.g:1097:4: (lv_count_2_0= ruleEInteger )
            // InternalRoboDsl.g:1098:5: lv_count_2_0= ruleEInteger
            {

            					newCompositeNode(grammarAccess.getRepeateStatementAccess().getCountEIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_count_2_0=ruleEInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeateStatementRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_2_0,
            						"org.xtext.example.robodsl.RoboDsl.EInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRepeateStatementAccess().getTimesKeyword_3());
            		
            // InternalRoboDsl.g:1119:3: ( (lv_subbody_4_0= ruleSubBody ) )
            // InternalRoboDsl.g:1120:4: (lv_subbody_4_0= ruleSubBody )
            {
            // InternalRoboDsl.g:1120:4: (lv_subbody_4_0= ruleSubBody )
            // InternalRoboDsl.g:1121:5: lv_subbody_4_0= ruleSubBody
            {

            					newCompositeNode(grammarAccess.getRepeateStatementAccess().getSubbodySubBodyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_subbody_4_0=ruleSubBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeateStatementRule());
            					}
            					set(
            						current,
            						"subbody",
            						lv_subbody_4_0,
            						"org.xtext.example.robodsl.RoboDsl.SubBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRepeateStatementAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepeateStatement"


    // $ANTLR start "entryRuleConditionModel"
    // InternalRoboDsl.g:1146:1: entryRuleConditionModel returns [EObject current=null] : iv_ruleConditionModel= ruleConditionModel EOF ;
    public final EObject entryRuleConditionModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionModel = null;


        try {
            // InternalRoboDsl.g:1146:55: (iv_ruleConditionModel= ruleConditionModel EOF )
            // InternalRoboDsl.g:1147:2: iv_ruleConditionModel= ruleConditionModel EOF
            {
             newCompositeNode(grammarAccess.getConditionModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionModel=ruleConditionModel();

            state._fsp--;

             current =iv_ruleConditionModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionModel"


    // $ANTLR start "ruleConditionModel"
    // InternalRoboDsl.g:1153:1: ruleConditionModel returns [EObject current=null] : this_OrCond_0= ruleOrCond ;
    public final EObject ruleConditionModel() throws RecognitionException {
        EObject current = null;

        EObject this_OrCond_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:1159:2: (this_OrCond_0= ruleOrCond )
            // InternalRoboDsl.g:1160:2: this_OrCond_0= ruleOrCond
            {

            		newCompositeNode(grammarAccess.getConditionModelAccess().getOrCondParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrCond_0=ruleOrCond();

            state._fsp--;


            		current = this_OrCond_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionModel"


    // $ANTLR start "entryRuleOrCond"
    // InternalRoboDsl.g:1171:1: entryRuleOrCond returns [EObject current=null] : iv_ruleOrCond= ruleOrCond EOF ;
    public final EObject entryRuleOrCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrCond = null;


        try {
            // InternalRoboDsl.g:1171:47: (iv_ruleOrCond= ruleOrCond EOF )
            // InternalRoboDsl.g:1172:2: iv_ruleOrCond= ruleOrCond EOF
            {
             newCompositeNode(grammarAccess.getOrCondRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrCond=ruleOrCond();

            state._fsp--;

             current =iv_ruleOrCond; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrCond"


    // $ANTLR start "ruleOrCond"
    // InternalRoboDsl.g:1178:1: ruleOrCond returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleAndCond ) ) (otherlv_1= 'or' ( (lv_rhs_2_0= ruleOrCond ) ) )? ) ;
    public final EObject ruleOrCond() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:1184:2: ( ( ( (lv_lhs_0_0= ruleAndCond ) ) (otherlv_1= 'or' ( (lv_rhs_2_0= ruleOrCond ) ) )? ) )
            // InternalRoboDsl.g:1185:2: ( ( (lv_lhs_0_0= ruleAndCond ) ) (otherlv_1= 'or' ( (lv_rhs_2_0= ruleOrCond ) ) )? )
            {
            // InternalRoboDsl.g:1185:2: ( ( (lv_lhs_0_0= ruleAndCond ) ) (otherlv_1= 'or' ( (lv_rhs_2_0= ruleOrCond ) ) )? )
            // InternalRoboDsl.g:1186:3: ( (lv_lhs_0_0= ruleAndCond ) ) (otherlv_1= 'or' ( (lv_rhs_2_0= ruleOrCond ) ) )?
            {
            // InternalRoboDsl.g:1186:3: ( (lv_lhs_0_0= ruleAndCond ) )
            // InternalRoboDsl.g:1187:4: (lv_lhs_0_0= ruleAndCond )
            {
            // InternalRoboDsl.g:1187:4: (lv_lhs_0_0= ruleAndCond )
            // InternalRoboDsl.g:1188:5: lv_lhs_0_0= ruleAndCond
            {

            					newCompositeNode(grammarAccess.getOrCondAccess().getLhsAndCondParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_lhs_0_0=ruleAndCond();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrCondRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.xtext.example.robodsl.RoboDsl.AndCond");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRoboDsl.g:1205:3: (otherlv_1= 'or' ( (lv_rhs_2_0= ruleOrCond ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoboDsl.g:1206:4: otherlv_1= 'or' ( (lv_rhs_2_0= ruleOrCond ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getOrCondAccess().getOrKeyword_1_0());
                    			
                    // InternalRoboDsl.g:1210:4: ( (lv_rhs_2_0= ruleOrCond ) )
                    // InternalRoboDsl.g:1211:5: (lv_rhs_2_0= ruleOrCond )
                    {
                    // InternalRoboDsl.g:1211:5: (lv_rhs_2_0= ruleOrCond )
                    // InternalRoboDsl.g:1212:6: lv_rhs_2_0= ruleOrCond
                    {

                    						newCompositeNode(grammarAccess.getOrCondAccess().getRhsOrCondParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rhs_2_0=ruleOrCond();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrCondRule());
                    						}
                    						set(
                    							current,
                    							"rhs",
                    							lv_rhs_2_0,
                    							"org.xtext.example.robodsl.RoboDsl.OrCond");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrCond"


    // $ANTLR start "entryRuleAndCond"
    // InternalRoboDsl.g:1234:1: entryRuleAndCond returns [EObject current=null] : iv_ruleAndCond= ruleAndCond EOF ;
    public final EObject entryRuleAndCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndCond = null;


        try {
            // InternalRoboDsl.g:1234:48: (iv_ruleAndCond= ruleAndCond EOF )
            // InternalRoboDsl.g:1235:2: iv_ruleAndCond= ruleAndCond EOF
            {
             newCompositeNode(grammarAccess.getAndCondRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndCond=ruleAndCond();

            state._fsp--;

             current =iv_ruleAndCond; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndCond"


    // $ANTLR start "ruleAndCond"
    // InternalRoboDsl.g:1241:1: ruleAndCond returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleNotCond ) ) (otherlv_1= 'and' ( (lv_rhs_2_0= ruleAndCond ) ) )? ) ;
    public final EObject ruleAndCond() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:1247:2: ( ( ( (lv_lhs_0_0= ruleNotCond ) ) (otherlv_1= 'and' ( (lv_rhs_2_0= ruleAndCond ) ) )? ) )
            // InternalRoboDsl.g:1248:2: ( ( (lv_lhs_0_0= ruleNotCond ) ) (otherlv_1= 'and' ( (lv_rhs_2_0= ruleAndCond ) ) )? )
            {
            // InternalRoboDsl.g:1248:2: ( ( (lv_lhs_0_0= ruleNotCond ) ) (otherlv_1= 'and' ( (lv_rhs_2_0= ruleAndCond ) ) )? )
            // InternalRoboDsl.g:1249:3: ( (lv_lhs_0_0= ruleNotCond ) ) (otherlv_1= 'and' ( (lv_rhs_2_0= ruleAndCond ) ) )?
            {
            // InternalRoboDsl.g:1249:3: ( (lv_lhs_0_0= ruleNotCond ) )
            // InternalRoboDsl.g:1250:4: (lv_lhs_0_0= ruleNotCond )
            {
            // InternalRoboDsl.g:1250:4: (lv_lhs_0_0= ruleNotCond )
            // InternalRoboDsl.g:1251:5: lv_lhs_0_0= ruleNotCond
            {

            					newCompositeNode(grammarAccess.getAndCondAccess().getLhsNotCondParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_lhs_0_0=ruleNotCond();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndCondRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.xtext.example.robodsl.RoboDsl.NotCond");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRoboDsl.g:1268:3: (otherlv_1= 'and' ( (lv_rhs_2_0= ruleAndCond ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoboDsl.g:1269:4: otherlv_1= 'and' ( (lv_rhs_2_0= ruleAndCond ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getAndCondAccess().getAndKeyword_1_0());
                    			
                    // InternalRoboDsl.g:1273:4: ( (lv_rhs_2_0= ruleAndCond ) )
                    // InternalRoboDsl.g:1274:5: (lv_rhs_2_0= ruleAndCond )
                    {
                    // InternalRoboDsl.g:1274:5: (lv_rhs_2_0= ruleAndCond )
                    // InternalRoboDsl.g:1275:6: lv_rhs_2_0= ruleAndCond
                    {

                    						newCompositeNode(grammarAccess.getAndCondAccess().getRhsAndCondParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rhs_2_0=ruleAndCond();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndCondRule());
                    						}
                    						set(
                    							current,
                    							"rhs",
                    							lv_rhs_2_0,
                    							"org.xtext.example.robodsl.RoboDsl.AndCond");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndCond"


    // $ANTLR start "entryRuleNotCond"
    // InternalRoboDsl.g:1297:1: entryRuleNotCond returns [EObject current=null] : iv_ruleNotCond= ruleNotCond EOF ;
    public final EObject entryRuleNotCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotCond = null;


        try {
            // InternalRoboDsl.g:1297:48: (iv_ruleNotCond= ruleNotCond EOF )
            // InternalRoboDsl.g:1298:2: iv_ruleNotCond= ruleNotCond EOF
            {
             newCompositeNode(grammarAccess.getNotCondRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotCond=ruleNotCond();

            state._fsp--;

             current =iv_ruleNotCond; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotCond"


    // $ANTLR start "ruleNotCond"
    // InternalRoboDsl.g:1304:1: ruleNotCond returns [EObject current=null] : ( ( (lv_not_0_0= 'not' ) )? ( (lv_brackets_1_0= ruleBracketsCond ) ) ) ;
    public final EObject ruleNotCond() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        EObject lv_brackets_1_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:1310:2: ( ( ( (lv_not_0_0= 'not' ) )? ( (lv_brackets_1_0= ruleBracketsCond ) ) ) )
            // InternalRoboDsl.g:1311:2: ( ( (lv_not_0_0= 'not' ) )? ( (lv_brackets_1_0= ruleBracketsCond ) ) )
            {
            // InternalRoboDsl.g:1311:2: ( ( (lv_not_0_0= 'not' ) )? ( (lv_brackets_1_0= ruleBracketsCond ) ) )
            // InternalRoboDsl.g:1312:3: ( (lv_not_0_0= 'not' ) )? ( (lv_brackets_1_0= ruleBracketsCond ) )
            {
            // InternalRoboDsl.g:1312:3: ( (lv_not_0_0= 'not' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoboDsl.g:1313:4: (lv_not_0_0= 'not' )
                    {
                    // InternalRoboDsl.g:1313:4: (lv_not_0_0= 'not' )
                    // InternalRoboDsl.g:1314:5: lv_not_0_0= 'not'
                    {
                    lv_not_0_0=(Token)match(input,36,FOLLOW_13); 

                    					newLeafNode(lv_not_0_0, grammarAccess.getNotCondAccess().getNotNotKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNotCondRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalRoboDsl.g:1326:3: ( (lv_brackets_1_0= ruleBracketsCond ) )
            // InternalRoboDsl.g:1327:4: (lv_brackets_1_0= ruleBracketsCond )
            {
            // InternalRoboDsl.g:1327:4: (lv_brackets_1_0= ruleBracketsCond )
            // InternalRoboDsl.g:1328:5: lv_brackets_1_0= ruleBracketsCond
            {

            					newCompositeNode(grammarAccess.getNotCondAccess().getBracketsBracketsCondParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_brackets_1_0=ruleBracketsCond();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotCondRule());
            					}
            					set(
            						current,
            						"brackets",
            						lv_brackets_1_0,
            						"org.xtext.example.robodsl.RoboDsl.BracketsCond");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotCond"


    // $ANTLR start "entryRuleBracketsCond"
    // InternalRoboDsl.g:1349:1: entryRuleBracketsCond returns [EObject current=null] : iv_ruleBracketsCond= ruleBracketsCond EOF ;
    public final EObject entryRuleBracketsCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracketsCond = null;


        try {
            // InternalRoboDsl.g:1349:53: (iv_ruleBracketsCond= ruleBracketsCond EOF )
            // InternalRoboDsl.g:1350:2: iv_ruleBracketsCond= ruleBracketsCond EOF
            {
             newCompositeNode(grammarAccess.getBracketsCondRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBracketsCond=ruleBracketsCond();

            state._fsp--;

             current =iv_ruleBracketsCond; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBracketsCond"


    // $ANTLR start "ruleBracketsCond"
    // InternalRoboDsl.g:1356:1: ruleBracketsCond returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_orcond_1_0= ruleOrCond ) ) otherlv_2= ')' ) | ( (lv_condition_3_0= ruleCondition ) ) ) ;
    public final EObject ruleBracketsCond() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_orcond_1_0 = null;

        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:1362:2: ( ( (otherlv_0= '(' ( (lv_orcond_1_0= ruleOrCond ) ) otherlv_2= ')' ) | ( (lv_condition_3_0= ruleCondition ) ) ) )
            // InternalRoboDsl.g:1363:2: ( (otherlv_0= '(' ( (lv_orcond_1_0= ruleOrCond ) ) otherlv_2= ')' ) | ( (lv_condition_3_0= ruleCondition ) ) )
            {
            // InternalRoboDsl.g:1363:2: ( (otherlv_0= '(' ( (lv_orcond_1_0= ruleOrCond ) ) otherlv_2= ')' ) | ( (lv_condition_3_0= ruleCondition ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==37) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=39 && LA8_0<=41)||LA8_0==43) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoboDsl.g:1364:3: (otherlv_0= '(' ( (lv_orcond_1_0= ruleOrCond ) ) otherlv_2= ')' )
                    {
                    // InternalRoboDsl.g:1364:3: (otherlv_0= '(' ( (lv_orcond_1_0= ruleOrCond ) ) otherlv_2= ')' )
                    // InternalRoboDsl.g:1365:4: otherlv_0= '(' ( (lv_orcond_1_0= ruleOrCond ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getBracketsCondAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalRoboDsl.g:1369:4: ( (lv_orcond_1_0= ruleOrCond ) )
                    // InternalRoboDsl.g:1370:5: (lv_orcond_1_0= ruleOrCond )
                    {
                    // InternalRoboDsl.g:1370:5: (lv_orcond_1_0= ruleOrCond )
                    // InternalRoboDsl.g:1371:6: lv_orcond_1_0= ruleOrCond
                    {

                    						newCompositeNode(grammarAccess.getBracketsCondAccess().getOrcondOrCondParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_orcond_1_0=ruleOrCond();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBracketsCondRule());
                    						}
                    						set(
                    							current,
                    							"orcond",
                    							lv_orcond_1_0,
                    							"org.xtext.example.robodsl.RoboDsl.OrCond");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBracketsCondAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboDsl.g:1394:3: ( (lv_condition_3_0= ruleCondition ) )
                    {
                    // InternalRoboDsl.g:1394:3: ( (lv_condition_3_0= ruleCondition ) )
                    // InternalRoboDsl.g:1395:4: (lv_condition_3_0= ruleCondition )
                    {
                    // InternalRoboDsl.g:1395:4: (lv_condition_3_0= ruleCondition )
                    // InternalRoboDsl.g:1396:5: lv_condition_3_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getBracketsCondAccess().getConditionConditionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBracketsCondRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_3_0,
                    						"org.xtext.example.robodsl.RoboDsl.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBracketsCond"


    // $ANTLR start "entryRuleCondition"
    // InternalRoboDsl.g:1417:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalRoboDsl.g:1417:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalRoboDsl.g:1418:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalRoboDsl.g:1424:1: ruleCondition returns [EObject current=null] : (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Full_0 = null;

        EObject this_Mark_1 = null;

        EObject this_WallAhead_2 = null;

        EObject this_Heading_3 = null;



        	enterRule();

        try {
            // InternalRoboDsl.g:1430:2: ( (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading ) )
            // InternalRoboDsl.g:1431:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading )
            {
            // InternalRoboDsl.g:1431:2: (this_Full_0= ruleFull | this_Mark_1= ruleMark | this_WallAhead_2= ruleWallAhead | this_Heading_3= ruleHeading )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            case 43:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRoboDsl.g:1432:3: this_Full_0= ruleFull
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getFullParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Full_0=ruleFull();

                    state._fsp--;


                    			current = this_Full_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRoboDsl.g:1441:3: this_Mark_1= ruleMark
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getMarkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mark_1=ruleMark();

                    state._fsp--;


                    			current = this_Mark_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRoboDsl.g:1450:3: this_WallAhead_2= ruleWallAhead
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getWallAheadParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WallAhead_2=ruleWallAhead();

                    state._fsp--;


                    			current = this_WallAhead_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRoboDsl.g:1459:3: this_Heading_3= ruleHeading
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getHeadingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Heading_3=ruleHeading();

                    state._fsp--;


                    			current = this_Heading_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleFull"
    // InternalRoboDsl.g:1471:1: entryRuleFull returns [EObject current=null] : iv_ruleFull= ruleFull EOF ;
    public final EObject entryRuleFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFull = null;


        try {
            // InternalRoboDsl.g:1471:45: (iv_ruleFull= ruleFull EOF )
            // InternalRoboDsl.g:1472:2: iv_ruleFull= ruleFull EOF
            {
             newCompositeNode(grammarAccess.getFullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFull=ruleFull();

            state._fsp--;

             current =iv_ruleFull; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFull"


    // $ANTLR start "ruleFull"
    // InternalRoboDsl.g:1478:1: ruleFull returns [EObject current=null] : ( () otherlv_1= 'full' ) ;
    public final EObject ruleFull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoboDsl.g:1484:2: ( ( () otherlv_1= 'full' ) )
            // InternalRoboDsl.g:1485:2: ( () otherlv_1= 'full' )
            {
            // InternalRoboDsl.g:1485:2: ( () otherlv_1= 'full' )
            // InternalRoboDsl.g:1486:3: () otherlv_1= 'full'
            {
            // InternalRoboDsl.g:1486:3: ()
            // InternalRoboDsl.g:1487:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFullAccess().getConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFullAccess().getFullKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFull"


    // $ANTLR start "entryRuleMark"
    // InternalRoboDsl.g:1501:1: entryRuleMark returns [EObject current=null] : iv_ruleMark= ruleMark EOF ;
    public final EObject entryRuleMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMark = null;


        try {
            // InternalRoboDsl.g:1501:45: (iv_ruleMark= ruleMark EOF )
            // InternalRoboDsl.g:1502:2: iv_ruleMark= ruleMark EOF
            {
             newCompositeNode(grammarAccess.getMarkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMark=ruleMark();

            state._fsp--;

             current =iv_ruleMark; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMark"


    // $ANTLR start "ruleMark"
    // InternalRoboDsl.g:1508:1: ruleMark returns [EObject current=null] : ( () otherlv_1= 'mark' ) ;
    public final EObject ruleMark() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoboDsl.g:1514:2: ( ( () otherlv_1= 'mark' ) )
            // InternalRoboDsl.g:1515:2: ( () otherlv_1= 'mark' )
            {
            // InternalRoboDsl.g:1515:2: ( () otherlv_1= 'mark' )
            // InternalRoboDsl.g:1516:3: () otherlv_1= 'mark'
            {
            // InternalRoboDsl.g:1516:3: ()
            // InternalRoboDsl.g:1517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarkAccess().getConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMarkAccess().getMarkKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMark"


    // $ANTLR start "entryRuleWallAhead"
    // InternalRoboDsl.g:1531:1: entryRuleWallAhead returns [EObject current=null] : iv_ruleWallAhead= ruleWallAhead EOF ;
    public final EObject entryRuleWallAhead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWallAhead = null;


        try {
            // InternalRoboDsl.g:1531:50: (iv_ruleWallAhead= ruleWallAhead EOF )
            // InternalRoboDsl.g:1532:2: iv_ruleWallAhead= ruleWallAhead EOF
            {
             newCompositeNode(grammarAccess.getWallAheadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWallAhead=ruleWallAhead();

            state._fsp--;

             current =iv_ruleWallAhead; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWallAhead"


    // $ANTLR start "ruleWallAhead"
    // InternalRoboDsl.g:1538:1: ruleWallAhead returns [EObject current=null] : ( () otherlv_1= 'wall' otherlv_2= 'ahead' ) ;
    public final EObject ruleWallAhead() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRoboDsl.g:1544:2: ( ( () otherlv_1= 'wall' otherlv_2= 'ahead' ) )
            // InternalRoboDsl.g:1545:2: ( () otherlv_1= 'wall' otherlv_2= 'ahead' )
            {
            // InternalRoboDsl.g:1545:2: ( () otherlv_1= 'wall' otherlv_2= 'ahead' )
            // InternalRoboDsl.g:1546:3: () otherlv_1= 'wall' otherlv_2= 'ahead'
            {
            // InternalRoboDsl.g:1546:3: ()
            // InternalRoboDsl.g:1547:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWallAheadAccess().getConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getWallAheadAccess().getWallKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getWallAheadAccess().getAheadKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWallAhead"


    // $ANTLR start "entryRuleHeading"
    // InternalRoboDsl.g:1565:1: entryRuleHeading returns [EObject current=null] : iv_ruleHeading= ruleHeading EOF ;
    public final EObject entryRuleHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading = null;


        try {
            // InternalRoboDsl.g:1565:48: (iv_ruleHeading= ruleHeading EOF )
            // InternalRoboDsl.g:1566:2: iv_ruleHeading= ruleHeading EOF
            {
             newCompositeNode(grammarAccess.getHeadingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeading=ruleHeading();

            state._fsp--;

             current =iv_ruleHeading; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeading"


    // $ANTLR start "ruleHeading"
    // InternalRoboDsl.g:1572:1: ruleHeading returns [EObject current=null] : ( () otherlv_1= 'heading' (otherlv_2= 'north' | otherlv_3= 'east' | otherlv_4= 'south' | otherlv_5= 'west' ) ) ;
    public final EObject ruleHeading() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRoboDsl.g:1578:2: ( ( () otherlv_1= 'heading' (otherlv_2= 'north' | otherlv_3= 'east' | otherlv_4= 'south' | otherlv_5= 'west' ) ) )
            // InternalRoboDsl.g:1579:2: ( () otherlv_1= 'heading' (otherlv_2= 'north' | otherlv_3= 'east' | otherlv_4= 'south' | otherlv_5= 'west' ) )
            {
            // InternalRoboDsl.g:1579:2: ( () otherlv_1= 'heading' (otherlv_2= 'north' | otherlv_3= 'east' | otherlv_4= 'south' | otherlv_5= 'west' ) )
            // InternalRoboDsl.g:1580:3: () otherlv_1= 'heading' (otherlv_2= 'north' | otherlv_3= 'east' | otherlv_4= 'south' | otherlv_5= 'west' )
            {
            // InternalRoboDsl.g:1580:3: ()
            // InternalRoboDsl.g:1581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeadingAccess().getConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getHeadingAccess().getHeadingKeyword_1());
            		
            // InternalRoboDsl.g:1591:3: (otherlv_2= 'north' | otherlv_3= 'east' | otherlv_4= 'south' | otherlv_5= 'west' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt10=1;
                }
                break;
            case 45:
                {
                alt10=2;
                }
                break;
            case 46:
                {
                alt10=3;
                }
                break;
            case 47:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRoboDsl.g:1592:4: otherlv_2= 'north'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getHeadingAccess().getNorthKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRoboDsl.g:1597:4: otherlv_3= 'east'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getHeadingAccess().getEastKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalRoboDsl.g:1602:4: otherlv_4= 'south'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getHeadingAccess().getSouthKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalRoboDsl.g:1607:4: otherlv_5= 'west'
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getHeadingAccess().getWestKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeading"


    // $ANTLR start "entryRuleEInteger"
    // InternalRoboDsl.g:1616:1: entryRuleEInteger returns [String current=null] : iv_ruleEInteger= ruleEInteger EOF ;
    public final String entryRuleEInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInteger = null;


        try {
            // InternalRoboDsl.g:1616:48: (iv_ruleEInteger= ruleEInteger EOF )
            // InternalRoboDsl.g:1617:2: iv_ruleEInteger= ruleEInteger EOF
            {
             newCompositeNode(grammarAccess.getEIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInteger=ruleEInteger();

            state._fsp--;

             current =iv_ruleEInteger.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInteger"


    // $ANTLR start "ruleEInteger"
    // InternalRoboDsl.g:1623:1: ruleEInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalRoboDsl.g:1629:2: (this_INT_0= RULE_INT )
            // InternalRoboDsl.g:1630:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntegerAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInteger"


    // $ANTLR start "entryRuleEString"
    // InternalRoboDsl.g:1640:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRoboDsl.g:1640:47: (iv_ruleEString= ruleEString EOF )
            // InternalRoboDsl.g:1641:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRoboDsl.g:1647:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRoboDsl.g:1653:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRoboDsl.g:1654:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRoboDsl.g:1654:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRoboDsl.g:1655:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRoboDsl.g:1663:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000193FE0010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000193FE0012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000BB000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000F00000000000L});

}