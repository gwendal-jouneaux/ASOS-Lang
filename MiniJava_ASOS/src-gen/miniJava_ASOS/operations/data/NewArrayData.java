package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.NewArray;

public class NewArrayData {
	private Object computed_type = null;
	public void setcomputed_type(Object o){this.computed_type = o;}
	public Object getcomputed_type(){return this.computed_type;}
	private Object computed_size = null;
	public void setcomputed_size(Object o){this.computed_size = o;}
	public Object getcomputed_size(){return this.computed_size;}
	
	public NewArrayData(Object object) {
		if(object != null && object instanceof NewArrayData) {
			NewArrayData other = ((NewArrayData) object);
			this.computed_type = other.computed_type;
			this.computed_size = other.computed_size;
		} else if(object != null && object instanceof NewArray) {
			NewArray node = ((NewArray) object);
		}
	}
	
	public NewArrayData() {}
}
