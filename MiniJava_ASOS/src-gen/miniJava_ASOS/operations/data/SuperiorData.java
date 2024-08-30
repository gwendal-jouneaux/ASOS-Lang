package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.Superior;

public class SuperiorData {
	private Object computed_left = null;
	public void setcomputed_left(Object o){this.computed_left = o;}
	public Object getcomputed_left(){return this.computed_left;}
	private Object computed_right = null;
	public void setcomputed_right(Object o){this.computed_right = o;}
	public Object getcomputed_right(){return this.computed_right;}
	
	public SuperiorData(Object object) {
		if(object != null && object instanceof SuperiorData) {
			SuperiorData other = ((SuperiorData) object);
			this.computed_left = other.computed_left;
			this.computed_right = other.computed_right;
		} else if(object != null && object instanceof Superior) {
			Superior node = ((Superior) object);
		}
	}
	
	public SuperiorData() {}
}
