package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.ArrayLengthData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = ArrayLength.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class ArrayLengthOp extends AdaptiveOperation<ArrayLength, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, ArrayLength node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		ArrayLengthData data = new ArrayLengthData(node);
		
		while(true){
			Object termination = null;
			ArrayLengthData local_data = new ArrayLengthData(node);
		
			boolean validPatternInput83 = true;
			if(validPatternInput83)
			{
				if(data.getcomputed_array() == null){
					local_data.setcomputed_array(((Node) node.getArray()).accept(vis, execCtx));
					if(!(local_data.getcomputed_array() instanceof Termination)){
						if(config.before_array_length_ref() != null){
							config.before_array_length_ref().adapt(vis, node, execCtx, data, config);
						}
						
						if(config.specialize_array_length_ref() != null){
							config.specialize_array_length_ref().adapt(vis, node, execCtx, data, config);
						} else {
							data.setcomputed_array(local_data.getcomputed_array());
						}
						
						if(config.after_array_length_ref() != null){
							if(result == null){
								config.after_array_length_ref().adapt(vis, node, execCtx, data, config);
							} else {
								config.after_array_length_ref().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
						termination = local_data.getcomputed_array();
					}
				}
			}
			boolean validPatternInput84 = true && (data.getcomputed_array() instanceof ArrayRefValue);
			if(validPatternInput84)
			{
				if(config.before_array_length() != null){
					config.before_array_length().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_array_length() != null){
					config.specialize_array_length().adapt(vis, node, execCtx, data, config);
				} else {
					Object length = ((ArrayRefValue) data.getcomputed_array()).getInstance().getSize();
					IntegerValue integerValue3 = SdFactory.eINSTANCE.createIntegerValue();
					integerValue3.setValue((java.lang.Integer) length);
					IntegerValue out = integerValue3;
					result = out;
				}
				
				if(config.after_array_length() != null){
					if(result == null){
						config.after_array_length().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_array_length().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
