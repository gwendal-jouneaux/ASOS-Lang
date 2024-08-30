package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.InferiorOrEqual;

public class InferiorOrEqualData {
	private Object computed_left = null;
	public void setcomputed_left(Object o){this.computed_left = o;}
	public Object getcomputed_left(){return this.computed_left;}
	private Object computed_right = null;
	public void setcomputed_right(Object o){this.computed_right = o;}
	public Object getcomputed_right(){return this.computed_right;}
	
	public InferiorOrEqualData(Object object) {
		if(object != null && object instanceof InferiorOrEqualData) {
			InferiorOrEqualData other = ((InferiorOrEqualData) object);
			this.computed_left = other.computed_left;
			this.computed_right = other.computed_right;
		} else if(object != null && object instanceof InferiorOrEqual) {
			InferiorOrEqual node = ((InferiorOrEqual) object);
		}
	}
	
	public InferiorOrEqualData() {}
}
