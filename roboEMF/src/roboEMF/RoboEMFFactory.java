/**
 */
package roboEMF;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see roboEMF.RoboEMFPackage
 * @generated
 */
public interface RoboEMFFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoboEMFFactory eINSTANCE = roboEMF.impl.RoboEMFFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EScript</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EScript</em>'.
	 * @generated
	 */
	EScript createEScript();

	/**
	 * Returns a new object of class '<em>Sub Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Body</em>'.
	 * @generated
	 */
	SubBody createSubBody();

	/**
	 * Returns a new object of class '<em>Main Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Body</em>'.
	 * @generated
	 */
	MainBody createMainBody();

	/**
	 * Returns a new object of class '<em>EComment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EComment</em>'.
	 * @generated
	 */
	EComment createEComment();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Statement</em>'.
	 * @generated
	 */
	WhileStatement createWhileStatement();

	/**
	 * Returns a new object of class '<em>Repeate Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeate Statement</em>'.
	 * @generated
	 */
	RepeateStatement createRepeateStatement();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Routine Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routine Decl</em>'.
	 * @generated
	 */
	RoutineDecl createRoutineDecl();

	/**
	 * Returns a new object of class '<em>Routine Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routine Call</em>'.
	 * @generated
	 */
	RoutineCall createRoutineCall();

	/**
	 * Returns a new object of class '<em>Turn Left Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Left Cmd</em>'.
	 * @generated
	 */
	TurnLeftCmd createTurnLeftCmd();

	/**
	 * Returns a new object of class '<em>Trace Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Cmd</em>'.
	 * @generated
	 */
	TraceCmd createTraceCmd();

	/**
	 * Returns a new object of class '<em>Drop Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Cmd</em>'.
	 * @generated
	 */
	DropCmd createDropCmd();

	/**
	 * Returns a new object of class '<em>Step Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Cmd</em>'.
	 * @generated
	 */
	StepCmd createStepCmd();

	/**
	 * Returns a new object of class '<em>Pick Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pick Cmd</em>'.
	 * @generated
	 */
	PickCmd createPickCmd();

	/**
	 * Returns a new object of class '<em>Drop Mark Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Mark Cmd</em>'.
	 * @generated
	 */
	DropMarkCmd createDropMarkCmd();

	/**
	 * Returns a new object of class '<em>Pick Mark Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pick Mark Cmd</em>'.
	 * @generated
	 */
	PickMarkCmd createPickMarkCmd();

	/**
	 * Returns a new object of class '<em>Destroy Wall Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destroy Wall Cmd</em>'.
	 * @generated
	 */
	DestroyWallCmd createDestroyWallCmd();

	/**
	 * Returns a new object of class '<em>Build Wall Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Wall Cmd</em>'.
	 * @generated
	 */
	BuildWallCmd createBuildWallCmd();

	/**
	 * Returns a new object of class '<em>Full</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Full</em>'.
	 * @generated
	 */
	Full createFull();

	/**
	 * Returns a new object of class '<em>Mark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark</em>'.
	 * @generated
	 */
	Mark createMark();

	/**
	 * Returns a new object of class '<em>Wall Ahead</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wall Ahead</em>'.
	 * @generated
	 */
	WallAhead createWallAhead();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Brackets Cond</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Brackets Cond</em>'.
	 * @generated
	 */
	BracketsCond createBracketsCond();

	/**
	 * Returns a new object of class '<em>Not Cond</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Cond</em>'.
	 * @generated
	 */
	NotCond createNotCond();

	/**
	 * Returns a new object of class '<em>And Cond</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Cond</em>'.
	 * @generated
	 */
	AndCond createAndCond();

	/**
	 * Returns a new object of class '<em>Or Cond</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Cond</em>'.
	 * @generated
	 */
	OrCond createOrCond();

	/**
	 * Returns a new object of class '<em>Command Main</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Main</em>'.
	 * @generated
	 */
	CommandMain createCommandMain();

	/**
	 * Returns a new object of class '<em>Heading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heading</em>'.
	 * @generated
	 */
	Heading createHeading();

	/**
	 * Returns a new object of class '<em>Condition Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Model</em>'.
	 * @generated
	 */
	ConditionModel createConditionModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RoboEMFPackage getRoboEMFPackage();

} //RoboEMFFactory
