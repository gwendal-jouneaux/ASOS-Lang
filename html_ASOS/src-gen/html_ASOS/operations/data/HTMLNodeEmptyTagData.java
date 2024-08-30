package html_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import html_ASOS.HTMLNodeEmptyTag;

public class HTMLNodeEmptyTagData {
	private Object computed_tag = null;
	public void setcomputed_tag(Object o){this.computed_tag = o;}
	public Object getcomputed_tag(){return this.computed_tag;}
	private EList computed_attributes;
	public void setcomputed_attributes(List o){this.computed_attributes = new BasicEList(o);}
	public EList getcomputed_attributes(){return this.computed_attributes;}
	public void setcomputed_attributes(int index, Object o){this.computed_attributes.set(this.getindex_attributes(), o);}
	public Object getcomputed_attributes(int index){return this.computed_attributes.get(this.getindex_attributes());}
	private int index_attributes = 0;
	public void setindex_attributes(int i){this.index_attributes = i;}
	public void incindex_attributes(){this.index_attributes += 1;}
	public int getindex_attributes(){return this.index_attributes;}
	
	public HTMLNodeEmptyTagData(Object object) {
		if(object != null && object instanceof HTMLNodeEmptyTagData) {
			HTMLNodeEmptyTagData other = ((HTMLNodeEmptyTagData) object);
			this.computed_tag = other.computed_tag;
			this.computed_attributes = other.computed_attributes;
			this.index_attributes = other.index_attributes;
		} else if(object != null && object instanceof HTMLNodeEmptyTag) {
			HTMLNodeEmptyTag node = ((HTMLNodeEmptyTag) object);
			this.computed_attributes = new BasicEList(node.getAttributes().size());
			for(int i = 0 ; i < node.getAttributes().size() ; i++){
				this.computed_attributes.add(null);
			}
		}
	}
	
	public HTMLNodeEmptyTagData() {}
}
