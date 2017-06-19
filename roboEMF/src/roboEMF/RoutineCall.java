/**
 */
package roboEMF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routine Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.RoutineCall#getDecl <em>Decl</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getRoutineCall()
 * @model
 * @generated
 */
public interface RoutineCall extends Command {

	/**
	 * Returns the value of the '<em><b>Decl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decl</em>' reference.
	 * @see #setDecl(RoutineDecl)
	 * @see roboEMF.RoboEMFPackage#getRoutineCall_Decl()
	 * @model required="true"
	 * @generated
	 */
	RoutineDecl getDecl();

	/**
	 * Sets the value of the '{@link roboEMF.RoutineCall#getDecl <em>Decl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decl</em>' reference.
	 * @see #getDecl()
	 * @generated
	 */
	void setDecl(RoutineDecl value);
} // RoutineCall
