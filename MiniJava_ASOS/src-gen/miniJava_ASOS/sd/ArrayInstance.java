/**
 */
package miniJava_ASOS.sd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.sd.ArrayInstance#getSize <em>Size</em>}</li>
 *   <li>{@link miniJava_ASOS.sd.ArrayInstance#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.sd.SdPackage#getArrayInstance()
 * @model annotation="aspect"
 *        annotation="RuntimeData"
 * @generated
 */
public interface ArrayInstance extends EObject {

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see miniJava_ASOS.sd.SdPackage#getArrayInstance_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.ArrayInstance#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link miniJava_ASOS.sd.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see miniJava_ASOS.sd.SdPackage#getArrayInstance_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValue();

} // ArrayInstance
