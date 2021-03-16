/*
 * generated by Xtext 2.25.0
 */
grammar InternalOiArduBot;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package br.edu.utfpr.fb.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package br.edu.utfpr.fb.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.edu.utfpr.fb.services.OiArduBotGrammarAccess;

}
@parser::members {
	private OiArduBotGrammarAccess grammarAccess;

	public void setGrammarAccess(OiArduBotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariavel
entryRuleVariavel
:
{ before(grammarAccess.getVariavelRule()); }
	 ruleVariavel
{ after(grammarAccess.getVariavelRule()); } 
	 EOF 
;

// Rule Variavel
ruleVariavel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariavelAccess().getGroup()); }
		(rule__Variavel__Group__0)
		{ after(grammarAccess.getVariavelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePara
entryRulePara
:
{ before(grammarAccess.getParaRule()); }
	 rulePara
{ after(grammarAccess.getParaRule()); } 
	 EOF 
;

// Rule Para
rulePara 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParaAccess().getGroup()); }
		(rule__Para__Group__0)
		{ after(grammarAccess.getParaAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSenao
entryRuleSenao
:
{ before(grammarAccess.getSenaoRule()); }
	 ruleSenao
{ after(grammarAccess.getSenaoRule()); } 
	 EOF 
;

// Rule Senao
ruleSenao 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSenaoAccess().getGroup()); }
		(rule__Senao__Group__0)
		{ after(grammarAccess.getSenaoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSensoriamento
entryRuleSensoriamento
:
{ before(grammarAccess.getSensoriamentoRule()); }
	 ruleSensoriamento
{ after(grammarAccess.getSensoriamentoRule()); } 
	 EOF 
;

// Rule Sensoriamento
ruleSensoriamento 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSensoriamentoAccess().getGroup()); }
		(rule__Sensoriamento__Group__0)
		{ after(grammarAccess.getSensoriamentoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtuacao
entryRuleAtuacao
:
{ before(grammarAccess.getAtuacaoRule()); }
	 ruleAtuacao
{ after(grammarAccess.getAtuacaoRule()); } 
	 EOF 
;

// Rule Atuacao
ruleAtuacao 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtuacaoAccess().getNotificacoesAssignment()); }
		(rule__Atuacao__NotificacoesAssignment)
		{ after(grammarAccess.getAtuacaoAccess().getNotificacoesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNotificacao
entryRuleNotificacao
:
{ before(grammarAccess.getNotificacaoRule()); }
	 ruleNotificacao
{ after(grammarAccess.getNotificacaoRule()); } 
	 EOF 
;

// Rule Notificacao
ruleNotificacao 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNotificacaoAccess().getBeepAssignment()); }
		(rule__Notificacao__BeepAssignment)
		{ after(grammarAccess.getNotificacaoAccess().getBeepAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBeep
entryRuleBeep
:
{ before(grammarAccess.getBeepRule()); }
	 ruleBeep
{ after(grammarAccess.getBeepRule()); } 
	 EOF 
;

// Rule Beep
ruleBeep 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBeepAccess().getGroup()); }
		(rule__Beep__Group__0)
		{ after(grammarAccess.getBeepAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Tipo
ruleTipo
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoAccess().getAlternatives()); }
		(rule__Tipo__Alternatives)
		{ after(grammarAccess.getTipoAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TipoBeep
ruleTipoBeep
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoBeepAccess().getAlternatives()); }
		(rule__TipoBeep__Alternatives)
		{ after(grammarAccess.getTipoBeepAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TipoPorta
ruleTipoPorta
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoPortaAccess().getAlternatives()); }
		(rule__TipoPorta__Alternatives)
		{ after(grammarAccess.getTipoPortaAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tipo__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoAccess().getTextoEnumLiteralDeclaration_0()); }
		('Texto')
		{ after(grammarAccess.getTipoAccess().getTextoEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTipoAccess().getNumeroEnumLiteralDeclaration_1()); }
		('Numero')
		{ after(grammarAccess.getTipoAccess().getNumeroEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TipoBeep__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoBeepAccess().getSimplesEnumLiteralDeclaration_0()); }
		('Simples')
		{ after(grammarAccess.getTipoBeepAccess().getSimplesEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTipoBeepAccess().getDuploEnumLiteralDeclaration_1()); }
		('Duplo')
		{ after(grammarAccess.getTipoBeepAccess().getDuploEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTipoBeepAccess().getLongoEnumLiteralDeclaration_2()); }
		('Longo')
		{ after(grammarAccess.getTipoBeepAccess().getLongoEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TipoPorta__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoPortaAccess().getDigitalEnumLiteralDeclaration_0()); }
		('Digital')
		{ after(grammarAccess.getTipoPortaAccess().getDigitalEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTipoPortaAccess().getAnalogicaEnumLiteralDeclaration_1()); }
		('Analogica')
		{ after(grammarAccess.getTipoPortaAccess().getAnalogicaEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getVarAssignment_0()); }
	(rule__Model__VarAssignment_0)?
	{ after(grammarAccess.getModelAccess().getVarAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getVariaveisAssignment_1()); }
	(rule__Model__VariaveisAssignment_1)*
	{ after(grammarAccess.getModelAccess().getVariaveisAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__2__Impl
	rule__Model__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getIniAssignment_2()); }
	(rule__Model__IniAssignment_2)
	{ after(grammarAccess.getModelAccess().getIniAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getFimAssignment_3()); }
	(rule__Model__FimAssignment_3)
	{ after(grammarAccess.getModelAccess().getFimAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Variavel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variavel__Group__0__Impl
	rule__Variavel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariavelAccess().getTipoAssignment_0()); }
	(rule__Variavel__TipoAssignment_0)
	{ after(grammarAccess.getVariavelAccess().getTipoAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variavel__Group__1__Impl
	rule__Variavel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariavelAccess().getNameAssignment_1()); }
	(rule__Variavel__NameAssignment_1)
	{ after(grammarAccess.getVariavelAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variavel__Group__2__Impl
	rule__Variavel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariavelAccess().getGroup_2()); }
	(rule__Variavel__Group_2__0)?
	{ after(grammarAccess.getVariavelAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variavel__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariavelAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getVariavelAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Variavel__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variavel__Group_2__0__Impl
	rule__Variavel__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariavelAccess().getEqualsSignKeyword_2_0()); }
	'='
	{ after(grammarAccess.getVariavelAccess().getEqualsSignKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variavel__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariavelAccess().getValorAssignment_2_1()); }
	(rule__Variavel__ValorAssignment_2_1)
	{ after(grammarAccess.getVariavelAccess().getValorAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Para__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Para__Group__0__Impl
	rule__Para__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParaAccess().getParaKeyword_0()); }
	'Para'
	{ after(grammarAccess.getParaAccess().getParaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Para__Group__1__Impl
	rule__Para__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParaAccess().getDeKeyword_1()); }
	'de'
	{ after(grammarAccess.getParaAccess().getDeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Para__Group__2__Impl
	rule__Para__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParaAccess().getDeAssignment_2()); }
	(rule__Para__DeAssignment_2)
	{ after(grammarAccess.getParaAccess().getDeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Para__Group__3__Impl
	rule__Para__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParaAccess().getAteKeyword_3()); }
	'ate'
	{ after(grammarAccess.getParaAccess().getAteKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Para__Group__4__Impl
	rule__Para__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParaAccess().getAteAssignment_4()); }
	(rule__Para__AteAssignment_4)
	{ after(grammarAccess.getParaAccess().getAteAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Para__Group__5__Impl
	rule__Para__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParaAccess().getGroup_5()); }
	(rule__Para__Group_5__0)?
	{ after(grammarAccess.getParaAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Para__Group__6__Impl
	rule__Para__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParaAccess().getFacaKeyword_6()); }
	'Faca'
	{ after(grammarAccess.getParaAccess().getFacaKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Para__Group__7__Impl
	rule__Para__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParaAccess().getCodigoParaAssignment_7()); }
	(rule__Para__CodigoParaAssignment_7)
	{ after(grammarAccess.getParaAccess().getCodigoParaAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Para__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParaAccess().getFimParaKeyword_8()); }
	'FimPara'
	{ after(grammarAccess.getParaAccess().getFimParaKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Para__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Para__Group_5__0__Impl
	rule__Para__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParaAccess().getPassoKeyword_5_0()); }
	'passo'
	{ after(grammarAccess.getParaAccess().getPassoKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Para__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParaAccess().getPassoAssignment_5_1()); }
	(rule__Para__PassoAssignment_5_1)
	{ after(grammarAccess.getParaAccess().getPassoAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Senao__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Senao__Group__0__Impl
	rule__Senao__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Senao__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSenaoAccess().getSeNaoKeyword_0()); }
	'SeNao'
	{ after(grammarAccess.getSenaoAccess().getSeNaoKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Senao__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Senao__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Senao__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSenaoAccess().getCodigoSenaoAssignment_1()); }
	(rule__Senao__CodigoSenaoAssignment_1)
	{ after(grammarAccess.getSenaoAccess().getCodigoSenaoAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sensoriamento__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sensoriamento__Group__0__Impl
	rule__Sensoriamento__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSensoriamentoAccess().getSensorAssignment_0()); }
	(rule__Sensoriamento__SensorAssignment_0)
	{ after(grammarAccess.getSensoriamentoAccess().getSensorAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sensoriamento__Group__1__Impl
	rule__Sensoriamento__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSensoriamentoAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getSensoriamentoAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sensoriamento__Group__2__Impl
	rule__Sensoriamento__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSensoriamentoAccess().getLerKeyword_2()); }
	'ler'
	{ after(grammarAccess.getSensoriamentoAccess().getLerKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sensoriamento__Group__3__Impl
	rule__Sensoriamento__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSensoriamentoAccess().getLeftParenthesisKeyword_3()); }
	'('
	{ after(grammarAccess.getSensoriamentoAccess().getLeftParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sensoriamento__Group__4__Impl
	rule__Sensoriamento__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSensoriamentoAccess().getPortaAssignment_4()); }
	(rule__Sensoriamento__PortaAssignment_4)
	{ after(grammarAccess.getSensoriamentoAccess().getPortaAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sensoriamento__Group__5__Impl
	rule__Sensoriamento__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSensoriamentoAccess().getCommaKeyword_5()); }
	','
	{ after(grammarAccess.getSensoriamentoAccess().getCommaKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sensoriamento__Group__6__Impl
	rule__Sensoriamento__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSensoriamentoAccess().getTipoAssignment_6()); }
	(rule__Sensoriamento__TipoAssignment_6)
	{ after(grammarAccess.getSensoriamentoAccess().getTipoAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sensoriamento__Group__7__Impl
	rule__Sensoriamento__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSensoriamentoAccess().getRightParenthesisKeyword_7()); }
	')'
	{ after(grammarAccess.getSensoriamentoAccess().getRightParenthesisKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sensoriamento__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSensoriamentoAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getSensoriamentoAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Beep__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Beep__Group__0__Impl
	rule__Beep__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBeepAccess().getAlertaKeyword_0()); }
	'alerta'
	{ after(grammarAccess.getBeepAccess().getAlertaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Beep__Group__1__Impl
	rule__Beep__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBeepAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getBeepAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Beep__Group__2__Impl
	rule__Beep__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBeepAccess().getBeepKeyword_2()); }
	'beep'
	{ after(grammarAccess.getBeepAccess().getBeepKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Beep__Group__3__Impl
	rule__Beep__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBeepAccess().getCommaKeyword_3()); }
	','
	{ after(grammarAccess.getBeepAccess().getCommaKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Beep__Group__4__Impl
	rule__Beep__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBeepAccess().getTipoAssignment_4()); }
	(rule__Beep__TipoAssignment_4)
	{ after(grammarAccess.getBeepAccess().getTipoAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Beep__Group__5__Impl
	rule__Beep__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBeepAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getBeepAccess().getRightParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Beep__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBeepAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getBeepAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__VarAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getVarVariaveisKeyword_0_0()); }
		(
			{ before(grammarAccess.getModelAccess().getVarVariaveisKeyword_0_0()); }
			'Variaveis'
			{ after(grammarAccess.getModelAccess().getVarVariaveisKeyword_0_0()); }
		)
		{ after(grammarAccess.getModelAccess().getVarVariaveisKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__VariaveisAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getVariaveisVariavelParserRuleCall_1_0()); }
		ruleVariavel
		{ after(grammarAccess.getModelAccess().getVariaveisVariavelParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__IniAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getIniInicioKeyword_2_0()); }
		(
			{ before(grammarAccess.getModelAccess().getIniInicioKeyword_2_0()); }
			'Inicio'
			{ after(grammarAccess.getModelAccess().getIniInicioKeyword_2_0()); }
		)
		{ after(grammarAccess.getModelAccess().getIniInicioKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__FimAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getFimFimKeyword_3_0()); }
		(
			{ before(grammarAccess.getModelAccess().getFimFimKeyword_3_0()); }
			'Fim'
			{ after(grammarAccess.getModelAccess().getFimFimKeyword_3_0()); }
		)
		{ after(grammarAccess.getModelAccess().getFimFimKeyword_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__TipoAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariavelAccess().getTipoTipoEnumRuleCall_0_0()); }
		ruleTipo
		{ after(grammarAccess.getVariavelAccess().getTipoTipoEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariavelAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVariavelAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variavel__ValorAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariavelAccess().getValorSTRINGTerminalRuleCall_2_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getVariavelAccess().getValorSTRINGTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__DeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParaAccess().getDeINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getParaAccess().getDeINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__AteAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParaAccess().getAteINTTerminalRuleCall_4_0()); }
		RULE_INT
		{ after(grammarAccess.getParaAccess().getAteINTTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__PassoAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParaAccess().getPassoINTTerminalRuleCall_5_1_0()); }
		RULE_INT
		{ after(grammarAccess.getParaAccess().getPassoINTTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Para__CodigoParaAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParaAccess().getCodigoParaSTRINGTerminalRuleCall_7_0()); }
		RULE_STRING
		{ after(grammarAccess.getParaAccess().getCodigoParaSTRINGTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Senao__CodigoSenaoAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSenaoAccess().getCodigoSenaoSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getSenaoAccess().getCodigoSenaoSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__SensorAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSensoriamentoAccess().getSensorVariavelCrossReference_0_0()); }
		(
			{ before(grammarAccess.getSensoriamentoAccess().getSensorVariavelIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSensoriamentoAccess().getSensorVariavelIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getSensoriamentoAccess().getSensorVariavelCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__PortaAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSensoriamentoAccess().getPortaINTTerminalRuleCall_4_0()); }
		RULE_INT
		{ after(grammarAccess.getSensoriamentoAccess().getPortaINTTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sensoriamento__TipoAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSensoriamentoAccess().getTipoTipoPortaEnumRuleCall_6_0()); }
		ruleTipoPorta
		{ after(grammarAccess.getSensoriamentoAccess().getTipoTipoPortaEnumRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atuacao__NotificacoesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtuacaoAccess().getNotificacoesNotificacaoParserRuleCall_0()); }
		ruleNotificacao
		{ after(grammarAccess.getAtuacaoAccess().getNotificacoesNotificacaoParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Notificacao__BeepAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNotificacaoAccess().getBeepBeepParserRuleCall_0()); }
		ruleBeep
		{ after(grammarAccess.getNotificacaoAccess().getBeepBeepParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Beep__TipoAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBeepAccess().getTipoTipoBeepEnumRuleCall_4_0()); }
		ruleTipoBeep
		{ after(grammarAccess.getBeepAccess().getTipoTipoBeepEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
