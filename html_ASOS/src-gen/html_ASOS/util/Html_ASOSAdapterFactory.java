/**
 */
package html_ASOS.util;

import html_ASOS.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see html_ASOS.Html_ASOSPackage
 * @generated
 */
public class Html_ASOSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Html_ASOSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Html_ASOSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Html_ASOSPackage.eINSTANCE;
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
	protected Html_ASOSSwitch<Adapter> modelSwitch = new Html_ASOSSwitch<Adapter>() {
		@Override
		public Adapter caseHTMLNodeRoot(HTMLNodeRoot object) {
			return createHTMLNodeRootAdapter();
		}

		@Override
		public Adapter caseHTMLNodeBase(HTMLNodeBase object) {
			return createHTMLNodeBaseAdapter();
		}

		@Override
		public Adapter caseHTMLNodeText(HTMLNodeText object) {
			return createHTMLNodeTextAdapter();
		}

		@Override
		public Adapter caseHTMLNodeBlockTag(HTMLNodeBlockTag object) {
			return createHTMLNodeBlockTagAdapter();
		}

		@Override
		public Adapter caseHTMLNodeBaseTag(HTMLNodeBaseTag object) {
			return createHTMLNodeBaseTagAdapter();
		}

		@Override
		public Adapter caseHTMLNodeAttribute(HTMLNodeAttribute object) {
			return createHTMLNodeAttributeAdapter();
		}

		@Override
		public Adapter caseHTMLNodeEmptyTag(HTMLNodeEmptyTag object) {
			return createHTMLNodeEmptyTagAdapter();
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
	 * Creates a new adapter for an object of class '{@link html_ASOS.HTMLNodeRoot <em>HTML Node Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see html_ASOS.HTMLNodeRoot
	 * @generated
	 */
	public Adapter createHTMLNodeRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link html_ASOS.HTMLNodeBase <em>HTML Node Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see html_ASOS.HTMLNodeBase
	 * @generated
	 */
	public Adapter createHTMLNodeBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link html_ASOS.HTMLNodeText <em>HTML Node Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see html_ASOS.HTMLNodeText
	 * @generated
	 */
	public Adapter createHTMLNodeTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link html_ASOS.HTMLNodeBlockTag <em>HTML Node Block Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see html_ASOS.HTMLNodeBlockTag
	 * @generated
	 */
	public Adapter createHTMLNodeBlockTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link html_ASOS.HTMLNodeBaseTag <em>HTML Node Base Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see html_ASOS.HTMLNodeBaseTag
	 * @generated
	 */
	public Adapter createHTMLNodeBaseTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link html_ASOS.HTMLNodeAttribute <em>HTML Node Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see html_ASOS.HTMLNodeAttribute
	 * @generated
	 */
	public Adapter createHTMLNodeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link html_ASOS.HTMLNodeEmptyTag <em>HTML Node Empty Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see html_ASOS.HTMLNodeEmptyTag
	 * @generated
	 */
	public Adapter createHTMLNodeEmptyTagAdapter() {
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

} //Html_ASOSAdapterFactory
