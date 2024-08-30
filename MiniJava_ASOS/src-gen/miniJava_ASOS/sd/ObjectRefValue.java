/**
 */
package miniJava_ASOS.sd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Ref Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.sd.ObjectRefValue#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.sd.SdPackage#getObjectRefValue()
 * @model annotation="aspect"
 *        annotation="RuntimeData"
 * @generated
 */
public interface ObjectRefValue extends Value {

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(ObjectInstance)
	 * @see miniJava_ASOS.sd.SdPackage#getObjectRefValue_Instance()
	 * @model
	 * @generated
	 */
	ObjectInstance getInstance();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.ObjectRefValue#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(ObjectInstance value);

} // ObjectRefValue
