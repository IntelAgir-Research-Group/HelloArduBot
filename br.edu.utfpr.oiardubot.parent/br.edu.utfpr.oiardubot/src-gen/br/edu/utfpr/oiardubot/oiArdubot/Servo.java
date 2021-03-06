/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.Servo#getPorta <em>Porta</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.Servo#getPosicao <em>Posicao</em>}</li>
 * </ul>
 *
 * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getServo()
 * @model
 * @generated
 */
public interface Servo extends Implementacao
{
  /**
   * Returns the value of the '<em><b>Porta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Porta</em>' containment reference.
   * @see #setPorta(VariavelOuPorta)
   * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getServo_Porta()
   * @model containment="true"
   * @generated
   */
  VariavelOuPorta getPorta();

  /**
   * Sets the value of the '{@link br.edu.utfpr.oiardubot.oiArdubot.Servo#getPorta <em>Porta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Porta</em>' containment reference.
   * @see #getPorta()
   * @generated
   */
  void setPorta(VariavelOuPorta value);

  /**
   * Returns the value of the '<em><b>Posicao</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Posicao</em>' attribute.
   * @see #setPosicao(int)
   * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getServo_Posicao()
   * @model
   * @generated
   */
  int getPosicao();

  /**
   * Sets the value of the '{@link br.edu.utfpr.oiardubot.oiArdubot.Servo#getPosicao <em>Posicao</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Posicao</em>' attribute.
   * @see #getPosicao()
   * @generated
   */
  void setPosicao(int value);

} // Servo
