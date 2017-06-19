/**
 */
package roboEMF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.EComment#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getEComment()
 * @model
 * @generated
 */
public interface EComment extends Command {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see roboEMF.RoboEMFPackage#getEComment_Comment()
	 * @model dataType="roboEMF.EString"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link roboEMF.EComment#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // EComment
