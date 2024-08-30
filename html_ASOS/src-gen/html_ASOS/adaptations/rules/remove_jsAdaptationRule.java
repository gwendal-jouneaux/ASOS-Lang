package html_ASOS.adaptations.rules;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.lang.semantics.Node;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
import fr.diverse.team.SEALS.lang.semantics.SemanticsAdaptationInterface;
import html_ASOS.*;
import html_ASOS.ASOS.AdaptationRule;
import html_ASOS.ASOS.Termination;
import html_ASOS.sd.*;
import html_ASOS.operations.data.HTMLNodeAttributeData;

public class remove_jsAdaptationRule extends AdaptationRule {
	@Override
	public Object adapt(SelfAdaptiveVisitor vis, AdaptableNode<? extends SemanticsAdaptationInterface> adaptableNode, Object execCtxObj, Object prev_data, SemanticsAdaptationInterface config){
		HTMLNodeAttribute node = ((HTMLNodeAttribute) adaptableNode);
		State execCtx = (State) execCtxObj;
		HTMLNodeAttributeData data = new HTMLNodeAttributeData(prev_data);
		HTMLNodeAttributeData local_data = new HTMLNodeAttributeData(prev_data);
		Object termination = null;
		Object result = null;
		
		boolean validPatternInput18 = true;
		if(validPatternInput18)
		{
			if(((data.getcomputed_name() == null ? node.getName() : data.getcomputed_name()).equals("src"))){
				Object empty = "";
				((HTMLNodeAttributeData) prev_data).setcomputed_value(empty);
				
				if(result != null){
					if(! ((EObject) result).eClass().getEPackage().equals(SdPackage.eINSTANCE)){
						return ((Node) result).accept(vis, execCtx);
					} else {
						return result;
					}
				}
			}
		}
		
		return result;
	}
}
