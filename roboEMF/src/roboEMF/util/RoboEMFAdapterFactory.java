/**
 */
package roboEMF.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import roboEMF.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see roboEMF.RoboEMFPackage
 * @generated
 */
public class RoboEMFAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RoboEMFPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboEMFAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RoboEMFPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoboEMFSwitch<Adapter> modelSwitch =
		new RoboEMFSwitch<Adapter>() {
			@Override
			public Adapter caseEScript(EScript object) {
				return createEScriptAdapter();
			}
			@Override
			public Adapter caseSubBody(SubBody object) {
				return createSubBodyAdapter();
			}
			@Override
			public Adapter caseMainBody(MainBody object) {
				return createMainBodyAdapter();
			}
			@Override
			public Adapter caseEComment(EComment object) {
				return createECommentAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseIfStatement(IfStatement object) {
				return createIfStatementAdapter();
			}
			@Override
			public Adapter caseWhileStatement(WhileStatement object) {
				return createWhileStatementAdapter();
			}
			@Override
			public Adapter caseRepeateStatement(RepeateStatement object) {
				return createRepeateStatementAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseRoutineDecl(RoutineDecl object) {
				return createRoutineDeclAdapter();
			}
			@Override
			public Adapter caseRoutineCall(RoutineCall object) {
				return createRoutineCallAdapter();
			}
			@Override
			public Adapter caseTurnLeftCmd(TurnLeftCmd object) {
				return createTurnLeftCmdAdapter();
			}
			@Override
			public Adapter caseTraceCmd(TraceCmd object) {
				return createTraceCmdAdapter();
			}
			@Override
			public Adapter caseDropCmd(DropCmd object) {
				return createDropCmdAdapter();
			}
			@Override
			public Adapter caseStepCmd(StepCmd object) {
				return createStepCmdAdapter();
			}
			@Override
			public Adapter casePickCmd(PickCmd object) {
				return createPickCmdAdapter();
			}
			@Override
			public Adapter caseDropMarkCmd(DropMarkCmd object) {
				return createDropMarkCmdAdapter();
			}
			@Override
			public Adapter casePickMarkCmd(PickMarkCmd object) {
				return createPickMarkCmdAdapter();
			}
			@Override
			public Adapter caseDestroyWallCmd(DestroyWallCmd object) {
				return createDestroyWallCmdAdapter();
			}
			@Override
			public Adapter caseBuildWallCmd(BuildWallCmd object) {
				return createBuildWallCmdAdapter();
			}
			@Override
			public Adapter caseFull(Full object) {
				return createFullAdapter();
			}
			@Override
			public Adapter caseMark(Mark object) {
				return createMarkAdapter();
			}
			@Override
			public Adapter caseWallAhead(WallAhead object) {
				return createWallAheadAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseBracketsCond(BracketsCond object) {
				return createBracketsCondAdapter();
			}
			@Override
			public Adapter caseNotCond(NotCond object) {
				return createNotCondAdapter();
			}
			@Override
			public Adapter caseAndCond(AndCond object) {
				return createAndCondAdapter();
			}
			@Override
			public Adapter caseOrCond(OrCond object) {
				return createOrCondAdapter();
			}
			@Override
			public Adapter caseCommandMain(CommandMain object) {
				return createCommandMainAdapter();
			}
			@Override
			public Adapter caseHeading(Heading object) {
				return createHeadingAdapter();
			}
			@Override
			public Adapter caseConditionModel(ConditionModel object) {
				return createConditionModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.EScript <em>EScript</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.EScript
	 * @generated
	 */
	public Adapter createEScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.SubBody <em>Sub Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.SubBody
	 * @generated
	 */
	public Adapter createSubBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.MainBody <em>Main Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.MainBody
	 * @generated
	 */
	public Adapter createMainBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.EComment <em>EComment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.EComment
	 * @generated
	 */
	public Adapter createECommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.WhileStatement
	 * @generated
	 */
	public Adapter createWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.RepeateStatement <em>Repeate Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.RepeateStatement
	 * @generated
	 */
	public Adapter createRepeateStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.RoutineDecl <em>Routine Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.RoutineDecl
	 * @generated
	 */
	public Adapter createRoutineDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.RoutineCall <em>Routine Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.RoutineCall
	 * @generated
	 */
	public Adapter createRoutineCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.TurnLeftCmd <em>Turn Left Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.TurnLeftCmd
	 * @generated
	 */
	public Adapter createTurnLeftCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.TraceCmd <em>Trace Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.TraceCmd
	 * @generated
	 */
	public Adapter createTraceCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.DropCmd <em>Drop Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.DropCmd
	 * @generated
	 */
	public Adapter createDropCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.StepCmd <em>Step Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.StepCmd
	 * @generated
	 */
	public Adapter createStepCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.PickCmd <em>Pick Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.PickCmd
	 * @generated
	 */
	public Adapter createPickCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.DropMarkCmd <em>Drop Mark Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.DropMarkCmd
	 * @generated
	 */
	public Adapter createDropMarkCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.PickMarkCmd <em>Pick Mark Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.PickMarkCmd
	 * @generated
	 */
	public Adapter createPickMarkCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.DestroyWallCmd <em>Destroy Wall Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.DestroyWallCmd
	 * @generated
	 */
	public Adapter createDestroyWallCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.BuildWallCmd <em>Build Wall Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.BuildWallCmd
	 * @generated
	 */
	public Adapter createBuildWallCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.Full <em>Full</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.Full
	 * @generated
	 */
	public Adapter createFullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.Mark
	 * @generated
	 */
	public Adapter createMarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.WallAhead <em>Wall Ahead</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.WallAhead
	 * @generated
	 */
	public Adapter createWallAheadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.BracketsCond <em>Brackets Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.BracketsCond
	 * @generated
	 */
	public Adapter createBracketsCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.NotCond <em>Not Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.NotCond
	 * @generated
	 */
	public Adapter createNotCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.AndCond <em>And Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.AndCond
	 * @generated
	 */
	public Adapter createAndCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.OrCond <em>Or Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.OrCond
	 * @generated
	 */
	public Adapter createOrCondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.CommandMain <em>Command Main</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.CommandMain
	 * @generated
	 */
	public Adapter createCommandMainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.Heading
	 * @generated
	 */
	public Adapter createHeadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboEMF.ConditionModel <em>Condition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboEMF.ConditionModel
	 * @generated
	 */
	public Adapter createConditionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RoboEMFAdapterFactory
