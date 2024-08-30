package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.ArrayAccessData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = ArrayAccess.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class ArrayAccessOp extends AdaptiveOperation<ArrayAccess, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, ArrayAccess node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		ArrayAccessData data = new ArrayAccessData(node);
		
		while(true){
			Object termination = null;
			ArrayAccessData local_data = new ArrayAccessData(node);
		
			boolean validPatternInput5 = true;
			if(validPatternInput5)
			{
				if(data.getcomputed_object() == null){
					local_data.setcomputed_object(((Node) node.getObject()).accept(vis, execCtx));
					if(!(local_data.getcomputed_object() instanceof Termination)){
						if(config.before_array_access_ref() != null){
							config.before_array_access_ref().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_array_access_ref() != null){
							config.specialize_array_access_ref().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_object(local_data.getcomputed_object());
						}
						
						if(config.after_array_access_ref() != null){
							if(result == null){
								config.after_array_access_ref().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_array_access_ref().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_object();
					}
				}
			}
			boolean validPatternInput6 = true && (data.getcomputed_object() instanceof ArrayRefValue);
			if(validPatternInput6)
			{
				if(data.getcomputed_index() == null){
					local_data.setcomputed_index(((Node) node.getIndex()).accept(vis, execCtx));
					if(!(local_data.getcomputed_index() instanceof Termination)){
						if(config.before_array_access_index() != null){
							config.before_array_access_index().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_array_access_index() != null){
							config.specialize_array_access_index().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_index(local_data.getcomputed_index());
						}
						
						if(config.after_array_access_index() != null){
							if(result == null){
								config.after_array_access_index().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_array_access_index().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_index();
					}
				}
			}
			boolean validPatternInput7 = true && (data.getcomputed_object() instanceof ArrayRefValue) && (data.getcomputed_index() instanceof IntegerValue);
			if(validPatternInput7)
			{
				if(config.before_array_access() != null){
					config.before_array_access().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_array_access() != null){
					config.specialize_array_access().adapt(vis, node, execCtx, data, config);
				} else {
					Object value = ((State) execCtx).accessArray((ArrayInstance) ((ArrayRefValue) data.getcomputed_object()).getInstance(), (java.lang.Integer) ((IntegerValue) data.getcomputed_index()).getValue());
					result = value;
				}
				
				if(config.after_array_access() != null){
					if(result == null){
						config.after_array_access().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_array_access().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
