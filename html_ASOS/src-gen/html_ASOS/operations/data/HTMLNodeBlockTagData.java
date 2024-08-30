package html_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import html_ASOS.HTMLNodeBlockTag;

public class HTMLNodeBlockTagData {
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
	private EList computed_children;
	public void setcomputed_children(List o){this.computed_children = new BasicEList(o);}
	public EList getcomputed_children(){return this.computed_children;}
	public void setcomputed_children(int index, Object o){this.computed_children.set(this.getindex_children(), o);}
	public Object getcomputed_children(int index){return this.computed_children.get(this.getindex_children());}
	private int index_children = 0;
	public void setindex_children(int i){this.index_children = i;}
	public void incindex_children(){this.index_children += 1;}
	public int getindex_children(){return this.index_children;}
	
	public HTMLNodeBlockTagData(Object object) {
		if(object != null && object instanceof HTMLNodeBlockTagData) {
			HTMLNodeBlockTagData other = ((HTMLNodeBlockTagData) object);
			this.computed_tag = other.computed_tag;
			this.computed_attributes = other.computed_attributes;
			this.index_attributes = other.index_attributes;
			this.computed_children = other.computed_children;
			this.index_children = other.index_children;
		} else if(object != null && object instanceof HTMLNodeBlockTag) {
			HTMLNodeBlockTag node = ((HTMLNodeBlockTag) object);
			this.computed_attributes = new BasicEList(node.getAttributes().size());
			for(int i = 0 ; i < node.getAttributes().size() ; i++){
				this.computed_attributes.add(null);
			}
			this.computed_children = new BasicEList(node.getChildren().size());
			for(int i = 0 ; i < node.getChildren().size() ; i++){
				this.computed_children.add(null);
			}
		}
	}
	
	public HTMLNodeBlockTagData() {}
}
