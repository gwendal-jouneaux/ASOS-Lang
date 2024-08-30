package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.FieldAccess;

public class FieldAccessData {
	private Object computed_receiver = null;
	public void setcomputed_receiver(Object o){this.computed_receiver = o;}
	public Object getcomputed_receiver(){return this.computed_receiver;}
	private Object computed_field = null;
	public void setcomputed_field(Object o){this.computed_field = o;}
	public Object getcomputed_field(){return this.computed_field;}
	
	public FieldAccessData(Object object) {
		if(object != null && object instanceof FieldAccessData) {
			FieldAccessData other = ((FieldAccessData) object);
			this.computed_receiver = other.computed_receiver;
			this.computed_field = other.computed_field;
		} else if(object != null && object instanceof FieldAccess) {
			FieldAccess node = ((FieldAccess) object);
		}
	}
	
	public FieldAccessData() {}
}
