package html_ASOS.interpreter;

import fr.diverse.team.SEALS.lang.SelfAdaptableLanguage;
import fr.diverse.team.SEALS.lang.adaptation.FeedbackLoop;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;

public class SelfAdaptiveHtml_ASOS extends SelfAdaptableLanguage<Html_ASOSAdaptationContext> {

	@Override
	protected Html_ASOSAdaptationContext createAdaptationContext() {
		return new Html_ASOSAdaptationContext();
	}

	@Override
	protected FeedbackLoop<?, Html_ASOSAdaptationContext> createFeedbackLoop(Html_ASOSAdaptationContext ctx) {
		return new Html_ASOSFeedbackLoop(ctx);
	}

	@Override
	protected SelfAdaptiveVisitor createVisitor() {
		return new Html_ASOSVisitor();
	}

}
