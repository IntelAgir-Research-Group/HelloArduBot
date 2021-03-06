/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Porta</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getTipoPorta()
 * @model
 * @generated
 */
public enum TipoPorta implements Enumerator
{
  /**
   * The '<em><b>DIGITAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIGITAL_VALUE
   * @generated
   * @ordered
   */
  DIGITAL(0, "DIGITAL", "DIGITAL"),

  /**
   * The '<em><b>ANALOGICA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANALOGICA_VALUE
   * @generated
   * @ordered
   */
  ANALOGICA(1, "ANALOGICA", "ANALOGICA");

  /**
   * The '<em><b>DIGITAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIGITAL
   * @model
   * @generated
   * @ordered
   */
  public static final int DIGITAL_VALUE = 0;

  /**
   * The '<em><b>ANALOGICA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANALOGICA
   * @model
   * @generated
   * @ordered
   */
  public static final int ANALOGICA_VALUE = 1;

  /**
   * An array of all the '<em><b>Tipo Porta</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TipoPorta[] VALUES_ARRAY =
    new TipoPorta[]
    {
      DIGITAL,
      ANALOGICA,
    };

  /**
   * A public read-only list of all the '<em><b>Tipo Porta</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TipoPorta> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Tipo Porta</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TipoPorta get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TipoPorta result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Tipo Porta</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TipoPorta getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TipoPorta result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Tipo Porta</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TipoPorta get(int value)
  {
    switch (value)
    {
      case DIGITAL_VALUE: return DIGITAL;
      case ANALOGICA_VALUE: return ANALOGICA;
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
  private TipoPorta(int value, String name, String literal)
  {
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
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //TipoPorta
