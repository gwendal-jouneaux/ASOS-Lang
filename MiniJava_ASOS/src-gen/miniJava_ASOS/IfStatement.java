/**
 */
package miniJava_ASOS;

import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
import miniJava_ASOS.interfaces.miniJava_ASOSInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.IfStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link miniJava_ASOS.IfStatement#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link miniJava_ASOS.IfStatement#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @see miniJava_ASOS.MiniJava_ASOSPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statement, AdaptableNode<miniJava_ASOSInterface> {
	@Override
	default public miniJava_ASOSInterface defaultInterface() {
		return new miniJava_ASOSInterface();
	}

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getIfStatement_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.IfStatement#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Then Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Block</em>' containment reference.
	 * @see #setThenBlock(Block)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getIfStatement_ThenBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getThenBlock();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.IfStatement#getThenBlock <em>Then Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Block</em>' containment reference.
	 * @see #getThenBlock()
	 * @generated
	 */
	void setThenBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' containment reference.
	 * @see #setElseBlock(Block)
	 * @see miniJava_ASOS.MiniJava_ASOSPackage#getIfStatement_ElseBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getElseBlock();

	/**
	 * Sets the value of the '{@link miniJava_ASOS.IfStatement#getElseBlock <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Block</em>' containment reference.
	 * @see #getElseBlock()
	 * @generated
	 */
	void setElseBlock(Block value);

} // IfStatement
