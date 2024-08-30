package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.NewObject;

public class NewObjectData {
	private Object computed_type = null;
	public void setcomputed_type(Object o){this.computed_type = o;}
	public Object getcomputed_type(){return this.computed_type;}
	private EList computed_args;
	public void setcomputed_args(List o){this.computed_args = new BasicEList(o);}
	public EList getcomputed_args(){return this.computed_args;}
	public void setcomputed_args(int index, Object o){this.computed_args.set(this.getindex_args(), o);}
	public Object getcomputed_args(int index){return this.computed_args.get(this.getindex_args());}
	private int index_args = 0;
	public void setindex_args(int i){this.index_args = i;}
	public void incindex_args(){this.index_args += 1;}
	public int getindex_args(){return this.index_args;}
	
	public NewObjectData(Object object) {
		if(object != null && object instanceof NewObjectData) {
			NewObjectData other = ((NewObjectData) object);
			this.computed_type = other.computed_type;
			this.computed_args = other.computed_args;
			this.index_args = other.index_args;
		} else if(object != null && object instanceof NewObject) {
			NewObject node = ((NewObject) object);
			this.computed_args = new BasicEList(node.getArgs().size());
			for(int i = 0 ; i < node.getArgs().size() ; i++){
				this.computed_args.add(null);
			}
		}
	}
	
	public NewObjectData() {}
}
