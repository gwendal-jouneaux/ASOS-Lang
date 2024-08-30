package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.SymbolRefData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = SymbolRef.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class SymbolRefOp extends AdaptiveOperation<SymbolRef, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, SymbolRef node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		SymbolRefData data = new SymbolRefData(node);
		
		while(true){
			Object termination = null;
			SymbolRefData local_data = new SymbolRefData(node);
		
			boolean validPatternInput38 = true;
			if(validPatternInput38)
			{
				if(config.before_symbol_ref() != null){
					config.before_symbol_ref().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_symbol_ref() != null){
					config.specialize_symbol_ref().adapt(vis, node, execCtx, data, config);
				} else {
					Object n = ((State) execCtx).getSymbolValue((Assignee) node);
					result = n;
				}
				
				if(config.after_symbol_ref() != null){
					if(result == null){
						config.after_symbol_ref().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_symbol_ref().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
