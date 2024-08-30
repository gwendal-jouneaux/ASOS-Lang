package html_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import html_ASOS.operations.data.HTMLNodeEmptyTagData;
import html_ASOS.ASOS.Termination;
import html_ASOS.*;
import html_ASOS.Html_ASOSFactory;
import html_ASOS.interfaces.html_ASOSInterface;
import html_ASOS.sd.*;

@Operationalize(node = HTMLNodeEmptyTag.class, visitor = "html_ASOS.interpreter.Html_ASOSVisitor")
public class HTMLNodeEmptyTagOp extends AdaptiveOperation<HTMLNodeEmptyTag, html_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, HTMLNodeEmptyTag node, Object execCtxObj, html_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		HTMLNodeEmptyTagData data = new HTMLNodeEmptyTagData(node);
		
		while(true){
			Object termination = null;
			HTMLNodeEmptyTagData local_data = new HTMLNodeEmptyTagData(node);
		
			boolean validPatternInput5 = true && (node.getAttributes() instanceof List && node.getAttributes().size() > data.getindex_attributes());
			if(validPatternInput5)
			{
				if(data.getcomputed_attributes().get(data.getindex_attributes()) == null){
					local_data.getcomputed_attributes().set(data.getindex_attributes(), (((Node) node.getAttributes().get(data.getindex_attributes())).accept(vis, execCtx)));
					if(!(local_data.getcomputed_attributes().get(data.getindex_attributes()) instanceof Termination)){
						if(config.before_empty_tag_attr() != null){
							config.before_empty_tag_attr().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_empty_tag_attr() != null){
							config.specialize_empty_tag_attr().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_attributes(data.getindex_attributes(),local_data.getcomputed_attributes().get(data.getindex_attributes()));
						}
						
						if(config.after_empty_tag_attr() != null){
							if(result == null){
								config.after_empty_tag_attr().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_empty_tag_attr().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_attributes().get(data.getindex_attributes());
					}
				}
			}
			boolean validPatternInput6 = true && (node.getAttributes() instanceof List && node.getAttributes().size() > data.getindex_attributes()) && (data.getcomputed_attributes().get(data.getindex_attributes()) instanceof StringValue);
			if(validPatternInput6)
			{
				if(config.before_empty_tag_val() != null){
					config.before_empty_tag_val().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_empty_tag_val() != null){
					config.specialize_empty_tag_val().adapt(vis, node, execCtx, data, config);
				} else {
					data.incindex_attributes();
				}
				
				if(config.after_empty_tag_val() != null){
					if(result == null){
						config.after_empty_tag_val().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_empty_tag_val().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput7 = true && (node.getAttributes() instanceof List && node.getAttributes().size() <= data.getindex_attributes());
			if(validPatternInput7)
			{
				if((!(true && ((data.getcomputed_tag() == null ? node.getTag() : data.getcomputed_tag()) instanceof StringValue)))){
					if(config.before_empty_tag_tag() != null){
						config.before_empty_tag_tag().adapt(vis, node, execCtx, data, config);
					}
					
					if(config.specialize_empty_tag_tag() != null){
						config.specialize_empty_tag_tag().adapt(vis, node, execCtx, data, config);
					} else {
						StringValue stringValue3 = SdFactory.eINSTANCE.createStringValue();
						stringValue3.setValue((java.lang.String) (data.getcomputed_tag() == null ? node.getTag() : data.getcomputed_tag()));
						StringValue toStr = stringValue3;
						Object str = toStr;
						data.setcomputed_tag(str);
					}
					
					if(config.after_empty_tag_tag() != null){
						if(result == null){
							config.after_empty_tag_tag().adapt(vis, node, execCtx, data, config);
						} else {
							config.after_empty_tag_tag().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
			}
			boolean validPatternInput8 = true && (data.getcomputed_tag() instanceof StringValue);
			if(validPatternInput8)
			{
				if(config.before_empty_tag_end() != null){
					config.before_empty_tag_end().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_empty_tag_end() != null){
					config.specialize_empty_tag_end().adapt(vis, node, execCtx, data, config);
				} else {
					Object strAttrs = ((State) execCtx).join((org.eclipse.emf.common.util.EList) (data.getcomputed_attributes() == null ? node.getAttributes() : data.getcomputed_attributes()));
					Object outStr = ((("<" + ((StringValue) data.getcomputed_tag()).getValue()) + strAttrs) + "/>");
					StringValue stringValue4 = SdFactory.eINSTANCE.createStringValue();
					stringValue4.setValue((java.lang.String) outStr);
					StringValue out = stringValue4;
					result = out;
				}
				
				if(config.after_empty_tag_end() != null){
					if(result == null){
						config.after_empty_tag_end().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_empty_tag_end().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
