/**
 */
package miniJava_ASOS.sd.util;

import miniJava_ASOS.sd.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see miniJava_ASOS.sd.SdPackage
 * @generated
 */
public class SdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SdSwitch<Adapter> modelSwitch = new SdSwitch<Adapter>() {
		@Override
		public Adapter caseContext(Context object) {
			return createContextAdapter();
		}

		@Override
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter caseIntegerValue(IntegerValue object) {
			return createIntegerValueAdapter();
		}

		@Override
		public Adapter caseSymbolBinding(SymbolBinding object) {
			return createSymbolBindingAdapter();
		}

		@Override
		public Adapter caseFieldBinding(FieldBinding object) {
			return createFieldBindingAdapter();
		}

		@Override
		public Adapter caseStringValue(StringValue object) {
			return createStringValueAdapter();
		}

		@Override
		public Adapter caseBooleanValue(BooleanValue object) {
			return createBooleanValueAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter caseFrame(Frame object) {
			return createFrameAdapter();
		}

		@Override
		public Adapter caseNullValue(NullValue object) {
			return createNullValueAdapter();
		}

		@Override
		public Adapter caseObjectInstance(ObjectInstance object) {
			return createObjectInstanceAdapter();
		}

		@Override
		public Adapter caseArrayInstance(ArrayInstance object) {
			return createArrayInstanceAdapter();
		}

		@Override
		public Adapter caseObjectRefValue(ObjectRefValue object) {
			return createObjectRefValueAdapter();
		}

		@Override
		public Adapter caseArrayRefValue(ArrayRefValue object) {
			return createArrayRefValueAdapter();
		}

		@Override
		public Adapter caseRuntimeError(RuntimeError object) {
			return createRuntimeErrorAdapter();
		}

		@Override
		public Adapter caseReturnValue(ReturnValue object) {
			return createReturnValueAdapter();
		}

		@Override
		public Adapter caseCall(Call object) {
			return createCallAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.SymbolBinding <em>Symbol Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.SymbolBinding
	 * @generated
	 */
	public Adapter createSymbolBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.FieldBinding <em>Field Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.FieldBinding
	 * @generated
	 */
	public Adapter createFieldBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.Frame
	 * @generated
	 */
	public Adapter createFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.NullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.NullValue
	 * @generated
	 */
	public Adapter createNullValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.ObjectInstance <em>Object Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.ObjectInstance
	 * @generated
	 */
	public Adapter createObjectInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.ArrayInstance <em>Array Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.ArrayInstance
	 * @generated
	 */
	public Adapter createArrayInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.ObjectRefValue <em>Object Ref Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.ObjectRefValue
	 * @generated
	 */
	public Adapter createObjectRefValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.ArrayRefValue <em>Array Ref Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.ArrayRefValue
	 * @generated
	 */
	public Adapter createArrayRefValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.RuntimeError <em>Runtime Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.RuntimeError
	 * @generated
	 */
	public Adapter createRuntimeErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.ReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.ReturnValue
	 * @generated
	 */
	public Adapter createReturnValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.sd.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.sd.Call
	 * @generated
	 */
	public Adapter createCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SdAdapterFactory
