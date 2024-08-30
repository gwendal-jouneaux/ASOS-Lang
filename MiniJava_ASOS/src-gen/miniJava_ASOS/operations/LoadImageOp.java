package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.LoadImageData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = LoadImage.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class LoadImageOp extends AdaptiveOperation<LoadImage, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, LoadImage node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		LoadImageData data = new LoadImageData(node);
		
		while(true){
			Object termination = null;
			LoadImageData local_data = new LoadImageData(node);
		
			boolean validPatternInput71 = true;
			if(validPatternInput71)
			{
				if(data.getcomputed_path() == null){
					local_data.setcomputed_path(((Node) node.getPath()).accept(vis, execCtx));
					if(!(local_data.getcomputed_path() instanceof Termination)){
						if(config.before_load_image_path() != null){
							config.before_load_image_path().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_load_image_path() != null){
							config.specialize_load_image_path().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_path(local_data.getcomputed_path());
						}
						
						if(config.after_load_image_path() != null){
							if(result == null){
								config.after_load_image_path().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_load_image_path().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_path();
					}
				}
			}
			boolean validPatternInput72 = true && (data.getcomputed_path() instanceof StringValue);
			if(validPatternInput72)
			{
				if(config.before_load_image() != null){
					config.before_load_image().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_load_image() != null){
					config.specialize_load_image().adapt(vis, node, execCtx, data, config);
				} else {
					 // prelude
					ArrayRefValue ref = ((State) execCtx).readImage((java.lang.String) ((StringValue) data.getcomputed_path()).getValue());
					result = ref;
				}
				
				if(config.after_load_image() != null){
					if(result == null){
						config.after_load_image().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_load_image().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
