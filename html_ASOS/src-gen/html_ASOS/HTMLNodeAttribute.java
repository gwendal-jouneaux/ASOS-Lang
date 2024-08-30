/**
 */
package html_ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import html_ASOS.interfaces.html_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML Node Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link html_ASOS.HTMLNodeAttribute#getName <em>Name</em>}</li>
 *   <li>{@link html_ASOS.HTMLNodeAttribute#getValue <em>Value</em>}</li>
 *   <li>{@link html_ASOS.HTMLNodeAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeAttribute()
 * @model
 * @generated
 */
public interface HTMLNodeAttribute extends HTMLNodeBase, AdaptableNode<html_ASOSInterface> {
	@Override
	default public html_ASOSInterface defaultInterface() {
		return new html_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link html_ASOS.HTMLNodeAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeAttribute_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link html_ASOS.HTMLNodeAttribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link html_ASOS.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see html_ASOS.AttributeType
	 * @see #setType(AttributeType)
	 * @see html_ASOS.Html_ASOSPackage#getHTMLNodeAttribute_Type()
	 * @model
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link html_ASOS.HTMLNodeAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see html_ASOS.AttributeType
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributeType value);

} // HTMLNodeAttribute
