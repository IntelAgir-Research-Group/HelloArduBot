/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.fb.oiArduBot.impl;

import br.edu.utfpr.fb.oiArduBot.OiArduBotPackage;
import br.edu.utfpr.fb.oiArduBot.Tipo;
import br.edu.utfpr.fb.oiArduBot.Variavel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variavel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.impl.VariavelImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.impl.VariavelImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.utfpr.fb.oiArduBot.impl.VariavelImpl#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariavelImpl extends MinimalEObjectImpl.Container implements Variavel
{
  /**
   * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected static final Tipo TIPO_EDEFAULT = Tipo.TEXTO;

  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected Tipo tipo = TIPO_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
  protected VariavelImpl()
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
    return OiArduBotPackage.Literals.VARIAVEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tipo getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTipo(Tipo newTipo)
  {
    Tipo oldTipo = tipo;
    tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArduBotPackage.VARIAVEL__TIPO, oldTipo, tipo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OiArduBotPackage.VARIAVEL__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OiArduBotPackage.VARIAVEL__VALOR, oldValor, valor));
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
      case OiArduBotPackage.VARIAVEL__TIPO:
        return getTipo();
      case OiArduBotPackage.VARIAVEL__NAME:
        return getName();
      case OiArduBotPackage.VARIAVEL__VALOR:
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
      case OiArduBotPackage.VARIAVEL__TIPO:
        setTipo((Tipo)newValue);
        return;
      case OiArduBotPackage.VARIAVEL__NAME:
        setName((String)newValue);
        return;
      case OiArduBotPackage.VARIAVEL__VALOR:
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
      case OiArduBotPackage.VARIAVEL__TIPO:
        setTipo(TIPO_EDEFAULT);
        return;
      case OiArduBotPackage.VARIAVEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OiArduBotPackage.VARIAVEL__VALOR:
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
      case OiArduBotPackage.VARIAVEL__TIPO:
        return tipo != TIPO_EDEFAULT;
      case OiArduBotPackage.VARIAVEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OiArduBotPackage.VARIAVEL__VALOR:
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
    result.append(" (tipo: ");
    result.append(tipo);
    result.append(", name: ");
    result.append(name);
    result.append(", valor: ");
    result.append(valor);
    result.append(')');
    return result.toString();
  }

} //VariavelImpl