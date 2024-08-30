/**
 */
package miniJava_ASOS.sd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.sd.BooleanValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.sd.SdPackage#getBooleanValue()
 * @model annotation="aspect"
 *        annotation="RuntimeData"
 * @generated
 */
public interface BooleanValue extends Value {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Boolean)
	 * @see miniJava_ASOS.sd.SdPackage#getBooleanValue_Value()
	 * @model
	 * @generated
	 */
	Boolean getValue();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.BooleanValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Boolean value);

} // BooleanValue
