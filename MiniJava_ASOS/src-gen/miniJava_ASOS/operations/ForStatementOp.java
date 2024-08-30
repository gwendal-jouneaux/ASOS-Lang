package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.ForStatementData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = ForStatement.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class ForStatementOp extends AdaptiveOperation<ForStatement, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, ForStatement node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		ForStatementData data = new ForStatementData(node);
		
		while(true){
			Object termination = null;
			ForStatementData local_data = new ForStatementData(node);
		
			boolean validPatternInput63 = true;
			if(validPatternInput63)
			{
				if(data.getcomputed_declaration() == null){
					local_data.setcomputed_declaration(((Node) node.getDeclaration()).accept(vis, execCtx));
					if(!(local_data.getcomputed_declaration() instanceof Termination)){
						if(config.before_for_decl() != null){
							config.before_for_decl().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_for_decl() != null){
							config.specialize_for_decl().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_declaration(local_data.getcomputed_declaration());
						}
						
						if(config.after_for_decl() != null){
							if(result == null){
								config.after_for_decl().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_for_decl().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_declaration();
					}
				}
			}
			boolean validPatternInput64 = true && (data.getcomputed_condition() instanceof BooleanValue);
			if(validPatternInput64)
			{
				if((((BooleanValue) data.getcomputed_condition()).getValue().equals(true))){
					if(data.getcomputed_block() == null){
						local_data.setcomputed_block(((Node) node.getBlock()).accept(vis, execCtx));
						if(!(local_data.getcomputed_block() instanceof Termination)){
							if(config.before_for_true_exec() != null){
								config.before_for_true_exec().adapt(vis, node, execCtx, data, config);
							}
							
							if(config.specialize_for_true_exec() != null){
								config.specialize_for_true_exec().adapt(vis, node, execCtx, data, config);
							} else {
								data.setcomputed_block(local_data.getcomputed_block());
								 // prelude
								((State) execCtx).popContext();
							}
							
							if(config.after_for_true_exec() != null){
								if(result == null){
									config.after_for_true_exec().adapt(vis, node, execCtx, data, config);
								} else {
									config.after_for_true_exec().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput65 = true && (data.getcomputed_condition() instanceof BooleanValue);
			if(validPatternInput65)
			{
				if((((BooleanValue) data.getcomputed_condition()).getValue().equals(false))){
					if(config.before_for_false() != null){
						config.before_for_false().adapt(vis, node, execCtx, data, config);
					}
					
					if(config.specialize_for_false() != null){
						config.specialize_for_false().adapt(vis, node, execCtx, data, config);
					} else {
						NullValue nullValue5 = SdFactory.eINSTANCE.createNullValue();
						NullValue out = nullValue5;
						result = out;
						 // prelude
						((State) execCtx).popContext();
					}
					
					if(config.after_for_false() != null){
						if(result == null){
							config.after_for_false().adapt(vis, node, execCtx, data, config);
						} else {
							config.after_for_false().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput66 = true && (data.getcomputed_condition() instanceof BooleanValue) && (data.getcomputed_block() instanceof NullValue);
			if(validPatternInput66)
			{
				if(data.getcomputed_progression() == null){
					local_data.setcomputed_progression(((Node) node.getProgression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_progression() instanceof Termination)){
						if(config.before_for_true_prog() != null){
							config.before_for_true_prog().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_for_true_prog() != null){
							config.specialize_for_true_prog().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_progression(local_data.getcomputed_progression());
						}
						
						if(config.after_for_true_prog() != null){
							if(result == null){
								config.after_for_true_prog().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_for_true_prog().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_progression();
					}
				}
			}
			boolean validPatternInput67 = true && (data.getcomputed_condition() instanceof BooleanValue) && (data.getcomputed_progression() instanceof Value) && (data.getcomputed_block() instanceof NullValue);
			if(validPatternInput67)
			{
				if(config.before_for_true_loop() != null){
					config.before_for_true_loop().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_for_true_loop() != null){
					config.specialize_for_true_loop().adapt(vis, node, execCtx, data, config);
				} else {
					data.setcomputed_condition(null);
					data.setcomputed_progression(null);
					data.setcomputed_block(null);
				}
				
				if(config.after_for_true_loop() != null){
					if(result == null){
						config.after_for_true_loop().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_for_true_loop().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput68 = true && (data.getcomputed_declaration() instanceof Value);
			if(validPatternInput68)
			{
				if(data.getcomputed_condition() == null){
					local_data.setcomputed_condition(((Node) node.getCondition()).accept(vis, execCtx));
					if(!(local_data.getcomputed_condition() instanceof Termination)){
						if(config.before_for_cond() != null){
							config.before_for_cond().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_for_cond() != null){
							config.specialize_for_cond().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_condition(local_data.getcomputed_condition());
							 // prelude
							((State) execCtx).pushContext();
						}
						
						if(config.after_for_cond() != null){
							if(result == null){
								config.after_for_cond().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_for_cond().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
		
			return termination;
		}
	}
}
