package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.NewArrayData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = NewArray.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class NewArrayOp extends AdaptiveOperation<NewArray, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, NewArray node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		NewArrayData data = new NewArrayData(node);
		
		while(true){
			Object termination = null;
			NewArrayData local_data = new NewArrayData(node);
		
			boolean validPatternInput81 = true;
			if(validPatternInput81)
			{
				if(data.getcomputed_size() == null){
					local_data.setcomputed_size(((Node) node.getSize()).accept(vis, execCtx));
					if(!(local_data.getcomputed_size() instanceof Termination)){
						if(config.before_new_array_size() != null){
							config.before_new_array_size().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_new_array_size() != null){
							config.specialize_new_array_size().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_size(local_data.getcomputed_size());
						}
						
						if(config.after_new_array_size() != null){
							if(result == null){
								config.after_new_array_size().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_new_array_size().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_size();
					}
				}
			}
			boolean validPatternInput82 = true && (data.getcomputed_size() instanceof IntegerValue);
			if(validPatternInput82)
			{
				if(config.before_new_array_create() != null){
					config.before_new_array_create().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_new_array_create() != null){
					config.specialize_new_array_create().adapt(vis, node, execCtx, data, config);
				} else {
					ArrayInstance arrayInstance0 = SdFactory.eINSTANCE.createArrayInstance();
					arrayInstance0.setSize((int) ((IntegerValue) data.getcomputed_size()).getValue());
					ArrayInstance toArrayinst = arrayInstance0;
					Object arrayinst = toArrayinst;
					Object initarray = ((State) execCtx).fillArray((ArrayInstance) arrayinst, (TypeRef) (data.getcomputed_type() == null ? node.getType() : data.getcomputed_type()), (java.lang.Integer) ((IntegerValue) data.getcomputed_size()).getValue());
					ArrayRefValue arrayRefValue0 = SdFactory.eINSTANCE.createArrayRefValue();
					arrayRefValue0.setInstance(EcoreUtil.copy((ArrayInstance) initarray));
					ArrayRefValue toArrayref = arrayRefValue0;
					Object arrayref = toArrayref;
					result = arrayref;
				}
				
				if(config.after_new_array_create() != null){
					if(result == null){
						config.after_new_array_create().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_new_array_create().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
