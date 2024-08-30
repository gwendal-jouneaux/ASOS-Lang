package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.ForStatement;

public class ForStatementData {
	private Object computed_declaration = null;
	public void setcomputed_declaration(Object o){this.computed_declaration = o;}
	public Object getcomputed_declaration(){return this.computed_declaration;}
	private Object computed_condition = null;
	public void setcomputed_condition(Object o){this.computed_condition = o;}
	public Object getcomputed_condition(){return this.computed_condition;}
	private Object computed_progression = null;
	public void setcomputed_progression(Object o){this.computed_progression = o;}
	public Object getcomputed_progression(){return this.computed_progression;}
	private Object computed_block = null;
	public void setcomputed_block(Object o){this.computed_block = o;}
	public Object getcomputed_block(){return this.computed_block;}
	
	public ForStatementData(Object object) {
		if(object != null && object instanceof ForStatementData) {
			ForStatementData other = ((ForStatementData) object);
			this.computed_declaration = other.computed_declaration;
			this.computed_condition = other.computed_condition;
			this.computed_progression = other.computed_progression;
			this.computed_block = other.computed_block;
		} else if(object != null && object instanceof ForStatement) {
			ForStatement node = ((ForStatement) object);
		}
	}
	
	public ForStatementData() {}
}
