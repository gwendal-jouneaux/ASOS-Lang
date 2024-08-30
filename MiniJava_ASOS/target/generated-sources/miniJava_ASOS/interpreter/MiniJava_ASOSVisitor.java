package miniJava_ASOS.interpreter;

public class MiniJava_ASOSVisitor implements fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor {
	public Object visitInferior(miniJava_ASOS.Inferior node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.InferiorOp()).execute(this,node,execCtx,config);}
	public Object visitNewArray(miniJava_ASOS.NewArray node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.NewArrayOp()).execute(this,node,execCtx,config);}
	public Object visitDivision(miniJava_ASOS.Division node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.DivisionOp()).execute(this,node,execCtx,config);}
	public Object visitWhileStatement(miniJava_ASOS.WhileStatement node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.WhileStatementOp()).execute(this,node,execCtx,config);}
	public Object visitStringConstant(miniJava_ASOS.StringConstant node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.StringConstantOp()).execute(this,node,execCtx,config);}
	public Object visitIfStatement(miniJava_ASOS.IfStatement node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.IfStatementOp()).execute(this,node,execCtx,config);}
	public Object visitOr(miniJava_ASOS.Or node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.OrOp()).execute(this,node,execCtx,config);}
	public Object visitNeg(miniJava_ASOS.Neg node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.NegOp()).execute(this,node,execCtx,config);}
	public Object visitWriteImage(miniJava_ASOS.WriteImage node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.WriteImageOp()).execute(this,node,execCtx,config);}
	public Object visitNewObject(miniJava_ASOS.NewObject node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.NewObjectOp()).execute(this,node,execCtx,config);}
	public Object visitInequality(miniJava_ASOS.Inequality node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.InequalityOp()).execute(this,node,execCtx,config);}
	public Object visitSqrt(miniJava_ASOS.Sqrt node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.SqrtOp()).execute(this,node,execCtx,config);}
	public Object visitForStatement(miniJava_ASOS.ForStatement node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.ForStatementOp()).execute(this,node,execCtx,config);}
	public Object visitAssignment(miniJava_ASOS.Assignment node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.AssignmentOp()).execute(this,node,execCtx,config);}
	public Object visitSuperiorOrEqual(miniJava_ASOS.SuperiorOrEqual node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.SuperiorOrEqualOp()).execute(this,node,execCtx,config);}
	public Object visitMethodCall(miniJava_ASOS.MethodCall node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.MethodCallOp()).execute(this,node,execCtx,config);}
	public Object visitMethod(miniJava_ASOS.Method node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.MethodOp()).execute(this,node,execCtx,config);}
	public Object visitBoolConstant(miniJava_ASOS.BoolConstant node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.BoolConstantOp()).execute(this,node,execCtx,config);}
	public Object visitInferiorOrEqual(miniJava_ASOS.InferiorOrEqual node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.InferiorOrEqualOp()).execute(this,node,execCtx,config);}
	public Object visitNot(miniJava_ASOS.Not node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.NotOp()).execute(this,node,execCtx,config);}
	public Object visitSuperior(miniJava_ASOS.Superior node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.SuperiorOp()).execute(this,node,execCtx,config);}
	public Object visitSymbolRef(miniJava_ASOS.SymbolRef node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.SymbolRefOp()).execute(this,node,execCtx,config);}
	public Object visitReturn(miniJava_ASOS.Return node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.ReturnOp()).execute(this,node,execCtx,config);}
	public Object visitPrintStatement(miniJava_ASOS.PrintStatement node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.PrintStatementOp()).execute(this,node,execCtx,config);}
	public Object visitBlock(miniJava_ASOS.Block node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.BlockOp()).execute(this,node,execCtx,config);}
	public Object visitNull(miniJava_ASOS.Null node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.NullOp()).execute(this,node,execCtx,config);}
	public Object visitArrayAccess(miniJava_ASOS.ArrayAccess node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.ArrayAccessOp()).execute(this,node,execCtx,config);}
	public Object visitFieldAccess(miniJava_ASOS.FieldAccess node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.FieldAccessOp()).execute(this,node,execCtx,config);}
	public Object visitPlus(miniJava_ASOS.Plus node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.PlusOp()).execute(this,node,execCtx,config);}
	public Object visitProgram(miniJava_ASOS.Program node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.ProgramOp()).execute(this,node,execCtx,config);}
	public Object visitArrayLength(miniJava_ASOS.ArrayLength node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.ArrayLengthOp()).execute(this,node,execCtx,config);}
	public Object visitThis(miniJava_ASOS.This node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.ThisOp()).execute(this,node,execCtx,config);}
	public Object visitAnd(miniJava_ASOS.And node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.AndOp()).execute(this,node,execCtx,config);}
	public Object visitEquality(miniJava_ASOS.Equality node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.EqualityOp()).execute(this,node,execCtx,config);}
	public Object visitMinus(miniJava_ASOS.Minus node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.MinusOp()).execute(this,node,execCtx,config);}
	public Object visitLoadImage(miniJava_ASOS.LoadImage node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.LoadImageOp()).execute(this,node,execCtx,config);}
	public Object visitIntConstant(miniJava_ASOS.IntConstant node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.IntConstantOp()).execute(this,node,execCtx,config);}
	public Object visitMultiplication(miniJava_ASOS.Multiplication node, Object execCtx, miniJava_ASOS.interfaces.miniJava_ASOSInterface config){ return (new miniJava_ASOS.operations.MultiplicationOp()).execute(this,node,execCtx,config);}
	public Object dispatch(fr.diverse.team.SEALS.lang.semantics.Node node, Object executionCtx){
		return null;
	}
	public Object dispatch(fr.diverse.team.SEALS.lang.semantics.AdaptableNode node, Object executionCtx, fr.diverse.team.SEALS.lang.semantics.SemanticsAdaptationInterface config){
		if(node instanceof miniJava_ASOS.Inferior){
			return visitInferior((miniJava_ASOS.Inferior) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.NewArray){
			return visitNewArray((miniJava_ASOS.NewArray) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Division){
			return visitDivision((miniJava_ASOS.Division) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.WhileStatement){
			return visitWhileStatement((miniJava_ASOS.WhileStatement) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.StringConstant){
			return visitStringConstant((miniJava_ASOS.StringConstant) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.IfStatement){
			return visitIfStatement((miniJava_ASOS.IfStatement) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Or){
			return visitOr((miniJava_ASOS.Or) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Neg){
			return visitNeg((miniJava_ASOS.Neg) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.WriteImage){
			return visitWriteImage((miniJava_ASOS.WriteImage) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.NewObject){
			return visitNewObject((miniJava_ASOS.NewObject) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Inequality){
			return visitInequality((miniJava_ASOS.Inequality) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Sqrt){
			return visitSqrt((miniJava_ASOS.Sqrt) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.ForStatement){
			return visitForStatement((miniJava_ASOS.ForStatement) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Assignment){
			return visitAssignment((miniJava_ASOS.Assignment) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.SuperiorOrEqual){
			return visitSuperiorOrEqual((miniJava_ASOS.SuperiorOrEqual) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.MethodCall){
			return visitMethodCall((miniJava_ASOS.MethodCall) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Method){
			return visitMethod((miniJava_ASOS.Method) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.BoolConstant){
			return visitBoolConstant((miniJava_ASOS.BoolConstant) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.InferiorOrEqual){
			return visitInferiorOrEqual((miniJava_ASOS.InferiorOrEqual) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Not){
			return visitNot((miniJava_ASOS.Not) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Superior){
			return visitSuperior((miniJava_ASOS.Superior) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.SymbolRef){
			return visitSymbolRef((miniJava_ASOS.SymbolRef) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Return){
			return visitReturn((miniJava_ASOS.Return) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.PrintStatement){
			return visitPrintStatement((miniJava_ASOS.PrintStatement) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Block){
			return visitBlock((miniJava_ASOS.Block) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Null){
			return visitNull((miniJava_ASOS.Null) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.ArrayAccess){
			return visitArrayAccess((miniJava_ASOS.ArrayAccess) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.FieldAccess){
			return visitFieldAccess((miniJava_ASOS.FieldAccess) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Plus){
			return visitPlus((miniJava_ASOS.Plus) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Program){
			return visitProgram((miniJava_ASOS.Program) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.ArrayLength){
			return visitArrayLength((miniJava_ASOS.ArrayLength) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.This){
			return visitThis((miniJava_ASOS.This) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.And){
			return visitAnd((miniJava_ASOS.And) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Equality){
			return visitEquality((miniJava_ASOS.Equality) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Minus){
			return visitMinus((miniJava_ASOS.Minus) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.LoadImage){
			return visitLoadImage((miniJava_ASOS.LoadImage) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.IntConstant){
			return visitIntConstant((miniJava_ASOS.IntConstant) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		if(node instanceof miniJava_ASOS.Multiplication){
			return visitMultiplication((miniJava_ASOS.Multiplication) node, executionCtx,(miniJava_ASOS.interfaces.miniJava_ASOSInterface) config);
		}
		return null;
	}
}