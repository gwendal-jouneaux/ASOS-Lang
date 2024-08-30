package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.BoolConstantData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = BoolConstant.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class BoolConstantOp extends AdaptiveOperation<BoolConstant, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, BoolConstant node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		BoolConstantData data = new BoolConstantData(node);
		
		while(true){
			Object termination = null;
			BoolConstantData local_data = new BoolConstantData(node);
		
			boolean validPatternInput62 = true;
			if(validPatternInput62)
			{
				if(config.before_BoolConst() != null){
					config.before_BoolConst().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_BoolConst() != null){
					config.specialize_BoolConst().adapt(vis, node, execCtx, data, config);
				} else {
					BooleanValue booleanValue8 = SdFactory.eINSTANCE.createBooleanValue();
					booleanValue8.setValue((java.lang.Boolean) (data.getcomputed_value() == null ? node.getValue() : data.getcomputed_value()));
					BooleanValue out = booleanValue8;
					result = out;
				}
				
				if(config.after_BoolConst() != null){
					if(result == null){
						config.after_BoolConst().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_BoolConst().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
