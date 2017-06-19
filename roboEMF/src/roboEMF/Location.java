/**
 */
package roboEMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.Location#getRow <em>Row</em>}</li>
 *   <li>{@link roboEMF.Location#getCol <em>Col</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(Integer)
	 * @see roboEMF.RoboEMFPackage#getLocation_Row()
	 * @model dataType="roboEMF.EInteger"
	 * @generated
	 */
	Integer getRow();

	/**
	 * Sets the value of the '{@link roboEMF.Location#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(Integer value);

	/**
	 * Returns the value of the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col</em>' attribute.
	 * @see #setCol(Integer)
	 * @see roboEMF.RoboEMFPackage#getLocation_Col()
	 * @model dataType="roboEMF.EInteger"
	 * @generated
	 */
	Integer getCol();

	/**
	 * Sets the value of the '{@link roboEMF.Location#getCol <em>Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col</em>' attribute.
	 * @see #getCol()
	 * @generated
	 */
	void setCol(Integer value);

} // Location
