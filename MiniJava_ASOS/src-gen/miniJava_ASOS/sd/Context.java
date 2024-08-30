/**
 */
package miniJava_ASOS.sd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.sd.Context#getParent <em>Parent</em>}</li>
 *   <li>{@link miniJava_ASOS.sd.Context#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.sd.SdPackage#getContext()
 * @model annotation="aspect"
 *        annotation="RuntimeData"
 * @generated
 */
public interface Context extends EObject {

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Context)
	 * @see miniJava_ASOS.sd.SdPackage#getContext_Parent()
	 * @model
	 * @generated
	 */
	Context getParent();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.Context#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Context value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link miniJava_ASOS.sd.SymbolBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see miniJava_ASOS.sd.SdPackage#getContext_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SymbolBinding> getBindings();

} // Context
