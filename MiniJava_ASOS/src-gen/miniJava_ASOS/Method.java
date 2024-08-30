/**
 */
package miniJava_ASOS;

import org.eclipse.emf.common.util.EList;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.Method#isIsabstract <em>Isabstract</em>}</li>
 *   <li>{@link miniJava_ASOS.Method#isIsstatic <em>Isstatic</em>}</li>
 *   <li>{@link miniJava_ASOS.Method#getParams <em>Params</em>}</li>
 *   <li>{@link miniJava_ASOS.Method#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.MiniJava_ASOSPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Member, AdaptableNode<miniJava_ASOSInterface> {
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
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getMethod_Isabstract()
	 * @model
	 * @generated
	 */
	boolean isIsabstract();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.Method#isIsabstract <em>Isabstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isabstract</em>' attribute.
	 * @see #isIsabstract()
	 * @generated
	 */
	void setIsabstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Isstatic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isstatic</em>' attribute.
	 * @see #setIsstatic(boolean)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getMethod_Isstatic()
	 * @model
	 * @generated
	 */
	boolean isIsstatic();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.Method#isIsstatic <em>Isstatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isstatic</em>' attribute.
	 * @see #isIsstatic()
	 * @generated
	 */
	void setIsstatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link miniJava_ASOS.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getMethod_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParams();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Block)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getMethod_Body()
	 * @model containment="true"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.Method#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Block value);

} // Method
