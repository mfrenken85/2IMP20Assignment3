/**
 */
package roboEMF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destroy Wall Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.DestroyWallCmd#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getDestroyWallCmd()
 * @model
 * @generated
 */
public interface DestroyWallCmd extends Command {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see roboEMF.RoboEMFPackage#getDestroyWallCmd_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link roboEMF.DestroyWallCmd#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // DestroyWallCmd
