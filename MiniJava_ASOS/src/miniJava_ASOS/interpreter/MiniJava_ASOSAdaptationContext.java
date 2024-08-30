package miniJava_ASOS.interpreter;

import java.util.HashMap;
import java.util.Map;

import fr.diverse.team.SEALS.decision.model.Resource;
import fr.diverse.team.SEALS.lang.adaptation.AdaptationContext;

public class MiniJava_ASOSAdaptationContext extends AdaptationContext<SelfAdaptiveMiniJava_ASOS> {
	Map<String, Double> to = new HashMap<String, Double>();
	public boolean sw = false;
	
	public MiniJava_ASOSAdaptationContext() {
		to.put("Time", 1.0);
		to.put("Quality", 0.0);
	}

	@Override
	public Map<String, Double> readExpectedTradeOff() {
		if(sw) {
			invertTO();
		}
		return to;
	}
	
	public void invertTO() {
		double tmp = to.get("Time");
		to.put("Time", to.get("Quality"));
		to.put("Quality", tmp);
	}

	@Override
	public String[] propertiesOfInterest() {
		return new String[] {"Time", "Quality"};
	}

	@Override
	protected Resource[] environment() {
		return new Resource[] {};
	}

}

