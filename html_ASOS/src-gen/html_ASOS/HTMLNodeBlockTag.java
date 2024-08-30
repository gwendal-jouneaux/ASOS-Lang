/**
 */
package html_ASOS;

import org.eclipse.emf.common.util.EList;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import html_ASOS.interfaces.html_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Node Block Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link html_ASOS.HTMLNodeBlockTag#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeBlockTag()
 * @model
 * @generated
 */
public interface HTMLNodeBlockTag extends HTMLNodeBaseTag, AdaptableNode<html_ASOSInterface> {
	@Override
	default public html_ASOSInterface defaultInterface() {
		return new html_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link html_ASOS.HTMLNodeBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeBlockTag_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<HTMLNodeBase> getChildren();

} // HTMLNodeBlockTag
