/**
 */
package html_ASOS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see html_ASOS.Html_ASOSPackage#getAttributeType()
 * @model
 * @generated
 */
public enum AttributeType implements Enumerator {
	/**
	 * The '<em><b>DOUBLE QUOTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_QUOTED_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_QUOTED(2, "DOUBLE_QUOTED", "\""),

	/**
	 * The '<em><b>UNQUOTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNQUOTED_VALUE
	 * @generated
	 * @ordered
	 */
	UNQUOTED(0, "UNQUOTED", ""),

	/**
	 * The '<em><b>SIMPLE QUOTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_QUOTED_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_QUOTED(1, "SIMPLE_QUOTED", "\'");

	/**
	 * The '<em><b>DOUBLE QUOTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_QUOTED
	 * @model literal="\""
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_QUOTED_VALUE = 2;

	/**
	 * The '<em><b>UNQUOTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNQUOTED
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int UNQUOTED_VALUE = 0;

	/**
	 * The '<em><b>SIMPLE QUOTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_QUOTED
	 * @model literal="\'"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_QUOTED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Attribute Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AttributeType[] VALUES_ARRAY = new AttributeType[] { DOUBLE_QUOTED, UNQUOTED, SIMPLE_QUOTED, };

	/**
	 * A public read-only list of all the '<em><b>Attribute Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AttributeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attribute Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AttributeType get(int value) {
		switch (value) {
		case DOUBLE_QUOTED_VALUE:
			return DOUBLE_QUOTED;
		case UNQUOTED_VALUE:
			return UNQUOTED;
		case SIMPLE_QUOTED_VALUE:
			return SIMPLE_QUOTED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AttributeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //AttributeType
