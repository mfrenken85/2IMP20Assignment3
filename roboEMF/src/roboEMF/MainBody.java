/**
 */
package roboEMF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.MainBody#getCommandmain <em>Commandmain</em>}</li>
 *   <li>{@link roboEMF.MainBody#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getMainBody()
 * @model
 * @generated
 */
public interface MainBody extends EObject {
	/**
	 * Returns the value of the '<em><b>Commandmain</b></em>' containment reference list.
	 * The list contents are of type {@link roboEMF.CommandMain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commandmain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commandmain</em>' containment reference list.
	 * @see roboEMF.RoboEMFPackage#getMainBody_Commandmain()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandMain> getCommandmain();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link roboEMF.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see roboEMF.RoboEMFPackage#getMainBody_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommand();

} // MainBody
