/**
 */
package miniJava_ASOS.sd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.sd.StringValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.sd.SdPackage#getStringValue()
 * @model annotation="aspect"
 *        annotation="RuntimeData"
 * @generated
 */
public interface StringValue extends Value {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see miniJava_ASOS.sd.SdPackage#getStringValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.StringValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringValue
