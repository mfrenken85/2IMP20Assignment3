/**
 */
package roboEMF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboEMF.TraceCmd#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @see roboEMF.RoboEMFPackage#getTraceCmd()
 * @model
 * @generated
 */
public interface TraceCmd extends Command {
	/**
	 * Returns the value of the '<em><b>Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' attribute.
	 * @see #setTrace(String)
	 * @see roboEMF.RoboEMFPackage#getTraceCmd_Trace()
	 * @model dataType="roboEMF.EString"
	 * @generated
	 */
	String getTrace();

	/**
	 * Sets the value of the '{@link roboEMF.TraceCmd#getTrace <em>Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' attribute.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(String value);

} // TraceCmd
