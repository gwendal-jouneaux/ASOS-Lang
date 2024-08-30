package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.NullData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = Null.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class NullOp extends AdaptiveOperation<Null, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Null node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		NullData data = new NullData(node);
		
		while(true){
			Object termination = null;
			NullData local_data = new NullData(node);
		
			boolean validPatternInput25 = true;
			if(validPatternInput25)
			{
				if(config.before_nullvalue() != null){
					config.before_nullvalue().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_nullvalue() != null){
					config.specialize_nullvalue().adapt(vis, node, execCtx, data, config);
				} else {
					NullValue nullValue1 = SdFactory.eINSTANCE.createNullValue();
					NullValue out = nullValue1;
					result = out;
				}
				
				if(config.after_nullvalue() != null){
					if(result == null){
						config.after_nullvalue().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_nullvalue().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
