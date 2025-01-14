/**
 */
package miniJava_ASOS.impl;

import java.util.Collection;

import miniJava_ASOS.Block;
import miniJava_ASOS.Method;
import miniJava_ASOS.MiniJava_ASOSPackage;
import miniJava_ASOS.Parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.impl.MethodImpl#isIsabstract <em>Isabstract</em>}</li>
 *   <li>{@link miniJava_ASOS.impl.MethodImpl#isIsstatic <em>Isstatic</em>}</li>
 *   <li>{@link miniJava_ASOS.impl.MethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link miniJava_ASOS.impl.MethodImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MemberImpl implements Method {

	/**
	 * The default value of the '{@link #isIsabstract() <em>Isabstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsabstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsabstract() <em>Isabstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsabstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isabstract = ISABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsstatic() <em>Isstatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsstatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISSTATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsstatic() <em>Isstatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsstatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isstatic = ISSTATIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> params;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Block body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJava_ASOSPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsabstract() {
		return isabstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsabstract(boolean newIsabstract) {
		boolean oldIsabstract = isabstract;
		isabstract = newIsabstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJava_ASOSPackage.METHOD__ISABSTRACT,
					oldIsabstract, isabstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsstatic() {
		return isstatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsstatic(boolean newIsstatic) {
		boolean oldIsstatic = isstatic;
		isstatic = newIsstatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJava_ASOSPackage.METHOD__ISSTATIC, oldIsstatic,
					isstatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Parameter>(Parameter.class, this, MiniJava_ASOSPackage.METHOD__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		Block oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MiniJava_ASOSPackage.METHOD__BODY, oldBody, newBody);
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
	public void setBody(Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MiniJava_ASOSPackage.METHOD__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MiniJava_ASOSPackage.METHOD__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJava_ASOSPackage.METHOD__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiniJava_ASOSPackage.METHOD__PARAMS:
			return ((InternalEList<?>) getParams()).basicRemove(otherEnd, msgs);
		case MiniJava_ASOSPackage.METHOD__BODY:
			return basicSetBody(null, msgs);
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
		case MiniJava_ASOSPackage.METHOD__ISABSTRACT:
			return isIsabstract();
		case MiniJava_ASOSPackage.METHOD__ISSTATIC:
			return isIsstatic();
		case MiniJava_ASOSPackage.METHOD__PARAMS:
			return getParams();
		case MiniJava_ASOSPackage.METHOD__BODY:
			return getBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MiniJava_ASOSPackage.METHOD__ISABSTRACT:
			setIsabstract((Boolean) newValue);
			return;
		case MiniJava_ASOSPackage.METHOD__ISSTATIC:
			setIsstatic((Boolean) newValue);
			return;
		case MiniJava_ASOSPackage.METHOD__PARAMS:
			getParams().clear();
			getParams().addAll((Collection<? extends Parameter>) newValue);
			return;
		case MiniJava_ASOSPackage.METHOD__BODY:
			setBody((Block) newValue);
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
		case MiniJava_ASOSPackage.METHOD__ISABSTRACT:
			setIsabstract(ISABSTRACT_EDEFAULT);
			return;
		case MiniJava_ASOSPackage.METHOD__ISSTATIC:
			setIsstatic(ISSTATIC_EDEFAULT);
			return;
		case MiniJava_ASOSPackage.METHOD__PARAMS:
			getParams().clear();
			return;
		case MiniJava_ASOSPackage.METHOD__BODY:
			setBody((Block) null);
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
		case MiniJava_ASOSPackage.METHOD__ISABSTRACT:
			return isabstract != ISABSTRACT_EDEFAULT;
		case MiniJava_ASOSPackage.METHOD__ISSTATIC:
			return isstatic != ISSTATIC_EDEFAULT;
		case MiniJava_ASOSPackage.METHOD__PARAMS:
			return params != null && !params.isEmpty();
		case MiniJava_ASOSPackage.METHOD__BODY:
			return body != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isabstract: ");
		result.append(isabstract);
		result.append(", isstatic: ");
		result.append(isstatic);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
