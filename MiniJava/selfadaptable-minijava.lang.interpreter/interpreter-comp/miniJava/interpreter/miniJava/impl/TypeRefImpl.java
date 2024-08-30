package miniJava.interpreter.miniJava.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import miniJava.interpreter.miniJava.MiniJavaPackage;
import miniJava.interpreter.miniJava.TypeRef;

public class TypeRefImpl extends MinimalEObjectImpl.Container implements TypeRef {
	protected TypeRefImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.TYPE_REF;
	}

	public boolean compare(TypeRef other) {
		boolean result;
		result = (boolean) (this.eClass()).equals(other.eClass()) ;
		return result;
	}
}
