/**
 */
package html_ASOS.sd.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import html_ASOS.sd.SdPackage;
import html_ASOS.sd.State;
import html_ASOS.sd.StringValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String join(EList<?> list) {
		StringBuilder sb = new StringBuilder();
		EList<StringValue> values = (EList<StringValue>) list;
		for (StringValue elem : values) {
			sb.append(elem.getValue());
		}
		return sb.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SdPackage.STATE___JOIN__ELIST:
			return join((EList<?>) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StateImpl
