/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.fb.oiArduBot.impl;

import br.edu.utfpr.fb.oiArduBot.Beep;
import br.edu.utfpr.fb.oiArduBot.Notificacao;
import br.edu.utfpr.fb.oiArduBot.OiArduBotPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notificacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.impl.NotificacaoImpl#getBeep <em>Beep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificacaoImpl extends MinimalEObjectImpl.Container implements Notificacao
{
  /**
   * The cached value of the '{@link #getBeep() <em>Beep</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeep()
   * @generated
   * @ordered
   */
  protected EList<Beep> beep;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotificacaoImpl()
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
    return OiArduBotPackage.Literals.NOTIFICACAO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Beep> getBeep()
  {
    if (beep == null)
    {
      beep = new EObjectContainmentEList<Beep>(Beep.class, this, OiArduBotPackage.NOTIFICACAO__BEEP);
    }
    return beep;
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
      case OiArduBotPackage.NOTIFICACAO__BEEP:
        return ((InternalEList<?>)getBeep()).basicRemove(otherEnd, msgs);
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
      case OiArduBotPackage.NOTIFICACAO__BEEP:
        return getBeep();
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
      case OiArduBotPackage.NOTIFICACAO__BEEP:
        getBeep().clear();
        getBeep().addAll((Collection<? extends Beep>)newValue);
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
      case OiArduBotPackage.NOTIFICACAO__BEEP:
        getBeep().clear();
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
      case OiArduBotPackage.NOTIFICACAO__BEEP:
        return beep != null && !beep.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NotificacaoImpl