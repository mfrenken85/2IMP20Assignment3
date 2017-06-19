/**
 */
package roboEMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EScript</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.EScript#getName <em>Name</em>}</li>
 *   <li>{@link roboEMF.EScript#getMainbody <em>Mainbody</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getEScript()
 * @model
 * @generated
 */
public interface EScript extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see roboEMF.RoboEMFPackage#getEScript_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link roboEMF.EScript#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mainbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mainbody</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainbody</em>' containment reference.
	 * @see #setMainbody(MainBody)
	 * @see roboEMF.RoboEMFPackage#getEScript_Mainbody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MainBody getMainbody();

	/**
	 * Sets the value of the '{@link roboEMF.EScript#getMainbody <em>Mainbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mainbody</em>' containment reference.
	 * @see #getMainbody()
	 * @generated
	 */
	void setMainbody(MainBody value);

} // EScript
