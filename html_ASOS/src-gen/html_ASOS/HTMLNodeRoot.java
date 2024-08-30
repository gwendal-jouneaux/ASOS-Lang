/**
 */
package html_ASOS;

import org.eclipse.emf.ecore.EObject;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import html_ASOS.interfaces.html_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Node Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link html_ASOS.HTMLNodeRoot#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeRoot()
 * @model
 * @generated
 */
public interface HTMLNodeRoot extends EObject, AdaptableNode<html_ASOSInterface> {
	@Override
	default public html_ASOSInterface defaultInterface() {
		return new html_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(HTMLNodeBase)
	 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeRoot_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HTMLNodeBase getRoot();

	/**
	 * Sets the value of the '{@link html_ASOS.HTMLNodeRoot#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(HTMLNodeBase value);

} // HTMLNodeRoot
