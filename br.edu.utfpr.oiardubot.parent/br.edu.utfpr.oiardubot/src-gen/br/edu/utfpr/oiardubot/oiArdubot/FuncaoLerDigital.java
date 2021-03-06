/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcao Ler Digital</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.FuncaoLerDigital#getPorta <em>Porta</em>}</li>
 * </ul>
 *
 * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getFuncaoLerDigital()
 * @model
 * @generated
 */
public interface FuncaoLerDigital extends EObject
{
  /**
   * Returns the value of the '<em><b>Porta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Porta</em>' containment reference.
   * @see #setPorta(Porta)
   * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getFuncaoLerDigital_Porta()
   * @model containment="true"
   * @generated
   */
  Porta getPorta();

  /**
   * Sets the value of the '{@link br.edu.utfpr.oiardubot.oiArdubot.FuncaoLerDigital#getPorta <em>Porta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Porta</em>' containment reference.
   * @see #getPorta()
   * @generated
   */
  void setPorta(Porta value);

} // FuncaoLerDigital
