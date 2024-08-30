package miniJava_ASOS.adaptations.modules;

import fr.diverse.team.SEALS.decision.model.Resource;
import fr.diverse.team.SEALS.decision.model.Softgoal;
import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import fr.diverse.team.SEALS.module.adaptation.SelfAdaptationModule;
import miniJava_ASOS.interpreter.MiniJava_ASOSAdaptationContext;

import miniJava_ASOS.adaptations.rules.twiceAdaptationRule;

import miniJava_ASOS.*;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

public class ApproximateLoopUnrollModule extends SelfAdaptationModule<MiniJava_ASOSAdaptationContext, AdaptableNode<miniJava_ASOSInterface>, miniJava_ASOSInterface> {

	
	public ApproximateLoopUnrollModule() {
		super("ApproximateLoopUnroll", ForStatement.class);
	}

	@Override
	public miniJava_ASOSInterface adapt(miniJava_ASOSInterface configInterface) {
		configInterface.add_before_for_true_prog(new twiceAdaptationRule());
		return configInterface;
	}

	@Override
	public boolean isTargetedNode(AdaptableNode<miniJava_ASOSInterface> node) {
		boolean match0 = true && (node instanceof ForStatement) && (((ForStatement) node).getProgression() instanceof Assignment) && (((Assignment) ((ForStatement) node).getProgression()).getValue() instanceof Plus) && (((Plus) ((Assignment) ((ForStatement) node).getProgression()).getValue()).getRight() instanceof IntConstant);
		if(match0){
			return true;
		}
		
		return false;
	}
	
	@Override
	public void init(MiniJava_ASOSAdaptationContext adaptationContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connectSoftGoal(Softgoal softgoal) {
		Resource r = new Resource("sdfsqgdf");
		r.setMonitoredValue(1);
		if(softgoal.ID.contains("Time")) {
			softgoal.addContribution(r, 1.0);
		}
		
	}

	@Override
	public void connectResource(Resource resource) {
		// TODO Auto-generated method stub
		
	}
}
