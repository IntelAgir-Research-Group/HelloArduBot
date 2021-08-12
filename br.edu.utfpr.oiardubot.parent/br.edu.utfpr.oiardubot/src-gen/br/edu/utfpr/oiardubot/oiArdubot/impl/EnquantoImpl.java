/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot.impl;

import br.edu.utfpr.oiardubot.oiArdubot.Enquanto;
import br.edu.utfpr.oiardubot.oiArdubot.Implementacao;
import br.edu.utfpr.oiardubot.oiArdubot.Logico;
import br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enquanto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.EnquantoImpl#getValorEsquerda <em>Valor Esquerda</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.EnquantoImpl#getRelacao <em>Relacao</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.EnquantoImpl#getValorDireita <em>Valor Direita</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.EnquantoImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnquantoImpl extends ImplementacaoImpl implements Enquanto
{
  /**
   * The default value of the '{@link #getValorEsquerda() <em>Valor Esquerda</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorEsquerda()
   * @generated
   * @ordered
   */
  protected static final String VALOR_ESQUERDA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValorEsquerda() <em>Valor Esquerda</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorEsquerda()
   * @generated
   * @ordered
   */
  protected String valorEsquerda = VALOR_ESQUERDA_EDEFAULT;

  /**
   * The cached value of the '{@link #getRelacao() <em>Relacao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelacao()
   * @generated
   * @ordered
   */
  protected Logico relacao;

  /**
   * The default value of the '{@link #getValorDireita() <em>Valor Direita</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorDireita()
   * @generated
   * @ordered
   */
  protected static final String VALOR_DIREITA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValorDireita() <em>Valor Direita</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorDireita()
   * @generated
   * @ordered
   */
  protected String valorDireita = VALOR_DIREITA_EDEFAULT;

  /**
   * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected EList<Implementacao> code;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnquantoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OiArdubotPackage.Literals.ENQUANTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValorEsquerda()
  {
    return valorEsquerda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValorEsquerda(String newValorEsquerda)
  {
    String oldValorEsquerda = valorEsquerda;
    valorEsquerda = newValorEsquerda;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.ENQUANTO__VALOR_ESQUERDA, oldValorEsquerda, valorEsquerda));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Logico getRelacao()
  {
    return relacao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelacao(Logico newRelacao, NotificationChain msgs)
  {
    Logico oldRelacao = relacao;
    relacao = newRelacao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OiArdubotPackage.ENQUANTO__RELACAO, oldRelacao, newRelacao);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRelacao(Logico newRelacao)
  {
    if (newRelacao != relacao)
    {
      NotificationChain msgs = null;
      if (relacao != null)
        msgs = ((InternalEObject)relacao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OiArdubotPackage.ENQUANTO__RELACAO, null, msgs);
      if (newRelacao != null)
        msgs = ((InternalEObject)newRelacao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OiArdubotPackage.ENQUANTO__RELACAO, null, msgs);
      msgs = basicSetRelacao(newRelacao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.ENQUANTO__RELACAO, newRelacao, newRelacao));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValorDireita()
  {
    return valorDireita;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValorDireita(String newValorDireita)
  {
    String oldValorDireita = valorDireita;
    valorDireita = newValorDireita;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.ENQUANTO__VALOR_DIREITA, oldValorDireita, valorDireita));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Implementacao> getCode()
  {
    if (code == null)
    {
      code = new EObjectContainmentEList<Implementacao>(Implementacao.class, this, OiArdubotPackage.ENQUANTO__CODE);
    }
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OiArdubotPackage.ENQUANTO__RELACAO:
        return basicSetRelacao(null, msgs);
      case OiArdubotPackage.ENQUANTO__CODE:
        return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OiArdubotPackage.ENQUANTO__VALOR_ESQUERDA:
        return getValorEsquerda();
      case OiArdubotPackage.ENQUANTO__RELACAO:
        return getRelacao();
      case OiArdubotPackage.ENQUANTO__VALOR_DIREITA:
        return getValorDireita();
      case OiArdubotPackage.ENQUANTO__CODE:
        return getCode();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OiArdubotPackage.ENQUANTO__VALOR_ESQUERDA:
        setValorEsquerda((String)newValue);
        return;
      case OiArdubotPackage.ENQUANTO__RELACAO:
        setRelacao((Logico)newValue);
        return;
      case OiArdubotPackage.ENQUANTO__VALOR_DIREITA:
        setValorDireita((String)newValue);
        return;
      case OiArdubotPackage.ENQUANTO__CODE:
        getCode().clear();
        getCode().addAll((Collection<? extends Implementacao>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OiArdubotPackage.ENQUANTO__VALOR_ESQUERDA:
        setValorEsquerda(VALOR_ESQUERDA_EDEFAULT);
        return;
      case OiArdubotPackage.ENQUANTO__RELACAO:
        setRelacao((Logico)null);
        return;
      case OiArdubotPackage.ENQUANTO__VALOR_DIREITA:
        setValorDireita(VALOR_DIREITA_EDEFAULT);
        return;
      case OiArdubotPackage.ENQUANTO__CODE:
        getCode().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OiArdubotPackage.ENQUANTO__VALOR_ESQUERDA:
        return VALOR_ESQUERDA_EDEFAULT == null ? valorEsquerda != null : !VALOR_ESQUERDA_EDEFAULT.equals(valorEsquerda);
      case OiArdubotPackage.ENQUANTO__RELACAO:
        return relacao != null;
      case OiArdubotPackage.ENQUANTO__VALOR_DIREITA:
        return VALOR_DIREITA_EDEFAULT == null ? valorDireita != null : !VALOR_DIREITA_EDEFAULT.equals(valorDireita);
      case OiArdubotPackage.ENQUANTO__CODE:
        return code != null && !code.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (valorEsquerda: ");
    result.append(valorEsquerda);
    result.append(", valorDireita: ");
    result.append(valorDireita);
    result.append(')');
    return result.toString();
  }

} //EnquantoImpl
