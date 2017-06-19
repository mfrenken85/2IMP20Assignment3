/**
 */
package roboEMF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import roboEMF.RepeateStatement;
import roboEMF.RoboEMFPackage;
import roboEMF.SubBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeate Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.impl.RepeateStatementImpl#getCount <em>Count</em>}</li>
 *   <li>{@link roboEMF.impl.RepeateStatementImpl#getSubbody <em>Subbody</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeateStatementImpl extends CommandImpl implements RepeateStatement {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected Integer count = COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubbody() <em>Subbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubbody()
	 * @generated
	 * @ordered
	 */
	protected SubBody subbody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeateStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboEMFPackage.Literals.REPEATE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(Integer newCount) {
		Integer oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboEMFPackage.REPEATE_STATEMENT__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubBody getSubbody() {
		return subbody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubbody(SubBody newSubbody, NotificationChain msgs) {
		SubBody oldSubbody = subbody;
		subbody = newSubbody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboEMFPackage.REPEATE_STATEMENT__SUBBODY, oldSubbody, newSubbody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubbody(SubBody newSubbody) {
		if (newSubbody != subbody) {
			NotificationChain msgs = null;
			if (subbody != null)
				msgs = ((InternalEObject)subbody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.REPEATE_STATEMENT__SUBBODY, null, msgs);
			if (newSubbody != null)
				msgs = ((InternalEObject)newSubbody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.REPEATE_STATEMENT__SUBBODY, null, msgs);
			msgs = basicSetSubbody(newSubbody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboEMFPackage.REPEATE_STATEMENT__SUBBODY, newSubbody, newSubbody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoboEMFPackage.REPEATE_STATEMENT__SUBBODY:
				return basicSetSubbody(null, msgs);
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
			case RoboEMFPackage.REPEATE_STATEMENT__COUNT:
				return getCount();
			case RoboEMFPackage.REPEATE_STATEMENT__SUBBODY:
				return getSubbody();
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
			case RoboEMFPackage.REPEATE_STATEMENT__COUNT:
				setCount((Integer)newValue);
				return;
			case RoboEMFPackage.REPEATE_STATEMENT__SUBBODY:
				setSubbody((SubBody)newValue);
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
			case RoboEMFPackage.REPEATE_STATEMENT__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case RoboEMFPackage.REPEATE_STATEMENT__SUBBODY:
				setSubbody((SubBody)null);
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
			case RoboEMFPackage.REPEATE_STATEMENT__COUNT:
				return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
			case RoboEMFPackage.REPEATE_STATEMENT__SUBBODY:
				return subbody != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //RepeateStatementImpl
