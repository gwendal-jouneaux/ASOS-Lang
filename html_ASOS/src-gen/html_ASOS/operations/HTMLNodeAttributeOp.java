package html_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import html_ASOS.operations.data.HTMLNodeAttributeData;
import html_ASOS.ASOS.Termination;
import html_ASOS.*;
import html_ASOS.Html_ASOSFactory;
import html_ASOS.interfaces.html_ASOSInterface;
import html_ASOS.sd.*;

@Operationalize(node = HTMLNodeAttribute.class, visitor = "html_ASOS.interpreter.Html_ASOSVisitor")
public class HTMLNodeAttributeOp extends AdaptiveOperation<HTMLNodeAttribute, html_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, HTMLNodeAttribute node, Object execCtxObj, html_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		HTMLNodeAttributeData data = new HTMLNodeAttributeData(node);
		
		while(true){
			Object termination = null;
			HTMLNodeAttributeData local_data = new HTMLNodeAttributeData(node);
		
			boolean validPatternInput4 = true;
			if(validPatternInput4)
			{
				if(config.before_attribute() != null){
					config.before_attribute().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_attribute() != null){
					config.specialize_attribute().adapt(vis, node, execCtx, data, config);
				} else {
					Object outVal = (((((" " + (data.getcomputed_name() == null ? node.getName() : data.getcomputed_name())) + "=") + node.getType().getLiteral()) + (data.getcomputed_value() == null ? node.getValue() : data.getcomputed_value())) + node.getType().getLiteral());
					StringValue stringValue2 = SdFactory.eINSTANCE.createStringValue();
					stringValue2.setValue((java.lang.String) outVal);
					StringValue toOut = stringValue2;
					Object out = toOut;
					result = out;
				}
				
				if(config.after_attribute() != null){
					if(result == null){
						config.after_attribute().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_attribute().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
