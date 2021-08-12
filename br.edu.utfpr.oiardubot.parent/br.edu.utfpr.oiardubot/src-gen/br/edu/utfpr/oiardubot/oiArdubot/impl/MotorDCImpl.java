/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot.impl;

import br.edu.utfpr.oiardubot.oiArdubot.Direcao;
import br.edu.utfpr.oiardubot.oiArdubot.MotorDC;
import br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motor DC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.MotorDCImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.MotorDCImpl#getDirecao <em>Direcao</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MotorDCImpl extends ImplementacaoImpl implements MotorDC
{
  /**
   * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstado()
   * @generated
   * @ordered
   */
  protected static final int ESTADO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstado()
   * @generated
   * @ordered
   */
  protected int estado = ESTADO_EDEFAULT;

  /**
   * The default value of the '{@link #getDirecao() <em>Direcao</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirecao()
   * @generated
   * @ordered
   */
  protected static final Direcao DIRECAO_EDEFAULT = Direcao.FRENTE;

  /**
   * The cached value of the '{@link #getDirecao() <em>Direcao</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirecao()
   * @generated
   * @ordered
   */
  protected Direcao direcao = DIRECAO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MotorDCImpl()
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
    return OiArdubotPackage.Literals.MOTOR_DC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getEstado()
  {
    return estado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEstado(int newEstado)
  {
    int oldEstado = estado;
    estado = newEstado;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.MOTOR_DC__ESTADO, oldEstado, estado));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Direcao getDirecao()
  {
    return direcao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDirecao(Direcao newDirecao)
  {
    Direcao oldDirecao = direcao;
    direcao = newDirecao == null ? DIRECAO_EDEFAULT : newDirecao;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.MOTOR_DC__DIRECAO, oldDirecao, direcao));
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
      case OiArdubotPackage.MOTOR_DC__ESTADO:
        return getEstado();
      case OiArdubotPackage.MOTOR_DC__DIRECAO:
        return getDirecao();
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
      case OiArdubotPackage.MOTOR_DC__ESTADO:
        setEstado((Integer)newValue);
        return;
      case OiArdubotPackage.MOTOR_DC__DIRECAO:
        setDirecao((Direcao)newValue);
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
      case OiArdubotPackage.MOTOR_DC__ESTADO:
        setEstado(ESTADO_EDEFAULT);
        return;
      case OiArdubotPackage.MOTOR_DC__DIRECAO:
        setDirecao(DIRECAO_EDEFAULT);
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
      case OiArdubotPackage.MOTOR_DC__ESTADO:
        return estado != ESTADO_EDEFAULT;
      case OiArdubotPackage.MOTOR_DC__DIRECAO:
        return direcao != DIRECAO_EDEFAULT;
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
    result.append(" (estado: ");
    result.append(estado);
    result.append(", direcao: ");
    result.append(direcao);
    result.append(')');
    return result.toString();
  }

} //MotorDCImpl
