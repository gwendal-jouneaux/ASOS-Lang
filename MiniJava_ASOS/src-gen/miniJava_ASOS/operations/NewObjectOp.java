package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.NewObjectData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = NewObject.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class NewObjectOp extends AdaptiveOperation<NewObject, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, NewObject node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		NewObjectData data = new NewObjectData(node);
		
		while(true){
			Object termination = null;
			NewObjectData local_data = new NewObjectData(node);
		
			boolean validPatternInput39 = true;
			if(validPatternInput39)
			{
				if((true && ((data.getcomputed_type() == null ? node.getType() : data.getcomputed_type()) instanceof Clazz))){
					if(config.before_new_object_init() != null){
						config.before_new_object_init().adapt(vis, node, execCtx, data, config);
					}
					
					if(config.specialize_new_object_init() != null){
						config.specialize_new_object_init().adapt(vis, node, execCtx, data, config);
					} else {
						Object objinst = ((State) execCtx).initObject((Clazz) (data.getcomputed_type() == null ? node.getType() : data.getcomputed_type()));
						data.setcomputed_type(objinst);
					}
					
					if(config.after_new_object_init() != null){
						if(result == null){
							config.after_new_object_init().adapt(vis, node, execCtx, data, config);
						} else {
							config.after_new_object_init().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput40 = true && (data.getcomputed_type() instanceof ObjectInstance) && (node.getArgs() instanceof List && node.getArgs().size() > data.getindex_args());
			if(validPatternInput40)
			{
				if(data.getcomputed_args().get(data.getindex_args()) == null){
					local_data.getcomputed_args().set(data.getindex_args(), (((Node) node.getArgs().get(data.getindex_args())).accept(vis, execCtx)));
					if(!(local_data.getcomputed_args().get(data.getindex_args()) instanceof Termination)){
						if(config.before_new_object_args() != null){
							config.before_new_object_args().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_new_object_args() != null){
							config.specialize_new_object_args().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_args(data.getindex_args(),local_data.getcomputed_args().get(data.getindex_args()));
						}
						
						if(config.after_new_object_args() != null){
							if(result == null){
								config.after_new_object_args().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_new_object_args().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_args().get(data.getindex_args());
					}
				}
			}
			boolean validPatternInput41 = true && (data.getcomputed_type() instanceof ObjectInstance) && (node.getArgs() instanceof List && node.getArgs().size() > data.getindex_args()) && (data.getcomputed_args().get(data.getindex_args()) instanceof Value);
			if(validPatternInput41)
			{
				if(config.before_new_object_values() != null){
					config.before_new_object_values().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_new_object_values() != null){
					config.specialize_new_object_values().adapt(vis, node, execCtx, data, config);
				} else {
					data.incindex_args();
				}
				
				if(config.after_new_object_values() != null){
					if(result == null){
						config.after_new_object_values().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_new_object_values().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput42 = true && (data.getcomputed_type() instanceof ObjectInstance) && (node.getArgs() instanceof List && node.getArgs().size() <= data.getindex_args());
			if(validPatternInput42)
			{
				if(config.before_new_object_prepare() != null){
					config.before_new_object_prepare().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_new_object_prepare() != null){
					config.specialize_new_object_prepare().adapt(vis, node, execCtx, data, config);
				} else {
					ObjectRefValue objectRefValue0 = SdFactory.eINSTANCE.createObjectRefValue();
					objectRefValue0.setInstance(EcoreUtil.copy((ObjectInstance) ((ObjectInstance) data.getcomputed_type())));
					ObjectRefValue toRef = objectRefValue0;
					Object ref = toRef;
					data.setcomputed_type(ref);
				}
				
				if(config.after_new_object_prepare() != null){
					if(result == null){
						config.after_new_object_prepare().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_new_object_prepare().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput43 = true && (data.getcomputed_type() instanceof ObjectRefValue);
			if(validPatternInput43)
			{
				if(config.before_new_object_constructor() != null){
					config.before_new_object_constructor().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_new_object_constructor() != null){
					config.specialize_new_object_constructor().adapt(vis, node, execCtx, data, config);
				} else {
					Object obj = ((ObjectRefValue) data.getcomputed_type()).getInstance();
					Object clazz = ((ObjectRefValue) data.getcomputed_type()).getInstance().getType();
					Object constructor = ((State) execCtx).findConstructor((Clazz) clazz, (org.eclipse.emf.common.util.EList) (data.getcomputed_args() == null ? node.getArgs() : data.getcomputed_args()));
					Call call0 = SdFactory.eINSTANCE.createCall();
					call0.setInstance(EcoreUtil.copy((ObjectInstance) obj));
					call0.setMethod(EcoreUtil.copy((Method) constructor));
					call0.setValues((org.eclipse.emf.common.util.EList) (data.getcomputed_args() == null ? node.getArgs() : data.getcomputed_args()));
					Call toCall = call0;
					Object call = toCall;
					Object retVal = ((State) execCtx).call((Call) call);
					result = ((ObjectRefValue) data.getcomputed_type());
				}
				
				if(config.after_new_object_constructor() != null){
					if(result == null){
						config.after_new_object_constructor().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_new_object_constructor().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
