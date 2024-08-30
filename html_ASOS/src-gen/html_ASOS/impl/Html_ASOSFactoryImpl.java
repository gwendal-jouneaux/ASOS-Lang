/**
 */
package html_ASOS.impl;

import html_ASOS.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Html_ASOSFactoryImpl extends EFactoryImpl implements Html_ASOSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Html_ASOSFactory init() {
		try {
			Html_ASOSFactory theHtml_ASOSFactory = (Html_ASOSFactory) EPackage.Registry.INSTANCE
					.getEFactory(Html_ASOSPackage.eNS_URI);
			if (theHtml_ASOSFactory != null) {
				return theHtml_ASOSFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Html_ASOSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Html_ASOSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Html_ASOSPackage.HTML_NODE_ROOT:
			return createHTMLNodeRoot();
		case Html_ASOSPackage.HTML_NODE_TEXT:
			return createHTMLNodeText();
		case Html_ASOSPackage.HTML_NODE_BLOCK_TAG:
			return createHTMLNodeBlockTag();
		case Html_ASOSPackage.HTML_NODE_ATTRIBUTE:
			return createHTMLNodeAttribute();
		case Html_ASOSPackage.HTML_NODE_EMPTY_TAG:
			return createHTMLNodeEmptyTag();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Html_ASOSPackage.ATTRIBUTE_TYPE:
			return createAttributeTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Html_ASOSPackage.ATTRIBUTE_TYPE:
			return convertAttributeTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTMLNodeRoot createHTMLNodeRoot() {
		HTMLNodeRootImpl htmlNodeRoot = new HTMLNodeRootImpl();
		return htmlNodeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTMLNodeText createHTMLNodeText() {
		HTMLNodeTextImpl htmlNodeText = new HTMLNodeTextImpl();
		return htmlNodeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTMLNodeBlockTag createHTMLNodeBlockTag() {
		HTMLNodeBlockTagImpl htmlNodeBlockTag = new HTMLNodeBlockTagImpl();
		return htmlNodeBlockTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTMLNodeAttribute createHTMLNodeAttribute() {
		HTMLNodeAttributeImpl htmlNodeAttribute = new HTMLNodeAttributeImpl();
		return htmlNodeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTMLNodeEmptyTag createHTMLNodeEmptyTag() {
		HTMLNodeEmptyTagImpl htmlNodeEmptyTag = new HTMLNodeEmptyTagImpl();
		return htmlNodeEmptyTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeType result = AttributeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Html_ASOSPackage getHtml_ASOSPackage() {
		return (Html_ASOSPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Html_ASOSPackage getPackage() {
		return Html_ASOSPackage.eINSTANCE;
	}

} //Html_ASOSFactoryImpl
