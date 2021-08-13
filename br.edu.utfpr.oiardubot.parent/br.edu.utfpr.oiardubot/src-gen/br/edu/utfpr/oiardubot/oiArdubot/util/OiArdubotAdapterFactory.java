/**
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.oiArdubot.util;

import br.edu.utfpr.oiardubot.oiArdubot.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.utfpr.oiardubot.oiArdubot.OiArdubotPackage
 * @generated
 */
public class OiArdubotAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OiArdubotPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OiArdubotAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OiArdubotPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OiArdubotSwitch<Adapter> modelSwitch =
    new OiArdubotSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseCodigo(Codigo object)
      {
        return createCodigoAdapter();
      }
      @Override
      public Adapter caseImplementacao(Implementacao object)
      {
        return createImplementacaoAdapter();
      }
      @Override
      public Adapter casePorta(Porta object)
      {
        return createPortaAdapter();
      }
      @Override
      public Adapter casePortaAnalogica(PortaAnalogica object)
      {
        return createPortaAnalogicaAdapter();
      }
      @Override
      public Adapter casePortaDigital(PortaDigital object)
      {
        return createPortaDigitalAdapter();
      }
      @Override
      public Adapter caseReceberValor(ReceberValor object)
      {
        return createReceberValorAdapter();
      }
      @Override
      public Adapter caseExistenteVariavelRecebe(ExistenteVariavelRecebe object)
      {
        return createExistenteVariavelRecebeAdapter();
      }
      @Override
      public Adapter caseNovaVariavelRecebe(NovaVariavelRecebe object)
      {
        return createNovaVariavelRecebeAdapter();
      }
      @Override
      public Adapter caseVariavelNome(VariavelNome object)
      {
        return createVariavelNomeAdapter();
      }
      @Override
      public Adapter caseVariavelOuPorta(VariavelOuPorta object)
      {
        return createVariavelOuPortaAdapter();
      }
      @Override
      public Adapter caseNome(Nome object)
      {
        return createNomeAdapter();
      }
      @Override
      public Adapter caseConteudoEscrever(ConteudoEscrever object)
      {
        return createConteudoEscreverAdapter();
      }
      @Override
      public Adapter caseTexto(Texto object)
      {
        return createTextoAdapter();
      }
      @Override
      public Adapter caseInteiro(Inteiro object)
      {
        return createInteiroAdapter();
      }
      @Override
      public Adapter caseVariavel(Variavel object)
      {
        return createVariavelAdapter();
      }
      @Override
      public Adapter caseVariavelExistente(VariavelExistente object)
      {
        return createVariavelExistenteAdapter();
      }
      @Override
      public Adapter caseConstanteVariavel(ConstanteVariavel object)
      {
        return createConstanteVariavelAdapter();
      }
      @Override
      public Adapter caseConstante(Constante object)
      {
        return createConstanteAdapter();
      }
      @Override
      public Adapter caseControle(Controle object)
      {
        return createControleAdapter();
      }
      @Override
      public Adapter caseLogico(Logico object)
      {
        return createLogicoAdapter();
      }
      @Override
      public Adapter caseLer(Ler object)
      {
        return createLerAdapter();
      }
      @Override
      public Adapter caseLerDigital(LerDigital object)
      {
        return createLerDigitalAdapter();
      }
      @Override
      public Adapter caseFuncaoLerDigital(FuncaoLerDigital object)
      {
        return createFuncaoLerDigitalAdapter();
      }
      @Override
      public Adapter caseLerAnalogica(LerAnalogica object)
      {
        return createLerAnalogicaAdapter();
      }
      @Override
      public Adapter caseFuncaoLerAnalogica(FuncaoLerAnalogica object)
      {
        return createFuncaoLerAnalogicaAdapter();
      }
      @Override
      public Adapter caseEscrever(Escrever object)
      {
        return createEscreverAdapter();
      }
      @Override
      public Adapter caseTela(Tela object)
      {
        return createTelaAdapter();
      }
      @Override
      public Adapter caseBip(Bip object)
      {
        return createBipAdapter();
      }
      @Override
      public Adapter caseLigar(Ligar object)
      {
        return createLigarAdapter();
      }
      @Override
      public Adapter caseDesligar(Desligar object)
      {
        return createDesligarAdapter();
      }
      @Override
      public Adapter caseServo(Servo object)
      {
        return createServoAdapter();
      }
      @Override
      public Adapter caseMotorDC(MotorDC object)
      {
        return createMotorDCAdapter();
      }
      @Override
      public Adapter caseAndar(Andar object)
      {
        return createAndarAdapter();
      }
      @Override
      public Adapter caseParar(Parar object)
      {
        return createPararAdapter();
      }
      @Override
      public Adapter casePara(Para object)
      {
        return createParaAdapter();
      }
      @Override
      public Adapter caseFimPara(FimPara object)
      {
        return createFimParaAdapter();
      }
      @Override
      public Adapter caseEnquanto(Enquanto object)
      {
        return createEnquantoAdapter();
      }
      @Override
      public Adapter caseRepita(Repita object)
      {
        return createRepitaAdapter();
      }
      @Override
      public Adapter caseSe(Se object)
      {
        return createSeAdapter();
      }
      @Override
      public Adapter caseFimse(Fimse object)
      {
        return createFimseAdapter();
      }
      @Override
      public Adapter caseSenao(Senao object)
      {
        return createSenaoAdapter();
      }
      @Override
      public Adapter caseEscolha(Escolha object)
      {
        return createEscolhaAdapter();
      }
      @Override
      public Adapter caseCaso(Caso object)
      {
        return createCasoAdapter();
      }
      @Override
      public Adapter caseFuncao(Funcao object)
      {
        return createFuncaoAdapter();
      }
      @Override
      public Adapter caseParametro(Parametro object)
      {
        return createParametroAdapter();
      }
      @Override
      public Adapter caseEspera(Espera object)
      {
        return createEsperaAdapter();
      }
      @Override
      public Adapter caseSoma(Soma object)
      {
        return createSomaAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Codigo <em>Codigo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Codigo
   * @generated
   */
  public Adapter createCodigoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Implementacao <em>Implementacao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Implementacao
   * @generated
   */
  public Adapter createImplementacaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Porta <em>Porta</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Porta
   * @generated
   */
  public Adapter createPortaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.PortaAnalogica <em>Porta Analogica</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.PortaAnalogica
   * @generated
   */
  public Adapter createPortaAnalogicaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.PortaDigital <em>Porta Digital</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.PortaDigital
   * @generated
   */
  public Adapter createPortaDigitalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.ReceberValor <em>Receber Valor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.ReceberValor
   * @generated
   */
  public Adapter createReceberValorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.ExistenteVariavelRecebe <em>Existente Variavel Recebe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.ExistenteVariavelRecebe
   * @generated
   */
  public Adapter createExistenteVariavelRecebeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.NovaVariavelRecebe <em>Nova Variavel Recebe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.NovaVariavelRecebe
   * @generated
   */
  public Adapter createNovaVariavelRecebeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.VariavelNome <em>Variavel Nome</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.VariavelNome
   * @generated
   */
  public Adapter createVariavelNomeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.VariavelOuPorta <em>Variavel Ou Porta</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.VariavelOuPorta
   * @generated
   */
  public Adapter createVariavelOuPortaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Nome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Nome
   * @generated
   */
  public Adapter createNomeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.ConteudoEscrever <em>Conteudo Escrever</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.ConteudoEscrever
   * @generated
   */
  public Adapter createConteudoEscreverAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Texto <em>Texto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Texto
   * @generated
   */
  public Adapter createTextoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Inteiro <em>Inteiro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Inteiro
   * @generated
   */
  public Adapter createInteiroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Variavel <em>Variavel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Variavel
   * @generated
   */
  public Adapter createVariavelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.VariavelExistente <em>Variavel Existente</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.VariavelExistente
   * @generated
   */
  public Adapter createVariavelExistenteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.ConstanteVariavel <em>Constante Variavel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.ConstanteVariavel
   * @generated
   */
  public Adapter createConstanteVariavelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Constante <em>Constante</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Constante
   * @generated
   */
  public Adapter createConstanteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Controle <em>Controle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Controle
   * @generated
   */
  public Adapter createControleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Logico <em>Logico</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Logico
   * @generated
   */
  public Adapter createLogicoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Ler <em>Ler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Ler
   * @generated
   */
  public Adapter createLerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.LerDigital <em>Ler Digital</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.LerDigital
   * @generated
   */
  public Adapter createLerDigitalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.FuncaoLerDigital <em>Funcao Ler Digital</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.FuncaoLerDigital
   * @generated
   */
  public Adapter createFuncaoLerDigitalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.LerAnalogica <em>Ler Analogica</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.LerAnalogica
   * @generated
   */
  public Adapter createLerAnalogicaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.FuncaoLerAnalogica <em>Funcao Ler Analogica</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.FuncaoLerAnalogica
   * @generated
   */
  public Adapter createFuncaoLerAnalogicaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Escrever <em>Escrever</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Escrever
   * @generated
   */
  public Adapter createEscreverAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Tela <em>Tela</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Tela
   * @generated
   */
  public Adapter createTelaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Bip <em>Bip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Bip
   * @generated
   */
  public Adapter createBipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Ligar <em>Ligar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Ligar
   * @generated
   */
  public Adapter createLigarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Desligar <em>Desligar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Desligar
   * @generated
   */
  public Adapter createDesligarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Servo <em>Servo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Servo
   * @generated
   */
  public Adapter createServoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.MotorDC <em>Motor DC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.MotorDC
   * @generated
   */
  public Adapter createMotorDCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Andar <em>Andar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Andar
   * @generated
   */
  public Adapter createAndarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Parar <em>Parar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Parar
   * @generated
   */
  public Adapter createPararAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Para <em>Para</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Para
   * @generated
   */
  public Adapter createParaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.FimPara <em>Fim Para</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.FimPara
   * @generated
   */
  public Adapter createFimParaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Enquanto <em>Enquanto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Enquanto
   * @generated
   */
  public Adapter createEnquantoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Repita <em>Repita</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Repita
   * @generated
   */
  public Adapter createRepitaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Se <em>Se</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Se
   * @generated
   */
  public Adapter createSeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Fimse <em>Fimse</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Fimse
   * @generated
   */
  public Adapter createFimseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Senao <em>Senao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Senao
   * @generated
   */
  public Adapter createSenaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Escolha <em>Escolha</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Escolha
   * @generated
   */
  public Adapter createEscolhaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Caso <em>Caso</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Caso
   * @generated
   */
  public Adapter createCasoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Funcao <em>Funcao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Funcao
   * @generated
   */
  public Adapter createFuncaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Parametro <em>Parametro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Parametro
   * @generated
   */
  public Adapter createParametroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Espera <em>Espera</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Espera
   * @generated
   */
  public Adapter createEsperaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.utfpr.oiardubot.oiArdubot.Soma <em>Soma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.utfpr.oiardubot.oiArdubot.Soma
   * @generated
   */
  public Adapter createSomaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //OiArdubotAdapterFactory