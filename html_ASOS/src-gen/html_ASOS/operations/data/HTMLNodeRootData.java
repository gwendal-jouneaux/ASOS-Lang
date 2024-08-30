package html_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import html_ASOS.HTMLNodeRoot;

public class HTMLNodeRootData {
	private Object computed_root = null;
	public void setcomputed_root(Object o){this.computed_root = o;}
	public Object getcomputed_root(){return this.computed_root;}
	
	public HTMLNodeRootData(Object object) {
		if(object != null && object instanceof HTMLNodeRootData) {
			HTMLNodeRootData other = ((HTMLNodeRootData) object);
			this.computed_root = other.computed_root;
		} else if(object != null && object instanceof HTMLNodeRoot) {
			HTMLNodeRoot node = ((HTMLNodeRoot) object);
		}
	}
	
	public HTMLNodeRootData() {}
}
