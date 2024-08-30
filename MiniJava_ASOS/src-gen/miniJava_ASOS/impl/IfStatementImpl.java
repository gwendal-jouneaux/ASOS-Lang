/**
 */
package miniJava_ASOS.impl;

import miniJava_ASOS.Block;
import miniJava_ASOS.Expression;
import miniJava_ASOS.IfStatement;
import miniJava_ASOS.MiniJava_ASOSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.impl.IfStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link miniJava_ASOS.impl.IfStatementImpl#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link miniJava_ASOS.impl.IfStatementImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends MinimalEObjectImpl.Container implements IfStatement {

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getThenBlock() <em>Then Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenBlock()
	 * @generated
	 * @ordered
	 */
	protected Block thenBlock;

	/**
	 * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBlock()
	 * @generated
	 * @ordered
	 */
	protected Block elseBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJava_ASOSPackage.Literals.IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MiniJava_ASOSPackage.IF_STATEMENT__EXPRESSION, oldExpression, newExpression);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject) expression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MiniJava_ASOSPackage.IF_STATEMENT__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject) newExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MiniJava_ASOSPackage.IF_STATEMENT__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJava_ASOSPackage.IF_STATEMENT__EXPRESSION,
					newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block getThenBlock() {
		return thenBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenBlock(Block newThenBlock, NotificationChain msgs) {
		Block oldThenBlock = thenBlock;
		thenBlock = newThenBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MiniJava_ASOSPackage.IF_STATEMENT__THEN_BLOCK, oldThenBlock, newThenBlock);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThenBlock(Block newThenBlock) {
		if (newThenBlock != thenBlock) {
			NotificationChain msgs = null;
			if (thenBlock != null)
				msgs = ((InternalEObject) thenBlock).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MiniJava_ASOSPackage.IF_STATEMENT__THEN_BLOCK, null, msgs);
			if (newThenBlock != null)
				msgs = ((InternalEObject) newThenBlock).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MiniJava_ASOSPackage.IF_STATEMENT__THEN_BLOCK, null, msgs);
			msgs = basicSetThenBlock(newThenBlock, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJava_ASOSPackage.IF_STATEMENT__THEN_BLOCK,
					newThenBlock, newThenBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block getElseBlock() {
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseBlock(Block newElseBlock, NotificationChain msgs) {
		Block oldElseBlock = elseBlock;
		elseBlock = newElseBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MiniJava_ASOSPackage.IF_STATEMENT__ELSE_BLOCK, oldElseBlock, newElseBlock);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElseBlock(Block newElseBlock) {
		if (newElseBlock != elseBlock) {
			NotificationChain msgs = null;
			if (elseBlock != null)
				msgs = ((InternalEObject) elseBlock).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MiniJava_ASOSPackage.IF_STATEMENT__ELSE_BLOCK, null, msgs);
			if (newElseBlock != null)
				msgs = ((InternalEObject) newElseBlock).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MiniJava_ASOSPackage.IF_STATEMENT__ELSE_BLOCK, null, msgs);
			msgs = basicSetElseBlock(newElseBlock, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJava_ASOSPackage.IF_STATEMENT__ELSE_BLOCK,
					newElseBlock, newElseBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiniJava_ASOSPackage.IF_STATEMENT__EXPRESSION:
			return basicSetExpression(null, msgs);
		case MiniJava_ASOSPackage.IF_STATEMENT__THEN_BLOCK:
			return basicSetThenBlock(null, msgs);
		case MiniJava_ASOSPackage.IF_STATEMENT__ELSE_BLOCK:
			return basicSetElseBlock(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MiniJava_ASOSPackage.IF_STATEMENT__EXPRESSION:
			return getExpression();
		case MiniJava_ASOSPackage.IF_STATEMENT__THEN_BLOCK:
			return getThenBlock();
		case MiniJava_ASOSPackage.IF_STATEMENT__ELSE_BLOCK:
			return getElseBlock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MiniJava_ASOSPackage.IF_STATEMENT__EXPRESSION:
			setExpression((Expression) newValue);
			return;
		case MiniJava_ASOSPackage.IF_STATEMENT__THEN_BLOCK:
			setThenBlock((Block) newValue);
			return;
		case MiniJava_ASOSPackage.IF_STATEMENT__ELSE_BLOCK:
			setElseBlock((Block) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MiniJava_ASOSPackage.IF_STATEMENT__EXPRESSION:
			setExpression((Expression) null);
			return;
		case MiniJava_ASOSPackage.IF_STATEMENT__THEN_BLOCK:
			setThenBlock((Block) null);
			return;
		case MiniJava_ASOSPackage.IF_STATEMENT__ELSE_BLOCK:
			setElseBlock((Block) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MiniJava_ASOSPackage.IF_STATEMENT__EXPRESSION:
			return expression != null;
		case MiniJava_ASOSPackage.IF_STATEMENT__THEN_BLOCK:
			return thenBlock != null;
		case MiniJava_ASOSPackage.IF_STATEMENT__ELSE_BLOCK:
			return elseBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
