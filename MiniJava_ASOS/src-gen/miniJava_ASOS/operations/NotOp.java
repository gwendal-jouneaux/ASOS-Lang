package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.NotData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = Not.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class NotOp extends AdaptiveOperation<Not, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Not node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		NotData data = new NotData(node);
		
		while(true){
			Object termination = null;
			NotData local_data = new NotData(node);
		
			boolean validPatternInput32 = true;
			if(validPatternInput32)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_not_expr() != null){
							config.before_not_expr().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_not_expr() != null){
							config.specialize_not_expr().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_not_expr() != null){
							if(result == null){
								config.after_not_expr().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_not_expr().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput33 = true && (data.getcomputed_expression() instanceof BooleanValue);
			if(validPatternInput33)
			{
				if(config.before_not_done() != null){
					config.before_not_done().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_not_done() != null){
					config.specialize_not_done().adapt(vis, node, execCtx, data, config);
				} else {
					Object notB = (!((BooleanValue) data.getcomputed_expression()).getValue());
					BooleanValue booleanValue5 = SdFactory.eINSTANCE.createBooleanValue();
					booleanValue5.setValue((java.lang.Boolean) notB);
					BooleanValue out = booleanValue5;
					result = out;
				}
				
				if(config.after_not_done() != null){
					if(result == null){
						config.after_not_done().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_not_done().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
