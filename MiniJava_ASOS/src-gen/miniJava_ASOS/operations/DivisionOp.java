package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.DivisionData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = Division.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class DivisionOp extends AdaptiveOperation<Division, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Division node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		DivisionData data = new DivisionData(node);
		
		while(true){
			Object termination = null;
			DivisionData local_data = new DivisionData(node);
		
			boolean validPatternInput89 = true;
			if(validPatternInput89)
			{
				if(data.getcomputed_left() == null){
					local_data.setcomputed_left(((Node) node.getLeft()).accept(vis, execCtx));
					if(!(local_data.getcomputed_left() instanceof Termination)){
						if(config.before_BinOp_lhs() != null){
							config.before_BinOp_lhs().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_BinOp_lhs() != null){
							config.specialize_BinOp_lhs().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_left(local_data.getcomputed_left());
						}
						
						if(config.after_BinOp_lhs() != null){
							if(result == null){
								config.after_BinOp_lhs().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_BinOp_lhs().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
							}
						}
						
						if(result != null){
							if (result instanceof Termination){
								return result;
							} else if(! ((EObject) result).eClass().getEPackage().equals(SdPackage.eINSTANCE)){
								return ((Node) result).accept(vis, execCtx);
							} else {
								return result;
							}
						} else {
							continue;
						}
					}
					else {
						termination = local_data.getcomputed_left();
					}
				}
			}
			boolean validPatternInput90 = true && (data.getcomputed_left() instanceof Value);
			if(validPatternInput90)
			{
				if(data.getcomputed_right() == null){
					local_data.setcomputed_right(((Node) node.getRight()).accept(vis, execCtx));
					if(!(local_data.getcomputed_right() instanceof Termination)){
						if(config.before_BinOp_rhs() != null){
							config.before_BinOp_rhs().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_BinOp_rhs() != null){
							config.specialize_BinOp_rhs().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_right(local_data.getcomputed_right());
						}
						
						if(config.after_BinOp_rhs() != null){
							if(result == null){
								config.after_BinOp_rhs().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_BinOp_rhs().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
							}
						}
						
						if(result != null){
							if (result instanceof Termination){
								return result;
							} else if(! ((EObject) result).eClass().getEPackage().equals(SdPackage.eINSTANCE)){
								return ((Node) result).accept(vis, execCtx);
							} else {
								return result;
							}
						} else {
							continue;
						}
					}
					else {
						termination = local_data.getcomputed_right();
					}
				}
			}
			boolean validPatternInput91 = true && (data.getcomputed_left() instanceof IntegerValue) && (data.getcomputed_right() instanceof IntegerValue);
			if(validPatternInput91)
			{
				if((!((IntegerValue) data.getcomputed_right()).getValue().equals(0))){
					if(config.before_div_int() != null){
						config.before_div_int().adapt(vis, node, execCtx, data, config);
					}
					
					if(config.specialize_div_int() != null){
						config.specialize_div_int().adapt(vis, node, execCtx, data, config);
					} else {
						Object n = (((IntegerValue) data.getcomputed_left()).getValue() / ((IntegerValue) data.getcomputed_right()).getValue());
						IntegerValue integerValue5 = SdFactory.eINSTANCE.createIntegerValue();
						integerValue5.setValue((java.lang.Integer) n);
						IntegerValue out = integerValue5;
						result = out;
					}
					
					if(config.after_div_int() != null){
						if(result == null){
							config.after_div_int().adapt(vis, node, execCtx, data, config);
						} else {
							config.after_div_int().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
						}
					}
					
					if(result != null){
						if (result instanceof Termination){
							return result;
						} else if(! ((EObject) result).eClass().getEPackage().equals(SdPackage.eINSTANCE)){
							return ((Node) result).accept(vis, execCtx);
						} else {
							return result;
						}
					} else {
						continue;
					}
				}
			}
			boolean validPatternInput92 = true && (data.getcomputed_left() instanceof IntegerValue) && (data.getcomputed_right() instanceof IntegerValue);
			if(validPatternInput92)
			{
				if((((IntegerValue) data.getcomputed_right()).getValue().equals(0))){
					if(config.before_div_int_error() != null){
						config.before_div_int_error().adapt(vis, node, execCtx, data, config);
					}
					
					if(config.specialize_div_int_error() != null){
						config.specialize_div_int_error().adapt(vis, node, execCtx, data, config);
					} else {
						RuntimeError runtimeError0 = SdFactory.eINSTANCE.createRuntimeError();
						RuntimeError out = runtimeError0;
						result = new Termination(out);
					}
					
					if(config.after_div_int_error() != null){
						if(result == null){
							config.after_div_int_error().adapt(vis, node, execCtx, data, config);
						} else {
							config.after_div_int_error().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
						}
					}
					
					if(result != null){
						if (result instanceof Termination){
							return result;
						} else if(! ((EObject) result).eClass().getEPackage().equals(SdPackage.eINSTANCE)){
							return ((Node) result).accept(vis, execCtx);
						} else {
							return result;
						}
					} else {
						continue;
					}
				}
			}
		
			return termination;
		}
	}
}
