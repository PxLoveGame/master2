package org.example.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleStartPoint"
    // InternalDomainmodel.g:53:1: entryRuleStartPoint : ruleStartPoint EOF ;
    public final void entryRuleStartPoint() throws RecognitionException {
        try {
            // InternalDomainmodel.g:54:1: ( ruleStartPoint EOF )
            // InternalDomainmodel.g:55:1: ruleStartPoint EOF
            {
             before(grammarAccess.getStartPointRule()); 
            pushFollow(FOLLOW_1);
            ruleStartPoint();

            state._fsp--;

             after(grammarAccess.getStartPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStartPoint"


    // $ANTLR start "ruleStartPoint"
    // InternalDomainmodel.g:62:1: ruleStartPoint : ( ( rule__StartPoint__Group__0 ) ) ;
    public final void ruleStartPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:66:2: ( ( ( rule__StartPoint__Group__0 ) ) )
            // InternalDomainmodel.g:67:2: ( ( rule__StartPoint__Group__0 ) )
            {
            // InternalDomainmodel.g:67:2: ( ( rule__StartPoint__Group__0 ) )
            // InternalDomainmodel.g:68:3: ( rule__StartPoint__Group__0 )
            {
             before(grammarAccess.getStartPointAccess().getGroup()); 
            // InternalDomainmodel.g:69:3: ( rule__StartPoint__Group__0 )
            // InternalDomainmodel.g:69:4: rule__StartPoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartPoint"


    // $ANTLR start "entryRuleInstruction"
    // InternalDomainmodel.g:78:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalDomainmodel.g:79:1: ( ruleInstruction EOF )
            // InternalDomainmodel.g:80:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalDomainmodel.g:87:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:91:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalDomainmodel.g:92:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalDomainmodel.g:92:2: ( ( rule__Instruction__Alternatives ) )
            // InternalDomainmodel.g:93:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalDomainmodel.g:94:3: ( rule__Instruction__Alternatives )
            // InternalDomainmodel.g:94:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleInstructionMove"
    // InternalDomainmodel.g:103:1: entryRuleInstructionMove : ruleInstructionMove EOF ;
    public final void entryRuleInstructionMove() throws RecognitionException {
        try {
            // InternalDomainmodel.g:104:1: ( ruleInstructionMove EOF )
            // InternalDomainmodel.g:105:1: ruleInstructionMove EOF
            {
             before(grammarAccess.getInstructionMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleInstructionMove();

            state._fsp--;

             after(grammarAccess.getInstructionMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstructionMove"


    // $ANTLR start "ruleInstructionMove"
    // InternalDomainmodel.g:112:1: ruleInstructionMove : ( ( rule__InstructionMove__Group__0 ) ) ;
    public final void ruleInstructionMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:116:2: ( ( ( rule__InstructionMove__Group__0 ) ) )
            // InternalDomainmodel.g:117:2: ( ( rule__InstructionMove__Group__0 ) )
            {
            // InternalDomainmodel.g:117:2: ( ( rule__InstructionMove__Group__0 ) )
            // InternalDomainmodel.g:118:3: ( rule__InstructionMove__Group__0 )
            {
             before(grammarAccess.getInstructionMoveAccess().getGroup()); 
            // InternalDomainmodel.g:119:3: ( rule__InstructionMove__Group__0 )
            // InternalDomainmodel.g:119:4: rule__InstructionMove__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstructionMove__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstructionMove"


    // $ANTLR start "entryRuleInstructionWait"
    // InternalDomainmodel.g:128:1: entryRuleInstructionWait : ruleInstructionWait EOF ;
    public final void entryRuleInstructionWait() throws RecognitionException {
        try {
            // InternalDomainmodel.g:129:1: ( ruleInstructionWait EOF )
            // InternalDomainmodel.g:130:1: ruleInstructionWait EOF
            {
             before(grammarAccess.getInstructionWaitRule()); 
            pushFollow(FOLLOW_1);
            ruleInstructionWait();

            state._fsp--;

             after(grammarAccess.getInstructionWaitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstructionWait"


    // $ANTLR start "ruleInstructionWait"
    // InternalDomainmodel.g:137:1: ruleInstructionWait : ( ( rule__InstructionWait__Group__0 ) ) ;
    public final void ruleInstructionWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:141:2: ( ( ( rule__InstructionWait__Group__0 ) ) )
            // InternalDomainmodel.g:142:2: ( ( rule__InstructionWait__Group__0 ) )
            {
            // InternalDomainmodel.g:142:2: ( ( rule__InstructionWait__Group__0 ) )
            // InternalDomainmodel.g:143:3: ( rule__InstructionWait__Group__0 )
            {
             before(grammarAccess.getInstructionWaitAccess().getGroup()); 
            // InternalDomainmodel.g:144:3: ( rule__InstructionWait__Group__0 )
            // InternalDomainmodel.g:144:4: rule__InstructionWait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstructionWait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionWaitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstructionWait"


    // $ANTLR start "entryRuleType"
    // InternalDomainmodel.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDomainmodel.g:154:1: ( ruleType EOF )
            // InternalDomainmodel.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDomainmodel.g:162:1: ruleType : ( ruleEntity ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:166:2: ( ( ruleEntity ) )
            // InternalDomainmodel.g:167:2: ( ruleEntity )
            {
            // InternalDomainmodel.g:167:2: ( ruleEntity )
            // InternalDomainmodel.g:168:3: ruleEntity
            {
             before(grammarAccess.getTypeAccess().getEntityParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getEntityParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEntity"
    // InternalDomainmodel.g:178:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDomainmodel.g:179:1: ( ruleEntity EOF )
            // InternalDomainmodel.g:180:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomainmodel.g:187:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:191:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDomainmodel.g:192:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDomainmodel.g:192:2: ( ( rule__Entity__Group__0 ) )
            // InternalDomainmodel.g:193:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDomainmodel.g:194:3: ( rule__Entity__Group__0 )
            // InternalDomainmodel.g:194:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalDomainmodel.g:202:1: rule__Instruction__Alternatives : ( ( ruleInstructionMove ) | ( ruleInstructionWait ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:206:1: ( ( ruleInstructionMove ) | ( ruleInstructionWait ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDomainmodel.g:207:2: ( ruleInstructionMove )
                    {
                    // InternalDomainmodel.g:207:2: ( ruleInstructionMove )
                    // InternalDomainmodel.g:208:3: ruleInstructionMove
                    {
                     before(grammarAccess.getInstructionAccess().getInstructionMoveParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInstructionMove();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getInstructionMoveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:213:2: ( ruleInstructionWait )
                    {
                    // InternalDomainmodel.g:213:2: ( ruleInstructionWait )
                    // InternalDomainmodel.g:214:3: ruleInstructionWait
                    {
                     before(grammarAccess.getInstructionAccess().getInstructionWaitParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInstructionWait();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getInstructionWaitParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__StartPoint__Group__0"
    // InternalDomainmodel.g:223:1: rule__StartPoint__Group__0 : rule__StartPoint__Group__0__Impl rule__StartPoint__Group__1 ;
    public final void rule__StartPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:227:1: ( rule__StartPoint__Group__0__Impl rule__StartPoint__Group__1 )
            // InternalDomainmodel.g:228:2: rule__StartPoint__Group__0__Impl rule__StartPoint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StartPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__0"


    // $ANTLR start "rule__StartPoint__Group__0__Impl"
    // InternalDomainmodel.g:235:1: rule__StartPoint__Group__0__Impl : ( () ) ;
    public final void rule__StartPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:239:1: ( ( () ) )
            // InternalDomainmodel.g:240:1: ( () )
            {
            // InternalDomainmodel.g:240:1: ( () )
            // InternalDomainmodel.g:241:2: ()
            {
             before(grammarAccess.getStartPointAccess().getStartPointAction_0()); 
            // InternalDomainmodel.g:242:2: ()
            // InternalDomainmodel.g:242:3: 
            {
            }

             after(grammarAccess.getStartPointAccess().getStartPointAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__0__Impl"


    // $ANTLR start "rule__StartPoint__Group__1"
    // InternalDomainmodel.g:250:1: rule__StartPoint__Group__1 : rule__StartPoint__Group__1__Impl rule__StartPoint__Group__2 ;
    public final void rule__StartPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:254:1: ( rule__StartPoint__Group__1__Impl rule__StartPoint__Group__2 )
            // InternalDomainmodel.g:255:2: rule__StartPoint__Group__1__Impl rule__StartPoint__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StartPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__1"


    // $ANTLR start "rule__StartPoint__Group__1__Impl"
    // InternalDomainmodel.g:262:1: rule__StartPoint__Group__1__Impl : ( 'start' ) ;
    public final void rule__StartPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:266:1: ( ( 'start' ) )
            // InternalDomainmodel.g:267:1: ( 'start' )
            {
            // InternalDomainmodel.g:267:1: ( 'start' )
            // InternalDomainmodel.g:268:2: 'start'
            {
             before(grammarAccess.getStartPointAccess().getStartKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStartPointAccess().getStartKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__1__Impl"


    // $ANTLR start "rule__StartPoint__Group__2"
    // InternalDomainmodel.g:277:1: rule__StartPoint__Group__2 : rule__StartPoint__Group__2__Impl rule__StartPoint__Group__3 ;
    public final void rule__StartPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:281:1: ( rule__StartPoint__Group__2__Impl rule__StartPoint__Group__3 )
            // InternalDomainmodel.g:282:2: rule__StartPoint__Group__2__Impl rule__StartPoint__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__StartPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartPoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__2"


    // $ANTLR start "rule__StartPoint__Group__2__Impl"
    // InternalDomainmodel.g:289:1: rule__StartPoint__Group__2__Impl : ( '{' ) ;
    public final void rule__StartPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:293:1: ( ( '{' ) )
            // InternalDomainmodel.g:294:1: ( '{' )
            {
            // InternalDomainmodel.g:294:1: ( '{' )
            // InternalDomainmodel.g:295:2: '{'
            {
             before(grammarAccess.getStartPointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStartPointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__2__Impl"


    // $ANTLR start "rule__StartPoint__Group__3"
    // InternalDomainmodel.g:304:1: rule__StartPoint__Group__3 : rule__StartPoint__Group__3__Impl rule__StartPoint__Group__4 ;
    public final void rule__StartPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:308:1: ( rule__StartPoint__Group__3__Impl rule__StartPoint__Group__4 )
            // InternalDomainmodel.g:309:2: rule__StartPoint__Group__3__Impl rule__StartPoint__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__StartPoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartPoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__3"


    // $ANTLR start "rule__StartPoint__Group__3__Impl"
    // InternalDomainmodel.g:316:1: rule__StartPoint__Group__3__Impl : ( ( rule__StartPoint__InstructionsAssignment_3 )* ) ;
    public final void rule__StartPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:320:1: ( ( ( rule__StartPoint__InstructionsAssignment_3 )* ) )
            // InternalDomainmodel.g:321:1: ( ( rule__StartPoint__InstructionsAssignment_3 )* )
            {
            // InternalDomainmodel.g:321:1: ( ( rule__StartPoint__InstructionsAssignment_3 )* )
            // InternalDomainmodel.g:322:2: ( rule__StartPoint__InstructionsAssignment_3 )*
            {
             before(grammarAccess.getStartPointAccess().getInstructionsAssignment_3()); 
            // InternalDomainmodel.g:323:2: ( rule__StartPoint__InstructionsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDomainmodel.g:323:3: rule__StartPoint__InstructionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StartPoint__InstructionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getStartPointAccess().getInstructionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__3__Impl"


    // $ANTLR start "rule__StartPoint__Group__4"
    // InternalDomainmodel.g:331:1: rule__StartPoint__Group__4 : rule__StartPoint__Group__4__Impl ;
    public final void rule__StartPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:335:1: ( rule__StartPoint__Group__4__Impl )
            // InternalDomainmodel.g:336:2: rule__StartPoint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartPoint__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__4"


    // $ANTLR start "rule__StartPoint__Group__4__Impl"
    // InternalDomainmodel.g:342:1: rule__StartPoint__Group__4__Impl : ( '}' ) ;
    public final void rule__StartPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:346:1: ( ( '}' ) )
            // InternalDomainmodel.g:347:1: ( '}' )
            {
            // InternalDomainmodel.g:347:1: ( '}' )
            // InternalDomainmodel.g:348:2: '}'
            {
             before(grammarAccess.getStartPointAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStartPointAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__Group__4__Impl"


    // $ANTLR start "rule__InstructionMove__Group__0"
    // InternalDomainmodel.g:358:1: rule__InstructionMove__Group__0 : rule__InstructionMove__Group__0__Impl rule__InstructionMove__Group__1 ;
    public final void rule__InstructionMove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:362:1: ( rule__InstructionMove__Group__0__Impl rule__InstructionMove__Group__1 )
            // InternalDomainmodel.g:363:2: rule__InstructionMove__Group__0__Impl rule__InstructionMove__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__InstructionMove__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionMove__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__0"


    // $ANTLR start "rule__InstructionMove__Group__0__Impl"
    // InternalDomainmodel.g:370:1: rule__InstructionMove__Group__0__Impl : ( 'move' ) ;
    public final void rule__InstructionMove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:374:1: ( ( 'move' ) )
            // InternalDomainmodel.g:375:1: ( 'move' )
            {
            // InternalDomainmodel.g:375:1: ( 'move' )
            // InternalDomainmodel.g:376:2: 'move'
            {
             before(grammarAccess.getInstructionMoveAccess().getMoveKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInstructionMoveAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__0__Impl"


    // $ANTLR start "rule__InstructionMove__Group__1"
    // InternalDomainmodel.g:385:1: rule__InstructionMove__Group__1 : rule__InstructionMove__Group__1__Impl rule__InstructionMove__Group__2 ;
    public final void rule__InstructionMove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:389:1: ( rule__InstructionMove__Group__1__Impl rule__InstructionMove__Group__2 )
            // InternalDomainmodel.g:390:2: rule__InstructionMove__Group__1__Impl rule__InstructionMove__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__InstructionMove__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionMove__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__1"


    // $ANTLR start "rule__InstructionMove__Group__1__Impl"
    // InternalDomainmodel.g:397:1: rule__InstructionMove__Group__1__Impl : ( 'from' ) ;
    public final void rule__InstructionMove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:401:1: ( ( 'from' ) )
            // InternalDomainmodel.g:402:1: ( 'from' )
            {
            // InternalDomainmodel.g:402:1: ( 'from' )
            // InternalDomainmodel.g:403:2: 'from'
            {
             before(grammarAccess.getInstructionMoveAccess().getFromKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInstructionMoveAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__1__Impl"


    // $ANTLR start "rule__InstructionMove__Group__2"
    // InternalDomainmodel.g:412:1: rule__InstructionMove__Group__2 : rule__InstructionMove__Group__2__Impl rule__InstructionMove__Group__3 ;
    public final void rule__InstructionMove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:416:1: ( rule__InstructionMove__Group__2__Impl rule__InstructionMove__Group__3 )
            // InternalDomainmodel.g:417:2: rule__InstructionMove__Group__2__Impl rule__InstructionMove__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__InstructionMove__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionMove__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__2"


    // $ANTLR start "rule__InstructionMove__Group__2__Impl"
    // InternalDomainmodel.g:424:1: rule__InstructionMove__Group__2__Impl : ( ( rule__InstructionMove__FromAssignment_2 ) ) ;
    public final void rule__InstructionMove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:428:1: ( ( ( rule__InstructionMove__FromAssignment_2 ) ) )
            // InternalDomainmodel.g:429:1: ( ( rule__InstructionMove__FromAssignment_2 ) )
            {
            // InternalDomainmodel.g:429:1: ( ( rule__InstructionMove__FromAssignment_2 ) )
            // InternalDomainmodel.g:430:2: ( rule__InstructionMove__FromAssignment_2 )
            {
             before(grammarAccess.getInstructionMoveAccess().getFromAssignment_2()); 
            // InternalDomainmodel.g:431:2: ( rule__InstructionMove__FromAssignment_2 )
            // InternalDomainmodel.g:431:3: rule__InstructionMove__FromAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InstructionMove__FromAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInstructionMoveAccess().getFromAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__2__Impl"


    // $ANTLR start "rule__InstructionMove__Group__3"
    // InternalDomainmodel.g:439:1: rule__InstructionMove__Group__3 : rule__InstructionMove__Group__3__Impl rule__InstructionMove__Group__4 ;
    public final void rule__InstructionMove__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:443:1: ( rule__InstructionMove__Group__3__Impl rule__InstructionMove__Group__4 )
            // InternalDomainmodel.g:444:2: rule__InstructionMove__Group__3__Impl rule__InstructionMove__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__InstructionMove__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionMove__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__3"


    // $ANTLR start "rule__InstructionMove__Group__3__Impl"
    // InternalDomainmodel.g:451:1: rule__InstructionMove__Group__3__Impl : ( 'to' ) ;
    public final void rule__InstructionMove__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:455:1: ( ( 'to' ) )
            // InternalDomainmodel.g:456:1: ( 'to' )
            {
            // InternalDomainmodel.g:456:1: ( 'to' )
            // InternalDomainmodel.g:457:2: 'to'
            {
             before(grammarAccess.getInstructionMoveAccess().getToKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInstructionMoveAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__3__Impl"


    // $ANTLR start "rule__InstructionMove__Group__4"
    // InternalDomainmodel.g:466:1: rule__InstructionMove__Group__4 : rule__InstructionMove__Group__4__Impl rule__InstructionMove__Group__5 ;
    public final void rule__InstructionMove__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:470:1: ( rule__InstructionMove__Group__4__Impl rule__InstructionMove__Group__5 )
            // InternalDomainmodel.g:471:2: rule__InstructionMove__Group__4__Impl rule__InstructionMove__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__InstructionMove__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionMove__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__4"


    // $ANTLR start "rule__InstructionMove__Group__4__Impl"
    // InternalDomainmodel.g:478:1: rule__InstructionMove__Group__4__Impl : ( ( rule__InstructionMove__ToAssignment_4 ) ) ;
    public final void rule__InstructionMove__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:482:1: ( ( ( rule__InstructionMove__ToAssignment_4 ) ) )
            // InternalDomainmodel.g:483:1: ( ( rule__InstructionMove__ToAssignment_4 ) )
            {
            // InternalDomainmodel.g:483:1: ( ( rule__InstructionMove__ToAssignment_4 ) )
            // InternalDomainmodel.g:484:2: ( rule__InstructionMove__ToAssignment_4 )
            {
             before(grammarAccess.getInstructionMoveAccess().getToAssignment_4()); 
            // InternalDomainmodel.g:485:2: ( rule__InstructionMove__ToAssignment_4 )
            // InternalDomainmodel.g:485:3: rule__InstructionMove__ToAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InstructionMove__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInstructionMoveAccess().getToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__4__Impl"


    // $ANTLR start "rule__InstructionMove__Group__5"
    // InternalDomainmodel.g:493:1: rule__InstructionMove__Group__5 : rule__InstructionMove__Group__5__Impl rule__InstructionMove__Group__6 ;
    public final void rule__InstructionMove__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:497:1: ( rule__InstructionMove__Group__5__Impl rule__InstructionMove__Group__6 )
            // InternalDomainmodel.g:498:2: rule__InstructionMove__Group__5__Impl rule__InstructionMove__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__InstructionMove__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionMove__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__5"


    // $ANTLR start "rule__InstructionMove__Group__5__Impl"
    // InternalDomainmodel.g:505:1: rule__InstructionMove__Group__5__Impl : ( 'qty' ) ;
    public final void rule__InstructionMove__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:509:1: ( ( 'qty' ) )
            // InternalDomainmodel.g:510:1: ( 'qty' )
            {
            // InternalDomainmodel.g:510:1: ( 'qty' )
            // InternalDomainmodel.g:511:2: 'qty'
            {
             before(grammarAccess.getInstructionMoveAccess().getQtyKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInstructionMoveAccess().getQtyKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__5__Impl"


    // $ANTLR start "rule__InstructionMove__Group__6"
    // InternalDomainmodel.g:520:1: rule__InstructionMove__Group__6 : rule__InstructionMove__Group__6__Impl rule__InstructionMove__Group__7 ;
    public final void rule__InstructionMove__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:524:1: ( rule__InstructionMove__Group__6__Impl rule__InstructionMove__Group__7 )
            // InternalDomainmodel.g:525:2: rule__InstructionMove__Group__6__Impl rule__InstructionMove__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__InstructionMove__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionMove__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__6"


    // $ANTLR start "rule__InstructionMove__Group__6__Impl"
    // InternalDomainmodel.g:532:1: rule__InstructionMove__Group__6__Impl : ( ( rule__InstructionMove__QtyAssignment_6 ) ) ;
    public final void rule__InstructionMove__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:536:1: ( ( ( rule__InstructionMove__QtyAssignment_6 ) ) )
            // InternalDomainmodel.g:537:1: ( ( rule__InstructionMove__QtyAssignment_6 ) )
            {
            // InternalDomainmodel.g:537:1: ( ( rule__InstructionMove__QtyAssignment_6 ) )
            // InternalDomainmodel.g:538:2: ( rule__InstructionMove__QtyAssignment_6 )
            {
             before(grammarAccess.getInstructionMoveAccess().getQtyAssignment_6()); 
            // InternalDomainmodel.g:539:2: ( rule__InstructionMove__QtyAssignment_6 )
            // InternalDomainmodel.g:539:3: rule__InstructionMove__QtyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InstructionMove__QtyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInstructionMoveAccess().getQtyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__6__Impl"


    // $ANTLR start "rule__InstructionMove__Group__7"
    // InternalDomainmodel.g:547:1: rule__InstructionMove__Group__7 : rule__InstructionMove__Group__7__Impl ;
    public final void rule__InstructionMove__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:551:1: ( rule__InstructionMove__Group__7__Impl )
            // InternalDomainmodel.g:552:2: rule__InstructionMove__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstructionMove__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__7"


    // $ANTLR start "rule__InstructionMove__Group__7__Impl"
    // InternalDomainmodel.g:558:1: rule__InstructionMove__Group__7__Impl : ( ( rule__InstructionMove__Group_7__0 )? ) ;
    public final void rule__InstructionMove__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:562:1: ( ( ( rule__InstructionMove__Group_7__0 )? ) )
            // InternalDomainmodel.g:563:1: ( ( rule__InstructionMove__Group_7__0 )? )
            {
            // InternalDomainmodel.g:563:1: ( ( rule__InstructionMove__Group_7__0 )? )
            // InternalDomainmodel.g:564:2: ( rule__InstructionMove__Group_7__0 )?
            {
             before(grammarAccess.getInstructionMoveAccess().getGroup_7()); 
            // InternalDomainmodel.g:565:2: ( rule__InstructionMove__Group_7__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:565:3: rule__InstructionMove__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstructionMove__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstructionMoveAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group__7__Impl"


    // $ANTLR start "rule__InstructionMove__Group_7__0"
    // InternalDomainmodel.g:574:1: rule__InstructionMove__Group_7__0 : rule__InstructionMove__Group_7__0__Impl rule__InstructionMove__Group_7__1 ;
    public final void rule__InstructionMove__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:578:1: ( rule__InstructionMove__Group_7__0__Impl rule__InstructionMove__Group_7__1 )
            // InternalDomainmodel.g:579:2: rule__InstructionMove__Group_7__0__Impl rule__InstructionMove__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__InstructionMove__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionMove__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group_7__0"


    // $ANTLR start "rule__InstructionMove__Group_7__0__Impl"
    // InternalDomainmodel.g:586:1: rule__InstructionMove__Group_7__0__Impl : ( 'through filter' ) ;
    public final void rule__InstructionMove__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:590:1: ( ( 'through filter' ) )
            // InternalDomainmodel.g:591:1: ( 'through filter' )
            {
            // InternalDomainmodel.g:591:1: ( 'through filter' )
            // InternalDomainmodel.g:592:2: 'through filter'
            {
             before(grammarAccess.getInstructionMoveAccess().getThroughFilterKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInstructionMoveAccess().getThroughFilterKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group_7__0__Impl"


    // $ANTLR start "rule__InstructionMove__Group_7__1"
    // InternalDomainmodel.g:601:1: rule__InstructionMove__Group_7__1 : rule__InstructionMove__Group_7__1__Impl ;
    public final void rule__InstructionMove__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:605:1: ( rule__InstructionMove__Group_7__1__Impl )
            // InternalDomainmodel.g:606:2: rule__InstructionMove__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstructionMove__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group_7__1"


    // $ANTLR start "rule__InstructionMove__Group_7__1__Impl"
    // InternalDomainmodel.g:612:1: rule__InstructionMove__Group_7__1__Impl : ( ( rule__InstructionMove__FilterAssignment_7_1 ) ) ;
    public final void rule__InstructionMove__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:616:1: ( ( ( rule__InstructionMove__FilterAssignment_7_1 ) ) )
            // InternalDomainmodel.g:617:1: ( ( rule__InstructionMove__FilterAssignment_7_1 ) )
            {
            // InternalDomainmodel.g:617:1: ( ( rule__InstructionMove__FilterAssignment_7_1 ) )
            // InternalDomainmodel.g:618:2: ( rule__InstructionMove__FilterAssignment_7_1 )
            {
             before(grammarAccess.getInstructionMoveAccess().getFilterAssignment_7_1()); 
            // InternalDomainmodel.g:619:2: ( rule__InstructionMove__FilterAssignment_7_1 )
            // InternalDomainmodel.g:619:3: rule__InstructionMove__FilterAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__InstructionMove__FilterAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInstructionMoveAccess().getFilterAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__Group_7__1__Impl"


    // $ANTLR start "rule__InstructionWait__Group__0"
    // InternalDomainmodel.g:628:1: rule__InstructionWait__Group__0 : rule__InstructionWait__Group__0__Impl rule__InstructionWait__Group__1 ;
    public final void rule__InstructionWait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:632:1: ( rule__InstructionWait__Group__0__Impl rule__InstructionWait__Group__1 )
            // InternalDomainmodel.g:633:2: rule__InstructionWait__Group__0__Impl rule__InstructionWait__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__InstructionWait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionWait__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionWait__Group__0"


    // $ANTLR start "rule__InstructionWait__Group__0__Impl"
    // InternalDomainmodel.g:640:1: rule__InstructionWait__Group__0__Impl : ( 'wait' ) ;
    public final void rule__InstructionWait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:644:1: ( ( 'wait' ) )
            // InternalDomainmodel.g:645:1: ( 'wait' )
            {
            // InternalDomainmodel.g:645:1: ( 'wait' )
            // InternalDomainmodel.g:646:2: 'wait'
            {
             before(grammarAccess.getInstructionWaitAccess().getWaitKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInstructionWaitAccess().getWaitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionWait__Group__0__Impl"


    // $ANTLR start "rule__InstructionWait__Group__1"
    // InternalDomainmodel.g:655:1: rule__InstructionWait__Group__1 : rule__InstructionWait__Group__1__Impl rule__InstructionWait__Group__2 ;
    public final void rule__InstructionWait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:659:1: ( rule__InstructionWait__Group__1__Impl rule__InstructionWait__Group__2 )
            // InternalDomainmodel.g:660:2: rule__InstructionWait__Group__1__Impl rule__InstructionWait__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__InstructionWait__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionWait__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionWait__Group__1"


    // $ANTLR start "rule__InstructionWait__Group__1__Impl"
    // InternalDomainmodel.g:667:1: rule__InstructionWait__Group__1__Impl : ( ( rule__InstructionWait__TpsAssignment_1 ) ) ;
    public final void rule__InstructionWait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:671:1: ( ( ( rule__InstructionWait__TpsAssignment_1 ) ) )
            // InternalDomainmodel.g:672:1: ( ( rule__InstructionWait__TpsAssignment_1 ) )
            {
            // InternalDomainmodel.g:672:1: ( ( rule__InstructionWait__TpsAssignment_1 ) )
            // InternalDomainmodel.g:673:2: ( rule__InstructionWait__TpsAssignment_1 )
            {
             before(grammarAccess.getInstructionWaitAccess().getTpsAssignment_1()); 
            // InternalDomainmodel.g:674:2: ( rule__InstructionWait__TpsAssignment_1 )
            // InternalDomainmodel.g:674:3: rule__InstructionWait__TpsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstructionWait__TpsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstructionWaitAccess().getTpsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionWait__Group__1__Impl"


    // $ANTLR start "rule__InstructionWait__Group__2"
    // InternalDomainmodel.g:682:1: rule__InstructionWait__Group__2 : rule__InstructionWait__Group__2__Impl ;
    public final void rule__InstructionWait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:686:1: ( rule__InstructionWait__Group__2__Impl )
            // InternalDomainmodel.g:687:2: rule__InstructionWait__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstructionWait__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionWait__Group__2"


    // $ANTLR start "rule__InstructionWait__Group__2__Impl"
    // InternalDomainmodel.g:693:1: rule__InstructionWait__Group__2__Impl : ( 's' ) ;
    public final void rule__InstructionWait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:697:1: ( ( 's' ) )
            // InternalDomainmodel.g:698:1: ( 's' )
            {
            // InternalDomainmodel.g:698:1: ( 's' )
            // InternalDomainmodel.g:699:2: 's'
            {
             before(grammarAccess.getInstructionWaitAccess().getSKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInstructionWaitAccess().getSKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionWait__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDomainmodel.g:709:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:713:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDomainmodel.g:714:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDomainmodel.g:721:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:725:1: ( ( 'entity' ) )
            // InternalDomainmodel.g:726:1: ( 'entity' )
            {
            // InternalDomainmodel.g:726:1: ( 'entity' )
            // InternalDomainmodel.g:727:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDomainmodel.g:736:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:740:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDomainmodel.g:741:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDomainmodel.g:748:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:752:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:753:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:753:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDomainmodel.g:754:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:755:2: ( rule__Entity__NameAssignment_1 )
            // InternalDomainmodel.g:755:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDomainmodel.g:763:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:767:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDomainmodel.g:768:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDomainmodel.g:775:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:779:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalDomainmodel.g:780:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalDomainmodel.g:780:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalDomainmodel.g:781:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalDomainmodel.g:782:2: ( rule__Entity__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:782:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDomainmodel.g:790:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:794:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalDomainmodel.g:795:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDomainmodel.g:802:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:806:1: ( ( '{' ) )
            // InternalDomainmodel.g:807:1: ( '{' )
            {
            // InternalDomainmodel.g:807:1: ( '{' )
            // InternalDomainmodel.g:808:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalDomainmodel.g:817:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:821:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalDomainmodel.g:822:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalDomainmodel.g:829:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__StartPointAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:833:1: ( ( ( rule__Entity__StartPointAssignment_4 ) ) )
            // InternalDomainmodel.g:834:1: ( ( rule__Entity__StartPointAssignment_4 ) )
            {
            // InternalDomainmodel.g:834:1: ( ( rule__Entity__StartPointAssignment_4 ) )
            // InternalDomainmodel.g:835:2: ( rule__Entity__StartPointAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getStartPointAssignment_4()); 
            // InternalDomainmodel.g:836:2: ( rule__Entity__StartPointAssignment_4 )
            // InternalDomainmodel.g:836:3: rule__Entity__StartPointAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Entity__StartPointAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getStartPointAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalDomainmodel.g:844:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:848:1: ( rule__Entity__Group__5__Impl )
            // InternalDomainmodel.g:849:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalDomainmodel.g:855:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:859:1: ( ( '}' ) )
            // InternalDomainmodel.g:860:1: ( '}' )
            {
            // InternalDomainmodel.g:860:1: ( '}' )
            // InternalDomainmodel.g:861:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalDomainmodel.g:871:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:875:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalDomainmodel.g:876:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalDomainmodel.g:883:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:887:1: ( ( 'extends' ) )
            // InternalDomainmodel.g:888:1: ( 'extends' )
            {
            // InternalDomainmodel.g:888:1: ( 'extends' )
            // InternalDomainmodel.g:889:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalDomainmodel.g:898:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:902:1: ( rule__Entity__Group_2__1__Impl )
            // InternalDomainmodel.g:903:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalDomainmodel.g:909:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:913:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalDomainmodel.g:914:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalDomainmodel.g:914:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalDomainmodel.g:915:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalDomainmodel.g:916:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalDomainmodel.g:916:3: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__StartPoint__InstructionsAssignment_3"
    // InternalDomainmodel.g:925:1: rule__StartPoint__InstructionsAssignment_3 : ( ruleInstruction ) ;
    public final void rule__StartPoint__InstructionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:929:1: ( ( ruleInstruction ) )
            // InternalDomainmodel.g:930:2: ( ruleInstruction )
            {
            // InternalDomainmodel.g:930:2: ( ruleInstruction )
            // InternalDomainmodel.g:931:3: ruleInstruction
            {
             before(grammarAccess.getStartPointAccess().getInstructionsInstructionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getStartPointAccess().getInstructionsInstructionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartPoint__InstructionsAssignment_3"


    // $ANTLR start "rule__InstructionMove__FromAssignment_2"
    // InternalDomainmodel.g:940:1: rule__InstructionMove__FromAssignment_2 : ( RULE_INT ) ;
    public final void rule__InstructionMove__FromAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:944:1: ( ( RULE_INT ) )
            // InternalDomainmodel.g:945:2: ( RULE_INT )
            {
            // InternalDomainmodel.g:945:2: ( RULE_INT )
            // InternalDomainmodel.g:946:3: RULE_INT
            {
             before(grammarAccess.getInstructionMoveAccess().getFromINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstructionMoveAccess().getFromINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__FromAssignment_2"


    // $ANTLR start "rule__InstructionMove__ToAssignment_4"
    // InternalDomainmodel.g:955:1: rule__InstructionMove__ToAssignment_4 : ( RULE_INT ) ;
    public final void rule__InstructionMove__ToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:959:1: ( ( RULE_INT ) )
            // InternalDomainmodel.g:960:2: ( RULE_INT )
            {
            // InternalDomainmodel.g:960:2: ( RULE_INT )
            // InternalDomainmodel.g:961:3: RULE_INT
            {
             before(grammarAccess.getInstructionMoveAccess().getToINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstructionMoveAccess().getToINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__ToAssignment_4"


    // $ANTLR start "rule__InstructionMove__QtyAssignment_6"
    // InternalDomainmodel.g:970:1: rule__InstructionMove__QtyAssignment_6 : ( RULE_INT ) ;
    public final void rule__InstructionMove__QtyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:974:1: ( ( RULE_INT ) )
            // InternalDomainmodel.g:975:2: ( RULE_INT )
            {
            // InternalDomainmodel.g:975:2: ( RULE_INT )
            // InternalDomainmodel.g:976:3: RULE_INT
            {
             before(grammarAccess.getInstructionMoveAccess().getQtyINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstructionMoveAccess().getQtyINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__QtyAssignment_6"


    // $ANTLR start "rule__InstructionMove__FilterAssignment_7_1"
    // InternalDomainmodel.g:985:1: rule__InstructionMove__FilterAssignment_7_1 : ( RULE_INT ) ;
    public final void rule__InstructionMove__FilterAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:989:1: ( ( RULE_INT ) )
            // InternalDomainmodel.g:990:2: ( RULE_INT )
            {
            // InternalDomainmodel.g:990:2: ( RULE_INT )
            // InternalDomainmodel.g:991:3: RULE_INT
            {
             before(grammarAccess.getInstructionMoveAccess().getFilterINTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstructionMoveAccess().getFilterINTTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionMove__FilterAssignment_7_1"


    // $ANTLR start "rule__InstructionWait__TpsAssignment_1"
    // InternalDomainmodel.g:1000:1: rule__InstructionWait__TpsAssignment_1 : ( RULE_INT ) ;
    public final void rule__InstructionWait__TpsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1004:1: ( ( RULE_INT ) )
            // InternalDomainmodel.g:1005:2: ( RULE_INT )
            {
            // InternalDomainmodel.g:1005:2: ( RULE_INT )
            // InternalDomainmodel.g:1006:3: RULE_INT
            {
             before(grammarAccess.getInstructionWaitAccess().getTpsINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstructionWaitAccess().getTpsINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstructionWait__TpsAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalDomainmodel.g:1015:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1019:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1020:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1020:2: ( RULE_ID )
            // InternalDomainmodel.g:1021:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // InternalDomainmodel.g:1030:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1034:1: ( ( ( RULE_ID ) ) )
            // InternalDomainmodel.g:1035:2: ( ( RULE_ID ) )
            {
            // InternalDomainmodel.g:1035:2: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1036:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalDomainmodel.g:1037:3: ( RULE_ID )
            // InternalDomainmodel.g:1038:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__StartPointAssignment_4"
    // InternalDomainmodel.g:1049:1: rule__Entity__StartPointAssignment_4 : ( ruleStartPoint ) ;
    public final void rule__Entity__StartPointAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1053:1: ( ( ruleStartPoint ) )
            // InternalDomainmodel.g:1054:2: ( ruleStartPoint )
            {
            // InternalDomainmodel.g:1054:2: ( ruleStartPoint )
            // InternalDomainmodel.g:1055:3: ruleStartPoint
            {
             before(grammarAccess.getEntityAccess().getStartPointStartPointParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStartPoint();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getStartPointStartPointParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__StartPointAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000084002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});

}