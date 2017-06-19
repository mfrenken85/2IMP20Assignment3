/**
 */
package roboEMF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import roboEMF.RoboEMFPackage;
import roboEMF.RoutineDecl;
import roboEMF.SubBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routine Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.impl.RoutineDeclImpl#getSubbody <em>Subbody</em>}</li>
 *   <li>{@link roboEMF.impl.RoutineDeclImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoutineDeclImpl extends CommandMainImpl implements RoutineDecl {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutineDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboEMFPackage.Literals.ROUTINE_DECL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboEMFPackage.ROUTINE_DECL__SUBBODY, oldSubbody, newSubbody);
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
				msgs = ((InternalEObject)subbody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.ROUTINE_DECL__SUBBODY, null, msgs);
			if (newSubbody != null)
				msgs = ((InternalEObject)newSubbody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.ROUTINE_DECL__SUBBODY, null, msgs);
			msgs = basicSetSubbody(newSubbody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboEMFPackage.ROUTINE_DECL__SUBBODY, newSubbody, newSubbody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboEMFPackage.ROUTINE_DECL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoboEMFPackage.ROUTINE_DECL__SUBBODY:
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
			case RoboEMFPackage.ROUTINE_DECL__SUBBODY:
				return getSubbody();
			case RoboEMFPackage.ROUTINE_DECL__NAME:
				return getName();
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
			case RoboEMFPackage.ROUTINE_DECL__SUBBODY:
				setSubbody((SubBody)newValue);
				return;
			case RoboEMFPackage.ROUTINE_DECL__NAME:
				setName((String)newValue);
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
			case RoboEMFPackage.ROUTINE_DECL__SUBBODY:
				setSubbody((SubBody)null);
				return;
			case RoboEMFPackage.ROUTINE_DECL__NAME:
				setName(NAME_EDEFAULT);
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
			case RoboEMFPackage.ROUTINE_DECL__SUBBODY:
				return subbody != null;
			case RoboEMFPackage.ROUTINE_DECL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoutineDeclImpl
