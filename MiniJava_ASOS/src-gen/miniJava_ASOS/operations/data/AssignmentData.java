package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.Assignment;

public class AssignmentData {
	private Object computed_assignee = null;
	public void setcomputed_assignee(Object o){this.computed_assignee = o;}
	public Object getcomputed_assignee(){return this.computed_assignee;}
	private Object computed_value = null;
	public void setcomputed_value(Object o){this.computed_value = o;}
	public Object getcomputed_value(){return this.computed_value;}
	
	public AssignmentData(Object object) {
		if(object != null && object instanceof AssignmentData) {
			AssignmentData other = ((AssignmentData) object);
			this.computed_assignee = other.computed_assignee;
			this.computed_value = other.computed_value;
		} else if(object != null && object instanceof Assignment) {
			Assignment node = ((Assignment) object);
		}
	}
	
	public AssignmentData() {}
}
