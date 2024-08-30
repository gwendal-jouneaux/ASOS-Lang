package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.Block;

public class BlockData {
	private EList computed_statements;
	public void setcomputed_statements(List o){this.computed_statements = new BasicEList(o);}
	public EList getcomputed_statements(){return this.computed_statements;}
	public void setcomputed_statements(int index, Object o){this.computed_statements.set(this.getindex_statements(), o);}
	public Object getcomputed_statements(int index){return this.computed_statements.get(this.getindex_statements());}
	private int index_statements = 0;
	public void setindex_statements(int i){this.index_statements = i;}
	public void incindex_statements(){this.index_statements += 1;}
	public int getindex_statements(){return this.index_statements;}
	
	public BlockData(Object object) {
		if(object != null && object instanceof BlockData) {
			BlockData other = ((BlockData) object);
			this.computed_statements = other.computed_statements;
			this.index_statements = other.index_statements;
		} else if(object != null && object instanceof Block) {
			Block node = ((Block) object);
			this.computed_statements = new BasicEList(node.getStatements().size());
			for(int i = 0 ; i < node.getStatements().size() ; i++){
				this.computed_statements.add(null);
			}
		}
	}
	
	public BlockData() {}
}
