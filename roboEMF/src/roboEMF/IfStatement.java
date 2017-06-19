/**
 */
package roboEMF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.IfStatement#getSubbody <em>Subbody</em>}</li>
 *   <li>{@link roboEMF.IfStatement#getConditionmodel <em>Conditionmodel</em>}</li>
 *   <li>{@link roboEMF.IfStatement#getElsebody <em>Elsebody</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Command {
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
	 * @see roboEMF.RoboEMFPackage#getIfStatement_Subbody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SubBody getSubbody();

	/**
	 * Sets the value of the '{@link roboEMF.IfStatement#getSubbody <em>Subbody</em>}' containment reference.
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
	 * @see roboEMF.RoboEMFPackage#getIfStatement_Conditionmodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionModel getConditionmodel();

	/**
	 * Sets the value of the '{@link roboEMF.IfStatement#getConditionmodel <em>Conditionmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionmodel</em>' containment reference.
	 * @see #getConditionmodel()
	 * @generated
	 */
	void setConditionmodel(ConditionModel value);

	/**
	 * Returns the value of the '<em><b>Elsebody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elsebody</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elsebody</em>' containment reference.
	 * @see #setElsebody(SubBody)
	 * @see roboEMF.RoboEMFPackage#getIfStatement_Elsebody()
	 * @model containment="true"
	 * @generated
	 */
	SubBody getElsebody();

	/**
	 * Sets the value of the '{@link roboEMF.IfStatement#getElsebody <em>Elsebody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elsebody</em>' containment reference.
	 * @see #getElsebody()
	 * @generated
	 */
	void setElsebody(SubBody value);

} // IfStatement
