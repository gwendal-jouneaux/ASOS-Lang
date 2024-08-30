/**
 */
package miniJava_ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.ClassRef#getReferencedClass <em>Referenced Class</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.MiniJava_ASOSPackage#getClassRef()
 * @model
 * @generated
 */
public interface ClassRef extends SingleTypeRef, AdaptableNode<miniJava_ASOSInterface> {
	@Override
	default public miniJava_ASOSInterface defaultInterface() {
		return new miniJava_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Referenced Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Class</em>' reference.
	 * @see #setReferencedClass(TypeDeclaration)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getClassRef_ReferencedClass()
	 * @model
	 * @generated
	 */
	TypeDeclaration getReferencedClass();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.ClassRef#getReferencedClass <em>Referenced Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Class</em>' reference.
	 * @see #getReferencedClass()
	 * @generated
	 */
	void setReferencedClass(TypeDeclaration value);

} // ClassRef
