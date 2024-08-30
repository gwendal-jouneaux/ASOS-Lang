/**
 */
package html_ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import html_ASOS.interfaces.html_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Node Empty Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeEmptyTag()
 * @model
 * @generated
 */
public interface HTMLNodeEmptyTag extends HTMLNodeBaseTag, AdaptableNode<html_ASOSInterface> {
	@Override
	default public html_ASOSInterface defaultInterface() {
		return new html_ASOSInterface();
	}

} // HTMLNodeEmptyTag
