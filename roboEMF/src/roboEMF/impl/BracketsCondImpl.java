/**
 */
package roboEMF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import roboEMF.BracketsCond;
import roboEMF.Condition;
import roboEMF.OrCond;
import roboEMF.RoboEMFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brackets Cond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.impl.BracketsCondImpl#getOrcond <em>Orcond</em>}</li>
 *   <li>{@link roboEMF.impl.BracketsCondImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BracketsCondImpl extends MinimalEObjectImpl.Container implements BracketsCond {
	/**
	 * The cached value of the '{@link #getOrcond() <em>Orcond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrcond()
	 * @generated
	 * @ordered
	 */
	protected OrCond orcond;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BracketsCondImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboEMFPackage.Literals.BRACKETS_COND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrCond getOrcond() {
		return orcond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrcond(OrCond newOrcond, NotificationChain msgs) {
		OrCond oldOrcond = orcond;
		orcond = newOrcond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboEMFPackage.BRACKETS_COND__ORCOND, oldOrcond, newOrcond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrcond(OrCond newOrcond) {
		if (newOrcond != orcond) {
			NotificationChain msgs = null;
			if (orcond != null)
				msgs = ((InternalEObject)orcond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.BRACKETS_COND__ORCOND, null, msgs);
			if (newOrcond != null)
				msgs = ((InternalEObject)newOrcond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.BRACKETS_COND__ORCOND, null, msgs);
			msgs = basicSetOrcond(newOrcond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboEMFPackage.BRACKETS_COND__ORCOND, newOrcond, newOrcond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboEMFPackage.BRACKETS_COND__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.BRACKETS_COND__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.BRACKETS_COND__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboEMFPackage.BRACKETS_COND__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoboEMFPackage.BRACKETS_COND__ORCOND:
				return basicSetOrcond(null, msgs);
			case RoboEMFPackage.BRACKETS_COND__CONDITION:
				return basicSetCondition(null, msgs);
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
			case RoboEMFPackage.BRACKETS_COND__ORCOND:
				return getOrcond();
			case RoboEMFPackage.BRACKETS_COND__CONDITION:
				return getCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RoboEMFPackage.BRACKETS_COND__ORCOND:
				setOrcond((OrCond)newValue);
				return;
			case RoboEMFPackage.BRACKETS_COND__CONDITION:
				setCondition((Condition)newValue);
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
			case RoboEMFPackage.BRACKETS_COND__ORCOND:
				setOrcond((OrCond)null);
				return;
			case RoboEMFPackage.BRACKETS_COND__CONDITION:
				setCondition((Condition)null);
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
			case RoboEMFPackage.BRACKETS_COND__ORCOND:
				return orcond != null;
			case RoboEMFPackage.BRACKETS_COND__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //BracketsCondImpl
