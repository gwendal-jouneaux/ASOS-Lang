/**
 */
package miniJava_ASOS;

import org.eclipse.emf.common.util.EList;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.Block#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.MiniJava_ASOSPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Statement, AdaptableNode<miniJava_ASOSInterface> {
	@Override
	default public miniJava_ASOSInterface defaultInterface() {
		return new miniJava_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link miniJava_ASOS.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getBlock_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // Block
