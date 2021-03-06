/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot.impl;

import br.edu.utfpr.oiardubot.oiArdubot.ExistenteVariavelRecebe;
import br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage;
import br.edu.utfpr.oiardubot.oiArdubot.VariavelExistente;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variavel Existente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.VariavelExistenteImpl#getAtribuicao <em>Atribuicao</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.VariavelExistenteImpl#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariavelExistenteImpl extends ImplementacaoImpl implements VariavelExistente
{
  /**
   * The cached value of the '{@link #getAtribuicao() <em>Atribuicao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtribuicao()
   * @generated
   * @ordered
   */
  protected ExistenteVariavelRecebe atribuicao;

  /**
   * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected static final String VALOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected String valor = VALOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariavelExistenteImpl()
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
    return OiArdubotPackage.Literals.VARIAVEL_EXISTENTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistenteVariavelRecebe getAtribuicao()
  {
    return atribuicao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtribuicao(ExistenteVariavelRecebe newAtribuicao, NotificationChain msgs)
  {
    ExistenteVariavelRecebe oldAtribuicao = atribuicao;
    atribuicao = newAtribuicao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OiArdubotPackage.VARIAVEL_EXISTENTE__ATRIBUICAO, oldAtribuicao, newAtribuicao);
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
  public void setAtribuicao(ExistenteVariavelRecebe newAtribuicao)
  {
    if (newAtribuicao != atribuicao)
    {
      NotificationChain msgs = null;
      if (atribuicao != null)
        msgs = ((InternalEObject)atribuicao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OiArdubotPackage.VARIAVEL_EXISTENTE__ATRIBUICAO, null, msgs);
      if (newAtribuicao != null)
        msgs = ((InternalEObject)newAtribuicao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OiArdubotPackage.VARIAVEL_EXISTENTE__ATRIBUICAO, null, msgs);
      msgs = basicSetAtribuicao(newAtribuicao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.VARIAVEL_EXISTENTE__ATRIBUICAO, newAtribuicao, newAtribuicao));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValor()
  {
    return valor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValor(String newValor)
  {
    String oldValor = valor;
    valor = newValor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.VARIAVEL_EXISTENTE__VALOR, oldValor, valor));
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
      case OiArdubotPackage.VARIAVEL_EXISTENTE__ATRIBUICAO:
        return basicSetAtribuicao(null, msgs);
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
      case OiArdubotPackage.VARIAVEL_EXISTENTE__ATRIBUICAO:
        return getAtribuicao();
      case OiArdubotPackage.VARIAVEL_EXISTENTE__VALOR:
        return getValor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OiArdubotPackage.VARIAVEL_EXISTENTE__ATRIBUICAO:
        setAtribuicao((ExistenteVariavelRecebe)newValue);
        return;
      case OiArdubotPackage.VARIAVEL_EXISTENTE__VALOR:
        setValor((String)newValue);
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
      case OiArdubotPackage.VARIAVEL_EXISTENTE__ATRIBUICAO:
        setAtribuicao((ExistenteVariavelRecebe)null);
        return;
      case OiArdubotPackage.VARIAVEL_EXISTENTE__VALOR:
        setValor(VALOR_EDEFAULT);
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
      case OiArdubotPackage.VARIAVEL_EXISTENTE__ATRIBUICAO:
        return atribuicao != null;
      case OiArdubotPackage.VARIAVEL_EXISTENTE__VALOR:
        return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
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
    result.append(" (valor: ");
    result.append(valor);
    result.append(')');
    return result.toString();
  }

} //VariavelExistenteImpl
