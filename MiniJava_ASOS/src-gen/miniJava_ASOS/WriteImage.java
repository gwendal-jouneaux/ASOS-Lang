/**
 */
package miniJava_ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.WriteImage#getPath <em>Path</em>}</li>
 *   <li>{@link miniJava_ASOS.WriteImage#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.MiniJava_ASOSPackage#getWriteImage()
 * @model
 * @generated
 */
public interface WriteImage extends Statement, AdaptableNode<miniJava_ASOSInterface> {
	@Override
	default public miniJava_ASOSInterface defaultInterface() {
		return new miniJava_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Expression)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getWriteImage_Path()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPath();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.WriteImage#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Expression value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Expression)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getWriteImage_Image()
	 * @model containment="true"
	 * @generated
	 */
	Expression getImage();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.WriteImage#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Expression value);

} // WriteImage
