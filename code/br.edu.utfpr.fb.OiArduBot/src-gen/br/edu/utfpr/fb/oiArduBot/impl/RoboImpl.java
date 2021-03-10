/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.fb.oiArduBot.impl;

import br.edu.utfpr.fb.oiArduBot.Atuacao;
import br.edu.utfpr.fb.oiArduBot.OiArduBotPackage;
import br.edu.utfpr.fb.oiArduBot.Robo;
import br.edu.utfpr.fb.oiArduBot.Sensoriamento;

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
 * An implementation of the model object '<em><b>Robo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.impl.RoboImpl#getSensores <em>Sensores</em>}</li>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.impl.RoboImpl#getAtuadores <em>Atuadores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoboImpl extends MinimalEObjectImpl.Container implements Robo
{
  /**
   * The cached value of the '{@link #getSensores() <em>Sensores</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensores()
   * @generated
   * @ordered
   */
  protected EList<Sensoriamento> sensores;

  /**
   * The cached value of the '{@link #getAtuadores() <em>Atuadores</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtuadores()
   * @generated
   * @ordered
   */
  protected EList<Atuacao> atuadores;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoboImpl()
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
    return OiArduBotPackage.Literals.ROBO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Sensoriamento> getSensores()
  {
    if (sensores == null)
    {
      sensores = new EObjectContainmentEList<Sensoriamento>(Sensoriamento.class, this, OiArduBotPackage.ROBO__SENSORES);
    }
    return sensores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Atuacao> getAtuadores()
  {
    if (atuadores == null)
    {
      atuadores = new EObjectContainmentEList<Atuacao>(Atuacao.class, this, OiArduBotPackage.ROBO__ATUADORES);
    }
    return atuadores;
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
      case OiArduBotPackage.ROBO__SENSORES:
        return ((InternalEList<?>)getSensores()).basicRemove(otherEnd, msgs);
      case OiArduBotPackage.ROBO__ATUADORES:
        return ((InternalEList<?>)getAtuadores()).basicRemove(otherEnd, msgs);
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
      case OiArduBotPackage.ROBO__SENSORES:
        return getSensores();
      case OiArduBotPackage.ROBO__ATUADORES:
        return getAtuadores();
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
      case OiArduBotPackage.ROBO__SENSORES:
        getSensores().clear();
        getSensores().addAll((Collection<? extends Sensoriamento>)newValue);
        return;
      case OiArduBotPackage.ROBO__ATUADORES:
        getAtuadores().clear();
        getAtuadores().addAll((Collection<? extends Atuacao>)newValue);
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
      case OiArduBotPackage.ROBO__SENSORES:
        getSensores().clear();
        return;
      case OiArduBotPackage.ROBO__ATUADORES:
        getAtuadores().clear();
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
      case OiArduBotPackage.ROBO__SENSORES:
        return sensores != null && !sensores.isEmpty();
      case OiArduBotPackage.ROBO__ATUADORES:
        return atuadores != null && !atuadores.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RoboImpl
