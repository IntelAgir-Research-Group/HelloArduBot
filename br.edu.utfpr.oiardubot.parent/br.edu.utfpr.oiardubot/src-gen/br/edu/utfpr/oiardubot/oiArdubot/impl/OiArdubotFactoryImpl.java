/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot.impl;

import br.edu.utfpr.oiardubot.oiArdubot.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OiArdubotFactoryImpl extends EFactoryImpl implements OiArdubotFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OiArdubotFactory init()
  {
    try
    {
      OiArdubotFactory theOiArdubotFactory = (OiArdubotFactory)EPackage.Registry.INSTANCE.getEFactory(OiArdubotPackage.eNS_URI);
      if (theOiArdubotFactory != null)
      {
        return theOiArdubotFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OiArdubotFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OiArdubotFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OiArdubotPackage.MODEL: return createModel();
      case OiArdubotPackage.CODIGO: return createCodigo();
      case OiArdubotPackage.IMPLEMENTACAO: return createImplementacao();
      case OiArdubotPackage.PORTA: return createPorta();
      case OiArdubotPackage.PORTA_ANALOGICA: return createPortaAnalogica();
      case OiArdubotPackage.PORTA_DIGITAL: return createPortaDigital();
      case OiArdubotPackage.RECEBER_VALOR: return createReceberValor();
      case OiArdubotPackage.EXISTENTE_VARIAVEL_RECEBE: return createExistenteVariavelRecebe();
      case OiArdubotPackage.NOVA_VARIAVEL_RECEBE: return createNovaVariavelRecebe();
      case OiArdubotPackage.VARIAVEL_NOME: return createVariavelNome();
      case OiArdubotPackage.VARIAVEL_OU_PORTA: return createVariavelOuPorta();
      case OiArdubotPackage.NOME: return createNome();
      case OiArdubotPackage.CONTEUDO_ESCREVER: return createConteudoEscrever();
      case OiArdubotPackage.TEXTO: return createTexto();
      case OiArdubotPackage.INTEIRO: return createInteiro();
      case OiArdubotPackage.VARIAVEL: return createVariavel();
      case OiArdubotPackage.VARIAVEL_EXISTENTE: return createVariavelExistente();
      case OiArdubotPackage.CONSTANTE_VARIAVEL: return createConstanteVariavel();
      case OiArdubotPackage.CONSTANTE: return createConstante();
      case OiArdubotPackage.CONTROLE: return createControle();
      case OiArdubotPackage.LOGICO: return createLogico();
      case OiArdubotPackage.LER: return createLer();
      case OiArdubotPackage.LER_DIGITAL: return createLerDigital();
      case OiArdubotPackage.FUNCAO_LER_DIGITAL: return createFuncaoLerDigital();
      case OiArdubotPackage.LER_ANALOGICA: return createLerAnalogica();
      case OiArdubotPackage.FUNCAO_LER_ANALOGICA: return createFuncaoLerAnalogica();
      case OiArdubotPackage.ESCREVER: return createEscrever();
      case OiArdubotPackage.TELA: return createTela();
      case OiArdubotPackage.BIP: return createBip();
      case OiArdubotPackage.LIGAR: return createLigar();
      case OiArdubotPackage.DESLIGAR: return createDesligar();
      case OiArdubotPackage.SERVO: return createServo();
      case OiArdubotPackage.MOTOR_DC: return createMotorDC();
      case OiArdubotPackage.ANDAR: return createAndar();
      case OiArdubotPackage.PARAR: return createParar();
      case OiArdubotPackage.PARA: return createPara();
      case OiArdubotPackage.FIM_PARA: return createFimPara();
      case OiArdubotPackage.ENQUANTO: return createEnquanto();
      case OiArdubotPackage.REPITA: return createRepita();
      case OiArdubotPackage.SE: return createSe();
      case OiArdubotPackage.FIMSE: return createFimse();
      case OiArdubotPackage.SENAO: return createSenao();
      case OiArdubotPackage.ESCOLHA: return createEscolha();
      case OiArdubotPackage.CASO: return createCaso();
      case OiArdubotPackage.FUNCAO: return createFuncao();
      case OiArdubotPackage.PARAMETRO: return createParametro();
      case OiArdubotPackage.ESPERA: return createEspera();
      case OiArdubotPackage.SOMA: return createSoma();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case OiArdubotPackage.TIPO_PORTA:
        return createTipoPortaFromString(eDataType, initialValue);
      case OiArdubotPackage.TIPO:
        return createTipoFromString(eDataType, initialValue);
      case OiArdubotPackage.DIRECAO:
        return createDirecaoFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case OiArdubotPackage.TIPO_PORTA:
        return convertTipoPortaToString(eDataType, instanceValue);
      case OiArdubotPackage.TIPO:
        return convertTipoToString(eDataType, instanceValue);
      case OiArdubotPackage.DIRECAO:
        return convertDirecaoToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Codigo createCodigo()
  {
    CodigoImpl codigo = new CodigoImpl();
    return codigo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Implementacao createImplementacao()
  {
    ImplementacaoImpl implementacao = new ImplementacaoImpl();
    return implementacao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Porta createPorta()
  {
    PortaImpl porta = new PortaImpl();
    return porta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PortaAnalogica createPortaAnalogica()
  {
    PortaAnalogicaImpl portaAnalogica = new PortaAnalogicaImpl();
    return portaAnalogica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PortaDigital createPortaDigital()
  {
    PortaDigitalImpl portaDigital = new PortaDigitalImpl();
    return portaDigital;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReceberValor createReceberValor()
  {
    ReceberValorImpl receberValor = new ReceberValorImpl();
    return receberValor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistenteVariavelRecebe createExistenteVariavelRecebe()
  {
    ExistenteVariavelRecebeImpl existenteVariavelRecebe = new ExistenteVariavelRecebeImpl();
    return existenteVariavelRecebe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NovaVariavelRecebe createNovaVariavelRecebe()
  {
    NovaVariavelRecebeImpl novaVariavelRecebe = new NovaVariavelRecebeImpl();
    return novaVariavelRecebe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariavelNome createVariavelNome()
  {
    VariavelNomeImpl variavelNome = new VariavelNomeImpl();
    return variavelNome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariavelOuPorta createVariavelOuPorta()
  {
    VariavelOuPortaImpl variavelOuPorta = new VariavelOuPortaImpl();
    return variavelOuPorta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nome createNome()
  {
    NomeImpl nome = new NomeImpl();
    return nome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConteudoEscrever createConteudoEscrever()
  {
    ConteudoEscreverImpl conteudoEscrever = new ConteudoEscreverImpl();
    return conteudoEscrever;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Texto createTexto()
  {
    TextoImpl texto = new TextoImpl();
    return texto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Inteiro createInteiro()
  {
    InteiroImpl inteiro = new InteiroImpl();
    return inteiro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variavel createVariavel()
  {
    VariavelImpl variavel = new VariavelImpl();
    return variavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariavelExistente createVariavelExistente()
  {
    VariavelExistenteImpl variavelExistente = new VariavelExistenteImpl();
    return variavelExistente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstanteVariavel createConstanteVariavel()
  {
    ConstanteVariavelImpl constanteVariavel = new ConstanteVariavelImpl();
    return constanteVariavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constante createConstante()
  {
    ConstanteImpl constante = new ConstanteImpl();
    return constante;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Controle createControle()
  {
    ControleImpl controle = new ControleImpl();
    return controle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Logico createLogico()
  {
    LogicoImpl logico = new LogicoImpl();
    return logico;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ler createLer()
  {
    LerImpl ler = new LerImpl();
    return ler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LerDigital createLerDigital()
  {
    LerDigitalImpl lerDigital = new LerDigitalImpl();
    return lerDigital;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FuncaoLerDigital createFuncaoLerDigital()
  {
    FuncaoLerDigitalImpl funcaoLerDigital = new FuncaoLerDigitalImpl();
    return funcaoLerDigital;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LerAnalogica createLerAnalogica()
  {
    LerAnalogicaImpl lerAnalogica = new LerAnalogicaImpl();
    return lerAnalogica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FuncaoLerAnalogica createFuncaoLerAnalogica()
  {
    FuncaoLerAnalogicaImpl funcaoLerAnalogica = new FuncaoLerAnalogicaImpl();
    return funcaoLerAnalogica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Escrever createEscrever()
  {
    EscreverImpl escrever = new EscreverImpl();
    return escrever;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tela createTela()
  {
    TelaImpl tela = new TelaImpl();
    return tela;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bip createBip()
  {
    BipImpl bip = new BipImpl();
    return bip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ligar createLigar()
  {
    LigarImpl ligar = new LigarImpl();
    return ligar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Desligar createDesligar()
  {
    DesligarImpl desligar = new DesligarImpl();
    return desligar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Servo createServo()
  {
    ServoImpl servo = new ServoImpl();
    return servo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MotorDC createMotorDC()
  {
    MotorDCImpl motorDC = new MotorDCImpl();
    return motorDC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Andar createAndar()
  {
    AndarImpl andar = new AndarImpl();
    return andar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parar createParar()
  {
    PararImpl parar = new PararImpl();
    return parar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Para createPara()
  {
    ParaImpl para = new ParaImpl();
    return para;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FimPara createFimPara()
  {
    FimParaImpl fimPara = new FimParaImpl();
    return fimPara;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Enquanto createEnquanto()
  {
    EnquantoImpl enquanto = new EnquantoImpl();
    return enquanto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Repita createRepita()
  {
    RepitaImpl repita = new RepitaImpl();
    return repita;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Se createSe()
  {
    SeImpl se = new SeImpl();
    return se;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Fimse createFimse()
  {
    FimseImpl fimse = new FimseImpl();
    return fimse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Senao createSenao()
  {
    SenaoImpl senao = new SenaoImpl();
    return senao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Escolha createEscolha()
  {
    EscolhaImpl escolha = new EscolhaImpl();
    return escolha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Caso createCaso()
  {
    CasoImpl caso = new CasoImpl();
    return caso;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Funcao createFuncao()
  {
    FuncaoImpl funcao = new FuncaoImpl();
    return funcao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parametro createParametro()
  {
    ParametroImpl parametro = new ParametroImpl();
    return parametro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Espera createEspera()
  {
    EsperaImpl espera = new EsperaImpl();
    return espera;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Soma createSoma()
  {
    SomaImpl soma = new SomaImpl();
    return soma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TipoPorta createTipoPortaFromString(EDataType eDataType, String initialValue)
  {
    TipoPorta result = TipoPorta.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTipoPortaToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tipo createTipoFromString(EDataType eDataType, String initialValue)
  {
    Tipo result = Tipo.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTipoToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direcao createDirecaoFromString(EDataType eDataType, String initialValue)
  {
    Direcao result = Direcao.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDirecaoToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OiArdubotPackage getOiArdubotPackage()
  {
    return (OiArdubotPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OiArdubotPackage getPackage()
  {
    return OiArdubotPackage.eINSTANCE;
  }

} //OiArdubotFactoryImpl
