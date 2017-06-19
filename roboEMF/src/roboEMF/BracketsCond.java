/**
 */
package roboEMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brackets Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.BracketsCond#getOrcond <em>Orcond</em>}</li>
 *   <li>{@link roboEMF.BracketsCond#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getBracketsCond()
 * @model
 * @generated
 */
public interface BracketsCond extends EObject {
	/**
	 * Returns the value of the '<em><b>Orcond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orcond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orcond</em>' containment reference.
	 * @see #setOrcond(OrCond)
	 * @see roboEMF.RoboEMFPackage#getBracketsCond_Orcond()
	 * @model containment="true"
	 * @generated
	 */
	OrCond getOrcond();

	/**
	 * Sets the value of the '{@link roboEMF.BracketsCond#getOrcond <em>Orcond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orcond</em>' containment reference.
	 * @see #getOrcond()
	 * @generated
	 */
	void setOrcond(OrCond value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see roboEMF.RoboEMFPackage#getBracketsCond_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link roboEMF.BracketsCond#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // BracketsCond
