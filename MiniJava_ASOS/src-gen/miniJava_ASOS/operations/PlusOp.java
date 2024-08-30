package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.PlusData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = Plus.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class PlusOp extends AdaptiveOperation<Plus, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Plus node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		PlusData data = new PlusData(node);
		
		while(true){
			Object termination = null;
			PlusData local_data = new PlusData(node);
		
			boolean validPatternInput85 = true;
			if(validPatternInput85)
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
			boolean validPatternInput86 = true && (data.getcomputed_left() instanceof Value);
			if(validPatternInput86)
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
			boolean validPatternInput87 = true && (data.getcomputed_left() instanceof StringValue) && (data.getcomputed_right() instanceof StringValue);
			if(validPatternInput87)
			{
				if(config.before_plus_string() != null){
					config.before_plus_string().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_plus_string() != null){
					config.specialize_plus_string().adapt(vis, node, execCtx, data, config);
				} else {
					Object n = (((StringValue) data.getcomputed_left()).getValue() + ((StringValue) data.getcomputed_right()).getValue());
					StringValue stringValue1 = SdFactory.eINSTANCE.createStringValue();
					stringValue1.setValue((java.lang.String) n);
					StringValue out = stringValue1;
					result = out;
				}
				
				if(config.after_plus_string() != null){
					if(result == null){
						config.after_plus_string().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_plus_string().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput88 = true && (data.getcomputed_left() instanceof IntegerValue) && (data.getcomputed_right() instanceof IntegerValue);
			if(validPatternInput88)
			{
				if(config.before_plus_int() != null){
					config.before_plus_int().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_plus_int() != null){
					config.specialize_plus_int().adapt(vis, node, execCtx, data, config);
				} else {
					Object n = (((IntegerValue) data.getcomputed_left()).getValue() + ((IntegerValue) data.getcomputed_right()).getValue());
					IntegerValue integerValue4 = SdFactory.eINSTANCE.createIntegerValue();
					integerValue4.setValue((java.lang.Integer) n);
					IntegerValue out = integerValue4;
					result = out;
				}
				
				if(config.after_plus_int() != null){
					if(result == null){
						config.after_plus_int().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_plus_int().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
