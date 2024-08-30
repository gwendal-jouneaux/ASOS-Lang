package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.IntConstant;

public class IntConstantData {
	private Object computed_value = null;
	public void setcomputed_value(Object o){this.computed_value = o;}
	public Object getcomputed_value(){return this.computed_value;}
	
	public IntConstantData(Object object) {
		if(object != null && object instanceof IntConstantData) {
			IntConstantData other = ((IntConstantData) object);
			this.computed_value = other.computed_value;
		} else if(object != null && object instanceof IntConstant) {
			IntConstant node = ((IntConstant) object);
		}
	}
	
	public IntConstantData() {}
}
