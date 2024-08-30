/**
 */
package miniJava_ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see miniJava_ASOS.MiniJava_ASOSPackage#getSuper()
 * @model
 * @generated
 */
public interface Super extends Expression, AdaptableNode<miniJava_ASOSInterface> {
	@Override
	default public miniJava_ASOSInterface defaultInterface() {
		return new miniJava_ASOSInterface();
	}

} // Super
