package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.ThisData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = This.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class ThisOp extends AdaptiveOperation<This, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, This node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		ThisData data = new ThisData(node);
		
		while(true){
			Object termination = null;
			ThisData local_data = new ThisData(node);
		
			boolean validPatternInput69 = true;
			if(validPatternInput69)
			{
				if(config.before_thisvalue() != null){
					config.before_thisvalue().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_thisvalue() != null){
					config.specialize_thisvalue().adapt(vis, node, execCtx, data, config);
				} else {
					Object inst = execCtx.getFrame().getInstance();
					ObjectRefValue objectRefValue1 = SdFactory.eINSTANCE.createObjectRefValue();
					objectRefValue1.setInstance(EcoreUtil.copy((ObjectInstance) inst));
					ObjectRefValue toInstref = objectRefValue1;
					Object instref = toInstref;
					result = instref;
				}
				
				if(config.after_thisvalue() != null){
					if(result == null){
						config.after_thisvalue().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_thisvalue().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
