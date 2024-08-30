/**
 */
package html_ASOS.util;

import html_ASOS.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see html_ASOS.Html_ASOSPackage
 * @generated
 */
public class Html_ASOSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Html_ASOSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Html_ASOSSwitch() {
		if (modelPackage == null) {
			modelPackage = Html_ASOSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Html_ASOSPackage.HTML_NODE_ROOT: {
			HTMLNodeRoot htmlNodeRoot = (HTMLNodeRoot) theEObject;
			T result = caseHTMLNodeRoot(htmlNodeRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Html_ASOSPackage.HTML_NODE_BASE: {
			HTMLNodeBase htmlNodeBase = (HTMLNodeBase) theEObject;
			T result = caseHTMLNodeBase(htmlNodeBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Html_ASOSPackage.HTML_NODE_TEXT: {
			HTMLNodeText htmlNodeText = (HTMLNodeText) theEObject;
			T result = caseHTMLNodeText(htmlNodeText);
			if (result == null)
				result = caseHTMLNodeBase(htmlNodeText);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Html_ASOSPackage.HTML_NODE_BLOCK_TAG: {
			HTMLNodeBlockTag htmlNodeBlockTag = (HTMLNodeBlockTag) theEObject;
			T result = caseHTMLNodeBlockTag(htmlNodeBlockTag);
			if (result == null)
				result = caseHTMLNodeBaseTag(htmlNodeBlockTag);
			if (result == null)
				result = caseHTMLNodeBase(htmlNodeBlockTag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Html_ASOSPackage.HTML_NODE_BASE_TAG: {
			HTMLNodeBaseTag htmlNodeBaseTag = (HTMLNodeBaseTag) theEObject;
			T result = caseHTMLNodeBaseTag(htmlNodeBaseTag);
			if (result == null)
				result = caseHTMLNodeBase(htmlNodeBaseTag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Html_ASOSPackage.HTML_NODE_ATTRIBUTE: {
			HTMLNodeAttribute htmlNodeAttribute = (HTMLNodeAttribute) theEObject;
			T result = caseHTMLNodeAttribute(htmlNodeAttribute);
			if (result == null)
				result = caseHTMLNodeBase(htmlNodeAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Html_ASOSPackage.HTML_NODE_EMPTY_TAG: {
			HTMLNodeEmptyTag htmlNodeEmptyTag = (HTMLNodeEmptyTag) theEObject;
			T result = caseHTMLNodeEmptyTag(htmlNodeEmptyTag);
			if (result == null)
				result = caseHTMLNodeBaseTag(htmlNodeEmptyTag);
			if (result == null)
				result = caseHTMLNodeBase(htmlNodeEmptyTag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Node Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Node Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLNodeRoot(HTMLNodeRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Node Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Node Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLNodeBase(HTMLNodeBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Node Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Node Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLNodeText(HTMLNodeText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Node Block Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Node Block Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLNodeBlockTag(HTMLNodeBlockTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Node Base Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Node Base Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLNodeBaseTag(HTMLNodeBaseTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Node Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Node Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLNodeAttribute(HTMLNodeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Node Empty Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Node Empty Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLNodeEmptyTag(HTMLNodeEmptyTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Html_ASOSSwitch
