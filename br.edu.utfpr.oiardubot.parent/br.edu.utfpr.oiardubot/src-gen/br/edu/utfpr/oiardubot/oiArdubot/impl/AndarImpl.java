/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot.impl;

import br.edu.utfpr.oiardubot.oiArdubot.Andar;
import br.edu.utfpr.oiardubot.oiArdubot.Direcao;
import br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage;
import br.edu.utfpr.oiardubot.oiArdubot.VariavelOuPorta;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Andar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.AndarImpl#getPorta <em>Porta</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.AndarImpl#getVelocidade <em>Velocidade</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.AndarImpl#getDirecao <em>Direcao</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndarImpl extends ImplementacaoImpl implements Andar
{
  /**
   * The cached value of the '{@link #getPorta() <em>Porta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorta()
   * @generated
   * @ordered
   */
  protected VariavelOuPorta porta;

  /**
   * The default value of the '{@link #getVelocidade() <em>Velocidade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVelocidade()
   * @generated
   * @ordered
   */
  protected static final int VELOCIDADE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVelocidade() <em>Velocidade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVelocidade()
   * @generated
   * @ordered
   */
  protected int velocidade = VELOCIDADE_EDEFAULT;

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
  protected AndarImpl()
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
    return OiArdubotPackage.Literals.ANDAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariavelOuPorta getPorta()
  {
    return porta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPorta(VariavelOuPorta newPorta, NotificationChain msgs)
  {
    VariavelOuPorta oldPorta = porta;
    porta = newPorta;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OiArdubotPackage.ANDAR__PORTA, oldPorta, newPorta);
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
  public void setPorta(VariavelOuPorta newPorta)
  {
    if (newPorta != porta)
    {
      NotificationChain msgs = null;
      if (porta != null)
        msgs = ((InternalEObject)porta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OiArdubotPackage.ANDAR__PORTA, null, msgs);
      if (newPorta != null)
        msgs = ((InternalEObject)newPorta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OiArdubotPackage.ANDAR__PORTA, null, msgs);
      msgs = basicSetPorta(newPorta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.ANDAR__PORTA, newPorta, newPorta));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getVelocidade()
  {
    return velocidade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVelocidade(int newVelocidade)
  {
    int oldVelocidade = velocidade;
    velocidade = newVelocidade;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.ANDAR__VELOCIDADE, oldVelocidade, velocidade));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.ANDAR__DIRECAO, oldDirecao, direcao));
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
      case OiArdubotPackage.ANDAR__PORTA:
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
      case OiArdubotPackage.ANDAR__PORTA:
        return getPorta();
      case OiArdubotPackage.ANDAR__VELOCIDADE:
        return getVelocidade();
      case OiArdubotPackage.ANDAR__DIRECAO:
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
      case OiArdubotPackage.ANDAR__PORTA:
        setPorta((VariavelOuPorta)newValue);
        return;
      case OiArdubotPackage.ANDAR__VELOCIDADE:
        setVelocidade((Integer)newValue);
        return;
      case OiArdubotPackage.ANDAR__DIRECAO:
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
      case OiArdubotPackage.ANDAR__PORTA:
        setPorta((VariavelOuPorta)null);
        return;
      case OiArdubotPackage.ANDAR__VELOCIDADE:
        setVelocidade(VELOCIDADE_EDEFAULT);
        return;
      case OiArdubotPackage.ANDAR__DIRECAO:
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
      case OiArdubotPackage.ANDAR__PORTA:
        return porta != null;
      case OiArdubotPackage.ANDAR__VELOCIDADE:
        return velocidade != VELOCIDADE_EDEFAULT;
      case OiArdubotPackage.ANDAR__DIRECAO:
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
    result.append(" (velocidade: ");
    result.append(velocidade);
    result.append(", direcao: ");
    result.append(direcao);
    result.append(')');
    return result.toString();
  }

} //AndarImpl
