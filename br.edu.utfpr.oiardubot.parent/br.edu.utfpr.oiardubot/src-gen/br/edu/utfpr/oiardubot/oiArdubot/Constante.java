/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.Constante#getVariavel <em>Variavel</em>}</li>
 * </ul>
 *
 * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getConstante()
 * @model
 * @generated
 */
public interface Constante extends EObject
{
  /**
   * Returns the value of the '<em><b>Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variavel</em>' containment reference.
   * @see #setVariavel(ConstanteVariavel)
   * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getConstante_Variavel()
   * @model containment="true"
   * @generated
   */
  ConstanteVariavel getVariavel();

  /**
   * Sets the value of the '{@link br.edu.utfpr.oiardubot.oiArdubot.Constante#getVariavel <em>Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variavel</em>' containment reference.
   * @see #getVariavel()
   * @generated
   */
  void setVariavel(ConstanteVariavel value);

} // Constante
