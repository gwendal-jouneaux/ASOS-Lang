package html_ASOS.interpreter;

import java.util.HashMap;
import java.util.Map;

import fr.diverse.team.SEALS.decision.model.Resource;
import fr.diverse.team.SEALS.lang.adaptation.AdaptationContext;

public class Html_ASOSAdaptationContext extends AdaptationContext<SelfAdaptiveHtml_ASOS> {
	Map<String, Double> to = new HashMap<String, Double>();
	public boolean sw = false;
	
	public Html_ASOSAdaptationContext() {
		to.put("Energy", 0.0);
		to.put("Quality", 1.0);
	}
	
	@Override
	public Map<String, Double> readExpectedTradeOff() {
		if(sw) {
			invertTO();
		}
		return to;
	}
	
	public void invertTO() {
		double tmp = to.get("Energy");
		to.put("Energy", to.get("Quality"));
		to.put("Quality", tmp);
	}

	@Override
	public String[] propertiesOfInterest() {
		return new String[] {"Quality","Energy"};
	}

	@Override
	protected Resource[] environment() {
		return new Resource[] {new Resource("RESOURCE")};
	}

}

