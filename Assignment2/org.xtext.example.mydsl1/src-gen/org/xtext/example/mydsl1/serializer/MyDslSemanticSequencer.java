/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl1.serializer;

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
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;
import robotmodel.AtomicCommand;
import robotmodel.BinaryExpression;
import robotmodel.Comment;
import robotmodel.ConstructionStatement;
import robotmodel.HeadingExpression;
import robotmodel.IfStatement;
import robotmodel.Name;
import robotmodel.NegatedExpression;
import robotmodel.NormalExpression;
import robotmodel.RepeatStatement;
import robotmodel.RobotmodelPackage;
import robotmodel.Script;
import robotmodel.StringExpression;
import robotmodel.TraceCommand;
import robotmodel.WallAheadExpression;
import robotmodel.WhileStatement;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RobotmodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RobotmodelPackage.ATOMIC_COMMAND:
				sequence_AtomicCommand(context, (AtomicCommand) semanticObject); 
				return; 
			case RobotmodelPackage.BINARY_EXPRESSION:
				sequence_BinaryExpression(context, (BinaryExpression) semanticObject); 
				return; 
			case RobotmodelPackage.COMMENT:
				sequence_Comment(context, (Comment) semanticObject); 
				return; 
			case RobotmodelPackage.CONSTRUCTION_STATEMENT:
				sequence_ConstructionStatement(context, (ConstructionStatement) semanticObject); 
				return; 
			case RobotmodelPackage.HEADING_EXPRESSION:
				sequence_HeadingExpression(context, (HeadingExpression) semanticObject); 
				return; 
			case RobotmodelPackage.IF_STATEMENT:
				sequence_IfStatement(context, (IfStatement) semanticObject); 
				return; 
			case RobotmodelPackage.INTEGER:
				sequence_Integer(context, (robotmodel.Integer) semanticObject); 
				return; 
			case RobotmodelPackage.NAME:
				sequence_Name(context, (Name) semanticObject); 
				return; 
			case RobotmodelPackage.NEGATED_EXPRESSION:
				sequence_NegatedExpression(context, (NegatedExpression) semanticObject); 
				return; 
			case RobotmodelPackage.NORMAL_EXPRESSION:
				sequence_NormalExpression(context, (NormalExpression) semanticObject); 
				return; 
			case RobotmodelPackage.REPEAT_STATEMENT:
				sequence_RepeatStatement(context, (RepeatStatement) semanticObject); 
				return; 
			case RobotmodelPackage.SCRIPT:
				sequence_Script(context, (Script) semanticObject); 
				return; 
			case RobotmodelPackage.STRING_EXPRESSION:
				sequence_StringExpression(context, (StringExpression) semanticObject); 
				return; 
			case RobotmodelPackage.TRACE_COMMAND:
				sequence_TraceCommand(context, (TraceCommand) semanticObject); 
				return; 
			case RobotmodelPackage.WALL_AHEAD_EXPRESSION:
				sequence_WallAheadExpression(context, (WallAheadExpression) semanticObject); 
				return; 
			case RobotmodelPackage.WHILE_STATEMENT:
				sequence_WhileStatement(context, (WhileStatement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns AtomicCommand
	 *     AtomicCommand returns AtomicCommand
	 *
	 * Constraint:
	 *     literal=CommandLiteral
	 */
	protected void sequence_AtomicCommand(ISerializationContext context, AtomicCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotmodelPackage.Literals.ATOMIC_COMMAND__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotmodelPackage.Literals.ATOMIC_COMMAND__LITERAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicCommandAccess().getLiteralCommandLiteralEnumRuleCall_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns BinaryExpression
	 *     BinaryExpression returns BinaryExpression
	 *
	 * Constraint:
	 *     (leftExpression=Expression operator=OperatorLiteral rightExpression=Expression)
	 */
	protected void sequence_BinaryExpression(ISerializationContext context, BinaryExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotmodelPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotmodelPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, RobotmodelPackage.Literals.BINARY_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotmodelPackage.Literals.BINARY_EXPRESSION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, RobotmodelPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotmodelPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryExpressionAccess().getLeftExpressionExpressionParserRuleCall_1_0(), semanticObject.getLeftExpression());
		feeder.accept(grammarAccess.getBinaryExpressionAccess().getOperatorOperatorLiteralEnumRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBinaryExpressionAccess().getRightExpressionExpressionParserRuleCall_3_0(), semanticObject.getRightExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Comment
	 *     Comment returns Comment
	 *
	 * Constraint:
	 *     {Comment}
	 */
	protected void sequence_Comment(ISerializationContext context, Comment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ConstructionStatement
	 *     ConstructionStatement returns ConstructionStatement
	 *
	 * Constraint:
	 *     (command=GridLiteral integers+=Integer integers+=Integer)
	 */
	protected void sequence_ConstructionStatement(ISerializationContext context, ConstructionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns HeadingExpression
	 *     HeadingExpression returns HeadingExpression
	 *
	 * Constraint:
	 *     (headingLiteral=HeadingLiteral directionLiteral=DirectionLiteral)
	 */
	protected void sequence_HeadingExpression(ISerializationContext context, HeadingExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotmodelPackage.Literals.HEADING_EXPRESSION__HEADING_LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotmodelPackage.Literals.HEADING_EXPRESSION__HEADING_LITERAL));
			if (transientValues.isValueTransient(semanticObject, RobotmodelPackage.Literals.HEADING_EXPRESSION__DIRECTION_LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotmodelPackage.Literals.HEADING_EXPRESSION__DIRECTION_LITERAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHeadingExpressionAccess().getHeadingLiteralHeadingLiteralEnumRuleCall_0_0(), semanticObject.getHeadingLiteral());
		feeder.accept(grammarAccess.getHeadingExpressionAccess().getDirectionLiteralDirectionLiteralEnumRuleCall_1_0(), semanticObject.getDirectionLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns IfStatement
	 *     IfStatement returns IfStatement
	 *
	 * Constraint:
	 *     (ifExpression=Expression statements+=Statement* statements2+=Statement*)
	 */
	protected void sequence_IfStatement(ISerializationContext context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Integer returns Integer
	 *
	 * Constraint:
	 *     {Integer}
	 */
	protected void sequence_Integer(ISerializationContext context, robotmodel.Integer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Name returns Name
	 *
	 * Constraint:
	 *     {Name}
	 */
	protected void sequence_Name(ISerializationContext context, Name semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns NegatedExpression
	 *     NegatedExpression returns NegatedExpression
	 *
	 * Constraint:
	 *     negatedExpression=Expression
	 */
	protected void sequence_NegatedExpression(ISerializationContext context, NegatedExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotmodelPackage.Literals.NEGATED_EXPRESSION__NEGATED_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotmodelPackage.Literals.NEGATED_EXPRESSION__NEGATED_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNegatedExpressionAccess().getNegatedExpressionExpressionParserRuleCall_1_0(), semanticObject.getNegatedExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns NormalExpression
	 *     NormalExpression returns NormalExpression
	 *
	 * Constraint:
	 *     literal=NormalExpressionLiteral
	 */
	protected void sequence_NormalExpression(ISerializationContext context, NormalExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotmodelPackage.Literals.NORMAL_EXPRESSION__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotmodelPackage.Literals.NORMAL_EXPRESSION__LITERAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNormalExpressionAccess().getLiteralNormalExpressionLiteralEnumRuleCall_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns RepeatStatement
	 *     RepeatStatement returns RepeatStatement
	 *
	 * Constraint:
	 *     (integer=Integer statements+=Statement*)
	 */
	protected void sequence_RepeatStatement(ISerializationContext context, RepeatStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Script returns Script
	 *
	 * Constraint:
	 *     (name=Name statements+=Statement*)
	 */
	protected void sequence_Script(ISerializationContext context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StringExpression returns StringExpression
	 *
	 * Constraint:
	 *     {StringExpression}
	 */
	protected void sequence_StringExpression(ISerializationContext context, StringExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns TraceCommand
	 *     TraceCommand returns TraceCommand
	 *
	 * Constraint:
	 *     string=StringExpression
	 */
	protected void sequence_TraceCommand(ISerializationContext context, TraceCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotmodelPackage.Literals.TRACE_COMMAND__STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotmodelPackage.Literals.TRACE_COMMAND__STRING));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTraceCommandAccess().getStringStringExpressionParserRuleCall_1_0(), semanticObject.getString());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns WallAheadExpression
	 *     WallAheadExpression returns WallAheadExpression
	 *
	 * Constraint:
	 *     (wall=WallLiteral ahead=AheadLiteral)
	 */
	protected void sequence_WallAheadExpression(ISerializationContext context, WallAheadExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotmodelPackage.Literals.WALL_AHEAD_EXPRESSION__WALL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotmodelPackage.Literals.WALL_AHEAD_EXPRESSION__WALL));
			if (transientValues.isValueTransient(semanticObject, RobotmodelPackage.Literals.WALL_AHEAD_EXPRESSION__AHEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotmodelPackage.Literals.WALL_AHEAD_EXPRESSION__AHEAD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWallAheadExpressionAccess().getWallWallLiteralEnumRuleCall_0_0(), semanticObject.getWall());
		feeder.accept(grammarAccess.getWallAheadExpressionAccess().getAheadAheadLiteralEnumRuleCall_1_0(), semanticObject.getAhead());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns WhileStatement
	 *     WhileStatement returns WhileStatement
	 *
	 * Constraint:
	 *     (whileExpression=Expression statements+=Statement*)
	 */
	protected void sequence_WhileStatement(ISerializationContext context, WhileStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}