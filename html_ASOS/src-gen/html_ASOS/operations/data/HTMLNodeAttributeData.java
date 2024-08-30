package html_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import html_ASOS.HTMLNodeAttribute;

public class HTMLNodeAttributeData {
	private Object computed_name = null;
	public void setcomputed_name(Object o){this.computed_name = o;}
	public Object getcomputed_name(){return this.computed_name;}
	private Object computed_value = null;
	public void setcomputed_value(Object o){this.computed_value = o;}
	public Object getcomputed_value(){return this.computed_value;}
	private Object computed_type = null;
	public void setcomputed_type(Object o){this.computed_type = o;}
	public Object getcomputed_type(){return this.computed_type;}
	
	public HTMLNodeAttributeData(Object object) {
		if(object != null && object instanceof HTMLNodeAttributeData) {
			HTMLNodeAttributeData other = ((HTMLNodeAttributeData) object);
			this.computed_name = other.computed_name;
			this.computed_value = other.computed_value;
			this.computed_type = other.computed_type;
		} else if(object != null && object instanceof HTMLNodeAttribute) {
			HTMLNodeAttribute node = ((HTMLNodeAttribute) object);
		}
	}
	
	public HTMLNodeAttributeData() {}
}
