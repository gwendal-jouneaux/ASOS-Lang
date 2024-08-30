package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.FieldAccessData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = FieldAccess.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class FieldAccessOp extends AdaptiveOperation<FieldAccess, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, FieldAccess node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		FieldAccessData data = new FieldAccessData(node);
		
		while(true){
			Object termination = null;
			FieldAccessData local_data = new FieldAccessData(node);
		
			boolean validPatternInput78 = true;
			if(validPatternInput78)
			{
				if(config.before_field_access() != null){
					config.before_field_access().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_field_access() != null){
					config.specialize_field_access().adapt(vis, node, execCtx, data, config);
				} else {
					Object val = ((State) execCtx).getSymbolValue((Assignee) node);
					result = val;
				}
				
				if(config.after_field_access() != null){
					if(result == null){
						config.after_field_access().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_field_access().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
