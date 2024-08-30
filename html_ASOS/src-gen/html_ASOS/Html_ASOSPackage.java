/**
 */
package html_ASOS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see html_ASOS.Html_ASOSFactory
 * @model kind="package"
 * @generated
 */
public interface Html_ASOSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "html_ASOS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/html_ASOS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "html_ASOS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Html_ASOSPackage eINSTANCE = html_ASOS.impl.Html_ASOSPackageImpl.init();

	/**
	 * The meta object id for the '{@link html_ASOS.impl.HTMLNodeRootImpl <em>HTML Node Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see html_ASOS.impl.HTMLNodeRootImpl
	 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeRoot()
	 * @generated
	 */
	int HTML_NODE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_ROOT__ROOT = 0;

	/**
	 * The number of structural features of the '<em>HTML Node Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>HTML Node Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link html_ASOS.HTMLNodeBase <em>HTML Node Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see html_ASOS.HTMLNodeBase
	 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeBase()
	 * @generated
	 */
	int HTML_NODE_BASE = 1;

	/**
	 * The number of structural features of the '<em>HTML Node Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>HTML Node Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link html_ASOS.impl.HTMLNodeTextImpl <em>HTML Node Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see html_ASOS.impl.HTMLNodeTextImpl
	 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeText()
	 * @generated
	 */
	int HTML_NODE_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_TEXT__CONTENT = HTML_NODE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HTML Node Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_TEXT_FEATURE_COUNT = HTML_NODE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HTML Node Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_TEXT_OPERATION_COUNT = HTML_NODE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link html_ASOS.HTMLNodeBaseTag <em>HTML Node Base Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see html_ASOS.HTMLNodeBaseTag
	 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeBaseTag()
	 * @generated
	 */
	int HTML_NODE_BASE_TAG = 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_BASE_TAG__TAG = HTML_NODE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_BASE_TAG__ATTRIBUTES = HTML_NODE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HTML Node Base Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_BASE_TAG_FEATURE_COUNT = HTML_NODE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>HTML Node Base Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_BASE_TAG_OPERATION_COUNT = HTML_NODE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link html_ASOS.impl.HTMLNodeBlockTagImpl <em>HTML Node Block Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see html_ASOS.impl.HTMLNodeBlockTagImpl
	 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeBlockTag()
	 * @generated
	 */
	int HTML_NODE_BLOCK_TAG = 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_BLOCK_TAG__TAG = HTML_NODE_BASE_TAG__TAG;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_BLOCK_TAG__ATTRIBUTES = HTML_NODE_BASE_TAG__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_BLOCK_TAG__CHILDREN = HTML_NODE_BASE_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HTML Node Block Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_BLOCK_TAG_FEATURE_COUNT = HTML_NODE_BASE_TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HTML Node Block Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_BLOCK_TAG_OPERATION_COUNT = HTML_NODE_BASE_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link html_ASOS.impl.HTMLNodeAttributeImpl <em>HTML Node Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see html_ASOS.impl.HTMLNodeAttributeImpl
	 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeAttribute()
	 * @generated
	 */
	int HTML_NODE_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_ATTRIBUTE__NAME = HTML_NODE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_ATTRIBUTE__VALUE = HTML_NODE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_ATTRIBUTE__TYPE = HTML_NODE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HTML Node Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_ATTRIBUTE_FEATURE_COUNT = HTML_NODE_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>HTML Node Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_ATTRIBUTE_OPERATION_COUNT = HTML_NODE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link html_ASOS.impl.HTMLNodeEmptyTagImpl <em>HTML Node Empty Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see html_ASOS.impl.HTMLNodeEmptyTagImpl
	 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeEmptyTag()
	 * @generated
	 */
	int HTML_NODE_EMPTY_TAG = 6;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_EMPTY_TAG__TAG = HTML_NODE_BASE_TAG__TAG;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_EMPTY_TAG__ATTRIBUTES = HTML_NODE_BASE_TAG__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>HTML Node Empty Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_EMPTY_TAG_FEATURE_COUNT = HTML_NODE_BASE_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HTML Node Empty Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_NODE_EMPTY_TAG_OPERATION_COUNT = HTML_NODE_BASE_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link html_ASOS.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see html_ASOS.AttributeType
	 * @see html_ASOS.impl.Html_ASOSPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 7;

	/**
	 * Returns the meta object for class '{@link html_ASOS.HTMLNodeRoot <em>HTML Node Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Node Root</em>'.
	 * @see html_ASOS.HTMLNodeRoot
	 * @generated
	 */
	EClass getHTMLNodeRoot();

	/**
	 * Returns the meta object for the containment reference '{@link html_ASOS.HTMLNodeRoot#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see html_ASOS.HTMLNodeRoot#getRoot()
	 * @see #getHTMLNodeRoot()
	 * @generated
	 */
	EReference getHTMLNodeRoot_Root();

	/**
	 * Returns the meta object for class '{@link html_ASOS.HTMLNodeBase <em>HTML Node Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Node Base</em>'.
	 * @see html_ASOS.HTMLNodeBase
	 * @generated
	 */
	EClass getHTMLNodeBase();

	/**
	 * Returns the meta object for class '{@link html_ASOS.HTMLNodeText <em>HTML Node Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Node Text</em>'.
	 * @see html_ASOS.HTMLNodeText
	 * @generated
	 */
	EClass getHTMLNodeText();

	/**
	 * Returns the meta object for the attribute '{@link html_ASOS.HTMLNodeText#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see html_ASOS.HTMLNodeText#getContent()
	 * @see #getHTMLNodeText()
	 * @generated
	 */
	EAttribute getHTMLNodeText_Content();

	/**
	 * Returns the meta object for class '{@link html_ASOS.HTMLNodeBlockTag <em>HTML Node Block Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Node Block Tag</em>'.
	 * @see html_ASOS.HTMLNodeBlockTag
	 * @generated
	 */
	EClass getHTMLNodeBlockTag();

	/**
	 * Returns the meta object for the containment reference list '{@link html_ASOS.HTMLNodeBlockTag#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see html_ASOS.HTMLNodeBlockTag#getChildren()
	 * @see #getHTMLNodeBlockTag()
	 * @generated
	 */
	EReference getHTMLNodeBlockTag_Children();

	/**
	 * Returns the meta object for class '{@link html_ASOS.HTMLNodeBaseTag <em>HTML Node Base Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Node Base Tag</em>'.
	 * @see html_ASOS.HTMLNodeBaseTag
	 * @generated
	 */
	EClass getHTMLNodeBaseTag();

	/**
	 * Returns the meta object for the attribute '{@link html_ASOS.HTMLNodeBaseTag#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see html_ASOS.HTMLNodeBaseTag#getTag()
	 * @see #getHTMLNodeBaseTag()
	 * @generated
	 */
	EAttribute getHTMLNodeBaseTag_Tag();

	/**
	 * Returns the meta object for the containment reference list '{@link html_ASOS.HTMLNodeBaseTag#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see html_ASOS.HTMLNodeBaseTag#getAttributes()
	 * @see #getHTMLNodeBaseTag()
	 * @generated
	 */
	EReference getHTMLNodeBaseTag_Attributes();

	/**
	 * Returns the meta object for class '{@link html_ASOS.HTMLNodeAttribute <em>HTML Node Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Node Attribute</em>'.
	 * @see html_ASOS.HTMLNodeAttribute
	 * @generated
	 */
	EClass getHTMLNodeAttribute();

	/**
	 * Returns the meta object for the attribute '{@link html_ASOS.HTMLNodeAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see html_ASOS.HTMLNodeAttribute#getName()
	 * @see #getHTMLNodeAttribute()
	 * @generated
	 */
	EAttribute getHTMLNodeAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link html_ASOS.HTMLNodeAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see html_ASOS.HTMLNodeAttribute#getValue()
	 * @see #getHTMLNodeAttribute()
	 * @generated
	 */
	EAttribute getHTMLNodeAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link html_ASOS.HTMLNodeAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see html_ASOS.HTMLNodeAttribute#getType()
	 * @see #getHTMLNodeAttribute()
	 * @generated
	 */
	EAttribute getHTMLNodeAttribute_Type();

	/**
	 * Returns the meta object for class '{@link html_ASOS.HTMLNodeEmptyTag <em>HTML Node Empty Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Node Empty Tag</em>'.
	 * @see html_ASOS.HTMLNodeEmptyTag
	 * @generated
	 */
	EClass getHTMLNodeEmptyTag();

	/**
	 * Returns the meta object for enum '{@link html_ASOS.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see html_ASOS.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Html_ASOSFactory getHtml_ASOSFactory();

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
		 * The meta object literal for the '{@link html_ASOS.impl.HTMLNodeRootImpl <em>HTML Node Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see html_ASOS.impl.HTMLNodeRootImpl
		 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeRoot()
		 * @generated
		 */
		EClass HTML_NODE_ROOT = eINSTANCE.getHTMLNodeRoot();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_NODE_ROOT__ROOT = eINSTANCE.getHTMLNodeRoot_Root();

		/**
		 * The meta object literal for the '{@link html_ASOS.HTMLNodeBase <em>HTML Node Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see html_ASOS.HTMLNodeBase
		 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeBase()
		 * @generated
		 */
		EClass HTML_NODE_BASE = eINSTANCE.getHTMLNodeBase();

		/**
		 * The meta object literal for the '{@link html_ASOS.impl.HTMLNodeTextImpl <em>HTML Node Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see html_ASOS.impl.HTMLNodeTextImpl
		 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeText()
		 * @generated
		 */
		EClass HTML_NODE_TEXT = eINSTANCE.getHTMLNodeText();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_NODE_TEXT__CONTENT = eINSTANCE.getHTMLNodeText_Content();

		/**
		 * The meta object literal for the '{@link html_ASOS.impl.HTMLNodeBlockTagImpl <em>HTML Node Block Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see html_ASOS.impl.HTMLNodeBlockTagImpl
		 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeBlockTag()
		 * @generated
		 */
		EClass HTML_NODE_BLOCK_TAG = eINSTANCE.getHTMLNodeBlockTag();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_NODE_BLOCK_TAG__CHILDREN = eINSTANCE.getHTMLNodeBlockTag_Children();

		/**
		 * The meta object literal for the '{@link html_ASOS.HTMLNodeBaseTag <em>HTML Node Base Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see html_ASOS.HTMLNodeBaseTag
		 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeBaseTag()
		 * @generated
		 */
		EClass HTML_NODE_BASE_TAG = eINSTANCE.getHTMLNodeBaseTag();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_NODE_BASE_TAG__TAG = eINSTANCE.getHTMLNodeBaseTag_Tag();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_NODE_BASE_TAG__ATTRIBUTES = eINSTANCE.getHTMLNodeBaseTag_Attributes();

		/**
		 * The meta object literal for the '{@link html_ASOS.impl.HTMLNodeAttributeImpl <em>HTML Node Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see html_ASOS.impl.HTMLNodeAttributeImpl
		 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeAttribute()
		 * @generated
		 */
		EClass HTML_NODE_ATTRIBUTE = eINSTANCE.getHTMLNodeAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_NODE_ATTRIBUTE__NAME = eINSTANCE.getHTMLNodeAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_NODE_ATTRIBUTE__VALUE = eINSTANCE.getHTMLNodeAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_NODE_ATTRIBUTE__TYPE = eINSTANCE.getHTMLNodeAttribute_Type();

		/**
		 * The meta object literal for the '{@link html_ASOS.impl.HTMLNodeEmptyTagImpl <em>HTML Node Empty Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see html_ASOS.impl.HTMLNodeEmptyTagImpl
		 * @see html_ASOS.impl.Html_ASOSPackageImpl#getHTMLNodeEmptyTag()
		 * @generated
		 */
		EClass HTML_NODE_EMPTY_TAG = eINSTANCE.getHTMLNodeEmptyTag();

		/**
		 * The meta object literal for the '{@link html_ASOS.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see html_ASOS.AttributeType
		 * @see html_ASOS.impl.Html_ASOSPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

	}

} //Html_ASOSPackage
