/**
 */
package roboEMF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import roboEMF.ConditionModel;
import roboEMF.IfStatement;
import roboEMF.RoboEMFPackage;
import roboEMF.SubBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.impl.IfStatementImpl#getSubbody <em>Subbody</em>}</li>
 *   <li>{@link roboEMF.impl.IfStatementImpl#getConditionmodel <em>Conditionmodel</em>}</li>
 *   <li>{@link roboEMF.impl.IfStatementImpl#getElsebody <em>Elsebody</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends CommandImpl implements IfStatement {
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
	 * The cached value of the '{@link #getConditionmodel() <em>Conditionmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionmodel()
	 * @generated
	 * @ordered
	 */
	protected ConditionModel conditionmodel;

	/**
	 * The cached value of the '{@link #getElsebody() <em>Elsebody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElsebody()
	 * @generated
	 * @ordered
	 */
	protected SubBody elsebody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboEMFPackage.Literals.IF_STATEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboEMFPackage.IF_STATEMENT__SUBBODY, oldSubbody, newSubbody);
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
				msgs = ((InternalEObject)subbody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.IF_STATEMENT__SUBBODY, null, msgs);
			if (newSubbody != null)
				msgs = ((InternalEObject)newSubbody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.IF_STATEMENT__SUBBODY, null, msgs);
			msgs = basicSetSubbody(newSubbody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboEMFPackage.IF_STATEMENT__SUBBODY, newSubbody, newSubbody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionModel getConditionmodel() {
		return conditionmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionmodel(ConditionModel newConditionmodel, NotificationChain msgs) {
		ConditionModel oldConditionmodel = conditionmodel;
		conditionmodel = newConditionmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboEMFPackage.IF_STATEMENT__CONDITIONMODEL, oldConditionmodel, newConditionmodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionmodel(ConditionModel newConditionmodel) {
		if (newConditionmodel != conditionmodel) {
			NotificationChain msgs = null;
			if (conditionmodel != null)
				msgs = ((InternalEObject)conditionmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.IF_STATEMENT__CONDITIONMODEL, null, msgs);
			if (newConditionmodel != null)
				msgs = ((InternalEObject)newConditionmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.IF_STATEMENT__CONDITIONMODEL, null, msgs);
			msgs = basicSetConditionmodel(newConditionmodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboEMFPackage.IF_STATEMENT__CONDITIONMODEL, newConditionmodel, newConditionmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubBody getElsebody() {
		return elsebody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElsebody(SubBody newElsebody, NotificationChain msgs) {
		SubBody oldElsebody = elsebody;
		elsebody = newElsebody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboEMFPackage.IF_STATEMENT__ELSEBODY, oldElsebody, newElsebody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElsebody(SubBody newElsebody) {
		if (newElsebody != elsebody) {
			NotificationChain msgs = null;
			if (elsebody != null)
				msgs = ((InternalEObject)elsebody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.IF_STATEMENT__ELSEBODY, null, msgs);
			if (newElsebody != null)
				msgs = ((InternalEObject)newElsebody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboEMFPackage.IF_STATEMENT__ELSEBODY, null, msgs);
			msgs = basicSetElsebody(newElsebody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboEMFPackage.IF_STATEMENT__ELSEBODY, newElsebody, newElsebody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoboEMFPackage.IF_STATEMENT__SUBBODY:
				return basicSetSubbody(null, msgs);
			case RoboEMFPackage.IF_STATEMENT__CONDITIONMODEL:
				return basicSetConditionmodel(null, msgs);
			case RoboEMFPackage.IF_STATEMENT__ELSEBODY:
				return basicSetElsebody(null, msgs);
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
			case RoboEMFPackage.IF_STATEMENT__SUBBODY:
				return getSubbody();
			case RoboEMFPackage.IF_STATEMENT__CONDITIONMODEL:
				return getConditionmodel();
			case RoboEMFPackage.IF_STATEMENT__ELSEBODY:
				return getElsebody();
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
			case RoboEMFPackage.IF_STATEMENT__SUBBODY:
				setSubbody((SubBody)newValue);
				return;
			case RoboEMFPackage.IF_STATEMENT__CONDITIONMODEL:
				setConditionmodel((ConditionModel)newValue);
				return;
			case RoboEMFPackage.IF_STATEMENT__ELSEBODY:
				setElsebody((SubBody)newValue);
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
			case RoboEMFPackage.IF_STATEMENT__SUBBODY:
				setSubbody((SubBody)null);
				return;
			case RoboEMFPackage.IF_STATEMENT__CONDITIONMODEL:
				setConditionmodel((ConditionModel)null);
				return;
			case RoboEMFPackage.IF_STATEMENT__ELSEBODY:
				setElsebody((SubBody)null);
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
			case RoboEMFPackage.IF_STATEMENT__SUBBODY:
				return subbody != null;
			case RoboEMFPackage.IF_STATEMENT__CONDITIONMODEL:
				return conditionmodel != null;
			case RoboEMFPackage.IF_STATEMENT__ELSEBODY:
				return elsebody != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
