package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.MethodCall;

public class MethodCallData {
	private Object computed_receiver = null;
	public void setcomputed_receiver(Object o){this.computed_receiver = o;}
	public Object getcomputed_receiver(){return this.computed_receiver;}
	private Object computed_method = null;
	public void setcomputed_method(Object o){this.computed_method = o;}
	public Object getcomputed_method(){return this.computed_method;}
	private EList computed_args;
	public void setcomputed_args(List o){this.computed_args = new BasicEList(o);}
	public EList getcomputed_args(){return this.computed_args;}
	public void setcomputed_args(int index, Object o){this.computed_args.set(this.getindex_args(), o);}
	public Object getcomputed_args(int index){return this.computed_args.get(this.getindex_args());}
	private int index_args = 0;
	public void setindex_args(int i){this.index_args = i;}
	public void incindex_args(){this.index_args += 1;}
	public int getindex_args(){return this.index_args;}
	
	public MethodCallData(Object object) {
		if(object != null && object instanceof MethodCallData) {
			MethodCallData other = ((MethodCallData) object);
			this.computed_receiver = other.computed_receiver;
			this.computed_method = other.computed_method;
			this.computed_args = other.computed_args;
			this.index_args = other.index_args;
		} else if(object != null && object instanceof MethodCall) {
			MethodCall node = ((MethodCall) object);
			this.computed_args = new BasicEList(node.getArgs().size());
			for(int i = 0 ; i < node.getArgs().size() ; i++){
				this.computed_args.add(null);
			}
		}
	}
	
	public MethodCallData() {}
}
