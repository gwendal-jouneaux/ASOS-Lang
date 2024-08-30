package miniJava_ASOS.operations.data;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import miniJava_ASOS.Program;

public class ProgramData {
	private Object computed_name = null;
	public void setcomputed_name(Object o){this.computed_name = o;}
	public Object getcomputed_name(){return this.computed_name;}
	private EList computed_imports;
	public void setcomputed_imports(List o){this.computed_imports = new BasicEList(o);}
	public EList getcomputed_imports(){return this.computed_imports;}
	public void setcomputed_imports(int index, Object o){this.computed_imports.set(this.getindex_imports(), o);}
	public Object getcomputed_imports(int index){return this.computed_imports.get(this.getindex_imports());}
	private int index_imports = 0;
	public void setindex_imports(int i){this.index_imports = i;}
	public void incindex_imports(){this.index_imports += 1;}
	public int getindex_imports(){return this.index_imports;}
	private EList computed_classes;
	public void setcomputed_classes(List o){this.computed_classes = new BasicEList(o);}
	public EList getcomputed_classes(){return this.computed_classes;}
	public void setcomputed_classes(int index, Object o){this.computed_classes.set(this.getindex_classes(), o);}
	public Object getcomputed_classes(int index){return this.computed_classes.get(this.getindex_classes());}
	private int index_classes = 0;
	public void setindex_classes(int i){this.index_classes = i;}
	public void incindex_classes(){this.index_classes += 1;}
	public int getindex_classes(){return this.index_classes;}
	private Object computed_state = null;
	public void setcomputed_state(Object o){this.computed_state = o;}
	public Object getcomputed_state(){return this.computed_state;}
	
	public ProgramData(Object object) {
		if(object != null && object instanceof ProgramData) {
			ProgramData other = ((ProgramData) object);
			this.computed_name = other.computed_name;
			this.computed_imports = other.computed_imports;
			this.index_imports = other.index_imports;
			this.computed_classes = other.computed_classes;
			this.index_classes = other.index_classes;
			this.computed_state = other.computed_state;
		} else if(object != null && object instanceof Program) {
			Program node = ((Program) object);
			this.computed_imports = new BasicEList(node.getImports().size());
			for(int i = 0 ; i < node.getImports().size() ; i++){
				this.computed_imports.add(null);
			}
			this.computed_classes = new BasicEList(node.getClasses().size());
			for(int i = 0 ; i < node.getClasses().size() ; i++){
				this.computed_classes.add(null);
			}
		}
	}
	
	public ProgramData() {}
}
