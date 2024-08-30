package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.Method;

public class MethodData {
	private Object computed_name = null;
	public void setcomputed_name(Object o){this.computed_name = o;}
	public Object getcomputed_name(){return this.computed_name;}
	private Object computed_typeRef = null;
	public void setcomputed_typeRef(Object o){this.computed_typeRef = o;}
	public Object getcomputed_typeRef(){return this.computed_typeRef;}
	private Object computed_access = null;
	public void setcomputed_access(Object o){this.computed_access = o;}
	public Object getcomputed_access(){return this.computed_access;}
	private Object computed_isabstract = null;
	public void setcomputed_isabstract(Object o){this.computed_isabstract = o;}
	public Object getcomputed_isabstract(){return this.computed_isabstract;}
	private Object computed_isstatic = null;
	public void setcomputed_isstatic(Object o){this.computed_isstatic = o;}
	public Object getcomputed_isstatic(){return this.computed_isstatic;}
	private EList computed_params;
	public void setcomputed_params(List o){this.computed_params = new BasicEList(o);}
	public EList getcomputed_params(){return this.computed_params;}
	public void setcomputed_params(int index, Object o){this.computed_params.set(this.getindex_params(), o);}
	public Object getcomputed_params(int index){return this.computed_params.get(this.getindex_params());}
	private int index_params = 0;
	public void setindex_params(int i){this.index_params = i;}
	public void incindex_params(){this.index_params += 1;}
	public int getindex_params(){return this.index_params;}
	private Object computed_body = null;
	public void setcomputed_body(Object o){this.computed_body = o;}
	public Object getcomputed_body(){return this.computed_body;}
	
	public MethodData(Object object) {
		if(object != null && object instanceof MethodData) {
			MethodData other = ((MethodData) object);
			this.computed_name = other.computed_name;
			this.computed_typeRef = other.computed_typeRef;
			this.computed_access = other.computed_access;
			this.computed_isabstract = other.computed_isabstract;
			this.computed_isstatic = other.computed_isstatic;
			this.computed_params = other.computed_params;
			this.index_params = other.index_params;
			this.computed_body = other.computed_body;
		} else if(object != null && object instanceof Method) {
			Method node = ((Method) object);
			this.computed_params = new BasicEList(node.getParams().size());
			for(int i = 0 ; i < node.getParams().size() ; i++){
				this.computed_params.add(null);
			}
		}
	}
	
	public MethodData() {}
}
