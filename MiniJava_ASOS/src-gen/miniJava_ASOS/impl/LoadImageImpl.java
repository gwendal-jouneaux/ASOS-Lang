/**
 */
package miniJava_ASOS.impl;

import miniJava_ASOS.Expression;
import miniJava_ASOS.LoadImage;
import miniJava_ASOS.MiniJava_ASOSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.impl.LoadImageImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadImageImpl extends MinimalEObjectImpl.Container implements LoadImage {

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected Expression path;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJava_ASOSPackage.Literals.LOAD_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(Expression newPath, NotificationChain msgs) {
		Expression oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MiniJava_ASOSPackage.LOAD_IMAGE__PATH, oldPath, newPath);
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
	public void setPath(Expression newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject) path).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MiniJava_ASOSPackage.LOAD_IMAGE__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject) newPath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MiniJava_ASOSPackage.LOAD_IMAGE__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJava_ASOSPackage.LOAD_IMAGE__PATH, newPath,
					newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiniJava_ASOSPackage.LOAD_IMAGE__PATH:
			return basicSetPath(null, msgs);
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
		case MiniJava_ASOSPackage.LOAD_IMAGE__PATH:
			return getPath();
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
		case MiniJava_ASOSPackage.LOAD_IMAGE__PATH:
			setPath((Expression) newValue);
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
		case MiniJava_ASOSPackage.LOAD_IMAGE__PATH:
			setPath((Expression) null);
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
		case MiniJava_ASOSPackage.LOAD_IMAGE__PATH:
			return path != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadImageImpl
