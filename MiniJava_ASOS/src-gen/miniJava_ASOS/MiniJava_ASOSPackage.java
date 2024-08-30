/**
 */
package miniJava_ASOS;

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
 * @see miniJava_ASOS.MiniJava_ASOSFactory
 * @model kind="package"
 * @generated
 */
public interface MiniJava_ASOSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "miniJava_ASOS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/miniJava_ASOS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "miniJava_ASOS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiniJava_ASOSPackage eINSTANCE = miniJava_ASOS.impl.MiniJava_ASOSPackageImpl.init();

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.ProgramImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CLASSES = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STATE = 3;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.ImportImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.NamedElement
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.TypeDeclarationImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getTypeDeclaration()
	 * @generated
	 */
	int TYPE_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ACCESS_LEVEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementz</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__IMPLEMENTZ = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__MEMBERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.ClazzImpl <em>Clazz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.ClazzImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getClazz()
	 * @generated
	 */
	int CLAZZ = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__NAME = TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__ACCESS_LEVEL = TYPE_DECLARATION__ACCESS_LEVEL;

	/**
	 * The feature id for the '<em><b>Implementz</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__IMPLEMENTZ = TYPE_DECLARATION__IMPLEMENTZ;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__MEMBERS = TYPE_DECLARATION__MEMBERS;

	/**
	 * The feature id for the '<em><b>Isabstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__ISABSTRACT = TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__SUPER_CLASS = TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_OPERATION_COUNT = TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.InterfaceImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ACCESS_LEVEL = TYPE_DECLARATION__ACCESS_LEVEL;

	/**
	 * The feature id for the '<em><b>Implementz</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IMPLEMENTZ = TYPE_DECLARATION__IMPLEMENTZ;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MEMBERS = TYPE_DECLARATION__MEMBERS;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.TypedDeclaration <em>Typed Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.TypedDeclaration
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getTypedDeclaration()
	 * @generated
	 */
	int TYPED_DECLARATION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DECLARATION__TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_DECLARATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.MemberImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = TYPED_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__TYPE_REF = TYPED_DECLARATION__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ACCESS = TYPED_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = TYPED_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = TYPED_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.MethodImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TYPE_REF = MEMBER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ACCESS = MEMBER__ACCESS;

	/**
	 * The feature id for the '<em><b>Isabstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ISABSTRACT = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Isstatic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ISSTATIC = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMS = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BODY = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.Symbol <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.Symbol
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__NAME = TYPED_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__TYPE_REF = TYPED_DECLARATION__TYPE_REF;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = TYPED_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_OPERATION_COUNT = TYPED_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.ParameterImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_REF = SYMBOL__TYPE_REF;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.FieldImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE_REF = MEMBER__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ACCESS = MEMBER__ACCESS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DEFAULT_VALUE = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.Statement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.Statement
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 10;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.BlockImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.PrintStatementImpl <em>Print Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.PrintStatementImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getPrintStatement()
	 * @generated
	 */
	int PRINT_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Print Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.Expression
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 27;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.LoadImageImpl <em>Load Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.LoadImageImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getLoadImage()
	 * @generated
	 */
	int LOAD_IMAGE = 12;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_IMAGE__PATH = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_IMAGE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Load Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_IMAGE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.WriteImageImpl <em>Write Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.WriteImageImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getWriteImage()
	 * @generated
	 */
	int WRITE_IMAGE = 13;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_IMAGE__PATH = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_IMAGE__IMAGE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Write Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_IMAGE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Write Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_IMAGE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.ReturnImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 14;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.IfStatementImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN_BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_BLOCK = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.WhileStatementImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 16;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.ForStatementImpl <em>For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.ForStatementImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 17;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__DECLARATION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Progression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__PROGRESSION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.TypeRef <em>Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.TypeRef
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getTypeRef()
	 * @generated
	 */
	int TYPE_REF = 18;

	/**
	 * The number of structural features of the '<em>Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.SingleTypeRef <em>Single Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.SingleTypeRef
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSingleTypeRef()
	 * @generated
	 */
	int SINGLE_TYPE_REF = 19;

	/**
	 * The number of structural features of the '<em>Single Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPE_REF_FEATURE_COUNT = TYPE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPE_REF_OPERATION_COUNT = TYPE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.ClassRefImpl <em>Class Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.ClassRefImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getClassRef()
	 * @generated
	 */
	int CLASS_REF = 20;

	/**
	 * The feature id for the '<em><b>Referenced Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF__REFERENCED_CLASS = SINGLE_TYPE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF_FEATURE_COUNT = SINGLE_TYPE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF_OPERATION_COUNT = SINGLE_TYPE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.VariableDeclarationImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__TYPE_REF = SYMBOL__TYPE_REF;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.AssignmentImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 25;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ASSIGNEE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.AssigneeImpl <em>Assignee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.AssigneeImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getAssignee()
	 * @generated
	 */
	int ASSIGNEE = 26;

	/**
	 * The number of structural features of the '<em>Assignee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Assignee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.ArrayTypeRefImpl <em>Array Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.ArrayTypeRefImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getArrayTypeRef()
	 * @generated
	 */
	int ARRAY_TYPE_REF = 28;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REF__TYPE_REF = SINGLE_TYPE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REF_FEATURE_COUNT = SINGLE_TYPE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_REF_OPERATION_COUNT = SINGLE_TYPE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.IntegerTypeRefImpl <em>Integer Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.IntegerTypeRefImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getIntegerTypeRef()
	 * @generated
	 */
	int INTEGER_TYPE_REF = 29;

	/**
	 * The number of structural features of the '<em>Integer Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_REF_FEATURE_COUNT = SINGLE_TYPE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_REF_OPERATION_COUNT = SINGLE_TYPE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.BooleanTypeRefImpl <em>Boolean Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.BooleanTypeRefImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getBooleanTypeRef()
	 * @generated
	 */
	int BOOLEAN_TYPE_REF = 30;

	/**
	 * The number of structural features of the '<em>Boolean Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_REF_FEATURE_COUNT = SINGLE_TYPE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_REF_OPERATION_COUNT = SINGLE_TYPE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.StringTypeRefImpl <em>String Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.StringTypeRefImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getStringTypeRef()
	 * @generated
	 */
	int STRING_TYPE_REF = 31;

	/**
	 * The number of structural features of the '<em>String Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_REF_FEATURE_COUNT = SINGLE_TYPE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_REF_OPERATION_COUNT = SINGLE_TYPE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.VoidTypeRefImpl <em>Void Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.VoidTypeRefImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getVoidTypeRef()
	 * @generated
	 */
	int VOID_TYPE_REF = 32;

	/**
	 * The number of structural features of the '<em>Void Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_REF_FEATURE_COUNT = SINGLE_TYPE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_REF_OPERATION_COUNT = SINGLE_TYPE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.OrImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getOr()
	 * @generated
	 */
	int OR = 33;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.AndImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 34;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.EqualityImpl <em>Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.EqualityImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getEquality()
	 * @generated
	 */
	int EQUALITY = 35;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.InequalityImpl <em>Inequality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.InequalityImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getInequality()
	 * @generated
	 */
	int INEQUALITY = 36;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inequality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inequality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.SuperiorOrEqualImpl <em>Superior Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.SuperiorOrEqualImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSuperiorOrEqual()
	 * @generated
	 */
	int SUPERIOR_OR_EQUAL = 37;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERIOR_OR_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERIOR_OR_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Superior Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERIOR_OR_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Superior Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERIOR_OR_EQUAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.InferiorOrEqualImpl <em>Inferior Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.InferiorOrEqualImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getInferiorOrEqual()
	 * @generated
	 */
	int INFERIOR_OR_EQUAL = 38;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERIOR_OR_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERIOR_OR_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inferior Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERIOR_OR_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inferior Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERIOR_OR_EQUAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.SuperiorImpl <em>Superior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.SuperiorImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSuperior()
	 * @generated
	 */
	int SUPERIOR = 39;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERIOR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERIOR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Superior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERIOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Superior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERIOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.InferiorImpl <em>Inferior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.InferiorImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getInferior()
	 * @generated
	 */
	int INFERIOR = 40;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERIOR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERIOR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inferior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERIOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inferior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERIOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.PlusImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 41;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.MinusImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 42;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.MultiplicationImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 43;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.DivisionImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 44;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.ArrayAccessImpl <em>Array Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.ArrayAccessImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getArrayAccess()
	 * @generated
	 */
	int ARRAY_ACCESS = 45;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__INDEX = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.ArrayLengthImpl <em>Array Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.ArrayLengthImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getArrayLength()
	 * @generated
	 */
	int ARRAY_LENGTH = 46;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH__ARRAY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.NotImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 47;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.NegImpl <em>Neg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.NegImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getNeg()
	 * @generated
	 */
	int NEG = 48;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.FieldAccessImpl <em>Field Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.FieldAccessImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getFieldAccess()
	 * @generated
	 */
	int FIELD_ACCESS = 49;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS__RECEIVER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS__FIELD = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.MethodCallImpl <em>Method Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.MethodCallImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getMethodCall()
	 * @generated
	 */
	int METHOD_CALL = 50;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__RECEIVER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__METHOD = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__ARGS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.StringConstantImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 51;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.IntConstantImpl <em>Int Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.IntConstantImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getIntConstant()
	 * @generated
	 */
	int INT_CONSTANT = 52;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.BoolConstantImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getBoolConstant()
	 * @generated
	 */
	int BOOL_CONSTANT = 53;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.ThisImpl <em>This</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.ThisImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getThis()
	 * @generated
	 */
	int THIS = 54;

	/**
	 * The number of structural features of the '<em>This</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>This</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.SuperImpl <em>Super</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.SuperImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSuper()
	 * @generated
	 */
	int SUPER = 55;

	/**
	 * The number of structural features of the '<em>Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.NullImpl <em>Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.NullImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getNull()
	 * @generated
	 */
	int NULL = 56;

	/**
	 * The number of structural features of the '<em>Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.NewObjectImpl <em>New Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.NewObjectImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getNewObject()
	 * @generated
	 */
	int NEW_OBJECT = 57;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_OBJECT__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_OBJECT__ARGS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>New Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_OBJECT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>New Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_OBJECT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.NewArrayImpl <em>New Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.NewArrayImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getNewArray()
	 * @generated
	 */
	int NEW_ARRAY = 58;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ARRAY__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ARRAY__SIZE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>New Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ARRAY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>New Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ARRAY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.SymbolRefImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSymbolRef()
	 * @generated
	 */
	int SYMBOL_REF = 59;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_REF__SYMBOL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbol Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Symbol Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.ModuloImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 60;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.SqrtImpl <em>Sqrt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.SqrtImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSqrt()
	 * @generated
	 */
	int SQRT = 61;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQRT__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqrt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQRT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqrt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQRT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.impl.BinOpImpl <em>Bin Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.impl.BinOpImpl
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getBinOp()
	 * @generated
	 */
	int BIN_OP = 62;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP__RIGHT = 1;

	/**
	 * The number of structural features of the '<em>Bin Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bin Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniJava_ASOS.AccessLevel <em>Access Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniJava_ASOS.AccessLevel
	 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getAccessLevel()
	 * @generated
	 */
	int ACCESS_LEVEL = 63;

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see miniJava_ASOS.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see miniJava_ASOS.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link miniJava_ASOS.Program#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see miniJava_ASOS.Program#getImports()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link miniJava_ASOS.Program#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see miniJava_ASOS.Program#getClasses()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Classes();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.Program#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see miniJava_ASOS.Program#getState()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_State();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see miniJava_ASOS.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see miniJava_ASOS.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see miniJava_ASOS.TypeDeclaration
	 * @generated
	 */
	EClass getTypeDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.TypeDeclaration#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see miniJava_ASOS.TypeDeclaration#getAccessLevel()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EAttribute getTypeDeclaration_AccessLevel();

	/**
	 * Returns the meta object for the reference list '{@link miniJava_ASOS.TypeDeclaration#getImplementz <em>Implementz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implementz</em>'.
	 * @see miniJava_ASOS.TypeDeclaration#getImplementz()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EReference getTypeDeclaration_Implementz();

	/**
	 * Returns the meta object for the containment reference list '{@link miniJava_ASOS.TypeDeclaration#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see miniJava_ASOS.TypeDeclaration#getMembers()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EReference getTypeDeclaration_Members();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Clazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clazz</em>'.
	 * @see miniJava_ASOS.Clazz
	 * @generated
	 */
	EClass getClazz();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.Clazz#isIsabstract <em>Isabstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isabstract</em>'.
	 * @see miniJava_ASOS.Clazz#isIsabstract()
	 * @see #getClazz()
	 * @generated
	 */
	EAttribute getClazz_Isabstract();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.Clazz#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Class</em>'.
	 * @see miniJava_ASOS.Clazz#getSuperClass()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_SuperClass();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see miniJava_ASOS.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see miniJava_ASOS.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.Member#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see miniJava_ASOS.Member#getAccess()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Access();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see miniJava_ASOS.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.Method#isIsabstract <em>Isabstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isabstract</em>'.
	 * @see miniJava_ASOS.Method#isIsabstract()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Isabstract();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.Method#isIsstatic <em>Isstatic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isstatic</em>'.
	 * @see miniJava_ASOS.Method#isIsstatic()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Isstatic();

	/**
	 * Returns the meta object for the containment reference list '{@link miniJava_ASOS.Method#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see miniJava_ASOS.Method#getParams()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Params();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.Method#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see miniJava_ASOS.Method#getBody()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Body();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see miniJava_ASOS.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see miniJava_ASOS.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.Field#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see miniJava_ASOS.Field#getDefaultValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_DefaultValue();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see miniJava_ASOS.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link miniJava_ASOS.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see miniJava_ASOS.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see miniJava_ASOS.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.PrintStatement <em>Print Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print Statement</em>'.
	 * @see miniJava_ASOS.PrintStatement
	 * @generated
	 */
	EClass getPrintStatement();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.PrintStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see miniJava_ASOS.PrintStatement#getExpression()
	 * @see #getPrintStatement()
	 * @generated
	 */
	EReference getPrintStatement_Expression();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.LoadImage <em>Load Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Image</em>'.
	 * @see miniJava_ASOS.LoadImage
	 * @generated
	 */
	EClass getLoadImage();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.LoadImage#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see miniJava_ASOS.LoadImage#getPath()
	 * @see #getLoadImage()
	 * @generated
	 */
	EReference getLoadImage_Path();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.WriteImage <em>Write Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Image</em>'.
	 * @see miniJava_ASOS.WriteImage
	 * @generated
	 */
	EClass getWriteImage();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.WriteImage#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see miniJava_ASOS.WriteImage#getPath()
	 * @see #getWriteImage()
	 * @generated
	 */
	EReference getWriteImage_Path();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.WriteImage#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see miniJava_ASOS.WriteImage#getImage()
	 * @see #getWriteImage()
	 * @generated
	 */
	EReference getWriteImage_Image();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see miniJava_ASOS.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.Return#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see miniJava_ASOS.Return#getExpression()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Expression();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see miniJava_ASOS.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.IfStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see miniJava_ASOS.IfStatement#getExpression()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.IfStatement#getThenBlock <em>Then Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Block</em>'.
	 * @see miniJava_ASOS.IfStatement#getThenBlock()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ThenBlock();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.IfStatement#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Block</em>'.
	 * @see miniJava_ASOS.IfStatement#getElseBlock()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseBlock();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see miniJava_ASOS.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.WhileStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see miniJava_ASOS.WhileStatement#getCondition()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.WhileStatement#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see miniJava_ASOS.WhileStatement#getBlock()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Block();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see miniJava_ASOS.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.ForStatement#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declaration</em>'.
	 * @see miniJava_ASOS.ForStatement#getDeclaration()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Declaration();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.ForStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see miniJava_ASOS.ForStatement#getCondition()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.ForStatement#getProgression <em>Progression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Progression</em>'.
	 * @see miniJava_ASOS.ForStatement#getProgression()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Progression();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.ForStatement#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see miniJava_ASOS.ForStatement#getBlock()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Block();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Ref</em>'.
	 * @see miniJava_ASOS.TypeRef
	 * @generated
	 */
	EClass getTypeRef();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.SingleTypeRef <em>Single Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Type Ref</em>'.
	 * @see miniJava_ASOS.SingleTypeRef
	 * @generated
	 */
	EClass getSingleTypeRef();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.ClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Ref</em>'.
	 * @see miniJava_ASOS.ClassRef
	 * @generated
	 */
	EClass getClassRef();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.ClassRef#getReferencedClass <em>Referenced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Class</em>'.
	 * @see miniJava_ASOS.ClassRef#getReferencedClass()
	 * @see #getClassRef()
	 * @generated
	 */
	EReference getClassRef_ReferencedClass();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see miniJava_ASOS.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see miniJava_ASOS.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.TypedDeclaration <em>Typed Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Declaration</em>'.
	 * @see miniJava_ASOS.TypedDeclaration
	 * @generated
	 */
	EClass getTypedDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.TypedDeclaration#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Ref</em>'.
	 * @see miniJava_ASOS.TypedDeclaration#getTypeRef()
	 * @see #getTypedDeclaration()
	 * @generated
	 */
	EReference getTypedDeclaration_TypeRef();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see miniJava_ASOS.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see miniJava_ASOS.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see miniJava_ASOS.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.Assignment#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignee</em>'.
	 * @see miniJava_ASOS.Assignment#getAssignee()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Assignee();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.Assignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see miniJava_ASOS.Assignment#getValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Value();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Assignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignee</em>'.
	 * @see miniJava_ASOS.Assignee
	 * @generated
	 */
	EClass getAssignee();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see miniJava_ASOS.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.ArrayTypeRef <em>Array Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type Ref</em>'.
	 * @see miniJava_ASOS.ArrayTypeRef
	 * @generated
	 */
	EClass getArrayTypeRef();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.ArrayTypeRef#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Ref</em>'.
	 * @see miniJava_ASOS.ArrayTypeRef#getTypeRef()
	 * @see #getArrayTypeRef()
	 * @generated
	 */
	EReference getArrayTypeRef_TypeRef();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.IntegerTypeRef <em>Integer Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type Ref</em>'.
	 * @see miniJava_ASOS.IntegerTypeRef
	 * @generated
	 */
	EClass getIntegerTypeRef();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.BooleanTypeRef <em>Boolean Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type Ref</em>'.
	 * @see miniJava_ASOS.BooleanTypeRef
	 * @generated
	 */
	EClass getBooleanTypeRef();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.StringTypeRef <em>String Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type Ref</em>'.
	 * @see miniJava_ASOS.StringTypeRef
	 * @generated
	 */
	EClass getStringTypeRef();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.VoidTypeRef <em>Void Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type Ref</em>'.
	 * @see miniJava_ASOS.VoidTypeRef
	 * @generated
	 */
	EClass getVoidTypeRef();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see miniJava_ASOS.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see miniJava_ASOS.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality</em>'.
	 * @see miniJava_ASOS.Equality
	 * @generated
	 */
	EClass getEquality();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Inequality <em>Inequality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inequality</em>'.
	 * @see miniJava_ASOS.Inequality
	 * @generated
	 */
	EClass getInequality();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.SuperiorOrEqual <em>Superior Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Superior Or Equal</em>'.
	 * @see miniJava_ASOS.SuperiorOrEqual
	 * @generated
	 */
	EClass getSuperiorOrEqual();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.InferiorOrEqual <em>Inferior Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inferior Or Equal</em>'.
	 * @see miniJava_ASOS.InferiorOrEqual
	 * @generated
	 */
	EClass getInferiorOrEqual();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Superior <em>Superior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Superior</em>'.
	 * @see miniJava_ASOS.Superior
	 * @generated
	 */
	EClass getSuperior();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Inferior <em>Inferior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inferior</em>'.
	 * @see miniJava_ASOS.Inferior
	 * @generated
	 */
	EClass getInferior();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see miniJava_ASOS.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see miniJava_ASOS.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see miniJava_ASOS.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see miniJava_ASOS.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.ArrayAccess <em>Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Access</em>'.
	 * @see miniJava_ASOS.ArrayAccess
	 * @generated
	 */
	EClass getArrayAccess();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.ArrayAccess#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see miniJava_ASOS.ArrayAccess#getObject()
	 * @see #getArrayAccess()
	 * @generated
	 */
	EReference getArrayAccess_Object();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.ArrayAccess#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see miniJava_ASOS.ArrayAccess#getIndex()
	 * @see #getArrayAccess()
	 * @generated
	 */
	EReference getArrayAccess_Index();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.ArrayLength <em>Array Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Length</em>'.
	 * @see miniJava_ASOS.ArrayLength
	 * @generated
	 */
	EClass getArrayLength();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.ArrayLength#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see miniJava_ASOS.ArrayLength#getArray()
	 * @see #getArrayLength()
	 * @generated
	 */
	EReference getArrayLength_Array();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see miniJava_ASOS.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.Not#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see miniJava_ASOS.Not#getExpression()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Expression();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Neg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neg</em>'.
	 * @see miniJava_ASOS.Neg
	 * @generated
	 */
	EClass getNeg();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.Neg#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see miniJava_ASOS.Neg#getExpression()
	 * @see #getNeg()
	 * @generated
	 */
	EReference getNeg_Expression();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.FieldAccess <em>Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Access</em>'.
	 * @see miniJava_ASOS.FieldAccess
	 * @generated
	 */
	EClass getFieldAccess();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.FieldAccess#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiver</em>'.
	 * @see miniJava_ASOS.FieldAccess#getReceiver()
	 * @see #getFieldAccess()
	 * @generated
	 */
	EReference getFieldAccess_Receiver();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.FieldAccess#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see miniJava_ASOS.FieldAccess#getField()
	 * @see #getFieldAccess()
	 * @generated
	 */
	EReference getFieldAccess_Field();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call</em>'.
	 * @see miniJava_ASOS.MethodCall
	 * @generated
	 */
	EClass getMethodCall();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.MethodCall#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiver</em>'.
	 * @see miniJava_ASOS.MethodCall#getReceiver()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Receiver();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.MethodCall#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see miniJava_ASOS.MethodCall#getMethod()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link miniJava_ASOS.MethodCall#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see miniJava_ASOS.MethodCall#getArgs()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Args();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see miniJava_ASOS.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see miniJava_ASOS.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Constant</em>'.
	 * @see miniJava_ASOS.IntConstant
	 * @generated
	 */
	EClass getIntConstant();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.IntConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see miniJava_ASOS.IntConstant#getValue()
	 * @see #getIntConstant()
	 * @generated
	 */
	EAttribute getIntConstant_Value();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Constant</em>'.
	 * @see miniJava_ASOS.BoolConstant
	 * @generated
	 */
	EClass getBoolConstant();

	/**
	 * Returns the meta object for the attribute '{@link miniJava_ASOS.BoolConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see miniJava_ASOS.BoolConstant#getValue()
	 * @see #getBoolConstant()
	 * @generated
	 */
	EAttribute getBoolConstant_Value();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.This <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This</em>'.
	 * @see miniJava_ASOS.This
	 * @generated
	 */
	EClass getThis();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Super <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super</em>'.
	 * @see miniJava_ASOS.Super
	 * @generated
	 */
	EClass getSuper();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Null <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null</em>'.
	 * @see miniJava_ASOS.Null
	 * @generated
	 */
	EClass getNull();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.NewObject <em>New Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Object</em>'.
	 * @see miniJava_ASOS.NewObject
	 * @generated
	 */
	EClass getNewObject();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.NewObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see miniJava_ASOS.NewObject#getType()
	 * @see #getNewObject()
	 * @generated
	 */
	EReference getNewObject_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link miniJava_ASOS.NewObject#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see miniJava_ASOS.NewObject#getArgs()
	 * @see #getNewObject()
	 * @generated
	 */
	EReference getNewObject_Args();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.NewArray <em>New Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Array</em>'.
	 * @see miniJava_ASOS.NewArray
	 * @generated
	 */
	EClass getNewArray();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.NewArray#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see miniJava_ASOS.NewArray#getType()
	 * @see #getNewArray()
	 * @generated
	 */
	EReference getNewArray_Type();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.NewArray#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see miniJava_ASOS.NewArray#getSize()
	 * @see #getNewArray()
	 * @generated
	 */
	EReference getNewArray_Size();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.SymbolRef <em>Symbol Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Ref</em>'.
	 * @see miniJava_ASOS.SymbolRef
	 * @generated
	 */
	EClass getSymbolRef();

	/**
	 * Returns the meta object for the reference '{@link miniJava_ASOS.SymbolRef#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symbol</em>'.
	 * @see miniJava_ASOS.SymbolRef#getSymbol()
	 * @see #getSymbolRef()
	 * @generated
	 */
	EReference getSymbolRef_Symbol();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see miniJava_ASOS.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.Sqrt <em>Sqrt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqrt</em>'.
	 * @see miniJava_ASOS.Sqrt
	 * @generated
	 */
	EClass getSqrt();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.Sqrt#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see miniJava_ASOS.Sqrt#getExpression()
	 * @see #getSqrt()
	 * @generated
	 */
	EReference getSqrt_Expression();

	/**
	 * Returns the meta object for class '{@link miniJava_ASOS.BinOp <em>Bin Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Op</em>'.
	 * @see miniJava_ASOS.BinOp
	 * @generated
	 */
	EClass getBinOp();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.BinOp#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see miniJava_ASOS.BinOp#getLeft()
	 * @see #getBinOp()
	 * @generated
	 */
	EReference getBinOp_Left();

	/**
	 * Returns the meta object for the containment reference '{@link miniJava_ASOS.BinOp#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see miniJava_ASOS.BinOp#getRight()
	 * @see #getBinOp()
	 * @generated
	 */
	EReference getBinOp_Right();

	/**
	 * Returns the meta object for enum '{@link miniJava_ASOS.AccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Level</em>'.
	 * @see miniJava_ASOS.AccessLevel
	 * @generated
	 */
	EEnum getAccessLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiniJava_ASOSFactory getMiniJava_ASOSFactory();

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
		 * The meta object literal for the '{@link miniJava_ASOS.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.ProgramImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__IMPORTS = eINSTANCE.getProgram_Imports();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CLASSES = eINSTANCE.getProgram_Classes();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STATE = eINSTANCE.getProgram_State();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.ImportImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.TypeDeclarationImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getTypeDeclaration()
		 * @generated
		 */
		EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Access Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DECLARATION__ACCESS_LEVEL = eINSTANCE.getTypeDeclaration_AccessLevel();

		/**
		 * The meta object literal for the '<em><b>Implementz</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION__IMPLEMENTZ = eINSTANCE.getTypeDeclaration_Implementz();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION__MEMBERS = eINSTANCE.getTypeDeclaration_Members();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.ClazzImpl <em>Clazz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.ClazzImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getClazz()
		 * @generated
		 */
		EClass CLAZZ = eINSTANCE.getClazz();

		/**
		 * The meta object literal for the '<em><b>Isabstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAZZ__ISABSTRACT = eINSTANCE.getClazz_Isabstract();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__SUPER_CLASS = eINSTANCE.getClazz_SuperClass();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.InterfaceImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.MemberImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__ACCESS = eINSTANCE.getMember_Access();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.MethodImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Isabstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__ISABSTRACT = eINSTANCE.getMethod_Isabstract();

		/**
		 * The meta object literal for the '<em><b>Isstatic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__ISSTATIC = eINSTANCE.getMethod_Isstatic();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMS = eINSTANCE.getMethod_Params();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__BODY = eINSTANCE.getMethod_Body();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.ParameterImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.FieldImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__DEFAULT_VALUE = eINSTANCE.getField_DefaultValue();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.BlockImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.Statement <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.Statement
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.PrintStatementImpl <em>Print Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.PrintStatementImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getPrintStatement()
		 * @generated
		 */
		EClass PRINT_STATEMENT = eINSTANCE.getPrintStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT_STATEMENT__EXPRESSION = eINSTANCE.getPrintStatement_Expression();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.LoadImageImpl <em>Load Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.LoadImageImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getLoadImage()
		 * @generated
		 */
		EClass LOAD_IMAGE = eINSTANCE.getLoadImage();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_IMAGE__PATH = eINSTANCE.getLoadImage_Path();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.WriteImageImpl <em>Write Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.WriteImageImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getWriteImage()
		 * @generated
		 */
		EClass WRITE_IMAGE = eINSTANCE.getWriteImage();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_IMAGE__PATH = eINSTANCE.getWriteImage_Path();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_IMAGE__IMAGE = eINSTANCE.getWriteImage_Image();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.ReturnImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__EXPRESSION = eINSTANCE.getReturn_Expression();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.IfStatementImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__EXPRESSION = eINSTANCE.getIfStatement_Expression();

		/**
		 * The meta object literal for the '<em><b>Then Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__THEN_BLOCK = eINSTANCE.getIfStatement_ThenBlock();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_BLOCK = eINSTANCE.getIfStatement_ElseBlock();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.WhileStatementImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__CONDITION = eINSTANCE.getWhileStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__BLOCK = eINSTANCE.getWhileStatement_Block();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.ForStatementImpl <em>For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.ForStatementImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getForStatement()
		 * @generated
		 */
		EClass FOR_STATEMENT = eINSTANCE.getForStatement();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__DECLARATION = eINSTANCE.getForStatement_Declaration();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__CONDITION = eINSTANCE.getForStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Progression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__PROGRESSION = eINSTANCE.getForStatement_Progression();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__BLOCK = eINSTANCE.getForStatement_Block();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.TypeRef <em>Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.TypeRef
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getTypeRef()
		 * @generated
		 */
		EClass TYPE_REF = eINSTANCE.getTypeRef();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.SingleTypeRef <em>Single Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.SingleTypeRef
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSingleTypeRef()
		 * @generated
		 */
		EClass SINGLE_TYPE_REF = eINSTANCE.getSingleTypeRef();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.ClassRefImpl <em>Class Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.ClassRefImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getClassRef()
		 * @generated
		 */
		EClass CLASS_REF = eINSTANCE.getClassRef();

		/**
		 * The meta object literal for the '<em><b>Referenced Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_REF__REFERENCED_CLASS = eINSTANCE.getClassRef_ReferencedClass();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.NamedElement
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.TypedDeclaration <em>Typed Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.TypedDeclaration
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getTypedDeclaration()
		 * @generated
		 */
		EClass TYPED_DECLARATION = eINSTANCE.getTypedDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_DECLARATION__TYPE_REF = eINSTANCE.getTypedDeclaration_TypeRef();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.Symbol <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.Symbol
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.VariableDeclarationImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.AssignmentImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__ASSIGNEE = eINSTANCE.getAssignment_Assignee();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.AssigneeImpl <em>Assignee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.AssigneeImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getAssignee()
		 * @generated
		 */
		EClass ASSIGNEE = eINSTANCE.getAssignee();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.Expression
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.ArrayTypeRefImpl <em>Array Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.ArrayTypeRefImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getArrayTypeRef()
		 * @generated
		 */
		EClass ARRAY_TYPE_REF = eINSTANCE.getArrayTypeRef();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE_REF__TYPE_REF = eINSTANCE.getArrayTypeRef_TypeRef();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.IntegerTypeRefImpl <em>Integer Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.IntegerTypeRefImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getIntegerTypeRef()
		 * @generated
		 */
		EClass INTEGER_TYPE_REF = eINSTANCE.getIntegerTypeRef();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.BooleanTypeRefImpl <em>Boolean Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.BooleanTypeRefImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getBooleanTypeRef()
		 * @generated
		 */
		EClass BOOLEAN_TYPE_REF = eINSTANCE.getBooleanTypeRef();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.StringTypeRefImpl <em>String Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.StringTypeRefImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getStringTypeRef()
		 * @generated
		 */
		EClass STRING_TYPE_REF = eINSTANCE.getStringTypeRef();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.VoidTypeRefImpl <em>Void Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.VoidTypeRefImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getVoidTypeRef()
		 * @generated
		 */
		EClass VOID_TYPE_REF = eINSTANCE.getVoidTypeRef();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.OrImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.AndImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.EqualityImpl <em>Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.EqualityImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getEquality()
		 * @generated
		 */
		EClass EQUALITY = eINSTANCE.getEquality();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.InequalityImpl <em>Inequality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.InequalityImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getInequality()
		 * @generated
		 */
		EClass INEQUALITY = eINSTANCE.getInequality();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.SuperiorOrEqualImpl <em>Superior Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.SuperiorOrEqualImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSuperiorOrEqual()
		 * @generated
		 */
		EClass SUPERIOR_OR_EQUAL = eINSTANCE.getSuperiorOrEqual();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.InferiorOrEqualImpl <em>Inferior Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.InferiorOrEqualImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getInferiorOrEqual()
		 * @generated
		 */
		EClass INFERIOR_OR_EQUAL = eINSTANCE.getInferiorOrEqual();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.SuperiorImpl <em>Superior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.SuperiorImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSuperior()
		 * @generated
		 */
		EClass SUPERIOR = eINSTANCE.getSuperior();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.InferiorImpl <em>Inferior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.InferiorImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getInferior()
		 * @generated
		 */
		EClass INFERIOR = eINSTANCE.getInferior();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.PlusImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.MinusImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.MultiplicationImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.DivisionImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.ArrayAccessImpl <em>Array Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.ArrayAccessImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getArrayAccess()
		 * @generated
		 */
		EClass ARRAY_ACCESS = eINSTANCE.getArrayAccess();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ACCESS__OBJECT = eINSTANCE.getArrayAccess_Object();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ACCESS__INDEX = eINSTANCE.getArrayAccess_Index();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.ArrayLengthImpl <em>Array Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.ArrayLengthImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getArrayLength()
		 * @generated
		 */
		EClass ARRAY_LENGTH = eINSTANCE.getArrayLength();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_LENGTH__ARRAY = eINSTANCE.getArrayLength_Array();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.NotImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__EXPRESSION = eINSTANCE.getNot_Expression();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.NegImpl <em>Neg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.NegImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getNeg()
		 * @generated
		 */
		EClass NEG = eINSTANCE.getNeg();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEG__EXPRESSION = eINSTANCE.getNeg_Expression();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.FieldAccessImpl <em>Field Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.FieldAccessImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getFieldAccess()
		 * @generated
		 */
		EClass FIELD_ACCESS = eINSTANCE.getFieldAccess();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ACCESS__RECEIVER = eINSTANCE.getFieldAccess_Receiver();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ACCESS__FIELD = eINSTANCE.getFieldAccess_Field();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.MethodCallImpl <em>Method Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.MethodCallImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getMethodCall()
		 * @generated
		 */
		EClass METHOD_CALL = eINSTANCE.getMethodCall();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__RECEIVER = eINSTANCE.getMethodCall_Receiver();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__METHOD = eINSTANCE.getMethodCall_Method();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__ARGS = eINSTANCE.getMethodCall_Args();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.StringConstantImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.IntConstantImpl <em>Int Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.IntConstantImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getIntConstant()
		 * @generated
		 */
		EClass INT_CONSTANT = eINSTANCE.getIntConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONSTANT__VALUE = eINSTANCE.getIntConstant_Value();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.BoolConstantImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getBoolConstant()
		 * @generated
		 */
		EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.ThisImpl <em>This</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.ThisImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getThis()
		 * @generated
		 */
		EClass THIS = eINSTANCE.getThis();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.SuperImpl <em>Super</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.SuperImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSuper()
		 * @generated
		 */
		EClass SUPER = eINSTANCE.getSuper();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.NullImpl <em>Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.NullImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getNull()
		 * @generated
		 */
		EClass NULL = eINSTANCE.getNull();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.NewObjectImpl <em>New Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.NewObjectImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getNewObject()
		 * @generated
		 */
		EClass NEW_OBJECT = eINSTANCE.getNewObject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_OBJECT__TYPE = eINSTANCE.getNewObject_Type();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_OBJECT__ARGS = eINSTANCE.getNewObject_Args();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.NewArrayImpl <em>New Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.NewArrayImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getNewArray()
		 * @generated
		 */
		EClass NEW_ARRAY = eINSTANCE.getNewArray();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_ARRAY__TYPE = eINSTANCE.getNewArray_Type();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_ARRAY__SIZE = eINSTANCE.getNewArray_Size();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.SymbolRefImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSymbolRef()
		 * @generated
		 */
		EClass SYMBOL_REF = eINSTANCE.getSymbolRef();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL_REF__SYMBOL = eINSTANCE.getSymbolRef_Symbol();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.ModuloImpl <em>Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.ModuloImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getModulo()
		 * @generated
		 */
		EClass MODULO = eINSTANCE.getModulo();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.SqrtImpl <em>Sqrt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.SqrtImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getSqrt()
		 * @generated
		 */
		EClass SQRT = eINSTANCE.getSqrt();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQRT__EXPRESSION = eINSTANCE.getSqrt_Expression();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.impl.BinOpImpl <em>Bin Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.impl.BinOpImpl
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getBinOp()
		 * @generated
		 */
		EClass BIN_OP = eINSTANCE.getBinOp();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_OP__LEFT = eINSTANCE.getBinOp_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_OP__RIGHT = eINSTANCE.getBinOp_Right();

		/**
		 * The meta object literal for the '{@link miniJava_ASOS.AccessLevel <em>Access Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniJava_ASOS.AccessLevel
		 * @see miniJava_ASOS.impl.MiniJava_ASOSPackageImpl#getAccessLevel()
		 * @generated
		 */
		EEnum ACCESS_LEVEL = eINSTANCE.getAccessLevel();

	}

} //MiniJava_ASOSPackage
