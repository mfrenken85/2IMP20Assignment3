/**
 */
package roboEMF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routine Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.RoutineDecl#getSubbody <em>Subbody</em>}</li>
 *   <li>{@link roboEMF.RoutineDecl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getRoutineDecl()
 * @model
 * @generated
 */
public interface RoutineDecl extends CommandMain {

	/**
	 * Returns the value of the '<em><b>Subbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subbody</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subbody</em>' containment reference.
	 * @see #setSubbody(SubBody)
	 * @see roboEMF.RoboEMFPackage#getRoutineDecl_Subbody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SubBody getSubbody();

	/**
	 * Sets the value of the '{@link roboEMF.RoutineDecl#getSubbody <em>Subbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subbody</em>' containment reference.
	 * @see #getSubbody()
	 * @generated
	 */
	void setSubbody(SubBody value);

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
	 * @see roboEMF.RoboEMFPackage#getRoutineDecl_Name()
	 * @model dataType="roboEMF.EString"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link roboEMF.RoutineDecl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // RoutineDecl
