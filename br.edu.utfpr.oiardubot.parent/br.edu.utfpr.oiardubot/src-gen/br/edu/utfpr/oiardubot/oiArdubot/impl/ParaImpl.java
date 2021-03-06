/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot.impl;

import br.edu.utfpr.oiardubot.oiArdubot.FimPara;
import br.edu.utfpr.oiardubot.oiArdubot.Implementacao;
import br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage;
import br.edu.utfpr.oiardubot.oiArdubot.Para;

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
 * An implementation of the model object '<em><b>Para</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.ParaImpl#getVariavel <em>Variavel</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.ParaImpl#getDe <em>De</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.ParaImpl#getAte <em>Ate</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.ParaImpl#getCode <em>Code</em>}</li>
 *   <li>{@link br.edu.utfpr.oiardubot.oiArdubot.impl.ParaImpl#getFimpara <em>Fimpara</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParaImpl extends ImplementacaoImpl implements Para
{
  /**
   * The default value of the '{@link #getVariavel() <em>Variavel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariavel()
   * @generated
   * @ordered
   */
  protected static final String VARIAVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariavel() <em>Variavel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariavel()
   * @generated
   * @ordered
   */
  protected String variavel = VARIAVEL_EDEFAULT;

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
   * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected EList<Implementacao> code;

  /**
   * The cached value of the '{@link #getFimpara() <em>Fimpara</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFimpara()
   * @generated
   * @ordered
   */
  protected FimPara fimpara;

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
    return OiArdubotPackage.Literals.PARA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVariavel()
  {
    return variavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariavel(String newVariavel)
  {
    String oldVariavel = variavel;
    variavel = newVariavel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.PARA__VARIAVEL, oldVariavel, variavel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.PARA__DE, oldDe, de));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.PARA__ATE, oldAte, ate));
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
      code = new EObjectContainmentEList<Implementacao>(Implementacao.class, this, OiArdubotPackage.PARA__CODE);
    }
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FimPara getFimpara()
  {
    return fimpara;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFimpara(FimPara newFimpara, NotificationChain msgs)
  {
    FimPara oldFimpara = fimpara;
    fimpara = newFimpara;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OiArdubotPackage.PARA__FIMPARA, oldFimpara, newFimpara);
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
  public void setFimpara(FimPara newFimpara)
  {
    if (newFimpara != fimpara)
    {
      NotificationChain msgs = null;
      if (fimpara != null)
        msgs = ((InternalEObject)fimpara).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OiArdubotPackage.PARA__FIMPARA, null, msgs);
      if (newFimpara != null)
        msgs = ((InternalEObject)newFimpara).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OiArdubotPackage.PARA__FIMPARA, null, msgs);
      msgs = basicSetFimpara(newFimpara, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArdubotPackage.PARA__FIMPARA, newFimpara, newFimpara));
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
      case OiArdubotPackage.PARA__CODE:
        return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
      case OiArdubotPackage.PARA__FIMPARA:
        return basicSetFimpara(null, msgs);
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
      case OiArdubotPackage.PARA__VARIAVEL:
        return getVariavel();
      case OiArdubotPackage.PARA__DE:
        return getDe();
      case OiArdubotPackage.PARA__ATE:
        return getAte();
      case OiArdubotPackage.PARA__CODE:
        return getCode();
      case OiArdubotPackage.PARA__FIMPARA:
        return getFimpara();
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
      case OiArdubotPackage.PARA__VARIAVEL:
        setVariavel((String)newValue);
        return;
      case OiArdubotPackage.PARA__DE:
        setDe((Integer)newValue);
        return;
      case OiArdubotPackage.PARA__ATE:
        setAte((Integer)newValue);
        return;
      case OiArdubotPackage.PARA__CODE:
        getCode().clear();
        getCode().addAll((Collection<? extends Implementacao>)newValue);
        return;
      case OiArdubotPackage.PARA__FIMPARA:
        setFimpara((FimPara)newValue);
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
      case OiArdubotPackage.PARA__VARIAVEL:
        setVariavel(VARIAVEL_EDEFAULT);
        return;
      case OiArdubotPackage.PARA__DE:
        setDe(DE_EDEFAULT);
        return;
      case OiArdubotPackage.PARA__ATE:
        setAte(ATE_EDEFAULT);
        return;
      case OiArdubotPackage.PARA__CODE:
        getCode().clear();
        return;
      case OiArdubotPackage.PARA__FIMPARA:
        setFimpara((FimPara)null);
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
      case OiArdubotPackage.PARA__VARIAVEL:
        return VARIAVEL_EDEFAULT == null ? variavel != null : !VARIAVEL_EDEFAULT.equals(variavel);
      case OiArdubotPackage.PARA__DE:
        return de != DE_EDEFAULT;
      case OiArdubotPackage.PARA__ATE:
        return ate != ATE_EDEFAULT;
      case OiArdubotPackage.PARA__CODE:
        return code != null && !code.isEmpty();
      case OiArdubotPackage.PARA__FIMPARA:
        return fimpara != null;
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
    result.append(" (variavel: ");
    result.append(variavel);
    result.append(", de: ");
    result.append(de);
    result.append(", ate: ");
    result.append(ate);
    result.append(')');
    return result.toString();
  }

} //ParaImpl
