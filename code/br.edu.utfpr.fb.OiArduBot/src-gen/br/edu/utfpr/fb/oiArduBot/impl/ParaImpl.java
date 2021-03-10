/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.fb.oiArduBot.impl;

import br.edu.utfpr.fb.oiArduBot.OiArduBotPackage;
import br.edu.utfpr.fb.oiArduBot.Para;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Para</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.impl.ParaImpl#getDe <em>De</em>}</li>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.impl.ParaImpl#getAte <em>Ate</em>}</li>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.impl.ParaImpl#getPasso <em>Passo</em>}</li>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.impl.ParaImpl#getCodigoPara <em>Codigo Para</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParaImpl extends MinimalEObjectImpl.Container implements Para
{
  /**
   * The default value of the '{@link #getDe() <em>De</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDe()
   * @generated
   * @ordered
   */
  protected static final int DE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDe() <em>De</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDe()
   * @generated
   * @ordered
   */
  protected int de = DE_EDEFAULT;

  /**
   * The default value of the '{@link #getAte() <em>Ate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAte()
   * @generated
   * @ordered
   */
  protected static final int ATE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAte() <em>Ate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAte()
   * @generated
   * @ordered
   */
  protected int ate = ATE_EDEFAULT;

  /**
   * The default value of the '{@link #getPasso() <em>Passo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPasso()
   * @generated
   * @ordered
   */
  protected static final int PASSO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPasso() <em>Passo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPasso()
   * @generated
   * @ordered
   */
  protected int passo = PASSO_EDEFAULT;

  /**
   * The default value of the '{@link #getCodigoPara() <em>Codigo Para</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodigoPara()
   * @generated
   * @ordered
   */
  protected static final String CODIGO_PARA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCodigoPara() <em>Codigo Para</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodigoPara()
   * @generated
   * @ordered
   */
  protected String codigoPara = CODIGO_PARA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParaImpl()
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
    return OiArduBotPackage.Literals.PARA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getDe()
  {
    return de;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDe(int newDe)
  {
    int oldDe = de;
    de = newDe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArduBotPackage.PARA__DE, oldDe, de));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getAte()
  {
    return ate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAte(int newAte)
  {
    int oldAte = ate;
    ate = newAte;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArduBotPackage.PARA__ATE, oldAte, ate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPasso()
  {
    return passo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPasso(int newPasso)
  {
    int oldPasso = passo;
    passo = newPasso;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArduBotPackage.PARA__PASSO, oldPasso, passo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCodigoPara()
  {
    return codigoPara;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCodigoPara(String newCodigoPara)
  {
    String oldCodigoPara = codigoPara;
    codigoPara = newCodigoPara;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArduBotPackage.PARA__CODIGO_PARA, oldCodigoPara, codigoPara));
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
      case OiArduBotPackage.PARA__DE:
        return getDe();
      case OiArduBotPackage.PARA__ATE:
        return getAte();
      case OiArduBotPackage.PARA__PASSO:
        return getPasso();
      case OiArduBotPackage.PARA__CODIGO_PARA:
        return getCodigoPara();
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
      case OiArduBotPackage.PARA__DE:
        setDe((Integer)newValue);
        return;
      case OiArduBotPackage.PARA__ATE:
        setAte((Integer)newValue);
        return;
      case OiArduBotPackage.PARA__PASSO:
        setPasso((Integer)newValue);
        return;
      case OiArduBotPackage.PARA__CODIGO_PARA:
        setCodigoPara((String)newValue);
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
      case OiArduBotPackage.PARA__DE:
        setDe(DE_EDEFAULT);
        return;
      case OiArduBotPackage.PARA__ATE:
        setAte(ATE_EDEFAULT);
        return;
      case OiArduBotPackage.PARA__PASSO:
        setPasso(PASSO_EDEFAULT);
        return;
      case OiArduBotPackage.PARA__CODIGO_PARA:
        setCodigoPara(CODIGO_PARA_EDEFAULT);
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
      case OiArduBotPackage.PARA__DE:
        return de != DE_EDEFAULT;
      case OiArduBotPackage.PARA__ATE:
        return ate != ATE_EDEFAULT;
      case OiArduBotPackage.PARA__PASSO:
        return passo != PASSO_EDEFAULT;
      case OiArduBotPackage.PARA__CODIGO_PARA:
        return CODIGO_PARA_EDEFAULT == null ? codigoPara != null : !CODIGO_PARA_EDEFAULT.equals(codigoPara);
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
    result.append(" (de: ");
    result.append(de);
    result.append(", ate: ");
    result.append(ate);
    result.append(", passo: ");
    result.append(passo);
    result.append(", codigoPara: ");
    result.append(codigoPara);
    result.append(')');
    return result.toString();
  }

} //ParaImpl