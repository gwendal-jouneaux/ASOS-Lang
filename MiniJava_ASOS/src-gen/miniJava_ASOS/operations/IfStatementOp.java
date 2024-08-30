package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.IfStatementData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = IfStatement.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class IfStatementOp extends AdaptiveOperation<IfStatement, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, IfStatement node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		IfStatementData data = new IfStatementData(node);
		
		while(true){
			Object termination = null;
			IfStatementData local_data = new IfStatementData(node);
		
			boolean validPatternInput73 = true;
			if(validPatternInput73)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_if_cond() != null){
							config.before_if_cond().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_if_cond() != null){
							config.specialize_if_cond().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
							 // prelude
							((State) execCtx).pushContext();
						}
						
						if(config.after_if_cond() != null){
							if(result == null){
								config.after_if_cond().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_if_cond().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_expression();
					}
				}
			}
			boolean validPatternInput74 = true && (data.getcomputed_expression() instanceof BooleanValue);
			if(validPatternInput74)
			{
				if((((BooleanValue) data.getcomputed_expression()).getValue().equals(true))){
					if(data.getcomputed_thenBlock() == null){
						local_data.setcomputed_thenBlock(((Node) node.getThenBlock()).accept(vis, execCtx));
						if(!(local_data.getcomputed_thenBlock() instanceof Termination)){
							if(config.before_if_true() != null){
								config.before_if_true().adapt(vis, node, execCtx, data, config);
							}
							
							if(config.specialize_if_true() != null){
								config.specialize_if_true().adapt(vis, node, execCtx, data, config);
							} else {
								data.setcomputed_thenBlock(local_data.getcomputed_thenBlock());
							}
							
							if(config.after_if_true() != null){
								if(result == null){
									config.after_if_true().adapt(vis, node, execCtx, data, config);
								} else {
									config.after_if_true().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
							termination = local_data.getcomputed_thenBlock();
						}
					}
				}
			}
			boolean validPatternInput75 = true && (data.getcomputed_expression() instanceof BooleanValue);
			if(validPatternInput75)
			{
				if((((BooleanValue) data.getcomputed_expression()).getValue().equals(false))){
					if(data.getcomputed_elseBlock() == null){
						local_data.setcomputed_elseBlock(((Node) node.getElseBlock()).accept(vis, execCtx));
						if(!(local_data.getcomputed_elseBlock() instanceof Termination)){
							if(config.before_if_false() != null){
								config.before_if_false().adapt(vis, node, execCtx, data, config);
							}
							
							if(config.specialize_if_false() != null){
								config.specialize_if_false().adapt(vis, node, execCtx, data, config);
							} else {
								data.setcomputed_elseBlock(local_data.getcomputed_elseBlock());
							}
							
							if(config.after_if_false() != null){
								if(result == null){
									config.after_if_false().adapt(vis, node, execCtx, data, config);
								} else {
									config.after_if_false().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
							termination = local_data.getcomputed_elseBlock();
						}
					}
				}
			}
			boolean validPatternInput76 = true && (data.getcomputed_expression() instanceof Value) && (data.getcomputed_elseBlock() instanceof Value);
			if(validPatternInput76)
			{
				if(config.before_if_end_else() != null){
					config.before_if_end_else().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_if_end_else() != null){
					config.specialize_if_end_else().adapt(vis, node, execCtx, data, config);
				} else {
					NullValue nullValue6 = SdFactory.eINSTANCE.createNullValue();
					NullValue out = nullValue6;
					result = out;
					 // prelude
					((State) execCtx).popContext();
				}
				
				if(config.after_if_end_else() != null){
					if(result == null){
						config.after_if_end_else().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_if_end_else().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput77 = true && (data.getcomputed_expression() instanceof Value) && (data.getcomputed_thenBlock() instanceof Value);
			if(validPatternInput77)
			{
				if(config.before_if_end_if() != null){
					config.before_if_end_if().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_if_end_if() != null){
					config.specialize_if_end_if().adapt(vis, node, execCtx, data, config);
				} else {
					NullValue nullValue7 = SdFactory.eINSTANCE.createNullValue();
					NullValue out = nullValue7;
					result = out;
					 // prelude
					((State) execCtx).popContext();
				}
				
				if(config.after_if_end_if() != null){
					if(result == null){
						config.after_if_end_if().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_if_end_if().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
