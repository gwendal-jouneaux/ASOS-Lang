package html_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import html_ASOS.operations.data.HTMLNodeBlockTagData;
import html_ASOS.ASOS.Termination;
import html_ASOS.*;
import html_ASOS.Html_ASOSFactory;
import html_ASOS.interfaces.html_ASOSInterface;
import html_ASOS.sd.*;

@Operationalize(node = HTMLNodeBlockTag.class, visitor = "html_ASOS.interpreter.Html_ASOSVisitor")
public class HTMLNodeBlockTagOp extends AdaptiveOperation<HTMLNodeBlockTag, html_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, HTMLNodeBlockTag node, Object execCtxObj, html_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		HTMLNodeBlockTagData data = new HTMLNodeBlockTagData(node);
		
		while(true){
			Object termination = null;
			HTMLNodeBlockTagData local_data = new HTMLNodeBlockTagData(node);
		
			boolean validPatternInput9 = true && (node.getAttributes() instanceof List && node.getAttributes().size() > data.getindex_attributes());
			if(validPatternInput9)
			{
				if(data.getcomputed_attributes().get(data.getindex_attributes()) == null){
					local_data.getcomputed_attributes().set(data.getindex_attributes(), (((Node) node.getAttributes().get(data.getindex_attributes())).accept(vis, execCtx)));
					if(!(local_data.getcomputed_attributes().get(data.getindex_attributes()) instanceof Termination)){
						if(config.before_block_tag_attr() != null){
							config.before_block_tag_attr().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_block_tag_attr() != null){
							config.specialize_block_tag_attr().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_attributes(data.getindex_attributes(),local_data.getcomputed_attributes().get(data.getindex_attributes()));
						}
						
						if(config.after_block_tag_attr() != null){
							if(result == null){
								config.after_block_tag_attr().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_block_tag_attr().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput10 = true && (node.getAttributes() instanceof List && node.getAttributes().size() > data.getindex_attributes()) && (data.getcomputed_attributes().get(data.getindex_attributes()) instanceof StringValue);
			if(validPatternInput10)
			{
				if(config.before_block_tag_val() != null){
					config.before_block_tag_val().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_block_tag_val() != null){
					config.specialize_block_tag_val().adapt(vis, node, execCtx, data, config);
				} else {
					data.incindex_attributes();
				}
				
				if(config.after_block_tag_val() != null){
					if(result == null){
						config.after_block_tag_val().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_block_tag_val().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput11 = true && (node.getAttributes() instanceof List && node.getAttributes().size() <= data.getindex_attributes()) && (node.getChildren() instanceof List && node.getChildren().size() > data.getindex_children());
			if(validPatternInput11)
			{
				if(data.getcomputed_children().get(data.getindex_children()) == null){
					local_data.getcomputed_children().set(data.getindex_children(), (((Node) node.getChildren().get(data.getindex_children())).accept(vis, execCtx)));
					if(!(local_data.getcomputed_children().get(data.getindex_children()) instanceof Termination)){
						if(config.before_block_tag_child() != null){
							config.before_block_tag_child().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_block_tag_child() != null){
							config.specialize_block_tag_child().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_children(data.getindex_children(),local_data.getcomputed_children().get(data.getindex_children()));
						}
						
						if(config.after_block_tag_child() != null){
							if(result == null){
								config.after_block_tag_child().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_block_tag_child().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_children().get(data.getindex_children());
					}
				}
			}
			boolean validPatternInput12 = true && (node.getAttributes() instanceof List && node.getAttributes().size() <= data.getindex_attributes()) && (node.getChildren() instanceof List && node.getChildren().size() > data.getindex_children()) && (data.getcomputed_children().get(data.getindex_children()) instanceof StringValue);
			if(validPatternInput12)
			{
				if(config.before_block_tag_child_val() != null){
					config.before_block_tag_child_val().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_block_tag_child_val() != null){
					config.specialize_block_tag_child_val().adapt(vis, node, execCtx, data, config);
				} else {
					data.incindex_children();
				}
				
				if(config.after_block_tag_child_val() != null){
					if(result == null){
						config.after_block_tag_child_val().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_block_tag_child_val().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput13 = true && (node.getAttributes() instanceof List && node.getAttributes().size() <= data.getindex_attributes()) && (node.getChildren() instanceof List && node.getChildren().size() <= data.getindex_children());
			if(validPatternInput13)
			{
				if((!(true && ((data.getcomputed_tag() == null ? node.getTag() : data.getcomputed_tag()) instanceof StringValue)))){
					if(config.before_block_tag_prepare() != null){
						config.before_block_tag_prepare().adapt(vis, node, execCtx, data, config);
					}
					
					if(config.specialize_block_tag_prepare() != null){
						config.specialize_block_tag_prepare().adapt(vis, node, execCtx, data, config);
					} else {
						StringValue stringValue5 = SdFactory.eINSTANCE.createStringValue();
						stringValue5.setValue((java.lang.String) (data.getcomputed_tag() == null ? node.getTag() : data.getcomputed_tag()));
						data.setcomputed_tag(stringValue5);
					}
					
					if(config.after_block_tag_prepare() != null){
						if(result == null){
							config.after_block_tag_prepare().adapt(vis, node, execCtx, data, config);
						} else {
							config.after_block_tag_prepare().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput14 = true && (data.getcomputed_tag() instanceof StringValue);
			if(validPatternInput14)
			{
				if(config.before_block_tag_end() != null){
					config.before_block_tag_end().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_block_tag_end() != null){
					config.specialize_block_tag_end().adapt(vis, node, execCtx, data, config);
				} else {
					Object strAttr = ((State) execCtx).join((org.eclipse.emf.common.util.EList) (data.getcomputed_attributes() == null ? node.getAttributes() : data.getcomputed_attributes()));
					Object strChildren = ((State) execCtx).join((org.eclipse.emf.common.util.EList) (data.getcomputed_children() == null ? node.getChildren() : data.getcomputed_children()));
					Object outStr = ((((((("<" + ((StringValue) data.getcomputed_tag()).getValue()) + strAttr) + ">") + strChildren) + "</") + ((StringValue) data.getcomputed_tag()).getValue()) + ">");
					StringValue stringValue6 = SdFactory.eINSTANCE.createStringValue();
					stringValue6.setValue((java.lang.String) outStr);
					StringValue out = stringValue6;
					result = out;
				}
				
				if(config.after_block_tag_end() != null){
					if(result == null){
						config.after_block_tag_end().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_block_tag_end().adapt(vis, ((AdaptableNode<html_ASOSInterface>) result), execCtx, null, config);
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
