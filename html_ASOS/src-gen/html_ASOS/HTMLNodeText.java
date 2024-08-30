/**
 */
package html_ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import html_ASOS.interfaces.html_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Node Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link html_ASOS.HTMLNodeText#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeText()
 * @model
 * @generated
 */
public interface HTMLNodeText extends HTMLNodeBase, AdaptableNode<html_ASOSInterface> {
	@Override
	default public html_ASOSInterface defaultInterface() {
		return new html_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeText_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link html_ASOS.HTMLNodeText#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // HTMLNodeText
