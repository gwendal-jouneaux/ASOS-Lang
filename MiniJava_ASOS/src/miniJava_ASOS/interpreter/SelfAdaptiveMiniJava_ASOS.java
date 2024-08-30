package miniJava_ASOS.interpreter;

import fr.diverse.team.SEALS.lang.SelfAdaptableLanguage;
import fr.diverse.team.SEALS.lang.adaptation.FeedbackLoop;
import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;

public class SelfAdaptiveMiniJava_ASOS extends SelfAdaptableLanguage<MiniJava_ASOSAdaptationContext> {

	@Override
	protected MiniJava_ASOSAdaptationContext createAdaptationContext() {
		return new MiniJava_ASOSAdaptationContext();
	}

	@Override
	protected FeedbackLoop<?, MiniJava_ASOSAdaptationContext> createFeedbackLoop(MiniJava_ASOSAdaptationContext ctx) {
		return new MiniJava_ASOSFeedbackLoop(ctx);
	}

	@Override
	protected SelfAdaptiveVisitor createVisitor() {
		return new MiniJava_ASOSVisitor();
	}

}
