/**
 */
package miniJava_ASOS.sd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.sd.ReturnValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.sd.SdPackage#getReturnValue()
 * @model
 * @generated
 */
public interface ReturnValue extends EObject {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see miniJava_ASOS.sd.SdPackage#getReturnValue_Value()
	 * @model required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.ReturnValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // ReturnValue
