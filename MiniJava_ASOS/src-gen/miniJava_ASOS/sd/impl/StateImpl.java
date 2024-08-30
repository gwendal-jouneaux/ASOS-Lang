/**
 */
package miniJava_ASOS.sd.impl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import javax.imageio.ImageIO;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import miniJava_ASOS.ArrayAccess;
import miniJava_ASOS.Assignee;
import miniJava_ASOS.BooleanTypeRef;
import miniJava_ASOS.Clazz;
import miniJava_ASOS.Field;
import miniJava_ASOS.FieldAccess;
import miniJava_ASOS.IntegerTypeRef;
import miniJava_ASOS.Member;
import miniJava_ASOS.Method;
import miniJava_ASOS.Parameter;
import miniJava_ASOS.SymbolRef;
import miniJava_ASOS.TypeRef;
import miniJava_ASOS.VariableDeclaration;
import miniJava_ASOS.ASOS.Termination;
import miniJava_ASOS.interpreter.SelfAdaptiveMiniJava_ASOS;
import miniJava_ASOS.sd.ArrayInstance;
import miniJava_ASOS.sd.ArrayRefValue;
import miniJava_ASOS.sd.BooleanValue;
import miniJava_ASOS.sd.Call;
import miniJava_ASOS.sd.Context;
import miniJava_ASOS.sd.FieldBinding;
import miniJava_ASOS.sd.Frame;
import miniJava_ASOS.sd.IntegerValue;
import miniJava_ASOS.sd.NullValue;
import miniJava_ASOS.sd.ObjectInstance;
import miniJava_ASOS.sd.ObjectRefValue;
import miniJava_ASOS.sd.ReturnValue;
import miniJava_ASOS.sd.SdFactory;
import miniJava_ASOS.sd.SdPackage;
import miniJava_ASOS.sd.State;
import miniJava_ASOS.sd.SymbolBinding;
import miniJava_ASOS.sd.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miniJava_ASOS.sd.impl.StateImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link miniJava_ASOS.sd.impl.StateImpl#getObjectsHeap <em>Objects Heap</em>}</li>
 *   <li>{@link miniJava_ASOS.sd.impl.StateImpl#getArraysHeap <em>Arrays Heap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected Frame frame;

	/**
	 * The cached value of the '{@link #getObjectsHeap() <em>Objects Heap</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsHeap()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectInstance> objectsHeap;

	/**
	 * The cached value of the '{@link #getArraysHeap() <em>Arrays Heap</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraysHeap()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayInstance> arraysHeap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Frame getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(Frame newFrame, NotificationChain msgs) {
		Frame oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SdPackage.STATE__FRAME,
					oldFrame, newFrame);
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
	public void setFrame(Frame newFrame) {
		if (newFrame != frame) {
			NotificationChain msgs = null;
			if (frame != null)
				msgs = ((InternalEObject) frame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SdPackage.STATE__FRAME,
						null, msgs);
			if (newFrame != null)
				msgs = ((InternalEObject) newFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SdPackage.STATE__FRAME,
						null, msgs);
			msgs = basicSetFrame(newFrame, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SdPackage.STATE__FRAME, newFrame, newFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectInstance> getObjectsHeap() {
		if (objectsHeap == null) {
			objectsHeap = new EObjectContainmentEList<ObjectInstance>(ObjectInstance.class, this,
					SdPackage.STATE__OBJECTS_HEAP);
		}
		return objectsHeap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayInstance> getArraysHeap() {
		if (arraysHeap == null) {
			arraysHeap = new EObjectContainmentEList<ArrayInstance>(ArrayInstance.class, this,
					SdPackage.STATE__ARRAYS_HEAP);
		}
		return arraysHeap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public Value getSymbolValue(Assignee assignee) {
		if (assignee instanceof SymbolRef) {
			SymbolRef ref = (SymbolRef) assignee;
			Context context = this.getFrame().getContext();
			while (context != null) {
				EList<SymbolBinding> bindings = context.getBindings();
				for (SymbolBinding binding : bindings) {
					if (binding.getSymbol() == ref.getSymbol()) {
						return binding.getValue();
					}
				}
				context = context.getParent();
			}
		}
		if (assignee instanceof FieldAccess) {
			FieldAccess access = (FieldAccess) assignee;
			ObjectRefValue ref = (ObjectRefValue) access.getReceiver()
					.accept(SelfAdaptiveMiniJava_ASOS.INSTANCE().getVisitor(), this);
			EList<FieldBinding> bindings = ref.getInstance().getFieldbindings();
			for (FieldBinding binding : bindings) {
				if (binding.getField() == access.getField()) {
					return binding.getValue();
				}
			}
		}
		return SdFactory.eINSTANCE.createNullValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public Value setSymbolValue(Assignee assignee, Value value) {
		if (assignee instanceof VariableDeclaration) {
			VariableDeclaration decl = (VariableDeclaration) assignee;
			EList<SymbolBinding> bindings = this.getFrame().getContext().getBindings();
			SymbolBinding binding = SdFactory.eINSTANCE.createSymbolBinding();
			binding.setSymbol(decl);
			binding.setValue(value);
			bindings.add(binding);
			return value;
		}
		if (assignee instanceof SymbolRef) {
			SymbolRef ref = (SymbolRef) assignee;
			Context context = this.getFrame().getContext();
			while (context != null) {
				EList<SymbolBinding> bindings = context.getBindings();
				for (SymbolBinding binding : bindings) {
					if (binding.getSymbol() == ref.getSymbol()) {
						binding.setValue(value);
						return value;
					}
				}
				context = context.getParent();
			}
		}
		if (assignee instanceof FieldAccess) {
			FieldAccess access = (FieldAccess) assignee;
			ObjectRefValue ref = (ObjectRefValue) access.getReceiver()
					.accept(SelfAdaptiveMiniJava_ASOS.INSTANCE().getVisitor(), this);
			EList<FieldBinding> bindings = ref.getInstance().getFieldbindings();
			for (FieldBinding binding : bindings) {
				if (binding.getField() == access.getField()) {
					binding.setValue(value);
					return value;
				}
			}
		}
		if (assignee instanceof ArrayAccess) {
			ArrayAccess access = (ArrayAccess) assignee;
			ArrayRefValue ref = (ArrayRefValue) access.getObject()
					.accept(SelfAdaptiveMiniJava_ASOS.INSTANCE().getVisitor(), this);
			IntegerValue index = (IntegerValue) access.getIndex()
					.accept(SelfAdaptiveMiniJava_ASOS.INSTANCE().getVisitor(), this);
			EList<Value> values = ref.getInstance().getValue();
			values.set(index.getValue(), value);
			return value;
		}
		return SdFactory.eINSTANCE.createNullValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void pushContext() {
		Context parent = this.getFrame().getContext();
		Context newCtx = SdFactory.eINSTANCE.createContext();
		newCtx.setParent(parent);
		this.getFrame().setContext(newCtx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void popContext() {
		Context current = this.getFrame().getContext();
		Context parent = current.getParent();
		current.setParent(null);
		this.getFrame().setContext(parent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void pushFrame(ObjectInstance instance) {
		Frame newFrame = SdFactory.eINSTANCE.createFrame();
		newFrame.setInstance(instance);
		newFrame.setParent(this.getFrame());
		this.setFrame(newFrame);
		pushContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void popFrame() {
		Frame current = this.getFrame();
		Frame parent = current.getParent();
		current.setParent(null);
		this.setFrame(parent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void println(Value toPrint) {
		System.out.println(toPrint.toString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public ArrayInstance fillArray(ArrayInstance instance, TypeRef type, Integer size) {
		EList<Value> values = instance.getValue();
		for (int i = 0; i < size; i++) {
			Value defaultValue = ((Value) (null));

			if (type instanceof IntegerTypeRef) {
				IntegerValue idv = ((IntegerValue) (SdFactory.eINSTANCE.createIntegerValue()));
				idv.setValue(0);
				defaultValue = ((IntegerValue) (idv));
			} else if (type instanceof BooleanTypeRef) {
				BooleanValue idv = ((BooleanValue) (SdFactory.eINSTANCE.createBooleanValue()));
				idv.setValue(false);
				defaultValue = ((BooleanValue) (idv));
			} else {

				NullValue idv = ((NullValue) (SdFactory.eINSTANCE.createNullValue()));
				defaultValue = ((NullValue) (idv));
			}

			values.add(EcoreUtil.copy(defaultValue));
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public Value accessArray(ArrayInstance instance, Integer index) {
		return instance.getValue().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public ObjectInstance initObject(Clazz clazz) {
		ObjectInstance obj = SdFactory.eINSTANCE.createObjectInstance();
		obj.setType(clazz);
		EList<FieldBinding> bindings = obj.getFieldbindings();

		EList<Member> members = clazz.getMembers();
		for (Member member : members) {
			if (member instanceof Field) {
				Field f = (Field) member;
				FieldBinding binding = SdFactory.eINSTANCE.createFieldBinding();
				binding.setField(f);

				if (f.getTypeRef() instanceof IntegerTypeRef) {
					IntegerValue idv = ((IntegerValue) (SdFactory.eINSTANCE.createIntegerValue()));
					idv.setValue(0);
					binding.setValue(idv);
				} else if (f.getTypeRef() instanceof BooleanTypeRef) {
					BooleanValue idv = ((BooleanValue) (SdFactory.eINSTANCE.createBooleanValue()));
					idv.setValue(false);
					binding.setValue(idv);
				} else {
					NullValue idv = ((NullValue) (SdFactory.eINSTANCE.createNullValue()));
					binding.setValue(idv);
				}
				bindings.add(binding);
			}
		}

		return obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public Method findConstructor(Clazz clazz, EList<?> values) {
		int arity = values.size();
		EList<Member> members = clazz.getMembers();
		for (Member member : members) {
			if (member instanceof Method) {
				Method m = (Method) member;
				if (m.getName() == null && m.getParams().size() == arity) {
					return m;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object call(Call call) {
		if (call == null || call.getMethod() == null) {
			return SdFactory.eINSTANCE.createNullValue();
		}

		this.pushFrame(call.getInstance());
		EList<Parameter> params = call.getMethod().getParams();
		EList<Value> values = (EList<Value>) call.getValues();
		for (int i = 0; i < params.size(); i++) {
			EList<SymbolBinding> bindings = this.getFrame().getContext().getBindings();
			SymbolBinding binding = SdFactory.eINSTANCE.createSymbolBinding();
			binding.setSymbol(params.get(i));
			binding.setValue(EcoreUtil.copy(values.get(i)));
			bindings.add(binding);
		}

		Object result = call.getMethod().getBody().accept(SelfAdaptiveMiniJava_ASOS.INSTANCE().getVisitor(), this);
		this.popFrame();
		if (result instanceof Termination && ((Termination) result).unbox() instanceof ReturnValue) {
			return ((ReturnValue) ((Termination) result).unbox()).getValue();
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public ArrayRefValue readImage(String path) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(path));
		} catch (IOException e) {
			System.err.println("ERROR loading image");
			return null;
		}
		int h = img.getHeight();
		int w = img.getWidth();

		ArrayInstance res = SdFactory.eINSTANCE.createArrayInstance();
		res.setSize(h);

		for (int y = 0; y < h; y++) {
			ArrayInstance line = SdFactory.eINSTANCE.createArrayInstance();
			line.setSize(w);
			for (int x = 0; x < w; x++) {
				IntegerValue idv = SdFactory.eINSTANCE.createIntegerValue();
				int rgb = img.getRGB(x, y);
				int b = (rgb) & 0xFF;
				int g = (rgb >> 8) & 0xFF;
				int r = (rgb >> 16) & 0xFF;
				idv.setValue((r + g + b) / 3);
				line.getValue().add(idv);
			}
			ArrayRefValue lineRef = SdFactory.eINSTANCE.createArrayRefValue();
			lineRef.setInstance(line);
			res.getValue().add(lineRef);
		}

		ArrayRefValue ret = SdFactory.eINSTANCE.createArrayRefValue();
		ret.setInstance(res);
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void writeImage(String path, ArrayInstance image) {
		int h = image.getSize();
		int w = ((ArrayRefValue) image.getValue().get(0)).getInstance().getSize();

		BufferedImage jImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		for (int y = 0; y < h; y++) {
			ArrayInstance line = ((ArrayRefValue) image.getValue().get(y)).getInstance();
			for (int x = 0; x < w; x++) {
				IntegerValue idv = (IntegerValue) line.getValue().get(x);
				int grey = idv.getValue();
				jImage.setRGB(x, y, grey + grey * 256 + grey * 256 * 256);
			}
		}
		File output = new File(path);
		try {
			ImageIO.write(jImage, path.substring(path.lastIndexOf(".") + 1), output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Method findMain(EList<?> classes) {
		for (Object type : classes) {
			if (type instanceof Clazz) {
				Clazz clazz = (Clazz) type;
				EList<Member> members = clazz.getMembers();
				for (Member member : members) {
					if (member instanceof Method && member.getName().equals("main")) {
						return (Method) member;
					}
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer sqrt(Integer n) {
		return (int) Math.sqrt(n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SdPackage.STATE__FRAME:
			return basicSetFrame(null, msgs);
		case SdPackage.STATE__OBJECTS_HEAP:
			return ((InternalEList<?>) getObjectsHeap()).basicRemove(otherEnd, msgs);
		case SdPackage.STATE__ARRAYS_HEAP:
			return ((InternalEList<?>) getArraysHeap()).basicRemove(otherEnd, msgs);
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
		case SdPackage.STATE__FRAME:
			return getFrame();
		case SdPackage.STATE__OBJECTS_HEAP:
			return getObjectsHeap();
		case SdPackage.STATE__ARRAYS_HEAP:
			return getArraysHeap();
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
		case SdPackage.STATE__FRAME:
			setFrame((Frame) newValue);
			return;
		case SdPackage.STATE__OBJECTS_HEAP:
			getObjectsHeap().clear();
			getObjectsHeap().addAll((Collection<? extends ObjectInstance>) newValue);
			return;
		case SdPackage.STATE__ARRAYS_HEAP:
			getArraysHeap().clear();
			getArraysHeap().addAll((Collection<? extends ArrayInstance>) newValue);
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
		case SdPackage.STATE__FRAME:
			setFrame((Frame) null);
			return;
		case SdPackage.STATE__OBJECTS_HEAP:
			getObjectsHeap().clear();
			return;
		case SdPackage.STATE__ARRAYS_HEAP:
			getArraysHeap().clear();
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
		case SdPackage.STATE__FRAME:
			return frame != null;
		case SdPackage.STATE__OBJECTS_HEAP:
			return objectsHeap != null && !objectsHeap.isEmpty();
		case SdPackage.STATE__ARRAYS_HEAP:
			return arraysHeap != null && !arraysHeap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SdPackage.STATE___GET_SYMBOL_VALUE__ASSIGNEE:
			return getSymbolValue((Assignee) arguments.get(0));
		case SdPackage.STATE___SET_SYMBOL_VALUE__ASSIGNEE_VALUE:
			return setSymbolValue((Assignee) arguments.get(0), (Value) arguments.get(1));
		case SdPackage.STATE___PUSH_CONTEXT:
			pushContext();
			return null;
		case SdPackage.STATE___POP_CONTEXT:
			popContext();
			return null;
		case SdPackage.STATE___PUSH_FRAME__OBJECTINSTANCE:
			pushFrame((ObjectInstance) arguments.get(0));
			return null;
		case SdPackage.STATE___POP_FRAME:
			popFrame();
			return null;
		case SdPackage.STATE___PRINTLN__VALUE:
			println((Value) arguments.get(0));
			return null;
		case SdPackage.STATE___FILL_ARRAY__ARRAYINSTANCE_TYPEREF_INTEGER:
			return fillArray((ArrayInstance) arguments.get(0), (TypeRef) arguments.get(1), (Integer) arguments.get(2));
		case SdPackage.STATE___ACCESS_ARRAY__ARRAYINSTANCE_INTEGER:
			return accessArray((ArrayInstance) arguments.get(0), (Integer) arguments.get(1));
		case SdPackage.STATE___INIT_OBJECT__CLAZZ:
			return initObject((Clazz) arguments.get(0));
		case SdPackage.STATE___FIND_CONSTRUCTOR__CLAZZ_ELIST:
			return findConstructor((Clazz) arguments.get(0), (EList<?>) arguments.get(1));
		case SdPackage.STATE___CALL__CALL:
			return call((Call) arguments.get(0));
		case SdPackage.STATE___READ_IMAGE__STRING:
			return readImage((String) arguments.get(0));
		case SdPackage.STATE___WRITE_IMAGE__STRING_ARRAYINSTANCE:
			writeImage((String) arguments.get(0), (ArrayInstance) arguments.get(1));
			return null;
		case SdPackage.STATE___FIND_MAIN__ELIST:
			return findMain((EList<?>) arguments.get(0));
		case SdPackage.STATE___SQRT__INTEGER:
			return sqrt((Integer) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StateImpl
