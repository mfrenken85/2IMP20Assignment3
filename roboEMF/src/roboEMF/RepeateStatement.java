/**
 */
package roboEMF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeate Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.RepeateStatement#getCount <em>Count</em>}</li>
 *   <li>{@link roboEMF.RepeateStatement#getSubbody <em>Subbody</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getRepeateStatement()
 * @model
 * @generated
 */
public interface RepeateStatement extends Command {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(Integer)
	 * @see roboEMF.RoboEMFPackage#getRepeateStatement_Count()
	 * @model dataType="roboEMF.EInteger"
	 * @generated
	 */
	Integer getCount();

	/**
	 * Sets the value of the '{@link roboEMF.RepeateStatement#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(Integer value);

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
	 * @see roboEMF.RoboEMFPackage#getRepeateStatement_Subbody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SubBody getSubbody();

	/**
	 * Sets the value of the '{@link roboEMF.RepeateStatement#getSubbody <em>Subbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subbody</em>' containment reference.
	 * @see #getSubbody()
	 * @generated
	 */
	void setSubbody(SubBody value);

} // RepeateStatement
