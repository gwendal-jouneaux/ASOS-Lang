package html_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import html_ASOS.HTMLNodeText;

public class HTMLNodeTextData {
	private Object computed_content = null;
	public void setcomputed_content(Object o){this.computed_content = o;}
	public Object getcomputed_content(){return this.computed_content;}
	
	public HTMLNodeTextData(Object object) {
		if(object != null && object instanceof HTMLNodeTextData) {
			HTMLNodeTextData other = ((HTMLNodeTextData) object);
			this.computed_content = other.computed_content;
		} else if(object != null && object instanceof HTMLNodeText) {
			HTMLNodeText node = ((HTMLNodeText) object);
		}
	}
	
	public HTMLNodeTextData() {}
}
