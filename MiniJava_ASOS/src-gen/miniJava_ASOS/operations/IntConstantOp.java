package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.IntConstantData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = IntConstant.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class IntConstantOp extends AdaptiveOperation<IntConstant, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, IntConstant node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		IntConstantData data = new IntConstantData(node);
		
		while(true){
			Object termination = null;
			IntConstantData local_data = new IntConstantData(node);
		
			boolean validPatternInput70 = true;
			if(validPatternInput70)
			{
				if(config.before_IntConst() != null){
					config.before_IntConst().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_IntConst() != null){
					config.specialize_IntConst().adapt(vis, node, execCtx, data, config);
				} else {
					IntegerValue integerValue2 = SdFactory.eINSTANCE.createIntegerValue();
					integerValue2.setValue((java.lang.Integer) (data.getcomputed_value() == null ? node.getValue() : data.getcomputed_value()));
					IntegerValue out = integerValue2;
					result = out;
				}
				
				if(config.after_IntConst() != null){
					if(result == null){
						config.after_IntConst().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_IntConst().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
