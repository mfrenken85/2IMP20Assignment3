/**
 */
package roboEMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.AndCond#getLhs <em>Lhs</em>}</li>
 *   <li>{@link roboEMF.AndCond#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getAndCond()
 * @model
 * @generated
 */
public interface AndCond extends EObject {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(NotCond)
	 * @see roboEMF.RoboEMFPackage#getAndCond_Lhs()
	 * @model containment="true"
	 * @generated
	 */
	NotCond getLhs();

	/**
	 * Sets the value of the '{@link roboEMF.AndCond#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(NotCond value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(AndCond)
	 * @see roboEMF.RoboEMFPackage#getAndCond_Rhs()
	 * @model containment="true"
	 * @generated
	 */
	AndCond getRhs();

	/**
	 * Sets the value of the '{@link roboEMF.AndCond#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(AndCond value);

} // AndCond
