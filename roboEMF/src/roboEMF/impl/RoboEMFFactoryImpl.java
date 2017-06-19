/**
 */
package roboEMF.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import roboEMF.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoboEMFFactoryImpl extends EFactoryImpl implements RoboEMFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoboEMFFactory init() {
		try {
			RoboEMFFactory theRoboEMFFactory = (RoboEMFFactory)EPackage.Registry.INSTANCE.getEFactory(RoboEMFPackage.eNS_URI);
			if (theRoboEMFFactory != null) {
				return theRoboEMFFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RoboEMFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboEMFFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RoboEMFPackage.ESCRIPT: return createEScript();
			case RoboEMFPackage.SUB_BODY: return createSubBody();
			case RoboEMFPackage.MAIN_BODY: return createMainBody();
			case RoboEMFPackage.ECOMMENT: return createEComment();
			case RoboEMFPackage.COMMAND: return createCommand();
			case RoboEMFPackage.IF_STATEMENT: return createIfStatement();
			case RoboEMFPackage.WHILE_STATEMENT: return createWhileStatement();
			case RoboEMFPackage.REPEATE_STATEMENT: return createRepeateStatement();
			case RoboEMFPackage.CONDITION: return createCondition();
			case RoboEMFPackage.ROUTINE_DECL: return createRoutineDecl();
			case RoboEMFPackage.ROUTINE_CALL: return createRoutineCall();
			case RoboEMFPackage.TURN_LEFT_CMD: return createTurnLeftCmd();
			case RoboEMFPackage.TRACE_CMD: return createTraceCmd();
			case RoboEMFPackage.DROP_CMD: return createDropCmd();
			case RoboEMFPackage.STEP_CMD: return createStepCmd();
			case RoboEMFPackage.PICK_CMD: return createPickCmd();
			case RoboEMFPackage.DROP_MARK_CMD: return createDropMarkCmd();
			case RoboEMFPackage.PICK_MARK_CMD: return createPickMarkCmd();
			case RoboEMFPackage.DESTROY_WALL_CMD: return createDestroyWallCmd();
			case RoboEMFPackage.BUILD_WALL_CMD: return createBuildWallCmd();
			case RoboEMFPackage.FULL: return createFull();
			case RoboEMFPackage.MARK: return createMark();
			case RoboEMFPackage.WALL_AHEAD: return createWallAhead();
			case RoboEMFPackage.LOCATION: return createLocation();
			case RoboEMFPackage.BRACKETS_COND: return createBracketsCond();
			case RoboEMFPackage.NOT_COND: return createNotCond();
			case RoboEMFPackage.AND_COND: return createAndCond();
			case RoboEMFPackage.OR_COND: return createOrCond();
			case RoboEMFPackage.COMMAND_MAIN: return createCommandMain();
			case RoboEMFPackage.HEADING: return createHeading();
			case RoboEMFPackage.CONDITION_MODEL: return createConditionModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RoboEMFPackage.ESTRING:
				return createEStringFromString(eDataType, initialValue);
			case RoboEMFPackage.EINTEGER:
				return createEIntegerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RoboEMFPackage.ESTRING:
				return convertEStringToString(eDataType, instanceValue);
			case RoboEMFPackage.EINTEGER:
				return convertEIntegerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EScript createEScript() {
		EScriptImpl eScript = new EScriptImpl();
		return eScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubBody createSubBody() {
		SubBodyImpl subBody = new SubBodyImpl();
		return subBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBody createMainBody() {
		MainBodyImpl mainBody = new MainBodyImpl();
		return mainBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EComment createEComment() {
		ECommentImpl eComment = new ECommentImpl();
		return eComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeateStatement createRepeateStatement() {
		RepeateStatementImpl repeateStatement = new RepeateStatementImpl();
		return repeateStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineDecl createRoutineDecl() {
		RoutineDeclImpl routineDecl = new RoutineDeclImpl();
		return routineDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineCall createRoutineCall() {
		RoutineCallImpl routineCall = new RoutineCallImpl();
		return routineCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnLeftCmd createTurnLeftCmd() {
		TurnLeftCmdImpl turnLeftCmd = new TurnLeftCmdImpl();
		return turnLeftCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceCmd createTraceCmd() {
		TraceCmdImpl traceCmd = new TraceCmdImpl();
		return traceCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropCmd createDropCmd() {
		DropCmdImpl dropCmd = new DropCmdImpl();
		return dropCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepCmd createStepCmd() {
		StepCmdImpl stepCmd = new StepCmdImpl();
		return stepCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PickCmd createPickCmd() {
		PickCmdImpl pickCmd = new PickCmdImpl();
		return pickCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropMarkCmd createDropMarkCmd() {
		DropMarkCmdImpl dropMarkCmd = new DropMarkCmdImpl();
		return dropMarkCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PickMarkCmd createPickMarkCmd() {
		PickMarkCmdImpl pickMarkCmd = new PickMarkCmdImpl();
		return pickMarkCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyWallCmd createDestroyWallCmd() {
		DestroyWallCmdImpl destroyWallCmd = new DestroyWallCmdImpl();
		return destroyWallCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildWallCmd createBuildWallCmd() {
		BuildWallCmdImpl buildWallCmd = new BuildWallCmdImpl();
		return buildWallCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Full createFull() {
		FullImpl full = new FullImpl();
		return full;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mark createMark() {
		MarkImpl mark = new MarkImpl();
		return mark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallAhead createWallAhead() {
		WallAheadImpl wallAhead = new WallAheadImpl();
		return wallAhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BracketsCond createBracketsCond() {
		BracketsCondImpl bracketsCond = new BracketsCondImpl();
		return bracketsCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotCond createNotCond() {
		NotCondImpl notCond = new NotCondImpl();
		return notCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndCond createAndCond() {
		AndCondImpl andCond = new AndCondImpl();
		return andCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrCond createOrCond() {
		OrCondImpl orCond = new OrCondImpl();
		return orCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandMain createCommandMain() {
		CommandMainImpl commandMain = new CommandMainImpl();
		return commandMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Heading createHeading() {
		HeadingImpl heading = new HeadingImpl();
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionModel createConditionModel() {
		ConditionModelImpl conditionModel = new ConditionModelImpl();
		return conditionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createEIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboEMFPackage getRoboEMFPackage() {
		return (RoboEMFPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RoboEMFPackage getPackage() {
		return RoboEMFPackage.eINSTANCE;
	}

} //RoboEMFFactoryImpl
