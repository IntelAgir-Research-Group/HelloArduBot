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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOiArduBotParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Texto'", "'Numero'", "'Simples'", "'Duplo'", "'Longo'", "'Digital'", "'Analogica'", "';'", "'='", "'Para'", "'de'", "'ate'", "'Faca'", "'FimPara'", "'passo'", "'SeNao'", "'ler'", "'('", "','", "')'", "'alerta'", "'beep'", "'Variaveis'", "'Inicio'", "'Fim'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalOiArduBotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOiArduBotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOiArduBotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOiArduBot.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalOiArduBot.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalOiArduBot.g:54:1: ( ruleModel EOF )
            // InternalOiArduBot.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOiArduBot.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalOiArduBot.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalOiArduBot.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalOiArduBot.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalOiArduBot.g:69:3: ( rule__Model__Group__0 )
            // InternalOiArduBot.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVariavel"
    // InternalOiArduBot.g:78:1: entryRuleVariavel : ruleVariavel EOF ;
    public final void entryRuleVariavel() throws RecognitionException {
        try {
            // InternalOiArduBot.g:79:1: ( ruleVariavel EOF )
            // InternalOiArduBot.g:80:1: ruleVariavel EOF
            {
             before(grammarAccess.getVariavelRule()); 
            pushFollow(FOLLOW_1);
            ruleVariavel();

            state._fsp--;

             after(grammarAccess.getVariavelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariavel"


    // $ANTLR start "ruleVariavel"
    // InternalOiArduBot.g:87:1: ruleVariavel : ( ( rule__Variavel__Group__0 ) ) ;
    public final void ruleVariavel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:91:2: ( ( ( rule__Variavel__Group__0 ) ) )
            // InternalOiArduBot.g:92:2: ( ( rule__Variavel__Group__0 ) )
            {
            // InternalOiArduBot.g:92:2: ( ( rule__Variavel__Group__0 ) )
            // InternalOiArduBot.g:93:3: ( rule__Variavel__Group__0 )
            {
             before(grammarAccess.getVariavelAccess().getGroup()); 
            // InternalOiArduBot.g:94:3: ( rule__Variavel__Group__0 )
            // InternalOiArduBot.g:94:4: rule__Variavel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariavelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariavel"


    // $ANTLR start "entryRulePara"
    // InternalOiArduBot.g:103:1: entryRulePara : rulePara EOF ;
    public final void entryRulePara() throws RecognitionException {
        try {
            // InternalOiArduBot.g:104:1: ( rulePara EOF )
            // InternalOiArduBot.g:105:1: rulePara EOF
            {
             before(grammarAccess.getParaRule()); 
            pushFollow(FOLLOW_1);
            rulePara();

            state._fsp--;

             after(grammarAccess.getParaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePara"


    // $ANTLR start "rulePara"
    // InternalOiArduBot.g:112:1: rulePara : ( ( rule__Para__Group__0 ) ) ;
    public final void rulePara() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:116:2: ( ( ( rule__Para__Group__0 ) ) )
            // InternalOiArduBot.g:117:2: ( ( rule__Para__Group__0 ) )
            {
            // InternalOiArduBot.g:117:2: ( ( rule__Para__Group__0 ) )
            // InternalOiArduBot.g:118:3: ( rule__Para__Group__0 )
            {
             before(grammarAccess.getParaAccess().getGroup()); 
            // InternalOiArduBot.g:119:3: ( rule__Para__Group__0 )
            // InternalOiArduBot.g:119:4: rule__Para__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Para__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePara"


    // $ANTLR start "entryRuleSenao"
    // InternalOiArduBot.g:128:1: entryRuleSenao : ruleSenao EOF ;
    public final void entryRuleSenao() throws RecognitionException {
        try {
            // InternalOiArduBot.g:129:1: ( ruleSenao EOF )
            // InternalOiArduBot.g:130:1: ruleSenao EOF
            {
             before(grammarAccess.getSenaoRule()); 
            pushFollow(FOLLOW_1);
            ruleSenao();

            state._fsp--;

             after(grammarAccess.getSenaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSenao"


    // $ANTLR start "ruleSenao"
    // InternalOiArduBot.g:137:1: ruleSenao : ( ( rule__Senao__Group__0 ) ) ;
    public final void ruleSenao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:141:2: ( ( ( rule__Senao__Group__0 ) ) )
            // InternalOiArduBot.g:142:2: ( ( rule__Senao__Group__0 ) )
            {
            // InternalOiArduBot.g:142:2: ( ( rule__Senao__Group__0 ) )
            // InternalOiArduBot.g:143:3: ( rule__Senao__Group__0 )
            {
             before(grammarAccess.getSenaoAccess().getGroup()); 
            // InternalOiArduBot.g:144:3: ( rule__Senao__Group__0 )
            // InternalOiArduBot.g:144:4: rule__Senao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Senao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSenaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSenao"


    // $ANTLR start "entryRuleSensoriamento"
    // InternalOiArduBot.g:153:1: entryRuleSensoriamento : ruleSensoriamento EOF ;
    public final void entryRuleSensoriamento() throws RecognitionException {
        try {
            // InternalOiArduBot.g:154:1: ( ruleSensoriamento EOF )
            // InternalOiArduBot.g:155:1: ruleSensoriamento EOF
            {
             before(grammarAccess.getSensoriamentoRule()); 
            pushFollow(FOLLOW_1);
            ruleSensoriamento();

            state._fsp--;

             after(grammarAccess.getSensoriamentoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensoriamento"


    // $ANTLR start "ruleSensoriamento"
    // InternalOiArduBot.g:162:1: ruleSensoriamento : ( ( rule__Sensoriamento__Group__0 ) ) ;
    public final void ruleSensoriamento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:166:2: ( ( ( rule__Sensoriamento__Group__0 ) ) )
            // InternalOiArduBot.g:167:2: ( ( rule__Sensoriamento__Group__0 ) )
            {
            // InternalOiArduBot.g:167:2: ( ( rule__Sensoriamento__Group__0 ) )
            // InternalOiArduBot.g:168:3: ( rule__Sensoriamento__Group__0 )
            {
             before(grammarAccess.getSensoriamentoAccess().getGroup()); 
            // InternalOiArduBot.g:169:3: ( rule__Sensoriamento__Group__0 )
            // InternalOiArduBot.g:169:4: rule__Sensoriamento__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensoriamento__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensoriamentoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensoriamento"


    // $ANTLR start "entryRuleAtuacao"
    // InternalOiArduBot.g:178:1: entryRuleAtuacao : ruleAtuacao EOF ;
    public final void entryRuleAtuacao() throws RecognitionException {
        try {
            // InternalOiArduBot.g:179:1: ( ruleAtuacao EOF )
            // InternalOiArduBot.g:180:1: ruleAtuacao EOF
            {
             before(grammarAccess.getAtuacaoRule()); 
            pushFollow(FOLLOW_1);
            ruleAtuacao();

            state._fsp--;

             after(grammarAccess.getAtuacaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtuacao"


    // $ANTLR start "ruleAtuacao"
    // InternalOiArduBot.g:187:1: ruleAtuacao : ( ( rule__Atuacao__NotificacoesAssignment ) ) ;
    public final void ruleAtuacao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:191:2: ( ( ( rule__Atuacao__NotificacoesAssignment ) ) )
            // InternalOiArduBot.g:192:2: ( ( rule__Atuacao__NotificacoesAssignment ) )
            {
            // InternalOiArduBot.g:192:2: ( ( rule__Atuacao__NotificacoesAssignment ) )
            // InternalOiArduBot.g:193:3: ( rule__Atuacao__NotificacoesAssignment )
            {
             before(grammarAccess.getAtuacaoAccess().getNotificacoesAssignment()); 
            // InternalOiArduBot.g:194:3: ( rule__Atuacao__NotificacoesAssignment )
            // InternalOiArduBot.g:194:4: rule__Atuacao__NotificacoesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Atuacao__NotificacoesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAtuacaoAccess().getNotificacoesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtuacao"


    // $ANTLR start "entryRuleNotificacao"
    // InternalOiArduBot.g:203:1: entryRuleNotificacao : ruleNotificacao EOF ;
    public final void entryRuleNotificacao() throws RecognitionException {
        try {
            // InternalOiArduBot.g:204:1: ( ruleNotificacao EOF )
            // InternalOiArduBot.g:205:1: ruleNotificacao EOF
            {
             before(grammarAccess.getNotificacaoRule()); 
            pushFollow(FOLLOW_1);
            ruleNotificacao();

            state._fsp--;

             after(grammarAccess.getNotificacaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotificacao"


    // $ANTLR start "ruleNotificacao"
    // InternalOiArduBot.g:212:1: ruleNotificacao : ( ( rule__Notificacao__BeepAssignment ) ) ;
    public final void ruleNotificacao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:216:2: ( ( ( rule__Notificacao__BeepAssignment ) ) )
            // InternalOiArduBot.g:217:2: ( ( rule__Notificacao__BeepAssignment ) )
            {
            // InternalOiArduBot.g:217:2: ( ( rule__Notificacao__BeepAssignment ) )
            // InternalOiArduBot.g:218:3: ( rule__Notificacao__BeepAssignment )
            {
             before(grammarAccess.getNotificacaoAccess().getBeepAssignment()); 
            // InternalOiArduBot.g:219:3: ( rule__Notificacao__BeepAssignment )
            // InternalOiArduBot.g:219:4: rule__Notificacao__BeepAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Notificacao__BeepAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNotificacaoAccess().getBeepAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotificacao"


    // $ANTLR start "entryRuleBeep"
    // InternalOiArduBot.g:228:1: entryRuleBeep : ruleBeep EOF ;
    public final void entryRuleBeep() throws RecognitionException {
        try {
            // InternalOiArduBot.g:229:1: ( ruleBeep EOF )
            // InternalOiArduBot.g:230:1: ruleBeep EOF
            {
             before(grammarAccess.getBeepRule()); 
            pushFollow(FOLLOW_1);
            ruleBeep();

            state._fsp--;

             after(grammarAccess.getBeepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBeep"


    // $ANTLR start "ruleBeep"
    // InternalOiArduBot.g:237:1: ruleBeep : ( ( rule__Beep__Group__0 ) ) ;
    public final void ruleBeep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:241:2: ( ( ( rule__Beep__Group__0 ) ) )
            // InternalOiArduBot.g:242:2: ( ( rule__Beep__Group__0 ) )
            {
            // InternalOiArduBot.g:242:2: ( ( rule__Beep__Group__0 ) )
            // InternalOiArduBot.g:243:3: ( rule__Beep__Group__0 )
            {
             before(grammarAccess.getBeepAccess().getGroup()); 
            // InternalOiArduBot.g:244:3: ( rule__Beep__Group__0 )
            // InternalOiArduBot.g:244:4: rule__Beep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Beep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBeep"


    // $ANTLR start "ruleTipo"
    // InternalOiArduBot.g:253:1: ruleTipo : ( ( rule__Tipo__Alternatives ) ) ;
    public final void ruleTipo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:257:1: ( ( ( rule__Tipo__Alternatives ) ) )
            // InternalOiArduBot.g:258:2: ( ( rule__Tipo__Alternatives ) )
            {
            // InternalOiArduBot.g:258:2: ( ( rule__Tipo__Alternatives ) )
            // InternalOiArduBot.g:259:3: ( rule__Tipo__Alternatives )
            {
             before(grammarAccess.getTipoAccess().getAlternatives()); 
            // InternalOiArduBot.g:260:3: ( rule__Tipo__Alternatives )
            // InternalOiArduBot.g:260:4: rule__Tipo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Tipo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipo"


    // $ANTLR start "ruleTipoBeep"
    // InternalOiArduBot.g:269:1: ruleTipoBeep : ( ( rule__TipoBeep__Alternatives ) ) ;
    public final void ruleTipoBeep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:273:1: ( ( ( rule__TipoBeep__Alternatives ) ) )
            // InternalOiArduBot.g:274:2: ( ( rule__TipoBeep__Alternatives ) )
            {
            // InternalOiArduBot.g:274:2: ( ( rule__TipoBeep__Alternatives ) )
            // InternalOiArduBot.g:275:3: ( rule__TipoBeep__Alternatives )
            {
             before(grammarAccess.getTipoBeepAccess().getAlternatives()); 
            // InternalOiArduBot.g:276:3: ( rule__TipoBeep__Alternatives )
            // InternalOiArduBot.g:276:4: rule__TipoBeep__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoBeep__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoBeepAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoBeep"


    // $ANTLR start "ruleTipoPorta"
    // InternalOiArduBot.g:285:1: ruleTipoPorta : ( ( rule__TipoPorta__Alternatives ) ) ;
    public final void ruleTipoPorta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:289:1: ( ( ( rule__TipoPorta__Alternatives ) ) )
            // InternalOiArduBot.g:290:2: ( ( rule__TipoPorta__Alternatives ) )
            {
            // InternalOiArduBot.g:290:2: ( ( rule__TipoPorta__Alternatives ) )
            // InternalOiArduBot.g:291:3: ( rule__TipoPorta__Alternatives )
            {
             before(grammarAccess.getTipoPortaAccess().getAlternatives()); 
            // InternalOiArduBot.g:292:3: ( rule__TipoPorta__Alternatives )
            // InternalOiArduBot.g:292:4: rule__TipoPorta__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoPorta__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoPortaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoPorta"


    // $ANTLR start "rule__Tipo__Alternatives"
    // InternalOiArduBot.g:300:1: rule__Tipo__Alternatives : ( ( ( 'Texto' ) ) | ( ( 'Numero' ) ) );
    public final void rule__Tipo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:304:1: ( ( ( 'Texto' ) ) | ( ( 'Numero' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOiArduBot.g:305:2: ( ( 'Texto' ) )
                    {
                    // InternalOiArduBot.g:305:2: ( ( 'Texto' ) )
                    // InternalOiArduBot.g:306:3: ( 'Texto' )
                    {
                     before(grammarAccess.getTipoAccess().getTextoEnumLiteralDeclaration_0()); 
                    // InternalOiArduBot.g:307:3: ( 'Texto' )
                    // InternalOiArduBot.g:307:4: 'Texto'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getTextoEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArduBot.g:311:2: ( ( 'Numero' ) )
                    {
                    // InternalOiArduBot.g:311:2: ( ( 'Numero' ) )
                    // InternalOiArduBot.g:312:3: ( 'Numero' )
                    {
                     before(grammarAccess.getTipoAccess().getNumeroEnumLiteralDeclaration_1()); 
                    // InternalOiArduBot.g:313:3: ( 'Numero' )
                    // InternalOiArduBot.g:313:4: 'Numero'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getNumeroEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tipo__Alternatives"


    // $ANTLR start "rule__TipoBeep__Alternatives"
    // InternalOiArduBot.g:321:1: rule__TipoBeep__Alternatives : ( ( ( 'Simples' ) ) | ( ( 'Duplo' ) ) | ( ( 'Longo' ) ) );
    public final void rule__TipoBeep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:325:1: ( ( ( 'Simples' ) ) | ( ( 'Duplo' ) ) | ( ( 'Longo' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOiArduBot.g:326:2: ( ( 'Simples' ) )
                    {
                    // InternalOiArduBot.g:326:2: ( ( 'Simples' ) )
                    // InternalOiArduBot.g:327:3: ( 'Simples' )
                    {
                     before(grammarAccess.getTipoBeepAccess().getSimplesEnumLiteralDeclaration_0()); 
                    // InternalOiArduBot.g:328:3: ( 'Simples' )
                    // InternalOiArduBot.g:328:4: 'Simples'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoBeepAccess().getSimplesEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArduBot.g:332:2: ( ( 'Duplo' ) )
                    {
                    // InternalOiArduBot.g:332:2: ( ( 'Duplo' ) )
                    // InternalOiArduBot.g:333:3: ( 'Duplo' )
                    {
                     before(grammarAccess.getTipoBeepAccess().getDuploEnumLiteralDeclaration_1()); 
                    // InternalOiArduBot.g:334:3: ( 'Duplo' )
                    // InternalOiArduBot.g:334:4: 'Duplo'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoBeepAccess().getDuploEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOiArduBot.g:338:2: ( ( 'Longo' ) )
                    {
                    // InternalOiArduBot.g:338:2: ( ( 'Longo' ) )
                    // InternalOiArduBot.g:339:3: ( 'Longo' )
                    {
                     before(grammarAccess.getTipoBeepAccess().getLongoEnumLiteralDeclaration_2()); 
                    // InternalOiArduBot.g:340:3: ( 'Longo' )
                    // InternalOiArduBot.g:340:4: 'Longo'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoBeepAccess().getLongoEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoBeep__Alternatives"


    // $ANTLR start "rule__TipoPorta__Alternatives"
    // InternalOiArduBot.g:348:1: rule__TipoPorta__Alternatives : ( ( ( 'Digital' ) ) | ( ( 'Analogica' ) ) );
    public final void rule__TipoPorta__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:352:1: ( ( ( 'Digital' ) ) | ( ( 'Analogica' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOiArduBot.g:353:2: ( ( 'Digital' ) )
                    {
                    // InternalOiArduBot.g:353:2: ( ( 'Digital' ) )
                    // InternalOiArduBot.g:354:3: ( 'Digital' )
                    {
                     before(grammarAccess.getTipoPortaAccess().getDigitalEnumLiteralDeclaration_0()); 
                    // InternalOiArduBot.g:355:3: ( 'Digital' )
                    // InternalOiArduBot.g:355:4: 'Digital'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoPortaAccess().getDigitalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArduBot.g:359:2: ( ( 'Analogica' ) )
                    {
                    // InternalOiArduBot.g:359:2: ( ( 'Analogica' ) )
                    // InternalOiArduBot.g:360:3: ( 'Analogica' )
                    {
                     before(grammarAccess.getTipoPortaAccess().getAnalogicaEnumLiteralDeclaration_1()); 
                    // InternalOiArduBot.g:361:3: ( 'Analogica' )
                    // InternalOiArduBot.g:361:4: 'Analogica'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoPortaAccess().getAnalogicaEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoPorta__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalOiArduBot.g:369:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:373:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOiArduBot.g:374:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalOiArduBot.g:381:1: rule__Model__Group__0__Impl : ( ( rule__Model__VarAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:385:1: ( ( ( rule__Model__VarAssignment_0 )? ) )
            // InternalOiArduBot.g:386:1: ( ( rule__Model__VarAssignment_0 )? )
            {
            // InternalOiArduBot.g:386:1: ( ( rule__Model__VarAssignment_0 )? )
            // InternalOiArduBot.g:387:2: ( rule__Model__VarAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getVarAssignment_0()); 
            // InternalOiArduBot.g:388:2: ( rule__Model__VarAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOiArduBot.g:388:3: rule__Model__VarAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__VarAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalOiArduBot.g:396:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:400:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOiArduBot.g:401:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalOiArduBot.g:408:1: rule__Model__Group__1__Impl : ( ( rule__Model__VariaveisAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:412:1: ( ( ( rule__Model__VariaveisAssignment_1 )* ) )
            // InternalOiArduBot.g:413:1: ( ( rule__Model__VariaveisAssignment_1 )* )
            {
            // InternalOiArduBot.g:413:1: ( ( rule__Model__VariaveisAssignment_1 )* )
            // InternalOiArduBot.g:414:2: ( rule__Model__VariaveisAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getVariaveisAssignment_1()); 
            // InternalOiArduBot.g:415:2: ( rule__Model__VariaveisAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=11 && LA5_0<=12)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOiArduBot.g:415:3: rule__Model__VariaveisAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__VariaveisAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVariaveisAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalOiArduBot.g:423:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:427:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOiArduBot.g:428:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalOiArduBot.g:435:1: rule__Model__Group__2__Impl : ( ( rule__Model__IniAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:439:1: ( ( ( rule__Model__IniAssignment_2 ) ) )
            // InternalOiArduBot.g:440:1: ( ( rule__Model__IniAssignment_2 ) )
            {
            // InternalOiArduBot.g:440:1: ( ( rule__Model__IniAssignment_2 ) )
            // InternalOiArduBot.g:441:2: ( rule__Model__IniAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getIniAssignment_2()); 
            // InternalOiArduBot.g:442:2: ( rule__Model__IniAssignment_2 )
            // InternalOiArduBot.g:442:3: rule__Model__IniAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__IniAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getIniAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalOiArduBot.g:450:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:454:1: ( rule__Model__Group__3__Impl )
            // InternalOiArduBot.g:455:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalOiArduBot.g:461:1: rule__Model__Group__3__Impl : ( ( rule__Model__FimAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:465:1: ( ( ( rule__Model__FimAssignment_3 ) ) )
            // InternalOiArduBot.g:466:1: ( ( rule__Model__FimAssignment_3 ) )
            {
            // InternalOiArduBot.g:466:1: ( ( rule__Model__FimAssignment_3 ) )
            // InternalOiArduBot.g:467:2: ( rule__Model__FimAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getFimAssignment_3()); 
            // InternalOiArduBot.g:468:2: ( rule__Model__FimAssignment_3 )
            // InternalOiArduBot.g:468:3: rule__Model__FimAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__FimAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFimAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Variavel__Group__0"
    // InternalOiArduBot.g:477:1: rule__Variavel__Group__0 : rule__Variavel__Group__0__Impl rule__Variavel__Group__1 ;
    public final void rule__Variavel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:481:1: ( rule__Variavel__Group__0__Impl rule__Variavel__Group__1 )
            // InternalOiArduBot.g:482:2: rule__Variavel__Group__0__Impl rule__Variavel__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Variavel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variavel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__0"


    // $ANTLR start "rule__Variavel__Group__0__Impl"
    // InternalOiArduBot.g:489:1: rule__Variavel__Group__0__Impl : ( ( rule__Variavel__TipoAssignment_0 ) ) ;
    public final void rule__Variavel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:493:1: ( ( ( rule__Variavel__TipoAssignment_0 ) ) )
            // InternalOiArduBot.g:494:1: ( ( rule__Variavel__TipoAssignment_0 ) )
            {
            // InternalOiArduBot.g:494:1: ( ( rule__Variavel__TipoAssignment_0 ) )
            // InternalOiArduBot.g:495:2: ( rule__Variavel__TipoAssignment_0 )
            {
             before(grammarAccess.getVariavelAccess().getTipoAssignment_0()); 
            // InternalOiArduBot.g:496:2: ( rule__Variavel__TipoAssignment_0 )
            // InternalOiArduBot.g:496:3: rule__Variavel__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariavelAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__0__Impl"


    // $ANTLR start "rule__Variavel__Group__1"
    // InternalOiArduBot.g:504:1: rule__Variavel__Group__1 : rule__Variavel__Group__1__Impl rule__Variavel__Group__2 ;
    public final void rule__Variavel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:508:1: ( rule__Variavel__Group__1__Impl rule__Variavel__Group__2 )
            // InternalOiArduBot.g:509:2: rule__Variavel__Group__1__Impl rule__Variavel__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Variavel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variavel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__1"


    // $ANTLR start "rule__Variavel__Group__1__Impl"
    // InternalOiArduBot.g:516:1: rule__Variavel__Group__1__Impl : ( ( rule__Variavel__NameAssignment_1 ) ) ;
    public final void rule__Variavel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:520:1: ( ( ( rule__Variavel__NameAssignment_1 ) ) )
            // InternalOiArduBot.g:521:1: ( ( rule__Variavel__NameAssignment_1 ) )
            {
            // InternalOiArduBot.g:521:1: ( ( rule__Variavel__NameAssignment_1 ) )
            // InternalOiArduBot.g:522:2: ( rule__Variavel__NameAssignment_1 )
            {
             before(grammarAccess.getVariavelAccess().getNameAssignment_1()); 
            // InternalOiArduBot.g:523:2: ( rule__Variavel__NameAssignment_1 )
            // InternalOiArduBot.g:523:3: rule__Variavel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariavelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__1__Impl"


    // $ANTLR start "rule__Variavel__Group__2"
    // InternalOiArduBot.g:531:1: rule__Variavel__Group__2 : rule__Variavel__Group__2__Impl rule__Variavel__Group__3 ;
    public final void rule__Variavel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:535:1: ( rule__Variavel__Group__2__Impl rule__Variavel__Group__3 )
            // InternalOiArduBot.g:536:2: rule__Variavel__Group__2__Impl rule__Variavel__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Variavel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variavel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__2"


    // $ANTLR start "rule__Variavel__Group__2__Impl"
    // InternalOiArduBot.g:543:1: rule__Variavel__Group__2__Impl : ( ( rule__Variavel__Group_2__0 )? ) ;
    public final void rule__Variavel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:547:1: ( ( ( rule__Variavel__Group_2__0 )? ) )
            // InternalOiArduBot.g:548:1: ( ( rule__Variavel__Group_2__0 )? )
            {
            // InternalOiArduBot.g:548:1: ( ( rule__Variavel__Group_2__0 )? )
            // InternalOiArduBot.g:549:2: ( rule__Variavel__Group_2__0 )?
            {
             before(grammarAccess.getVariavelAccess().getGroup_2()); 
            // InternalOiArduBot.g:550:2: ( rule__Variavel__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOiArduBot.g:550:3: rule__Variavel__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variavel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariavelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__2__Impl"


    // $ANTLR start "rule__Variavel__Group__3"
    // InternalOiArduBot.g:558:1: rule__Variavel__Group__3 : rule__Variavel__Group__3__Impl ;
    public final void rule__Variavel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:562:1: ( rule__Variavel__Group__3__Impl )
            // InternalOiArduBot.g:563:2: rule__Variavel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__3"


    // $ANTLR start "rule__Variavel__Group__3__Impl"
    // InternalOiArduBot.g:569:1: rule__Variavel__Group__3__Impl : ( ';' ) ;
    public final void rule__Variavel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:573:1: ( ( ';' ) )
            // InternalOiArduBot.g:574:1: ( ';' )
            {
            // InternalOiArduBot.g:574:1: ( ';' )
            // InternalOiArduBot.g:575:2: ';'
            {
             before(grammarAccess.getVariavelAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVariavelAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__3__Impl"


    // $ANTLR start "rule__Variavel__Group_2__0"
    // InternalOiArduBot.g:585:1: rule__Variavel__Group_2__0 : rule__Variavel__Group_2__0__Impl rule__Variavel__Group_2__1 ;
    public final void rule__Variavel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:589:1: ( rule__Variavel__Group_2__0__Impl rule__Variavel__Group_2__1 )
            // InternalOiArduBot.g:590:2: rule__Variavel__Group_2__0__Impl rule__Variavel__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Variavel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variavel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group_2__0"


    // $ANTLR start "rule__Variavel__Group_2__0__Impl"
    // InternalOiArduBot.g:597:1: rule__Variavel__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Variavel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:601:1: ( ( '=' ) )
            // InternalOiArduBot.g:602:1: ( '=' )
            {
            // InternalOiArduBot.g:602:1: ( '=' )
            // InternalOiArduBot.g:603:2: '='
            {
             before(grammarAccess.getVariavelAccess().getEqualsSignKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVariavelAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group_2__0__Impl"


    // $ANTLR start "rule__Variavel__Group_2__1"
    // InternalOiArduBot.g:612:1: rule__Variavel__Group_2__1 : rule__Variavel__Group_2__1__Impl ;
    public final void rule__Variavel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:616:1: ( rule__Variavel__Group_2__1__Impl )
            // InternalOiArduBot.g:617:2: rule__Variavel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group_2__1"


    // $ANTLR start "rule__Variavel__Group_2__1__Impl"
    // InternalOiArduBot.g:623:1: rule__Variavel__Group_2__1__Impl : ( ( rule__Variavel__ValorAssignment_2_1 ) ) ;
    public final void rule__Variavel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:627:1: ( ( ( rule__Variavel__ValorAssignment_2_1 ) ) )
            // InternalOiArduBot.g:628:1: ( ( rule__Variavel__ValorAssignment_2_1 ) )
            {
            // InternalOiArduBot.g:628:1: ( ( rule__Variavel__ValorAssignment_2_1 ) )
            // InternalOiArduBot.g:629:2: ( rule__Variavel__ValorAssignment_2_1 )
            {
             before(grammarAccess.getVariavelAccess().getValorAssignment_2_1()); 
            // InternalOiArduBot.g:630:2: ( rule__Variavel__ValorAssignment_2_1 )
            // InternalOiArduBot.g:630:3: rule__Variavel__ValorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__ValorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariavelAccess().getValorAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group_2__1__Impl"


    // $ANTLR start "rule__Para__Group__0"
    // InternalOiArduBot.g:639:1: rule__Para__Group__0 : rule__Para__Group__0__Impl rule__Para__Group__1 ;
    public final void rule__Para__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:643:1: ( rule__Para__Group__0__Impl rule__Para__Group__1 )
            // InternalOiArduBot.g:644:2: rule__Para__Group__0__Impl rule__Para__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Para__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Para__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__0"


    // $ANTLR start "rule__Para__Group__0__Impl"
    // InternalOiArduBot.g:651:1: rule__Para__Group__0__Impl : ( 'Para' ) ;
    public final void rule__Para__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:655:1: ( ( 'Para' ) )
            // InternalOiArduBot.g:656:1: ( 'Para' )
            {
            // InternalOiArduBot.g:656:1: ( 'Para' )
            // InternalOiArduBot.g:657:2: 'Para'
            {
             before(grammarAccess.getParaAccess().getParaKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getParaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__0__Impl"


    // $ANTLR start "rule__Para__Group__1"
    // InternalOiArduBot.g:666:1: rule__Para__Group__1 : rule__Para__Group__1__Impl rule__Para__Group__2 ;
    public final void rule__Para__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:670:1: ( rule__Para__Group__1__Impl rule__Para__Group__2 )
            // InternalOiArduBot.g:671:2: rule__Para__Group__1__Impl rule__Para__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Para__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Para__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__1"


    // $ANTLR start "rule__Para__Group__1__Impl"
    // InternalOiArduBot.g:678:1: rule__Para__Group__1__Impl : ( 'de' ) ;
    public final void rule__Para__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:682:1: ( ( 'de' ) )
            // InternalOiArduBot.g:683:1: ( 'de' )
            {
            // InternalOiArduBot.g:683:1: ( 'de' )
            // InternalOiArduBot.g:684:2: 'de'
            {
             before(grammarAccess.getParaAccess().getDeKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getDeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__1__Impl"


    // $ANTLR start "rule__Para__Group__2"
    // InternalOiArduBot.g:693:1: rule__Para__Group__2 : rule__Para__Group__2__Impl rule__Para__Group__3 ;
    public final void rule__Para__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:697:1: ( rule__Para__Group__2__Impl rule__Para__Group__3 )
            // InternalOiArduBot.g:698:2: rule__Para__Group__2__Impl rule__Para__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Para__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Para__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__2"


    // $ANTLR start "rule__Para__Group__2__Impl"
    // InternalOiArduBot.g:705:1: rule__Para__Group__2__Impl : ( ( rule__Para__DeAssignment_2 ) ) ;
    public final void rule__Para__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:709:1: ( ( ( rule__Para__DeAssignment_2 ) ) )
            // InternalOiArduBot.g:710:1: ( ( rule__Para__DeAssignment_2 ) )
            {
            // InternalOiArduBot.g:710:1: ( ( rule__Para__DeAssignment_2 ) )
            // InternalOiArduBot.g:711:2: ( rule__Para__DeAssignment_2 )
            {
             before(grammarAccess.getParaAccess().getDeAssignment_2()); 
            // InternalOiArduBot.g:712:2: ( rule__Para__DeAssignment_2 )
            // InternalOiArduBot.g:712:3: rule__Para__DeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Para__DeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParaAccess().getDeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__2__Impl"


    // $ANTLR start "rule__Para__Group__3"
    // InternalOiArduBot.g:720:1: rule__Para__Group__3 : rule__Para__Group__3__Impl rule__Para__Group__4 ;
    public final void rule__Para__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:724:1: ( rule__Para__Group__3__Impl rule__Para__Group__4 )
            // InternalOiArduBot.g:725:2: rule__Para__Group__3__Impl rule__Para__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Para__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Para__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__3"


    // $ANTLR start "rule__Para__Group__3__Impl"
    // InternalOiArduBot.g:732:1: rule__Para__Group__3__Impl : ( 'ate' ) ;
    public final void rule__Para__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:736:1: ( ( 'ate' ) )
            // InternalOiArduBot.g:737:1: ( 'ate' )
            {
            // InternalOiArduBot.g:737:1: ( 'ate' )
            // InternalOiArduBot.g:738:2: 'ate'
            {
             before(grammarAccess.getParaAccess().getAteKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getAteKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__3__Impl"


    // $ANTLR start "rule__Para__Group__4"
    // InternalOiArduBot.g:747:1: rule__Para__Group__4 : rule__Para__Group__4__Impl rule__Para__Group__5 ;
    public final void rule__Para__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:751:1: ( rule__Para__Group__4__Impl rule__Para__Group__5 )
            // InternalOiArduBot.g:752:2: rule__Para__Group__4__Impl rule__Para__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Para__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Para__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__4"


    // $ANTLR start "rule__Para__Group__4__Impl"
    // InternalOiArduBot.g:759:1: rule__Para__Group__4__Impl : ( ( rule__Para__AteAssignment_4 ) ) ;
    public final void rule__Para__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:763:1: ( ( ( rule__Para__AteAssignment_4 ) ) )
            // InternalOiArduBot.g:764:1: ( ( rule__Para__AteAssignment_4 ) )
            {
            // InternalOiArduBot.g:764:1: ( ( rule__Para__AteAssignment_4 ) )
            // InternalOiArduBot.g:765:2: ( rule__Para__AteAssignment_4 )
            {
             before(grammarAccess.getParaAccess().getAteAssignment_4()); 
            // InternalOiArduBot.g:766:2: ( rule__Para__AteAssignment_4 )
            // InternalOiArduBot.g:766:3: rule__Para__AteAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Para__AteAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParaAccess().getAteAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__4__Impl"


    // $ANTLR start "rule__Para__Group__5"
    // InternalOiArduBot.g:774:1: rule__Para__Group__5 : rule__Para__Group__5__Impl rule__Para__Group__6 ;
    public final void rule__Para__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:778:1: ( rule__Para__Group__5__Impl rule__Para__Group__6 )
            // InternalOiArduBot.g:779:2: rule__Para__Group__5__Impl rule__Para__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Para__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Para__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__5"


    // $ANTLR start "rule__Para__Group__5__Impl"
    // InternalOiArduBot.g:786:1: rule__Para__Group__5__Impl : ( ( rule__Para__Group_5__0 )? ) ;
    public final void rule__Para__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:790:1: ( ( ( rule__Para__Group_5__0 )? ) )
            // InternalOiArduBot.g:791:1: ( ( rule__Para__Group_5__0 )? )
            {
            // InternalOiArduBot.g:791:1: ( ( rule__Para__Group_5__0 )? )
            // InternalOiArduBot.g:792:2: ( rule__Para__Group_5__0 )?
            {
             before(grammarAccess.getParaAccess().getGroup_5()); 
            // InternalOiArduBot.g:793:2: ( rule__Para__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOiArduBot.g:793:3: rule__Para__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Para__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParaAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__5__Impl"


    // $ANTLR start "rule__Para__Group__6"
    // InternalOiArduBot.g:801:1: rule__Para__Group__6 : rule__Para__Group__6__Impl rule__Para__Group__7 ;
    public final void rule__Para__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:805:1: ( rule__Para__Group__6__Impl rule__Para__Group__7 )
            // InternalOiArduBot.g:806:2: rule__Para__Group__6__Impl rule__Para__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Para__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Para__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__6"


    // $ANTLR start "rule__Para__Group__6__Impl"
    // InternalOiArduBot.g:813:1: rule__Para__Group__6__Impl : ( 'Faca' ) ;
    public final void rule__Para__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:817:1: ( ( 'Faca' ) )
            // InternalOiArduBot.g:818:1: ( 'Faca' )
            {
            // InternalOiArduBot.g:818:1: ( 'Faca' )
            // InternalOiArduBot.g:819:2: 'Faca'
            {
             before(grammarAccess.getParaAccess().getFacaKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getFacaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__6__Impl"


    // $ANTLR start "rule__Para__Group__7"
    // InternalOiArduBot.g:828:1: rule__Para__Group__7 : rule__Para__Group__7__Impl rule__Para__Group__8 ;
    public final void rule__Para__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:832:1: ( rule__Para__Group__7__Impl rule__Para__Group__8 )
            // InternalOiArduBot.g:833:2: rule__Para__Group__7__Impl rule__Para__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Para__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Para__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__7"


    // $ANTLR start "rule__Para__Group__7__Impl"
    // InternalOiArduBot.g:840:1: rule__Para__Group__7__Impl : ( ( rule__Para__CodigoParaAssignment_7 ) ) ;
    public final void rule__Para__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:844:1: ( ( ( rule__Para__CodigoParaAssignment_7 ) ) )
            // InternalOiArduBot.g:845:1: ( ( rule__Para__CodigoParaAssignment_7 ) )
            {
            // InternalOiArduBot.g:845:1: ( ( rule__Para__CodigoParaAssignment_7 ) )
            // InternalOiArduBot.g:846:2: ( rule__Para__CodigoParaAssignment_7 )
            {
             before(grammarAccess.getParaAccess().getCodigoParaAssignment_7()); 
            // InternalOiArduBot.g:847:2: ( rule__Para__CodigoParaAssignment_7 )
            // InternalOiArduBot.g:847:3: rule__Para__CodigoParaAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Para__CodigoParaAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getParaAccess().getCodigoParaAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__7__Impl"


    // $ANTLR start "rule__Para__Group__8"
    // InternalOiArduBot.g:855:1: rule__Para__Group__8 : rule__Para__Group__8__Impl ;
    public final void rule__Para__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:859:1: ( rule__Para__Group__8__Impl )
            // InternalOiArduBot.g:860:2: rule__Para__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Para__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__8"


    // $ANTLR start "rule__Para__Group__8__Impl"
    // InternalOiArduBot.g:866:1: rule__Para__Group__8__Impl : ( 'FimPara' ) ;
    public final void rule__Para__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:870:1: ( ( 'FimPara' ) )
            // InternalOiArduBot.g:871:1: ( 'FimPara' )
            {
            // InternalOiArduBot.g:871:1: ( 'FimPara' )
            // InternalOiArduBot.g:872:2: 'FimPara'
            {
             before(grammarAccess.getParaAccess().getFimParaKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getFimParaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group__8__Impl"


    // $ANTLR start "rule__Para__Group_5__0"
    // InternalOiArduBot.g:882:1: rule__Para__Group_5__0 : rule__Para__Group_5__0__Impl rule__Para__Group_5__1 ;
    public final void rule__Para__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:886:1: ( rule__Para__Group_5__0__Impl rule__Para__Group_5__1 )
            // InternalOiArduBot.g:887:2: rule__Para__Group_5__0__Impl rule__Para__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Para__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Para__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group_5__0"


    // $ANTLR start "rule__Para__Group_5__0__Impl"
    // InternalOiArduBot.g:894:1: rule__Para__Group_5__0__Impl : ( 'passo' ) ;
    public final void rule__Para__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:898:1: ( ( 'passo' ) )
            // InternalOiArduBot.g:899:1: ( 'passo' )
            {
            // InternalOiArduBot.g:899:1: ( 'passo' )
            // InternalOiArduBot.g:900:2: 'passo'
            {
             before(grammarAccess.getParaAccess().getPassoKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getPassoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group_5__0__Impl"


    // $ANTLR start "rule__Para__Group_5__1"
    // InternalOiArduBot.g:909:1: rule__Para__Group_5__1 : rule__Para__Group_5__1__Impl ;
    public final void rule__Para__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:913:1: ( rule__Para__Group_5__1__Impl )
            // InternalOiArduBot.g:914:2: rule__Para__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Para__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group_5__1"


    // $ANTLR start "rule__Para__Group_5__1__Impl"
    // InternalOiArduBot.g:920:1: rule__Para__Group_5__1__Impl : ( ( rule__Para__PassoAssignment_5_1 ) ) ;
    public final void rule__Para__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:924:1: ( ( ( rule__Para__PassoAssignment_5_1 ) ) )
            // InternalOiArduBot.g:925:1: ( ( rule__Para__PassoAssignment_5_1 ) )
            {
            // InternalOiArduBot.g:925:1: ( ( rule__Para__PassoAssignment_5_1 ) )
            // InternalOiArduBot.g:926:2: ( rule__Para__PassoAssignment_5_1 )
            {
             before(grammarAccess.getParaAccess().getPassoAssignment_5_1()); 
            // InternalOiArduBot.g:927:2: ( rule__Para__PassoAssignment_5_1 )
            // InternalOiArduBot.g:927:3: rule__Para__PassoAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Para__PassoAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getParaAccess().getPassoAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__Group_5__1__Impl"


    // $ANTLR start "rule__Senao__Group__0"
    // InternalOiArduBot.g:936:1: rule__Senao__Group__0 : rule__Senao__Group__0__Impl rule__Senao__Group__1 ;
    public final void rule__Senao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:940:1: ( rule__Senao__Group__0__Impl rule__Senao__Group__1 )
            // InternalOiArduBot.g:941:2: rule__Senao__Group__0__Impl rule__Senao__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Senao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Senao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Senao__Group__0"


    // $ANTLR start "rule__Senao__Group__0__Impl"
    // InternalOiArduBot.g:948:1: rule__Senao__Group__0__Impl : ( 'SeNao' ) ;
    public final void rule__Senao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:952:1: ( ( 'SeNao' ) )
            // InternalOiArduBot.g:953:1: ( 'SeNao' )
            {
            // InternalOiArduBot.g:953:1: ( 'SeNao' )
            // InternalOiArduBot.g:954:2: 'SeNao'
            {
             before(grammarAccess.getSenaoAccess().getSeNaoKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSenaoAccess().getSeNaoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Senao__Group__0__Impl"


    // $ANTLR start "rule__Senao__Group__1"
    // InternalOiArduBot.g:963:1: rule__Senao__Group__1 : rule__Senao__Group__1__Impl ;
    public final void rule__Senao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:967:1: ( rule__Senao__Group__1__Impl )
            // InternalOiArduBot.g:968:2: rule__Senao__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Senao__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Senao__Group__1"


    // $ANTLR start "rule__Senao__Group__1__Impl"
    // InternalOiArduBot.g:974:1: rule__Senao__Group__1__Impl : ( ( rule__Senao__CodigoSenaoAssignment_1 ) ) ;
    public final void rule__Senao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:978:1: ( ( ( rule__Senao__CodigoSenaoAssignment_1 ) ) )
            // InternalOiArduBot.g:979:1: ( ( rule__Senao__CodigoSenaoAssignment_1 ) )
            {
            // InternalOiArduBot.g:979:1: ( ( rule__Senao__CodigoSenaoAssignment_1 ) )
            // InternalOiArduBot.g:980:2: ( rule__Senao__CodigoSenaoAssignment_1 )
            {
             before(grammarAccess.getSenaoAccess().getCodigoSenaoAssignment_1()); 
            // InternalOiArduBot.g:981:2: ( rule__Senao__CodigoSenaoAssignment_1 )
            // InternalOiArduBot.g:981:3: rule__Senao__CodigoSenaoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Senao__CodigoSenaoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSenaoAccess().getCodigoSenaoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Senao__Group__1__Impl"


    // $ANTLR start "rule__Sensoriamento__Group__0"
    // InternalOiArduBot.g:990:1: rule__Sensoriamento__Group__0 : rule__Sensoriamento__Group__0__Impl rule__Sensoriamento__Group__1 ;
    public final void rule__Sensoriamento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:994:1: ( rule__Sensoriamento__Group__0__Impl rule__Sensoriamento__Group__1 )
            // InternalOiArduBot.g:995:2: rule__Sensoriamento__Group__0__Impl rule__Sensoriamento__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Sensoriamento__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensoriamento__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__0"


    // $ANTLR start "rule__Sensoriamento__Group__0__Impl"
    // InternalOiArduBot.g:1002:1: rule__Sensoriamento__Group__0__Impl : ( ( rule__Sensoriamento__SensorAssignment_0 ) ) ;
    public final void rule__Sensoriamento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1006:1: ( ( ( rule__Sensoriamento__SensorAssignment_0 ) ) )
            // InternalOiArduBot.g:1007:1: ( ( rule__Sensoriamento__SensorAssignment_0 ) )
            {
            // InternalOiArduBot.g:1007:1: ( ( rule__Sensoriamento__SensorAssignment_0 ) )
            // InternalOiArduBot.g:1008:2: ( rule__Sensoriamento__SensorAssignment_0 )
            {
             before(grammarAccess.getSensoriamentoAccess().getSensorAssignment_0()); 
            // InternalOiArduBot.g:1009:2: ( rule__Sensoriamento__SensorAssignment_0 )
            // InternalOiArduBot.g:1009:3: rule__Sensoriamento__SensorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensoriamento__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSensoriamentoAccess().getSensorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__0__Impl"


    // $ANTLR start "rule__Sensoriamento__Group__1"
    // InternalOiArduBot.g:1017:1: rule__Sensoriamento__Group__1 : rule__Sensoriamento__Group__1__Impl rule__Sensoriamento__Group__2 ;
    public final void rule__Sensoriamento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1021:1: ( rule__Sensoriamento__Group__1__Impl rule__Sensoriamento__Group__2 )
            // InternalOiArduBot.g:1022:2: rule__Sensoriamento__Group__1__Impl rule__Sensoriamento__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Sensoriamento__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensoriamento__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__1"


    // $ANTLR start "rule__Sensoriamento__Group__1__Impl"
    // InternalOiArduBot.g:1029:1: rule__Sensoriamento__Group__1__Impl : ( '=' ) ;
    public final void rule__Sensoriamento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1033:1: ( ( '=' ) )
            // InternalOiArduBot.g:1034:1: ( '=' )
            {
            // InternalOiArduBot.g:1034:1: ( '=' )
            // InternalOiArduBot.g:1035:2: '='
            {
             before(grammarAccess.getSensoriamentoAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSensoriamentoAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__1__Impl"


    // $ANTLR start "rule__Sensoriamento__Group__2"
    // InternalOiArduBot.g:1044:1: rule__Sensoriamento__Group__2 : rule__Sensoriamento__Group__2__Impl rule__Sensoriamento__Group__3 ;
    public final void rule__Sensoriamento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1048:1: ( rule__Sensoriamento__Group__2__Impl rule__Sensoriamento__Group__3 )
            // InternalOiArduBot.g:1049:2: rule__Sensoriamento__Group__2__Impl rule__Sensoriamento__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Sensoriamento__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensoriamento__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__2"


    // $ANTLR start "rule__Sensoriamento__Group__2__Impl"
    // InternalOiArduBot.g:1056:1: rule__Sensoriamento__Group__2__Impl : ( 'ler' ) ;
    public final void rule__Sensoriamento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1060:1: ( ( 'ler' ) )
            // InternalOiArduBot.g:1061:1: ( 'ler' )
            {
            // InternalOiArduBot.g:1061:1: ( 'ler' )
            // InternalOiArduBot.g:1062:2: 'ler'
            {
             before(grammarAccess.getSensoriamentoAccess().getLerKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSensoriamentoAccess().getLerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__2__Impl"


    // $ANTLR start "rule__Sensoriamento__Group__3"
    // InternalOiArduBot.g:1071:1: rule__Sensoriamento__Group__3 : rule__Sensoriamento__Group__3__Impl rule__Sensoriamento__Group__4 ;
    public final void rule__Sensoriamento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1075:1: ( rule__Sensoriamento__Group__3__Impl rule__Sensoriamento__Group__4 )
            // InternalOiArduBot.g:1076:2: rule__Sensoriamento__Group__3__Impl rule__Sensoriamento__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Sensoriamento__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensoriamento__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__3"


    // $ANTLR start "rule__Sensoriamento__Group__3__Impl"
    // InternalOiArduBot.g:1083:1: rule__Sensoriamento__Group__3__Impl : ( '(' ) ;
    public final void rule__Sensoriamento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1087:1: ( ( '(' ) )
            // InternalOiArduBot.g:1088:1: ( '(' )
            {
            // InternalOiArduBot.g:1088:1: ( '(' )
            // InternalOiArduBot.g:1089:2: '('
            {
             before(grammarAccess.getSensoriamentoAccess().getLeftParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSensoriamentoAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__3__Impl"


    // $ANTLR start "rule__Sensoriamento__Group__4"
    // InternalOiArduBot.g:1098:1: rule__Sensoriamento__Group__4 : rule__Sensoriamento__Group__4__Impl rule__Sensoriamento__Group__5 ;
    public final void rule__Sensoriamento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1102:1: ( rule__Sensoriamento__Group__4__Impl rule__Sensoriamento__Group__5 )
            // InternalOiArduBot.g:1103:2: rule__Sensoriamento__Group__4__Impl rule__Sensoriamento__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Sensoriamento__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensoriamento__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__4"


    // $ANTLR start "rule__Sensoriamento__Group__4__Impl"
    // InternalOiArduBot.g:1110:1: rule__Sensoriamento__Group__4__Impl : ( ( rule__Sensoriamento__PortaAssignment_4 ) ) ;
    public final void rule__Sensoriamento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1114:1: ( ( ( rule__Sensoriamento__PortaAssignment_4 ) ) )
            // InternalOiArduBot.g:1115:1: ( ( rule__Sensoriamento__PortaAssignment_4 ) )
            {
            // InternalOiArduBot.g:1115:1: ( ( rule__Sensoriamento__PortaAssignment_4 ) )
            // InternalOiArduBot.g:1116:2: ( rule__Sensoriamento__PortaAssignment_4 )
            {
             before(grammarAccess.getSensoriamentoAccess().getPortaAssignment_4()); 
            // InternalOiArduBot.g:1117:2: ( rule__Sensoriamento__PortaAssignment_4 )
            // InternalOiArduBot.g:1117:3: rule__Sensoriamento__PortaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensoriamento__PortaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensoriamentoAccess().getPortaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__4__Impl"


    // $ANTLR start "rule__Sensoriamento__Group__5"
    // InternalOiArduBot.g:1125:1: rule__Sensoriamento__Group__5 : rule__Sensoriamento__Group__5__Impl rule__Sensoriamento__Group__6 ;
    public final void rule__Sensoriamento__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1129:1: ( rule__Sensoriamento__Group__5__Impl rule__Sensoriamento__Group__6 )
            // InternalOiArduBot.g:1130:2: rule__Sensoriamento__Group__5__Impl rule__Sensoriamento__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Sensoriamento__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensoriamento__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__5"


    // $ANTLR start "rule__Sensoriamento__Group__5__Impl"
    // InternalOiArduBot.g:1137:1: rule__Sensoriamento__Group__5__Impl : ( ',' ) ;
    public final void rule__Sensoriamento__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1141:1: ( ( ',' ) )
            // InternalOiArduBot.g:1142:1: ( ',' )
            {
            // InternalOiArduBot.g:1142:1: ( ',' )
            // InternalOiArduBot.g:1143:2: ','
            {
             before(grammarAccess.getSensoriamentoAccess().getCommaKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSensoriamentoAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__5__Impl"


    // $ANTLR start "rule__Sensoriamento__Group__6"
    // InternalOiArduBot.g:1152:1: rule__Sensoriamento__Group__6 : rule__Sensoriamento__Group__6__Impl rule__Sensoriamento__Group__7 ;
    public final void rule__Sensoriamento__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1156:1: ( rule__Sensoriamento__Group__6__Impl rule__Sensoriamento__Group__7 )
            // InternalOiArduBot.g:1157:2: rule__Sensoriamento__Group__6__Impl rule__Sensoriamento__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Sensoriamento__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensoriamento__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__6"


    // $ANTLR start "rule__Sensoriamento__Group__6__Impl"
    // InternalOiArduBot.g:1164:1: rule__Sensoriamento__Group__6__Impl : ( ( rule__Sensoriamento__TipoAssignment_6 ) ) ;
    public final void rule__Sensoriamento__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1168:1: ( ( ( rule__Sensoriamento__TipoAssignment_6 ) ) )
            // InternalOiArduBot.g:1169:1: ( ( rule__Sensoriamento__TipoAssignment_6 ) )
            {
            // InternalOiArduBot.g:1169:1: ( ( rule__Sensoriamento__TipoAssignment_6 ) )
            // InternalOiArduBot.g:1170:2: ( rule__Sensoriamento__TipoAssignment_6 )
            {
             before(grammarAccess.getSensoriamentoAccess().getTipoAssignment_6()); 
            // InternalOiArduBot.g:1171:2: ( rule__Sensoriamento__TipoAssignment_6 )
            // InternalOiArduBot.g:1171:3: rule__Sensoriamento__TipoAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Sensoriamento__TipoAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSensoriamentoAccess().getTipoAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__6__Impl"


    // $ANTLR start "rule__Sensoriamento__Group__7"
    // InternalOiArduBot.g:1179:1: rule__Sensoriamento__Group__7 : rule__Sensoriamento__Group__7__Impl rule__Sensoriamento__Group__8 ;
    public final void rule__Sensoriamento__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1183:1: ( rule__Sensoriamento__Group__7__Impl rule__Sensoriamento__Group__8 )
            // InternalOiArduBot.g:1184:2: rule__Sensoriamento__Group__7__Impl rule__Sensoriamento__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Sensoriamento__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensoriamento__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__7"


    // $ANTLR start "rule__Sensoriamento__Group__7__Impl"
    // InternalOiArduBot.g:1191:1: rule__Sensoriamento__Group__7__Impl : ( ')' ) ;
    public final void rule__Sensoriamento__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1195:1: ( ( ')' ) )
            // InternalOiArduBot.g:1196:1: ( ')' )
            {
            // InternalOiArduBot.g:1196:1: ( ')' )
            // InternalOiArduBot.g:1197:2: ')'
            {
             before(grammarAccess.getSensoriamentoAccess().getRightParenthesisKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSensoriamentoAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__7__Impl"


    // $ANTLR start "rule__Sensoriamento__Group__8"
    // InternalOiArduBot.g:1206:1: rule__Sensoriamento__Group__8 : rule__Sensoriamento__Group__8__Impl ;
    public final void rule__Sensoriamento__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1210:1: ( rule__Sensoriamento__Group__8__Impl )
            // InternalOiArduBot.g:1211:2: rule__Sensoriamento__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensoriamento__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__8"


    // $ANTLR start "rule__Sensoriamento__Group__8__Impl"
    // InternalOiArduBot.g:1217:1: rule__Sensoriamento__Group__8__Impl : ( ';' ) ;
    public final void rule__Sensoriamento__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1221:1: ( ( ';' ) )
            // InternalOiArduBot.g:1222:1: ( ';' )
            {
            // InternalOiArduBot.g:1222:1: ( ';' )
            // InternalOiArduBot.g:1223:2: ';'
            {
             before(grammarAccess.getSensoriamentoAccess().getSemicolonKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSensoriamentoAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__Group__8__Impl"


    // $ANTLR start "rule__Beep__Group__0"
    // InternalOiArduBot.g:1233:1: rule__Beep__Group__0 : rule__Beep__Group__0__Impl rule__Beep__Group__1 ;
    public final void rule__Beep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1237:1: ( rule__Beep__Group__0__Impl rule__Beep__Group__1 )
            // InternalOiArduBot.g:1238:2: rule__Beep__Group__0__Impl rule__Beep__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Beep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__0"


    // $ANTLR start "rule__Beep__Group__0__Impl"
    // InternalOiArduBot.g:1245:1: rule__Beep__Group__0__Impl : ( 'alerta' ) ;
    public final void rule__Beep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1249:1: ( ( 'alerta' ) )
            // InternalOiArduBot.g:1250:1: ( 'alerta' )
            {
            // InternalOiArduBot.g:1250:1: ( 'alerta' )
            // InternalOiArduBot.g:1251:2: 'alerta'
            {
             before(grammarAccess.getBeepAccess().getAlertaKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBeepAccess().getAlertaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__0__Impl"


    // $ANTLR start "rule__Beep__Group__1"
    // InternalOiArduBot.g:1260:1: rule__Beep__Group__1 : rule__Beep__Group__1__Impl rule__Beep__Group__2 ;
    public final void rule__Beep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1264:1: ( rule__Beep__Group__1__Impl rule__Beep__Group__2 )
            // InternalOiArduBot.g:1265:2: rule__Beep__Group__1__Impl rule__Beep__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Beep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__1"


    // $ANTLR start "rule__Beep__Group__1__Impl"
    // InternalOiArduBot.g:1272:1: rule__Beep__Group__1__Impl : ( '(' ) ;
    public final void rule__Beep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1276:1: ( ( '(' ) )
            // InternalOiArduBot.g:1277:1: ( '(' )
            {
            // InternalOiArduBot.g:1277:1: ( '(' )
            // InternalOiArduBot.g:1278:2: '('
            {
             before(grammarAccess.getBeepAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBeepAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__1__Impl"


    // $ANTLR start "rule__Beep__Group__2"
    // InternalOiArduBot.g:1287:1: rule__Beep__Group__2 : rule__Beep__Group__2__Impl rule__Beep__Group__3 ;
    public final void rule__Beep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1291:1: ( rule__Beep__Group__2__Impl rule__Beep__Group__3 )
            // InternalOiArduBot.g:1292:2: rule__Beep__Group__2__Impl rule__Beep__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Beep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__2"


    // $ANTLR start "rule__Beep__Group__2__Impl"
    // InternalOiArduBot.g:1299:1: rule__Beep__Group__2__Impl : ( 'beep' ) ;
    public final void rule__Beep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1303:1: ( ( 'beep' ) )
            // InternalOiArduBot.g:1304:1: ( 'beep' )
            {
            // InternalOiArduBot.g:1304:1: ( 'beep' )
            // InternalOiArduBot.g:1305:2: 'beep'
            {
             before(grammarAccess.getBeepAccess().getBeepKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBeepAccess().getBeepKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__2__Impl"


    // $ANTLR start "rule__Beep__Group__3"
    // InternalOiArduBot.g:1314:1: rule__Beep__Group__3 : rule__Beep__Group__3__Impl rule__Beep__Group__4 ;
    public final void rule__Beep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1318:1: ( rule__Beep__Group__3__Impl rule__Beep__Group__4 )
            // InternalOiArduBot.g:1319:2: rule__Beep__Group__3__Impl rule__Beep__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Beep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__3"


    // $ANTLR start "rule__Beep__Group__3__Impl"
    // InternalOiArduBot.g:1326:1: rule__Beep__Group__3__Impl : ( ',' ) ;
    public final void rule__Beep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1330:1: ( ( ',' ) )
            // InternalOiArduBot.g:1331:1: ( ',' )
            {
            // InternalOiArduBot.g:1331:1: ( ',' )
            // InternalOiArduBot.g:1332:2: ','
            {
             before(grammarAccess.getBeepAccess().getCommaKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBeepAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__3__Impl"


    // $ANTLR start "rule__Beep__Group__4"
    // InternalOiArduBot.g:1341:1: rule__Beep__Group__4 : rule__Beep__Group__4__Impl rule__Beep__Group__5 ;
    public final void rule__Beep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1345:1: ( rule__Beep__Group__4__Impl rule__Beep__Group__5 )
            // InternalOiArduBot.g:1346:2: rule__Beep__Group__4__Impl rule__Beep__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Beep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beep__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__4"


    // $ANTLR start "rule__Beep__Group__4__Impl"
    // InternalOiArduBot.g:1353:1: rule__Beep__Group__4__Impl : ( ( rule__Beep__TipoAssignment_4 ) ) ;
    public final void rule__Beep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1357:1: ( ( ( rule__Beep__TipoAssignment_4 ) ) )
            // InternalOiArduBot.g:1358:1: ( ( rule__Beep__TipoAssignment_4 ) )
            {
            // InternalOiArduBot.g:1358:1: ( ( rule__Beep__TipoAssignment_4 ) )
            // InternalOiArduBot.g:1359:2: ( rule__Beep__TipoAssignment_4 )
            {
             before(grammarAccess.getBeepAccess().getTipoAssignment_4()); 
            // InternalOiArduBot.g:1360:2: ( rule__Beep__TipoAssignment_4 )
            // InternalOiArduBot.g:1360:3: rule__Beep__TipoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Beep__TipoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBeepAccess().getTipoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__4__Impl"


    // $ANTLR start "rule__Beep__Group__5"
    // InternalOiArduBot.g:1368:1: rule__Beep__Group__5 : rule__Beep__Group__5__Impl rule__Beep__Group__6 ;
    public final void rule__Beep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1372:1: ( rule__Beep__Group__5__Impl rule__Beep__Group__6 )
            // InternalOiArduBot.g:1373:2: rule__Beep__Group__5__Impl rule__Beep__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Beep__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beep__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__5"


    // $ANTLR start "rule__Beep__Group__5__Impl"
    // InternalOiArduBot.g:1380:1: rule__Beep__Group__5__Impl : ( ')' ) ;
    public final void rule__Beep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1384:1: ( ( ')' ) )
            // InternalOiArduBot.g:1385:1: ( ')' )
            {
            // InternalOiArduBot.g:1385:1: ( ')' )
            // InternalOiArduBot.g:1386:2: ')'
            {
             before(grammarAccess.getBeepAccess().getRightParenthesisKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBeepAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__5__Impl"


    // $ANTLR start "rule__Beep__Group__6"
    // InternalOiArduBot.g:1395:1: rule__Beep__Group__6 : rule__Beep__Group__6__Impl ;
    public final void rule__Beep__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1399:1: ( rule__Beep__Group__6__Impl )
            // InternalOiArduBot.g:1400:2: rule__Beep__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Beep__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__6"


    // $ANTLR start "rule__Beep__Group__6__Impl"
    // InternalOiArduBot.g:1406:1: rule__Beep__Group__6__Impl : ( ';' ) ;
    public final void rule__Beep__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1410:1: ( ( ';' ) )
            // InternalOiArduBot.g:1411:1: ( ';' )
            {
            // InternalOiArduBot.g:1411:1: ( ';' )
            // InternalOiArduBot.g:1412:2: ';'
            {
             before(grammarAccess.getBeepAccess().getSemicolonKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBeepAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__Group__6__Impl"


    // $ANTLR start "rule__Model__VarAssignment_0"
    // InternalOiArduBot.g:1422:1: rule__Model__VarAssignment_0 : ( ( 'Variaveis' ) ) ;
    public final void rule__Model__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1426:1: ( ( ( 'Variaveis' ) ) )
            // InternalOiArduBot.g:1427:2: ( ( 'Variaveis' ) )
            {
            // InternalOiArduBot.g:1427:2: ( ( 'Variaveis' ) )
            // InternalOiArduBot.g:1428:3: ( 'Variaveis' )
            {
             before(grammarAccess.getModelAccess().getVarVariaveisKeyword_0_0()); 
            // InternalOiArduBot.g:1429:3: ( 'Variaveis' )
            // InternalOiArduBot.g:1430:4: 'Variaveis'
            {
             before(grammarAccess.getModelAccess().getVarVariaveisKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getVarVariaveisKeyword_0_0()); 

            }

             after(grammarAccess.getModelAccess().getVarVariaveisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VarAssignment_0"


    // $ANTLR start "rule__Model__VariaveisAssignment_1"
    // InternalOiArduBot.g:1441:1: rule__Model__VariaveisAssignment_1 : ( ruleVariavel ) ;
    public final void rule__Model__VariaveisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1445:1: ( ( ruleVariavel ) )
            // InternalOiArduBot.g:1446:2: ( ruleVariavel )
            {
            // InternalOiArduBot.g:1446:2: ( ruleVariavel )
            // InternalOiArduBot.g:1447:3: ruleVariavel
            {
             before(grammarAccess.getModelAccess().getVariaveisVariavelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVariaveisVariavelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VariaveisAssignment_1"


    // $ANTLR start "rule__Model__IniAssignment_2"
    // InternalOiArduBot.g:1456:1: rule__Model__IniAssignment_2 : ( ( 'Inicio' ) ) ;
    public final void rule__Model__IniAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1460:1: ( ( ( 'Inicio' ) ) )
            // InternalOiArduBot.g:1461:2: ( ( 'Inicio' ) )
            {
            // InternalOiArduBot.g:1461:2: ( ( 'Inicio' ) )
            // InternalOiArduBot.g:1462:3: ( 'Inicio' )
            {
             before(grammarAccess.getModelAccess().getIniInicioKeyword_2_0()); 
            // InternalOiArduBot.g:1463:3: ( 'Inicio' )
            // InternalOiArduBot.g:1464:4: 'Inicio'
            {
             before(grammarAccess.getModelAccess().getIniInicioKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getIniInicioKeyword_2_0()); 

            }

             after(grammarAccess.getModelAccess().getIniInicioKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__IniAssignment_2"


    // $ANTLR start "rule__Model__FimAssignment_3"
    // InternalOiArduBot.g:1475:1: rule__Model__FimAssignment_3 : ( ( 'Fim' ) ) ;
    public final void rule__Model__FimAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1479:1: ( ( ( 'Fim' ) ) )
            // InternalOiArduBot.g:1480:2: ( ( 'Fim' ) )
            {
            // InternalOiArduBot.g:1480:2: ( ( 'Fim' ) )
            // InternalOiArduBot.g:1481:3: ( 'Fim' )
            {
             before(grammarAccess.getModelAccess().getFimFimKeyword_3_0()); 
            // InternalOiArduBot.g:1482:3: ( 'Fim' )
            // InternalOiArduBot.g:1483:4: 'Fim'
            {
             before(grammarAccess.getModelAccess().getFimFimKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFimFimKeyword_3_0()); 

            }

             after(grammarAccess.getModelAccess().getFimFimKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FimAssignment_3"


    // $ANTLR start "rule__Variavel__TipoAssignment_0"
    // InternalOiArduBot.g:1494:1: rule__Variavel__TipoAssignment_0 : ( ruleTipo ) ;
    public final void rule__Variavel__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1498:1: ( ( ruleTipo ) )
            // InternalOiArduBot.g:1499:2: ( ruleTipo )
            {
            // InternalOiArduBot.g:1499:2: ( ruleTipo )
            // InternalOiArduBot.g:1500:3: ruleTipo
            {
             before(grammarAccess.getVariavelAccess().getTipoTipoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipo();

            state._fsp--;

             after(grammarAccess.getVariavelAccess().getTipoTipoEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__TipoAssignment_0"


    // $ANTLR start "rule__Variavel__NameAssignment_1"
    // InternalOiArduBot.g:1509:1: rule__Variavel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variavel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1513:1: ( ( RULE_ID ) )
            // InternalOiArduBot.g:1514:2: ( RULE_ID )
            {
            // InternalOiArduBot.g:1514:2: ( RULE_ID )
            // InternalOiArduBot.g:1515:3: RULE_ID
            {
             before(grammarAccess.getVariavelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariavelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__NameAssignment_1"


    // $ANTLR start "rule__Variavel__ValorAssignment_2_1"
    // InternalOiArduBot.g:1524:1: rule__Variavel__ValorAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Variavel__ValorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1528:1: ( ( RULE_STRING ) )
            // InternalOiArduBot.g:1529:2: ( RULE_STRING )
            {
            // InternalOiArduBot.g:1529:2: ( RULE_STRING )
            // InternalOiArduBot.g:1530:3: RULE_STRING
            {
             before(grammarAccess.getVariavelAccess().getValorSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVariavelAccess().getValorSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__ValorAssignment_2_1"


    // $ANTLR start "rule__Para__DeAssignment_2"
    // InternalOiArduBot.g:1539:1: rule__Para__DeAssignment_2 : ( RULE_INT ) ;
    public final void rule__Para__DeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1543:1: ( ( RULE_INT ) )
            // InternalOiArduBot.g:1544:2: ( RULE_INT )
            {
            // InternalOiArduBot.g:1544:2: ( RULE_INT )
            // InternalOiArduBot.g:1545:3: RULE_INT
            {
             before(grammarAccess.getParaAccess().getDeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getDeINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__DeAssignment_2"


    // $ANTLR start "rule__Para__AteAssignment_4"
    // InternalOiArduBot.g:1554:1: rule__Para__AteAssignment_4 : ( RULE_INT ) ;
    public final void rule__Para__AteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1558:1: ( ( RULE_INT ) )
            // InternalOiArduBot.g:1559:2: ( RULE_INT )
            {
            // InternalOiArduBot.g:1559:2: ( RULE_INT )
            // InternalOiArduBot.g:1560:3: RULE_INT
            {
             before(grammarAccess.getParaAccess().getAteINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getAteINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__AteAssignment_4"


    // $ANTLR start "rule__Para__PassoAssignment_5_1"
    // InternalOiArduBot.g:1569:1: rule__Para__PassoAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__Para__PassoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1573:1: ( ( RULE_INT ) )
            // InternalOiArduBot.g:1574:2: ( RULE_INT )
            {
            // InternalOiArduBot.g:1574:2: ( RULE_INT )
            // InternalOiArduBot.g:1575:3: RULE_INT
            {
             before(grammarAccess.getParaAccess().getPassoINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getPassoINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__PassoAssignment_5_1"


    // $ANTLR start "rule__Para__CodigoParaAssignment_7"
    // InternalOiArduBot.g:1584:1: rule__Para__CodigoParaAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Para__CodigoParaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1588:1: ( ( RULE_STRING ) )
            // InternalOiArduBot.g:1589:2: ( RULE_STRING )
            {
            // InternalOiArduBot.g:1589:2: ( RULE_STRING )
            // InternalOiArduBot.g:1590:3: RULE_STRING
            {
             before(grammarAccess.getParaAccess().getCodigoParaSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getCodigoParaSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Para__CodigoParaAssignment_7"


    // $ANTLR start "rule__Senao__CodigoSenaoAssignment_1"
    // InternalOiArduBot.g:1599:1: rule__Senao__CodigoSenaoAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Senao__CodigoSenaoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1603:1: ( ( RULE_STRING ) )
            // InternalOiArduBot.g:1604:2: ( RULE_STRING )
            {
            // InternalOiArduBot.g:1604:2: ( RULE_STRING )
            // InternalOiArduBot.g:1605:3: RULE_STRING
            {
             before(grammarAccess.getSenaoAccess().getCodigoSenaoSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSenaoAccess().getCodigoSenaoSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Senao__CodigoSenaoAssignment_1"


    // $ANTLR start "rule__Sensoriamento__SensorAssignment_0"
    // InternalOiArduBot.g:1614:1: rule__Sensoriamento__SensorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Sensoriamento__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1618:1: ( ( ( RULE_ID ) ) )
            // InternalOiArduBot.g:1619:2: ( ( RULE_ID ) )
            {
            // InternalOiArduBot.g:1619:2: ( ( RULE_ID ) )
            // InternalOiArduBot.g:1620:3: ( RULE_ID )
            {
             before(grammarAccess.getSensoriamentoAccess().getSensorVariavelCrossReference_0_0()); 
            // InternalOiArduBot.g:1621:3: ( RULE_ID )
            // InternalOiArduBot.g:1622:4: RULE_ID
            {
             before(grammarAccess.getSensoriamentoAccess().getSensorVariavelIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensoriamentoAccess().getSensorVariavelIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSensoriamentoAccess().getSensorVariavelCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__SensorAssignment_0"


    // $ANTLR start "rule__Sensoriamento__PortaAssignment_4"
    // InternalOiArduBot.g:1633:1: rule__Sensoriamento__PortaAssignment_4 : ( RULE_INT ) ;
    public final void rule__Sensoriamento__PortaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1637:1: ( ( RULE_INT ) )
            // InternalOiArduBot.g:1638:2: ( RULE_INT )
            {
            // InternalOiArduBot.g:1638:2: ( RULE_INT )
            // InternalOiArduBot.g:1639:3: RULE_INT
            {
             before(grammarAccess.getSensoriamentoAccess().getPortaINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSensoriamentoAccess().getPortaINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__PortaAssignment_4"


    // $ANTLR start "rule__Sensoriamento__TipoAssignment_6"
    // InternalOiArduBot.g:1648:1: rule__Sensoriamento__TipoAssignment_6 : ( ruleTipoPorta ) ;
    public final void rule__Sensoriamento__TipoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1652:1: ( ( ruleTipoPorta ) )
            // InternalOiArduBot.g:1653:2: ( ruleTipoPorta )
            {
            // InternalOiArduBot.g:1653:2: ( ruleTipoPorta )
            // InternalOiArduBot.g:1654:3: ruleTipoPorta
            {
             before(grammarAccess.getSensoriamentoAccess().getTipoTipoPortaEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoPorta();

            state._fsp--;

             after(grammarAccess.getSensoriamentoAccess().getTipoTipoPortaEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensoriamento__TipoAssignment_6"


    // $ANTLR start "rule__Atuacao__NotificacoesAssignment"
    // InternalOiArduBot.g:1663:1: rule__Atuacao__NotificacoesAssignment : ( ruleNotificacao ) ;
    public final void rule__Atuacao__NotificacoesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1667:1: ( ( ruleNotificacao ) )
            // InternalOiArduBot.g:1668:2: ( ruleNotificacao )
            {
            // InternalOiArduBot.g:1668:2: ( ruleNotificacao )
            // InternalOiArduBot.g:1669:3: ruleNotificacao
            {
             before(grammarAccess.getAtuacaoAccess().getNotificacoesNotificacaoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNotificacao();

            state._fsp--;

             after(grammarAccess.getAtuacaoAccess().getNotificacoesNotificacaoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atuacao__NotificacoesAssignment"


    // $ANTLR start "rule__Notificacao__BeepAssignment"
    // InternalOiArduBot.g:1678:1: rule__Notificacao__BeepAssignment : ( ruleBeep ) ;
    public final void rule__Notificacao__BeepAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1682:1: ( ( ruleBeep ) )
            // InternalOiArduBot.g:1683:2: ( ruleBeep )
            {
            // InternalOiArduBot.g:1683:2: ( ruleBeep )
            // InternalOiArduBot.g:1684:3: ruleBeep
            {
             before(grammarAccess.getNotificacaoAccess().getBeepBeepParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBeep();

            state._fsp--;

             after(grammarAccess.getNotificacaoAccess().getBeepBeepParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notificacao__BeepAssignment"


    // $ANTLR start "rule__Beep__TipoAssignment_4"
    // InternalOiArduBot.g:1693:1: rule__Beep__TipoAssignment_4 : ( ruleTipoBeep ) ;
    public final void rule__Beep__TipoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArduBot.g:1697:1: ( ( ruleTipoBeep ) )
            // InternalOiArduBot.g:1698:2: ( ruleTipoBeep )
            {
            // InternalOiArduBot.g:1698:2: ( ruleTipoBeep )
            // InternalOiArduBot.g:1699:3: ruleTipoBeep
            {
             before(grammarAccess.getBeepAccess().getTipoTipoBeepEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoBeep();

            state._fsp--;

             after(grammarAccess.getBeepAccess().getTipoTipoBeepEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beep__TipoAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000000E000L});

}