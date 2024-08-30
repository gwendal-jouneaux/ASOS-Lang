package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.WriteImageData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = WriteImage.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class WriteImageOp extends AdaptiveOperation<WriteImage, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, WriteImage node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		WriteImageData data = new WriteImageData(node);
		
		while(true){
			Object termination = null;
			WriteImageData local_data = new WriteImageData(node);
		
			boolean validPatternInput14 = true;
			if(validPatternInput14)
			{
				if(data.getcomputed_path() == null){
					local_data.setcomputed_path(((Node) node.getPath()).accept(vis, execCtx));
					if(!(local_data.getcomputed_path() instanceof Termination)){
						if(config.before_write_image_path() != null){
							config.before_write_image_path().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_write_image_path() != null){
							config.specialize_write_image_path().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_path(local_data.getcomputed_path());
						}
						
						if(config.after_write_image_path() != null){
							if(result == null){
								config.after_write_image_path().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_write_image_path().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput15 = true && (data.getcomputed_path() instanceof StringValue);
			if(validPatternInput15)
			{
				if(data.getcomputed_image() == null){
					local_data.setcomputed_image(((Node) node.getImage()).accept(vis, execCtx));
					if(!(local_data.getcomputed_image() instanceof Termination)){
						if(config.before_write_image_image() != null){
							config.before_write_image_image().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_write_image_image() != null){
							config.specialize_write_image_image().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_image(local_data.getcomputed_image());
						}
						
						if(config.after_write_image_image() != null){
							if(result == null){
								config.after_write_image_image().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_write_image_image().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_image();
					}
				}
			}
			boolean validPatternInput16 = true && (data.getcomputed_path() instanceof StringValue) && (data.getcomputed_image() instanceof ArrayRefValue);
			if(validPatternInput16)
			{
				if(config.before_write_image() != null){
					config.before_write_image().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_write_image() != null){
					config.specialize_write_image().adapt(vis, node, execCtx, data, config);
				} else {
					NullValue nullValue0 = SdFactory.eINSTANCE.createNullValue();
					NullValue out = nullValue0;
					result = out;
					 // prelude
					((State) execCtx).writeImage((java.lang.String) ((StringValue) data.getcomputed_path()).getValue(), (ArrayInstance) ((ArrayRefValue) data.getcomputed_image()).getInstance());
				}
				
				if(config.after_write_image() != null){
					if(result == null){
						config.after_write_image().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_write_image().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
