/**
 */
package miniJava_ASOS;

import org.eclipse.emf.common.util.EList;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.NewObject#getType <em>Type</em>}</li>
 *   <li>{@link miniJava_ASOS.NewObject#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.MiniJava_ASOSPackage#getNewObject()
 * @model
 * @generated
 */
public interface NewObject extends Expression, AdaptableNode<miniJava_ASOSInterface> {
	@Override
	default public miniJava_ASOSInterface defaultInterface() {
		return new miniJava_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Clazz)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getNewObject_Type()
	 * @model
	 * @generated
	 */
	Clazz getType();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.NewObject#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Clazz value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link miniJava_ASOS.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getNewObject_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArgs();

} // NewObject
