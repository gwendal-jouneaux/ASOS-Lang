/**
 */
package miniJava_ASOS.sd;

import miniJava_ASOS.Symbol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.sd.SymbolBinding#getValue <em>Value</em>}</li>
 *   <li>{@link miniJava_ASOS.sd.SymbolBinding#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.sd.SdPackage#getSymbolBinding()
 * @model annotation="aspect"
 *        annotation="RuntimeData"
 * @generated
 */
public interface SymbolBinding extends EObject {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see miniJava_ASOS.sd.SdPackage#getSymbolBinding_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.SymbolBinding#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' reference.
	 * @see #setSymbol(Symbol)
	 * @see miniJava_ASOS.sd.SdPackage#getSymbolBinding_Symbol()
	 * @model required="true"
	 * @generated
	 */
	Symbol getSymbol();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.sd.SymbolBinding#getSymbol <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(Symbol value);

} // SymbolBinding
