/**
 */
package miniJava_ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.Member#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.MiniJava_ASOSPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends TypedDeclaration, AdaptableNode<miniJava_ASOSInterface> {
	@Override
	default public miniJava_ASOSInterface defaultInterface() {
		return new miniJava_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link miniJava_ASOS.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see miniJava_ASOS.AccessLevel
	 * @see #setAccess(AccessLevel)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getMember_Access()
	 * @model
	 * @generated
	 */
	AccessLevel getAccess();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.Member#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see miniJava_ASOS.AccessLevel
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(AccessLevel value);

} // Member
