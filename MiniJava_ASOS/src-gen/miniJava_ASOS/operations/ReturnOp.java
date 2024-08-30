package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.ReturnData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = Return.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class ReturnOp extends AdaptiveOperation<Return, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Return node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		ReturnData data = new ReturnData(node);
		
		while(true){
			Object termination = null;
			ReturnData local_data = new ReturnData(node);
		
			boolean validPatternInput18 = true;
			if(validPatternInput18)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_return_expr() != null){
							config.before_return_expr().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_return_expr() != null){
							config.specialize_return_expr().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_return_expr() != null){
							if(result == null){
								config.after_return_expr().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_return_expr().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput19 = true && (data.getcomputed_expression() instanceof Value);
			if(validPatternInput19)
			{
				if(config.before_return_val() != null){
					config.before_return_val().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_return_val() != null){
					config.specialize_return_val().adapt(vis, node, execCtx, data, config);
				} else {
					ReturnValue returnValue0 = SdFactory.eINSTANCE.createReturnValue();
					returnValue0.setValue(EcoreUtil.copy((Value) ((Value) data.getcomputed_expression())));
					ReturnValue out = returnValue0;
					result = new Termination(out);
				}
				
				if(config.after_return_val() != null){
					if(result == null){
						config.after_return_val().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_return_val().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
