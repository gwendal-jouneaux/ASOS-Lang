package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.InferiorOrEqualData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = InferiorOrEqual.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class InferiorOrEqualOp extends AdaptiveOperation<InferiorOrEqual, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, InferiorOrEqual node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		InferiorOrEqualData data = new InferiorOrEqualData(node);
		
		while(true){
			Object termination = null;
			InferiorOrEqualData local_data = new InferiorOrEqualData(node);
		
			boolean validPatternInput50 = true;
			if(validPatternInput50)
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
			boolean validPatternInput51 = true && (data.getcomputed_left() instanceof Value);
			if(validPatternInput51)
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
			boolean validPatternInput52 = true && (data.getcomputed_left() instanceof IntegerValue) && (data.getcomputed_right() instanceof IntegerValue);
			if(validPatternInput52)
			{
				if(config.before_less_eq() != null){
					config.before_less_eq().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_less_eq() != null){
					config.specialize_less_eq().adapt(vis, node, execCtx, data, config);
				} else {
					Object n = (((IntegerValue) data.getcomputed_left()).getValue() <= ((IntegerValue) data.getcomputed_right()).getValue());
					BooleanValue booleanValue7 = SdFactory.eINSTANCE.createBooleanValue();
					booleanValue7.setValue((java.lang.Boolean) n);
					BooleanValue out = booleanValue7;
					result = out;
				}
				
				if(config.after_less_eq() != null){
					if(result == null){
						config.after_less_eq().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_less_eq().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
		
			return termination;
		}
	}
}
