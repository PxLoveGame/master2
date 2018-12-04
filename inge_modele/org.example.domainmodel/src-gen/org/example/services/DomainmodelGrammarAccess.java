/*
 * generated by Xtext 2.14.0
 */
package org.example.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DomainmodelGrammarAccess extends AbstractGrammarElementFinder {
	
	public class StartPointElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.Domainmodel.StartPoint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStartPointAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStartKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInstructionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInstructionsInstructionParserRuleCall_3_0 = (RuleCall)cInstructionsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//StartPoint:
		//	{StartPoint} 'start' '{'
		//	instructions+=Instruction*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{StartPoint} 'start' '{' instructions+=Instruction* '}'
		public Group getGroup() { return cGroup; }
		
		//{StartPoint}
		public Action getStartPointAction_0() { return cStartPointAction_0; }
		
		//'start'
		public Keyword getStartKeyword_1() { return cStartKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//instructions+=Instruction*
		public Assignment getInstructionsAssignment_3() { return cInstructionsAssignment_3; }
		
		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_3_0() { return cInstructionsInstructionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class InstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.Domainmodel.Instruction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInstructionMoveParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cInstructionWaitParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Instruction:
		//	InstructionMove | InstructionWait;
		@Override public ParserRule getRule() { return rule; }
		
		//InstructionMove | InstructionWait
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//InstructionMove
		public RuleCall getInstructionMoveParserRuleCall_0() { return cInstructionMoveParserRuleCall_0; }
		
		//InstructionWait
		public RuleCall getInstructionWaitParserRuleCall_1() { return cInstructionWaitParserRuleCall_1; }
	}
	public class InstructionMoveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.Domainmodel.InstructionMove");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMoveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFromKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFromAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFromINTTerminalRuleCall_2_0 = (RuleCall)cFromAssignment_2.eContents().get(0);
		private final Keyword cToKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cToAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cToINTTerminalRuleCall_4_0 = (RuleCall)cToAssignment_4.eContents().get(0);
		private final Keyword cQtyKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cQtyAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cQtyINTTerminalRuleCall_6_0 = (RuleCall)cQtyAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cThroughFilterKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cFilterAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cFilterINTTerminalRuleCall_7_1_0 = (RuleCall)cFilterAssignment_7_1.eContents().get(0);
		
		//InstructionMove:
		//	'move' 'from' from=INT 'to' to=INT 'qty' qty=INT ('through filter' filter=INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'move' 'from' from=INT 'to' to=INT 'qty' qty=INT ('through filter' filter=INT)?
		public Group getGroup() { return cGroup; }
		
		//'move'
		public Keyword getMoveKeyword_0() { return cMoveKeyword_0; }
		
		//'from'
		public Keyword getFromKeyword_1() { return cFromKeyword_1; }
		
		//from=INT
		public Assignment getFromAssignment_2() { return cFromAssignment_2; }
		
		//INT
		public RuleCall getFromINTTerminalRuleCall_2_0() { return cFromINTTerminalRuleCall_2_0; }
		
		//'to'
		public Keyword getToKeyword_3() { return cToKeyword_3; }
		
		//to=INT
		public Assignment getToAssignment_4() { return cToAssignment_4; }
		
		//INT
		public RuleCall getToINTTerminalRuleCall_4_0() { return cToINTTerminalRuleCall_4_0; }
		
		//'qty'
		public Keyword getQtyKeyword_5() { return cQtyKeyword_5; }
		
		//qty=INT
		public Assignment getQtyAssignment_6() { return cQtyAssignment_6; }
		
		//INT
		public RuleCall getQtyINTTerminalRuleCall_6_0() { return cQtyINTTerminalRuleCall_6_0; }
		
		//('through filter' filter=INT)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'through filter'
		public Keyword getThroughFilterKeyword_7_0() { return cThroughFilterKeyword_7_0; }
		
		//filter=INT
		public Assignment getFilterAssignment_7_1() { return cFilterAssignment_7_1; }
		
		//INT
		public RuleCall getFilterINTTerminalRuleCall_7_1_0() { return cFilterINTTerminalRuleCall_7_1_0; }
	}
	public class InstructionWaitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.Domainmodel.InstructionWait");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWaitKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTpsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTpsINTTerminalRuleCall_1_0 = (RuleCall)cTpsAssignment_1.eContents().get(0);
		private final Keyword cSKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//InstructionWait:
		//	'wait' tps=INT 's';
		@Override public ParserRule getRule() { return rule; }
		
		//'wait' tps=INT 's'
		public Group getGroup() { return cGroup; }
		
		//'wait'
		public Keyword getWaitKeyword_0() { return cWaitKeyword_0; }
		
		//tps=INT
		public Assignment getTpsAssignment_1() { return cTpsAssignment_1; }
		
		//INT
		public RuleCall getTpsINTTerminalRuleCall_1_0() { return cTpsINTTerminalRuleCall_1_0; }
		
		//'s'
		public Keyword getSKeyword_2() { return cSKeyword_2; }
	}
	public class DomainmodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.Domainmodel.Domainmodel");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsTypeParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Domainmodel:
		//	elements+=Type*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Type*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Type
		public RuleCall getElementsTypeParserRuleCall_0() { return cElementsTypeParserRuleCall_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.Domainmodel.Type");
		private final RuleCall cEntityParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Type:
		//	Entity;
		@Override public ParserRule getRule() { return rule; }
		
		//Entity
		public RuleCall getEntityParserRuleCall() { return cEntityParserRuleCall; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.Domainmodel.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStartPointAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStartPointStartPointParserRuleCall_4_0 = (RuleCall)cStartPointAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//	'entity' name=ID ('extends' superType=[Entity])? '{'
		//	startPoint=StartPoint '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID ('extends' superType=[Entity])? '{' startPoint=StartPoint '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' superType=[Entity])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//superType=[Entity]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[Entity]
		public CrossReference getSuperTypeEntityCrossReference_2_1_0() { return cSuperTypeEntityCrossReference_2_1_0; }
		
		//ID
		public RuleCall getSuperTypeEntityIDTerminalRuleCall_2_1_0_1() { return cSuperTypeEntityIDTerminalRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//startPoint=StartPoint
		public Assignment getStartPointAssignment_4() { return cStartPointAssignment_4; }
		
		//StartPoint
		public RuleCall getStartPointStartPointParserRuleCall_4_0() { return cStartPointStartPointParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	
	
	private final StartPointElements pStartPoint;
	private final InstructionElements pInstruction;
	private final InstructionMoveElements pInstructionMove;
	private final InstructionWaitElements pInstructionWait;
	private final DomainmodelElements pDomainmodel;
	private final TypeElements pType;
	private final EntityElements pEntity;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DomainmodelGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pStartPoint = new StartPointElements();
		this.pInstruction = new InstructionElements();
		this.pInstructionMove = new InstructionMoveElements();
		this.pInstructionWait = new InstructionWaitElements();
		this.pDomainmodel = new DomainmodelElements();
		this.pType = new TypeElements();
		this.pEntity = new EntityElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.example.Domainmodel".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//StartPoint:
	//	{StartPoint} 'start' '{'
	//	instructions+=Instruction*
	//	'}';
	public StartPointElements getStartPointAccess() {
		return pStartPoint;
	}
	
	public ParserRule getStartPointRule() {
		return getStartPointAccess().getRule();
	}
	
	//Instruction:
	//	InstructionMove | InstructionWait;
	public InstructionElements getInstructionAccess() {
		return pInstruction;
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}
	
	//InstructionMove:
	//	'move' 'from' from=INT 'to' to=INT 'qty' qty=INT ('through filter' filter=INT)?;
	public InstructionMoveElements getInstructionMoveAccess() {
		return pInstructionMove;
	}
	
	public ParserRule getInstructionMoveRule() {
		return getInstructionMoveAccess().getRule();
	}
	
	//InstructionWait:
	//	'wait' tps=INT 's';
	public InstructionWaitElements getInstructionWaitAccess() {
		return pInstructionWait;
	}
	
	public ParserRule getInstructionWaitRule() {
		return getInstructionWaitAccess().getRule();
	}
	
	//Domainmodel:
	//	elements+=Type*;
	public DomainmodelElements getDomainmodelAccess() {
		return pDomainmodel;
	}
	
	public ParserRule getDomainmodelRule() {
		return getDomainmodelAccess().getRule();
	}
	
	//Type:
	//	Entity;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID ('extends' superType=[Entity])? '{'
	//	startPoint=StartPoint '}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}