/**
 */
package roboEMF.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import roboEMF.Command;
import roboEMF.CommandMain;
import roboEMF.MainBody;
import roboEMF.RoboEMFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.impl.MainBodyImpl#getCommandmain <em>Commandmain</em>}</li>
 *   <li>{@link roboEMF.impl.MainBodyImpl#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainBodyImpl extends MinimalEObjectImpl.Container implements MainBody {
	/**
	 * The cached value of the '{@link #getCommandmain() <em>Commandmain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandmain()
	 * @generated
	 * @ordered
	 */
	protected EList<CommandMain> commandmain;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> command;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboEMFPackage.Literals.MAIN_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommandMain> getCommandmain() {
		if (commandmain == null) {
			commandmain = new EObjectContainmentEList<CommandMain>(CommandMain.class, this, RoboEMFPackage.MAIN_BODY__COMMANDMAIN);
		}
		return commandmain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommand() {
		if (command == null) {
			command = new EObjectContainmentEList<Command>(Command.class, this, RoboEMFPackage.MAIN_BODY__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoboEMFPackage.MAIN_BODY__COMMANDMAIN:
				return ((InternalEList<?>)getCommandmain()).basicRemove(otherEnd, msgs);
			case RoboEMFPackage.MAIN_BODY__COMMAND:
				return ((InternalEList<?>)getCommand()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoboEMFPackage.MAIN_BODY__COMMANDMAIN:
				return getCommandmain();
			case RoboEMFPackage.MAIN_BODY__COMMAND:
				return getCommand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RoboEMFPackage.MAIN_BODY__COMMANDMAIN:
				getCommandmain().clear();
				getCommandmain().addAll((Collection<? extends CommandMain>)newValue);
				return;
			case RoboEMFPackage.MAIN_BODY__COMMAND:
				getCommand().clear();
				getCommand().addAll((Collection<? extends Command>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RoboEMFPackage.MAIN_BODY__COMMANDMAIN:
				getCommandmain().clear();
				return;
			case RoboEMFPackage.MAIN_BODY__COMMAND:
				getCommand().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RoboEMFPackage.MAIN_BODY__COMMANDMAIN:
				return commandmain != null && !commandmain.isEmpty();
			case RoboEMFPackage.MAIN_BODY__COMMAND:
				return command != null && !command.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MainBodyImpl
