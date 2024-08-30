/**
 */
package html_ASOS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see html_ASOS.Html_ASOSPackage
 * @generated
 */
public interface Html_ASOSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Html_ASOSFactory eINSTANCE = html_ASOS.impl.Html_ASOSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HTML Node Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML Node Root</em>'.
	 * @generated
	 */
	HTMLNodeRoot createHTMLNodeRoot();

	/**
	 * Returns a new object of class '<em>HTML Node Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML Node Text</em>'.
	 * @generated
	 */
	HTMLNodeText createHTMLNodeText();

	/**
	 * Returns a new object of class '<em>HTML Node Block Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML Node Block Tag</em>'.
	 * @generated
	 */
	HTMLNodeBlockTag createHTMLNodeBlockTag();

	/**
	 * Returns a new object of class '<em>HTML Node Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML Node Attribute</em>'.
	 * @generated
	 */
	HTMLNodeAttribute createHTMLNodeAttribute();

	/**
	 * Returns a new object of class '<em>HTML Node Empty Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML Node Empty Tag</em>'.
	 * @generated
	 */
	HTMLNodeEmptyTag createHTMLNodeEmptyTag();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Html_ASOSPackage getHtml_ASOSPackage();

} //Html_ASOSFactory
