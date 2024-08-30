package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.Null;

public class NullData {
	
	public NullData(Object object) {
		if(object != null && object instanceof NullData) {
			NullData other = ((NullData) object);
		} else if(object != null && object instanceof Null) {
			Null node = ((Null) object);
		}
	}
	
	public NullData() {}
}
