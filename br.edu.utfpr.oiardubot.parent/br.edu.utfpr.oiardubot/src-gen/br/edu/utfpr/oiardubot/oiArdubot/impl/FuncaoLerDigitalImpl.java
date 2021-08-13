/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot.impl;

import br.edu.utfpr.oiardubot.oiArdubot.FuncaoLerDigital;
import br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage;
import br.edu.utfpr.oiardubot.oiArdubot.Porta;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Funcao Ler Digital</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.FuncaoLerDigitalImpl#getPorta <em>Porta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuncaoLerDigitalImpl extends MinimalEObjectImpl.Container implements FuncaoLerDigital
{
  /**
   * The cached value of the '{@link #getPorta() <em>Porta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorta()
   * @generated
   * @ordered
   */
  protected Porta porta;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FuncaoLerDigitalImpl()
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
    return OiArdubotPackage.Literals.FUNCAO_LER_DIGITAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Porta getPorta()
  {
    return porta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPorta(Porta newPorta, NotificationChain msgs)
  {
    Porta oldPorta = porta;
    porta = newPorta;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OiArdubotPackage.FUNCAO_LER_DIGITAL__PORTA, oldPorta, newPorta);
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
  public void setPorta(Porta newPorta)
  {
    if (newPorta != porta)
    {
      NotificationChain msgs = null;
      if (porta != null)
        msgs = ((InternalEObject)porta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OiArdubotPackage.FUNCAO_LER_DIGITAL__PORTA, null, msgs);
      if (newPorta != null)
        msgs = ((InternalEObject)newPorta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OiArdubotPackage.FUNCAO_LER_DIGITAL__PORTA, null, msgs);
      msgs = basicSetPorta(newPorta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.FUNCAO_LER_DIGITAL__PORTA, newPorta, newPorta));
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
      case OiArdubotPackage.FUNCAO_LER_DIGITAL__PORTA:
        return basicSetPorta(null, msgs);
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
      case OiArdubotPackage.FUNCAO_LER_DIGITAL__PORTA:
        return getPorta();
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
      case OiArdubotPackage.FUNCAO_LER_DIGITAL__PORTA:
        setPorta((Porta)newValue);
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
      case OiArdubotPackage.FUNCAO_LER_DIGITAL__PORTA:
        setPorta((Porta)null);
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
      case OiArdubotPackage.FUNCAO_LER_DIGITAL__PORTA:
        return porta != null;
    }
    return super.eIsSet(featureID);
  }

} //FuncaoLerDigitalImpl