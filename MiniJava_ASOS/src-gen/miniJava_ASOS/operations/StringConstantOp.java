package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.StringConstantData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = StringConstant.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class StringConstantOp extends AdaptiveOperation<StringConstant, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, StringConstant node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		StringConstantData data = new StringConstantData(node);
		
		while(true){
			Object termination = null;
			StringConstantData local_data = new StringConstantData(node);
		
			boolean validPatternInput37 = true;
			if(validPatternInput37)
			{
				if(config.before_StringConst() != null){
					config.before_StringConst().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_StringConst() != null){
					config.specialize_StringConst().adapt(vis, node, execCtx, data, config);
				} else {
					StringValue stringValue0 = SdFactory.eINSTANCE.createStringValue();
					stringValue0.setValue((java.lang.String) (data.getcomputed_value() == null ? node.getValue() : data.getcomputed_value()));
					StringValue out = stringValue0;
					result = out;
				}
				
				if(config.after_StringConst() != null){
					if(result == null){
						config.after_StringConst().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_StringConst().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
