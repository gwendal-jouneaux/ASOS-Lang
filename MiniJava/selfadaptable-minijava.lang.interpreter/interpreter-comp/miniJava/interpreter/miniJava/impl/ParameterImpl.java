package miniJava.interpreter.miniJava.impl;

import org.eclipse.emf.ecore.EClass;

import miniJava.interpreter.miniJava.MiniJavaPackage;
import miniJava.interpreter.miniJava.Parameter;
import miniJava.interpreter.miniJava.TypeRef;

public class ParameterImpl extends SymbolImpl implements Parameter {
	protected ParameterImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.PARAMETER;
	}

	public boolean compare(Parameter other) {
		boolean result;
		result = (boolean) ((((this.name).equals(other.getName()))) && (((TypeRef) (this.typeRef)).compare((TypeRef) (other.getTypeRef())))) ;
		return result;
	}
}
