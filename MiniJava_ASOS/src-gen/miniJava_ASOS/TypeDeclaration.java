/**
 */
package miniJava_ASOS;

import org.eclipse.emf.common.util.EList;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.TypeDeclaration#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link miniJava_ASOS.TypeDeclaration#getImplementz <em>Implementz</em>}</li>
 *   <li>{@link miniJava_ASOS.TypeDeclaration#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.MiniJava_ASOSPackage#getTypeDeclaration()
 * @model
 * @generated
 */
public interface TypeDeclaration extends NamedElement, AdaptableNode<miniJava_ASOSInterface> {
	@Override
	default public miniJava_ASOSInterface defaultInterface() {
		return new miniJava_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' attribute.
	 * The literals are from the enumeration {@link miniJava_ASOS.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' attribute.
	 * @see miniJava_ASOS.AccessLevel
	 * @see #setAccessLevel(AccessLevel)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getTypeDeclaration_AccessLevel()
	 * @model
	 * @generated
	 */
	AccessLevel getAccessLevel();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.TypeDeclaration#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level</em>' attribute.
	 * @see miniJava_ASOS.AccessLevel
	 * @see #getAccessLevel()
	 * @generated
	 */
	void setAccessLevel(AccessLevel value);

	/**
	 * Returns the value of the '<em><b>Implementz</b></em>' reference list.
	 * The list contents are of type {@link miniJava_ASOS.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementz</em>' reference list.
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getTypeDeclaration_Implementz()
	 * @model
	 * @generated
	 */
	EList<Interface> getImplementz();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link miniJava_ASOS.Member}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getTypeDeclaration_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

} // TypeDeclaration
