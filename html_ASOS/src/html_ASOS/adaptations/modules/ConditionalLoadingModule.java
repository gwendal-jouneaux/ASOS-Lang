package html_ASOS.adaptations.modules;

import fr.diverse.team.SEALS.decision.model.Resource;
import fr.diverse.team.SEALS.decision.model.Softgoal;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.module.adaptation.SelfAdaptationModule;
import html_ASOS.interpreter.Html_ASOSAdaptationContext;

import html_ASOS.adaptations.rules.remove_jsAdaptationRule;

import html_ASOS.*;
import html_ASOS.interfaces.html_ASOSInterface;

public class ConditionalLoadingModule extends SelfAdaptationModule<Html_ASOSAdaptationContext, AdaptableNode<html_ASOSInterface>, html_ASOSInterface> {

	
	private boolean recursive = false;

	public ConditionalLoadingModule() {
		super("ConditionalLoading", HTMLNodeBase.class);
	}

	@Override
	public html_ASOSInterface adapt(html_ASOSInterface configInterface) {
		configInterface.add_before_attribute(new remove_jsAdaptationRule());
		return configInterface;
	}

	@Override
	public boolean isTargetedNode(AdaptableNode<html_ASOSInterface> node) {
		boolean match0 = true && (node instanceof HTMLNodeBaseTag);
		if(match0){
			if((((HTMLNodeBaseTag) node).getTag().equals("script"))){
				recursive = true;
			} else {
				recursive = false;
			}
		} 
		
		return recursive;
	}
	
	@Override
	public void init(Html_ASOSAdaptationContext adaptationContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connectSoftGoal(Softgoal softgoal) {
		Resource r = new Resource("dfsdf");
		r.setMonitoredValue(1.0);
		if(softgoal.ID.contains("Energy")) {
			softgoal.addContribution(r, 1.0);
		}
		
	}

	@Override
	public void connectResource(Resource resource) {
		// TODO Auto-generated method stub
		
	}
}
