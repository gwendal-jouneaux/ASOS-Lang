/**
 */
package miniJava_ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.Clazz#isIsabstract <em>Isabstract</em>}</li>
 *   <li>{@link miniJava_ASOS.Clazz#getSuperClass <em>Super Class</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.MiniJava_ASOSPackage#getClazz()
 * @model
 * @generated
 */
public interface Clazz extends TypeDeclaration, AdaptableNode<miniJava_ASOSInterface> {
	@Override
	default public miniJava_ASOSInterface defaultInterface() {
		return new miniJava_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Isabstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isabstract</em>' attribute.
	 * @see #setIsabstract(boolean)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getClazz_Isabstract()
	 * @model
	 * @generated
	 */
	boolean isIsabstract();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.Clazz#isIsabstract <em>Isabstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isabstract</em>' attribute.
	 * @see #isIsabstract()
	 * @generated
	 */
	void setIsabstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #setSuperClass(Clazz)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getClazz_SuperClass()
	 * @model
	 * @generated
	 */
	Clazz getSuperClass();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.Clazz#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(Clazz value);

} // Clazz
