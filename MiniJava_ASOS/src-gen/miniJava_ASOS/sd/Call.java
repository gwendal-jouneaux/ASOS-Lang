/**
 */
package miniJava_ASOS.sd;

import miniJava_ASOS.Method;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.sd.Call#getInstance <em>Instance</em>}</li>
 *   <li>{@link miniJava_ASOS.sd.Call#getMethod <em>Method</em>}</li>
 *   <li>{@link miniJava_ASOS.sd.Call#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.sd.SdPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends EObject {

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(ObjectInstance)
	 * @see miniJava_ASOS.sd.SdPackage#getCall_Instance()
	 * @model required="true"
	 * @generated
	 */
	ObjectInstance getInstance();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.Call#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(ObjectInstance value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(Method)
	 * @see miniJava_ASOS.sd.SdPackage#getCall_Method()
	 * @model required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.Call#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(EList)
	 * @see miniJava_ASOS.sd.SdPackage#getCall_Values()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<?> getValues();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.Call#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(EList<?> value);

} // Call
