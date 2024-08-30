/**
 */
package html_ASOS.impl;

import html_ASOS.AttributeType;
import html_ASOS.HTMLNodeAttribute;
import html_ASOS.HTMLNodeBase;
import html_ASOS.HTMLNodeBaseTag;
import html_ASOS.HTMLNodeBlockTag;
import html_ASOS.HTMLNodeEmptyTag;
import html_ASOS.HTMLNodeRoot;
import html_ASOS.HTMLNodeText;
import html_ASOS.Html_ASOSFactory;
import html_ASOS.Html_ASOSPackage;

import html_ASOS.sd.SdPackage;

import html_ASOS.sd.impl.SdPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Html_ASOSPackageImpl extends EPackageImpl implements Html_ASOSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlNodeRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlNodeBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlNodeTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlNodeBlockTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlNodeBaseTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlNodeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlNodeEmptyTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypeEEnum = null;

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
	 * @see html_ASOS.Html_ASOSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Html_ASOSPackageImpl() {
		super(eNS_URI, Html_ASOSFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Html_ASOSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Html_ASOSPackage init() {
		if (isInited)
			return (Html_ASOSPackage) EPackage.Registry.INSTANCE.getEPackage(Html_ASOSPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHtml_ASOSPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Html_ASOSPackageImpl theHtml_ASOSPackage = registeredHtml_ASOSPackage instanceof Html_ASOSPackageImpl
				? (Html_ASOSPackageImpl) registeredHtml_ASOSPackage
				: new Html_ASOSPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SdPackage.eNS_URI);
		SdPackageImpl theSdPackage = (SdPackageImpl) (registeredPackage instanceof SdPackageImpl ? registeredPackage
				: SdPackage.eINSTANCE);

		// Create package meta-data objects
		theHtml_ASOSPackage.createPackageContents();
		theSdPackage.createPackageContents();

		// Initialize created meta-data
		theHtml_ASOSPackage.initializePackageContents();
		theSdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHtml_ASOSPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Html_ASOSPackage.eNS_URI, theHtml_ASOSPackage);
		return theHtml_ASOSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTMLNodeRoot() {
		return htmlNodeRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHTMLNodeRoot_Root() {
		return (EReference) htmlNodeRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTMLNodeBase() {
		return htmlNodeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTMLNodeText() {
		return htmlNodeTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHTMLNodeText_Content() {
		return (EAttribute) htmlNodeTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTMLNodeBlockTag() {
		return htmlNodeBlockTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHTMLNodeBlockTag_Children() {
		return (EReference) htmlNodeBlockTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTMLNodeBaseTag() {
		return htmlNodeBaseTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHTMLNodeBaseTag_Tag() {
		return (EAttribute) htmlNodeBaseTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHTMLNodeBaseTag_Attributes() {
		return (EReference) htmlNodeBaseTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTMLNodeAttribute() {
		return htmlNodeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHTMLNodeAttribute_Name() {
		return (EAttribute) htmlNodeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHTMLNodeAttribute_Value() {
		return (EAttribute) htmlNodeAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHTMLNodeAttribute_Type() {
		return (EAttribute) htmlNodeAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTMLNodeEmptyTag() {
		return htmlNodeEmptyTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAttributeType() {
		return attributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Html_ASOSFactory getHtml_ASOSFactory() {
		return (Html_ASOSFactory) getEFactoryInstance();
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
		htmlNodeRootEClass = createEClass(HTML_NODE_ROOT);
		createEReference(htmlNodeRootEClass, HTML_NODE_ROOT__ROOT);

		htmlNodeBaseEClass = createEClass(HTML_NODE_BASE);

		htmlNodeTextEClass = createEClass(HTML_NODE_TEXT);
		createEAttribute(htmlNodeTextEClass, HTML_NODE_TEXT__CONTENT);

		htmlNodeBlockTagEClass = createEClass(HTML_NODE_BLOCK_TAG);
		createEReference(htmlNodeBlockTagEClass, HTML_NODE_BLOCK_TAG__CHILDREN);

		htmlNodeBaseTagEClass = createEClass(HTML_NODE_BASE_TAG);
		createEAttribute(htmlNodeBaseTagEClass, HTML_NODE_BASE_TAG__TAG);
		createEReference(htmlNodeBaseTagEClass, HTML_NODE_BASE_TAG__ATTRIBUTES);

		htmlNodeAttributeEClass = createEClass(HTML_NODE_ATTRIBUTE);
		createEAttribute(htmlNodeAttributeEClass, HTML_NODE_ATTRIBUTE__NAME);
		createEAttribute(htmlNodeAttributeEClass, HTML_NODE_ATTRIBUTE__VALUE);
		createEAttribute(htmlNodeAttributeEClass, HTML_NODE_ATTRIBUTE__TYPE);

		htmlNodeEmptyTagEClass = createEClass(HTML_NODE_EMPTY_TAG);

		// Create enums
		attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
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
		SdPackage theSdPackage = (SdPackage) EPackage.Registry.INSTANCE.getEPackage(SdPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSdPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		htmlNodeTextEClass.getESuperTypes().add(this.getHTMLNodeBase());
		htmlNodeBlockTagEClass.getESuperTypes().add(this.getHTMLNodeBaseTag());
		htmlNodeBaseTagEClass.getESuperTypes().add(this.getHTMLNodeBase());
		htmlNodeAttributeEClass.getESuperTypes().add(this.getHTMLNodeBase());
		htmlNodeEmptyTagEClass.getESuperTypes().add(this.getHTMLNodeBaseTag());

		// Initialize classes, features, and operations; add parameters
		initEClass(htmlNodeRootEClass, HTMLNodeRoot.class, "HTMLNodeRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHTMLNodeRoot_Root(), this.getHTMLNodeBase(), null, "root", null, 1, 1, HTMLNodeRoot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlNodeBaseEClass, HTMLNodeBase.class, "HTMLNodeBase", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(htmlNodeTextEClass, HTMLNodeText.class, "HTMLNodeText", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTMLNodeText_Content(), ecorePackage.getEString(), "content", null, 0, 1, HTMLNodeText.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlNodeBlockTagEClass, HTMLNodeBlockTag.class, "HTMLNodeBlockTag", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHTMLNodeBlockTag_Children(), this.getHTMLNodeBase(), null, "children", null, 0, -1,
				HTMLNodeBlockTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlNodeBaseTagEClass, HTMLNodeBaseTag.class, "HTMLNodeBaseTag", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTMLNodeBaseTag_Tag(), ecorePackage.getEString(), "tag", null, 1, 1, HTMLNodeBaseTag.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTMLNodeBaseTag_Attributes(), this.getHTMLNodeAttribute(), null, "attributes", null, 0, -1,
				HTMLNodeBaseTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlNodeAttributeEClass, HTMLNodeAttribute.class, "HTMLNodeAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTMLNodeAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				HTMLNodeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTMLNodeAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				HTMLNodeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTMLNodeAttribute_Type(), this.getAttributeType(), "type", null, 0, 1,
				HTMLNodeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(htmlNodeEmptyTagEClass, HTMLNodeEmptyTag.class, "HTMLNodeEmptyTag", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
		addEEnumLiteral(attributeTypeEEnum, AttributeType.DOUBLE_QUOTED);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.UNQUOTED);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.SIMPLE_QUOTED);

		// Create resource
		createResource(eNS_URI);
	}

} //Html_ASOSPackageImpl
