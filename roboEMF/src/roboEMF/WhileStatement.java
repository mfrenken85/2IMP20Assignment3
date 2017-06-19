/**
 */
package roboEMF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.WhileStatement#getSubbody <em>Subbody</em>}</li>
 *   <li>{@link roboEMF.WhileStatement#getConditionmodel <em>Conditionmodel</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getWhileStatement()
 * @model
 * @generated
 */
public interface WhileStatement extends Command {
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
	 * @see roboEMF.RoboEMFPackage#getWhileStatement_Subbody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SubBody getSubbody();

	/**
	 * Sets the value of the '{@link roboEMF.WhileStatement#getSubbody <em>Subbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subbody</em>' containment reference.
	 * @see #getSubbody()
	 * @generated
	 */
	void setSubbody(SubBody value);

	/**
	 * Returns the value of the '<em><b>Conditionmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionmodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionmodel</em>' containment reference.
	 * @see #setConditionmodel(ConditionModel)
	 * @see roboEMF.RoboEMFPackage#getWhileStatement_Conditionmodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionModel getConditionmodel();

	/**
	 * Sets the value of the '{@link roboEMF.WhileStatement#getConditionmodel <em>Conditionmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionmodel</em>' containment reference.
	 * @see #getConditionmodel()
	 * @generated
	 */
	void setConditionmodel(ConditionModel value);

} // WhileStatement
