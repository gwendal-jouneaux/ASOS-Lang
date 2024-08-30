package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.NegData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = Neg.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class NegOp extends AdaptiveOperation<Neg, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Neg node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		NegData data = new NegData(node);
		
		while(true){
			Object termination = null;
			NegData local_data = new NegData(node);
		
			boolean validPatternInput20 = true;
			if(validPatternInput20)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_neg_expr() != null){
							config.before_neg_expr().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_neg_expr() != null){
							config.specialize_neg_expr().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_neg_expr() != null){
							if(result == null){
								config.after_neg_expr().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_neg_expr().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput21 = true && (data.getcomputed_expression() instanceof IntegerValue);
			if(validPatternInput21)
			{
				if(config.before_neg_done() != null){
					config.before_neg_done().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_neg_done() != null){
					config.specialize_neg_done().adapt(vis, node, execCtx, data, config);
				} else {
					Object negValue = (-((IntegerValue) data.getcomputed_expression()).getValue());
					IntegerValue integerValue0 = SdFactory.eINSTANCE.createIntegerValue();
					integerValue0.setValue((java.lang.Integer) negValue);
					IntegerValue out = integerValue0;
					result = out;
				}
				
				if(config.after_neg_done() != null){
					if(result == null){
						config.after_neg_done().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_neg_done().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
