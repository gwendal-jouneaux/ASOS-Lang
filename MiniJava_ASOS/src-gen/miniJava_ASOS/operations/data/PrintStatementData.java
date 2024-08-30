package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.PrintStatement;

public class PrintStatementData {
	private Object computed_expression = null;
	public void setcomputed_expression(Object o){this.computed_expression = o;}
	public Object getcomputed_expression(){return this.computed_expression;}
	
	public PrintStatementData(Object object) {
		if(object != null && object instanceof PrintStatementData) {
			PrintStatementData other = ((PrintStatementData) object);
			this.computed_expression = other.computed_expression;
		} else if(object != null && object instanceof PrintStatement) {
			PrintStatement node = ((PrintStatement) object);
		}
	}
	
	public PrintStatementData() {}
}
