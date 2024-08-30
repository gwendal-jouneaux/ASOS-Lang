package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.WriteImage;

public class WriteImageData {
	private Object computed_path = null;
	public void setcomputed_path(Object o){this.computed_path = o;}
	public Object getcomputed_path(){return this.computed_path;}
	private Object computed_image = null;
	public void setcomputed_image(Object o){this.computed_image = o;}
	public Object getcomputed_image(){return this.computed_image;}
	
	public WriteImageData(Object object) {
		if(object != null && object instanceof WriteImageData) {
			WriteImageData other = ((WriteImageData) object);
			this.computed_path = other.computed_path;
			this.computed_image = other.computed_image;
		} else if(object != null && object instanceof WriteImage) {
			WriteImage node = ((WriteImage) object);
		}
	}
	
	public WriteImageData() {}
}
