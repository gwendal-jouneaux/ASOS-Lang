/**
 */
package miniJava_ASOS;

import org.eclipse.emf.ecore.EObject;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see miniJava_ASOS.MiniJava_ASOSPackage#getStatement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Statement extends EObject, AdaptableNode<miniJava_ASOSInterface> {
	@Override
	default public miniJava_ASOSInterface defaultInterface() {
		return new miniJava_ASOSInterface();
	}

} // Statement
