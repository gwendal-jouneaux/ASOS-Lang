/**
 */
package miniJava_ASOS.sd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see miniJava_ASOS.sd.SdFactory
 * @model kind="package"
 * @generated
 */
public interface SdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/miniJava_ASOS/sd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SdPackage eINSTANCE = miniJava_ASOS.sd.impl.SdPackageImpl.init();

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.ContextImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__BINDINGS = 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.ValueImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.IntegerValueImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.SymbolBindingImpl <em>Symbol Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.SymbolBindingImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getSymbolBinding()
	 * @generated
	 */
	int SYMBOL_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_BINDING__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_BINDING__SYMBOL = 1;

	/**
	 * The number of structural features of the '<em>Symbol Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Symbol Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.FieldBindingImpl <em>Field Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.FieldBindingImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getFieldBinding()
	 * @generated
	 */
	int FIELD_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BINDING__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BINDING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Field Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.StringValueImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.BooleanValueImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.StateImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getState()
	 * @generated
	 */
	int STATE = 7;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FRAME = 0;

	/**
	 * The feature id for the '<em><b>Objects Heap</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OBJECTS_HEAP = 1;

	/**
	 * The feature id for the '<em><b>Arrays Heap</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ARRAYS_HEAP = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Symbol Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_SYMBOL_VALUE__ASSIGNEE = 0;

	/**
	 * The operation id for the '<em>Set Symbol Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___SET_SYMBOL_VALUE__ASSIGNEE_VALUE = 1;

	/**
	 * The operation id for the '<em>Push Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___PUSH_CONTEXT = 2;

	/**
	 * The operation id for the '<em>Pop Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___POP_CONTEXT = 3;

	/**
	 * The operation id for the '<em>Push Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___PUSH_FRAME__OBJECTINSTANCE = 4;

	/**
	 * The operation id for the '<em>Pop Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___POP_FRAME = 5;

	/**
	 * The operation id for the '<em>Println</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___PRINTLN__VALUE = 6;

	/**
	 * The operation id for the '<em>Fill Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___FILL_ARRAY__ARRAYINSTANCE_TYPEREF_INTEGER = 7;

	/**
	 * The operation id for the '<em>Access Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ACCESS_ARRAY__ARRAYINSTANCE_INTEGER = 8;

	/**
	 * The operation id for the '<em>Init Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___INIT_OBJECT__CLAZZ = 9;

	/**
	 * The operation id for the '<em>Find Constructor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___FIND_CONSTRUCTOR__CLAZZ_ELIST = 10;

	/**
	 * The operation id for the '<em>Call</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___CALL__CALL = 11;

	/**
	 * The operation id for the '<em>Read Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___READ_IMAGE__STRING = 12;

	/**
	 * The operation id for the '<em>Write Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___WRITE_IMAGE__STRING_ARRAYINSTANCE = 13;

	/**
	 * The operation id for the '<em>Find Main</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___FIND_MAIN__ELIST = 14;

	/**
	 * The operation id for the '<em>Sqrt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___SQRT__INTEGER = 15;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 16;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.FrameImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 8;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__CONTEXT = 2;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.NullValueImpl <em>Null Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.NullValueImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getNullValue()
	 * @generated
	 */
	int NULL_VALUE = 9;

	/**
	 * The number of structural features of the '<em>Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.ObjectInstanceImpl <em>Object Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.ObjectInstanceImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getObjectInstance()
	 * @generated
	 */
	int OBJECT_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Fieldbindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE__FIELDBINDINGS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Object Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Object Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.ArrayInstanceImpl <em>Array Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.ArrayInstanceImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getArrayInstance()
	 * @generated
	 */
	int ARRAY_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INSTANCE__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INSTANCE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Array Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Array Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.ObjectRefValueImpl <em>Object Ref Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.ObjectRefValueImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getObjectRefValue()
	 * @generated
	 */
	int OBJECT_REF_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_VALUE__INSTANCE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Ref Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Ref Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.ArrayRefValueImpl <em>Array Ref Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.ArrayRefValueImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getArrayRefValue()
	 * @generated
	 */
	int ARRAY_REF_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_REF_VALUE__INSTANCE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Ref Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_REF_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Ref Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_REF_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.RuntimeErrorImpl <em>Runtime Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.RuntimeErrorImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getRuntimeError()
	 * @generated
	 */
	int RUNTIME_ERROR = 14;

	/**
	 * The number of structural features of the '<em>Runtime Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Runtime Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.ReturnValueImpl <em>Return Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.ReturnValueImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getReturnValue()
	 * @generated
	 */
	int RETURN_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Return Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.sd.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.sd.impl.CallImpl
	 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 16;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__VALUES = 2;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see miniJava_ASOS.sd.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.sd.Context#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see miniJava_ASOS.sd.Context#getParent()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link miniJava_ASOS.sd.Context#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see miniJava_ASOS.sd.Context#getBindings()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Bindings();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see miniJava_ASOS.sd.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see miniJava_ASOS.sd.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.sd.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see miniJava_ASOS.sd.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.SymbolBinding <em>Symbol Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Binding</em>'.
	 * @see miniJava_ASOS.sd.SymbolBinding
	 * @generated
	 */
	EClass getSymbolBinding();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.sd.SymbolBinding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see miniJava_ASOS.sd.SymbolBinding#getValue()
	 * @see #getSymbolBinding()
	 * @generated
	 */
	EReference getSymbolBinding_Value();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.sd.SymbolBinding#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symbol</em>'.
	 * @see miniJava_ASOS.sd.SymbolBinding#getSymbol()
	 * @see #getSymbolBinding()
	 * @generated
	 */
	EReference getSymbolBinding_Symbol();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.FieldBinding <em>Field Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Binding</em>'.
	 * @see miniJava_ASOS.sd.FieldBinding
	 * @generated
	 */
	EClass getFieldBinding();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.sd.FieldBinding#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see miniJava_ASOS.sd.FieldBinding#getField()
	 * @see #getFieldBinding()
	 * @generated
	 */
	EReference getFieldBinding_Field();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.sd.FieldBinding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see miniJava_ASOS.sd.FieldBinding#getValue()
	 * @see #getFieldBinding()
	 * @generated
	 */
	EReference getFieldBinding_Value();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see miniJava_ASOS.sd.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.sd.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see miniJava_ASOS.sd.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see miniJava_ASOS.sd.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.sd.BooleanValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see miniJava_ASOS.sd.BooleanValue#getValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see miniJava_ASOS.sd.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.sd.State#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frame</em>'.
	 * @see miniJava_ASOS.sd.State#getFrame()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Frame();

	/**
	 * Returns the meta object for the containment reference list '{@link miniJava_ASOS.sd.State#getObjectsHeap <em>Objects Heap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects Heap</em>'.
	 * @see miniJava_ASOS.sd.State#getObjectsHeap()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ObjectsHeap();

	/**
	 * Returns the meta object for the containment reference list '{@link miniJava_ASOS.sd.State#getArraysHeap <em>Arrays Heap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrays Heap</em>'.
	 * @see miniJava_ASOS.sd.State#getArraysHeap()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ArraysHeap();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#getSymbolValue(miniJava_ASOS.Assignee) <em>Get Symbol Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol Value</em>' operation.
	 * @see miniJava_ASOS.sd.State#getSymbolValue(miniJava_ASOS.Assignee)
	 * @generated
	 */
	EOperation getState__GetSymbolValue__Assignee();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#setSymbolValue(miniJava_ASOS.Assignee, miniJava_ASOS.sd.Value) <em>Set Symbol Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Symbol Value</em>' operation.
	 * @see miniJava_ASOS.sd.State#setSymbolValue(miniJava_ASOS.Assignee, miniJava_ASOS.sd.Value)
	 * @generated
	 */
	EOperation getState__SetSymbolValue__Assignee_Value();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#pushContext() <em>Push Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Push Context</em>' operation.
	 * @see miniJava_ASOS.sd.State#pushContext()
	 * @generated
	 */
	EOperation getState__PushContext();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#popContext() <em>Pop Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pop Context</em>' operation.
	 * @see miniJava_ASOS.sd.State#popContext()
	 * @generated
	 */
	EOperation getState__PopContext();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#pushFrame(miniJava_ASOS.sd.ObjectInstance) <em>Push Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Push Frame</em>' operation.
	 * @see miniJava_ASOS.sd.State#pushFrame(miniJava_ASOS.sd.ObjectInstance)
	 * @generated
	 */
	EOperation getState__PushFrame__ObjectInstance();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#popFrame() <em>Pop Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pop Frame</em>' operation.
	 * @see miniJava_ASOS.sd.State#popFrame()
	 * @generated
	 */
	EOperation getState__PopFrame();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#println(miniJava_ASOS.sd.Value) <em>Println</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Println</em>' operation.
	 * @see miniJava_ASOS.sd.State#println(miniJava_ASOS.sd.Value)
	 * @generated
	 */
	EOperation getState__Println__Value();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#fillArray(miniJava_ASOS.sd.ArrayInstance, miniJava_ASOS.TypeRef, java.lang.Integer) <em>Fill Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Array</em>' operation.
	 * @see miniJava_ASOS.sd.State#fillArray(miniJava_ASOS.sd.ArrayInstance, miniJava_ASOS.TypeRef, java.lang.Integer)
	 * @generated
	 */
	EOperation getState__FillArray__ArrayInstance_TypeRef_Integer();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#accessArray(miniJava_ASOS.sd.ArrayInstance, java.lang.Integer) <em>Access Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Access Array</em>' operation.
	 * @see miniJava_ASOS.sd.State#accessArray(miniJava_ASOS.sd.ArrayInstance, java.lang.Integer)
	 * @generated
	 */
	EOperation getState__AccessArray__ArrayInstance_Integer();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#initObject(miniJava_ASOS.Clazz) <em>Init Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Object</em>' operation.
	 * @see miniJava_ASOS.sd.State#initObject(miniJava_ASOS.Clazz)
	 * @generated
	 */
	EOperation getState__InitObject__Clazz();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#findConstructor(miniJava_ASOS.Clazz, org.eclipse.emf.common.util.EList) <em>Find Constructor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Constructor</em>' operation.
	 * @see miniJava_ASOS.sd.State#findConstructor(miniJava_ASOS.Clazz, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getState__FindConstructor__Clazz_EList();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#call(miniJava_ASOS.sd.Call) <em>Call</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call</em>' operation.
	 * @see miniJava_ASOS.sd.State#call(miniJava_ASOS.sd.Call)
	 * @generated
	 */
	EOperation getState__Call__Call();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#readImage(java.lang.String) <em>Read Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Image</em>' operation.
	 * @see miniJava_ASOS.sd.State#readImage(java.lang.String)
	 * @generated
	 */
	EOperation getState__ReadImage__String();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#writeImage(java.lang.String, miniJava_ASOS.sd.ArrayInstance) <em>Write Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Image</em>' operation.
	 * @see miniJava_ASOS.sd.State#writeImage(java.lang.String, miniJava_ASOS.sd.ArrayInstance)
	 * @generated
	 */
	EOperation getState__WriteImage__String_ArrayInstance();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#findMain(org.eclipse.emf.common.util.EList) <em>Find Main</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Main</em>' operation.
	 * @see miniJava_ASOS.sd.State#findMain(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getState__FindMain__EList();

	/**
	 * Returns the meta object for the '{@link miniJava_ASOS.sd.State#sqrt(java.lang.Integer) <em>Sqrt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sqrt</em>' operation.
	 * @see miniJava_ASOS.sd.State#sqrt(java.lang.Integer)
	 * @generated
	 */
	EOperation getState__Sqrt__Integer();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see miniJava_ASOS.sd.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.sd.Frame#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see miniJava_ASOS.sd.Frame#getInstance()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Instance();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.sd.Frame#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see miniJava_ASOS.sd.Frame#getParent()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.sd.Frame#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see miniJava_ASOS.sd.Frame#getContext()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Context();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.NullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Value</em>'.
	 * @see miniJava_ASOS.sd.NullValue
	 * @generated
	 */
	EClass getNullValue();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.ObjectInstance <em>Object Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Instance</em>'.
	 * @see miniJava_ASOS.sd.ObjectInstance
	 * @generated
	 */
	EClass getObjectInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link miniJava_ASOS.sd.ObjectInstance#getFieldbindings <em>Fieldbindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fieldbindings</em>'.
	 * @see miniJava_ASOS.sd.ObjectInstance#getFieldbindings()
	 * @see #getObjectInstance()
	 * @generated
	 */
	EReference getObjectInstance_Fieldbindings();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.sd.ObjectInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see miniJava_ASOS.sd.ObjectInstance#getType()
	 * @see #getObjectInstance()
	 * @generated
	 */
	EReference getObjectInstance_Type();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.ArrayInstance <em>Array Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Instance</em>'.
	 * @see miniJava_ASOS.sd.ArrayInstance
	 * @generated
	 */
	EClass getArrayInstance();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.sd.ArrayInstance#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see miniJava_ASOS.sd.ArrayInstance#getSize()
	 * @see #getArrayInstance()
	 * @generated
	 */
	EAttribute getArrayInstance_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link miniJava_ASOS.sd.ArrayInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see miniJava_ASOS.sd.ArrayInstance#getValue()
	 * @see #getArrayInstance()
	 * @generated
	 */
	EReference getArrayInstance_Value();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.ObjectRefValue <em>Object Ref Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ref Value</em>'.
	 * @see miniJava_ASOS.sd.ObjectRefValue
	 * @generated
	 */
	EClass getObjectRefValue();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.sd.ObjectRefValue#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see miniJava_ASOS.sd.ObjectRefValue#getInstance()
	 * @see #getObjectRefValue()
	 * @generated
	 */
	EReference getObjectRefValue_Instance();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.ArrayRefValue <em>Array Ref Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Ref Value</em>'.
	 * @see miniJava_ASOS.sd.ArrayRefValue
	 * @generated
	 */
	EClass getArrayRefValue();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.sd.ArrayRefValue#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see miniJava_ASOS.sd.ArrayRefValue#getInstance()
	 * @see #getArrayRefValue()
	 * @generated
	 */
	EReference getArrayRefValue_Instance();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.RuntimeError <em>Runtime Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Error</em>'.
	 * @see miniJava_ASOS.sd.RuntimeError
	 * @generated
	 */
	EClass getRuntimeError();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.ReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Value</em>'.
	 * @see miniJava_ASOS.sd.ReturnValue
	 * @generated
	 */
	EClass getReturnValue();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.sd.ReturnValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see miniJava_ASOS.sd.ReturnValue#getValue()
	 * @see #getReturnValue()
	 * @generated
	 */
	EReference getReturnValue_Value();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.sd.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see miniJava_ASOS.sd.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.sd.Call#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see miniJava_ASOS.sd.Call#getInstance()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Instance();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.sd.Call#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see miniJava_ASOS.sd.Call#getMethod()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Method();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.sd.Call#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see miniJava_ASOS.sd.Call#getValues()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_Values();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SdFactory getSdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.ContextImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PARENT = eINSTANCE.getContext_Parent();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__BINDINGS = eINSTANCE.getContext_Bindings();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.ValueImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.IntegerValueImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.SymbolBindingImpl <em>Symbol Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.SymbolBindingImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getSymbolBinding()
		 * @generated
		 */
		EClass SYMBOL_BINDING = eINSTANCE.getSymbolBinding();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL_BINDING__VALUE = eINSTANCE.getSymbolBinding_Value();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL_BINDING__SYMBOL = eINSTANCE.getSymbolBinding_Symbol();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.FieldBindingImpl <em>Field Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.FieldBindingImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getFieldBinding()
		 * @generated
		 */
		EClass FIELD_BINDING = eINSTANCE.getFieldBinding();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_BINDING__FIELD = eINSTANCE.getFieldBinding_Field();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_BINDING__VALUE = eINSTANCE.getFieldBinding_Value();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.StringValueImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.BooleanValueImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.StateImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FRAME = eINSTANCE.getState_Frame();

		/**
		 * The meta object literal for the '<em><b>Objects Heap</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OBJECTS_HEAP = eINSTANCE.getState_ObjectsHeap();

		/**
		 * The meta object literal for the '<em><b>Arrays Heap</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ARRAYS_HEAP = eINSTANCE.getState_ArraysHeap();

		/**
		 * The meta object literal for the '<em><b>Get Symbol Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___GET_SYMBOL_VALUE__ASSIGNEE = eINSTANCE.getState__GetSymbolValue__Assignee();

		/**
		 * The meta object literal for the '<em><b>Set Symbol Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___SET_SYMBOL_VALUE__ASSIGNEE_VALUE = eINSTANCE.getState__SetSymbolValue__Assignee_Value();

		/**
		 * The meta object literal for the '<em><b>Push Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___PUSH_CONTEXT = eINSTANCE.getState__PushContext();

		/**
		 * The meta object literal for the '<em><b>Pop Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___POP_CONTEXT = eINSTANCE.getState__PopContext();

		/**
		 * The meta object literal for the '<em><b>Push Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___PUSH_FRAME__OBJECTINSTANCE = eINSTANCE.getState__PushFrame__ObjectInstance();

		/**
		 * The meta object literal for the '<em><b>Pop Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___POP_FRAME = eINSTANCE.getState__PopFrame();

		/**
		 * The meta object literal for the '<em><b>Println</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___PRINTLN__VALUE = eINSTANCE.getState__Println__Value();

		/**
		 * The meta object literal for the '<em><b>Fill Array</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___FILL_ARRAY__ARRAYINSTANCE_TYPEREF_INTEGER = eINSTANCE
				.getState__FillArray__ArrayInstance_TypeRef_Integer();

		/**
		 * The meta object literal for the '<em><b>Access Array</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___ACCESS_ARRAY__ARRAYINSTANCE_INTEGER = eINSTANCE
				.getState__AccessArray__ArrayInstance_Integer();

		/**
		 * The meta object literal for the '<em><b>Init Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___INIT_OBJECT__CLAZZ = eINSTANCE.getState__InitObject__Clazz();

		/**
		 * The meta object literal for the '<em><b>Find Constructor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___FIND_CONSTRUCTOR__CLAZZ_ELIST = eINSTANCE.getState__FindConstructor__Clazz_EList();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___CALL__CALL = eINSTANCE.getState__Call__Call();

		/**
		 * The meta object literal for the '<em><b>Read Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___READ_IMAGE__STRING = eINSTANCE.getState__ReadImage__String();

		/**
		 * The meta object literal for the '<em><b>Write Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___WRITE_IMAGE__STRING_ARRAYINSTANCE = eINSTANCE.getState__WriteImage__String_ArrayInstance();

		/**
		 * The meta object literal for the '<em><b>Find Main</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___FIND_MAIN__ELIST = eINSTANCE.getState__FindMain__EList();

		/**
		 * The meta object literal for the '<em><b>Sqrt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___SQRT__INTEGER = eINSTANCE.getState__Sqrt__Integer();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.FrameImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__INSTANCE = eINSTANCE.getFrame_Instance();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__PARENT = eINSTANCE.getFrame_Parent();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__CONTEXT = eINSTANCE.getFrame_Context();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.NullValueImpl <em>Null Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.NullValueImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getNullValue()
		 * @generated
		 */
		EClass NULL_VALUE = eINSTANCE.getNullValue();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.ObjectInstanceImpl <em>Object Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.ObjectInstanceImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getObjectInstance()
		 * @generated
		 */
		EClass OBJECT_INSTANCE = eINSTANCE.getObjectInstance();

		/**
		 * The meta object literal for the '<em><b>Fieldbindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INSTANCE__FIELDBINDINGS = eINSTANCE.getObjectInstance_Fieldbindings();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INSTANCE__TYPE = eINSTANCE.getObjectInstance_Type();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.ArrayInstanceImpl <em>Array Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.ArrayInstanceImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getArrayInstance()
		 * @generated
		 */
		EClass ARRAY_INSTANCE = eINSTANCE.getArrayInstance();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_INSTANCE__SIZE = eINSTANCE.getArrayInstance_Size();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_INSTANCE__VALUE = eINSTANCE.getArrayInstance_Value();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.ObjectRefValueImpl <em>Object Ref Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.ObjectRefValueImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getObjectRefValue()
		 * @generated
		 */
		EClass OBJECT_REF_VALUE = eINSTANCE.getObjectRefValue();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_REF_VALUE__INSTANCE = eINSTANCE.getObjectRefValue_Instance();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.ArrayRefValueImpl <em>Array Ref Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.ArrayRefValueImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getArrayRefValue()
		 * @generated
		 */
		EClass ARRAY_REF_VALUE = eINSTANCE.getArrayRefValue();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_REF_VALUE__INSTANCE = eINSTANCE.getArrayRefValue_Instance();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.RuntimeErrorImpl <em>Runtime Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.RuntimeErrorImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getRuntimeError()
		 * @generated
		 */
		EClass RUNTIME_ERROR = eINSTANCE.getRuntimeError();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.ReturnValueImpl <em>Return Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.ReturnValueImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getReturnValue()
		 * @generated
		 */
		EClass RETURN_VALUE = eINSTANCE.getReturnValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_VALUE__VALUE = eINSTANCE.getReturnValue_Value();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.sd.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.sd.impl.CallImpl
		 * @see miniJava_ASOS.sd.impl.SdPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__INSTANCE = eINSTANCE.getCall_Instance();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__METHOD = eINSTANCE.getCall_Method();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL__VALUES = eINSTANCE.getCall_Values();

	}

} //SdPackage
