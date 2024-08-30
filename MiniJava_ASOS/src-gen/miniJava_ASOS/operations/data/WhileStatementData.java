package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.WhileStatement;

public class WhileStatementData {
	private Object computed_condition = null;
	public void setcomputed_condition(Object o){this.computed_condition = o;}
	public Object getcomputed_condition(){return this.computed_condition;}
	private Object computed_block = null;
	public void setcomputed_block(Object o){this.computed_block = o;}
	public Object getcomputed_block(){return this.computed_block;}
	
	public WhileStatementData(Object object) {
		if(object != null && object instanceof WhileStatementData) {
			WhileStatementData other = ((WhileStatementData) object);
			this.computed_condition = other.computed_condition;
			this.computed_block = other.computed_block;
		} else if(object != null && object instanceof WhileStatement) {
			WhileStatement node = ((WhileStatement) object);
		}
	}
	
	public WhileStatementData() {}
}
