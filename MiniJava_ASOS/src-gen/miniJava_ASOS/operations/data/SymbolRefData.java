package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.SymbolRef;

public class SymbolRefData {
	private Object computed_symbol = null;
	public void setcomputed_symbol(Object o){this.computed_symbol = o;}
	public Object getcomputed_symbol(){return this.computed_symbol;}
	
	public SymbolRefData(Object object) {
		if(object != null && object instanceof SymbolRefData) {
			SymbolRefData other = ((SymbolRefData) object);
			this.computed_symbol = other.computed_symbol;
		} else if(object != null && object instanceof SymbolRef) {
			SymbolRef node = ((SymbolRef) object);
		}
	}
	
	public SymbolRefData() {}
}
