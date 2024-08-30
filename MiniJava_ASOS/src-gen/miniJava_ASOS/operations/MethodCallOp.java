package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.MethodCallData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = MethodCall.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class MethodCallOp extends AdaptiveOperation<MethodCall, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, MethodCall node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		MethodCallData data = new MethodCallData(node);
		
		while(true){
			Object termination = null;
			MethodCallData local_data = new MethodCallData(node);
		
			boolean validPatternInput53 = true;
			if(validPatternInput53)
			{
				if(data.getcomputed_receiver() == null){
					local_data.setcomputed_receiver(((Node) node.getReceiver()).accept(vis, execCtx));
					if(!(local_data.getcomputed_receiver() instanceof Termination)){
						if(config.before_method_call_init() != null){
							config.before_method_call_init().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_method_call_init() != null){
							config.specialize_method_call_init().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_receiver(local_data.getcomputed_receiver());
						}
						
						if(config.after_method_call_init() != null){
							if(result == null){
								config.after_method_call_init().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_method_call_init().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_receiver();
					}
				}
			}
			boolean validPatternInput54 = true && (data.getcomputed_receiver() instanceof ObjectRefValue) && (node.getArgs() instanceof List && node.getArgs().size() > data.getindex_args());
			if(validPatternInput54)
			{
				if(data.getcomputed_args().get(data.getindex_args()) == null){
					local_data.getcomputed_args().set(data.getindex_args(), (((Node) node.getArgs().get(data.getindex_args())).accept(vis, execCtx)));
					if(!(local_data.getcomputed_args().get(data.getindex_args()) instanceof Termination)){
						if(config.before_method_call_args() != null){
							config.before_method_call_args().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_method_call_args() != null){
							config.specialize_method_call_args().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_args(data.getindex_args(),local_data.getcomputed_args().get(data.getindex_args()));
						}
						
						if(config.after_method_call_args() != null){
							if(result == null){
								config.after_method_call_args().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_method_call_args().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput55 = true && (data.getcomputed_receiver() instanceof ObjectRefValue) && (node.getArgs() instanceof List && node.getArgs().size() > data.getindex_args()) && (data.getcomputed_args().get(data.getindex_args()) instanceof Value);
			if(validPatternInput55)
			{
				if(config.before_method_call_values() != null){
					config.before_method_call_values().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_method_call_values() != null){
					config.specialize_method_call_values().adapt(vis, node, execCtx, data, config);
				} else {
					data.incindex_args();
				}
				
				if(config.after_method_call_values() != null){
					if(result == null){
						config.after_method_call_values().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_method_call_values().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput56 = true && (data.getcomputed_receiver() instanceof ObjectRefValue) && (node.getArgs() instanceof List && node.getArgs().size() <= data.getindex_args());
			if(validPatternInput56)
			{
				if(config.before_method_call_prepare() != null){
					config.before_method_call_prepare().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_method_call_prepare() != null){
					config.specialize_method_call_prepare().adapt(vis, node, execCtx, data, config);
				} else {
					data.setcomputed_receiver(((ObjectRefValue) data.getcomputed_receiver()).getInstance());
				}
				
				if(config.after_method_call_prepare() != null){
					if(result == null){
						config.after_method_call_prepare().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_method_call_prepare().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
			boolean validPatternInput57 = true && (data.getcomputed_receiver() instanceof ObjectInstance);
			if(validPatternInput57)
			{
				if(config.before_method_call_constructor() != null){
					config.before_method_call_constructor().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_method_call_constructor() != null){
					config.specialize_method_call_constructor().adapt(vis, node, execCtx, data, config);
				} else {
					Object clazz = ((ObjectInstance) data.getcomputed_receiver()).getType();
					Call call1 = SdFactory.eINSTANCE.createCall();
					call1.setInstance(EcoreUtil.copy((ObjectInstance) ((ObjectInstance) data.getcomputed_receiver())));
					call1.setMethod(EcoreUtil.copy((Method) (data.getcomputed_method() == null ? node.getMethod() : data.getcomputed_method())));
					call1.setValues((org.eclipse.emf.common.util.EList) (data.getcomputed_args() == null ? node.getArgs() : data.getcomputed_args()));
					Call toCall = call1;
					Object call = toCall;
					Object retVal = ((State) execCtx).call((Call) call);
					result = retVal;
				}
				
				if(config.after_method_call_constructor() != null){
					if(result == null){
						config.after_method_call_constructor().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_method_call_constructor().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
