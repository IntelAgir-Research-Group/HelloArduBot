/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Senao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.Senao#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getSenao()
 * @model
 * @generated
 */
public interface Senao extends EObject
{
  /**
   * Returns the value of the '<em><b>Code</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.utfpr.oiardubot.oiArdubot.Implementacao}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference list.
   * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage#getSenao_Code()
   * @model containment="true"
   * @generated
   */
  EList<Implementacao> getCode();

} // Senao
