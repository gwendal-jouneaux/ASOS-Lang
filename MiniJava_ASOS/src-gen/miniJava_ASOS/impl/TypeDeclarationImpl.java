/**
 */
package miniJava_ASOS.impl;

import java.util.Collection;

import miniJava_ASOS.AccessLevel;
import miniJava_ASOS.Interface;
import miniJava_ASOS.Member;
import miniJava_ASOS.MiniJava_ASOSPackage;
import miniJava_ASOS.TypeDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.impl.TypeDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link miniJava_ASOS.impl.TypeDeclarationImpl#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link miniJava_ASOS.impl.TypeDeclarationImpl#getImplementz <em>Implementz</em>}</li>
 *   <li>{@link miniJava_ASOS.impl.TypeDeclarationImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDeclarationImpl extends MinimalEObjectImpl.Container implements TypeDeclaration {

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AccessLevel ACCESS_LEVEL_EDEFAULT = AccessLevel.PRIVATE;

	/**
	 * The cached value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected AccessLevel accessLevel = ACCESS_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplementz() <em>Implementz</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementz()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> implementz;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJava_ASOSPackage.Literals.TYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJava_ASOSPackage.TYPE_DECLARATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessLevel getAccessLevel() {
		return accessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessLevel(AccessLevel newAccessLevel) {
		AccessLevel oldAccessLevel = accessLevel;
		accessLevel = newAccessLevel == null ? ACCESS_LEVEL_EDEFAULT : newAccessLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJava_ASOSPackage.TYPE_DECLARATION__ACCESS_LEVEL,
					oldAccessLevel, accessLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getImplementz() {
		if (implementz == null) {
			implementz = new EObjectResolvingEList<Interface>(Interface.class, this,
					MiniJava_ASOSPackage.TYPE_DECLARATION__IMPLEMENTZ);
		}
		return implementz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Member>(Member.class, this,
					MiniJava_ASOSPackage.TYPE_DECLARATION__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiniJava_ASOSPackage.TYPE_DECLARATION__MEMBERS:
			return ((InternalEList<?>) getMembers()).basicRemove(otherEnd, msgs);
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
		case MiniJava_ASOSPackage.TYPE_DECLARATION__NAME:
			return getName();
		case MiniJava_ASOSPackage.TYPE_DECLARATION__ACCESS_LEVEL:
			return getAccessLevel();
		case MiniJava_ASOSPackage.TYPE_DECLARATION__IMPLEMENTZ:
			return getImplementz();
		case MiniJava_ASOSPackage.TYPE_DECLARATION__MEMBERS:
			return getMembers();
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
		case MiniJava_ASOSPackage.TYPE_DECLARATION__NAME:
			setName((String) newValue);
			return;
		case MiniJava_ASOSPackage.TYPE_DECLARATION__ACCESS_LEVEL:
			setAccessLevel((AccessLevel) newValue);
			return;
		case MiniJava_ASOSPackage.TYPE_DECLARATION__IMPLEMENTZ:
			getImplementz().clear();
			getImplementz().addAll((Collection<? extends Interface>) newValue);
			return;
		case MiniJava_ASOSPackage.TYPE_DECLARATION__MEMBERS:
			getMembers().clear();
			getMembers().addAll((Collection<? extends Member>) newValue);
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
		case MiniJava_ASOSPackage.TYPE_DECLARATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MiniJava_ASOSPackage.TYPE_DECLARATION__ACCESS_LEVEL:
			setAccessLevel(ACCESS_LEVEL_EDEFAULT);
			return;
		case MiniJava_ASOSPackage.TYPE_DECLARATION__IMPLEMENTZ:
			getImplementz().clear();
			return;
		case MiniJava_ASOSPackage.TYPE_DECLARATION__MEMBERS:
			getMembers().clear();
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
		case MiniJava_ASOSPackage.TYPE_DECLARATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MiniJava_ASOSPackage.TYPE_DECLARATION__ACCESS_LEVEL:
			return accessLevel != ACCESS_LEVEL_EDEFAULT;
		case MiniJava_ASOSPackage.TYPE_DECLARATION__IMPLEMENTZ:
			return implementz != null && !implementz.isEmpty();
		case MiniJava_ASOSPackage.TYPE_DECLARATION__MEMBERS:
			return members != null && !members.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", accessLevel: ");
		result.append(accessLevel);
		result.append(')');
		return result.toString();
	}

} //TypeDeclarationImpl
