/**
 */
package miniJava_ASOS.sd.impl;

import miniJava_ASOS.MiniJava_ASOSPackage;

import miniJava_ASOS.impl.MiniJava_ASOSPackageImpl;

import miniJava_ASOS.sd.ArrayInstance;
import miniJava_ASOS.sd.ArrayRefValue;
import miniJava_ASOS.sd.BooleanValue;
import miniJava_ASOS.sd.Call;
import miniJava_ASOS.sd.Context;
import miniJava_ASOS.sd.FieldBinding;
import miniJava_ASOS.sd.Frame;
import miniJava_ASOS.sd.IntegerValue;
import miniJava_ASOS.sd.NullValue;
import miniJava_ASOS.sd.ObjectInstance;
import miniJava_ASOS.sd.ObjectRefValue;
import miniJava_ASOS.sd.ReturnValue;
import miniJava_ASOS.sd.RuntimeError;
import miniJava_ASOS.sd.SdFactory;
import miniJava_ASOS.sd.SdPackage;
import miniJava_ASOS.sd.State;
import miniJava_ASOS.sd.StringValue;
import miniJava_ASOS.sd.SymbolBinding;
import miniJava_ASOS.sd.Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdPackageImpl extends EPackageImpl implements SdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRefValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayRefValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see miniJava_ASOS.sd.SdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SdPackageImpl() {
		super(eNS_URI, SdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SdPackage init() {
		if (isInited)
			return (SdPackage) EPackage.Registry.INSTANCE.getEPackage(SdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SdPackageImpl theSdPackage = registeredSdPackage instanceof SdPackageImpl ? (SdPackageImpl) registeredSdPackage
				: new SdPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MiniJava_ASOSPackage.eNS_URI);
		MiniJava_ASOSPackageImpl theMiniJava_ASOSPackage = (MiniJava_ASOSPackageImpl) (registeredPackage instanceof MiniJava_ASOSPackageImpl
				? registeredPackage
				: MiniJava_ASOSPackage.eINSTANCE);

		// Create package meta-data objects
		theSdPackage.createPackageContents();
		theMiniJava_ASOSPackage.createPackageContents();

		// Initialize created meta-data
		theSdPackage.initializePackageContents();
		theMiniJava_ASOSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SdPackage.eNS_URI, theSdPackage);
		return theSdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContext_Parent() {
		return (EReference) contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContext_Bindings() {
		return (EReference) contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerValue_Value() {
		return (EAttribute) integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymbolBinding() {
		return symbolBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymbolBinding_Value() {
		return (EReference) symbolBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymbolBinding_Symbol() {
		return (EReference) symbolBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldBinding() {
		return fieldBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldBinding_Field() {
		return (EReference) fieldBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldBinding_Value() {
		return (EReference) fieldBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringValue_Value() {
		return (EAttribute) stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanValue_Value() {
		return (EAttribute) booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Frame() {
		return (EReference) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_ObjectsHeap() {
		return (EReference) stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_ArraysHeap() {
		return (EReference) stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__GetSymbolValue__Assignee() {
		return stateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__SetSymbolValue__Assignee_Value() {
		return stateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__PushContext() {
		return stateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__PopContext() {
		return stateEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__PushFrame__ObjectInstance() {
		return stateEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__PopFrame() {
		return stateEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__Println__Value() {
		return stateEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__FillArray__ArrayInstance_TypeRef_Integer() {
		return stateEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__AccessArray__ArrayInstance_Integer() {
		return stateEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__InitObject__Clazz() {
		return stateEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__FindConstructor__Clazz_EList() {
		return stateEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__Call__Call() {
		return stateEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__ReadImage__String() {
		return stateEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__WriteImage__String_ArrayInstance() {
		return stateEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__FindMain__EList() {
		return stateEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__Sqrt__Integer() {
		return stateEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrame() {
		return frameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrame_Instance() {
		return (EReference) frameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrame_Parent() {
		return (EReference) frameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrame_Context() {
		return (EReference) frameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNullValue() {
		return nullValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectInstance() {
		return objectInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectInstance_Fieldbindings() {
		return (EReference) objectInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectInstance_Type() {
		return (EReference) objectInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayInstance() {
		return arrayInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayInstance_Size() {
		return (EAttribute) arrayInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayInstance_Value() {
		return (EReference) arrayInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectRefValue() {
		return objectRefValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectRefValue_Instance() {
		return (EReference) objectRefValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayRefValue() {
		return arrayRefValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayRefValue_Instance() {
		return (EReference) arrayRefValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuntimeError() {
		return runtimeErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnValue() {
		return returnValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnValue_Value() {
		return (EReference) returnValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCall_Instance() {
		return (EReference) callEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCall_Method() {
		return (EReference) callEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCall_Values() {
		return (EAttribute) callEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SdFactory getSdFactory() {
		return (SdFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__PARENT);
		createEReference(contextEClass, CONTEXT__BINDINGS);

		valueEClass = createEClass(VALUE);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

		symbolBindingEClass = createEClass(SYMBOL_BINDING);
		createEReference(symbolBindingEClass, SYMBOL_BINDING__VALUE);
		createEReference(symbolBindingEClass, SYMBOL_BINDING__SYMBOL);

		fieldBindingEClass = createEClass(FIELD_BINDING);
		createEReference(fieldBindingEClass, FIELD_BINDING__FIELD);
		createEReference(fieldBindingEClass, FIELD_BINDING__VALUE);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__FRAME);
		createEReference(stateEClass, STATE__OBJECTS_HEAP);
		createEReference(stateEClass, STATE__ARRAYS_HEAP);
		createEOperation(stateEClass, STATE___GET_SYMBOL_VALUE__ASSIGNEE);
		createEOperation(stateEClass, STATE___SET_SYMBOL_VALUE__ASSIGNEE_VALUE);
		createEOperation(stateEClass, STATE___PUSH_CONTEXT);
		createEOperation(stateEClass, STATE___POP_CONTEXT);
		createEOperation(stateEClass, STATE___PUSH_FRAME__OBJECTINSTANCE);
		createEOperation(stateEClass, STATE___POP_FRAME);
		createEOperation(stateEClass, STATE___PRINTLN__VALUE);
		createEOperation(stateEClass, STATE___FILL_ARRAY__ARRAYINSTANCE_TYPEREF_INTEGER);
		createEOperation(stateEClass, STATE___ACCESS_ARRAY__ARRAYINSTANCE_INTEGER);
		createEOperation(stateEClass, STATE___INIT_OBJECT__CLAZZ);
		createEOperation(stateEClass, STATE___FIND_CONSTRUCTOR__CLAZZ_ELIST);
		createEOperation(stateEClass, STATE___CALL__CALL);
		createEOperation(stateEClass, STATE___READ_IMAGE__STRING);
		createEOperation(stateEClass, STATE___WRITE_IMAGE__STRING_ARRAYINSTANCE);
		createEOperation(stateEClass, STATE___FIND_MAIN__ELIST);
		createEOperation(stateEClass, STATE___SQRT__INTEGER);

		frameEClass = createEClass(FRAME);
		createEReference(frameEClass, FRAME__INSTANCE);
		createEReference(frameEClass, FRAME__PARENT);
		createEReference(frameEClass, FRAME__CONTEXT);

		nullValueEClass = createEClass(NULL_VALUE);

		objectInstanceEClass = createEClass(OBJECT_INSTANCE);
		createEReference(objectInstanceEClass, OBJECT_INSTANCE__FIELDBINDINGS);
		createEReference(objectInstanceEClass, OBJECT_INSTANCE__TYPE);

		arrayInstanceEClass = createEClass(ARRAY_INSTANCE);
		createEAttribute(arrayInstanceEClass, ARRAY_INSTANCE__SIZE);
		createEReference(arrayInstanceEClass, ARRAY_INSTANCE__VALUE);

		objectRefValueEClass = createEClass(OBJECT_REF_VALUE);
		createEReference(objectRefValueEClass, OBJECT_REF_VALUE__INSTANCE);

		arrayRefValueEClass = createEClass(ARRAY_REF_VALUE);
		createEReference(arrayRefValueEClass, ARRAY_REF_VALUE__INSTANCE);

		runtimeErrorEClass = createEClass(RUNTIME_ERROR);

		returnValueEClass = createEClass(RETURN_VALUE);
		createEReference(returnValueEClass, RETURN_VALUE__VALUE);

		callEClass = createEClass(CALL);
		createEReference(callEClass, CALL__INSTANCE);
		createEReference(callEClass, CALL__METHOD);
		createEAttribute(callEClass, CALL__VALUES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MiniJava_ASOSPackage theMiniJava_ASOSPackage = (MiniJava_ASOSPackage) EPackage.Registry.INSTANCE
				.getEPackage(MiniJava_ASOSPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		integerValueEClass.getESuperTypes().add(this.getValue());
		stringValueEClass.getESuperTypes().add(this.getValue());
		booleanValueEClass.getESuperTypes().add(this.getValue());
		nullValueEClass.getESuperTypes().add(this.getValue());
		objectRefValueEClass.getESuperTypes().add(this.getValue());
		arrayRefValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Parent(), this.getContext(), null, "parent", null, 0, 1, Context.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getContext_Bindings(), this.getSymbolBinding(), null, "bindings", null, 0, -1, Context.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1,
				IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(symbolBindingEClass, SymbolBinding.class, "SymbolBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymbolBinding_Value(), this.getValue(), null, "value", null, 0, 1, SymbolBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbolBinding_Symbol(), theMiniJava_ASOSPackage.getSymbol(), null, "symbol", null, 1, 1,
				SymbolBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldBindingEClass, FieldBinding.class, "FieldBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldBinding_Field(), theMiniJava_ASOSPackage.getField(), null, "field", null, 1, 1,
				FieldBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldBinding_Value(), this.getValue(), null, "value", null, 0, 1, FieldBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1,
				BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Frame(), this.getFrame(), null, "frame", null, 0, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getState_ObjectsHeap(), this.getObjectInstance(), null, "objectsHeap", null, 0, -1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_ArraysHeap(), this.getArrayInstance(), null, "arraysHeap", null, 0, -1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getState__GetSymbolValue__Assignee(), this.getValue(), "getSymbolValue", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMiniJava_ASOSPackage.getAssignee(), "assignee", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__SetSymbolValue__Assignee_Value(), this.getValue(), "setSymbolValue", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMiniJava_ASOSPackage.getAssignee(), "assignee", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getValue(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getState__PushContext(), null, "pushContext", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getState__PopContext(), null, "popContext", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__PushFrame__ObjectInstance(), null, "pushFrame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObjectInstance(), "instance", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getState__PopFrame(), null, "popFrame", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__Println__Value(), null, "println", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getValue(), "toPrint", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__FillArray__ArrayInstance_TypeRef_Integer(), this.getArrayInstance(), "fillArray",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getArrayInstance(), "instance", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMiniJava_ASOSPackage.getTypeRef(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "size", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__AccessArray__ArrayInstance_Integer(), this.getValue(), "accessArray", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getArrayInstance(), "instance", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__InitObject__Clazz(), this.getObjectInstance(), "initObject", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMiniJava_ASOSPackage.getClazz(), "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__FindConstructor__Clazz_EList(), theMiniJava_ASOSPackage.getMethod(),
				"findConstructor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMiniJava_ASOSPackage.getClazz(), "clazz", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "values", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__Call__Call(), ecorePackage.getEJavaObject(), "call", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCall(), "call", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__ReadImage__String(), this.getArrayRefValue(), "readImage", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__WriteImage__String_ArrayInstance(), null, "writeImage", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getArrayInstance(), "image", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__FindMain__EList(), theMiniJava_ASOSPackage.getMethod(), "findMain", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "classes", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__Sqrt__Integer(), ecorePackage.getEIntegerObject(), "sqrt", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "n", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(frameEClass, Frame.class, "Frame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrame_Instance(), this.getObjectInstance(), null, "instance", null, 0, 1, Frame.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrame_Parent(), this.getFrame(), null, "parent", null, 0, 1, Frame.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFrame_Context(), this.getContext(), null, "context", null, 0, 1, Frame.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(nullValueEClass, NullValue.class, "NullValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectInstanceEClass, ObjectInstance.class, "ObjectInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectInstance_Fieldbindings(), this.getFieldBinding(), null, "fieldbindings", null, 0, -1,
				ObjectInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectInstance_Type(), theMiniJava_ASOSPackage.getClazz(), null, "type", null, 1, 1,
				ObjectInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayInstanceEClass, ArrayInstance.class, "ArrayInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayInstance_Size(), ecorePackage.getEInt(), "size", null, 0, 1, ArrayInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayInstance_Value(), this.getValue(), null, "value", null, 0, -1, ArrayInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectRefValueEClass, ObjectRefValue.class, "ObjectRefValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectRefValue_Instance(), this.getObjectInstance(), null, "instance", null, 0, 1,
				ObjectRefValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayRefValueEClass, ArrayRefValue.class, "ArrayRefValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayRefValue_Instance(), this.getArrayInstance(), null, "instance", null, 0, 1,
				ArrayRefValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeErrorEClass, RuntimeError.class, "RuntimeError", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnValueEClass, ReturnValue.class, "ReturnValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnValue_Value(), this.getValue(), null, "value", null, 1, 1, ReturnValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCall_Instance(), this.getObjectInstance(), null, "instance", null, 1, 1, Call.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCall_Method(), theMiniJava_ASOSPackage.getMethod(), null, "method", null, 1, 1, Call.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getCall_Values(), g1, "values", null, 0, 1, Call.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// aspect
		createAspectAnnotations();
		// RuntimeData
		createRuntimeDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";
		addAnnotation(contextEClass, source, new String[] {});
		addAnnotation(valueEClass, source, new String[] {});
		addAnnotation(integerValueEClass, source, new String[] {});
		addAnnotation(symbolBindingEClass, source, new String[] {});
		addAnnotation(fieldBindingEClass, source, new String[] {});
		addAnnotation(stringValueEClass, source, new String[] {});
		addAnnotation(booleanValueEClass, source, new String[] {});
		addAnnotation(stateEClass, source, new String[] {});
		addAnnotation(frameEClass, source, new String[] {});
		addAnnotation(nullValueEClass, source, new String[] {});
		addAnnotation(objectInstanceEClass, source, new String[] {});
		addAnnotation(arrayInstanceEClass, source, new String[] {});
		addAnnotation(objectRefValueEClass, source, new String[] {});
		addAnnotation(arrayRefValueEClass, source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>RuntimeData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRuntimeDataAnnotations() {
		String source = "RuntimeData";
		addAnnotation(contextEClass, source, new String[] {});
		addAnnotation(valueEClass, source, new String[] {});
		addAnnotation(integerValueEClass, source, new String[] {});
		addAnnotation(symbolBindingEClass, source, new String[] {});
		addAnnotation(fieldBindingEClass, source, new String[] {});
		addAnnotation(stringValueEClass, source, new String[] {});
		addAnnotation(booleanValueEClass, source, new String[] {});
		addAnnotation(frameEClass, source, new String[] {});
		addAnnotation(nullValueEClass, source, new String[] {});
		addAnnotation(objectInstanceEClass, source, new String[] {});
		addAnnotation(arrayInstanceEClass, source, new String[] {});
		addAnnotation(objectRefValueEClass, source, new String[] {});
		addAnnotation(arrayRefValueEClass, source, new String[] {});
	}

} //SdPackageImpl
