/**
 */
package roboEMF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import roboEMF.RoboEMFPackage;
import roboEMF.RoutineCall;
import roboEMF.RoutineDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routine Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.impl.RoutineCallImpl#getDecl <em>Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoutineCallImpl extends CommandImpl implements RoutineCall {
	/**
	 * The cached value of the '{@link #getDecl() <em>Decl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecl()
	 * @generated
	 * @ordered
	 */
	protected RoutineDecl decl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutineCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboEMFPackage.Literals.ROUTINE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineDecl getDecl() {
		if (decl != null && decl.eIsProxy()) {
			InternalEObject oldDecl = (InternalEObject)decl;
			decl = (RoutineDecl)eResolveProxy(oldDecl);
			if (decl != oldDecl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoboEMFPackage.ROUTINE_CALL__DECL, oldDecl, decl));
			}
		}
		return decl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineDecl basicGetDecl() {
		return decl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecl(RoutineDecl newDecl) {
		RoutineDecl oldDecl = decl;
		decl = newDecl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboEMFPackage.ROUTINE_CALL__DECL, oldDecl, decl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoboEMFPackage.ROUTINE_CALL__DECL:
				if (resolve) return getDecl();
				return basicGetDecl();
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
			case RoboEMFPackage.ROUTINE_CALL__DECL:
				setDecl((RoutineDecl)newValue);
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
			case RoboEMFPackage.ROUTINE_CALL__DECL:
				setDecl((RoutineDecl)null);
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
			case RoboEMFPackage.ROUTINE_CALL__DECL:
				return decl != null;
		}
		return super.eIsSet(featureID);
	}

} //RoutineCallImpl
