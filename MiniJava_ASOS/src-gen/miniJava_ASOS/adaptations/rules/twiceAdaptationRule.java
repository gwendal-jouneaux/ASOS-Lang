package miniJava_ASOS.adaptations.rules;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import fr.diverse.team.SEALS.lang.semantics.SemanticsAdaptationInterface;
import miniJava_ASOS.*;
import miniJava_ASOS.ASOS.AdaptationRule;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.sd.*;
import miniJava_ASOS.operations.data.ForStatementData;

public class twiceAdaptationRule extends AdaptationRule {
	@Override
	public Object adapt(SelfAdaptiveVisitor vis, AdaptableNode<? extends SemanticsAdaptationInterface> adaptableNode, Object execCtxObj, Object prev_data, SemanticsAdaptationInterface config){
		ForStatement node = ((ForStatement) adaptableNode);
		State execCtx = (State) execCtxObj;
		ForStatementData data = new ForStatementData(prev_data);
		ForStatementData local_data = new ForStatementData(prev_data);
		Object termination = null;
		Object result = null;
		
		boolean validPatternInput101 = true && (data.getcomputed_condition() instanceof BooleanValue) && (data.getcomputed_block() instanceof NullValue);
		if(validPatternInput101)
		{
			if(data.getcomputed_progression() == null){
				local_data.setcomputed_progression(((Node) node.getProgression()).accept(vis, execCtx));
				if(!(local_data.getcomputed_progression() instanceof Termination)){
					
					if(result != null){
						if(! ((EObject) result).eClass().getEPackage().equals(SdPackage.eINSTANCE)){
							return ((Node) result).accept(vis, execCtx);
						} else {
							return result;
						}
					}
				}
				else {
					termination = local_data.getcomputed_progression();
				}
			}
		}
		
		return result;
	}
}
