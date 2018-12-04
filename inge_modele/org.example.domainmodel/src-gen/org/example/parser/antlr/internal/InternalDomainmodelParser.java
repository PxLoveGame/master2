package org.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start'", "'{'", "'}'", "'move'", "'from'", "'to'", "'qty'", "'through filter'", "'wait'", "'s'", "'entity'", "'extends'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }



     	private DomainmodelGrammarAccess grammarAccess;

        public InternalDomainmodelParser(TokenStream input, DomainmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StartPoint";
       	}

       	@Override
       	protected DomainmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStartPoint"
    // InternalDomainmodel.g:64:1: entryRuleStartPoint returns [EObject current=null] : iv_ruleStartPoint= ruleStartPoint EOF ;
    public final EObject entryRuleStartPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartPoint = null;


        try {
            // InternalDomainmodel.g:64:51: (iv_ruleStartPoint= ruleStartPoint EOF )
            // InternalDomainmodel.g:65:2: iv_ruleStartPoint= ruleStartPoint EOF
            {
             newCompositeNode(grammarAccess.getStartPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartPoint=ruleStartPoint();

            state._fsp--;

             current =iv_ruleStartPoint; 
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
    // $ANTLR end "entryRuleStartPoint"


    // $ANTLR start "ruleStartPoint"
    // InternalDomainmodel.g:71:1: ruleStartPoint returns [EObject current=null] : ( () otherlv_1= 'start' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}' ) ;
    public final EObject ruleStartPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_instructions_3_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:77:2: ( ( () otherlv_1= 'start' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}' ) )
            // InternalDomainmodel.g:78:2: ( () otherlv_1= 'start' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}' )
            {
            // InternalDomainmodel.g:78:2: ( () otherlv_1= 'start' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}' )
            // InternalDomainmodel.g:79:3: () otherlv_1= 'start' otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}'
            {
            // InternalDomainmodel.g:79:3: ()
            // InternalDomainmodel.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartPointAccess().getStartPointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStartPointAccess().getStartKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getStartPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomainmodel.g:94:3: ( (lv_instructions_3_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:95:4: (lv_instructions_3_0= ruleInstruction )
            	    {
            	    // InternalDomainmodel.g:95:4: (lv_instructions_3_0= ruleInstruction )
            	    // InternalDomainmodel.g:96:5: lv_instructions_3_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getStartPointAccess().getInstructionsInstructionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_instructions_3_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStartPointRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_3_0,
            	    						"org.example.Domainmodel.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStartPointAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleStartPoint"


    // $ANTLR start "entryRuleInstruction"
    // InternalDomainmodel.g:121:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalDomainmodel.g:121:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalDomainmodel.g:122:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalDomainmodel.g:128:1: ruleInstruction returns [EObject current=null] : (this_InstructionMove_0= ruleInstructionMove | this_InstructionWait_1= ruleInstructionWait ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_InstructionMove_0 = null;

        EObject this_InstructionWait_1 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:134:2: ( (this_InstructionMove_0= ruleInstructionMove | this_InstructionWait_1= ruleInstructionWait ) )
            // InternalDomainmodel.g:135:2: (this_InstructionMove_0= ruleInstructionMove | this_InstructionWait_1= ruleInstructionWait )
            {
            // InternalDomainmodel.g:135:2: (this_InstructionMove_0= ruleInstructionMove | this_InstructionWait_1= ruleInstructionWait )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:136:3: this_InstructionMove_0= ruleInstructionMove
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getInstructionMoveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstructionMove_0=ruleInstructionMove();

                    state._fsp--;


                    			current = this_InstructionMove_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:145:3: this_InstructionWait_1= ruleInstructionWait
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getInstructionWaitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstructionWait_1=ruleInstructionWait();

                    state._fsp--;


                    			current = this_InstructionWait_1;
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleInstructionMove"
    // InternalDomainmodel.g:157:1: entryRuleInstructionMove returns [EObject current=null] : iv_ruleInstructionMove= ruleInstructionMove EOF ;
    public final EObject entryRuleInstructionMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionMove = null;


        try {
            // InternalDomainmodel.g:157:56: (iv_ruleInstructionMove= ruleInstructionMove EOF )
            // InternalDomainmodel.g:158:2: iv_ruleInstructionMove= ruleInstructionMove EOF
            {
             newCompositeNode(grammarAccess.getInstructionMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructionMove=ruleInstructionMove();

            state._fsp--;

             current =iv_ruleInstructionMove; 
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
    // $ANTLR end "entryRuleInstructionMove"


    // $ANTLR start "ruleInstructionMove"
    // InternalDomainmodel.g:164:1: ruleInstructionMove returns [EObject current=null] : (otherlv_0= 'move' otherlv_1= 'from' ( (lv_from_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_INT ) ) otherlv_5= 'qty' ( (lv_qty_6_0= RULE_INT ) ) (otherlv_7= 'through filter' ( (lv_filter_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleInstructionMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_from_2_0=null;
        Token otherlv_3=null;
        Token lv_to_4_0=null;
        Token otherlv_5=null;
        Token lv_qty_6_0=null;
        Token otherlv_7=null;
        Token lv_filter_8_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:170:2: ( (otherlv_0= 'move' otherlv_1= 'from' ( (lv_from_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_INT ) ) otherlv_5= 'qty' ( (lv_qty_6_0= RULE_INT ) ) (otherlv_7= 'through filter' ( (lv_filter_8_0= RULE_INT ) ) )? ) )
            // InternalDomainmodel.g:171:2: (otherlv_0= 'move' otherlv_1= 'from' ( (lv_from_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_INT ) ) otherlv_5= 'qty' ( (lv_qty_6_0= RULE_INT ) ) (otherlv_7= 'through filter' ( (lv_filter_8_0= RULE_INT ) ) )? )
            {
            // InternalDomainmodel.g:171:2: (otherlv_0= 'move' otherlv_1= 'from' ( (lv_from_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_INT ) ) otherlv_5= 'qty' ( (lv_qty_6_0= RULE_INT ) ) (otherlv_7= 'through filter' ( (lv_filter_8_0= RULE_INT ) ) )? )
            // InternalDomainmodel.g:172:3: otherlv_0= 'move' otherlv_1= 'from' ( (lv_from_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_INT ) ) otherlv_5= 'qty' ( (lv_qty_6_0= RULE_INT ) ) (otherlv_7= 'through filter' ( (lv_filter_8_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstructionMoveAccess().getMoveKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInstructionMoveAccess().getFromKeyword_1());
            		
            // InternalDomainmodel.g:180:3: ( (lv_from_2_0= RULE_INT ) )
            // InternalDomainmodel.g:181:4: (lv_from_2_0= RULE_INT )
            {
            // InternalDomainmodel.g:181:4: (lv_from_2_0= RULE_INT )
            // InternalDomainmodel.g:182:5: lv_from_2_0= RULE_INT
            {
            lv_from_2_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_from_2_0, grammarAccess.getInstructionMoveAccess().getFromINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstructionMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"from",
            						lv_from_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getInstructionMoveAccess().getToKeyword_3());
            		
            // InternalDomainmodel.g:202:3: ( (lv_to_4_0= RULE_INT ) )
            // InternalDomainmodel.g:203:4: (lv_to_4_0= RULE_INT )
            {
            // InternalDomainmodel.g:203:4: (lv_to_4_0= RULE_INT )
            // InternalDomainmodel.g:204:5: lv_to_4_0= RULE_INT
            {
            lv_to_4_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_to_4_0, grammarAccess.getInstructionMoveAccess().getToINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstructionMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"to",
            						lv_to_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getInstructionMoveAccess().getQtyKeyword_5());
            		
            // InternalDomainmodel.g:224:3: ( (lv_qty_6_0= RULE_INT ) )
            // InternalDomainmodel.g:225:4: (lv_qty_6_0= RULE_INT )
            {
            // InternalDomainmodel.g:225:4: (lv_qty_6_0= RULE_INT )
            // InternalDomainmodel.g:226:5: lv_qty_6_0= RULE_INT
            {
            lv_qty_6_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_qty_6_0, grammarAccess.getInstructionMoveAccess().getQtyINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstructionMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qty",
            						lv_qty_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDomainmodel.g:242:3: (otherlv_7= 'through filter' ( (lv_filter_8_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:243:4: otherlv_7= 'through filter' ( (lv_filter_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getInstructionMoveAccess().getThroughFilterKeyword_7_0());
                    			
                    // InternalDomainmodel.g:247:4: ( (lv_filter_8_0= RULE_INT ) )
                    // InternalDomainmodel.g:248:5: (lv_filter_8_0= RULE_INT )
                    {
                    // InternalDomainmodel.g:248:5: (lv_filter_8_0= RULE_INT )
                    // InternalDomainmodel.g:249:6: lv_filter_8_0= RULE_INT
                    {
                    lv_filter_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_filter_8_0, grammarAccess.getInstructionMoveAccess().getFilterINTTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInstructionMoveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"filter",
                    							lv_filter_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleInstructionMove"


    // $ANTLR start "entryRuleInstructionWait"
    // InternalDomainmodel.g:270:1: entryRuleInstructionWait returns [EObject current=null] : iv_ruleInstructionWait= ruleInstructionWait EOF ;
    public final EObject entryRuleInstructionWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionWait = null;


        try {
            // InternalDomainmodel.g:270:56: (iv_ruleInstructionWait= ruleInstructionWait EOF )
            // InternalDomainmodel.g:271:2: iv_ruleInstructionWait= ruleInstructionWait EOF
            {
             newCompositeNode(grammarAccess.getInstructionWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructionWait=ruleInstructionWait();

            state._fsp--;

             current =iv_ruleInstructionWait; 
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
    // $ANTLR end "entryRuleInstructionWait"


    // $ANTLR start "ruleInstructionWait"
    // InternalDomainmodel.g:277:1: ruleInstructionWait returns [EObject current=null] : (otherlv_0= 'wait' ( (lv_tps_1_0= RULE_INT ) ) otherlv_2= 's' ) ;
    public final EObject ruleInstructionWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_tps_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:283:2: ( (otherlv_0= 'wait' ( (lv_tps_1_0= RULE_INT ) ) otherlv_2= 's' ) )
            // InternalDomainmodel.g:284:2: (otherlv_0= 'wait' ( (lv_tps_1_0= RULE_INT ) ) otherlv_2= 's' )
            {
            // InternalDomainmodel.g:284:2: (otherlv_0= 'wait' ( (lv_tps_1_0= RULE_INT ) ) otherlv_2= 's' )
            // InternalDomainmodel.g:285:3: otherlv_0= 'wait' ( (lv_tps_1_0= RULE_INT ) ) otherlv_2= 's'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInstructionWaitAccess().getWaitKeyword_0());
            		
            // InternalDomainmodel.g:289:3: ( (lv_tps_1_0= RULE_INT ) )
            // InternalDomainmodel.g:290:4: (lv_tps_1_0= RULE_INT )
            {
            // InternalDomainmodel.g:290:4: (lv_tps_1_0= RULE_INT )
            // InternalDomainmodel.g:291:5: lv_tps_1_0= RULE_INT
            {
            lv_tps_1_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_tps_1_0, grammarAccess.getInstructionWaitAccess().getTpsINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstructionWaitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tps",
            						lv_tps_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getInstructionWaitAccess().getSKeyword_2());
            		

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
    // $ANTLR end "ruleInstructionWait"


    // $ANTLR start "entryRuleType"
    // InternalDomainmodel.g:315:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDomainmodel.g:315:45: (iv_ruleType= ruleType EOF )
            // InternalDomainmodel.g:316:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDomainmodel.g:322:1: ruleType returns [EObject current=null] : this_Entity_0= ruleEntity ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:328:2: (this_Entity_0= ruleEntity )
            // InternalDomainmodel.g:329:2: this_Entity_0= ruleEntity
            {

            		newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Entity_0=ruleEntity();

            state._fsp--;


            		current = this_Entity_0;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEntity"
    // InternalDomainmodel.g:340:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDomainmodel.g:340:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDomainmodel.g:341:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomainmodel.g:347:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_startPoint_5_0= ruleStartPoint ) ) otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_startPoint_5_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:353:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_startPoint_5_0= ruleStartPoint ) ) otherlv_6= '}' ) )
            // InternalDomainmodel.g:354:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_startPoint_5_0= ruleStartPoint ) ) otherlv_6= '}' )
            {
            // InternalDomainmodel.g:354:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_startPoint_5_0= ruleStartPoint ) ) otherlv_6= '}' )
            // InternalDomainmodel.g:355:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_startPoint_5_0= ruleStartPoint ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalDomainmodel.g:359:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:360:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:360:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:361:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomainmodel.g:377:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:378:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalDomainmodel.g:382:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDomainmodel.g:383:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDomainmodel.g:383:5: (otherlv_3= RULE_ID )
                    // InternalDomainmodel.g:384:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_3); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomainmodel.g:400:3: ( (lv_startPoint_5_0= ruleStartPoint ) )
            // InternalDomainmodel.g:401:4: (lv_startPoint_5_0= ruleStartPoint )
            {
            // InternalDomainmodel.g:401:4: (lv_startPoint_5_0= ruleStartPoint )
            // InternalDomainmodel.g:402:5: lv_startPoint_5_0= ruleStartPoint
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getStartPointStartPointParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_startPoint_5_0=ruleStartPoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"startPoint",
            						lv_startPoint_5_0,
            						"org.example.Domainmodel.StartPoint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEntity"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});

}