package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.This;

public class ThisData {
	
	public ThisData(Object object) {
		if(object != null && object instanceof ThisData) {
			ThisData other = ((ThisData) object);
		} else if(object != null && object instanceof This) {
			This node = ((This) object);
		}
	}
	
	public ThisData() {}
}
