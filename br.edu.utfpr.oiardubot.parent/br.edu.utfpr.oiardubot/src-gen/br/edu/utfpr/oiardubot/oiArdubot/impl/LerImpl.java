/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot.impl;

import br.edu.utfpr.oiardubot.oiArdubot.Ler;
import br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage;
import br.edu.utfpr.oiardubot.oiArdubot.ReceberValor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.LerImpl#getAtribuicao <em>Atribuicao</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.LerImpl#getLer <em>Ler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LerImpl extends ImplementacaoImpl implements Ler
{
  /**
   * The cached value of the '{@link #getAtribuicao() <em>Atribuicao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtribuicao()
   * @generated
   * @ordered
   */
  protected ReceberValor atribuicao;

  /**
   * The default value of the '{@link #getLer() <em>Ler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLer()
   * @generated
   * @ordered
   */
  protected static final String LER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLer() <em>Ler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLer()
   * @generated
   * @ordered
   */
  protected String ler = LER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LerImpl()
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
    return OiArdubotPackage.Literals.LER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReceberValor getAtribuicao()
  {
    return atribuicao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtribuicao(ReceberValor newAtribuicao, NotificationChain msgs)
  {
    ReceberValor oldAtribuicao = atribuicao;
    atribuicao = newAtribuicao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OiArdubotPackage.LER__ATRIBUICAO, oldAtribuicao, newAtribuicao);
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
  public void setAtribuicao(ReceberValor newAtribuicao)
  {
    if (newAtribuicao != atribuicao)
    {
      NotificationChain msgs = null;
      if (atribuicao != null)
        msgs = ((InternalEObject)atribuicao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OiArdubotPackage.LER__ATRIBUICAO, null, msgs);
      if (newAtribuicao != null)
        msgs = ((InternalEObject)newAtribuicao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OiArdubotPackage.LER__ATRIBUICAO, null, msgs);
      msgs = basicSetAtribuicao(newAtribuicao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.LER__ATRIBUICAO, newAtribuicao, newAtribuicao));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLer()
  {
    return ler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLer(String newLer)
  {
    String oldLer = ler;
    ler = newLer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.LER__LER, oldLer, ler));
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
      case OiArdubotPackage.LER__ATRIBUICAO:
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
      case OiArdubotPackage.LER__ATRIBUICAO:
        return getAtribuicao();
      case OiArdubotPackage.LER__LER:
        return getLer();
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
      case OiArdubotPackage.LER__ATRIBUICAO:
        setAtribuicao((ReceberValor)newValue);
        return;
      case OiArdubotPackage.LER__LER:
        setLer((String)newValue);
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
      case OiArdubotPackage.LER__ATRIBUICAO:
        setAtribuicao((ReceberValor)null);
        return;
      case OiArdubotPackage.LER__LER:
        setLer(LER_EDEFAULT);
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
      case OiArdubotPackage.LER__ATRIBUICAO:
        return atribuicao != null;
      case OiArdubotPackage.LER__LER:
        return LER_EDEFAULT == null ? ler != null : !LER_EDEFAULT.equals(ler);
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
    result.append(" (ler: ");
    result.append(ler);
    result.append(')');
    return result.toString();
  }

} //LerImpl
