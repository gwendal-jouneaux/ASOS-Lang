package miniJava_ASOS.operations;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.AdaptiveOperation;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.Operationalize;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import miniJava_ASOS.operations.data.ProgramData;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.*;
import miniJava_ASOS.MiniJava_ASOSFactory;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;
import miniJava_ASOS.sd.*;

@Operationalize(node = Program.class, visitor = "miniJava_ASOS.interpreter.MiniJava_ASOSVisitor")
public class ProgramOp extends AdaptiveOperation<Program, miniJava_ASOSInterface>{
	
	@Override
	public Object execute(SelfAdaptiveVisitor vis, Program node, Object execCtxObj, miniJava_ASOSInterface config) {
		Object result = null;
		State execCtx = ((State) execCtxObj);
		
		ProgramData data = new ProgramData(node);
		
		while(true){
			Object termination = null;
			ProgramData local_data = new ProgramData(node);
		
			boolean validPatternInput17 = true;
			if(validPatternInput17)
			{
				if(config.before_program() != null){
					config.before_program().adapt(vis, node, execCtx, data, config);
				}
				
				if(config.specialize_program() != null){
					config.specialize_program().adapt(vis, node, execCtx, data, config);
				} else {
					Object main = ((State) execCtx).findMain((org.eclipse.emf.common.util.EList) node.getClasses());
					result = main;
				}
				
				if(config.after_program() != null){
					if(result == null){
						config.after_program().adapt(vis, node, execCtx, data, config);
					} else {
						config.after_program().adapt(vis, ((AdaptableNode<miniJava_ASOSInterface>) result), execCtx, null, config);
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
