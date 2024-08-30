/**
 */
package miniJava_ASOS.impl;

import miniJava_ASOS.ClassRef;
import miniJava_ASOS.MiniJava_ASOSPackage;
import miniJava_ASOS.TypeDeclaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.impl.ClassRefImpl#getReferencedClass <em>Referenced Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassRefImpl extends MinimalEObjectImpl.Container implements ClassRef {

	/**
	 * The cached value of the '{@link #getReferencedClass() <em>Referenced Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedClass()
	 * @generated
	 * @ordered
	 */
	protected TypeDeclaration referencedClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJava_ASOSPackage.Literals.CLASS_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDeclaration getReferencedClass() {
		if (referencedClass != null && referencedClass.eIsProxy()) {
			InternalEObject oldReferencedClass = (InternalEObject) referencedClass;
			referencedClass = (TypeDeclaration) eResolveProxy(oldReferencedClass);
			if (referencedClass != oldReferencedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MiniJava_ASOSPackage.CLASS_REF__REFERENCED_CLASS, oldReferencedClass, referencedClass));
			}
		}
		return referencedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration basicGetReferencedClass() {
		return referencedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedClass(TypeDeclaration newReferencedClass) {
		TypeDeclaration oldReferencedClass = referencedClass;
		referencedClass = newReferencedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJava_ASOSPackage.CLASS_REF__REFERENCED_CLASS,
					oldReferencedClass, referencedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MiniJava_ASOSPackage.CLASS_REF__REFERENCED_CLASS:
			if (resolve)
				return getReferencedClass();
			return basicGetReferencedClass();
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
		case MiniJava_ASOSPackage.CLASS_REF__REFERENCED_CLASS:
			setReferencedClass((TypeDeclaration) newValue);
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
		case MiniJava_ASOSPackage.CLASS_REF__REFERENCED_CLASS:
			setReferencedClass((TypeDeclaration) null);
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
		case MiniJava_ASOSPackage.CLASS_REF__REFERENCED_CLASS:
			return referencedClass != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassRefImpl
