/*
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.oiardubot.ide.contentassist.antlr;

import br.edu.utfpr.oiardubot.ide.contentassist.antlr.internal.InternalOiArdubotParser;
import br.edu.utfpr.oiardubot.services.OiArdubotGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class OiArdubotParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(OiArdubotGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, OiArdubotGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getImplementacaoAccess().getAlternatives(), "rule__Implementacao__Alternatives");
			builder.put(grammarAccess.getPortaAccess().getNameAlternatives_0(), "rule__Porta__NameAlternatives_0");
			builder.put(grammarAccess.getAnalogicaOuIdAccess().getAlternatives(), "rule__AnalogicaOuId__Alternatives");
			builder.put(grammarAccess.getDigitalOuIdAccess().getAlternatives(), "rule__DigitalOuId__Alternatives");
			builder.put(grammarAccess.getReceberValorAccess().getTipoAlternatives_0(), "rule__ReceberValor__TipoAlternatives_0");
			builder.put(grammarAccess.getVariavelOuNumeroAccess().getAlternatives(), "rule__VariavelOuNumero__Alternatives");
			builder.put(grammarAccess.getConteudoEscreverAccess().getAlternatives(), "rule__ConteudoEscrever__Alternatives");
			builder.put(grammarAccess.getTextoOuNumeroAccess().getAlternatives(), "rule__TextoOuNumero__Alternatives");
			builder.put(grammarAccess.getValorLiteralAccess().getAlternatives(), "rule__ValorLiteral__Alternatives");
			builder.put(grammarAccess.getVariavelValorAccess().getAlternatives(), "rule__VariavelValor__Alternatives");
			builder.put(grammarAccess.getDisplayValorAccess().getAlternatives(), "rule__DisplayValor__Alternatives");
			builder.put(grammarAccess.getLogicoAccess().getRelationAlternatives_0(), "rule__Logico__RelationAlternatives_0");
			builder.put(grammarAccess.getTipoBipAccess().getAlternatives(), "rule__TipoBip__Alternatives");
			builder.put(grammarAccess.getTipoPortaAccess().getAlternatives(), "rule__TipoPorta__Alternatives");
			builder.put(grammarAccess.getTipoAccess().getAlternatives(), "rule__Tipo__Alternatives");
			builder.put(grammarAccess.getDirecaoAccess().getAlternatives(), "rule__Direcao__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getExistenteVariavelRecebeAccess().getGroup(), "rule__ExistenteVariavelRecebe__Group__0");
			builder.put(grammarAccess.getNovaVariavelRecebeAccess().getGroup(), "rule__NovaVariavelRecebe__Group__0");
			builder.put(grammarAccess.getVariavelNomeAccess().getGroup(), "rule__VariavelNome__Group__0");
			builder.put(grammarAccess.getVariavelAccess().getGroup(), "rule__Variavel__Group__0");
			builder.put(grammarAccess.getVariavelAccess().getGroup_1(), "rule__Variavel__Group_1__0");
			builder.put(grammarAccess.getVariavelExistenteAccess().getGroup(), "rule__VariavelExistente__Group__0");
			builder.put(grammarAccess.getConstanteVariavelAccess().getGroup(), "rule__ConstanteVariavel__Group__0");
			builder.put(grammarAccess.getConstanteAccess().getGroup(), "rule__Constante__Group__0");
			builder.put(grammarAccess.getLerAccess().getGroup(), "rule__Ler__Group__0");
			builder.put(grammarAccess.getFuncaoLerAccess().getGroup(), "rule__FuncaoLer__Group__0");
			builder.put(grammarAccess.getLerDigitalAccess().getGroup(), "rule__LerDigital__Group__0");
			builder.put(grammarAccess.getFuncaoLerDigitalAccess().getGroup(), "rule__FuncaoLerDigital__Group__0");
			builder.put(grammarAccess.getLerAnalogicaAccess().getGroup(), "rule__LerAnalogica__Group__0");
			builder.put(grammarAccess.getFuncaoLerAnalogicaAccess().getGroup(), "rule__FuncaoLerAnalogica__Group__0");
			builder.put(grammarAccess.getEscreverAccess().getGroup(), "rule__Escrever__Group__0");
			builder.put(grammarAccess.getTelaAccess().getGroup(), "rule__Tela__Group__0");
			builder.put(grammarAccess.getBipAccess().getGroup(), "rule__Bip__Group__0");
			builder.put(grammarAccess.getLigarAccess().getGroup(), "rule__Ligar__Group__0");
			builder.put(grammarAccess.getDesligarAccess().getGroup(), "rule__Desligar__Group__0");
			builder.put(grammarAccess.getServoAccess().getGroup(), "rule__Servo__Group__0");
			builder.put(grammarAccess.getMotorDCAccess().getGroup(), "rule__MotorDC__Group__0");
			builder.put(grammarAccess.getAndarAccess().getGroup(), "rule__Andar__Group__0");
			builder.put(grammarAccess.getPararAccess().getGroup(), "rule__Parar__Group__0");
			builder.put(grammarAccess.getParaAccess().getGroup(), "rule__Para__Group__0");
			builder.put(grammarAccess.getEnquantoAccess().getGroup(), "rule__Enquanto__Group__0");
			builder.put(grammarAccess.getRepitaAccess().getGroup(), "rule__Repita__Group__0");
			builder.put(grammarAccess.getSeAccess().getGroup(), "rule__Se__Group__0");
			builder.put(grammarAccess.getSenaoAccess().getGroup(), "rule__Senao__Group__0");
			builder.put(grammarAccess.getEscolhaAccess().getGroup(), "rule__Escolha__Group__0");
			builder.put(grammarAccess.getCasoAccess().getGroup(), "rule__Caso__Group__0");
			builder.put(grammarAccess.getFuncaoAccess().getGroup(), "rule__Funcao__Group__0");
			builder.put(grammarAccess.getFuncaoAccess().getGroup_6(), "rule__Funcao__Group_6__0");
			builder.put(grammarAccess.getParametroAccess().getGroup(), "rule__Parametro__Group__0");
			builder.put(grammarAccess.getEsperaAccess().getGroup(), "rule__Espera__Group__0");
			builder.put(grammarAccess.getSomaAccess().getGroup(), "rule__Soma__Group__0");
			builder.put(grammarAccess.getModelAccess().getVarAssignment_0(), "rule__Model__VarAssignment_0");
			builder.put(grammarAccess.getModelAccess().getVariaveisAssignment_1(), "rule__Model__VariaveisAssignment_1");
			builder.put(grammarAccess.getModelAccess().getConstantesAssignment_2(), "rule__Model__ConstantesAssignment_2");
			builder.put(grammarAccess.getModelAccess().getIniAssignment_3(), "rule__Model__IniAssignment_3");
			builder.put(grammarAccess.getModelAccess().getCodigoAssignment_4(), "rule__Model__CodigoAssignment_4");
			builder.put(grammarAccess.getModelAccess().getFimAssignment_5(), "rule__Model__FimAssignment_5");
			builder.put(grammarAccess.getCodigoAccess().getCodeAssignment(), "rule__Codigo__CodeAssignment");
			builder.put(grammarAccess.getPortaAccess().getNameAssignment(), "rule__Porta__NameAssignment");
			builder.put(grammarAccess.getPortaAnalogicaAccess().getValorAssignment(), "rule__PortaAnalogica__ValorAssignment");
			builder.put(grammarAccess.getPortaDigitalAccess().getValorAssignment(), "rule__PortaDigital__ValorAssignment");
			builder.put(grammarAccess.getReceberValorAccess().getTipoAssignment(), "rule__ReceberValor__TipoAssignment");
			builder.put(grammarAccess.getExistenteVariavelRecebeAccess().getNameAssignment_0(), "rule__ExistenteVariavelRecebe__NameAssignment_0");
			builder.put(grammarAccess.getVariavelNomeAccess().getTipoAssignment_0(), "rule__VariavelNome__TipoAssignment_0");
			builder.put(grammarAccess.getVariavelNomeAccess().getNameAssignment_1(), "rule__VariavelNome__NameAssignment_1");
			builder.put(grammarAccess.getVariavelOuPortaAccess().getNameAssignment(), "rule__VariavelOuPorta__NameAssignment");
			builder.put(grammarAccess.getNomeAccess().getNameAssignment(), "rule__Nome__NameAssignment");
			builder.put(grammarAccess.getTextoAccess().getNameAssignment(), "rule__Texto__NameAssignment");
			builder.put(grammarAccess.getInteiroAccess().getNameAssignment(), "rule__Inteiro__NameAssignment");
			builder.put(grammarAccess.getVariavelAccess().getVariavelNomeAssignment_0(), "rule__Variavel__VariavelNomeAssignment_0");
			builder.put(grammarAccess.getVariavelAccess().getValorAssignment_1_1(), "rule__Variavel__ValorAssignment_1_1");
			builder.put(grammarAccess.getVariavelExistenteAccess().getAtribuicaoAssignment_0(), "rule__VariavelExistente__AtribuicaoAssignment_0");
			builder.put(grammarAccess.getVariavelExistenteAccess().getValorAssignment_1(), "rule__VariavelExistente__ValorAssignment_1");
			builder.put(grammarAccess.getConstanteVariavelAccess().getTipoAssignment_0(), "rule__ConstanteVariavel__TipoAssignment_0");
			builder.put(grammarAccess.getConstanteVariavelAccess().getVariavelNomeAssignment_1(), "rule__ConstanteVariavel__VariavelNomeAssignment_1");
			builder.put(grammarAccess.getConstanteVariavelAccess().getValorAssignment_3(), "rule__ConstanteVariavel__ValorAssignment_3");
			builder.put(grammarAccess.getConstanteAccess().getVariavelAssignment_1(), "rule__Constante__VariavelAssignment_1");
			builder.put(grammarAccess.getControleAccess().getParasAssignment(), "rule__Controle__ParasAssignment");
			builder.put(grammarAccess.getLogicoAccess().getRelationAssignment(), "rule__Logico__RelationAssignment");
			builder.put(grammarAccess.getLerAccess().getAtribuicaoAssignment_0(), "rule__Ler__AtribuicaoAssignment_0");
			builder.put(grammarAccess.getLerAccess().getLerAssignment_1(), "rule__Ler__LerAssignment_1");
			builder.put(grammarAccess.getLerDigitalAccess().getAtribuicaoAssignment_0(), "rule__LerDigital__AtribuicaoAssignment_0");
			builder.put(grammarAccess.getLerDigitalAccess().getLerAssignment_1(), "rule__LerDigital__LerAssignment_1");
			builder.put(grammarAccess.getFuncaoLerDigitalAccess().getPortaAssignment_2(), "rule__FuncaoLerDigital__PortaAssignment_2");
			builder.put(grammarAccess.getLerAnalogicaAccess().getAtribuicaoAssignment_0(), "rule__LerAnalogica__AtribuicaoAssignment_0");
			builder.put(grammarAccess.getLerAnalogicaAccess().getLerAssignment_1(), "rule__LerAnalogica__LerAssignment_1");
			builder.put(grammarAccess.getFuncaoLerAnalogicaAccess().getPortaAssignment_2(), "rule__FuncaoLerAnalogica__PortaAssignment_2");
			builder.put(grammarAccess.getEscreverAccess().getMensagemAssignment_1(), "rule__Escrever__MensagemAssignment_1");
			builder.put(grammarAccess.getTelaAccess().getMensagemAssignment_1(), "rule__Tela__MensagemAssignment_1");
			builder.put(grammarAccess.getBipAccess().getTipoAssignment_2(), "rule__Bip__TipoAssignment_2");
			builder.put(grammarAccess.getLigarAccess().getTipoPortaAssignment_2(), "rule__Ligar__TipoPortaAssignment_2");
			builder.put(grammarAccess.getLigarAccess().getPortaAssignment_4(), "rule__Ligar__PortaAssignment_4");
			builder.put(grammarAccess.getDesligarAccess().getTipoPortaAssignment_2(), "rule__Desligar__TipoPortaAssignment_2");
			builder.put(grammarAccess.getDesligarAccess().getPortaAssignment_4(), "rule__Desligar__PortaAssignment_4");
			builder.put(grammarAccess.getServoAccess().getPortaAssignment_2(), "rule__Servo__PortaAssignment_2");
			builder.put(grammarAccess.getServoAccess().getPosicaoAssignment_4(), "rule__Servo__PosicaoAssignment_4");
			builder.put(grammarAccess.getMotorDCAccess().getEstadoAssignment_2(), "rule__MotorDC__EstadoAssignment_2");
			builder.put(grammarAccess.getMotorDCAccess().getDirecaoAssignment_4(), "rule__MotorDC__DirecaoAssignment_4");
			builder.put(grammarAccess.getAndarAccess().getPortaAssignment_2(), "rule__Andar__PortaAssignment_2");
			builder.put(grammarAccess.getAndarAccess().getVelocidadeAssignment_4(), "rule__Andar__VelocidadeAssignment_4");
			builder.put(grammarAccess.getAndarAccess().getDirecaoAssignment_6(), "rule__Andar__DirecaoAssignment_6");
			builder.put(grammarAccess.getPararAccess().getPortaAssignment_2(), "rule__Parar__PortaAssignment_2");
			builder.put(grammarAccess.getParaAccess().getVariavelAssignment_1(), "rule__Para__VariavelAssignment_1");
			builder.put(grammarAccess.getParaAccess().getDeAssignment_3(), "rule__Para__DeAssignment_3");
			builder.put(grammarAccess.getParaAccess().getAteAssignment_5(), "rule__Para__AteAssignment_5");
			builder.put(grammarAccess.getParaAccess().getCodeAssignment_7(), "rule__Para__CodeAssignment_7");
			builder.put(grammarAccess.getParaAccess().getFimparaAssignment_8(), "rule__Para__FimparaAssignment_8");
			builder.put(grammarAccess.getFimParaAccess().getNameAssignment(), "rule__FimPara__NameAssignment");
			builder.put(grammarAccess.getEnquantoAccess().getValorEsquerdaAssignment_2(), "rule__Enquanto__ValorEsquerdaAssignment_2");
			builder.put(grammarAccess.getEnquantoAccess().getRelacaoAssignment_3(), "rule__Enquanto__RelacaoAssignment_3");
			builder.put(grammarAccess.getEnquantoAccess().getValorDireitaAssignment_4(), "rule__Enquanto__ValorDireitaAssignment_4");
			builder.put(grammarAccess.getEnquantoAccess().getCodeAssignment_7(), "rule__Enquanto__CodeAssignment_7");
			builder.put(grammarAccess.getRepitaAccess().getCodeAssignment_1(), "rule__Repita__CodeAssignment_1");
			builder.put(grammarAccess.getRepitaAccess().getValorEsquerdaAssignment_4(), "rule__Repita__ValorEsquerdaAssignment_4");
			builder.put(grammarAccess.getRepitaAccess().getRelacaoAssignment_5(), "rule__Repita__RelacaoAssignment_5");
			builder.put(grammarAccess.getRepitaAccess().getValorDireitaAssignment_6(), "rule__Repita__ValorDireitaAssignment_6");
			builder.put(grammarAccess.getSeAccess().getValorEsquerdaAssignment_1(), "rule__Se__ValorEsquerdaAssignment_1");
			builder.put(grammarAccess.getSeAccess().getRelacaoAssignment_2(), "rule__Se__RelacaoAssignment_2");
			builder.put(grammarAccess.getSeAccess().getValorDireitaAssignment_3(), "rule__Se__ValorDireitaAssignment_3");
			builder.put(grammarAccess.getSeAccess().getCodeAssignment_5(), "rule__Se__CodeAssignment_5");
			builder.put(grammarAccess.getSeAccess().getSenaoAssignment_6(), "rule__Se__SenaoAssignment_6");
			builder.put(grammarAccess.getSeAccess().getFimseAssignment_7(), "rule__Se__FimseAssignment_7");
			builder.put(grammarAccess.getFimseAccess().getNameAssignment(), "rule__Fimse__NameAssignment");
			builder.put(grammarAccess.getSenaoAccess().getCodeAssignment_1(), "rule__Senao__CodeAssignment_1");
			builder.put(grammarAccess.getEscolhaAccess().getValorAssignment_1(), "rule__Escolha__ValorAssignment_1");
			builder.put(grammarAccess.getEscolhaAccess().getCasosAssignment_2(), "rule__Escolha__CasosAssignment_2");
			builder.put(grammarAccess.getCasoAccess().getValorAssignment_1(), "rule__Caso__ValorAssignment_1");
			builder.put(grammarAccess.getCasoAccess().getCodigoAssignment_3(), "rule__Caso__CodigoAssignment_3");
			builder.put(grammarAccess.getFuncaoAccess().getNameAssignment_1(), "rule__Funcao__NameAssignment_1");
			builder.put(grammarAccess.getFuncaoAccess().getParametroAssignment_2(), "rule__Funcao__ParametroAssignment_2");
			builder.put(grammarAccess.getFuncaoAccess().getTipoAssignment_4(), "rule__Funcao__TipoAssignment_4");
			builder.put(grammarAccess.getFuncaoAccess().getCodigoAssignment_5(), "rule__Funcao__CodigoAssignment_5");
			builder.put(grammarAccess.getFuncaoAccess().getRetornoAssignment_6_1(), "rule__Funcao__RetornoAssignment_6_1");
			builder.put(grammarAccess.getParametroAccess().getValorAssignment_1(), "rule__Parametro__ValorAssignment_1");
			builder.put(grammarAccess.getEsperaAccess().getValorAssignment_2(), "rule__Espera__ValorAssignment_2");
			builder.put(grammarAccess.getSomaAccess().getNameAssignment_0(), "rule__Soma__NameAssignment_0");
			builder.put(grammarAccess.getSomaAccess().getValorEsquerdaAssignment_1(), "rule__Soma__ValorEsquerdaAssignment_1");
			builder.put(grammarAccess.getSomaAccess().getValorDireitaAssignment_3(), "rule__Soma__ValorDireitaAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private OiArdubotGrammarAccess grammarAccess;

	@Override
	protected InternalOiArdubotParser createParser() {
		InternalOiArdubotParser result = new InternalOiArdubotParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OiArdubotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OiArdubotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
