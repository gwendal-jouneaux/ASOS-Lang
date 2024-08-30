package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.LoadImage;

public class LoadImageData {
	private Object computed_path = null;
	public void setcomputed_path(Object o){this.computed_path = o;}
	public Object getcomputed_path(){return this.computed_path;}
	
	public LoadImageData(Object object) {
		if(object != null && object instanceof LoadImageData) {
			LoadImageData other = ((LoadImageData) object);
			this.computed_path = other.computed_path;
		} else if(object != null && object instanceof LoadImage) {
			LoadImage node = ((LoadImage) object);
		}
	}
	
	public LoadImageData() {}
}
