/**
 */
package html_ASOS;

import org.eclipse.emf.common.util.EList;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import html_ASOS.interfaces.html_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Node Base Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link html_ASOS.HTMLNodeBaseTag#getTag <em>Tag</em>}</li>
 *   <li>{@link html_ASOS.HTMLNodeBaseTag#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeBaseTag()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface HTMLNodeBaseTag extends HTMLNodeBase, AdaptableNode<html_ASOSInterface> {
	@Override
	default public html_ASOSInterface defaultInterface() {
		return new html_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeBaseTag_Tag()
	 * @model required="true"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link html_ASOS.HTMLNodeBaseTag#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link html_ASOS.HTMLNodeAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeBaseTag_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<HTMLNodeAttribute> getAttributes();

} // HTMLNodeBaseTag
