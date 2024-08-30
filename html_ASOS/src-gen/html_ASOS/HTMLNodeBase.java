/**
 */
package html_ASOS;

import org.eclipse.emf.ecore.EObject;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import html_ASOS.interfaces.html_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Node Base</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeBase()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface HTMLNodeBase extends EObject, AdaptableNode<html_ASOSInterface> {
	@Override
	default public html_ASOSInterface defaultInterface() {
		return new html_ASOSInterface();
	}

} // HTMLNodeBase
