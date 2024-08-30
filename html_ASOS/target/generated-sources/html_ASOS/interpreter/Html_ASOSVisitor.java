package html_ASOS.interpreter;

public class Html_ASOSVisitor implements fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor {
	public Object visitHTMLNodeText(html_ASOS.HTMLNodeText node, Object execCtx, html_ASOS.interfaces.html_ASOSInterface config){ return (new html_ASOS.operations.HTMLNodeTextOp()).execute(this,node,execCtx,config);}
	public Object visitHTMLNodeBlockTag(html_ASOS.HTMLNodeBlockTag node, Object execCtx, html_ASOS.interfaces.html_ASOSInterface config){ return (new html_ASOS.operations.HTMLNodeBlockTagOp()).execute(this,node,execCtx,config);}
	public Object visitHTMLNodeEmptyTag(html_ASOS.HTMLNodeEmptyTag node, Object execCtx, html_ASOS.interfaces.html_ASOSInterface config){ return (new html_ASOS.operations.HTMLNodeEmptyTagOp()).execute(this,node,execCtx,config);}
	public Object visitHTMLNodeRoot(html_ASOS.HTMLNodeRoot node, Object execCtx, html_ASOS.interfaces.html_ASOSInterface config){ return (new html_ASOS.operations.HTMLNodeRootOp()).execute(this,node,execCtx,config);}
	public Object visitHTMLNodeAttribute(html_ASOS.HTMLNodeAttribute node, Object execCtx, html_ASOS.interfaces.html_ASOSInterface config){ return (new html_ASOS.operations.HTMLNodeAttributeOp()).execute(this,node,execCtx,config);}
	public Object dispatch(fr.diverse.team.SEALS.lang.semantics.Node node, Object executionCtx){
		return null;
	}
	public Object dispatch(fr.diverse.team.SEALS.lang.semantics.AdaptableNode node, Object executionCtx, fr.diverse.team.SEALS.lang.semantics.SemanticsAdaptationInterface config){
		if(node instanceof html_ASOS.HTMLNodeText){
			return visitHTMLNodeText((html_ASOS.HTMLNodeText) node, executionCtx,(html_ASOS.interfaces.html_ASOSInterface) config);
		}
		if(node instanceof html_ASOS.HTMLNodeBlockTag){
			return visitHTMLNodeBlockTag((html_ASOS.HTMLNodeBlockTag) node, executionCtx,(html_ASOS.interfaces.html_ASOSInterface) config);
		}
		if(node instanceof html_ASOS.HTMLNodeEmptyTag){
			return visitHTMLNodeEmptyTag((html_ASOS.HTMLNodeEmptyTag) node, executionCtx,(html_ASOS.interfaces.html_ASOSInterface) config);
		}
		if(node instanceof html_ASOS.HTMLNodeRoot){
			return visitHTMLNodeRoot((html_ASOS.HTMLNodeRoot) node, executionCtx,(html_ASOS.interfaces.html_ASOSInterface) config);
		}
		if(node instanceof html_ASOS.HTMLNodeAttribute){
			return visitHTMLNodeAttribute((html_ASOS.HTMLNodeAttribute) node, executionCtx,(html_ASOS.interfaces.html_ASOSInterface) config);
		}
		return null;
	}
}