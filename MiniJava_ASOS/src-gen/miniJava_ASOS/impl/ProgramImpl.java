/**
 */
package miniJava_ASOS.impl;

import java.util.Collection;

import miniJava_ASOS.Import;
import miniJava_ASOS.MiniJava_ASOSPackage;
import miniJava_ASOS.Program;
import miniJava_ASOS.TypeDeclaration;

import miniJava_ASOS.sd.State;

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
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link miniJava_ASOS.impl.ProgramImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link miniJava_ASOS.impl.ProgramImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link miniJava_ASOS.impl.ProgramImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {

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
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDeclaration> classes;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJava_ASOSPackage.Literals.PROGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJava_ASOSPackage.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, MiniJava_ASOSPackage.PROGRAM__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeDeclaration> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<TypeDeclaration>(TypeDeclaration.class, this,
					MiniJava_ASOSPackage.PROGRAM__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject) state;
			state = (State) eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJava_ASOSPackage.PROGRAM__STATE,
							oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		State oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJava_ASOSPackage.PROGRAM__STATE, oldState,
					state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiniJava_ASOSPackage.PROGRAM__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
		case MiniJava_ASOSPackage.PROGRAM__CLASSES:
			return ((InternalEList<?>) getClasses()).basicRemove(otherEnd, msgs);
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
		case MiniJava_ASOSPackage.PROGRAM__NAME:
			return getName();
		case MiniJava_ASOSPackage.PROGRAM__IMPORTS:
			return getImports();
		case MiniJava_ASOSPackage.PROGRAM__CLASSES:
			return getClasses();
		case MiniJava_ASOSPackage.PROGRAM__STATE:
			if (resolve)
				return getState();
			return basicGetState();
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
		case MiniJava_ASOSPackage.PROGRAM__NAME:
			setName((String) newValue);
			return;
		case MiniJava_ASOSPackage.PROGRAM__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Import>) newValue);
			return;
		case MiniJava_ASOSPackage.PROGRAM__CLASSES:
			getClasses().clear();
			getClasses().addAll((Collection<? extends TypeDeclaration>) newValue);
			return;
		case MiniJava_ASOSPackage.PROGRAM__STATE:
			setState((State) newValue);
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
		case MiniJava_ASOSPackage.PROGRAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MiniJava_ASOSPackage.PROGRAM__IMPORTS:
			getImports().clear();
			return;
		case MiniJava_ASOSPackage.PROGRAM__CLASSES:
			getClasses().clear();
			return;
		case MiniJava_ASOSPackage.PROGRAM__STATE:
			setState((State) null);
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
		case MiniJava_ASOSPackage.PROGRAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MiniJava_ASOSPackage.PROGRAM__IMPORTS:
			return imports != null && !imports.isEmpty();
		case MiniJava_ASOSPackage.PROGRAM__CLASSES:
			return classes != null && !classes.isEmpty();
		case MiniJava_ASOSPackage.PROGRAM__STATE:
			return state != null;
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
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
