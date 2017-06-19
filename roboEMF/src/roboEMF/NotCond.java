/**
 */
package roboEMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.NotCond#getBrackets <em>Brackets</em>}</li>
 *   <li>{@link roboEMF.NotCond#isNot <em>Not</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getNotCond()
 * @model
 * @generated
 */
public interface NotCond extends EObject {
	/**
	 * Returns the value of the '<em><b>Brackets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brackets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brackets</em>' containment reference.
	 * @see #setBrackets(BracketsCond)
	 * @see roboEMF.RoboEMFPackage#getNotCond_Brackets()
	 * @model containment="true"
	 * @generated
	 */
	BracketsCond getBrackets();

	/**
	 * Sets the value of the '{@link roboEMF.NotCond#getBrackets <em>Brackets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brackets</em>' containment reference.
	 * @see #getBrackets()
	 * @generated
	 */
	void setBrackets(BracketsCond value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see roboEMF.RoboEMFPackage#getNotCond_Not()
	 * @model
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link roboEMF.NotCond#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

} // NotCond
