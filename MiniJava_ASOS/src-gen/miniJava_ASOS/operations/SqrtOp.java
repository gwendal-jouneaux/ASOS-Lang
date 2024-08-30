package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.SqrtData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = Sqrt.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class SqrtOp extends AdaptiveOperation<Sqrt, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Sqrt node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		SqrtData data = new SqrtData(node);
		
		while(true){
			Object termination = null;
			SqrtData local_data = new SqrtData(node);
		
			boolean validPatternInput93 = true;
			if(validPatternInput93)
			{
				if(data.getcomputed_expression() == null){
					local_data.setcomputed_expression(((Node) node.getExpression()).accept(vis, execCtx));
					if(!(local_data.getcomputed_expression() instanceof Termination)){
						if(config.before_sqrt_expr() != null){
							config.before_sqrt_expr().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_sqrt_expr() != null){
							config.specialize_sqrt_expr().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_expression(local_data.getcomputed_expression());
						}
						
						if(config.after_sqrt_expr() != null){
							if(result == null){
								config.after_sqrt_expr().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_sqrt_expr().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput94 = true && (data.getcomputed_expression() instanceof IntegerValue);
			if(validPatternInput94)
			{
				if(config.before_sqrt() != null){
					config.before_sqrt().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_sqrt() != null){
					config.specialize_sqrt().adapt(vis, node, execCtx, data, config);
				} else {
					Object value = ((State) execCtx).sqrt((java.lang.Integer) ((IntegerValue) data.getcomputed_expression()).getValue());
					IntegerValue integerValue6 = SdFactory.eINSTANCE.createIntegerValue();
					integerValue6.setValue((java.lang.Integer) value);
					IntegerValue toRes = integerValue6;
					Object res = toRes;
					result = res;
				}
				
				if(config.after_sqrt() != null){
					if(result == null){
						config.after_sqrt().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_sqrt().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
