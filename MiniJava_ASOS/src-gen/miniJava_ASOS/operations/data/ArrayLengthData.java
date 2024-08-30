package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.ArrayLength;

public class ArrayLengthData {
	private Object computed_array = null;
	public void setcomputed_array(Object o){this.computed_array = o;}
	public Object getcomputed_array(){return this.computed_array;}
	
	public ArrayLengthData(Object object) {
		if(object != null && object instanceof ArrayLengthData) {
			ArrayLengthData other = ((ArrayLengthData) object);
			this.computed_array = other.computed_array;
		} else if(object != null && object instanceof ArrayLength) {
			ArrayLength node = ((ArrayLength) object);
		}
	}
	
	public ArrayLengthData() {}
}
