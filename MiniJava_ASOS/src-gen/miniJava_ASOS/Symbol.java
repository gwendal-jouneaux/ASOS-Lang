/**
 */
package miniJava_ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see miniJava_ASOS.MiniJava_ASOSPackage#getSymbol()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Symbol extends TypedDeclaration, AdaptableNode<miniJava_ASOSInterface> {
	@Override
	default public miniJava_ASOSInterface defaultInterface() {
		return new miniJava_ASOSInterface();
	}

} // Symbol
