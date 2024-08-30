package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.IfStatement;

public class IfStatementData {
	private Object computed_expression = null;
	public void setcomputed_expression(Object o){this.computed_expression = o;}
	public Object getcomputed_expression(){return this.computed_expression;}
	private Object computed_thenBlock = null;
	public void setcomputed_thenBlock(Object o){this.computed_thenBlock = o;}
	public Object getcomputed_thenBlock(){return this.computed_thenBlock;}
	private Object computed_elseBlock = null;
	public void setcomputed_elseBlock(Object o){this.computed_elseBlock = o;}
	public Object getcomputed_elseBlock(){return this.computed_elseBlock;}
	
	public IfStatementData(Object object) {
		if(object != null && object instanceof IfStatementData) {
			IfStatementData other = ((IfStatementData) object);
			this.computed_expression = other.computed_expression;
			this.computed_thenBlock = other.computed_thenBlock;
			this.computed_elseBlock = other.computed_elseBlock;
		} else if(object != null && object instanceof IfStatement) {
			IfStatement node = ((IfStatement) object);
		}
	}
	
	public IfStatementData() {}
}
