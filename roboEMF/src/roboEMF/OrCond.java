/**
 */
package roboEMF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.OrCond#getRhs <em>Rhs</em>}</li>
 *   <li>{@link roboEMF.OrCond#getLhs <em>Lhs</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getOrCond()
 * @model
 * @generated
 */
public interface OrCond extends ConditionModel {
	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(OrCond)
	 * @see roboEMF.RoboEMFPackage#getOrCond_Rhs()
	 * @model containment="true"
	 * @generated
	 */
	OrCond getRhs();

	/**
	 * Sets the value of the '{@link roboEMF.OrCond#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(OrCond value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(AndCond)
	 * @see roboEMF.RoboEMFPackage#getOrCond_Lhs()
	 * @model containment="true"
	 * @generated
	 */
	AndCond getLhs();

	/**
	 * Sets the value of the '{@link roboEMF.OrCond#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(AndCond value);

} // OrCond
