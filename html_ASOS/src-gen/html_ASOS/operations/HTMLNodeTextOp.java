package html_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import html_ASOS.operations.data.HTMLNodeTextData;
import html_ASOS.ASOS.Termination;
import html_ASOS.*;
import html_ASOS.Html_ASOSFactory;
import html_ASOS.interfaces.html_ASOSInterface;
import html_ASOS.sd.*;

@Operationalize(node = HTMLNodeText.class, visitor = "html_ASOS.interpreter.Html_ASOSVisitor")
public class HTMLNodeTextOp extends AdaptiveOperation<HTMLNodeText, html_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, HTMLNodeText node, Object execCtxObj, html_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		HTMLNodeTextData data = new HTMLNodeTextData(node);
		
		while(true){
			Object termination = null;
			HTMLNodeTextData local_data = new HTMLNodeTextData(node);
		
			boolean validPatternInput3 = true;
			if(validPatternInput3)
			{
				if(config.before_plaintext() != null){
					config.before_plaintext().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_plaintext() != null){
					config.specialize_plaintext().adapt(vis, node, execCtx, data, config);
				} else {
					StringValue stringValue1 = SdFactory.eINSTANCE.createStringValue();
					stringValue1.setValue((java.lang.String) (data.getcomputed_content() == null ? node.getContent() : data.getcomputed_content()));
					StringValue out = stringValue1;
					result = out;
				}
				
				if(config.after_plaintext() != null){
					if(result == null){
						config.after_plaintext().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_plaintext().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
