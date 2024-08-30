package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.MethodData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = Method.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class MethodOp extends AdaptiveOperation<Method, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Method node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		MethodData data = new MethodData(node);
		
		while(true){
			Object termination = null;
			MethodData local_data = new MethodData(node);
		
			boolean validPatternInput49 = true;
			if(validPatternInput49)
			{
				if(config.before_method_body() != null){
					config.before_method_body().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_method_body() != null){
					config.specialize_method_body().adapt(vis, node, execCtx, data, config);
				} else {
					result = (data.getcomputed_body() == null ? node.getBody() : data.getcomputed_body());
				}
				
				if(config.after_method_body() != null){
					if(result == null){
						config.after_method_body().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_method_body().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
