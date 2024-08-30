/**
 */
package miniJava_ASOS.sd;

import miniJava_ASOS.Assignee;
import miniJava_ASOS.Clazz;
import miniJava_ASOS.Method;
import miniJava_ASOS.TypeRef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.sd.State#getFrame <em>Frame</em>}</li>
 *   <li>{@link miniJava_ASOS.sd.State#getObjectsHeap <em>Objects Heap</em>}</li>
 *   <li>{@link miniJava_ASOS.sd.State#getArraysHeap <em>Arrays Heap</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.sd.SdPackage#getState()
 * @model annotation="aspect"
 * @generated
 */
public interface State extends EObject {

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference.
	 * @see #setFrame(Frame)
	 * @see miniJava_ASOS.sd.SdPackage#getState_Frame()
	 * @model containment="true"
	 * @generated
	 */
	Frame getFrame();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.State#getFrame <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' containment reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(Frame value);

	/**
	 * Returns the value of the '<em><b>Objects Heap</b></em>' containment reference list.
	 * The list contents are of type {@link miniJava_ASOS.sd.ObjectInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects Heap</em>' containment reference list.
	 * @see miniJava_ASOS.sd.SdPackage#getState_ObjectsHeap()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectInstance> getObjectsHeap();

	/**
	 * Returns the value of the '<em><b>Arrays Heap</b></em>' containment reference list.
	 * The list contents are of type {@link miniJava_ASOS.sd.ArrayInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrays Heap</em>' containment reference list.
	 * @see miniJava_ASOS.sd.SdPackage#getState_ArraysHeap()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayInstance> getArraysHeap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model assigneeRequired="true"
	 * @generated
	 */
	Value getSymbolValue(Assignee assignee);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model assigneeRequired="true" valueRequired="true"
	 * @generated
	 */
	Value setSymbolValue(Assignee assignee, Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pushContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void popContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model instanceRequired="true"
	 * @generated
	 */
	void pushFrame(ObjectInstance instance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void popFrame();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void println(Value toPrint);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model instanceRequired="true" typeRequired="true" sizeRequired="true"
	 * @generated
	 */
	ArrayInstance fillArray(ArrayInstance instance, TypeRef type, Integer size);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model instanceRequired="true" indexRequired="true"
	 * @generated
	 */
	Value accessArray(ArrayInstance instance, Integer index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ObjectInstance initObject(Clazz clazz);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model clazzRequired="true" valuesRequired="true" valuesMany="false"
	 * @generated
	 */
	Method findConstructor(Clazz clazz, EList<?> values);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model callRequired="true"
	 * @generated
	 */
	Object call(Call call);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pathRequired="true"
	 * @generated
	 */
	ArrayRefValue readImage(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pathRequired="true"
	 * @generated
	 */
	void writeImage(String path, ArrayInstance image);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model classesMany="false"
	 * @generated
	 */
	Method findMain(EList<?> classes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nRequired="true"
	 * @generated
	 */
	Integer sqrt(Integer n);

} // State
