/**
 */
package roboEMF.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import roboEMF.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see roboEMF.RoboEMFPackage
 * @generated
 */
public class RoboEMFSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RoboEMFPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboEMFSwitch() {
		if (modelPackage == null) {
			modelPackage = RoboEMFPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RoboEMFPackage.ESCRIPT: {
				EScript eScript = (EScript)theEObject;
				T result = caseEScript(eScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.SUB_BODY: {
				SubBody subBody = (SubBody)theEObject;
				T result = caseSubBody(subBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.MAIN_BODY: {
				MainBody mainBody = (MainBody)theEObject;
				T result = caseMainBody(mainBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.ECOMMENT: {
				EComment eComment = (EComment)theEObject;
				T result = caseEComment(eComment);
				if (result == null) result = caseCommand(eComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.COMMAND: {
				Command command = (Command)theEObject;
				T result = caseCommand(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseCommand(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.WHILE_STATEMENT: {
				WhileStatement whileStatement = (WhileStatement)theEObject;
				T result = caseWhileStatement(whileStatement);
				if (result == null) result = caseCommand(whileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.REPEATE_STATEMENT: {
				RepeateStatement repeateStatement = (RepeateStatement)theEObject;
				T result = caseRepeateStatement(repeateStatement);
				if (result == null) result = caseCommand(repeateStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.ROUTINE_DECL: {
				RoutineDecl routineDecl = (RoutineDecl)theEObject;
				T result = caseRoutineDecl(routineDecl);
				if (result == null) result = caseCommandMain(routineDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.ROUTINE_CALL: {
				RoutineCall routineCall = (RoutineCall)theEObject;
				T result = caseRoutineCall(routineCall);
				if (result == null) result = caseCommand(routineCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.TURN_LEFT_CMD: {
				TurnLeftCmd turnLeftCmd = (TurnLeftCmd)theEObject;
				T result = caseTurnLeftCmd(turnLeftCmd);
				if (result == null) result = caseCommand(turnLeftCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.TRACE_CMD: {
				TraceCmd traceCmd = (TraceCmd)theEObject;
				T result = caseTraceCmd(traceCmd);
				if (result == null) result = caseCommand(traceCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.DROP_CMD: {
				DropCmd dropCmd = (DropCmd)theEObject;
				T result = caseDropCmd(dropCmd);
				if (result == null) result = caseCommand(dropCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.STEP_CMD: {
				StepCmd stepCmd = (StepCmd)theEObject;
				T result = caseStepCmd(stepCmd);
				if (result == null) result = caseCommand(stepCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.PICK_CMD: {
				PickCmd pickCmd = (PickCmd)theEObject;
				T result = casePickCmd(pickCmd);
				if (result == null) result = caseCommand(pickCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.DROP_MARK_CMD: {
				DropMarkCmd dropMarkCmd = (DropMarkCmd)theEObject;
				T result = caseDropMarkCmd(dropMarkCmd);
				if (result == null) result = caseCommand(dropMarkCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.PICK_MARK_CMD: {
				PickMarkCmd pickMarkCmd = (PickMarkCmd)theEObject;
				T result = casePickMarkCmd(pickMarkCmd);
				if (result == null) result = caseCommand(pickMarkCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.DESTROY_WALL_CMD: {
				DestroyWallCmd destroyWallCmd = (DestroyWallCmd)theEObject;
				T result = caseDestroyWallCmd(destroyWallCmd);
				if (result == null) result = caseCommand(destroyWallCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.BUILD_WALL_CMD: {
				BuildWallCmd buildWallCmd = (BuildWallCmd)theEObject;
				T result = caseBuildWallCmd(buildWallCmd);
				if (result == null) result = caseCommand(buildWallCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.FULL: {
				Full full = (Full)theEObject;
				T result = caseFull(full);
				if (result == null) result = caseCondition(full);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.MARK: {
				Mark mark = (Mark)theEObject;
				T result = caseMark(mark);
				if (result == null) result = caseCondition(mark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.WALL_AHEAD: {
				WallAhead wallAhead = (WallAhead)theEObject;
				T result = caseWallAhead(wallAhead);
				if (result == null) result = caseCondition(wallAhead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.BRACKETS_COND: {
				BracketsCond bracketsCond = (BracketsCond)theEObject;
				T result = caseBracketsCond(bracketsCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.NOT_COND: {
				NotCond notCond = (NotCond)theEObject;
				T result = caseNotCond(notCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.AND_COND: {
				AndCond andCond = (AndCond)theEObject;
				T result = caseAndCond(andCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.OR_COND: {
				OrCond orCond = (OrCond)theEObject;
				T result = caseOrCond(orCond);
				if (result == null) result = caseConditionModel(orCond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.COMMAND_MAIN: {
				CommandMain commandMain = (CommandMain)theEObject;
				T result = caseCommandMain(commandMain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.HEADING: {
				Heading heading = (Heading)theEObject;
				T result = caseHeading(heading);
				if (result == null) result = caseCondition(heading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboEMFPackage.CONDITION_MODEL: {
				ConditionModel conditionModel = (ConditionModel)theEObject;
				T result = caseConditionModel(conditionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EScript</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EScript</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEScript(EScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubBody(SubBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainBody(MainBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EComment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EComment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEComment(EComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileStatement(WhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeate Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeate Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeateStatement(RepeateStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routine Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routine Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoutineDecl(RoutineDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routine Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routine Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoutineCall(RoutineCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Left Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Left Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnLeftCmd(TurnLeftCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceCmd(TraceCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropCmd(DropCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepCmd(StepCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pick Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pick Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePickCmd(PickCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Mark Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Mark Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropMarkCmd(DropMarkCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pick Mark Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pick Mark Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePickMarkCmd(PickMarkCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Wall Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Wall Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyWallCmd(DestroyWallCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Wall Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Wall Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildWallCmd(BuildWallCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFull(Full object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMark(Mark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wall Ahead</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wall Ahead</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallAhead(WallAhead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brackets Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brackets Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBracketsCond(BracketsCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotCond(NotCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndCond(AndCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Cond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Cond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrCond(OrCond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Main</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Main</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandMain(CommandMain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeading(Heading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionModel(ConditionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RoboEMFSwitch
