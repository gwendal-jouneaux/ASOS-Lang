/**
 */
package miniJava_ASOS.util;

import miniJava_ASOS.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see miniJava_ASOS.MiniJava_ASOSPackage
 * @generated
 */
public class MiniJava_ASOSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MiniJava_ASOSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniJava_ASOSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MiniJava_ASOSPackage.eINSTANCE;
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
	protected MiniJava_ASOSSwitch<Adapter> modelSwitch = new MiniJava_ASOSSwitch<Adapter>() {
		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseImport(Import object) {
			return createImportAdapter();
		}

		@Override
		public Adapter caseTypeDeclaration(TypeDeclaration object) {
			return createTypeDeclarationAdapter();
		}

		@Override
		public Adapter caseClazz(Clazz object) {
			return createClazzAdapter();
		}

		@Override
		public Adapter caseInterface(Interface object) {
			return createInterfaceAdapter();
		}

		@Override
		public Adapter caseMember(Member object) {
			return createMemberAdapter();
		}

		@Override
		public Adapter caseMethod(Method object) {
			return createMethodAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseField(Field object) {
			return createFieldAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter casePrintStatement(PrintStatement object) {
			return createPrintStatementAdapter();
		}

		@Override
		public Adapter caseLoadImage(LoadImage object) {
			return createLoadImageAdapter();
		}

		@Override
		public Adapter caseWriteImage(WriteImage object) {
			return createWriteImageAdapter();
		}

		@Override
		public Adapter caseReturn(Return object) {
			return createReturnAdapter();
		}

		@Override
		public Adapter caseIfStatement(IfStatement object) {
			return createIfStatementAdapter();
		}

		@Override
		public Adapter caseWhileStatement(WhileStatement object) {
			return createWhileStatementAdapter();
		}

		@Override
		public Adapter caseForStatement(ForStatement object) {
			return createForStatementAdapter();
		}

		@Override
		public Adapter caseTypeRef(TypeRef object) {
			return createTypeRefAdapter();
		}

		@Override
		public Adapter caseSingleTypeRef(SingleTypeRef object) {
			return createSingleTypeRefAdapter();
		}

		@Override
		public Adapter caseClassRef(ClassRef object) {
			return createClassRefAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseTypedDeclaration(TypedDeclaration object) {
			return createTypedDeclarationAdapter();
		}

		@Override
		public Adapter caseSymbol(Symbol object) {
			return createSymbolAdapter();
		}

		@Override
		public Adapter caseVariableDeclaration(VariableDeclaration object) {
			return createVariableDeclarationAdapter();
		}

		@Override
		public Adapter caseAssignment(Assignment object) {
			return createAssignmentAdapter();
		}

		@Override
		public Adapter caseAssignee(Assignee object) {
			return createAssigneeAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseArrayTypeRef(ArrayTypeRef object) {
			return createArrayTypeRefAdapter();
		}

		@Override
		public Adapter caseIntegerTypeRef(IntegerTypeRef object) {
			return createIntegerTypeRefAdapter();
		}

		@Override
		public Adapter caseBooleanTypeRef(BooleanTypeRef object) {
			return createBooleanTypeRefAdapter();
		}

		@Override
		public Adapter caseStringTypeRef(StringTypeRef object) {
			return createStringTypeRefAdapter();
		}

		@Override
		public Adapter caseVoidTypeRef(VoidTypeRef object) {
			return createVoidTypeRefAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter caseEquality(Equality object) {
			return createEqualityAdapter();
		}

		@Override
		public Adapter caseInequality(Inequality object) {
			return createInequalityAdapter();
		}

		@Override
		public Adapter caseSuperiorOrEqual(SuperiorOrEqual object) {
			return createSuperiorOrEqualAdapter();
		}

		@Override
		public Adapter caseInferiorOrEqual(InferiorOrEqual object) {
			return createInferiorOrEqualAdapter();
		}

		@Override
		public Adapter caseSuperior(Superior object) {
			return createSuperiorAdapter();
		}

		@Override
		public Adapter caseInferior(Inferior object) {
			return createInferiorAdapter();
		}

		@Override
		public Adapter casePlus(Plus object) {
			return createPlusAdapter();
		}

		@Override
		public Adapter caseMinus(Minus object) {
			return createMinusAdapter();
		}

		@Override
		public Adapter caseMultiplication(Multiplication object) {
			return createMultiplicationAdapter();
		}

		@Override
		public Adapter caseDivision(Division object) {
			return createDivisionAdapter();
		}

		@Override
		public Adapter caseArrayAccess(ArrayAccess object) {
			return createArrayAccessAdapter();
		}

		@Override
		public Adapter caseArrayLength(ArrayLength object) {
			return createArrayLengthAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseNeg(Neg object) {
			return createNegAdapter();
		}

		@Override
		public Adapter caseFieldAccess(FieldAccess object) {
			return createFieldAccessAdapter();
		}

		@Override
		public Adapter caseMethodCall(MethodCall object) {
			return createMethodCallAdapter();
		}

		@Override
		public Adapter caseStringConstant(StringConstant object) {
			return createStringConstantAdapter();
		}

		@Override
		public Adapter caseIntConstant(IntConstant object) {
			return createIntConstantAdapter();
		}

		@Override
		public Adapter caseBoolConstant(BoolConstant object) {
			return createBoolConstantAdapter();
		}

		@Override
		public Adapter caseThis(This object) {
			return createThisAdapter();
		}

		@Override
		public Adapter caseSuper(Super object) {
			return createSuperAdapter();
		}

		@Override
		public Adapter caseNull(Null object) {
			return createNullAdapter();
		}

		@Override
		public Adapter caseNewObject(NewObject object) {
			return createNewObjectAdapter();
		}

		@Override
		public Adapter caseNewArray(NewArray object) {
			return createNewArrayAdapter();
		}

		@Override
		public Adapter caseSymbolRef(SymbolRef object) {
			return createSymbolRefAdapter();
		}

		@Override
		public Adapter caseModulo(Modulo object) {
			return createModuloAdapter();
		}

		@Override
		public Adapter caseSqrt(Sqrt object) {
			return createSqrtAdapter();
		}

		@Override
		public Adapter caseBinOp(BinOp object) {
			return createBinOpAdapter();
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
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.TypeDeclaration
	 * @generated
	 */
	public Adapter createTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Clazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Clazz
	 * @generated
	 */
	public Adapter createClazzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.PrintStatement <em>Print Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.PrintStatement
	 * @generated
	 */
	public Adapter createPrintStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.LoadImage <em>Load Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.LoadImage
	 * @generated
	 */
	public Adapter createLoadImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.WriteImage <em>Write Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.WriteImage
	 * @generated
	 */
	public Adapter createWriteImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Return
	 * @generated
	 */
	public Adapter createReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.WhileStatement
	 * @generated
	 */
	public Adapter createWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.ForStatement
	 * @generated
	 */
	public Adapter createForStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.TypeRef
	 * @generated
	 */
	public Adapter createTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.SingleTypeRef <em>Single Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.SingleTypeRef
	 * @generated
	 */
	public Adapter createSingleTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.ClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.ClassRef
	 * @generated
	 */
	public Adapter createClassRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.TypedDeclaration <em>Typed Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.TypedDeclaration
	 * @generated
	 */
	public Adapter createTypedDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Symbol
	 * @generated
	 */
	public Adapter createSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Assignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Assignee
	 * @generated
	 */
	public Adapter createAssigneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.ArrayTypeRef <em>Array Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.ArrayTypeRef
	 * @generated
	 */
	public Adapter createArrayTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.IntegerTypeRef <em>Integer Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.IntegerTypeRef
	 * @generated
	 */
	public Adapter createIntegerTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.BooleanTypeRef <em>Boolean Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.BooleanTypeRef
	 * @generated
	 */
	public Adapter createBooleanTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.StringTypeRef <em>String Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.StringTypeRef
	 * @generated
	 */
	public Adapter createStringTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.VoidTypeRef <em>Void Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.VoidTypeRef
	 * @generated
	 */
	public Adapter createVoidTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Equality
	 * @generated
	 */
	public Adapter createEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Inequality <em>Inequality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Inequality
	 * @generated
	 */
	public Adapter createInequalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.SuperiorOrEqual <em>Superior Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.SuperiorOrEqual
	 * @generated
	 */
	public Adapter createSuperiorOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.InferiorOrEqual <em>Inferior Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.InferiorOrEqual
	 * @generated
	 */
	public Adapter createInferiorOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Superior <em>Superior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Superior
	 * @generated
	 */
	public Adapter createSuperiorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Inferior <em>Inferior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Inferior
	 * @generated
	 */
	public Adapter createInferiorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Multiplication
	 * @generated
	 */
	public Adapter createMultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Division
	 * @generated
	 */
	public Adapter createDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.ArrayAccess <em>Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.ArrayAccess
	 * @generated
	 */
	public Adapter createArrayAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.ArrayLength <em>Array Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.ArrayLength
	 * @generated
	 */
	public Adapter createArrayLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Neg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Neg
	 * @generated
	 */
	public Adapter createNegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.FieldAccess <em>Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.FieldAccess
	 * @generated
	 */
	public Adapter createFieldAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.MethodCall
	 * @generated
	 */
	public Adapter createMethodCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.StringConstant
	 * @generated
	 */
	public Adapter createStringConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.IntConstant
	 * @generated
	 */
	public Adapter createIntConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.BoolConstant
	 * @generated
	 */
	public Adapter createBoolConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.This <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.This
	 * @generated
	 */
	public Adapter createThisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Super <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Super
	 * @generated
	 */
	public Adapter createSuperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Null <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Null
	 * @generated
	 */
	public Adapter createNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.NewObject <em>New Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.NewObject
	 * @generated
	 */
	public Adapter createNewObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.NewArray <em>New Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.NewArray
	 * @generated
	 */
	public Adapter createNewArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.SymbolRef <em>Symbol Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.SymbolRef
	 * @generated
	 */
	public Adapter createSymbolRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Modulo
	 * @generated
	 */
	public Adapter createModuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.Sqrt <em>Sqrt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.Sqrt
	 * @generated
	 */
	public Adapter createSqrtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniJava_ASOS.BinOp <em>Bin Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniJava_ASOS.BinOp
	 * @generated
	 */
	public Adapter createBinOpAdapter() {
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

} //MiniJava_ASOSAdapterFactory
