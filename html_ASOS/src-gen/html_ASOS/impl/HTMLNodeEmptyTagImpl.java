/**
 */
package html_ASOS.impl;

import html_ASOS.HTMLNodeAttribute;
import html_ASOS.HTMLNodeEmptyTag;
import html_ASOS.Html_ASOSPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTML Node Empty Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link html_ASOS.impl.HTMLNodeEmptyTagImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link html_ASOS.impl.HTMLNodeEmptyTagImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTMLNodeEmptyTagImpl extends MinimalEObjectImpl.Container implements HTMLNodeEmptyTag {

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<HTMLNodeAttribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTMLNodeEmptyTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Html_ASOSPackage.Literals.HTML_NODE_EMPTY_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Html_ASOSPackage.HTML_NODE_EMPTY_TAG__TAG, oldTag,
					tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HTMLNodeAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<HTMLNodeAttribute>(HTMLNodeAttribute.class, this,
					Html_ASOSPackage.HTML_NODE_EMPTY_TAG__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Html_ASOSPackage.HTML_NODE_EMPTY_TAG__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
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
		case Html_ASOSPackage.HTML_NODE_EMPTY_TAG__TAG:
			return getTag();
		case Html_ASOSPackage.HTML_NODE_EMPTY_TAG__ATTRIBUTES:
			return getAttributes();
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
		case Html_ASOSPackage.HTML_NODE_EMPTY_TAG__TAG:
			setTag((String) newValue);
			return;
		case Html_ASOSPackage.HTML_NODE_EMPTY_TAG__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends HTMLNodeAttribute>) newValue);
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
		case Html_ASOSPackage.HTML_NODE_EMPTY_TAG__TAG:
			setTag(TAG_EDEFAULT);
			return;
		case Html_ASOSPackage.HTML_NODE_EMPTY_TAG__ATTRIBUTES:
			getAttributes().clear();
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
		case Html_ASOSPackage.HTML_NODE_EMPTY_TAG__TAG:
			return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
		case Html_ASOSPackage.HTML_NODE_EMPTY_TAG__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
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
		result.append(" (tag: ");
		result.append(tag);
		result.append(')');
		return result.toString();
	}

} //HTMLNodeEmptyTagImpl
