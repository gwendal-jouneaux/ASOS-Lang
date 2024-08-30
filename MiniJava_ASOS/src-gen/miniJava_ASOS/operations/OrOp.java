package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.OrData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = Or.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class OrOp extends AdaptiveOperation<Or, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Or node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		OrData data = new OrData(node);
		
		while(true){
			Object termination = null;
			OrData local_data = new OrData(node);
		
			boolean validPatternInput26 = true;
			if(validPatternInput26)
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
			boolean validPatternInput27 = true && (data.getcomputed_left() instanceof Value);
			if(validPatternInput27)
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
			boolean validPatternInput28 = true && (data.getcomputed_left() instanceof BooleanValue) && (data.getcomputed_right() instanceof BooleanValue);
			if(validPatternInput28)
			{
				if(config.before_or() != null){
					config.before_or().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_or() != null){
					config.specialize_or().adapt(vis, node, execCtx, data, config);
				} else {
					Object n = (((BooleanValue) data.getcomputed_left()).getValue() || ((BooleanValue) data.getcomputed_right()).getValue());
					BooleanValue booleanValue4 = SdFactory.eINSTANCE.createBooleanValue();
					booleanValue4.setValue((java.lang.Boolean) n);
					BooleanValue out = booleanValue4;
					result = out;
				}
				
				if(config.after_or() != null){
					if(result == null){
						config.after_or().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_or().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
