package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.WhileStatementData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = WhileStatement.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class WhileStatementOp extends AdaptiveOperation<WhileStatement, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, WhileStatement node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		WhileStatementData data = new WhileStatementData(node);
		
		while(true){
			Object termination = null;
			WhileStatementData local_data = new WhileStatementData(node);
		
			boolean validPatternInput58 = true;
			if(validPatternInput58)
			{
				if(data.getcomputed_condition() == null){
					local_data.setcomputed_condition(((Node) node.getCondition()).accept(vis, execCtx));
					if(!(local_data.getcomputed_condition() instanceof Termination)){
						if(config.before_loop_cond() != null){
							config.before_loop_cond().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_loop_cond() != null){
							config.specialize_loop_cond().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_condition(local_data.getcomputed_condition());
							 // prelude
							((State) execCtx).pushContext();
						}
						
						if(config.after_loop_cond() != null){
							if(result == null){
								config.after_loop_cond().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_loop_cond().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_condition();
					}
				}
			}
			boolean validPatternInput59 = true && (data.getcomputed_condition() instanceof BooleanValue);
			if(validPatternInput59)
			{
				if((((BooleanValue) data.getcomputed_condition()).getValue().equals(true))){
					if(data.getcomputed_block() == null){
						local_data.setcomputed_block(((Node) node.getBlock()).accept(vis, execCtx));
						if(!(local_data.getcomputed_block() instanceof Termination)){
							if(config.before_loop_true_exec() != null){
								config.before_loop_true_exec().adapt(vis, node, execCtx, data, config);
							}
							
							if(config.specialize_loop_true_exec() != null){
								config.specialize_loop_true_exec().adapt(vis, node, execCtx, data, config);
							} else {
								data.setcomputed_block(local_data.getcomputed_block());
							}
							
							if(config.after_loop_true_exec() != null){
								if(result == null){
									config.after_loop_true_exec().adapt(vis, node, execCtx, data, config);
								} else {
									config.after_loop_true_exec().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
							termination = local_data.getcomputed_block();
						}
					}
				}
			}
			boolean validPatternInput60 = true && (data.getcomputed_condition() instanceof BooleanValue);
			if(validPatternInput60)
			{
				if((((BooleanValue) data.getcomputed_condition()).getValue().equals(false))){
					if(config.before_loop_false() != null){
						config.before_loop_false().adapt(vis, node, execCtx, data, config);
					}
					
					if(config.specialize_loop_false() != null){
						config.specialize_loop_false().adapt(vis, node, execCtx, data, config);
					} else {
						NullValue nullValue4 = SdFactory.eINSTANCE.createNullValue();
						NullValue out = nullValue4;
						result = out;
						 // prelude
						((State) execCtx).popContext();
					}
					
					if(config.after_loop_false() != null){
						if(result == null){
							config.after_loop_false().adapt(vis, node, execCtx, data, config);
						} else {
							config.after_loop_false().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput61 = true && (data.getcomputed_condition() instanceof BooleanValue) && (data.getcomputed_block() instanceof NullValue);
			if(validPatternInput61)
			{
				if((((BooleanValue) data.getcomputed_condition()).getValue().equals(true))){
					if(config.before_loop_true_done() != null){
						config.before_loop_true_done().adapt(vis, node, execCtx, data, config);
					}
					
					if(config.specialize_loop_true_done() != null){
						config.specialize_loop_true_done().adapt(vis, node, execCtx, data, config);
					} else {
						data = new WhileStatementData(node);
						local_data = new WhileStatementData(node);
						 // prelude
						((State) execCtx).popContext();
					}
					
					if(config.after_loop_true_done() != null){
						if(result == null){
							config.after_loop_true_done().adapt(vis, node, execCtx, data, config);
						} else {
							config.after_loop_true_done().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
