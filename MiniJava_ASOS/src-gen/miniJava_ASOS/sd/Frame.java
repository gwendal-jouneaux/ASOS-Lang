/**
 */
package miniJava_ASOS.sd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.sd.Frame#getInstance <em>Instance</em>}</li>
 *   <li>{@link miniJava_ASOS.sd.Frame#getParent <em>Parent</em>}</li>
 *   <li>{@link miniJava_ASOS.sd.Frame#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.sd.SdPackage#getFrame()
 * @model annotation="aspect"
 *        annotation="RuntimeData"
 * @generated
 */
public interface Frame extends EObject {

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(ObjectInstance)
	 * @see miniJava_ASOS.sd.SdPackage#getFrame_Instance()
	 * @model
	 * @generated
	 */
	ObjectInstance getInstance();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.Frame#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(ObjectInstance value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Frame)
	 * @see miniJava_ASOS.sd.SdPackage#getFrame_Parent()
	 * @model
	 * @generated
	 */
	Frame getParent();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.Frame#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Frame value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see miniJava_ASOS.sd.SdPackage#getFrame_Context()
	 * @model containment="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.Frame#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // Frame
