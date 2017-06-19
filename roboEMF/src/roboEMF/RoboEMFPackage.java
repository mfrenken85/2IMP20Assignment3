/**
 */
package roboEMF;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see roboEMF.RoboEMFFactory
 * @model kind="package"
 * @generated
 */
public interface RoboEMFPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "roboEMF";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/roboEMF";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "roboEMF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoboEMFPackage eINSTANCE = roboEMF.impl.RoboEMFPackageImpl.init();

	/**
	 * The meta object id for the '{@link roboEMF.impl.EScriptImpl <em>EScript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.EScriptImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getEScript()
	 * @generated
	 */
	int ESCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCRIPT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mainbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCRIPT__MAINBODY = 1;

	/**
	 * The number of structural features of the '<em>EScript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCRIPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EScript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.SubBodyImpl <em>Sub Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.SubBodyImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getSubBody()
	 * @generated
	 */
	int SUB_BODY = 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_BODY__COMMAND = 0;

	/**
	 * The number of structural features of the '<em>Sub Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_BODY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sub Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.MainBodyImpl <em>Main Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.MainBodyImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getMainBody()
	 * @generated
	 */
	int MAIN_BODY = 2;

	/**
	 * The feature id for the '<em><b>Commandmain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BODY__COMMANDMAIN = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BODY__COMMAND = 1;

	/**
	 * The number of structural features of the '<em>Main Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BODY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Main Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.CommandImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 4;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.ECommentImpl <em>EComment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.ECommentImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getEComment()
	 * @generated
	 */
	int ECOMMENT = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMENT__COMMENT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EComment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMENT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EComment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMENT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.IfStatementImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Subbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__SUBBODY = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditionmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITIONMODEL = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elsebody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSEBODY = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.WhileStatementImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Subbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__SUBBODY = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditionmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITIONMODEL = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.RepeateStatementImpl <em>Repeate Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.RepeateStatementImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getRepeateStatement()
	 * @generated
	 */
	int REPEATE_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATE_STATEMENT__COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATE_STATEMENT__SUBBODY = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeate Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATE_STATEMENT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repeate Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATE_STATEMENT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.ConditionImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.CommandMainImpl <em>Command Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.CommandMainImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getCommandMain()
	 * @generated
	 */
	int COMMAND_MAIN = 28;

	/**
	 * The number of structural features of the '<em>Command Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MAIN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Command Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_MAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.RoutineDeclImpl <em>Routine Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.RoutineDeclImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getRoutineDecl()
	 * @generated
	 */
	int ROUTINE_DECL = 9;

	/**
	 * The feature id for the '<em><b>Subbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_DECL__SUBBODY = COMMAND_MAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_DECL__NAME = COMMAND_MAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Routine Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_DECL_FEATURE_COUNT = COMMAND_MAIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Routine Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_DECL_OPERATION_COUNT = COMMAND_MAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.RoutineCallImpl <em>Routine Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.RoutineCallImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getRoutineCall()
	 * @generated
	 */
	int ROUTINE_CALL = 10;

	/**
	 * The feature id for the '<em><b>Decl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_CALL__DECL = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Routine Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_CALL_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Routine Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTINE_CALL_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.TurnLeftCmdImpl <em>Turn Left Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.TurnLeftCmdImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getTurnLeftCmd()
	 * @generated
	 */
	int TURN_LEFT_CMD = 11;

	/**
	 * The number of structural features of the '<em>Turn Left Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Left Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.TraceCmdImpl <em>Trace Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.TraceCmdImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getTraceCmd()
	 * @generated
	 */
	int TRACE_CMD = 12;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_CMD__TRACE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trace Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.DropCmdImpl <em>Drop Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.DropCmdImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getDropCmd()
	 * @generated
	 */
	int DROP_CMD = 13;

	/**
	 * The number of structural features of the '<em>Drop Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Drop Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.StepCmdImpl <em>Step Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.StepCmdImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getStepCmd()
	 * @generated
	 */
	int STEP_CMD = 14;

	/**
	 * The number of structural features of the '<em>Step Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Step Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.PickCmdImpl <em>Pick Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.PickCmdImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getPickCmd()
	 * @generated
	 */
	int PICK_CMD = 15;

	/**
	 * The number of structural features of the '<em>Pick Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pick Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.DropMarkCmdImpl <em>Drop Mark Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.DropMarkCmdImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getDropMarkCmd()
	 * @generated
	 */
	int DROP_MARK_CMD = 16;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MARK_CMD__LOCATION = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Mark Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MARK_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drop Mark Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MARK_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.PickMarkCmdImpl <em>Pick Mark Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.PickMarkCmdImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getPickMarkCmd()
	 * @generated
	 */
	int PICK_MARK_CMD = 17;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_MARK_CMD__LOCATION = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pick Mark Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_MARK_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pick Mark Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_MARK_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.DestroyWallCmdImpl <em>Destroy Wall Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.DestroyWallCmdImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getDestroyWallCmd()
	 * @generated
	 */
	int DESTROY_WALL_CMD = 18;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_WALL_CMD__LOCATION = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Destroy Wall Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_WALL_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Destroy Wall Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_WALL_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.BuildWallCmdImpl <em>Build Wall Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.BuildWallCmdImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getBuildWallCmd()
	 * @generated
	 */
	int BUILD_WALL_CMD = 19;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_WALL_CMD__LOCATION = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Build Wall Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_WALL_CMD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Build Wall Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_WALL_CMD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.FullImpl <em>Full</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.FullImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getFull()
	 * @generated
	 */
	int FULL = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL__VALUE = CONDITION__VALUE;

	/**
	 * The number of structural features of the '<em>Full</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Full</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.MarkImpl <em>Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.MarkImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getMark()
	 * @generated
	 */
	int MARK = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__VALUE = CONDITION__VALUE;

	/**
	 * The number of structural features of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.WallAheadImpl <em>Wall Ahead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.WallAheadImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getWallAhead()
	 * @generated
	 */
	int WALL_AHEAD = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_AHEAD__VALUE = CONDITION__VALUE;

	/**
	 * The number of structural features of the '<em>Wall Ahead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_AHEAD_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wall Ahead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_AHEAD_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.LocationImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 23;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ROW = 0;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COL = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.BracketsCondImpl <em>Brackets Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.BracketsCondImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getBracketsCond()
	 * @generated
	 */
	int BRACKETS_COND = 24;

	/**
	 * The feature id for the '<em><b>Orcond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKETS_COND__ORCOND = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKETS_COND__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Brackets Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKETS_COND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Brackets Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKETS_COND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.NotCondImpl <em>Not Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.NotCondImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getNotCond()
	 * @generated
	 */
	int NOT_COND = 25;

	/**
	 * The feature id for the '<em><b>Brackets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_COND__BRACKETS = 0;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_COND__NOT = 1;

	/**
	 * The number of structural features of the '<em>Not Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_COND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Not Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_COND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.AndCondImpl <em>And Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.AndCondImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getAndCond()
	 * @generated
	 */
	int AND_COND = 26;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_COND__LHS = 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_COND__RHS = 1;

	/**
	 * The number of structural features of the '<em>And Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_COND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>And Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_COND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.ConditionModelImpl <em>Condition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.ConditionModelImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getConditionModel()
	 * @generated
	 */
	int CONDITION_MODEL = 30;

	/**
	 * The number of structural features of the '<em>Condition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.OrCondImpl <em>Or Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.OrCondImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getOrCond()
	 * @generated
	 */
	int OR_COND = 27;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_COND__RHS = CONDITION_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_COND__LHS = CONDITION_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_COND_FEATURE_COUNT = CONDITION_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Or Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_COND_OPERATION_COUNT = CONDITION_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link roboEMF.impl.HeadingImpl <em>Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roboEMF.impl.HeadingImpl
	 * @see roboEMF.impl.RoboEMFPackageImpl#getHeading()
	 * @generated
	 */
	int HEADING = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__VALUE = CONDITION__VALUE;

	/**
	 * The number of structural features of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>EString</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see roboEMF.impl.RoboEMFPackageImpl#getEString()
	 * @generated
	 */
	int ESTRING = 31;

	/**
	 * The meta object id for the '<em>EInteger</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see roboEMF.impl.RoboEMFPackageImpl#getEInteger()
	 * @generated
	 */
	int EINTEGER = 32;


	/**
	 * Returns the meta object for class '{@link roboEMF.EScript <em>EScript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EScript</em>'.
	 * @see roboEMF.EScript
	 * @generated
	 */
	EClass getEScript();

	/**
	 * Returns the meta object for the attribute '{@link roboEMF.EScript#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roboEMF.EScript#getName()
	 * @see #getEScript()
	 * @generated
	 */
	EAttribute getEScript_Name();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.EScript#getMainbody <em>Mainbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mainbody</em>'.
	 * @see roboEMF.EScript#getMainbody()
	 * @see #getEScript()
	 * @generated
	 */
	EReference getEScript_Mainbody();

	/**
	 * Returns the meta object for class '{@link roboEMF.SubBody <em>Sub Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Body</em>'.
	 * @see roboEMF.SubBody
	 * @generated
	 */
	EClass getSubBody();

	/**
	 * Returns the meta object for the containment reference list '{@link roboEMF.SubBody#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see roboEMF.SubBody#getCommand()
	 * @see #getSubBody()
	 * @generated
	 */
	EReference getSubBody_Command();

	/**
	 * Returns the meta object for class '{@link roboEMF.MainBody <em>Main Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Body</em>'.
	 * @see roboEMF.MainBody
	 * @generated
	 */
	EClass getMainBody();

	/**
	 * Returns the meta object for the containment reference list '{@link roboEMF.MainBody#getCommandmain <em>Commandmain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commandmain</em>'.
	 * @see roboEMF.MainBody#getCommandmain()
	 * @see #getMainBody()
	 * @generated
	 */
	EReference getMainBody_Commandmain();

	/**
	 * Returns the meta object for the containment reference list '{@link roboEMF.MainBody#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see roboEMF.MainBody#getCommand()
	 * @see #getMainBody()
	 * @generated
	 */
	EReference getMainBody_Command();

	/**
	 * Returns the meta object for class '{@link roboEMF.EComment <em>EComment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EComment</em>'.
	 * @see roboEMF.EComment
	 * @generated
	 */
	EClass getEComment();

	/**
	 * Returns the meta object for the attribute '{@link roboEMF.EComment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see roboEMF.EComment#getComment()
	 * @see #getEComment()
	 * @generated
	 */
	EAttribute getEComment_Comment();

	/**
	 * Returns the meta object for class '{@link roboEMF.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see roboEMF.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link roboEMF.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see roboEMF.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.IfStatement#getSubbody <em>Subbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subbody</em>'.
	 * @see roboEMF.IfStatement#getSubbody()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Subbody();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.IfStatement#getConditionmodel <em>Conditionmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditionmodel</em>'.
	 * @see roboEMF.IfStatement#getConditionmodel()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Conditionmodel();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.IfStatement#getElsebody <em>Elsebody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elsebody</em>'.
	 * @see roboEMF.IfStatement#getElsebody()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Elsebody();

	/**
	 * Returns the meta object for class '{@link roboEMF.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see roboEMF.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.WhileStatement#getSubbody <em>Subbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subbody</em>'.
	 * @see roboEMF.WhileStatement#getSubbody()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Subbody();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.WhileStatement#getConditionmodel <em>Conditionmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditionmodel</em>'.
	 * @see roboEMF.WhileStatement#getConditionmodel()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Conditionmodel();

	/**
	 * Returns the meta object for class '{@link roboEMF.RepeateStatement <em>Repeate Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeate Statement</em>'.
	 * @see roboEMF.RepeateStatement
	 * @generated
	 */
	EClass getRepeateStatement();

	/**
	 * Returns the meta object for the attribute '{@link roboEMF.RepeateStatement#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see roboEMF.RepeateStatement#getCount()
	 * @see #getRepeateStatement()
	 * @generated
	 */
	EAttribute getRepeateStatement_Count();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.RepeateStatement#getSubbody <em>Subbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subbody</em>'.
	 * @see roboEMF.RepeateStatement#getSubbody()
	 * @see #getRepeateStatement()
	 * @generated
	 */
	EReference getRepeateStatement_Subbody();

	/**
	 * Returns the meta object for class '{@link roboEMF.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see roboEMF.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link roboEMF.Condition#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see roboEMF.Condition#isValue()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Value();

	/**
	 * Returns the meta object for class '{@link roboEMF.RoutineDecl <em>Routine Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routine Decl</em>'.
	 * @see roboEMF.RoutineDecl
	 * @generated
	 */
	EClass getRoutineDecl();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.RoutineDecl#getSubbody <em>Subbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subbody</em>'.
	 * @see roboEMF.RoutineDecl#getSubbody()
	 * @see #getRoutineDecl()
	 * @generated
	 */
	EReference getRoutineDecl_Subbody();

	/**
	 * Returns the meta object for the attribute '{@link roboEMF.RoutineDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roboEMF.RoutineDecl#getName()
	 * @see #getRoutineDecl()
	 * @generated
	 */
	EAttribute getRoutineDecl_Name();

	/**
	 * Returns the meta object for class '{@link roboEMF.RoutineCall <em>Routine Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routine Call</em>'.
	 * @see roboEMF.RoutineCall
	 * @generated
	 */
	EClass getRoutineCall();

	/**
	 * Returns the meta object for the reference '{@link roboEMF.RoutineCall#getDecl <em>Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decl</em>'.
	 * @see roboEMF.RoutineCall#getDecl()
	 * @see #getRoutineCall()
	 * @generated
	 */
	EReference getRoutineCall_Decl();

	/**
	 * Returns the meta object for class '{@link roboEMF.TurnLeftCmd <em>Turn Left Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Left Cmd</em>'.
	 * @see roboEMF.TurnLeftCmd
	 * @generated
	 */
	EClass getTurnLeftCmd();

	/**
	 * Returns the meta object for class '{@link roboEMF.TraceCmd <em>Trace Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Cmd</em>'.
	 * @see roboEMF.TraceCmd
	 * @generated
	 */
	EClass getTraceCmd();

	/**
	 * Returns the meta object for the attribute '{@link roboEMF.TraceCmd#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace</em>'.
	 * @see roboEMF.TraceCmd#getTrace()
	 * @see #getTraceCmd()
	 * @generated
	 */
	EAttribute getTraceCmd_Trace();

	/**
	 * Returns the meta object for class '{@link roboEMF.DropCmd <em>Drop Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Cmd</em>'.
	 * @see roboEMF.DropCmd
	 * @generated
	 */
	EClass getDropCmd();

	/**
	 * Returns the meta object for class '{@link roboEMF.StepCmd <em>Step Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Cmd</em>'.
	 * @see roboEMF.StepCmd
	 * @generated
	 */
	EClass getStepCmd();

	/**
	 * Returns the meta object for class '{@link roboEMF.PickCmd <em>Pick Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick Cmd</em>'.
	 * @see roboEMF.PickCmd
	 * @generated
	 */
	EClass getPickCmd();

	/**
	 * Returns the meta object for class '{@link roboEMF.DropMarkCmd <em>Drop Mark Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Mark Cmd</em>'.
	 * @see roboEMF.DropMarkCmd
	 * @generated
	 */
	EClass getDropMarkCmd();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.DropMarkCmd#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see roboEMF.DropMarkCmd#getLocation()
	 * @see #getDropMarkCmd()
	 * @generated
	 */
	EReference getDropMarkCmd_Location();

	/**
	 * Returns the meta object for class '{@link roboEMF.PickMarkCmd <em>Pick Mark Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick Mark Cmd</em>'.
	 * @see roboEMF.PickMarkCmd
	 * @generated
	 */
	EClass getPickMarkCmd();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.PickMarkCmd#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see roboEMF.PickMarkCmd#getLocation()
	 * @see #getPickMarkCmd()
	 * @generated
	 */
	EReference getPickMarkCmd_Location();

	/**
	 * Returns the meta object for class '{@link roboEMF.DestroyWallCmd <em>Destroy Wall Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy Wall Cmd</em>'.
	 * @see roboEMF.DestroyWallCmd
	 * @generated
	 */
	EClass getDestroyWallCmd();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.DestroyWallCmd#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see roboEMF.DestroyWallCmd#getLocation()
	 * @see #getDestroyWallCmd()
	 * @generated
	 */
	EReference getDestroyWallCmd_Location();

	/**
	 * Returns the meta object for class '{@link roboEMF.BuildWallCmd <em>Build Wall Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Wall Cmd</em>'.
	 * @see roboEMF.BuildWallCmd
	 * @generated
	 */
	EClass getBuildWallCmd();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.BuildWallCmd#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see roboEMF.BuildWallCmd#getLocation()
	 * @see #getBuildWallCmd()
	 * @generated
	 */
	EReference getBuildWallCmd_Location();

	/**
	 * Returns the meta object for class '{@link roboEMF.Full <em>Full</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full</em>'.
	 * @see roboEMF.Full
	 * @generated
	 */
	EClass getFull();

	/**
	 * Returns the meta object for class '{@link roboEMF.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark</em>'.
	 * @see roboEMF.Mark
	 * @generated
	 */
	EClass getMark();

	/**
	 * Returns the meta object for class '{@link roboEMF.WallAhead <em>Wall Ahead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wall Ahead</em>'.
	 * @see roboEMF.WallAhead
	 * @generated
	 */
	EClass getWallAhead();

	/**
	 * Returns the meta object for class '{@link roboEMF.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see roboEMF.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link roboEMF.Location#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see roboEMF.Location#getRow()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Row();

	/**
	 * Returns the meta object for the attribute '{@link roboEMF.Location#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col</em>'.
	 * @see roboEMF.Location#getCol()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Col();

	/**
	 * Returns the meta object for class '{@link roboEMF.BracketsCond <em>Brackets Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brackets Cond</em>'.
	 * @see roboEMF.BracketsCond
	 * @generated
	 */
	EClass getBracketsCond();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.BracketsCond#getOrcond <em>Orcond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orcond</em>'.
	 * @see roboEMF.BracketsCond#getOrcond()
	 * @see #getBracketsCond()
	 * @generated
	 */
	EReference getBracketsCond_Orcond();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.BracketsCond#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see roboEMF.BracketsCond#getCondition()
	 * @see #getBracketsCond()
	 * @generated
	 */
	EReference getBracketsCond_Condition();

	/**
	 * Returns the meta object for class '{@link roboEMF.NotCond <em>Not Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Cond</em>'.
	 * @see roboEMF.NotCond
	 * @generated
	 */
	EClass getNotCond();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.NotCond#getBrackets <em>Brackets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Brackets</em>'.
	 * @see roboEMF.NotCond#getBrackets()
	 * @see #getNotCond()
	 * @generated
	 */
	EReference getNotCond_Brackets();

	/**
	 * Returns the meta object for the attribute '{@link roboEMF.NotCond#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see roboEMF.NotCond#isNot()
	 * @see #getNotCond()
	 * @generated
	 */
	EAttribute getNotCond_Not();

	/**
	 * Returns the meta object for class '{@link roboEMF.AndCond <em>And Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Cond</em>'.
	 * @see roboEMF.AndCond
	 * @generated
	 */
	EClass getAndCond();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.AndCond#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see roboEMF.AndCond#getLhs()
	 * @see #getAndCond()
	 * @generated
	 */
	EReference getAndCond_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.AndCond#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see roboEMF.AndCond#getRhs()
	 * @see #getAndCond()
	 * @generated
	 */
	EReference getAndCond_Rhs();

	/**
	 * Returns the meta object for class '{@link roboEMF.OrCond <em>Or Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Cond</em>'.
	 * @see roboEMF.OrCond
	 * @generated
	 */
	EClass getOrCond();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.OrCond#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see roboEMF.OrCond#getRhs()
	 * @see #getOrCond()
	 * @generated
	 */
	EReference getOrCond_Rhs();

	/**
	 * Returns the meta object for the containment reference '{@link roboEMF.OrCond#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see roboEMF.OrCond#getLhs()
	 * @see #getOrCond()
	 * @generated
	 */
	EReference getOrCond_Lhs();

	/**
	 * Returns the meta object for class '{@link roboEMF.CommandMain <em>Command Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Main</em>'.
	 * @see roboEMF.CommandMain
	 * @generated
	 */
	EClass getCommandMain();

	/**
	 * Returns the meta object for class '{@link roboEMF.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading</em>'.
	 * @see roboEMF.Heading
	 * @generated
	 */
	EClass getHeading();

	/**
	 * Returns the meta object for class '{@link roboEMF.ConditionModel <em>Condition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Model</em>'.
	 * @see roboEMF.ConditionModel
	 * @generated
	 */
	EClass getConditionModel();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EString</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getEString();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>EInteger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInteger</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getEInteger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoboEMFFactory getRoboEMFFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link roboEMF.impl.EScriptImpl <em>EScript</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.EScriptImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getEScript()
		 * @generated
		 */
		EClass ESCRIPT = eINSTANCE.getEScript();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESCRIPT__NAME = eINSTANCE.getEScript_Name();

		/**
		 * The meta object literal for the '<em><b>Mainbody</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESCRIPT__MAINBODY = eINSTANCE.getEScript_Mainbody();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.SubBodyImpl <em>Sub Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.SubBodyImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getSubBody()
		 * @generated
		 */
		EClass SUB_BODY = eINSTANCE.getSubBody();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_BODY__COMMAND = eINSTANCE.getSubBody_Command();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.MainBodyImpl <em>Main Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.MainBodyImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getMainBody()
		 * @generated
		 */
		EClass MAIN_BODY = eINSTANCE.getMainBody();

		/**
		 * The meta object literal for the '<em><b>Commandmain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BODY__COMMANDMAIN = eINSTANCE.getMainBody_Commandmain();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_BODY__COMMAND = eINSTANCE.getMainBody_Command();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.ECommentImpl <em>EComment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.ECommentImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getEComment()
		 * @generated
		 */
		EClass ECOMMENT = eINSTANCE.getEComment();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMMENT__COMMENT = eINSTANCE.getEComment_Comment();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.CommandImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.IfStatementImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Subbody</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__SUBBODY = eINSTANCE.getIfStatement_Subbody();

		/**
		 * The meta object literal for the '<em><b>Conditionmodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__CONDITIONMODEL = eINSTANCE.getIfStatement_Conditionmodel();

		/**
		 * The meta object literal for the '<em><b>Elsebody</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSEBODY = eINSTANCE.getIfStatement_Elsebody();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.WhileStatementImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Subbody</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__SUBBODY = eINSTANCE.getWhileStatement_Subbody();

		/**
		 * The meta object literal for the '<em><b>Conditionmodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__CONDITIONMODEL = eINSTANCE.getWhileStatement_Conditionmodel();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.RepeateStatementImpl <em>Repeate Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.RepeateStatementImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getRepeateStatement()
		 * @generated
		 */
		EClass REPEATE_STATEMENT = eINSTANCE.getRepeateStatement();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEATE_STATEMENT__COUNT = eINSTANCE.getRepeateStatement_Count();

		/**
		 * The meta object literal for the '<em><b>Subbody</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEATE_STATEMENT__SUBBODY = eINSTANCE.getRepeateStatement_Subbody();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.ConditionImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.RoutineDeclImpl <em>Routine Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.RoutineDeclImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getRoutineDecl()
		 * @generated
		 */
		EClass ROUTINE_DECL = eINSTANCE.getRoutineDecl();

		/**
		 * The meta object literal for the '<em><b>Subbody</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTINE_DECL__SUBBODY = eINSTANCE.getRoutineDecl_Subbody();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTINE_DECL__NAME = eINSTANCE.getRoutineDecl_Name();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.RoutineCallImpl <em>Routine Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.RoutineCallImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getRoutineCall()
		 * @generated
		 */
		EClass ROUTINE_CALL = eINSTANCE.getRoutineCall();

		/**
		 * The meta object literal for the '<em><b>Decl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTINE_CALL__DECL = eINSTANCE.getRoutineCall_Decl();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.TurnLeftCmdImpl <em>Turn Left Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.TurnLeftCmdImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getTurnLeftCmd()
		 * @generated
		 */
		EClass TURN_LEFT_CMD = eINSTANCE.getTurnLeftCmd();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.TraceCmdImpl <em>Trace Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.TraceCmdImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getTraceCmd()
		 * @generated
		 */
		EClass TRACE_CMD = eINSTANCE.getTraceCmd();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_CMD__TRACE = eINSTANCE.getTraceCmd_Trace();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.DropCmdImpl <em>Drop Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.DropCmdImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getDropCmd()
		 * @generated
		 */
		EClass DROP_CMD = eINSTANCE.getDropCmd();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.StepCmdImpl <em>Step Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.StepCmdImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getStepCmd()
		 * @generated
		 */
		EClass STEP_CMD = eINSTANCE.getStepCmd();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.PickCmdImpl <em>Pick Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.PickCmdImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getPickCmd()
		 * @generated
		 */
		EClass PICK_CMD = eINSTANCE.getPickCmd();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.DropMarkCmdImpl <em>Drop Mark Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.DropMarkCmdImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getDropMarkCmd()
		 * @generated
		 */
		EClass DROP_MARK_CMD = eINSTANCE.getDropMarkCmd();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_MARK_CMD__LOCATION = eINSTANCE.getDropMarkCmd_Location();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.PickMarkCmdImpl <em>Pick Mark Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.PickMarkCmdImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getPickMarkCmd()
		 * @generated
		 */
		EClass PICK_MARK_CMD = eINSTANCE.getPickMarkCmd();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICK_MARK_CMD__LOCATION = eINSTANCE.getPickMarkCmd_Location();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.DestroyWallCmdImpl <em>Destroy Wall Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.DestroyWallCmdImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getDestroyWallCmd()
		 * @generated
		 */
		EClass DESTROY_WALL_CMD = eINSTANCE.getDestroyWallCmd();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTROY_WALL_CMD__LOCATION = eINSTANCE.getDestroyWallCmd_Location();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.BuildWallCmdImpl <em>Build Wall Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.BuildWallCmdImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getBuildWallCmd()
		 * @generated
		 */
		EClass BUILD_WALL_CMD = eINSTANCE.getBuildWallCmd();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_WALL_CMD__LOCATION = eINSTANCE.getBuildWallCmd_Location();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.FullImpl <em>Full</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.FullImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getFull()
		 * @generated
		 */
		EClass FULL = eINSTANCE.getFull();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.MarkImpl <em>Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.MarkImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getMark()
		 * @generated
		 */
		EClass MARK = eINSTANCE.getMark();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.WallAheadImpl <em>Wall Ahead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.WallAheadImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getWallAhead()
		 * @generated
		 */
		EClass WALL_AHEAD = eINSTANCE.getWallAhead();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.LocationImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ROW = eINSTANCE.getLocation_Row();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COL = eINSTANCE.getLocation_Col();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.BracketsCondImpl <em>Brackets Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.BracketsCondImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getBracketsCond()
		 * @generated
		 */
		EClass BRACKETS_COND = eINSTANCE.getBracketsCond();

		/**
		 * The meta object literal for the '<em><b>Orcond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRACKETS_COND__ORCOND = eINSTANCE.getBracketsCond_Orcond();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRACKETS_COND__CONDITION = eINSTANCE.getBracketsCond_Condition();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.NotCondImpl <em>Not Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.NotCondImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getNotCond()
		 * @generated
		 */
		EClass NOT_COND = eINSTANCE.getNotCond();

		/**
		 * The meta object literal for the '<em><b>Brackets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_COND__BRACKETS = eINSTANCE.getNotCond_Brackets();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT_COND__NOT = eINSTANCE.getNotCond_Not();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.AndCondImpl <em>And Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.AndCondImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getAndCond()
		 * @generated
		 */
		EClass AND_COND = eINSTANCE.getAndCond();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_COND__LHS = eINSTANCE.getAndCond_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_COND__RHS = eINSTANCE.getAndCond_Rhs();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.OrCondImpl <em>Or Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.OrCondImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getOrCond()
		 * @generated
		 */
		EClass OR_COND = eINSTANCE.getOrCond();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_COND__RHS = eINSTANCE.getOrCond_Rhs();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_COND__LHS = eINSTANCE.getOrCond_Lhs();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.CommandMainImpl <em>Command Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.CommandMainImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getCommandMain()
		 * @generated
		 */
		EClass COMMAND_MAIN = eINSTANCE.getCommandMain();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.HeadingImpl <em>Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.HeadingImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getHeading()
		 * @generated
		 */
		EClass HEADING = eINSTANCE.getHeading();

		/**
		 * The meta object literal for the '{@link roboEMF.impl.ConditionModelImpl <em>Condition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roboEMF.impl.ConditionModelImpl
		 * @see roboEMF.impl.RoboEMFPackageImpl#getConditionModel()
		 * @generated
		 */
		EClass CONDITION_MODEL = eINSTANCE.getConditionModel();

		/**
		 * The meta object literal for the '<em>EString</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see roboEMF.impl.RoboEMFPackageImpl#getEString()
		 * @generated
		 */
		EDataType ESTRING = eINSTANCE.getEString();

		/**
		 * The meta object literal for the '<em>EInteger</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see roboEMF.impl.RoboEMFPackageImpl#getEInteger()
		 * @generated
		 */
		EDataType EINTEGER = eINSTANCE.getEInteger();

	}

} //RoboEMFPackage
