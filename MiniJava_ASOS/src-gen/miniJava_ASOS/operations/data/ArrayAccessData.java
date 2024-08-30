package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.ArrayAccess;

public class ArrayAccessData {
	private Object computed_object = null;
	public void setcomputed_object(Object o){this.computed_object = o;}
	public Object getcomputed_object(){return this.computed_object;}
	private Object computed_index = null;
	public void setcomputed_index(Object o){this.computed_index = o;}
	public Object getcomputed_index(){return this.computed_index;}
	
	public ArrayAccessData(Object object) {
		if(object != null && object instanceof ArrayAccessData) {
			ArrayAccessData other = ((ArrayAccessData) object);
			this.computed_object = other.computed_object;
			this.computed_index = other.computed_index;
		} else if(object != null && object instanceof ArrayAccess) {
			ArrayAccess node = ((ArrayAccess) object);
		}
	}
	
	public ArrayAccessData() {}
}
