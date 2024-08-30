package html_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import html_ASOS.operations.data.HTMLNodeRootData;
import html_ASOS.ASOS.Termination;
import html_ASOS.*;
import html_ASOS.Html_ASOSFactory;
import html_ASOS.interfaces.html_ASOSInterface;
import html_ASOS.sd.*;

@Operationalize(node = HTMLNodeRoot.class, visitor = "html_ASOS.interpreter.Html_ASOSVisitor")
public class HTMLNodeRootOp extends AdaptiveOperation<HTMLNodeRoot, html_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, HTMLNodeRoot node, Object execCtxObj, html_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		HTMLNodeRootData data = new HTMLNodeRootData(node);
		
		while(true){
			Object termination = null;
			HTMLNodeRootData local_data = new HTMLNodeRootData(node);
		
			boolean validPatternInput1 = true;
			if(validPatternInput1)
			{
				if(data.getcomputed_root() == null){
					local_data.setcomputed_root(((Node) node.getRoot()).accept(vis, execCtx));
					if(!(local_data.getcomputed_root() instanceof Termination)){
						if(config.before_doctype_eval() != null){
							config.before_doctype_eval().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_doctype_eval() != null){
							config.specialize_doctype_eval().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_root(local_data.getcomputed_root());
						}
						
						if(config.after_doctype_eval() != null){
							if(result == null){
								config.after_doctype_eval().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_doctype_eval().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_root();
					}
				}
			}
			boolean validPatternInput2 = true && (data.getcomputed_root() instanceof StringValue);
			if(validPatternInput2)
			{
				if(config.before_doctype_produce() != null){
					config.before_doctype_produce().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_doctype_produce() != null){
					config.specialize_doctype_produce().adapt(vis, node, execCtx, data, config);
				} else {
					Object outVal = ("<!DOCTYPE html>" + ((StringValue) data.getcomputed_root()).getValue());
					StringValue stringValue0 = SdFactory.eINSTANCE.createStringValue();
					stringValue0.setValue((java.lang.String) outVal);
					StringValue toOut = stringValue0;
					Object out = toOut;
					result = out;
				}
				
				if(config.after_doctype_produce() != null){
					if(result == null){
						config.after_doctype_produce().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_doctype_produce().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
