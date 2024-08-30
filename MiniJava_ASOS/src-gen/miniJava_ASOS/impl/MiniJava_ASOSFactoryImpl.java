/**
 */
package miniJava_ASOS.impl;

import miniJava_ASOS.*;

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
public class MiniJava_ASOSFactoryImpl extends EFactoryImpl implements MiniJava_ASOSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiniJava_ASOSFactory init() {
		try {
			MiniJava_ASOSFactory theMiniJava_ASOSFactory = (MiniJava_ASOSFactory) EPackage.Registry.INSTANCE
					.getEFactory(MiniJava_ASOSPackage.eNS_URI);
			if (theMiniJava_ASOSFactory != null) {
				return theMiniJava_ASOSFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MiniJava_ASOSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniJava_ASOSFactoryImpl() {
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
		case MiniJava_ASOSPackage.PROGRAM:
			return createProgram();
		case MiniJava_ASOSPackage.IMPORT:
			return createImport();
		case MiniJava_ASOSPackage.TYPE_DECLARATION:
			return createTypeDeclaration();
		case MiniJava_ASOSPackage.CLAZZ:
			return createClazz();
		case MiniJava_ASOSPackage.INTERFACE:
			return createInterface();
		case MiniJava_ASOSPackage.MEMBER:
			return createMember();
		case MiniJava_ASOSPackage.METHOD:
			return createMethod();
		case MiniJava_ASOSPackage.PARAMETER:
			return createParameter();
		case MiniJava_ASOSPackage.FIELD:
			return createField();
		case MiniJava_ASOSPackage.BLOCK:
			return createBlock();
		case MiniJava_ASOSPackage.PRINT_STATEMENT:
			return createPrintStatement();
		case MiniJava_ASOSPackage.LOAD_IMAGE:
			return createLoadImage();
		case MiniJava_ASOSPackage.WRITE_IMAGE:
			return createWriteImage();
		case MiniJava_ASOSPackage.RETURN:
			return createReturn();
		case MiniJava_ASOSPackage.IF_STATEMENT:
			return createIfStatement();
		case MiniJava_ASOSPackage.WHILE_STATEMENT:
			return createWhileStatement();
		case MiniJava_ASOSPackage.FOR_STATEMENT:
			return createForStatement();
		case MiniJava_ASOSPackage.CLASS_REF:
			return createClassRef();
		case MiniJava_ASOSPackage.VARIABLE_DECLARATION:
			return createVariableDeclaration();
		case MiniJava_ASOSPackage.ASSIGNMENT:
			return createAssignment();
		case MiniJava_ASOSPackage.ASSIGNEE:
			return createAssignee();
		case MiniJava_ASOSPackage.ARRAY_TYPE_REF:
			return createArrayTypeRef();
		case MiniJava_ASOSPackage.INTEGER_TYPE_REF:
			return createIntegerTypeRef();
		case MiniJava_ASOSPackage.BOOLEAN_TYPE_REF:
			return createBooleanTypeRef();
		case MiniJava_ASOSPackage.STRING_TYPE_REF:
			return createStringTypeRef();
		case MiniJava_ASOSPackage.VOID_TYPE_REF:
			return createVoidTypeRef();
		case MiniJava_ASOSPackage.OR:
			return createOr();
		case MiniJava_ASOSPackage.AND:
			return createAnd();
		case MiniJava_ASOSPackage.EQUALITY:
			return createEquality();
		case MiniJava_ASOSPackage.INEQUALITY:
			return createInequality();
		case MiniJava_ASOSPackage.SUPERIOR_OR_EQUAL:
			return createSuperiorOrEqual();
		case MiniJava_ASOSPackage.INFERIOR_OR_EQUAL:
			return createInferiorOrEqual();
		case MiniJava_ASOSPackage.SUPERIOR:
			return createSuperior();
		case MiniJava_ASOSPackage.INFERIOR:
			return createInferior();
		case MiniJava_ASOSPackage.PLUS:
			return createPlus();
		case MiniJava_ASOSPackage.MINUS:
			return createMinus();
		case MiniJava_ASOSPackage.MULTIPLICATION:
			return createMultiplication();
		case MiniJava_ASOSPackage.DIVISION:
			return createDivision();
		case MiniJava_ASOSPackage.ARRAY_ACCESS:
			return createArrayAccess();
		case MiniJava_ASOSPackage.ARRAY_LENGTH:
			return createArrayLength();
		case MiniJava_ASOSPackage.NOT:
			return createNot();
		case MiniJava_ASOSPackage.NEG:
			return createNeg();
		case MiniJava_ASOSPackage.FIELD_ACCESS:
			return createFieldAccess();
		case MiniJava_ASOSPackage.METHOD_CALL:
			return createMethodCall();
		case MiniJava_ASOSPackage.STRING_CONSTANT:
			return createStringConstant();
		case MiniJava_ASOSPackage.INT_CONSTANT:
			return createIntConstant();
		case MiniJava_ASOSPackage.BOOL_CONSTANT:
			return createBoolConstant();
		case MiniJava_ASOSPackage.THIS:
			return createThis();
		case MiniJava_ASOSPackage.SUPER:
			return createSuper();
		case MiniJava_ASOSPackage.NULL:
			return createNull();
		case MiniJava_ASOSPackage.NEW_OBJECT:
			return createNewObject();
		case MiniJava_ASOSPackage.NEW_ARRAY:
			return createNewArray();
		case MiniJava_ASOSPackage.SYMBOL_REF:
			return createSymbolRef();
		case MiniJava_ASOSPackage.MODULO:
			return createModulo();
		case MiniJava_ASOSPackage.SQRT:
			return createSqrt();
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
		case MiniJava_ASOSPackage.ACCESS_LEVEL:
			return createAccessLevelFromString(eDataType, initialValue);
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
		case MiniJava_ASOSPackage.ACCESS_LEVEL:
			return convertAccessLevelToString(eDataType, instanceValue);
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
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDeclaration createTypeDeclaration() {
		TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
		return typeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clazz createClazz() {
		ClazzImpl clazz = new ClazzImpl();
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrintStatement createPrintStatement() {
		PrintStatementImpl printStatement = new PrintStatementImpl();
		return printStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadImage createLoadImage() {
		LoadImageImpl loadImage = new LoadImageImpl();
		return loadImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WriteImage createWriteImage() {
		WriteImageImpl writeImage = new WriteImageImpl();
		return writeImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForStatement createForStatement() {
		ForStatementImpl forStatement = new ForStatementImpl();
		return forStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassRef createClassRef() {
		ClassRefImpl classRef = new ClassRefImpl();
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignee createAssignee() {
		AssigneeImpl assignee = new AssigneeImpl();
		return assignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayTypeRef createArrayTypeRef() {
		ArrayTypeRefImpl arrayTypeRef = new ArrayTypeRefImpl();
		return arrayTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerTypeRef createIntegerTypeRef() {
		IntegerTypeRefImpl integerTypeRef = new IntegerTypeRefImpl();
		return integerTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanTypeRef createBooleanTypeRef() {
		BooleanTypeRefImpl booleanTypeRef = new BooleanTypeRefImpl();
		return booleanTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringTypeRef createStringTypeRef() {
		StringTypeRefImpl stringTypeRef = new StringTypeRefImpl();
		return stringTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VoidTypeRef createVoidTypeRef() {
		VoidTypeRefImpl voidTypeRef = new VoidTypeRefImpl();
		return voidTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equality createEquality() {
		EqualityImpl equality = new EqualityImpl();
		return equality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inequality createInequality() {
		InequalityImpl inequality = new InequalityImpl();
		return inequality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperiorOrEqual createSuperiorOrEqual() {
		SuperiorOrEqualImpl superiorOrEqual = new SuperiorOrEqualImpl();
		return superiorOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InferiorOrEqual createInferiorOrEqual() {
		InferiorOrEqualImpl inferiorOrEqual = new InferiorOrEqualImpl();
		return inferiorOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Superior createSuperior() {
		SuperiorImpl superior = new SuperiorImpl();
		return superior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inferior createInferior() {
		InferiorImpl inferior = new InferiorImpl();
		return inferior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAccess createArrayAccess() {
		ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
		return arrayAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayLength createArrayLength() {
		ArrayLengthImpl arrayLength = new ArrayLengthImpl();
		return arrayLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Neg createNeg() {
		NegImpl neg = new NegImpl();
		return neg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccess createFieldAccess() {
		FieldAccessImpl fieldAccess = new FieldAccessImpl();
		return fieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodCall createMethodCall() {
		MethodCallImpl methodCall = new MethodCallImpl();
		return methodCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntConstant createIntConstant() {
		IntConstantImpl intConstant = new IntConstantImpl();
		return intConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolConstant createBoolConstant() {
		BoolConstantImpl boolConstant = new BoolConstantImpl();
		return boolConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public This createThis() {
		ThisImpl this_ = new ThisImpl();
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Super createSuper() {
		SuperImpl super_ = new SuperImpl();
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Null createNull() {
		NullImpl null_ = new NullImpl();
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewObject createNewObject() {
		NewObjectImpl newObject = new NewObjectImpl();
		return newObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewArray createNewArray() {
		NewArrayImpl newArray = new NewArrayImpl();
		return newArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolRef createSymbolRef() {
		SymbolRefImpl symbolRef = new SymbolRefImpl();
		return symbolRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modulo createModulo() {
		ModuloImpl modulo = new ModuloImpl();
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sqrt createSqrt() {
		SqrtImpl sqrt = new SqrtImpl();
		return sqrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLevel createAccessLevelFromString(EDataType eDataType, String initialValue) {
		AccessLevel result = AccessLevel.get(initialValue);
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
	public String convertAccessLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MiniJava_ASOSPackage getMiniJava_ASOSPackage() {
		return (MiniJava_ASOSPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MiniJava_ASOSPackage getPackage() {
		return MiniJava_ASOSPackage.eINSTANCE;
	}

} //MiniJava_ASOSFactoryImpl
