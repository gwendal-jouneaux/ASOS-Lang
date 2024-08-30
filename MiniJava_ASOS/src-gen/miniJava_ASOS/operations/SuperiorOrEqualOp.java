package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.SuperiorOrEqualData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = SuperiorOrEqual.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class SuperiorOrEqualOp extends AdaptiveOperation<SuperiorOrEqual, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, SuperiorOrEqual node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		SuperiorOrEqualData data = new SuperiorOrEqualData(node);
		
		while(true){
			Object termination = null;
			SuperiorOrEqualData local_data = new SuperiorOrEqualData(node);
		
			boolean validPatternInput11 = true;
			if(validPatternInput11)
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
			boolean validPatternInput12 = true && (data.getcomputed_left() instanceof Value);
			if(validPatternInput12)
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
			boolean validPatternInput13 = true && (data.getcomputed_left() instanceof IntegerValue) && (data.getcomputed_right() instanceof IntegerValue);
			if(validPatternInput13)
			{
				if(config.before_great_eq() != null){
					config.before_great_eq().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_great_eq() != null){
					config.specialize_great_eq().adapt(vis, node, execCtx, data, config);
				} else {
					Object n = (((IntegerValue) data.getcomputed_right()).getValue() <= ((IntegerValue) data.getcomputed_left()).getValue());
					BooleanValue booleanValue2 = SdFactory.eINSTANCE.createBooleanValue();
					booleanValue2.setValue((java.lang.Boolean) n);
					BooleanValue out = booleanValue2;
					result = out;
				}
				
				if(config.after_great_eq() != null){
					if(result == null){
						config.after_great_eq().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_great_eq().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
