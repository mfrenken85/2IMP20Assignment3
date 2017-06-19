/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.robodsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.robodsl.services.RoboDslGrammarAccess;
import roboEMF.AndCond;
import roboEMF.BracketsCond;
import roboEMF.BuildWallCmd;
import roboEMF.Condition;
import roboEMF.DestroyWallCmd;
import roboEMF.DropCmd;
import roboEMF.DropMarkCmd;
import roboEMF.EComment;
import roboEMF.EScript;
import roboEMF.IfStatement;
import roboEMF.Location;
import roboEMF.MainBody;
import roboEMF.NotCond;
import roboEMF.OrCond;
import roboEMF.PickCmd;
import roboEMF.PickMarkCmd;
import roboEMF.RepeateStatement;
import roboEMF.RoboEMFPackage;
import roboEMF.StepCmd;
import roboEMF.SubBody;
import roboEMF.TraceCmd;
import roboEMF.TurnLeftCmd;
import roboEMF.WhileStatement;

@SuppressWarnings("all")
public class RoboDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RoboDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RoboEMFPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RoboEMFPackage.AND_COND:
				sequence_AndCond(context, (AndCond) semanticObject); 
				return; 
			case RoboEMFPackage.BRACKETS_COND:
				sequence_BracketsCond(context, (BracketsCond) semanticObject); 
				return; 
			case RoboEMFPackage.BUILD_WALL_CMD:
				sequence_BuildWallCmd(context, (BuildWallCmd) semanticObject); 
				return; 
			case RoboEMFPackage.CONDITION:
				sequence_Full_Heading_Mark_WallAhead(context, (Condition) semanticObject); 
				return; 
			case RoboEMFPackage.DESTROY_WALL_CMD:
				sequence_DestroyWallCmd(context, (DestroyWallCmd) semanticObject); 
				return; 
			case RoboEMFPackage.DROP_CMD:
				sequence_DropCmd(context, (DropCmd) semanticObject); 
				return; 
			case RoboEMFPackage.DROP_MARK_CMD:
				sequence_DropMarkCmd(context, (DropMarkCmd) semanticObject); 
				return; 
			case RoboEMFPackage.ECOMMENT:
				sequence_EComment(context, (EComment) semanticObject); 
				return; 
			case RoboEMFPackage.ESCRIPT:
				sequence_EScript(context, (EScript) semanticObject); 
				return; 
			case RoboEMFPackage.IF_STATEMENT:
				sequence_IfStatement(context, (IfStatement) semanticObject); 
				return; 
			case RoboEMFPackage.LOCATION:
				sequence_Location(context, (Location) semanticObject); 
				return; 
			case RoboEMFPackage.MAIN_BODY:
				sequence_MainBody(context, (MainBody) semanticObject); 
				return; 
			case RoboEMFPackage.NOT_COND:
				sequence_NotCond(context, (NotCond) semanticObject); 
				return; 
			case RoboEMFPackage.OR_COND:
				sequence_OrCond(context, (OrCond) semanticObject); 
				return; 
			case RoboEMFPackage.PICK_CMD:
				sequence_PickCmd(context, (PickCmd) semanticObject); 
				return; 
			case RoboEMFPackage.PICK_MARK_CMD:
				sequence_PickMarkCmd(context, (PickMarkCmd) semanticObject); 
				return; 
			case RoboEMFPackage.REPEATE_STATEMENT:
				sequence_RepeateStatement(context, (RepeateStatement) semanticObject); 
				return; 
			case RoboEMFPackage.STEP_CMD:
				sequence_StepCmd(context, (StepCmd) semanticObject); 
				return; 
			case RoboEMFPackage.SUB_BODY:
				sequence_SubBody(context, (SubBody) semanticObject); 
				return; 
			case RoboEMFPackage.TRACE_CMD:
				sequence_TraceCmd(context, (TraceCmd) semanticObject); 
				return; 
			case RoboEMFPackage.TURN_LEFT_CMD:
				sequence_TurnLeftCmd(context, (TurnLeftCmd) semanticObject); 
				return; 
			case RoboEMFPackage.WHILE_STATEMENT:
				sequence_WhileStatement(context, (WhileStatement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AndCond returns AndCond
	 *
	 * Constraint:
	 *     (lhs=NotCond rhs=AndCond?)
	 */
	protected void sequence_AndCond(ISerializationContext context, AndCond semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BracketsCond returns BracketsCond
	 *
	 * Constraint:
	 *     (orcond=OrCond | condition=Condition)
	 */
	protected void sequence_BracketsCond(ISerializationContext context, BracketsCond semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns BuildWallCmd
	 *     BuildWallCmd returns BuildWallCmd
	 *
	 * Constraint:
	 *     location=Location
	 */
	protected void sequence_BuildWallCmd(ISerializationContext context, BuildWallCmd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.BUILD_WALL_CMD__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.BUILD_WALL_CMD__LOCATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBuildWallCmdAccess().getLocationLocationParserRuleCall_2_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns DestroyWallCmd
	 *     DestroyWallCmd returns DestroyWallCmd
	 *
	 * Constraint:
	 *     location=Location
	 */
	protected void sequence_DestroyWallCmd(ISerializationContext context, DestroyWallCmd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.DESTROY_WALL_CMD__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.DESTROY_WALL_CMD__LOCATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDestroyWallCmdAccess().getLocationLocationParserRuleCall_2_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns DropCmd
	 *     DropCmd returns DropCmd
	 *
	 * Constraint:
	 *     {DropCmd}
	 */
	protected void sequence_DropCmd(ISerializationContext context, DropCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns DropMarkCmd
	 *     DropMarkCmd returns DropMarkCmd
	 *
	 * Constraint:
	 *     location=Location
	 */
	protected void sequence_DropMarkCmd(ISerializationContext context, DropMarkCmd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.DROP_MARK_CMD__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.DROP_MARK_CMD__LOCATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDropMarkCmdAccess().getLocationLocationParserRuleCall_2_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns EComment
	 *     EComment returns EComment
	 *
	 * Constraint:
	 *     comment=COMMENTSTRING
	 */
	protected void sequence_EComment(ISerializationContext context, EComment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.ECOMMENT__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.ECOMMENT__COMMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getECommentAccess().getCommentCOMMENTSTRINGTerminalRuleCall_1_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EScript returns EScript
	 *
	 * Constraint:
	 *     (Name=EString mainbody=MainBody)
	 */
	protected void sequence_EScript(ISerializationContext context, EScript semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.ESCRIPT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.ESCRIPT__NAME));
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.ESCRIPT__MAINBODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.ESCRIPT__MAINBODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEScriptAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEScriptAccess().getMainbodyMainBodyParserRuleCall_5_0(), semanticObject.getMainbody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *     Full returns Condition
	 *     Mark returns Condition
	 *     WallAhead returns Condition
	 *     Heading returns Condition
	 *
	 * Constraint:
	 *     {Condition}
	 */
	protected void sequence_Full_Heading_Mark_WallAhead(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns IfStatement
	 *     IfStatement returns IfStatement
	 *
	 * Constraint:
	 *     (conditionmodel=ConditionModel subbody=SubBody elsebody=SubBody?)
	 */
	protected void sequence_IfStatement(ISerializationContext context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Location returns Location
	 *
	 * Constraint:
	 *     (row=EInteger col=EInteger)
	 */
	protected void sequence_Location(ISerializationContext context, Location semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.LOCATION__ROW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.LOCATION__ROW));
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.LOCATION__COL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.LOCATION__COL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocationAccess().getRowEIntegerParserRuleCall_2_0(), semanticObject.getRow());
		feeder.accept(grammarAccess.getLocationAccess().getColEIntegerParserRuleCall_4_0(), semanticObject.getCol());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MainBody returns MainBody
	 *
	 * Constraint:
	 *     (command+=Command command+=Command*)
	 */
	protected void sequence_MainBody(ISerializationContext context, MainBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NotCond returns NotCond
	 *
	 * Constraint:
	 *     (not?='not'? brackets=BracketsCond)
	 */
	protected void sequence_NotCond(ISerializationContext context, NotCond semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionModel returns OrCond
	 *     OrCond returns OrCond
	 *
	 * Constraint:
	 *     (lhs=AndCond rhs=OrCond?)
	 */
	protected void sequence_OrCond(ISerializationContext context, OrCond semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns PickCmd
	 *     PickCmd returns PickCmd
	 *
	 * Constraint:
	 *     {PickCmd}
	 */
	protected void sequence_PickCmd(ISerializationContext context, PickCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns PickMarkCmd
	 *     PickMarkCmd returns PickMarkCmd
	 *
	 * Constraint:
	 *     location=Location
	 */
	protected void sequence_PickMarkCmd(ISerializationContext context, PickMarkCmd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.PICK_MARK_CMD__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.PICK_MARK_CMD__LOCATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPickMarkCmdAccess().getLocationLocationParserRuleCall_2_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns RepeateStatement
	 *     RepeateStatement returns RepeateStatement
	 *
	 * Constraint:
	 *     (count=EInteger subbody=SubBody)
	 */
	protected void sequence_RepeateStatement(ISerializationContext context, RepeateStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.REPEATE_STATEMENT__COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.REPEATE_STATEMENT__COUNT));
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.REPEATE_STATEMENT__SUBBODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.REPEATE_STATEMENT__SUBBODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRepeateStatementAccess().getCountEIntegerParserRuleCall_2_0(), semanticObject.getCount());
		feeder.accept(grammarAccess.getRepeateStatementAccess().getSubbodySubBodyParserRuleCall_4_0(), semanticObject.getSubbody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns StepCmd
	 *     StepCmd returns StepCmd
	 *
	 * Constraint:
	 *     {StepCmd}
	 */
	protected void sequence_StepCmd(ISerializationContext context, StepCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SubBody returns SubBody
	 *
	 * Constraint:
	 *     (command+=Command command+=Command*)
	 */
	protected void sequence_SubBody(ISerializationContext context, SubBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns TraceCmd
	 *     TraceCmd returns TraceCmd
	 *
	 * Constraint:
	 *     trace=TRACESTRING
	 */
	protected void sequence_TraceCmd(ISerializationContext context, TraceCmd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.TRACE_CMD__TRACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.TRACE_CMD__TRACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTraceCmdAccess().getTraceTRACESTRINGTerminalRuleCall_2_0(), semanticObject.getTrace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns TurnLeftCmd
	 *     TurnLeftCmd returns TurnLeftCmd
	 *
	 * Constraint:
	 *     {TurnLeftCmd}
	 */
	protected void sequence_TurnLeftCmd(ISerializationContext context, TurnLeftCmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns WhileStatement
	 *     WhileStatement returns WhileStatement
	 *
	 * Constraint:
	 *     (conditionmodel=ConditionModel subbody=SubBody)
	 */
	protected void sequence_WhileStatement(ISerializationContext context, WhileStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.WHILE_STATEMENT__CONDITIONMODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.WHILE_STATEMENT__CONDITIONMODEL));
			if (transientValues.isValueTransient(semanticObject, RoboEMFPackage.Literals.WHILE_STATEMENT__SUBBODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboEMFPackage.Literals.WHILE_STATEMENT__SUBBODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhileStatementAccess().getConditionmodelConditionModelParserRuleCall_2_0(), semanticObject.getConditionmodel());
		feeder.accept(grammarAccess.getWhileStatementAccess().getSubbodySubBodyParserRuleCall_4_0(), semanticObject.getSubbody());
		feeder.finish();
	}
	
	
}
