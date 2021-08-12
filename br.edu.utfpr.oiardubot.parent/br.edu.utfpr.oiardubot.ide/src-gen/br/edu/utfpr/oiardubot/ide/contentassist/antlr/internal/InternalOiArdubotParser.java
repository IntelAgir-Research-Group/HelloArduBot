package br.edu.utfpr.oiardubot.ide.contentassist.antlr.internal;

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
import br.edu.utfpr.oiardubot.services.OiArdubotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOiArdubotParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANALOGICA", "RULE_INT", "RULE_STRING", "RULE_CONSTANTENOME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'curto'", "'medio'", "'longo'", "'DIGITAL'", "'ANALOGICA'", "'Texto'", "'Numero'", "'FRENTE'", "'TRAS'", "'<-'", "';'", "'CONSTANTE'", "'ler'", "'('", "')'", "'lerDigital'", "'lerAnalogica'", "'escrever'", "'tela'", "'bip'", "'ligar'", "','", "'desligar'", "'girarServo'", "'motorDC'", "'andar'", "'parar'", "'para'", "'de'", "'ate'", "'faca'", "'enquanto'", "'fimenquanto'", "'repita'", "'se'", "'entao'", "'senao'", "'escolha'", "'fimescolha'", "'caso'", "'fimcaso'", "'funcao'", "':'", "'fimfuncao'", "'retorne'", "'esperar'", "'Variaveis'", "'Inicio'", "'Fim'", "'fimpara'", "'fimse'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_ANALOGICA=5;
    public static final int RULE_CONSTANTENOME=8;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalOiArdubotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOiArdubotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOiArdubotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOiArdubot.g"; }


    	private OiArdubotGrammarAccess grammarAccess;

    	public void setGrammarAccess(OiArdubotGrammarAccess grammarAccess) {
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
    // InternalOiArdubot.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalOiArdubot.g:54:1: ( ruleModel EOF )
            // InternalOiArdubot.g:55:1: ruleModel EOF
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
    // InternalOiArdubot.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalOiArdubot.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalOiArdubot.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalOiArdubot.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalOiArdubot.g:69:3: ( rule__Model__Group__0 )
            // InternalOiArdubot.g:69:4: rule__Model__Group__0
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


    // $ANTLR start "entryRuleCodigo"
    // InternalOiArdubot.g:78:1: entryRuleCodigo : ruleCodigo EOF ;
    public final void entryRuleCodigo() throws RecognitionException {
        try {
            // InternalOiArdubot.g:79:1: ( ruleCodigo EOF )
            // InternalOiArdubot.g:80:1: ruleCodigo EOF
            {
             before(grammarAccess.getCodigoRule()); 
            pushFollow(FOLLOW_1);
            ruleCodigo();

            state._fsp--;

             after(grammarAccess.getCodigoRule()); 
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
    // $ANTLR end "entryRuleCodigo"


    // $ANTLR start "ruleCodigo"
    // InternalOiArdubot.g:87:1: ruleCodigo : ( ( rule__Codigo__CodeAssignment )* ) ;
    public final void ruleCodigo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:91:2: ( ( ( rule__Codigo__CodeAssignment )* ) )
            // InternalOiArdubot.g:92:2: ( ( rule__Codigo__CodeAssignment )* )
            {
            // InternalOiArdubot.g:92:2: ( ( rule__Codigo__CodeAssignment )* )
            // InternalOiArdubot.g:93:3: ( rule__Codigo__CodeAssignment )*
            {
             before(grammarAccess.getCodigoAccess().getCodeAssignment()); 
            // InternalOiArdubot.g:94:3: ( rule__Codigo__CodeAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=36 && LA1_0<=39)||(LA1_0>=41 && LA1_0<=46)||LA1_0==50||(LA1_0>=52 && LA1_0<=53)||LA1_0==56||LA1_0==60||LA1_0==64) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOiArdubot.g:94:4: rule__Codigo__CodeAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Codigo__CodeAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCodigoAccess().getCodeAssignment()); 

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
    // $ANTLR end "ruleCodigo"


    // $ANTLR start "entryRuleImplementacao"
    // InternalOiArdubot.g:103:1: entryRuleImplementacao : ruleImplementacao EOF ;
    public final void entryRuleImplementacao() throws RecognitionException {
        try {
            // InternalOiArdubot.g:104:1: ( ruleImplementacao EOF )
            // InternalOiArdubot.g:105:1: ruleImplementacao EOF
            {
             before(grammarAccess.getImplementacaoRule()); 
            pushFollow(FOLLOW_1);
            ruleImplementacao();

            state._fsp--;

             after(grammarAccess.getImplementacaoRule()); 
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
    // $ANTLR end "entryRuleImplementacao"


    // $ANTLR start "ruleImplementacao"
    // InternalOiArdubot.g:112:1: ruleImplementacao : ( ( rule__Implementacao__Alternatives ) ) ;
    public final void ruleImplementacao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:116:2: ( ( ( rule__Implementacao__Alternatives ) ) )
            // InternalOiArdubot.g:117:2: ( ( rule__Implementacao__Alternatives ) )
            {
            // InternalOiArdubot.g:117:2: ( ( rule__Implementacao__Alternatives ) )
            // InternalOiArdubot.g:118:3: ( rule__Implementacao__Alternatives )
            {
             before(grammarAccess.getImplementacaoAccess().getAlternatives()); 
            // InternalOiArdubot.g:119:3: ( rule__Implementacao__Alternatives )
            // InternalOiArdubot.g:119:4: rule__Implementacao__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Implementacao__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImplementacaoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleImplementacao"


    // $ANTLR start "entryRulePorta"
    // InternalOiArdubot.g:128:1: entryRulePorta : rulePorta EOF ;
    public final void entryRulePorta() throws RecognitionException {
        try {
            // InternalOiArdubot.g:129:1: ( rulePorta EOF )
            // InternalOiArdubot.g:130:1: rulePorta EOF
            {
             before(grammarAccess.getPortaRule()); 
            pushFollow(FOLLOW_1);
            rulePorta();

            state._fsp--;

             after(grammarAccess.getPortaRule()); 
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
    // $ANTLR end "entryRulePorta"


    // $ANTLR start "rulePorta"
    // InternalOiArdubot.g:137:1: rulePorta : ( ( rule__Porta__NameAssignment ) ) ;
    public final void rulePorta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:141:2: ( ( ( rule__Porta__NameAssignment ) ) )
            // InternalOiArdubot.g:142:2: ( ( rule__Porta__NameAssignment ) )
            {
            // InternalOiArdubot.g:142:2: ( ( rule__Porta__NameAssignment ) )
            // InternalOiArdubot.g:143:3: ( rule__Porta__NameAssignment )
            {
             before(grammarAccess.getPortaAccess().getNameAssignment()); 
            // InternalOiArdubot.g:144:3: ( rule__Porta__NameAssignment )
            // InternalOiArdubot.g:144:4: rule__Porta__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Porta__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPortaAccess().getNameAssignment()); 

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
    // $ANTLR end "rulePorta"


    // $ANTLR start "entryRulePortaAnalogica"
    // InternalOiArdubot.g:153:1: entryRulePortaAnalogica : rulePortaAnalogica EOF ;
    public final void entryRulePortaAnalogica() throws RecognitionException {
        try {
            // InternalOiArdubot.g:154:1: ( rulePortaAnalogica EOF )
            // InternalOiArdubot.g:155:1: rulePortaAnalogica EOF
            {
             before(grammarAccess.getPortaAnalogicaRule()); 
            pushFollow(FOLLOW_1);
            rulePortaAnalogica();

            state._fsp--;

             after(grammarAccess.getPortaAnalogicaRule()); 
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
    // $ANTLR end "entryRulePortaAnalogica"


    // $ANTLR start "rulePortaAnalogica"
    // InternalOiArdubot.g:162:1: rulePortaAnalogica : ( ( rule__PortaAnalogica__ValorAssignment ) ) ;
    public final void rulePortaAnalogica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:166:2: ( ( ( rule__PortaAnalogica__ValorAssignment ) ) )
            // InternalOiArdubot.g:167:2: ( ( rule__PortaAnalogica__ValorAssignment ) )
            {
            // InternalOiArdubot.g:167:2: ( ( rule__PortaAnalogica__ValorAssignment ) )
            // InternalOiArdubot.g:168:3: ( rule__PortaAnalogica__ValorAssignment )
            {
             before(grammarAccess.getPortaAnalogicaAccess().getValorAssignment()); 
            // InternalOiArdubot.g:169:3: ( rule__PortaAnalogica__ValorAssignment )
            // InternalOiArdubot.g:169:4: rule__PortaAnalogica__ValorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PortaAnalogica__ValorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPortaAnalogicaAccess().getValorAssignment()); 

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
    // $ANTLR end "rulePortaAnalogica"


    // $ANTLR start "entryRuleAnalogicaOuId"
    // InternalOiArdubot.g:178:1: entryRuleAnalogicaOuId : ruleAnalogicaOuId EOF ;
    public final void entryRuleAnalogicaOuId() throws RecognitionException {
        try {
            // InternalOiArdubot.g:179:1: ( ruleAnalogicaOuId EOF )
            // InternalOiArdubot.g:180:1: ruleAnalogicaOuId EOF
            {
             before(grammarAccess.getAnalogicaOuIdRule()); 
            pushFollow(FOLLOW_1);
            ruleAnalogicaOuId();

            state._fsp--;

             after(grammarAccess.getAnalogicaOuIdRule()); 
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
    // $ANTLR end "entryRuleAnalogicaOuId"


    // $ANTLR start "ruleAnalogicaOuId"
    // InternalOiArdubot.g:187:1: ruleAnalogicaOuId : ( ( rule__AnalogicaOuId__Alternatives ) ) ;
    public final void ruleAnalogicaOuId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:191:2: ( ( ( rule__AnalogicaOuId__Alternatives ) ) )
            // InternalOiArdubot.g:192:2: ( ( rule__AnalogicaOuId__Alternatives ) )
            {
            // InternalOiArdubot.g:192:2: ( ( rule__AnalogicaOuId__Alternatives ) )
            // InternalOiArdubot.g:193:3: ( rule__AnalogicaOuId__Alternatives )
            {
             before(grammarAccess.getAnalogicaOuIdAccess().getAlternatives()); 
            // InternalOiArdubot.g:194:3: ( rule__AnalogicaOuId__Alternatives )
            // InternalOiArdubot.g:194:4: rule__AnalogicaOuId__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AnalogicaOuId__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnalogicaOuIdAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAnalogicaOuId"


    // $ANTLR start "entryRulePortaDigital"
    // InternalOiArdubot.g:203:1: entryRulePortaDigital : rulePortaDigital EOF ;
    public final void entryRulePortaDigital() throws RecognitionException {
        try {
            // InternalOiArdubot.g:204:1: ( rulePortaDigital EOF )
            // InternalOiArdubot.g:205:1: rulePortaDigital EOF
            {
             before(grammarAccess.getPortaDigitalRule()); 
            pushFollow(FOLLOW_1);
            rulePortaDigital();

            state._fsp--;

             after(grammarAccess.getPortaDigitalRule()); 
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
    // $ANTLR end "entryRulePortaDigital"


    // $ANTLR start "rulePortaDigital"
    // InternalOiArdubot.g:212:1: rulePortaDigital : ( ( rule__PortaDigital__ValorAssignment ) ) ;
    public final void rulePortaDigital() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:216:2: ( ( ( rule__PortaDigital__ValorAssignment ) ) )
            // InternalOiArdubot.g:217:2: ( ( rule__PortaDigital__ValorAssignment ) )
            {
            // InternalOiArdubot.g:217:2: ( ( rule__PortaDigital__ValorAssignment ) )
            // InternalOiArdubot.g:218:3: ( rule__PortaDigital__ValorAssignment )
            {
             before(grammarAccess.getPortaDigitalAccess().getValorAssignment()); 
            // InternalOiArdubot.g:219:3: ( rule__PortaDigital__ValorAssignment )
            // InternalOiArdubot.g:219:4: rule__PortaDigital__ValorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PortaDigital__ValorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPortaDigitalAccess().getValorAssignment()); 

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
    // $ANTLR end "rulePortaDigital"


    // $ANTLR start "entryRuleDigitalOuId"
    // InternalOiArdubot.g:228:1: entryRuleDigitalOuId : ruleDigitalOuId EOF ;
    public final void entryRuleDigitalOuId() throws RecognitionException {
        try {
            // InternalOiArdubot.g:229:1: ( ruleDigitalOuId EOF )
            // InternalOiArdubot.g:230:1: ruleDigitalOuId EOF
            {
             before(grammarAccess.getDigitalOuIdRule()); 
            pushFollow(FOLLOW_1);
            ruleDigitalOuId();

            state._fsp--;

             after(grammarAccess.getDigitalOuIdRule()); 
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
    // $ANTLR end "entryRuleDigitalOuId"


    // $ANTLR start "ruleDigitalOuId"
    // InternalOiArdubot.g:237:1: ruleDigitalOuId : ( ( rule__DigitalOuId__Alternatives ) ) ;
    public final void ruleDigitalOuId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:241:2: ( ( ( rule__DigitalOuId__Alternatives ) ) )
            // InternalOiArdubot.g:242:2: ( ( rule__DigitalOuId__Alternatives ) )
            {
            // InternalOiArdubot.g:242:2: ( ( rule__DigitalOuId__Alternatives ) )
            // InternalOiArdubot.g:243:3: ( rule__DigitalOuId__Alternatives )
            {
             before(grammarAccess.getDigitalOuIdAccess().getAlternatives()); 
            // InternalOiArdubot.g:244:3: ( rule__DigitalOuId__Alternatives )
            // InternalOiArdubot.g:244:4: rule__DigitalOuId__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DigitalOuId__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDigitalOuIdAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDigitalOuId"


    // $ANTLR start "entryRuleReceberValor"
    // InternalOiArdubot.g:253:1: entryRuleReceberValor : ruleReceberValor EOF ;
    public final void entryRuleReceberValor() throws RecognitionException {
        try {
            // InternalOiArdubot.g:254:1: ( ruleReceberValor EOF )
            // InternalOiArdubot.g:255:1: ruleReceberValor EOF
            {
             before(grammarAccess.getReceberValorRule()); 
            pushFollow(FOLLOW_1);
            ruleReceberValor();

            state._fsp--;

             after(grammarAccess.getReceberValorRule()); 
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
    // $ANTLR end "entryRuleReceberValor"


    // $ANTLR start "ruleReceberValor"
    // InternalOiArdubot.g:262:1: ruleReceberValor : ( ( rule__ReceberValor__TipoAssignment ) ) ;
    public final void ruleReceberValor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:266:2: ( ( ( rule__ReceberValor__TipoAssignment ) ) )
            // InternalOiArdubot.g:267:2: ( ( rule__ReceberValor__TipoAssignment ) )
            {
            // InternalOiArdubot.g:267:2: ( ( rule__ReceberValor__TipoAssignment ) )
            // InternalOiArdubot.g:268:3: ( rule__ReceberValor__TipoAssignment )
            {
             before(grammarAccess.getReceberValorAccess().getTipoAssignment()); 
            // InternalOiArdubot.g:269:3: ( rule__ReceberValor__TipoAssignment )
            // InternalOiArdubot.g:269:4: rule__ReceberValor__TipoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ReceberValor__TipoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReceberValorAccess().getTipoAssignment()); 

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
    // $ANTLR end "ruleReceberValor"


    // $ANTLR start "entryRuleExistenteVariavelRecebe"
    // InternalOiArdubot.g:278:1: entryRuleExistenteVariavelRecebe : ruleExistenteVariavelRecebe EOF ;
    public final void entryRuleExistenteVariavelRecebe() throws RecognitionException {
        try {
            // InternalOiArdubot.g:279:1: ( ruleExistenteVariavelRecebe EOF )
            // InternalOiArdubot.g:280:1: ruleExistenteVariavelRecebe EOF
            {
             before(grammarAccess.getExistenteVariavelRecebeRule()); 
            pushFollow(FOLLOW_1);
            ruleExistenteVariavelRecebe();

            state._fsp--;

             after(grammarAccess.getExistenteVariavelRecebeRule()); 
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
    // $ANTLR end "entryRuleExistenteVariavelRecebe"


    // $ANTLR start "ruleExistenteVariavelRecebe"
    // InternalOiArdubot.g:287:1: ruleExistenteVariavelRecebe : ( ( rule__ExistenteVariavelRecebe__Group__0 ) ) ;
    public final void ruleExistenteVariavelRecebe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:291:2: ( ( ( rule__ExistenteVariavelRecebe__Group__0 ) ) )
            // InternalOiArdubot.g:292:2: ( ( rule__ExistenteVariavelRecebe__Group__0 ) )
            {
            // InternalOiArdubot.g:292:2: ( ( rule__ExistenteVariavelRecebe__Group__0 ) )
            // InternalOiArdubot.g:293:3: ( rule__ExistenteVariavelRecebe__Group__0 )
            {
             before(grammarAccess.getExistenteVariavelRecebeAccess().getGroup()); 
            // InternalOiArdubot.g:294:3: ( rule__ExistenteVariavelRecebe__Group__0 )
            // InternalOiArdubot.g:294:4: rule__ExistenteVariavelRecebe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistenteVariavelRecebe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistenteVariavelRecebeAccess().getGroup()); 

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
    // $ANTLR end "ruleExistenteVariavelRecebe"


    // $ANTLR start "entryRuleValorReferencia"
    // InternalOiArdubot.g:303:1: entryRuleValorReferencia : ruleValorReferencia EOF ;
    public final void entryRuleValorReferencia() throws RecognitionException {
        try {
            // InternalOiArdubot.g:304:1: ( ruleValorReferencia EOF )
            // InternalOiArdubot.g:305:1: ruleValorReferencia EOF
            {
             before(grammarAccess.getValorReferenciaRule()); 
            pushFollow(FOLLOW_1);
            ruleValorReferencia();

            state._fsp--;

             after(grammarAccess.getValorReferenciaRule()); 
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
    // $ANTLR end "entryRuleValorReferencia"


    // $ANTLR start "ruleValorReferencia"
    // InternalOiArdubot.g:312:1: ruleValorReferencia : ( RULE_ID ) ;
    public final void ruleValorReferencia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:316:2: ( ( RULE_ID ) )
            // InternalOiArdubot.g:317:2: ( RULE_ID )
            {
            // InternalOiArdubot.g:317:2: ( RULE_ID )
            // InternalOiArdubot.g:318:3: RULE_ID
            {
             before(grammarAccess.getValorReferenciaAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValorReferenciaAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleValorReferencia"


    // $ANTLR start "entryRuleNovaVariavelRecebe"
    // InternalOiArdubot.g:328:1: entryRuleNovaVariavelRecebe : ruleNovaVariavelRecebe EOF ;
    public final void entryRuleNovaVariavelRecebe() throws RecognitionException {
        try {
            // InternalOiArdubot.g:329:1: ( ruleNovaVariavelRecebe EOF )
            // InternalOiArdubot.g:330:1: ruleNovaVariavelRecebe EOF
            {
             before(grammarAccess.getNovaVariavelRecebeRule()); 
            pushFollow(FOLLOW_1);
            ruleNovaVariavelRecebe();

            state._fsp--;

             after(grammarAccess.getNovaVariavelRecebeRule()); 
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
    // $ANTLR end "entryRuleNovaVariavelRecebe"


    // $ANTLR start "ruleNovaVariavelRecebe"
    // InternalOiArdubot.g:337:1: ruleNovaVariavelRecebe : ( ( rule__NovaVariavelRecebe__Group__0 ) ) ;
    public final void ruleNovaVariavelRecebe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:341:2: ( ( ( rule__NovaVariavelRecebe__Group__0 ) ) )
            // InternalOiArdubot.g:342:2: ( ( rule__NovaVariavelRecebe__Group__0 ) )
            {
            // InternalOiArdubot.g:342:2: ( ( rule__NovaVariavelRecebe__Group__0 ) )
            // InternalOiArdubot.g:343:3: ( rule__NovaVariavelRecebe__Group__0 )
            {
             before(grammarAccess.getNovaVariavelRecebeAccess().getGroup()); 
            // InternalOiArdubot.g:344:3: ( rule__NovaVariavelRecebe__Group__0 )
            // InternalOiArdubot.g:344:4: rule__NovaVariavelRecebe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NovaVariavelRecebe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNovaVariavelRecebeAccess().getGroup()); 

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
    // $ANTLR end "ruleNovaVariavelRecebe"


    // $ANTLR start "entryRuleVariavelNome"
    // InternalOiArdubot.g:353:1: entryRuleVariavelNome : ruleVariavelNome EOF ;
    public final void entryRuleVariavelNome() throws RecognitionException {
        try {
            // InternalOiArdubot.g:354:1: ( ruleVariavelNome EOF )
            // InternalOiArdubot.g:355:1: ruleVariavelNome EOF
            {
             before(grammarAccess.getVariavelNomeRule()); 
            pushFollow(FOLLOW_1);
            ruleVariavelNome();

            state._fsp--;

             after(grammarAccess.getVariavelNomeRule()); 
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
    // $ANTLR end "entryRuleVariavelNome"


    // $ANTLR start "ruleVariavelNome"
    // InternalOiArdubot.g:362:1: ruleVariavelNome : ( ( rule__VariavelNome__Group__0 ) ) ;
    public final void ruleVariavelNome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:366:2: ( ( ( rule__VariavelNome__Group__0 ) ) )
            // InternalOiArdubot.g:367:2: ( ( rule__VariavelNome__Group__0 ) )
            {
            // InternalOiArdubot.g:367:2: ( ( rule__VariavelNome__Group__0 ) )
            // InternalOiArdubot.g:368:3: ( rule__VariavelNome__Group__0 )
            {
             before(grammarAccess.getVariavelNomeAccess().getGroup()); 
            // InternalOiArdubot.g:369:3: ( rule__VariavelNome__Group__0 )
            // InternalOiArdubot.g:369:4: rule__VariavelNome__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariavelNome__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariavelNomeAccess().getGroup()); 

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
    // $ANTLR end "ruleVariavelNome"


    // $ANTLR start "entryRuleVariavelOuPorta"
    // InternalOiArdubot.g:378:1: entryRuleVariavelOuPorta : ruleVariavelOuPorta EOF ;
    public final void entryRuleVariavelOuPorta() throws RecognitionException {
        try {
            // InternalOiArdubot.g:379:1: ( ruleVariavelOuPorta EOF )
            // InternalOiArdubot.g:380:1: ruleVariavelOuPorta EOF
            {
             before(grammarAccess.getVariavelOuPortaRule()); 
            pushFollow(FOLLOW_1);
            ruleVariavelOuPorta();

            state._fsp--;

             after(grammarAccess.getVariavelOuPortaRule()); 
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
    // $ANTLR end "entryRuleVariavelOuPorta"


    // $ANTLR start "ruleVariavelOuPorta"
    // InternalOiArdubot.g:387:1: ruleVariavelOuPorta : ( ( rule__VariavelOuPorta__NameAssignment ) ) ;
    public final void ruleVariavelOuPorta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:391:2: ( ( ( rule__VariavelOuPorta__NameAssignment ) ) )
            // InternalOiArdubot.g:392:2: ( ( rule__VariavelOuPorta__NameAssignment ) )
            {
            // InternalOiArdubot.g:392:2: ( ( rule__VariavelOuPorta__NameAssignment ) )
            // InternalOiArdubot.g:393:3: ( rule__VariavelOuPorta__NameAssignment )
            {
             before(grammarAccess.getVariavelOuPortaAccess().getNameAssignment()); 
            // InternalOiArdubot.g:394:3: ( rule__VariavelOuPorta__NameAssignment )
            // InternalOiArdubot.g:394:4: rule__VariavelOuPorta__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariavelOuPorta__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariavelOuPortaAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleVariavelOuPorta"


    // $ANTLR start "entryRuleVariavelOuNumero"
    // InternalOiArdubot.g:403:1: entryRuleVariavelOuNumero : ruleVariavelOuNumero EOF ;
    public final void entryRuleVariavelOuNumero() throws RecognitionException {
        try {
            // InternalOiArdubot.g:404:1: ( ruleVariavelOuNumero EOF )
            // InternalOiArdubot.g:405:1: ruleVariavelOuNumero EOF
            {
             before(grammarAccess.getVariavelOuNumeroRule()); 
            pushFollow(FOLLOW_1);
            ruleVariavelOuNumero();

            state._fsp--;

             after(grammarAccess.getVariavelOuNumeroRule()); 
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
    // $ANTLR end "entryRuleVariavelOuNumero"


    // $ANTLR start "ruleVariavelOuNumero"
    // InternalOiArdubot.g:412:1: ruleVariavelOuNumero : ( ( rule__VariavelOuNumero__Alternatives ) ) ;
    public final void ruleVariavelOuNumero() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:416:2: ( ( ( rule__VariavelOuNumero__Alternatives ) ) )
            // InternalOiArdubot.g:417:2: ( ( rule__VariavelOuNumero__Alternatives ) )
            {
            // InternalOiArdubot.g:417:2: ( ( rule__VariavelOuNumero__Alternatives ) )
            // InternalOiArdubot.g:418:3: ( rule__VariavelOuNumero__Alternatives )
            {
             before(grammarAccess.getVariavelOuNumeroAccess().getAlternatives()); 
            // InternalOiArdubot.g:419:3: ( rule__VariavelOuNumero__Alternatives )
            // InternalOiArdubot.g:419:4: rule__VariavelOuNumero__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariavelOuNumero__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariavelOuNumeroAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariavelOuNumero"


    // $ANTLR start "entryRuleNome"
    // InternalOiArdubot.g:428:1: entryRuleNome : ruleNome EOF ;
    public final void entryRuleNome() throws RecognitionException {
        try {
            // InternalOiArdubot.g:429:1: ( ruleNome EOF )
            // InternalOiArdubot.g:430:1: ruleNome EOF
            {
             before(grammarAccess.getNomeRule()); 
            pushFollow(FOLLOW_1);
            ruleNome();

            state._fsp--;

             after(grammarAccess.getNomeRule()); 
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
    // $ANTLR end "entryRuleNome"


    // $ANTLR start "ruleNome"
    // InternalOiArdubot.g:437:1: ruleNome : ( ( rule__Nome__NameAssignment ) ) ;
    public final void ruleNome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:441:2: ( ( ( rule__Nome__NameAssignment ) ) )
            // InternalOiArdubot.g:442:2: ( ( rule__Nome__NameAssignment ) )
            {
            // InternalOiArdubot.g:442:2: ( ( rule__Nome__NameAssignment ) )
            // InternalOiArdubot.g:443:3: ( rule__Nome__NameAssignment )
            {
             before(grammarAccess.getNomeAccess().getNameAssignment()); 
            // InternalOiArdubot.g:444:3: ( rule__Nome__NameAssignment )
            // InternalOiArdubot.g:444:4: rule__Nome__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Nome__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNomeAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleNome"


    // $ANTLR start "entryRuleConteudoEscrever"
    // InternalOiArdubot.g:453:1: entryRuleConteudoEscrever : ruleConteudoEscrever EOF ;
    public final void entryRuleConteudoEscrever() throws RecognitionException {
        try {
            // InternalOiArdubot.g:454:1: ( ruleConteudoEscrever EOF )
            // InternalOiArdubot.g:455:1: ruleConteudoEscrever EOF
            {
             before(grammarAccess.getConteudoEscreverRule()); 
            pushFollow(FOLLOW_1);
            ruleConteudoEscrever();

            state._fsp--;

             after(grammarAccess.getConteudoEscreverRule()); 
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
    // $ANTLR end "entryRuleConteudoEscrever"


    // $ANTLR start "ruleConteudoEscrever"
    // InternalOiArdubot.g:462:1: ruleConteudoEscrever : ( ( rule__ConteudoEscrever__Alternatives ) ) ;
    public final void ruleConteudoEscrever() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:466:2: ( ( ( rule__ConteudoEscrever__Alternatives ) ) )
            // InternalOiArdubot.g:467:2: ( ( rule__ConteudoEscrever__Alternatives ) )
            {
            // InternalOiArdubot.g:467:2: ( ( rule__ConteudoEscrever__Alternatives ) )
            // InternalOiArdubot.g:468:3: ( rule__ConteudoEscrever__Alternatives )
            {
             before(grammarAccess.getConteudoEscreverAccess().getAlternatives()); 
            // InternalOiArdubot.g:469:3: ( rule__ConteudoEscrever__Alternatives )
            // InternalOiArdubot.g:469:4: rule__ConteudoEscrever__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConteudoEscrever__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConteudoEscreverAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConteudoEscrever"


    // $ANTLR start "entryRuleTexto"
    // InternalOiArdubot.g:478:1: entryRuleTexto : ruleTexto EOF ;
    public final void entryRuleTexto() throws RecognitionException {
        try {
            // InternalOiArdubot.g:479:1: ( ruleTexto EOF )
            // InternalOiArdubot.g:480:1: ruleTexto EOF
            {
             before(grammarAccess.getTextoRule()); 
            pushFollow(FOLLOW_1);
            ruleTexto();

            state._fsp--;

             after(grammarAccess.getTextoRule()); 
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
    // $ANTLR end "entryRuleTexto"


    // $ANTLR start "ruleTexto"
    // InternalOiArdubot.g:487:1: ruleTexto : ( ( rule__Texto__NameAssignment ) ) ;
    public final void ruleTexto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:491:2: ( ( ( rule__Texto__NameAssignment ) ) )
            // InternalOiArdubot.g:492:2: ( ( rule__Texto__NameAssignment ) )
            {
            // InternalOiArdubot.g:492:2: ( ( rule__Texto__NameAssignment ) )
            // InternalOiArdubot.g:493:3: ( rule__Texto__NameAssignment )
            {
             before(grammarAccess.getTextoAccess().getNameAssignment()); 
            // InternalOiArdubot.g:494:3: ( rule__Texto__NameAssignment )
            // InternalOiArdubot.g:494:4: rule__Texto__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Texto__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextoAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleTexto"


    // $ANTLR start "entryRuleInteiro"
    // InternalOiArdubot.g:503:1: entryRuleInteiro : ruleInteiro EOF ;
    public final void entryRuleInteiro() throws RecognitionException {
        try {
            // InternalOiArdubot.g:504:1: ( ruleInteiro EOF )
            // InternalOiArdubot.g:505:1: ruleInteiro EOF
            {
             before(grammarAccess.getInteiroRule()); 
            pushFollow(FOLLOW_1);
            ruleInteiro();

            state._fsp--;

             after(grammarAccess.getInteiroRule()); 
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
    // $ANTLR end "entryRuleInteiro"


    // $ANTLR start "ruleInteiro"
    // InternalOiArdubot.g:512:1: ruleInteiro : ( ( rule__Inteiro__NameAssignment ) ) ;
    public final void ruleInteiro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:516:2: ( ( ( rule__Inteiro__NameAssignment ) ) )
            // InternalOiArdubot.g:517:2: ( ( rule__Inteiro__NameAssignment ) )
            {
            // InternalOiArdubot.g:517:2: ( ( rule__Inteiro__NameAssignment ) )
            // InternalOiArdubot.g:518:3: ( rule__Inteiro__NameAssignment )
            {
             before(grammarAccess.getInteiroAccess().getNameAssignment()); 
            // InternalOiArdubot.g:519:3: ( rule__Inteiro__NameAssignment )
            // InternalOiArdubot.g:519:4: rule__Inteiro__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Inteiro__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInteiroAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleInteiro"


    // $ANTLR start "entryRuleTextoOuNumero"
    // InternalOiArdubot.g:528:1: entryRuleTextoOuNumero : ruleTextoOuNumero EOF ;
    public final void entryRuleTextoOuNumero() throws RecognitionException {
        try {
            // InternalOiArdubot.g:529:1: ( ruleTextoOuNumero EOF )
            // InternalOiArdubot.g:530:1: ruleTextoOuNumero EOF
            {
             before(grammarAccess.getTextoOuNumeroRule()); 
            pushFollow(FOLLOW_1);
            ruleTextoOuNumero();

            state._fsp--;

             after(grammarAccess.getTextoOuNumeroRule()); 
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
    // $ANTLR end "entryRuleTextoOuNumero"


    // $ANTLR start "ruleTextoOuNumero"
    // InternalOiArdubot.g:537:1: ruleTextoOuNumero : ( ( rule__TextoOuNumero__Alternatives ) ) ;
    public final void ruleTextoOuNumero() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:541:2: ( ( ( rule__TextoOuNumero__Alternatives ) ) )
            // InternalOiArdubot.g:542:2: ( ( rule__TextoOuNumero__Alternatives ) )
            {
            // InternalOiArdubot.g:542:2: ( ( rule__TextoOuNumero__Alternatives ) )
            // InternalOiArdubot.g:543:3: ( rule__TextoOuNumero__Alternatives )
            {
             before(grammarAccess.getTextoOuNumeroAccess().getAlternatives()); 
            // InternalOiArdubot.g:544:3: ( rule__TextoOuNumero__Alternatives )
            // InternalOiArdubot.g:544:4: rule__TextoOuNumero__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TextoOuNumero__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextoOuNumeroAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTextoOuNumero"


    // $ANTLR start "entryRuleValorLiteral"
    // InternalOiArdubot.g:553:1: entryRuleValorLiteral : ruleValorLiteral EOF ;
    public final void entryRuleValorLiteral() throws RecognitionException {
        try {
            // InternalOiArdubot.g:554:1: ( ruleValorLiteral EOF )
            // InternalOiArdubot.g:555:1: ruleValorLiteral EOF
            {
             before(grammarAccess.getValorLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleValorLiteral();

            state._fsp--;

             after(grammarAccess.getValorLiteralRule()); 
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
    // $ANTLR end "entryRuleValorLiteral"


    // $ANTLR start "ruleValorLiteral"
    // InternalOiArdubot.g:562:1: ruleValorLiteral : ( ( rule__ValorLiteral__Alternatives ) ) ;
    public final void ruleValorLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:566:2: ( ( ( rule__ValorLiteral__Alternatives ) ) )
            // InternalOiArdubot.g:567:2: ( ( rule__ValorLiteral__Alternatives ) )
            {
            // InternalOiArdubot.g:567:2: ( ( rule__ValorLiteral__Alternatives ) )
            // InternalOiArdubot.g:568:3: ( rule__ValorLiteral__Alternatives )
            {
             before(grammarAccess.getValorLiteralAccess().getAlternatives()); 
            // InternalOiArdubot.g:569:3: ( rule__ValorLiteral__Alternatives )
            // InternalOiArdubot.g:569:4: rule__ValorLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValorLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValorLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValorLiteral"


    // $ANTLR start "entryRuleVariavelValor"
    // InternalOiArdubot.g:578:1: entryRuleVariavelValor : ruleVariavelValor EOF ;
    public final void entryRuleVariavelValor() throws RecognitionException {
        try {
            // InternalOiArdubot.g:579:1: ( ruleVariavelValor EOF )
            // InternalOiArdubot.g:580:1: ruleVariavelValor EOF
            {
             before(grammarAccess.getVariavelValorRule()); 
            pushFollow(FOLLOW_1);
            ruleVariavelValor();

            state._fsp--;

             after(grammarAccess.getVariavelValorRule()); 
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
    // $ANTLR end "entryRuleVariavelValor"


    // $ANTLR start "ruleVariavelValor"
    // InternalOiArdubot.g:587:1: ruleVariavelValor : ( ( rule__VariavelValor__Alternatives ) ) ;
    public final void ruleVariavelValor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:591:2: ( ( ( rule__VariavelValor__Alternatives ) ) )
            // InternalOiArdubot.g:592:2: ( ( rule__VariavelValor__Alternatives ) )
            {
            // InternalOiArdubot.g:592:2: ( ( rule__VariavelValor__Alternatives ) )
            // InternalOiArdubot.g:593:3: ( rule__VariavelValor__Alternatives )
            {
             before(grammarAccess.getVariavelValorAccess().getAlternatives()); 
            // InternalOiArdubot.g:594:3: ( rule__VariavelValor__Alternatives )
            // InternalOiArdubot.g:594:4: rule__VariavelValor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariavelValor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariavelValorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariavelValor"


    // $ANTLR start "entryRuleDisplayValor"
    // InternalOiArdubot.g:603:1: entryRuleDisplayValor : ruleDisplayValor EOF ;
    public final void entryRuleDisplayValor() throws RecognitionException {
        try {
            // InternalOiArdubot.g:604:1: ( ruleDisplayValor EOF )
            // InternalOiArdubot.g:605:1: ruleDisplayValor EOF
            {
             before(grammarAccess.getDisplayValorRule()); 
            pushFollow(FOLLOW_1);
            ruleDisplayValor();

            state._fsp--;

             after(grammarAccess.getDisplayValorRule()); 
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
    // $ANTLR end "entryRuleDisplayValor"


    // $ANTLR start "ruleDisplayValor"
    // InternalOiArdubot.g:612:1: ruleDisplayValor : ( ( rule__DisplayValor__Alternatives ) ) ;
    public final void ruleDisplayValor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:616:2: ( ( ( rule__DisplayValor__Alternatives ) ) )
            // InternalOiArdubot.g:617:2: ( ( rule__DisplayValor__Alternatives ) )
            {
            // InternalOiArdubot.g:617:2: ( ( rule__DisplayValor__Alternatives ) )
            // InternalOiArdubot.g:618:3: ( rule__DisplayValor__Alternatives )
            {
             before(grammarAccess.getDisplayValorAccess().getAlternatives()); 
            // InternalOiArdubot.g:619:3: ( rule__DisplayValor__Alternatives )
            // InternalOiArdubot.g:619:4: rule__DisplayValor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DisplayValor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDisplayValorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDisplayValor"


    // $ANTLR start "entryRuleVariavel"
    // InternalOiArdubot.g:628:1: entryRuleVariavel : ruleVariavel EOF ;
    public final void entryRuleVariavel() throws RecognitionException {
        try {
            // InternalOiArdubot.g:629:1: ( ruleVariavel EOF )
            // InternalOiArdubot.g:630:1: ruleVariavel EOF
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
    // InternalOiArdubot.g:637:1: ruleVariavel : ( ( rule__Variavel__Group__0 ) ) ;
    public final void ruleVariavel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:641:2: ( ( ( rule__Variavel__Group__0 ) ) )
            // InternalOiArdubot.g:642:2: ( ( rule__Variavel__Group__0 ) )
            {
            // InternalOiArdubot.g:642:2: ( ( rule__Variavel__Group__0 ) )
            // InternalOiArdubot.g:643:3: ( rule__Variavel__Group__0 )
            {
             before(grammarAccess.getVariavelAccess().getGroup()); 
            // InternalOiArdubot.g:644:3: ( rule__Variavel__Group__0 )
            // InternalOiArdubot.g:644:4: rule__Variavel__Group__0
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


    // $ANTLR start "entryRuleVariavelExistente"
    // InternalOiArdubot.g:653:1: entryRuleVariavelExistente : ruleVariavelExistente EOF ;
    public final void entryRuleVariavelExistente() throws RecognitionException {
        try {
            // InternalOiArdubot.g:654:1: ( ruleVariavelExistente EOF )
            // InternalOiArdubot.g:655:1: ruleVariavelExistente EOF
            {
             before(grammarAccess.getVariavelExistenteRule()); 
            pushFollow(FOLLOW_1);
            ruleVariavelExistente();

            state._fsp--;

             after(grammarAccess.getVariavelExistenteRule()); 
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
    // $ANTLR end "entryRuleVariavelExistente"


    // $ANTLR start "ruleVariavelExistente"
    // InternalOiArdubot.g:662:1: ruleVariavelExistente : ( ( rule__VariavelExistente__Group__0 ) ) ;
    public final void ruleVariavelExistente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:666:2: ( ( ( rule__VariavelExistente__Group__0 ) ) )
            // InternalOiArdubot.g:667:2: ( ( rule__VariavelExistente__Group__0 ) )
            {
            // InternalOiArdubot.g:667:2: ( ( rule__VariavelExistente__Group__0 ) )
            // InternalOiArdubot.g:668:3: ( rule__VariavelExistente__Group__0 )
            {
             before(grammarAccess.getVariavelExistenteAccess().getGroup()); 
            // InternalOiArdubot.g:669:3: ( rule__VariavelExistente__Group__0 )
            // InternalOiArdubot.g:669:4: rule__VariavelExistente__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariavelExistente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariavelExistenteAccess().getGroup()); 

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
    // $ANTLR end "ruleVariavelExistente"


    // $ANTLR start "entryRuleConstanteVariavel"
    // InternalOiArdubot.g:678:1: entryRuleConstanteVariavel : ruleConstanteVariavel EOF ;
    public final void entryRuleConstanteVariavel() throws RecognitionException {
        try {
            // InternalOiArdubot.g:679:1: ( ruleConstanteVariavel EOF )
            // InternalOiArdubot.g:680:1: ruleConstanteVariavel EOF
            {
             before(grammarAccess.getConstanteVariavelRule()); 
            pushFollow(FOLLOW_1);
            ruleConstanteVariavel();

            state._fsp--;

             after(grammarAccess.getConstanteVariavelRule()); 
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
    // $ANTLR end "entryRuleConstanteVariavel"


    // $ANTLR start "ruleConstanteVariavel"
    // InternalOiArdubot.g:687:1: ruleConstanteVariavel : ( ( rule__ConstanteVariavel__Group__0 ) ) ;
    public final void ruleConstanteVariavel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:691:2: ( ( ( rule__ConstanteVariavel__Group__0 ) ) )
            // InternalOiArdubot.g:692:2: ( ( rule__ConstanteVariavel__Group__0 ) )
            {
            // InternalOiArdubot.g:692:2: ( ( rule__ConstanteVariavel__Group__0 ) )
            // InternalOiArdubot.g:693:3: ( rule__ConstanteVariavel__Group__0 )
            {
             before(grammarAccess.getConstanteVariavelAccess().getGroup()); 
            // InternalOiArdubot.g:694:3: ( rule__ConstanteVariavel__Group__0 )
            // InternalOiArdubot.g:694:4: rule__ConstanteVariavel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstanteVariavel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstanteVariavelAccess().getGroup()); 

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
    // $ANTLR end "ruleConstanteVariavel"


    // $ANTLR start "entryRuleConstante"
    // InternalOiArdubot.g:703:1: entryRuleConstante : ruleConstante EOF ;
    public final void entryRuleConstante() throws RecognitionException {
        try {
            // InternalOiArdubot.g:704:1: ( ruleConstante EOF )
            // InternalOiArdubot.g:705:1: ruleConstante EOF
            {
             before(grammarAccess.getConstanteRule()); 
            pushFollow(FOLLOW_1);
            ruleConstante();

            state._fsp--;

             after(grammarAccess.getConstanteRule()); 
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
    // $ANTLR end "entryRuleConstante"


    // $ANTLR start "ruleConstante"
    // InternalOiArdubot.g:712:1: ruleConstante : ( ( rule__Constante__Group__0 ) ) ;
    public final void ruleConstante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:716:2: ( ( ( rule__Constante__Group__0 ) ) )
            // InternalOiArdubot.g:717:2: ( ( rule__Constante__Group__0 ) )
            {
            // InternalOiArdubot.g:717:2: ( ( rule__Constante__Group__0 ) )
            // InternalOiArdubot.g:718:3: ( rule__Constante__Group__0 )
            {
             before(grammarAccess.getConstanteAccess().getGroup()); 
            // InternalOiArdubot.g:719:3: ( rule__Constante__Group__0 )
            // InternalOiArdubot.g:719:4: rule__Constante__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constante__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstanteAccess().getGroup()); 

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
    // $ANTLR end "ruleConstante"


    // $ANTLR start "entryRuleLogico"
    // InternalOiArdubot.g:728:1: entryRuleLogico : ruleLogico EOF ;
    public final void entryRuleLogico() throws RecognitionException {
        try {
            // InternalOiArdubot.g:729:1: ( ruleLogico EOF )
            // InternalOiArdubot.g:730:1: ruleLogico EOF
            {
             before(grammarAccess.getLogicoRule()); 
            pushFollow(FOLLOW_1);
            ruleLogico();

            state._fsp--;

             after(grammarAccess.getLogicoRule()); 
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
    // $ANTLR end "entryRuleLogico"


    // $ANTLR start "ruleLogico"
    // InternalOiArdubot.g:737:1: ruleLogico : ( ( rule__Logico__RelationAssignment ) ) ;
    public final void ruleLogico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:741:2: ( ( ( rule__Logico__RelationAssignment ) ) )
            // InternalOiArdubot.g:742:2: ( ( rule__Logico__RelationAssignment ) )
            {
            // InternalOiArdubot.g:742:2: ( ( rule__Logico__RelationAssignment ) )
            // InternalOiArdubot.g:743:3: ( rule__Logico__RelationAssignment )
            {
             before(grammarAccess.getLogicoAccess().getRelationAssignment()); 
            // InternalOiArdubot.g:744:3: ( rule__Logico__RelationAssignment )
            // InternalOiArdubot.g:744:4: rule__Logico__RelationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Logico__RelationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLogicoAccess().getRelationAssignment()); 

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
    // $ANTLR end "ruleLogico"


    // $ANTLR start "entryRuleLer"
    // InternalOiArdubot.g:753:1: entryRuleLer : ruleLer EOF ;
    public final void entryRuleLer() throws RecognitionException {
        try {
            // InternalOiArdubot.g:754:1: ( ruleLer EOF )
            // InternalOiArdubot.g:755:1: ruleLer EOF
            {
             before(grammarAccess.getLerRule()); 
            pushFollow(FOLLOW_1);
            ruleLer();

            state._fsp--;

             after(grammarAccess.getLerRule()); 
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
    // $ANTLR end "entryRuleLer"


    // $ANTLR start "ruleLer"
    // InternalOiArdubot.g:762:1: ruleLer : ( ( rule__Ler__Group__0 ) ) ;
    public final void ruleLer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:766:2: ( ( ( rule__Ler__Group__0 ) ) )
            // InternalOiArdubot.g:767:2: ( ( rule__Ler__Group__0 ) )
            {
            // InternalOiArdubot.g:767:2: ( ( rule__Ler__Group__0 ) )
            // InternalOiArdubot.g:768:3: ( rule__Ler__Group__0 )
            {
             before(grammarAccess.getLerAccess().getGroup()); 
            // InternalOiArdubot.g:769:3: ( rule__Ler__Group__0 )
            // InternalOiArdubot.g:769:4: rule__Ler__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLerAccess().getGroup()); 

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
    // $ANTLR end "ruleLer"


    // $ANTLR start "entryRuleFuncaoLer"
    // InternalOiArdubot.g:778:1: entryRuleFuncaoLer : ruleFuncaoLer EOF ;
    public final void entryRuleFuncaoLer() throws RecognitionException {
        try {
            // InternalOiArdubot.g:779:1: ( ruleFuncaoLer EOF )
            // InternalOiArdubot.g:780:1: ruleFuncaoLer EOF
            {
             before(grammarAccess.getFuncaoLerRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncaoLer();

            state._fsp--;

             after(grammarAccess.getFuncaoLerRule()); 
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
    // $ANTLR end "entryRuleFuncaoLer"


    // $ANTLR start "ruleFuncaoLer"
    // InternalOiArdubot.g:787:1: ruleFuncaoLer : ( ( rule__FuncaoLer__Group__0 ) ) ;
    public final void ruleFuncaoLer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:791:2: ( ( ( rule__FuncaoLer__Group__0 ) ) )
            // InternalOiArdubot.g:792:2: ( ( rule__FuncaoLer__Group__0 ) )
            {
            // InternalOiArdubot.g:792:2: ( ( rule__FuncaoLer__Group__0 ) )
            // InternalOiArdubot.g:793:3: ( rule__FuncaoLer__Group__0 )
            {
             before(grammarAccess.getFuncaoLerAccess().getGroup()); 
            // InternalOiArdubot.g:794:3: ( rule__FuncaoLer__Group__0 )
            // InternalOiArdubot.g:794:4: rule__FuncaoLer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncaoLer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncaoLerAccess().getGroup()); 

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
    // $ANTLR end "ruleFuncaoLer"


    // $ANTLR start "entryRuleLerDigital"
    // InternalOiArdubot.g:803:1: entryRuleLerDigital : ruleLerDigital EOF ;
    public final void entryRuleLerDigital() throws RecognitionException {
        try {
            // InternalOiArdubot.g:804:1: ( ruleLerDigital EOF )
            // InternalOiArdubot.g:805:1: ruleLerDigital EOF
            {
             before(grammarAccess.getLerDigitalRule()); 
            pushFollow(FOLLOW_1);
            ruleLerDigital();

            state._fsp--;

             after(grammarAccess.getLerDigitalRule()); 
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
    // $ANTLR end "entryRuleLerDigital"


    // $ANTLR start "ruleLerDigital"
    // InternalOiArdubot.g:812:1: ruleLerDigital : ( ( rule__LerDigital__Group__0 ) ) ;
    public final void ruleLerDigital() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:816:2: ( ( ( rule__LerDigital__Group__0 ) ) )
            // InternalOiArdubot.g:817:2: ( ( rule__LerDigital__Group__0 ) )
            {
            // InternalOiArdubot.g:817:2: ( ( rule__LerDigital__Group__0 ) )
            // InternalOiArdubot.g:818:3: ( rule__LerDigital__Group__0 )
            {
             before(grammarAccess.getLerDigitalAccess().getGroup()); 
            // InternalOiArdubot.g:819:3: ( rule__LerDigital__Group__0 )
            // InternalOiArdubot.g:819:4: rule__LerDigital__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LerDigital__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLerDigitalAccess().getGroup()); 

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
    // $ANTLR end "ruleLerDigital"


    // $ANTLR start "entryRuleFuncaoLerDigital"
    // InternalOiArdubot.g:828:1: entryRuleFuncaoLerDigital : ruleFuncaoLerDigital EOF ;
    public final void entryRuleFuncaoLerDigital() throws RecognitionException {
        try {
            // InternalOiArdubot.g:829:1: ( ruleFuncaoLerDigital EOF )
            // InternalOiArdubot.g:830:1: ruleFuncaoLerDigital EOF
            {
             before(grammarAccess.getFuncaoLerDigitalRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncaoLerDigital();

            state._fsp--;

             after(grammarAccess.getFuncaoLerDigitalRule()); 
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
    // $ANTLR end "entryRuleFuncaoLerDigital"


    // $ANTLR start "ruleFuncaoLerDigital"
    // InternalOiArdubot.g:837:1: ruleFuncaoLerDigital : ( ( rule__FuncaoLerDigital__Group__0 ) ) ;
    public final void ruleFuncaoLerDigital() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:841:2: ( ( ( rule__FuncaoLerDigital__Group__0 ) ) )
            // InternalOiArdubot.g:842:2: ( ( rule__FuncaoLerDigital__Group__0 ) )
            {
            // InternalOiArdubot.g:842:2: ( ( rule__FuncaoLerDigital__Group__0 ) )
            // InternalOiArdubot.g:843:3: ( rule__FuncaoLerDigital__Group__0 )
            {
             before(grammarAccess.getFuncaoLerDigitalAccess().getGroup()); 
            // InternalOiArdubot.g:844:3: ( rule__FuncaoLerDigital__Group__0 )
            // InternalOiArdubot.g:844:4: rule__FuncaoLerDigital__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncaoLerDigital__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncaoLerDigitalAccess().getGroup()); 

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
    // $ANTLR end "ruleFuncaoLerDigital"


    // $ANTLR start "entryRuleLerAnalogica"
    // InternalOiArdubot.g:853:1: entryRuleLerAnalogica : ruleLerAnalogica EOF ;
    public final void entryRuleLerAnalogica() throws RecognitionException {
        try {
            // InternalOiArdubot.g:854:1: ( ruleLerAnalogica EOF )
            // InternalOiArdubot.g:855:1: ruleLerAnalogica EOF
            {
             before(grammarAccess.getLerAnalogicaRule()); 
            pushFollow(FOLLOW_1);
            ruleLerAnalogica();

            state._fsp--;

             after(grammarAccess.getLerAnalogicaRule()); 
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
    // $ANTLR end "entryRuleLerAnalogica"


    // $ANTLR start "ruleLerAnalogica"
    // InternalOiArdubot.g:862:1: ruleLerAnalogica : ( ( rule__LerAnalogica__Group__0 ) ) ;
    public final void ruleLerAnalogica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:866:2: ( ( ( rule__LerAnalogica__Group__0 ) ) )
            // InternalOiArdubot.g:867:2: ( ( rule__LerAnalogica__Group__0 ) )
            {
            // InternalOiArdubot.g:867:2: ( ( rule__LerAnalogica__Group__0 ) )
            // InternalOiArdubot.g:868:3: ( rule__LerAnalogica__Group__0 )
            {
             before(grammarAccess.getLerAnalogicaAccess().getGroup()); 
            // InternalOiArdubot.g:869:3: ( rule__LerAnalogica__Group__0 )
            // InternalOiArdubot.g:869:4: rule__LerAnalogica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LerAnalogica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLerAnalogicaAccess().getGroup()); 

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
    // $ANTLR end "ruleLerAnalogica"


    // $ANTLR start "entryRuleFuncaoLerAnalogica"
    // InternalOiArdubot.g:878:1: entryRuleFuncaoLerAnalogica : ruleFuncaoLerAnalogica EOF ;
    public final void entryRuleFuncaoLerAnalogica() throws RecognitionException {
        try {
            // InternalOiArdubot.g:879:1: ( ruleFuncaoLerAnalogica EOF )
            // InternalOiArdubot.g:880:1: ruleFuncaoLerAnalogica EOF
            {
             before(grammarAccess.getFuncaoLerAnalogicaRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncaoLerAnalogica();

            state._fsp--;

             after(grammarAccess.getFuncaoLerAnalogicaRule()); 
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
    // $ANTLR end "entryRuleFuncaoLerAnalogica"


    // $ANTLR start "ruleFuncaoLerAnalogica"
    // InternalOiArdubot.g:887:1: ruleFuncaoLerAnalogica : ( ( rule__FuncaoLerAnalogica__Group__0 ) ) ;
    public final void ruleFuncaoLerAnalogica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:891:2: ( ( ( rule__FuncaoLerAnalogica__Group__0 ) ) )
            // InternalOiArdubot.g:892:2: ( ( rule__FuncaoLerAnalogica__Group__0 ) )
            {
            // InternalOiArdubot.g:892:2: ( ( rule__FuncaoLerAnalogica__Group__0 ) )
            // InternalOiArdubot.g:893:3: ( rule__FuncaoLerAnalogica__Group__0 )
            {
             before(grammarAccess.getFuncaoLerAnalogicaAccess().getGroup()); 
            // InternalOiArdubot.g:894:3: ( rule__FuncaoLerAnalogica__Group__0 )
            // InternalOiArdubot.g:894:4: rule__FuncaoLerAnalogica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncaoLerAnalogica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncaoLerAnalogicaAccess().getGroup()); 

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
    // $ANTLR end "ruleFuncaoLerAnalogica"


    // $ANTLR start "entryRuleEscrever"
    // InternalOiArdubot.g:903:1: entryRuleEscrever : ruleEscrever EOF ;
    public final void entryRuleEscrever() throws RecognitionException {
        try {
            // InternalOiArdubot.g:904:1: ( ruleEscrever EOF )
            // InternalOiArdubot.g:905:1: ruleEscrever EOF
            {
             before(grammarAccess.getEscreverRule()); 
            pushFollow(FOLLOW_1);
            ruleEscrever();

            state._fsp--;

             after(grammarAccess.getEscreverRule()); 
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
    // $ANTLR end "entryRuleEscrever"


    // $ANTLR start "ruleEscrever"
    // InternalOiArdubot.g:912:1: ruleEscrever : ( ( rule__Escrever__Group__0 ) ) ;
    public final void ruleEscrever() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:916:2: ( ( ( rule__Escrever__Group__0 ) ) )
            // InternalOiArdubot.g:917:2: ( ( rule__Escrever__Group__0 ) )
            {
            // InternalOiArdubot.g:917:2: ( ( rule__Escrever__Group__0 ) )
            // InternalOiArdubot.g:918:3: ( rule__Escrever__Group__0 )
            {
             before(grammarAccess.getEscreverAccess().getGroup()); 
            // InternalOiArdubot.g:919:3: ( rule__Escrever__Group__0 )
            // InternalOiArdubot.g:919:4: rule__Escrever__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Escrever__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEscreverAccess().getGroup()); 

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
    // $ANTLR end "ruleEscrever"


    // $ANTLR start "entryRuleTela"
    // InternalOiArdubot.g:928:1: entryRuleTela : ruleTela EOF ;
    public final void entryRuleTela() throws RecognitionException {
        try {
            // InternalOiArdubot.g:929:1: ( ruleTela EOF )
            // InternalOiArdubot.g:930:1: ruleTela EOF
            {
             before(grammarAccess.getTelaRule()); 
            pushFollow(FOLLOW_1);
            ruleTela();

            state._fsp--;

             after(grammarAccess.getTelaRule()); 
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
    // $ANTLR end "entryRuleTela"


    // $ANTLR start "ruleTela"
    // InternalOiArdubot.g:937:1: ruleTela : ( ( rule__Tela__Group__0 ) ) ;
    public final void ruleTela() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:941:2: ( ( ( rule__Tela__Group__0 ) ) )
            // InternalOiArdubot.g:942:2: ( ( rule__Tela__Group__0 ) )
            {
            // InternalOiArdubot.g:942:2: ( ( rule__Tela__Group__0 ) )
            // InternalOiArdubot.g:943:3: ( rule__Tela__Group__0 )
            {
             before(grammarAccess.getTelaAccess().getGroup()); 
            // InternalOiArdubot.g:944:3: ( rule__Tela__Group__0 )
            // InternalOiArdubot.g:944:4: rule__Tela__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tela__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTelaAccess().getGroup()); 

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
    // $ANTLR end "ruleTela"


    // $ANTLR start "entryRuleBip"
    // InternalOiArdubot.g:953:1: entryRuleBip : ruleBip EOF ;
    public final void entryRuleBip() throws RecognitionException {
        try {
            // InternalOiArdubot.g:954:1: ( ruleBip EOF )
            // InternalOiArdubot.g:955:1: ruleBip EOF
            {
             before(grammarAccess.getBipRule()); 
            pushFollow(FOLLOW_1);
            ruleBip();

            state._fsp--;

             after(grammarAccess.getBipRule()); 
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
    // $ANTLR end "entryRuleBip"


    // $ANTLR start "ruleBip"
    // InternalOiArdubot.g:962:1: ruleBip : ( ( rule__Bip__Group__0 ) ) ;
    public final void ruleBip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:966:2: ( ( ( rule__Bip__Group__0 ) ) )
            // InternalOiArdubot.g:967:2: ( ( rule__Bip__Group__0 ) )
            {
            // InternalOiArdubot.g:967:2: ( ( rule__Bip__Group__0 ) )
            // InternalOiArdubot.g:968:3: ( rule__Bip__Group__0 )
            {
             before(grammarAccess.getBipAccess().getGroup()); 
            // InternalOiArdubot.g:969:3: ( rule__Bip__Group__0 )
            // InternalOiArdubot.g:969:4: rule__Bip__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bip__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBipAccess().getGroup()); 

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
    // $ANTLR end "ruleBip"


    // $ANTLR start "entryRuleTipoBip"
    // InternalOiArdubot.g:978:1: entryRuleTipoBip : ruleTipoBip EOF ;
    public final void entryRuleTipoBip() throws RecognitionException {
        try {
            // InternalOiArdubot.g:979:1: ( ruleTipoBip EOF )
            // InternalOiArdubot.g:980:1: ruleTipoBip EOF
            {
             before(grammarAccess.getTipoBipRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoBip();

            state._fsp--;

             after(grammarAccess.getTipoBipRule()); 
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
    // $ANTLR end "entryRuleTipoBip"


    // $ANTLR start "ruleTipoBip"
    // InternalOiArdubot.g:987:1: ruleTipoBip : ( ( rule__TipoBip__Alternatives ) ) ;
    public final void ruleTipoBip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:991:2: ( ( ( rule__TipoBip__Alternatives ) ) )
            // InternalOiArdubot.g:992:2: ( ( rule__TipoBip__Alternatives ) )
            {
            // InternalOiArdubot.g:992:2: ( ( rule__TipoBip__Alternatives ) )
            // InternalOiArdubot.g:993:3: ( rule__TipoBip__Alternatives )
            {
             before(grammarAccess.getTipoBipAccess().getAlternatives()); 
            // InternalOiArdubot.g:994:3: ( rule__TipoBip__Alternatives )
            // InternalOiArdubot.g:994:4: rule__TipoBip__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoBip__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoBipAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTipoBip"


    // $ANTLR start "entryRuleLigar"
    // InternalOiArdubot.g:1003:1: entryRuleLigar : ruleLigar EOF ;
    public final void entryRuleLigar() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1004:1: ( ruleLigar EOF )
            // InternalOiArdubot.g:1005:1: ruleLigar EOF
            {
             before(grammarAccess.getLigarRule()); 
            pushFollow(FOLLOW_1);
            ruleLigar();

            state._fsp--;

             after(grammarAccess.getLigarRule()); 
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
    // $ANTLR end "entryRuleLigar"


    // $ANTLR start "ruleLigar"
    // InternalOiArdubot.g:1012:1: ruleLigar : ( ( rule__Ligar__Group__0 ) ) ;
    public final void ruleLigar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1016:2: ( ( ( rule__Ligar__Group__0 ) ) )
            // InternalOiArdubot.g:1017:2: ( ( rule__Ligar__Group__0 ) )
            {
            // InternalOiArdubot.g:1017:2: ( ( rule__Ligar__Group__0 ) )
            // InternalOiArdubot.g:1018:3: ( rule__Ligar__Group__0 )
            {
             before(grammarAccess.getLigarAccess().getGroup()); 
            // InternalOiArdubot.g:1019:3: ( rule__Ligar__Group__0 )
            // InternalOiArdubot.g:1019:4: rule__Ligar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ligar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLigarAccess().getGroup()); 

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
    // $ANTLR end "ruleLigar"


    // $ANTLR start "entryRuleDesligar"
    // InternalOiArdubot.g:1028:1: entryRuleDesligar : ruleDesligar EOF ;
    public final void entryRuleDesligar() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1029:1: ( ruleDesligar EOF )
            // InternalOiArdubot.g:1030:1: ruleDesligar EOF
            {
             before(grammarAccess.getDesligarRule()); 
            pushFollow(FOLLOW_1);
            ruleDesligar();

            state._fsp--;

             after(grammarAccess.getDesligarRule()); 
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
    // $ANTLR end "entryRuleDesligar"


    // $ANTLR start "ruleDesligar"
    // InternalOiArdubot.g:1037:1: ruleDesligar : ( ( rule__Desligar__Group__0 ) ) ;
    public final void ruleDesligar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1041:2: ( ( ( rule__Desligar__Group__0 ) ) )
            // InternalOiArdubot.g:1042:2: ( ( rule__Desligar__Group__0 ) )
            {
            // InternalOiArdubot.g:1042:2: ( ( rule__Desligar__Group__0 ) )
            // InternalOiArdubot.g:1043:3: ( rule__Desligar__Group__0 )
            {
             before(grammarAccess.getDesligarAccess().getGroup()); 
            // InternalOiArdubot.g:1044:3: ( rule__Desligar__Group__0 )
            // InternalOiArdubot.g:1044:4: rule__Desligar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Desligar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDesligarAccess().getGroup()); 

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
    // $ANTLR end "ruleDesligar"


    // $ANTLR start "entryRuleServo"
    // InternalOiArdubot.g:1053:1: entryRuleServo : ruleServo EOF ;
    public final void entryRuleServo() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1054:1: ( ruleServo EOF )
            // InternalOiArdubot.g:1055:1: ruleServo EOF
            {
             before(grammarAccess.getServoRule()); 
            pushFollow(FOLLOW_1);
            ruleServo();

            state._fsp--;

             after(grammarAccess.getServoRule()); 
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
    // $ANTLR end "entryRuleServo"


    // $ANTLR start "ruleServo"
    // InternalOiArdubot.g:1062:1: ruleServo : ( ( rule__Servo__Group__0 ) ) ;
    public final void ruleServo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1066:2: ( ( ( rule__Servo__Group__0 ) ) )
            // InternalOiArdubot.g:1067:2: ( ( rule__Servo__Group__0 ) )
            {
            // InternalOiArdubot.g:1067:2: ( ( rule__Servo__Group__0 ) )
            // InternalOiArdubot.g:1068:3: ( rule__Servo__Group__0 )
            {
             before(grammarAccess.getServoAccess().getGroup()); 
            // InternalOiArdubot.g:1069:3: ( rule__Servo__Group__0 )
            // InternalOiArdubot.g:1069:4: rule__Servo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Servo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServoAccess().getGroup()); 

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
    // $ANTLR end "ruleServo"


    // $ANTLR start "entryRuleMotorDC"
    // InternalOiArdubot.g:1078:1: entryRuleMotorDC : ruleMotorDC EOF ;
    public final void entryRuleMotorDC() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1079:1: ( ruleMotorDC EOF )
            // InternalOiArdubot.g:1080:1: ruleMotorDC EOF
            {
             before(grammarAccess.getMotorDCRule()); 
            pushFollow(FOLLOW_1);
            ruleMotorDC();

            state._fsp--;

             after(grammarAccess.getMotorDCRule()); 
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
    // $ANTLR end "entryRuleMotorDC"


    // $ANTLR start "ruleMotorDC"
    // InternalOiArdubot.g:1087:1: ruleMotorDC : ( ( rule__MotorDC__Group__0 ) ) ;
    public final void ruleMotorDC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1091:2: ( ( ( rule__MotorDC__Group__0 ) ) )
            // InternalOiArdubot.g:1092:2: ( ( rule__MotorDC__Group__0 ) )
            {
            // InternalOiArdubot.g:1092:2: ( ( rule__MotorDC__Group__0 ) )
            // InternalOiArdubot.g:1093:3: ( rule__MotorDC__Group__0 )
            {
             before(grammarAccess.getMotorDCAccess().getGroup()); 
            // InternalOiArdubot.g:1094:3: ( rule__MotorDC__Group__0 )
            // InternalOiArdubot.g:1094:4: rule__MotorDC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MotorDC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMotorDCAccess().getGroup()); 

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
    // $ANTLR end "ruleMotorDC"


    // $ANTLR start "entryRuleAndar"
    // InternalOiArdubot.g:1103:1: entryRuleAndar : ruleAndar EOF ;
    public final void entryRuleAndar() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1104:1: ( ruleAndar EOF )
            // InternalOiArdubot.g:1105:1: ruleAndar EOF
            {
             before(grammarAccess.getAndarRule()); 
            pushFollow(FOLLOW_1);
            ruleAndar();

            state._fsp--;

             after(grammarAccess.getAndarRule()); 
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
    // $ANTLR end "entryRuleAndar"


    // $ANTLR start "ruleAndar"
    // InternalOiArdubot.g:1112:1: ruleAndar : ( ( rule__Andar__Group__0 ) ) ;
    public final void ruleAndar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1116:2: ( ( ( rule__Andar__Group__0 ) ) )
            // InternalOiArdubot.g:1117:2: ( ( rule__Andar__Group__0 ) )
            {
            // InternalOiArdubot.g:1117:2: ( ( rule__Andar__Group__0 ) )
            // InternalOiArdubot.g:1118:3: ( rule__Andar__Group__0 )
            {
             before(grammarAccess.getAndarAccess().getGroup()); 
            // InternalOiArdubot.g:1119:3: ( rule__Andar__Group__0 )
            // InternalOiArdubot.g:1119:4: rule__Andar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Andar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndarAccess().getGroup()); 

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
    // $ANTLR end "ruleAndar"


    // $ANTLR start "entryRuleParar"
    // InternalOiArdubot.g:1128:1: entryRuleParar : ruleParar EOF ;
    public final void entryRuleParar() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1129:1: ( ruleParar EOF )
            // InternalOiArdubot.g:1130:1: ruleParar EOF
            {
             before(grammarAccess.getPararRule()); 
            pushFollow(FOLLOW_1);
            ruleParar();

            state._fsp--;

             after(grammarAccess.getPararRule()); 
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
    // $ANTLR end "entryRuleParar"


    // $ANTLR start "ruleParar"
    // InternalOiArdubot.g:1137:1: ruleParar : ( ( rule__Parar__Group__0 ) ) ;
    public final void ruleParar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1141:2: ( ( ( rule__Parar__Group__0 ) ) )
            // InternalOiArdubot.g:1142:2: ( ( rule__Parar__Group__0 ) )
            {
            // InternalOiArdubot.g:1142:2: ( ( rule__Parar__Group__0 ) )
            // InternalOiArdubot.g:1143:3: ( rule__Parar__Group__0 )
            {
             before(grammarAccess.getPararAccess().getGroup()); 
            // InternalOiArdubot.g:1144:3: ( rule__Parar__Group__0 )
            // InternalOiArdubot.g:1144:4: rule__Parar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPararAccess().getGroup()); 

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
    // $ANTLR end "ruleParar"


    // $ANTLR start "entryRulePara"
    // InternalOiArdubot.g:1153:1: entryRulePara : rulePara EOF ;
    public final void entryRulePara() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1154:1: ( rulePara EOF )
            // InternalOiArdubot.g:1155:1: rulePara EOF
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
    // InternalOiArdubot.g:1162:1: rulePara : ( ( rule__Para__Group__0 ) ) ;
    public final void rulePara() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1166:2: ( ( ( rule__Para__Group__0 ) ) )
            // InternalOiArdubot.g:1167:2: ( ( rule__Para__Group__0 ) )
            {
            // InternalOiArdubot.g:1167:2: ( ( rule__Para__Group__0 ) )
            // InternalOiArdubot.g:1168:3: ( rule__Para__Group__0 )
            {
             before(grammarAccess.getParaAccess().getGroup()); 
            // InternalOiArdubot.g:1169:3: ( rule__Para__Group__0 )
            // InternalOiArdubot.g:1169:4: rule__Para__Group__0
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


    // $ANTLR start "entryRuleFimPara"
    // InternalOiArdubot.g:1178:1: entryRuleFimPara : ruleFimPara EOF ;
    public final void entryRuleFimPara() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1179:1: ( ruleFimPara EOF )
            // InternalOiArdubot.g:1180:1: ruleFimPara EOF
            {
             before(grammarAccess.getFimParaRule()); 
            pushFollow(FOLLOW_1);
            ruleFimPara();

            state._fsp--;

             after(grammarAccess.getFimParaRule()); 
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
    // $ANTLR end "entryRuleFimPara"


    // $ANTLR start "ruleFimPara"
    // InternalOiArdubot.g:1187:1: ruleFimPara : ( ( rule__FimPara__NameAssignment ) ) ;
    public final void ruleFimPara() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1191:2: ( ( ( rule__FimPara__NameAssignment ) ) )
            // InternalOiArdubot.g:1192:2: ( ( rule__FimPara__NameAssignment ) )
            {
            // InternalOiArdubot.g:1192:2: ( ( rule__FimPara__NameAssignment ) )
            // InternalOiArdubot.g:1193:3: ( rule__FimPara__NameAssignment )
            {
             before(grammarAccess.getFimParaAccess().getNameAssignment()); 
            // InternalOiArdubot.g:1194:3: ( rule__FimPara__NameAssignment )
            // InternalOiArdubot.g:1194:4: rule__FimPara__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FimPara__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFimParaAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleFimPara"


    // $ANTLR start "entryRuleEnquanto"
    // InternalOiArdubot.g:1203:1: entryRuleEnquanto : ruleEnquanto EOF ;
    public final void entryRuleEnquanto() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1204:1: ( ruleEnquanto EOF )
            // InternalOiArdubot.g:1205:1: ruleEnquanto EOF
            {
             before(grammarAccess.getEnquantoRule()); 
            pushFollow(FOLLOW_1);
            ruleEnquanto();

            state._fsp--;

             after(grammarAccess.getEnquantoRule()); 
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
    // $ANTLR end "entryRuleEnquanto"


    // $ANTLR start "ruleEnquanto"
    // InternalOiArdubot.g:1212:1: ruleEnquanto : ( ( rule__Enquanto__Group__0 ) ) ;
    public final void ruleEnquanto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1216:2: ( ( ( rule__Enquanto__Group__0 ) ) )
            // InternalOiArdubot.g:1217:2: ( ( rule__Enquanto__Group__0 ) )
            {
            // InternalOiArdubot.g:1217:2: ( ( rule__Enquanto__Group__0 ) )
            // InternalOiArdubot.g:1218:3: ( rule__Enquanto__Group__0 )
            {
             before(grammarAccess.getEnquantoAccess().getGroup()); 
            // InternalOiArdubot.g:1219:3: ( rule__Enquanto__Group__0 )
            // InternalOiArdubot.g:1219:4: rule__Enquanto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enquanto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnquantoAccess().getGroup()); 

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
    // $ANTLR end "ruleEnquanto"


    // $ANTLR start "entryRuleRepita"
    // InternalOiArdubot.g:1228:1: entryRuleRepita : ruleRepita EOF ;
    public final void entryRuleRepita() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1229:1: ( ruleRepita EOF )
            // InternalOiArdubot.g:1230:1: ruleRepita EOF
            {
             before(grammarAccess.getRepitaRule()); 
            pushFollow(FOLLOW_1);
            ruleRepita();

            state._fsp--;

             after(grammarAccess.getRepitaRule()); 
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
    // $ANTLR end "entryRuleRepita"


    // $ANTLR start "ruleRepita"
    // InternalOiArdubot.g:1237:1: ruleRepita : ( ( rule__Repita__Group__0 ) ) ;
    public final void ruleRepita() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1241:2: ( ( ( rule__Repita__Group__0 ) ) )
            // InternalOiArdubot.g:1242:2: ( ( rule__Repita__Group__0 ) )
            {
            // InternalOiArdubot.g:1242:2: ( ( rule__Repita__Group__0 ) )
            // InternalOiArdubot.g:1243:3: ( rule__Repita__Group__0 )
            {
             before(grammarAccess.getRepitaAccess().getGroup()); 
            // InternalOiArdubot.g:1244:3: ( rule__Repita__Group__0 )
            // InternalOiArdubot.g:1244:4: rule__Repita__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Repita__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepitaAccess().getGroup()); 

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
    // $ANTLR end "ruleRepita"


    // $ANTLR start "entryRuleSe"
    // InternalOiArdubot.g:1253:1: entryRuleSe : ruleSe EOF ;
    public final void entryRuleSe() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1254:1: ( ruleSe EOF )
            // InternalOiArdubot.g:1255:1: ruleSe EOF
            {
             before(grammarAccess.getSeRule()); 
            pushFollow(FOLLOW_1);
            ruleSe();

            state._fsp--;

             after(grammarAccess.getSeRule()); 
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
    // $ANTLR end "entryRuleSe"


    // $ANTLR start "ruleSe"
    // InternalOiArdubot.g:1262:1: ruleSe : ( ( rule__Se__Group__0 ) ) ;
    public final void ruleSe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1266:2: ( ( ( rule__Se__Group__0 ) ) )
            // InternalOiArdubot.g:1267:2: ( ( rule__Se__Group__0 ) )
            {
            // InternalOiArdubot.g:1267:2: ( ( rule__Se__Group__0 ) )
            // InternalOiArdubot.g:1268:3: ( rule__Se__Group__0 )
            {
             before(grammarAccess.getSeAccess().getGroup()); 
            // InternalOiArdubot.g:1269:3: ( rule__Se__Group__0 )
            // InternalOiArdubot.g:1269:4: rule__Se__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Se__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeAccess().getGroup()); 

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
    // $ANTLR end "ruleSe"


    // $ANTLR start "entryRuleFimse"
    // InternalOiArdubot.g:1278:1: entryRuleFimse : ruleFimse EOF ;
    public final void entryRuleFimse() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1279:1: ( ruleFimse EOF )
            // InternalOiArdubot.g:1280:1: ruleFimse EOF
            {
             before(grammarAccess.getFimseRule()); 
            pushFollow(FOLLOW_1);
            ruleFimse();

            state._fsp--;

             after(grammarAccess.getFimseRule()); 
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
    // $ANTLR end "entryRuleFimse"


    // $ANTLR start "ruleFimse"
    // InternalOiArdubot.g:1287:1: ruleFimse : ( ( rule__Fimse__NameAssignment ) ) ;
    public final void ruleFimse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1291:2: ( ( ( rule__Fimse__NameAssignment ) ) )
            // InternalOiArdubot.g:1292:2: ( ( rule__Fimse__NameAssignment ) )
            {
            // InternalOiArdubot.g:1292:2: ( ( rule__Fimse__NameAssignment ) )
            // InternalOiArdubot.g:1293:3: ( rule__Fimse__NameAssignment )
            {
             before(grammarAccess.getFimseAccess().getNameAssignment()); 
            // InternalOiArdubot.g:1294:3: ( rule__Fimse__NameAssignment )
            // InternalOiArdubot.g:1294:4: rule__Fimse__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Fimse__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFimseAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleFimse"


    // $ANTLR start "entryRuleSenao"
    // InternalOiArdubot.g:1303:1: entryRuleSenao : ruleSenao EOF ;
    public final void entryRuleSenao() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1304:1: ( ruleSenao EOF )
            // InternalOiArdubot.g:1305:1: ruleSenao EOF
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
    // InternalOiArdubot.g:1312:1: ruleSenao : ( ( rule__Senao__Group__0 ) ) ;
    public final void ruleSenao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1316:2: ( ( ( rule__Senao__Group__0 ) ) )
            // InternalOiArdubot.g:1317:2: ( ( rule__Senao__Group__0 ) )
            {
            // InternalOiArdubot.g:1317:2: ( ( rule__Senao__Group__0 ) )
            // InternalOiArdubot.g:1318:3: ( rule__Senao__Group__0 )
            {
             before(grammarAccess.getSenaoAccess().getGroup()); 
            // InternalOiArdubot.g:1319:3: ( rule__Senao__Group__0 )
            // InternalOiArdubot.g:1319:4: rule__Senao__Group__0
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


    // $ANTLR start "entryRuleEscolha"
    // InternalOiArdubot.g:1328:1: entryRuleEscolha : ruleEscolha EOF ;
    public final void entryRuleEscolha() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1329:1: ( ruleEscolha EOF )
            // InternalOiArdubot.g:1330:1: ruleEscolha EOF
            {
             before(grammarAccess.getEscolhaRule()); 
            pushFollow(FOLLOW_1);
            ruleEscolha();

            state._fsp--;

             after(grammarAccess.getEscolhaRule()); 
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
    // $ANTLR end "entryRuleEscolha"


    // $ANTLR start "ruleEscolha"
    // InternalOiArdubot.g:1337:1: ruleEscolha : ( ( rule__Escolha__Group__0 ) ) ;
    public final void ruleEscolha() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1341:2: ( ( ( rule__Escolha__Group__0 ) ) )
            // InternalOiArdubot.g:1342:2: ( ( rule__Escolha__Group__0 ) )
            {
            // InternalOiArdubot.g:1342:2: ( ( rule__Escolha__Group__0 ) )
            // InternalOiArdubot.g:1343:3: ( rule__Escolha__Group__0 )
            {
             before(grammarAccess.getEscolhaAccess().getGroup()); 
            // InternalOiArdubot.g:1344:3: ( rule__Escolha__Group__0 )
            // InternalOiArdubot.g:1344:4: rule__Escolha__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Escolha__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEscolhaAccess().getGroup()); 

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
    // $ANTLR end "ruleEscolha"


    // $ANTLR start "entryRuleCaso"
    // InternalOiArdubot.g:1353:1: entryRuleCaso : ruleCaso EOF ;
    public final void entryRuleCaso() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1354:1: ( ruleCaso EOF )
            // InternalOiArdubot.g:1355:1: ruleCaso EOF
            {
             before(grammarAccess.getCasoRule()); 
            pushFollow(FOLLOW_1);
            ruleCaso();

            state._fsp--;

             after(grammarAccess.getCasoRule()); 
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
    // $ANTLR end "entryRuleCaso"


    // $ANTLR start "ruleCaso"
    // InternalOiArdubot.g:1362:1: ruleCaso : ( ( rule__Caso__Group__0 ) ) ;
    public final void ruleCaso() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1366:2: ( ( ( rule__Caso__Group__0 ) ) )
            // InternalOiArdubot.g:1367:2: ( ( rule__Caso__Group__0 ) )
            {
            // InternalOiArdubot.g:1367:2: ( ( rule__Caso__Group__0 ) )
            // InternalOiArdubot.g:1368:3: ( rule__Caso__Group__0 )
            {
             before(grammarAccess.getCasoAccess().getGroup()); 
            // InternalOiArdubot.g:1369:3: ( rule__Caso__Group__0 )
            // InternalOiArdubot.g:1369:4: rule__Caso__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Caso__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCasoAccess().getGroup()); 

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
    // $ANTLR end "ruleCaso"


    // $ANTLR start "entryRuleFuncao"
    // InternalOiArdubot.g:1378:1: entryRuleFuncao : ruleFuncao EOF ;
    public final void entryRuleFuncao() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1379:1: ( ruleFuncao EOF )
            // InternalOiArdubot.g:1380:1: ruleFuncao EOF
            {
             before(grammarAccess.getFuncaoRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncao();

            state._fsp--;

             after(grammarAccess.getFuncaoRule()); 
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
    // $ANTLR end "entryRuleFuncao"


    // $ANTLR start "ruleFuncao"
    // InternalOiArdubot.g:1387:1: ruleFuncao : ( ( rule__Funcao__Group__0 ) ) ;
    public final void ruleFuncao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1391:2: ( ( ( rule__Funcao__Group__0 ) ) )
            // InternalOiArdubot.g:1392:2: ( ( rule__Funcao__Group__0 ) )
            {
            // InternalOiArdubot.g:1392:2: ( ( rule__Funcao__Group__0 ) )
            // InternalOiArdubot.g:1393:3: ( rule__Funcao__Group__0 )
            {
             before(grammarAccess.getFuncaoAccess().getGroup()); 
            // InternalOiArdubot.g:1394:3: ( rule__Funcao__Group__0 )
            // InternalOiArdubot.g:1394:4: rule__Funcao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Funcao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncaoAccess().getGroup()); 

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
    // $ANTLR end "ruleFuncao"


    // $ANTLR start "entryRuleParametro"
    // InternalOiArdubot.g:1403:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1404:1: ( ruleParametro EOF )
            // InternalOiArdubot.g:1405:1: ruleParametro EOF
            {
             before(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getParametroRule()); 
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
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalOiArdubot.g:1412:1: ruleParametro : ( ( rule__Parametro__Group__0 ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1416:2: ( ( ( rule__Parametro__Group__0 ) ) )
            // InternalOiArdubot.g:1417:2: ( ( rule__Parametro__Group__0 ) )
            {
            // InternalOiArdubot.g:1417:2: ( ( rule__Parametro__Group__0 ) )
            // InternalOiArdubot.g:1418:3: ( rule__Parametro__Group__0 )
            {
             before(grammarAccess.getParametroAccess().getGroup()); 
            // InternalOiArdubot.g:1419:3: ( rule__Parametro__Group__0 )
            // InternalOiArdubot.g:1419:4: rule__Parametro__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getGroup()); 

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
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleEspera"
    // InternalOiArdubot.g:1428:1: entryRuleEspera : ruleEspera EOF ;
    public final void entryRuleEspera() throws RecognitionException {
        try {
            // InternalOiArdubot.g:1429:1: ( ruleEspera EOF )
            // InternalOiArdubot.g:1430:1: ruleEspera EOF
            {
             before(grammarAccess.getEsperaRule()); 
            pushFollow(FOLLOW_1);
            ruleEspera();

            state._fsp--;

             after(grammarAccess.getEsperaRule()); 
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
    // $ANTLR end "entryRuleEspera"


    // $ANTLR start "ruleEspera"
    // InternalOiArdubot.g:1437:1: ruleEspera : ( ( rule__Espera__Group__0 ) ) ;
    public final void ruleEspera() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1441:2: ( ( ( rule__Espera__Group__0 ) ) )
            // InternalOiArdubot.g:1442:2: ( ( rule__Espera__Group__0 ) )
            {
            // InternalOiArdubot.g:1442:2: ( ( rule__Espera__Group__0 ) )
            // InternalOiArdubot.g:1443:3: ( rule__Espera__Group__0 )
            {
             before(grammarAccess.getEsperaAccess().getGroup()); 
            // InternalOiArdubot.g:1444:3: ( rule__Espera__Group__0 )
            // InternalOiArdubot.g:1444:4: rule__Espera__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Espera__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEsperaAccess().getGroup()); 

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
    // $ANTLR end "ruleEspera"


    // $ANTLR start "ruleTipoPorta"
    // InternalOiArdubot.g:1453:1: ruleTipoPorta : ( ( rule__TipoPorta__Alternatives ) ) ;
    public final void ruleTipoPorta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1457:1: ( ( ( rule__TipoPorta__Alternatives ) ) )
            // InternalOiArdubot.g:1458:2: ( ( rule__TipoPorta__Alternatives ) )
            {
            // InternalOiArdubot.g:1458:2: ( ( rule__TipoPorta__Alternatives ) )
            // InternalOiArdubot.g:1459:3: ( rule__TipoPorta__Alternatives )
            {
             before(grammarAccess.getTipoPortaAccess().getAlternatives()); 
            // InternalOiArdubot.g:1460:3: ( rule__TipoPorta__Alternatives )
            // InternalOiArdubot.g:1460:4: rule__TipoPorta__Alternatives
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


    // $ANTLR start "ruleTipo"
    // InternalOiArdubot.g:1469:1: ruleTipo : ( ( rule__Tipo__Alternatives ) ) ;
    public final void ruleTipo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1473:1: ( ( ( rule__Tipo__Alternatives ) ) )
            // InternalOiArdubot.g:1474:2: ( ( rule__Tipo__Alternatives ) )
            {
            // InternalOiArdubot.g:1474:2: ( ( rule__Tipo__Alternatives ) )
            // InternalOiArdubot.g:1475:3: ( rule__Tipo__Alternatives )
            {
             before(grammarAccess.getTipoAccess().getAlternatives()); 
            // InternalOiArdubot.g:1476:3: ( rule__Tipo__Alternatives )
            // InternalOiArdubot.g:1476:4: rule__Tipo__Alternatives
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


    // $ANTLR start "ruleDirecao"
    // InternalOiArdubot.g:1485:1: ruleDirecao : ( ( rule__Direcao__Alternatives ) ) ;
    public final void ruleDirecao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1489:1: ( ( ( rule__Direcao__Alternatives ) ) )
            // InternalOiArdubot.g:1490:2: ( ( rule__Direcao__Alternatives ) )
            {
            // InternalOiArdubot.g:1490:2: ( ( rule__Direcao__Alternatives ) )
            // InternalOiArdubot.g:1491:3: ( rule__Direcao__Alternatives )
            {
             before(grammarAccess.getDirecaoAccess().getAlternatives()); 
            // InternalOiArdubot.g:1492:3: ( rule__Direcao__Alternatives )
            // InternalOiArdubot.g:1492:4: rule__Direcao__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direcao__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirecaoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDirecao"


    // $ANTLR start "rule__Implementacao__Alternatives"
    // InternalOiArdubot.g:1500:1: rule__Implementacao__Alternatives : ( ( ruleSe ) | ( ruleVariavelExistente ) | ( ruleTela ) | ( ruleLigar ) | ( ruleDesligar ) | ( ruleBip ) | ( ruleEscolha ) | ( rulePara ) | ( ruleEnquanto ) | ( ruleRepita ) | ( ruleLer ) | ( ruleServo ) | ( ruleMotorDC ) | ( ruleFuncao ) | ( ruleEspera ) | ( ruleEscrever ) | ( ruleLerDigital ) | ( ruleLerAnalogica ) | ( ruleAndar ) | ( ruleParar ) );
    public final void rule__Implementacao__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1504:1: ( ( ruleSe ) | ( ruleVariavelExistente ) | ( ruleTela ) | ( ruleLigar ) | ( ruleDesligar ) | ( ruleBip ) | ( ruleEscolha ) | ( rulePara ) | ( ruleEnquanto ) | ( ruleRepita ) | ( ruleLer ) | ( ruleServo ) | ( ruleMotorDC ) | ( ruleFuncao ) | ( ruleEspera ) | ( ruleEscrever ) | ( ruleLerDigital ) | ( ruleLerAnalogica ) | ( ruleAndar ) | ( ruleParar ) )
            int alt2=20;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalOiArdubot.g:1505:2: ( ruleSe )
                    {
                    // InternalOiArdubot.g:1505:2: ( ruleSe )
                    // InternalOiArdubot.g:1506:3: ruleSe
                    {
                     before(grammarAccess.getImplementacaoAccess().getSeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSe();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getSeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1511:2: ( ruleVariavelExistente )
                    {
                    // InternalOiArdubot.g:1511:2: ( ruleVariavelExistente )
                    // InternalOiArdubot.g:1512:3: ruleVariavelExistente
                    {
                     before(grammarAccess.getImplementacaoAccess().getVariavelExistenteParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariavelExistente();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getVariavelExistenteParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOiArdubot.g:1517:2: ( ruleTela )
                    {
                    // InternalOiArdubot.g:1517:2: ( ruleTela )
                    // InternalOiArdubot.g:1518:3: ruleTela
                    {
                     before(grammarAccess.getImplementacaoAccess().getTelaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTela();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getTelaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOiArdubot.g:1523:2: ( ruleLigar )
                    {
                    // InternalOiArdubot.g:1523:2: ( ruleLigar )
                    // InternalOiArdubot.g:1524:3: ruleLigar
                    {
                     before(grammarAccess.getImplementacaoAccess().getLigarParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLigar();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getLigarParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOiArdubot.g:1529:2: ( ruleDesligar )
                    {
                    // InternalOiArdubot.g:1529:2: ( ruleDesligar )
                    // InternalOiArdubot.g:1530:3: ruleDesligar
                    {
                     before(grammarAccess.getImplementacaoAccess().getDesligarParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDesligar();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getDesligarParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOiArdubot.g:1535:2: ( ruleBip )
                    {
                    // InternalOiArdubot.g:1535:2: ( ruleBip )
                    // InternalOiArdubot.g:1536:3: ruleBip
                    {
                     before(grammarAccess.getImplementacaoAccess().getBipParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleBip();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getBipParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOiArdubot.g:1541:2: ( ruleEscolha )
                    {
                    // InternalOiArdubot.g:1541:2: ( ruleEscolha )
                    // InternalOiArdubot.g:1542:3: ruleEscolha
                    {
                     before(grammarAccess.getImplementacaoAccess().getEscolhaParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEscolha();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getEscolhaParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOiArdubot.g:1547:2: ( rulePara )
                    {
                    // InternalOiArdubot.g:1547:2: ( rulePara )
                    // InternalOiArdubot.g:1548:3: rulePara
                    {
                     before(grammarAccess.getImplementacaoAccess().getParaParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    rulePara();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getParaParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalOiArdubot.g:1553:2: ( ruleEnquanto )
                    {
                    // InternalOiArdubot.g:1553:2: ( ruleEnquanto )
                    // InternalOiArdubot.g:1554:3: ruleEnquanto
                    {
                     before(grammarAccess.getImplementacaoAccess().getEnquantoParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleEnquanto();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getEnquantoParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalOiArdubot.g:1559:2: ( ruleRepita )
                    {
                    // InternalOiArdubot.g:1559:2: ( ruleRepita )
                    // InternalOiArdubot.g:1560:3: ruleRepita
                    {
                     before(grammarAccess.getImplementacaoAccess().getRepitaParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleRepita();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getRepitaParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalOiArdubot.g:1565:2: ( ruleLer )
                    {
                    // InternalOiArdubot.g:1565:2: ( ruleLer )
                    // InternalOiArdubot.g:1566:3: ruleLer
                    {
                     before(grammarAccess.getImplementacaoAccess().getLerParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleLer();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getLerParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalOiArdubot.g:1571:2: ( ruleServo )
                    {
                    // InternalOiArdubot.g:1571:2: ( ruleServo )
                    // InternalOiArdubot.g:1572:3: ruleServo
                    {
                     before(grammarAccess.getImplementacaoAccess().getServoParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleServo();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getServoParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalOiArdubot.g:1577:2: ( ruleMotorDC )
                    {
                    // InternalOiArdubot.g:1577:2: ( ruleMotorDC )
                    // InternalOiArdubot.g:1578:3: ruleMotorDC
                    {
                     before(grammarAccess.getImplementacaoAccess().getMotorDCParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleMotorDC();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getMotorDCParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalOiArdubot.g:1583:2: ( ruleFuncao )
                    {
                    // InternalOiArdubot.g:1583:2: ( ruleFuncao )
                    // InternalOiArdubot.g:1584:3: ruleFuncao
                    {
                     before(grammarAccess.getImplementacaoAccess().getFuncaoParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleFuncao();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getFuncaoParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalOiArdubot.g:1589:2: ( ruleEspera )
                    {
                    // InternalOiArdubot.g:1589:2: ( ruleEspera )
                    // InternalOiArdubot.g:1590:3: ruleEspera
                    {
                     before(grammarAccess.getImplementacaoAccess().getEsperaParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleEspera();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getEsperaParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalOiArdubot.g:1595:2: ( ruleEscrever )
                    {
                    // InternalOiArdubot.g:1595:2: ( ruleEscrever )
                    // InternalOiArdubot.g:1596:3: ruleEscrever
                    {
                     before(grammarAccess.getImplementacaoAccess().getEscreverParserRuleCall_15()); 
                    pushFollow(FOLLOW_2);
                    ruleEscrever();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getEscreverParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalOiArdubot.g:1601:2: ( ruleLerDigital )
                    {
                    // InternalOiArdubot.g:1601:2: ( ruleLerDigital )
                    // InternalOiArdubot.g:1602:3: ruleLerDigital
                    {
                     before(grammarAccess.getImplementacaoAccess().getLerDigitalParserRuleCall_16()); 
                    pushFollow(FOLLOW_2);
                    ruleLerDigital();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getLerDigitalParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalOiArdubot.g:1607:2: ( ruleLerAnalogica )
                    {
                    // InternalOiArdubot.g:1607:2: ( ruleLerAnalogica )
                    // InternalOiArdubot.g:1608:3: ruleLerAnalogica
                    {
                     before(grammarAccess.getImplementacaoAccess().getLerAnalogicaParserRuleCall_17()); 
                    pushFollow(FOLLOW_2);
                    ruleLerAnalogica();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getLerAnalogicaParserRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalOiArdubot.g:1613:2: ( ruleAndar )
                    {
                    // InternalOiArdubot.g:1613:2: ( ruleAndar )
                    // InternalOiArdubot.g:1614:3: ruleAndar
                    {
                     before(grammarAccess.getImplementacaoAccess().getAndarParserRuleCall_18()); 
                    pushFollow(FOLLOW_2);
                    ruleAndar();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getAndarParserRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalOiArdubot.g:1619:2: ( ruleParar )
                    {
                    // InternalOiArdubot.g:1619:2: ( ruleParar )
                    // InternalOiArdubot.g:1620:3: ruleParar
                    {
                     before(grammarAccess.getImplementacaoAccess().getPararParserRuleCall_19()); 
                    pushFollow(FOLLOW_2);
                    ruleParar();

                    state._fsp--;

                     after(grammarAccess.getImplementacaoAccess().getPararParserRuleCall_19()); 

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
    // $ANTLR end "rule__Implementacao__Alternatives"


    // $ANTLR start "rule__Porta__NameAlternatives_0"
    // InternalOiArdubot.g:1629:1: rule__Porta__NameAlternatives_0 : ( ( rulePortaDigital ) | ( rulePortaAnalogica ) );
    public final void rule__Porta__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1633:1: ( ( rulePortaDigital ) | ( rulePortaAnalogica ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_ANALOGICA:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOiArdubot.g:1634:2: ( rulePortaDigital )
                    {
                    // InternalOiArdubot.g:1634:2: ( rulePortaDigital )
                    // InternalOiArdubot.g:1635:3: rulePortaDigital
                    {
                     before(grammarAccess.getPortaAccess().getNamePortaDigitalParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePortaDigital();

                    state._fsp--;

                     after(grammarAccess.getPortaAccess().getNamePortaDigitalParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1640:2: ( rulePortaAnalogica )
                    {
                    // InternalOiArdubot.g:1640:2: ( rulePortaAnalogica )
                    // InternalOiArdubot.g:1641:3: rulePortaAnalogica
                    {
                     before(grammarAccess.getPortaAccess().getNamePortaAnalogicaParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePortaAnalogica();

                    state._fsp--;

                     after(grammarAccess.getPortaAccess().getNamePortaAnalogicaParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Porta__NameAlternatives_0"


    // $ANTLR start "rule__AnalogicaOuId__Alternatives"
    // InternalOiArdubot.g:1650:1: rule__AnalogicaOuId__Alternatives : ( ( RULE_ANALOGICA ) | ( RULE_ID ) );
    public final void rule__AnalogicaOuId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1654:1: ( ( RULE_ANALOGICA ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ANALOGICA) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOiArdubot.g:1655:2: ( RULE_ANALOGICA )
                    {
                    // InternalOiArdubot.g:1655:2: ( RULE_ANALOGICA )
                    // InternalOiArdubot.g:1656:3: RULE_ANALOGICA
                    {
                     before(grammarAccess.getAnalogicaOuIdAccess().getANALOGICATerminalRuleCall_0()); 
                    match(input,RULE_ANALOGICA,FOLLOW_2); 
                     after(grammarAccess.getAnalogicaOuIdAccess().getANALOGICATerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1661:2: ( RULE_ID )
                    {
                    // InternalOiArdubot.g:1661:2: ( RULE_ID )
                    // InternalOiArdubot.g:1662:3: RULE_ID
                    {
                     before(grammarAccess.getAnalogicaOuIdAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAnalogicaOuIdAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__AnalogicaOuId__Alternatives"


    // $ANTLR start "rule__DigitalOuId__Alternatives"
    // InternalOiArdubot.g:1671:1: rule__DigitalOuId__Alternatives : ( ( RULE_INT ) | ( RULE_ID ) );
    public final void rule__DigitalOuId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1675:1: ( ( RULE_INT ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOiArdubot.g:1676:2: ( RULE_INT )
                    {
                    // InternalOiArdubot.g:1676:2: ( RULE_INT )
                    // InternalOiArdubot.g:1677:3: RULE_INT
                    {
                     before(grammarAccess.getDigitalOuIdAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getDigitalOuIdAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1682:2: ( RULE_ID )
                    {
                    // InternalOiArdubot.g:1682:2: ( RULE_ID )
                    // InternalOiArdubot.g:1683:3: RULE_ID
                    {
                     before(grammarAccess.getDigitalOuIdAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getDigitalOuIdAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__DigitalOuId__Alternatives"


    // $ANTLR start "rule__ReceberValor__TipoAlternatives_0"
    // InternalOiArdubot.g:1692:1: rule__ReceberValor__TipoAlternatives_0 : ( ( ruleExistenteVariavelRecebe ) | ( ruleNovaVariavelRecebe ) );
    public final void rule__ReceberValor__TipoAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1696:1: ( ( ruleExistenteVariavelRecebe ) | ( ruleNovaVariavelRecebe ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=24 && LA6_0<=25)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOiArdubot.g:1697:2: ( ruleExistenteVariavelRecebe )
                    {
                    // InternalOiArdubot.g:1697:2: ( ruleExistenteVariavelRecebe )
                    // InternalOiArdubot.g:1698:3: ruleExistenteVariavelRecebe
                    {
                     before(grammarAccess.getReceberValorAccess().getTipoExistenteVariavelRecebeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExistenteVariavelRecebe();

                    state._fsp--;

                     after(grammarAccess.getReceberValorAccess().getTipoExistenteVariavelRecebeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1703:2: ( ruleNovaVariavelRecebe )
                    {
                    // InternalOiArdubot.g:1703:2: ( ruleNovaVariavelRecebe )
                    // InternalOiArdubot.g:1704:3: ruleNovaVariavelRecebe
                    {
                     before(grammarAccess.getReceberValorAccess().getTipoNovaVariavelRecebeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNovaVariavelRecebe();

                    state._fsp--;

                     after(grammarAccess.getReceberValorAccess().getTipoNovaVariavelRecebeParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__ReceberValor__TipoAlternatives_0"


    // $ANTLR start "rule__VariavelOuNumero__Alternatives"
    // InternalOiArdubot.g:1713:1: rule__VariavelOuNumero__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__VariavelOuNumero__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1717:1: ( ( RULE_ID ) | ( RULE_INT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOiArdubot.g:1718:2: ( RULE_ID )
                    {
                    // InternalOiArdubot.g:1718:2: ( RULE_ID )
                    // InternalOiArdubot.g:1719:3: RULE_ID
                    {
                     before(grammarAccess.getVariavelOuNumeroAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getVariavelOuNumeroAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1724:2: ( RULE_INT )
                    {
                    // InternalOiArdubot.g:1724:2: ( RULE_INT )
                    // InternalOiArdubot.g:1725:3: RULE_INT
                    {
                     before(grammarAccess.getVariavelOuNumeroAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getVariavelOuNumeroAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__VariavelOuNumero__Alternatives"


    // $ANTLR start "rule__ConteudoEscrever__Alternatives"
    // InternalOiArdubot.g:1734:1: rule__ConteudoEscrever__Alternatives : ( ( ruleNome ) | ( ruleTexto ) | ( ruleInteiro ) );
    public final void rule__ConteudoEscrever__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1738:1: ( ( ruleNome ) | ( ruleTexto ) | ( ruleInteiro ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalOiArdubot.g:1739:2: ( ruleNome )
                    {
                    // InternalOiArdubot.g:1739:2: ( ruleNome )
                    // InternalOiArdubot.g:1740:3: ruleNome
                    {
                     before(grammarAccess.getConteudoEscreverAccess().getNomeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNome();

                    state._fsp--;

                     after(grammarAccess.getConteudoEscreverAccess().getNomeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1745:2: ( ruleTexto )
                    {
                    // InternalOiArdubot.g:1745:2: ( ruleTexto )
                    // InternalOiArdubot.g:1746:3: ruleTexto
                    {
                     before(grammarAccess.getConteudoEscreverAccess().getTextoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTexto();

                    state._fsp--;

                     after(grammarAccess.getConteudoEscreverAccess().getTextoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOiArdubot.g:1751:2: ( ruleInteiro )
                    {
                    // InternalOiArdubot.g:1751:2: ( ruleInteiro )
                    // InternalOiArdubot.g:1752:3: ruleInteiro
                    {
                     before(grammarAccess.getConteudoEscreverAccess().getInteiroParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInteiro();

                    state._fsp--;

                     after(grammarAccess.getConteudoEscreverAccess().getInteiroParserRuleCall_2()); 

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
    // $ANTLR end "rule__ConteudoEscrever__Alternatives"


    // $ANTLR start "rule__TextoOuNumero__Alternatives"
    // InternalOiArdubot.g:1761:1: rule__TextoOuNumero__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__TextoOuNumero__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1765:1: ( ( RULE_STRING ) | ( RULE_INT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOiArdubot.g:1766:2: ( RULE_STRING )
                    {
                    // InternalOiArdubot.g:1766:2: ( RULE_STRING )
                    // InternalOiArdubot.g:1767:3: RULE_STRING
                    {
                     before(grammarAccess.getTextoOuNumeroAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getTextoOuNumeroAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1772:2: ( RULE_INT )
                    {
                    // InternalOiArdubot.g:1772:2: ( RULE_INT )
                    // InternalOiArdubot.g:1773:3: RULE_INT
                    {
                     before(grammarAccess.getTextoOuNumeroAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getTextoOuNumeroAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__TextoOuNumero__Alternatives"


    // $ANTLR start "rule__ValorLiteral__Alternatives"
    // InternalOiArdubot.g:1782:1: rule__ValorLiteral__Alternatives : ( ( ruleTextoOuNumero ) | ( RULE_ANALOGICA ) );
    public final void rule__ValorLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1786:1: ( ( ruleTextoOuNumero ) | ( RULE_ANALOGICA ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ANALOGICA) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOiArdubot.g:1787:2: ( ruleTextoOuNumero )
                    {
                    // InternalOiArdubot.g:1787:2: ( ruleTextoOuNumero )
                    // InternalOiArdubot.g:1788:3: ruleTextoOuNumero
                    {
                     before(grammarAccess.getValorLiteralAccess().getTextoOuNumeroParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTextoOuNumero();

                    state._fsp--;

                     after(grammarAccess.getValorLiteralAccess().getTextoOuNumeroParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1793:2: ( RULE_ANALOGICA )
                    {
                    // InternalOiArdubot.g:1793:2: ( RULE_ANALOGICA )
                    // InternalOiArdubot.g:1794:3: RULE_ANALOGICA
                    {
                     before(grammarAccess.getValorLiteralAccess().getANALOGICATerminalRuleCall_1()); 
                    match(input,RULE_ANALOGICA,FOLLOW_2); 
                     after(grammarAccess.getValorLiteralAccess().getANALOGICATerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ValorLiteral__Alternatives"


    // $ANTLR start "rule__VariavelValor__Alternatives"
    // InternalOiArdubot.g:1803:1: rule__VariavelValor__Alternatives : ( ( ruleValorLiteral ) | ( ruleValorReferencia ) );
    public final void rule__VariavelValor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1807:1: ( ( ruleValorLiteral ) | ( ruleValorReferencia ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ANALOGICA && LA11_0<=RULE_STRING)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalOiArdubot.g:1808:2: ( ruleValorLiteral )
                    {
                    // InternalOiArdubot.g:1808:2: ( ruleValorLiteral )
                    // InternalOiArdubot.g:1809:3: ruleValorLiteral
                    {
                     before(grammarAccess.getVariavelValorAccess().getValorLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValorLiteral();

                    state._fsp--;

                     after(grammarAccess.getVariavelValorAccess().getValorLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1814:2: ( ruleValorReferencia )
                    {
                    // InternalOiArdubot.g:1814:2: ( ruleValorReferencia )
                    // InternalOiArdubot.g:1815:3: ruleValorReferencia
                    {
                     before(grammarAccess.getVariavelValorAccess().getValorReferenciaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValorReferencia();

                    state._fsp--;

                     after(grammarAccess.getVariavelValorAccess().getValorReferenciaParserRuleCall_1()); 

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
    // $ANTLR end "rule__VariavelValor__Alternatives"


    // $ANTLR start "rule__DisplayValor__Alternatives"
    // InternalOiArdubot.g:1824:1: rule__DisplayValor__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__DisplayValor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1828:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case RULE_STRING:
                {
                alt12=2;
                }
                break;
            case RULE_INT:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalOiArdubot.g:1829:2: ( RULE_ID )
                    {
                    // InternalOiArdubot.g:1829:2: ( RULE_ID )
                    // InternalOiArdubot.g:1830:3: RULE_ID
                    {
                     before(grammarAccess.getDisplayValorAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getDisplayValorAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1835:2: ( RULE_STRING )
                    {
                    // InternalOiArdubot.g:1835:2: ( RULE_STRING )
                    // InternalOiArdubot.g:1836:3: RULE_STRING
                    {
                     before(grammarAccess.getDisplayValorAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getDisplayValorAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOiArdubot.g:1841:2: ( RULE_INT )
                    {
                    // InternalOiArdubot.g:1841:2: ( RULE_INT )
                    // InternalOiArdubot.g:1842:3: RULE_INT
                    {
                     before(grammarAccess.getDisplayValorAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getDisplayValorAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__DisplayValor__Alternatives"


    // $ANTLR start "rule__Logico__RelationAlternatives_0"
    // InternalOiArdubot.g:1851:1: rule__Logico__RelationAlternatives_0 : ( ( '=' ) | ( '<>' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) );
    public final void rule__Logico__RelationAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1855:1: ( ( '=' ) | ( '<>' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt13=1;
                }
                break;
            case 14:
                {
                alt13=2;
                }
                break;
            case 15:
                {
                alt13=3;
                }
                break;
            case 16:
                {
                alt13=4;
                }
                break;
            case 17:
                {
                alt13=5;
                }
                break;
            case 18:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalOiArdubot.g:1856:2: ( '=' )
                    {
                    // InternalOiArdubot.g:1856:2: ( '=' )
                    // InternalOiArdubot.g:1857:3: '='
                    {
                     before(grammarAccess.getLogicoAccess().getRelationEqualsSignKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLogicoAccess().getRelationEqualsSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1862:2: ( '<>' )
                    {
                    // InternalOiArdubot.g:1862:2: ( '<>' )
                    // InternalOiArdubot.g:1863:3: '<>'
                    {
                     before(grammarAccess.getLogicoAccess().getRelationLessThanSignGreaterThanSignKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLogicoAccess().getRelationLessThanSignGreaterThanSignKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOiArdubot.g:1868:2: ( '<' )
                    {
                    // InternalOiArdubot.g:1868:2: ( '<' )
                    // InternalOiArdubot.g:1869:3: '<'
                    {
                     before(grammarAccess.getLogicoAccess().getRelationLessThanSignKeyword_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLogicoAccess().getRelationLessThanSignKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOiArdubot.g:1874:2: ( '<=' )
                    {
                    // InternalOiArdubot.g:1874:2: ( '<=' )
                    // InternalOiArdubot.g:1875:3: '<='
                    {
                     before(grammarAccess.getLogicoAccess().getRelationLessThanSignEqualsSignKeyword_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLogicoAccess().getRelationLessThanSignEqualsSignKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOiArdubot.g:1880:2: ( '>=' )
                    {
                    // InternalOiArdubot.g:1880:2: ( '>=' )
                    // InternalOiArdubot.g:1881:3: '>='
                    {
                     before(grammarAccess.getLogicoAccess().getRelationGreaterThanSignEqualsSignKeyword_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLogicoAccess().getRelationGreaterThanSignEqualsSignKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOiArdubot.g:1886:2: ( '>' )
                    {
                    // InternalOiArdubot.g:1886:2: ( '>' )
                    // InternalOiArdubot.g:1887:3: '>'
                    {
                     before(grammarAccess.getLogicoAccess().getRelationGreaterThanSignKeyword_0_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getLogicoAccess().getRelationGreaterThanSignKeyword_0_5()); 

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
    // $ANTLR end "rule__Logico__RelationAlternatives_0"


    // $ANTLR start "rule__TipoBip__Alternatives"
    // InternalOiArdubot.g:1896:1: rule__TipoBip__Alternatives : ( ( 'curto' ) | ( 'medio' ) | ( 'longo' ) );
    public final void rule__TipoBip__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1900:1: ( ( 'curto' ) | ( 'medio' ) | ( 'longo' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt14=1;
                }
                break;
            case 20:
                {
                alt14=2;
                }
                break;
            case 21:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalOiArdubot.g:1901:2: ( 'curto' )
                    {
                    // InternalOiArdubot.g:1901:2: ( 'curto' )
                    // InternalOiArdubot.g:1902:3: 'curto'
                    {
                     before(grammarAccess.getTipoBipAccess().getCurtoKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTipoBipAccess().getCurtoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1907:2: ( 'medio' )
                    {
                    // InternalOiArdubot.g:1907:2: ( 'medio' )
                    // InternalOiArdubot.g:1908:3: 'medio'
                    {
                     before(grammarAccess.getTipoBipAccess().getMedioKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTipoBipAccess().getMedioKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOiArdubot.g:1913:2: ( 'longo' )
                    {
                    // InternalOiArdubot.g:1913:2: ( 'longo' )
                    // InternalOiArdubot.g:1914:3: 'longo'
                    {
                     before(grammarAccess.getTipoBipAccess().getLongoKeyword_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTipoBipAccess().getLongoKeyword_2()); 

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
    // $ANTLR end "rule__TipoBip__Alternatives"


    // $ANTLR start "rule__TipoPorta__Alternatives"
    // InternalOiArdubot.g:1923:1: rule__TipoPorta__Alternatives : ( ( ( 'DIGITAL' ) ) | ( ( 'ANALOGICA' ) ) );
    public final void rule__TipoPorta__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1927:1: ( ( ( 'DIGITAL' ) ) | ( ( 'ANALOGICA' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            else if ( (LA15_0==23) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalOiArdubot.g:1928:2: ( ( 'DIGITAL' ) )
                    {
                    // InternalOiArdubot.g:1928:2: ( ( 'DIGITAL' ) )
                    // InternalOiArdubot.g:1929:3: ( 'DIGITAL' )
                    {
                     before(grammarAccess.getTipoPortaAccess().getDIGITALEnumLiteralDeclaration_0()); 
                    // InternalOiArdubot.g:1930:3: ( 'DIGITAL' )
                    // InternalOiArdubot.g:1930:4: 'DIGITAL'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoPortaAccess().getDIGITALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1934:2: ( ( 'ANALOGICA' ) )
                    {
                    // InternalOiArdubot.g:1934:2: ( ( 'ANALOGICA' ) )
                    // InternalOiArdubot.g:1935:3: ( 'ANALOGICA' )
                    {
                     before(grammarAccess.getTipoPortaAccess().getANALOGICAEnumLiteralDeclaration_1()); 
                    // InternalOiArdubot.g:1936:3: ( 'ANALOGICA' )
                    // InternalOiArdubot.g:1936:4: 'ANALOGICA'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoPortaAccess().getANALOGICAEnumLiteralDeclaration_1()); 

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


    // $ANTLR start "rule__Tipo__Alternatives"
    // InternalOiArdubot.g:1944:1: rule__Tipo__Alternatives : ( ( ( 'Texto' ) ) | ( ( 'Numero' ) ) );
    public final void rule__Tipo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1948:1: ( ( ( 'Texto' ) ) | ( ( 'Numero' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalOiArdubot.g:1949:2: ( ( 'Texto' ) )
                    {
                    // InternalOiArdubot.g:1949:2: ( ( 'Texto' ) )
                    // InternalOiArdubot.g:1950:3: ( 'Texto' )
                    {
                     before(grammarAccess.getTipoAccess().getTextoEnumLiteralDeclaration_0()); 
                    // InternalOiArdubot.g:1951:3: ( 'Texto' )
                    // InternalOiArdubot.g:1951:4: 'Texto'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAccess().getTextoEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1955:2: ( ( 'Numero' ) )
                    {
                    // InternalOiArdubot.g:1955:2: ( ( 'Numero' ) )
                    // InternalOiArdubot.g:1956:3: ( 'Numero' )
                    {
                     before(grammarAccess.getTipoAccess().getNumeroEnumLiteralDeclaration_1()); 
                    // InternalOiArdubot.g:1957:3: ( 'Numero' )
                    // InternalOiArdubot.g:1957:4: 'Numero'
                    {
                    match(input,25,FOLLOW_2); 

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


    // $ANTLR start "rule__Direcao__Alternatives"
    // InternalOiArdubot.g:1965:1: rule__Direcao__Alternatives : ( ( ( 'FRENTE' ) ) | ( ( 'TRAS' ) ) );
    public final void rule__Direcao__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1969:1: ( ( ( 'FRENTE' ) ) | ( ( 'TRAS' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            else if ( (LA17_0==27) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalOiArdubot.g:1970:2: ( ( 'FRENTE' ) )
                    {
                    // InternalOiArdubot.g:1970:2: ( ( 'FRENTE' ) )
                    // InternalOiArdubot.g:1971:3: ( 'FRENTE' )
                    {
                     before(grammarAccess.getDirecaoAccess().getFRENTEEnumLiteralDeclaration_0()); 
                    // InternalOiArdubot.g:1972:3: ( 'FRENTE' )
                    // InternalOiArdubot.g:1972:4: 'FRENTE'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirecaoAccess().getFRENTEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1976:2: ( ( 'TRAS' ) )
                    {
                    // InternalOiArdubot.g:1976:2: ( ( 'TRAS' ) )
                    // InternalOiArdubot.g:1977:3: ( 'TRAS' )
                    {
                     before(grammarAccess.getDirecaoAccess().getTRASEnumLiteralDeclaration_1()); 
                    // InternalOiArdubot.g:1978:3: ( 'TRAS' )
                    // InternalOiArdubot.g:1978:4: 'TRAS'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirecaoAccess().getTRASEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Direcao__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalOiArdubot.g:1986:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:1990:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOiArdubot.g:1991:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalOiArdubot.g:1998:1: rule__Model__Group__0__Impl : ( ( rule__Model__VarAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2002:1: ( ( ( rule__Model__VarAssignment_0 )? ) )
            // InternalOiArdubot.g:2003:1: ( ( rule__Model__VarAssignment_0 )? )
            {
            // InternalOiArdubot.g:2003:1: ( ( rule__Model__VarAssignment_0 )? )
            // InternalOiArdubot.g:2004:2: ( rule__Model__VarAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getVarAssignment_0()); 
            // InternalOiArdubot.g:2005:2: ( rule__Model__VarAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==65) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOiArdubot.g:2005:3: rule__Model__VarAssignment_0
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
    // InternalOiArdubot.g:2013:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2017:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOiArdubot.g:2018:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalOiArdubot.g:2025:1: rule__Model__Group__1__Impl : ( ( rule__Model__VariaveisAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2029:1: ( ( ( rule__Model__VariaveisAssignment_1 )* ) )
            // InternalOiArdubot.g:2030:1: ( ( rule__Model__VariaveisAssignment_1 )* )
            {
            // InternalOiArdubot.g:2030:1: ( ( rule__Model__VariaveisAssignment_1 )* )
            // InternalOiArdubot.g:2031:2: ( rule__Model__VariaveisAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getVariaveisAssignment_1()); 
            // InternalOiArdubot.g:2032:2: ( rule__Model__VariaveisAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=24 && LA19_0<=25)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOiArdubot.g:2032:3: rule__Model__VariaveisAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__VariaveisAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalOiArdubot.g:2040:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2044:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOiArdubot.g:2045:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalOiArdubot.g:2052:1: rule__Model__Group__2__Impl : ( ( rule__Model__ConstantesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2056:1: ( ( ( rule__Model__ConstantesAssignment_2 )* ) )
            // InternalOiArdubot.g:2057:1: ( ( rule__Model__ConstantesAssignment_2 )* )
            {
            // InternalOiArdubot.g:2057:1: ( ( rule__Model__ConstantesAssignment_2 )* )
            // InternalOiArdubot.g:2058:2: ( rule__Model__ConstantesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getConstantesAssignment_2()); 
            // InternalOiArdubot.g:2059:2: ( rule__Model__ConstantesAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOiArdubot.g:2059:3: rule__Model__ConstantesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ConstantesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getConstantesAssignment_2()); 

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
    // InternalOiArdubot.g:2067:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2071:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalOiArdubot.g:2072:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // InternalOiArdubot.g:2079:1: rule__Model__Group__3__Impl : ( ( rule__Model__IniAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2083:1: ( ( ( rule__Model__IniAssignment_3 ) ) )
            // InternalOiArdubot.g:2084:1: ( ( rule__Model__IniAssignment_3 ) )
            {
            // InternalOiArdubot.g:2084:1: ( ( rule__Model__IniAssignment_3 ) )
            // InternalOiArdubot.g:2085:2: ( rule__Model__IniAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getIniAssignment_3()); 
            // InternalOiArdubot.g:2086:2: ( rule__Model__IniAssignment_3 )
            // InternalOiArdubot.g:2086:3: rule__Model__IniAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__IniAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getIniAssignment_3()); 

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


    // $ANTLR start "rule__Model__Group__4"
    // InternalOiArdubot.g:2094:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2098:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalOiArdubot.g:2099:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalOiArdubot.g:2106:1: rule__Model__Group__4__Impl : ( ( rule__Model__CodigoAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2110:1: ( ( ( rule__Model__CodigoAssignment_4 )* ) )
            // InternalOiArdubot.g:2111:1: ( ( rule__Model__CodigoAssignment_4 )* )
            {
            // InternalOiArdubot.g:2111:1: ( ( rule__Model__CodigoAssignment_4 )* )
            // InternalOiArdubot.g:2112:2: ( rule__Model__CodigoAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getCodigoAssignment_4()); 
            // InternalOiArdubot.g:2113:2: ( rule__Model__CodigoAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=24 && LA21_0<=25)||(LA21_0>=36 && LA21_0<=39)||(LA21_0>=41 && LA21_0<=46)||LA21_0==50||(LA21_0>=52 && LA21_0<=53)||LA21_0==56||LA21_0==60||LA21_0==64) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOiArdubot.g:2113:3: rule__Model__CodigoAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__CodigoAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCodigoAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalOiArdubot.g:2121:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2125:1: ( rule__Model__Group__5__Impl )
            // InternalOiArdubot.g:2126:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalOiArdubot.g:2132:1: rule__Model__Group__5__Impl : ( ( rule__Model__FimAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2136:1: ( ( ( rule__Model__FimAssignment_5 ) ) )
            // InternalOiArdubot.g:2137:1: ( ( rule__Model__FimAssignment_5 ) )
            {
            // InternalOiArdubot.g:2137:1: ( ( rule__Model__FimAssignment_5 ) )
            // InternalOiArdubot.g:2138:2: ( rule__Model__FimAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getFimAssignment_5()); 
            // InternalOiArdubot.g:2139:2: ( rule__Model__FimAssignment_5 )
            // InternalOiArdubot.g:2139:3: rule__Model__FimAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Model__FimAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFimAssignment_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__ExistenteVariavelRecebe__Group__0"
    // InternalOiArdubot.g:2148:1: rule__ExistenteVariavelRecebe__Group__0 : rule__ExistenteVariavelRecebe__Group__0__Impl rule__ExistenteVariavelRecebe__Group__1 ;
    public final void rule__ExistenteVariavelRecebe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2152:1: ( rule__ExistenteVariavelRecebe__Group__0__Impl rule__ExistenteVariavelRecebe__Group__1 )
            // InternalOiArdubot.g:2153:2: rule__ExistenteVariavelRecebe__Group__0__Impl rule__ExistenteVariavelRecebe__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExistenteVariavelRecebe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistenteVariavelRecebe__Group__1();

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
    // $ANTLR end "rule__ExistenteVariavelRecebe__Group__0"


    // $ANTLR start "rule__ExistenteVariavelRecebe__Group__0__Impl"
    // InternalOiArdubot.g:2160:1: rule__ExistenteVariavelRecebe__Group__0__Impl : ( ( rule__ExistenteVariavelRecebe__NameAssignment_0 ) ) ;
    public final void rule__ExistenteVariavelRecebe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2164:1: ( ( ( rule__ExistenteVariavelRecebe__NameAssignment_0 ) ) )
            // InternalOiArdubot.g:2165:1: ( ( rule__ExistenteVariavelRecebe__NameAssignment_0 ) )
            {
            // InternalOiArdubot.g:2165:1: ( ( rule__ExistenteVariavelRecebe__NameAssignment_0 ) )
            // InternalOiArdubot.g:2166:2: ( rule__ExistenteVariavelRecebe__NameAssignment_0 )
            {
             before(grammarAccess.getExistenteVariavelRecebeAccess().getNameAssignment_0()); 
            // InternalOiArdubot.g:2167:2: ( rule__ExistenteVariavelRecebe__NameAssignment_0 )
            // InternalOiArdubot.g:2167:3: rule__ExistenteVariavelRecebe__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExistenteVariavelRecebe__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExistenteVariavelRecebeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ExistenteVariavelRecebe__Group__0__Impl"


    // $ANTLR start "rule__ExistenteVariavelRecebe__Group__1"
    // InternalOiArdubot.g:2175:1: rule__ExistenteVariavelRecebe__Group__1 : rule__ExistenteVariavelRecebe__Group__1__Impl ;
    public final void rule__ExistenteVariavelRecebe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2179:1: ( rule__ExistenteVariavelRecebe__Group__1__Impl )
            // InternalOiArdubot.g:2180:2: rule__ExistenteVariavelRecebe__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistenteVariavelRecebe__Group__1__Impl();

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
    // $ANTLR end "rule__ExistenteVariavelRecebe__Group__1"


    // $ANTLR start "rule__ExistenteVariavelRecebe__Group__1__Impl"
    // InternalOiArdubot.g:2186:1: rule__ExistenteVariavelRecebe__Group__1__Impl : ( '<-' ) ;
    public final void rule__ExistenteVariavelRecebe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2190:1: ( ( '<-' ) )
            // InternalOiArdubot.g:2191:1: ( '<-' )
            {
            // InternalOiArdubot.g:2191:1: ( '<-' )
            // InternalOiArdubot.g:2192:2: '<-'
            {
             before(grammarAccess.getExistenteVariavelRecebeAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExistenteVariavelRecebeAccess().getLessThanSignHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__ExistenteVariavelRecebe__Group__1__Impl"


    // $ANTLR start "rule__NovaVariavelRecebe__Group__0"
    // InternalOiArdubot.g:2202:1: rule__NovaVariavelRecebe__Group__0 : rule__NovaVariavelRecebe__Group__0__Impl rule__NovaVariavelRecebe__Group__1 ;
    public final void rule__NovaVariavelRecebe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2206:1: ( rule__NovaVariavelRecebe__Group__0__Impl rule__NovaVariavelRecebe__Group__1 )
            // InternalOiArdubot.g:2207:2: rule__NovaVariavelRecebe__Group__0__Impl rule__NovaVariavelRecebe__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__NovaVariavelRecebe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NovaVariavelRecebe__Group__1();

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
    // $ANTLR end "rule__NovaVariavelRecebe__Group__0"


    // $ANTLR start "rule__NovaVariavelRecebe__Group__0__Impl"
    // InternalOiArdubot.g:2214:1: rule__NovaVariavelRecebe__Group__0__Impl : ( ruleVariavelNome ) ;
    public final void rule__NovaVariavelRecebe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2218:1: ( ( ruleVariavelNome ) )
            // InternalOiArdubot.g:2219:1: ( ruleVariavelNome )
            {
            // InternalOiArdubot.g:2219:1: ( ruleVariavelNome )
            // InternalOiArdubot.g:2220:2: ruleVariavelNome
            {
             before(grammarAccess.getNovaVariavelRecebeAccess().getVariavelNomeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelNome();

            state._fsp--;

             after(grammarAccess.getNovaVariavelRecebeAccess().getVariavelNomeParserRuleCall_0()); 

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
    // $ANTLR end "rule__NovaVariavelRecebe__Group__0__Impl"


    // $ANTLR start "rule__NovaVariavelRecebe__Group__1"
    // InternalOiArdubot.g:2229:1: rule__NovaVariavelRecebe__Group__1 : rule__NovaVariavelRecebe__Group__1__Impl ;
    public final void rule__NovaVariavelRecebe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2233:1: ( rule__NovaVariavelRecebe__Group__1__Impl )
            // InternalOiArdubot.g:2234:2: rule__NovaVariavelRecebe__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NovaVariavelRecebe__Group__1__Impl();

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
    // $ANTLR end "rule__NovaVariavelRecebe__Group__1"


    // $ANTLR start "rule__NovaVariavelRecebe__Group__1__Impl"
    // InternalOiArdubot.g:2240:1: rule__NovaVariavelRecebe__Group__1__Impl : ( '<-' ) ;
    public final void rule__NovaVariavelRecebe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2244:1: ( ( '<-' ) )
            // InternalOiArdubot.g:2245:1: ( '<-' )
            {
            // InternalOiArdubot.g:2245:1: ( '<-' )
            // InternalOiArdubot.g:2246:2: '<-'
            {
             before(grammarAccess.getNovaVariavelRecebeAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNovaVariavelRecebeAccess().getLessThanSignHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__NovaVariavelRecebe__Group__1__Impl"


    // $ANTLR start "rule__VariavelNome__Group__0"
    // InternalOiArdubot.g:2256:1: rule__VariavelNome__Group__0 : rule__VariavelNome__Group__0__Impl rule__VariavelNome__Group__1 ;
    public final void rule__VariavelNome__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2260:1: ( rule__VariavelNome__Group__0__Impl rule__VariavelNome__Group__1 )
            // InternalOiArdubot.g:2261:2: rule__VariavelNome__Group__0__Impl rule__VariavelNome__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__VariavelNome__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariavelNome__Group__1();

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
    // $ANTLR end "rule__VariavelNome__Group__0"


    // $ANTLR start "rule__VariavelNome__Group__0__Impl"
    // InternalOiArdubot.g:2268:1: rule__VariavelNome__Group__0__Impl : ( ( rule__VariavelNome__TipoAssignment_0 ) ) ;
    public final void rule__VariavelNome__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2272:1: ( ( ( rule__VariavelNome__TipoAssignment_0 ) ) )
            // InternalOiArdubot.g:2273:1: ( ( rule__VariavelNome__TipoAssignment_0 ) )
            {
            // InternalOiArdubot.g:2273:1: ( ( rule__VariavelNome__TipoAssignment_0 ) )
            // InternalOiArdubot.g:2274:2: ( rule__VariavelNome__TipoAssignment_0 )
            {
             before(grammarAccess.getVariavelNomeAccess().getTipoAssignment_0()); 
            // InternalOiArdubot.g:2275:2: ( rule__VariavelNome__TipoAssignment_0 )
            // InternalOiArdubot.g:2275:3: rule__VariavelNome__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariavelNome__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariavelNomeAccess().getTipoAssignment_0()); 

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
    // $ANTLR end "rule__VariavelNome__Group__0__Impl"


    // $ANTLR start "rule__VariavelNome__Group__1"
    // InternalOiArdubot.g:2283:1: rule__VariavelNome__Group__1 : rule__VariavelNome__Group__1__Impl ;
    public final void rule__VariavelNome__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2287:1: ( rule__VariavelNome__Group__1__Impl )
            // InternalOiArdubot.g:2288:2: rule__VariavelNome__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariavelNome__Group__1__Impl();

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
    // $ANTLR end "rule__VariavelNome__Group__1"


    // $ANTLR start "rule__VariavelNome__Group__1__Impl"
    // InternalOiArdubot.g:2294:1: rule__VariavelNome__Group__1__Impl : ( ( rule__VariavelNome__NameAssignment_1 ) ) ;
    public final void rule__VariavelNome__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2298:1: ( ( ( rule__VariavelNome__NameAssignment_1 ) ) )
            // InternalOiArdubot.g:2299:1: ( ( rule__VariavelNome__NameAssignment_1 ) )
            {
            // InternalOiArdubot.g:2299:1: ( ( rule__VariavelNome__NameAssignment_1 ) )
            // InternalOiArdubot.g:2300:2: ( rule__VariavelNome__NameAssignment_1 )
            {
             before(grammarAccess.getVariavelNomeAccess().getNameAssignment_1()); 
            // InternalOiArdubot.g:2301:2: ( rule__VariavelNome__NameAssignment_1 )
            // InternalOiArdubot.g:2301:3: rule__VariavelNome__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariavelNome__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariavelNomeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VariavelNome__Group__1__Impl"


    // $ANTLR start "rule__Variavel__Group__0"
    // InternalOiArdubot.g:2310:1: rule__Variavel__Group__0 : rule__Variavel__Group__0__Impl rule__Variavel__Group__1 ;
    public final void rule__Variavel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2314:1: ( rule__Variavel__Group__0__Impl rule__Variavel__Group__1 )
            // InternalOiArdubot.g:2315:2: rule__Variavel__Group__0__Impl rule__Variavel__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalOiArdubot.g:2322:1: rule__Variavel__Group__0__Impl : ( ( rule__Variavel__VariavelNomeAssignment_0 ) ) ;
    public final void rule__Variavel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2326:1: ( ( ( rule__Variavel__VariavelNomeAssignment_0 ) ) )
            // InternalOiArdubot.g:2327:1: ( ( rule__Variavel__VariavelNomeAssignment_0 ) )
            {
            // InternalOiArdubot.g:2327:1: ( ( rule__Variavel__VariavelNomeAssignment_0 ) )
            // InternalOiArdubot.g:2328:2: ( rule__Variavel__VariavelNomeAssignment_0 )
            {
             before(grammarAccess.getVariavelAccess().getVariavelNomeAssignment_0()); 
            // InternalOiArdubot.g:2329:2: ( rule__Variavel__VariavelNomeAssignment_0 )
            // InternalOiArdubot.g:2329:3: rule__Variavel__VariavelNomeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__VariavelNomeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariavelAccess().getVariavelNomeAssignment_0()); 

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
    // InternalOiArdubot.g:2337:1: rule__Variavel__Group__1 : rule__Variavel__Group__1__Impl rule__Variavel__Group__2 ;
    public final void rule__Variavel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2341:1: ( rule__Variavel__Group__1__Impl rule__Variavel__Group__2 )
            // InternalOiArdubot.g:2342:2: rule__Variavel__Group__1__Impl rule__Variavel__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalOiArdubot.g:2349:1: rule__Variavel__Group__1__Impl : ( ( rule__Variavel__Group_1__0 )? ) ;
    public final void rule__Variavel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2353:1: ( ( ( rule__Variavel__Group_1__0 )? ) )
            // InternalOiArdubot.g:2354:1: ( ( rule__Variavel__Group_1__0 )? )
            {
            // InternalOiArdubot.g:2354:1: ( ( rule__Variavel__Group_1__0 )? )
            // InternalOiArdubot.g:2355:2: ( rule__Variavel__Group_1__0 )?
            {
             before(grammarAccess.getVariavelAccess().getGroup_1()); 
            // InternalOiArdubot.g:2356:2: ( rule__Variavel__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOiArdubot.g:2356:3: rule__Variavel__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variavel__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariavelAccess().getGroup_1()); 

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
    // InternalOiArdubot.g:2364:1: rule__Variavel__Group__2 : rule__Variavel__Group__2__Impl ;
    public final void rule__Variavel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2368:1: ( rule__Variavel__Group__2__Impl )
            // InternalOiArdubot.g:2369:2: rule__Variavel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__Group__2__Impl();

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
    // InternalOiArdubot.g:2375:1: rule__Variavel__Group__2__Impl : ( ';' ) ;
    public final void rule__Variavel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2379:1: ( ( ';' ) )
            // InternalOiArdubot.g:2380:1: ( ';' )
            {
            // InternalOiArdubot.g:2380:1: ( ';' )
            // InternalOiArdubot.g:2381:2: ';'
            {
             before(grammarAccess.getVariavelAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVariavelAccess().getSemicolonKeyword_2()); 

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


    // $ANTLR start "rule__Variavel__Group_1__0"
    // InternalOiArdubot.g:2391:1: rule__Variavel__Group_1__0 : rule__Variavel__Group_1__0__Impl rule__Variavel__Group_1__1 ;
    public final void rule__Variavel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2395:1: ( rule__Variavel__Group_1__0__Impl rule__Variavel__Group_1__1 )
            // InternalOiArdubot.g:2396:2: rule__Variavel__Group_1__0__Impl rule__Variavel__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Variavel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variavel__Group_1__1();

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
    // $ANTLR end "rule__Variavel__Group_1__0"


    // $ANTLR start "rule__Variavel__Group_1__0__Impl"
    // InternalOiArdubot.g:2403:1: rule__Variavel__Group_1__0__Impl : ( '<-' ) ;
    public final void rule__Variavel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2407:1: ( ( '<-' ) )
            // InternalOiArdubot.g:2408:1: ( '<-' )
            {
            // InternalOiArdubot.g:2408:1: ( '<-' )
            // InternalOiArdubot.g:2409:2: '<-'
            {
             before(grammarAccess.getVariavelAccess().getLessThanSignHyphenMinusKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVariavelAccess().getLessThanSignHyphenMinusKeyword_1_0()); 

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
    // $ANTLR end "rule__Variavel__Group_1__0__Impl"


    // $ANTLR start "rule__Variavel__Group_1__1"
    // InternalOiArdubot.g:2418:1: rule__Variavel__Group_1__1 : rule__Variavel__Group_1__1__Impl ;
    public final void rule__Variavel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2422:1: ( rule__Variavel__Group_1__1__Impl )
            // InternalOiArdubot.g:2423:2: rule__Variavel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__Group_1__1__Impl();

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
    // $ANTLR end "rule__Variavel__Group_1__1"


    // $ANTLR start "rule__Variavel__Group_1__1__Impl"
    // InternalOiArdubot.g:2429:1: rule__Variavel__Group_1__1__Impl : ( ( rule__Variavel__ValorAssignment_1_1 ) ) ;
    public final void rule__Variavel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2433:1: ( ( ( rule__Variavel__ValorAssignment_1_1 ) ) )
            // InternalOiArdubot.g:2434:1: ( ( rule__Variavel__ValorAssignment_1_1 ) )
            {
            // InternalOiArdubot.g:2434:1: ( ( rule__Variavel__ValorAssignment_1_1 ) )
            // InternalOiArdubot.g:2435:2: ( rule__Variavel__ValorAssignment_1_1 )
            {
             before(grammarAccess.getVariavelAccess().getValorAssignment_1_1()); 
            // InternalOiArdubot.g:2436:2: ( rule__Variavel__ValorAssignment_1_1 )
            // InternalOiArdubot.g:2436:3: rule__Variavel__ValorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__ValorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariavelAccess().getValorAssignment_1_1()); 

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
    // $ANTLR end "rule__Variavel__Group_1__1__Impl"


    // $ANTLR start "rule__VariavelExistente__Group__0"
    // InternalOiArdubot.g:2445:1: rule__VariavelExistente__Group__0 : rule__VariavelExistente__Group__0__Impl rule__VariavelExistente__Group__1 ;
    public final void rule__VariavelExistente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2449:1: ( rule__VariavelExistente__Group__0__Impl rule__VariavelExistente__Group__1 )
            // InternalOiArdubot.g:2450:2: rule__VariavelExistente__Group__0__Impl rule__VariavelExistente__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__VariavelExistente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariavelExistente__Group__1();

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
    // $ANTLR end "rule__VariavelExistente__Group__0"


    // $ANTLR start "rule__VariavelExistente__Group__0__Impl"
    // InternalOiArdubot.g:2457:1: rule__VariavelExistente__Group__0__Impl : ( ( rule__VariavelExistente__AtribuicaoAssignment_0 ) ) ;
    public final void rule__VariavelExistente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2461:1: ( ( ( rule__VariavelExistente__AtribuicaoAssignment_0 ) ) )
            // InternalOiArdubot.g:2462:1: ( ( rule__VariavelExistente__AtribuicaoAssignment_0 ) )
            {
            // InternalOiArdubot.g:2462:1: ( ( rule__VariavelExistente__AtribuicaoAssignment_0 ) )
            // InternalOiArdubot.g:2463:2: ( rule__VariavelExistente__AtribuicaoAssignment_0 )
            {
             before(grammarAccess.getVariavelExistenteAccess().getAtribuicaoAssignment_0()); 
            // InternalOiArdubot.g:2464:2: ( rule__VariavelExistente__AtribuicaoAssignment_0 )
            // InternalOiArdubot.g:2464:3: rule__VariavelExistente__AtribuicaoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariavelExistente__AtribuicaoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariavelExistenteAccess().getAtribuicaoAssignment_0()); 

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
    // $ANTLR end "rule__VariavelExistente__Group__0__Impl"


    // $ANTLR start "rule__VariavelExistente__Group__1"
    // InternalOiArdubot.g:2472:1: rule__VariavelExistente__Group__1 : rule__VariavelExistente__Group__1__Impl rule__VariavelExistente__Group__2 ;
    public final void rule__VariavelExistente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2476:1: ( rule__VariavelExistente__Group__1__Impl rule__VariavelExistente__Group__2 )
            // InternalOiArdubot.g:2477:2: rule__VariavelExistente__Group__1__Impl rule__VariavelExistente__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__VariavelExistente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariavelExistente__Group__2();

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
    // $ANTLR end "rule__VariavelExistente__Group__1"


    // $ANTLR start "rule__VariavelExistente__Group__1__Impl"
    // InternalOiArdubot.g:2484:1: rule__VariavelExistente__Group__1__Impl : ( ( rule__VariavelExistente__ValorAssignment_1 ) ) ;
    public final void rule__VariavelExistente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2488:1: ( ( ( rule__VariavelExistente__ValorAssignment_1 ) ) )
            // InternalOiArdubot.g:2489:1: ( ( rule__VariavelExistente__ValorAssignment_1 ) )
            {
            // InternalOiArdubot.g:2489:1: ( ( rule__VariavelExistente__ValorAssignment_1 ) )
            // InternalOiArdubot.g:2490:2: ( rule__VariavelExistente__ValorAssignment_1 )
            {
             before(grammarAccess.getVariavelExistenteAccess().getValorAssignment_1()); 
            // InternalOiArdubot.g:2491:2: ( rule__VariavelExistente__ValorAssignment_1 )
            // InternalOiArdubot.g:2491:3: rule__VariavelExistente__ValorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariavelExistente__ValorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariavelExistenteAccess().getValorAssignment_1()); 

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
    // $ANTLR end "rule__VariavelExistente__Group__1__Impl"


    // $ANTLR start "rule__VariavelExistente__Group__2"
    // InternalOiArdubot.g:2499:1: rule__VariavelExistente__Group__2 : rule__VariavelExistente__Group__2__Impl ;
    public final void rule__VariavelExistente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2503:1: ( rule__VariavelExistente__Group__2__Impl )
            // InternalOiArdubot.g:2504:2: rule__VariavelExistente__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariavelExistente__Group__2__Impl();

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
    // $ANTLR end "rule__VariavelExistente__Group__2"


    // $ANTLR start "rule__VariavelExistente__Group__2__Impl"
    // InternalOiArdubot.g:2510:1: rule__VariavelExistente__Group__2__Impl : ( ';' ) ;
    public final void rule__VariavelExistente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2514:1: ( ( ';' ) )
            // InternalOiArdubot.g:2515:1: ( ';' )
            {
            // InternalOiArdubot.g:2515:1: ( ';' )
            // InternalOiArdubot.g:2516:2: ';'
            {
             before(grammarAccess.getVariavelExistenteAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVariavelExistenteAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__VariavelExistente__Group__2__Impl"


    // $ANTLR start "rule__ConstanteVariavel__Group__0"
    // InternalOiArdubot.g:2526:1: rule__ConstanteVariavel__Group__0 : rule__ConstanteVariavel__Group__0__Impl rule__ConstanteVariavel__Group__1 ;
    public final void rule__ConstanteVariavel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2530:1: ( rule__ConstanteVariavel__Group__0__Impl rule__ConstanteVariavel__Group__1 )
            // InternalOiArdubot.g:2531:2: rule__ConstanteVariavel__Group__0__Impl rule__ConstanteVariavel__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ConstanteVariavel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstanteVariavel__Group__1();

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
    // $ANTLR end "rule__ConstanteVariavel__Group__0"


    // $ANTLR start "rule__ConstanteVariavel__Group__0__Impl"
    // InternalOiArdubot.g:2538:1: rule__ConstanteVariavel__Group__0__Impl : ( ( rule__ConstanteVariavel__TipoAssignment_0 ) ) ;
    public final void rule__ConstanteVariavel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2542:1: ( ( ( rule__ConstanteVariavel__TipoAssignment_0 ) ) )
            // InternalOiArdubot.g:2543:1: ( ( rule__ConstanteVariavel__TipoAssignment_0 ) )
            {
            // InternalOiArdubot.g:2543:1: ( ( rule__ConstanteVariavel__TipoAssignment_0 ) )
            // InternalOiArdubot.g:2544:2: ( rule__ConstanteVariavel__TipoAssignment_0 )
            {
             before(grammarAccess.getConstanteVariavelAccess().getTipoAssignment_0()); 
            // InternalOiArdubot.g:2545:2: ( rule__ConstanteVariavel__TipoAssignment_0 )
            // InternalOiArdubot.g:2545:3: rule__ConstanteVariavel__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstanteVariavel__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstanteVariavelAccess().getTipoAssignment_0()); 

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
    // $ANTLR end "rule__ConstanteVariavel__Group__0__Impl"


    // $ANTLR start "rule__ConstanteVariavel__Group__1"
    // InternalOiArdubot.g:2553:1: rule__ConstanteVariavel__Group__1 : rule__ConstanteVariavel__Group__1__Impl rule__ConstanteVariavel__Group__2 ;
    public final void rule__ConstanteVariavel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2557:1: ( rule__ConstanteVariavel__Group__1__Impl rule__ConstanteVariavel__Group__2 )
            // InternalOiArdubot.g:2558:2: rule__ConstanteVariavel__Group__1__Impl rule__ConstanteVariavel__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ConstanteVariavel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstanteVariavel__Group__2();

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
    // $ANTLR end "rule__ConstanteVariavel__Group__1"


    // $ANTLR start "rule__ConstanteVariavel__Group__1__Impl"
    // InternalOiArdubot.g:2565:1: rule__ConstanteVariavel__Group__1__Impl : ( ( rule__ConstanteVariavel__VariavelNomeAssignment_1 ) ) ;
    public final void rule__ConstanteVariavel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2569:1: ( ( ( rule__ConstanteVariavel__VariavelNomeAssignment_1 ) ) )
            // InternalOiArdubot.g:2570:1: ( ( rule__ConstanteVariavel__VariavelNomeAssignment_1 ) )
            {
            // InternalOiArdubot.g:2570:1: ( ( rule__ConstanteVariavel__VariavelNomeAssignment_1 ) )
            // InternalOiArdubot.g:2571:2: ( rule__ConstanteVariavel__VariavelNomeAssignment_1 )
            {
             before(grammarAccess.getConstanteVariavelAccess().getVariavelNomeAssignment_1()); 
            // InternalOiArdubot.g:2572:2: ( rule__ConstanteVariavel__VariavelNomeAssignment_1 )
            // InternalOiArdubot.g:2572:3: rule__ConstanteVariavel__VariavelNomeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstanteVariavel__VariavelNomeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstanteVariavelAccess().getVariavelNomeAssignment_1()); 

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
    // $ANTLR end "rule__ConstanteVariavel__Group__1__Impl"


    // $ANTLR start "rule__ConstanteVariavel__Group__2"
    // InternalOiArdubot.g:2580:1: rule__ConstanteVariavel__Group__2 : rule__ConstanteVariavel__Group__2__Impl rule__ConstanteVariavel__Group__3 ;
    public final void rule__ConstanteVariavel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2584:1: ( rule__ConstanteVariavel__Group__2__Impl rule__ConstanteVariavel__Group__3 )
            // InternalOiArdubot.g:2585:2: rule__ConstanteVariavel__Group__2__Impl rule__ConstanteVariavel__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ConstanteVariavel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstanteVariavel__Group__3();

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
    // $ANTLR end "rule__ConstanteVariavel__Group__2"


    // $ANTLR start "rule__ConstanteVariavel__Group__2__Impl"
    // InternalOiArdubot.g:2592:1: rule__ConstanteVariavel__Group__2__Impl : ( '<-' ) ;
    public final void rule__ConstanteVariavel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2596:1: ( ( '<-' ) )
            // InternalOiArdubot.g:2597:1: ( '<-' )
            {
            // InternalOiArdubot.g:2597:1: ( '<-' )
            // InternalOiArdubot.g:2598:2: '<-'
            {
             before(grammarAccess.getConstanteVariavelAccess().getLessThanSignHyphenMinusKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConstanteVariavelAccess().getLessThanSignHyphenMinusKeyword_2()); 

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
    // $ANTLR end "rule__ConstanteVariavel__Group__2__Impl"


    // $ANTLR start "rule__ConstanteVariavel__Group__3"
    // InternalOiArdubot.g:2607:1: rule__ConstanteVariavel__Group__3 : rule__ConstanteVariavel__Group__3__Impl rule__ConstanteVariavel__Group__4 ;
    public final void rule__ConstanteVariavel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2611:1: ( rule__ConstanteVariavel__Group__3__Impl rule__ConstanteVariavel__Group__4 )
            // InternalOiArdubot.g:2612:2: rule__ConstanteVariavel__Group__3__Impl rule__ConstanteVariavel__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ConstanteVariavel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstanteVariavel__Group__4();

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
    // $ANTLR end "rule__ConstanteVariavel__Group__3"


    // $ANTLR start "rule__ConstanteVariavel__Group__3__Impl"
    // InternalOiArdubot.g:2619:1: rule__ConstanteVariavel__Group__3__Impl : ( ( rule__ConstanteVariavel__ValorAssignment_3 ) ) ;
    public final void rule__ConstanteVariavel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2623:1: ( ( ( rule__ConstanteVariavel__ValorAssignment_3 ) ) )
            // InternalOiArdubot.g:2624:1: ( ( rule__ConstanteVariavel__ValorAssignment_3 ) )
            {
            // InternalOiArdubot.g:2624:1: ( ( rule__ConstanteVariavel__ValorAssignment_3 ) )
            // InternalOiArdubot.g:2625:2: ( rule__ConstanteVariavel__ValorAssignment_3 )
            {
             before(grammarAccess.getConstanteVariavelAccess().getValorAssignment_3()); 
            // InternalOiArdubot.g:2626:2: ( rule__ConstanteVariavel__ValorAssignment_3 )
            // InternalOiArdubot.g:2626:3: rule__ConstanteVariavel__ValorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstanteVariavel__ValorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstanteVariavelAccess().getValorAssignment_3()); 

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
    // $ANTLR end "rule__ConstanteVariavel__Group__3__Impl"


    // $ANTLR start "rule__ConstanteVariavel__Group__4"
    // InternalOiArdubot.g:2634:1: rule__ConstanteVariavel__Group__4 : rule__ConstanteVariavel__Group__4__Impl ;
    public final void rule__ConstanteVariavel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2638:1: ( rule__ConstanteVariavel__Group__4__Impl )
            // InternalOiArdubot.g:2639:2: rule__ConstanteVariavel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstanteVariavel__Group__4__Impl();

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
    // $ANTLR end "rule__ConstanteVariavel__Group__4"


    // $ANTLR start "rule__ConstanteVariavel__Group__4__Impl"
    // InternalOiArdubot.g:2645:1: rule__ConstanteVariavel__Group__4__Impl : ( ';' ) ;
    public final void rule__ConstanteVariavel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2649:1: ( ( ';' ) )
            // InternalOiArdubot.g:2650:1: ( ';' )
            {
            // InternalOiArdubot.g:2650:1: ( ';' )
            // InternalOiArdubot.g:2651:2: ';'
            {
             before(grammarAccess.getConstanteVariavelAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConstanteVariavelAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__ConstanteVariavel__Group__4__Impl"


    // $ANTLR start "rule__Constante__Group__0"
    // InternalOiArdubot.g:2661:1: rule__Constante__Group__0 : rule__Constante__Group__0__Impl rule__Constante__Group__1 ;
    public final void rule__Constante__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2665:1: ( rule__Constante__Group__0__Impl rule__Constante__Group__1 )
            // InternalOiArdubot.g:2666:2: rule__Constante__Group__0__Impl rule__Constante__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Constante__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constante__Group__1();

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
    // $ANTLR end "rule__Constante__Group__0"


    // $ANTLR start "rule__Constante__Group__0__Impl"
    // InternalOiArdubot.g:2673:1: rule__Constante__Group__0__Impl : ( 'CONSTANTE' ) ;
    public final void rule__Constante__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2677:1: ( ( 'CONSTANTE' ) )
            // InternalOiArdubot.g:2678:1: ( 'CONSTANTE' )
            {
            // InternalOiArdubot.g:2678:1: ( 'CONSTANTE' )
            // InternalOiArdubot.g:2679:2: 'CONSTANTE'
            {
             before(grammarAccess.getConstanteAccess().getCONSTANTEKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConstanteAccess().getCONSTANTEKeyword_0()); 

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
    // $ANTLR end "rule__Constante__Group__0__Impl"


    // $ANTLR start "rule__Constante__Group__1"
    // InternalOiArdubot.g:2688:1: rule__Constante__Group__1 : rule__Constante__Group__1__Impl ;
    public final void rule__Constante__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2692:1: ( rule__Constante__Group__1__Impl )
            // InternalOiArdubot.g:2693:2: rule__Constante__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constante__Group__1__Impl();

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
    // $ANTLR end "rule__Constante__Group__1"


    // $ANTLR start "rule__Constante__Group__1__Impl"
    // InternalOiArdubot.g:2699:1: rule__Constante__Group__1__Impl : ( ( rule__Constante__VariavelAssignment_1 ) ) ;
    public final void rule__Constante__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2703:1: ( ( ( rule__Constante__VariavelAssignment_1 ) ) )
            // InternalOiArdubot.g:2704:1: ( ( rule__Constante__VariavelAssignment_1 ) )
            {
            // InternalOiArdubot.g:2704:1: ( ( rule__Constante__VariavelAssignment_1 ) )
            // InternalOiArdubot.g:2705:2: ( rule__Constante__VariavelAssignment_1 )
            {
             before(grammarAccess.getConstanteAccess().getVariavelAssignment_1()); 
            // InternalOiArdubot.g:2706:2: ( rule__Constante__VariavelAssignment_1 )
            // InternalOiArdubot.g:2706:3: rule__Constante__VariavelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constante__VariavelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstanteAccess().getVariavelAssignment_1()); 

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
    // $ANTLR end "rule__Constante__Group__1__Impl"


    // $ANTLR start "rule__Ler__Group__0"
    // InternalOiArdubot.g:2715:1: rule__Ler__Group__0 : rule__Ler__Group__0__Impl rule__Ler__Group__1 ;
    public final void rule__Ler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2719:1: ( rule__Ler__Group__0__Impl rule__Ler__Group__1 )
            // InternalOiArdubot.g:2720:2: rule__Ler__Group__0__Impl rule__Ler__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Ler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ler__Group__1();

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
    // $ANTLR end "rule__Ler__Group__0"


    // $ANTLR start "rule__Ler__Group__0__Impl"
    // InternalOiArdubot.g:2727:1: rule__Ler__Group__0__Impl : ( ( rule__Ler__AtribuicaoAssignment_0 ) ) ;
    public final void rule__Ler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2731:1: ( ( ( rule__Ler__AtribuicaoAssignment_0 ) ) )
            // InternalOiArdubot.g:2732:1: ( ( rule__Ler__AtribuicaoAssignment_0 ) )
            {
            // InternalOiArdubot.g:2732:1: ( ( rule__Ler__AtribuicaoAssignment_0 ) )
            // InternalOiArdubot.g:2733:2: ( rule__Ler__AtribuicaoAssignment_0 )
            {
             before(grammarAccess.getLerAccess().getAtribuicaoAssignment_0()); 
            // InternalOiArdubot.g:2734:2: ( rule__Ler__AtribuicaoAssignment_0 )
            // InternalOiArdubot.g:2734:3: rule__Ler__AtribuicaoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ler__AtribuicaoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLerAccess().getAtribuicaoAssignment_0()); 

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
    // $ANTLR end "rule__Ler__Group__0__Impl"


    // $ANTLR start "rule__Ler__Group__1"
    // InternalOiArdubot.g:2742:1: rule__Ler__Group__1 : rule__Ler__Group__1__Impl ;
    public final void rule__Ler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2746:1: ( rule__Ler__Group__1__Impl )
            // InternalOiArdubot.g:2747:2: rule__Ler__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ler__Group__1__Impl();

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
    // $ANTLR end "rule__Ler__Group__1"


    // $ANTLR start "rule__Ler__Group__1__Impl"
    // InternalOiArdubot.g:2753:1: rule__Ler__Group__1__Impl : ( ( rule__Ler__LerAssignment_1 ) ) ;
    public final void rule__Ler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2757:1: ( ( ( rule__Ler__LerAssignment_1 ) ) )
            // InternalOiArdubot.g:2758:1: ( ( rule__Ler__LerAssignment_1 ) )
            {
            // InternalOiArdubot.g:2758:1: ( ( rule__Ler__LerAssignment_1 ) )
            // InternalOiArdubot.g:2759:2: ( rule__Ler__LerAssignment_1 )
            {
             before(grammarAccess.getLerAccess().getLerAssignment_1()); 
            // InternalOiArdubot.g:2760:2: ( rule__Ler__LerAssignment_1 )
            // InternalOiArdubot.g:2760:3: rule__Ler__LerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ler__LerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLerAccess().getLerAssignment_1()); 

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
    // $ANTLR end "rule__Ler__Group__1__Impl"


    // $ANTLR start "rule__FuncaoLer__Group__0"
    // InternalOiArdubot.g:2769:1: rule__FuncaoLer__Group__0 : rule__FuncaoLer__Group__0__Impl rule__FuncaoLer__Group__1 ;
    public final void rule__FuncaoLer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2773:1: ( rule__FuncaoLer__Group__0__Impl rule__FuncaoLer__Group__1 )
            // InternalOiArdubot.g:2774:2: rule__FuncaoLer__Group__0__Impl rule__FuncaoLer__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__FuncaoLer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncaoLer__Group__1();

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
    // $ANTLR end "rule__FuncaoLer__Group__0"


    // $ANTLR start "rule__FuncaoLer__Group__0__Impl"
    // InternalOiArdubot.g:2781:1: rule__FuncaoLer__Group__0__Impl : ( 'ler' ) ;
    public final void rule__FuncaoLer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2785:1: ( ( 'ler' ) )
            // InternalOiArdubot.g:2786:1: ( 'ler' )
            {
            // InternalOiArdubot.g:2786:1: ( 'ler' )
            // InternalOiArdubot.g:2787:2: 'ler'
            {
             before(grammarAccess.getFuncaoLerAccess().getLerKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFuncaoLerAccess().getLerKeyword_0()); 

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
    // $ANTLR end "rule__FuncaoLer__Group__0__Impl"


    // $ANTLR start "rule__FuncaoLer__Group__1"
    // InternalOiArdubot.g:2796:1: rule__FuncaoLer__Group__1 : rule__FuncaoLer__Group__1__Impl rule__FuncaoLer__Group__2 ;
    public final void rule__FuncaoLer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2800:1: ( rule__FuncaoLer__Group__1__Impl rule__FuncaoLer__Group__2 )
            // InternalOiArdubot.g:2801:2: rule__FuncaoLer__Group__1__Impl rule__FuncaoLer__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__FuncaoLer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncaoLer__Group__2();

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
    // $ANTLR end "rule__FuncaoLer__Group__1"


    // $ANTLR start "rule__FuncaoLer__Group__1__Impl"
    // InternalOiArdubot.g:2808:1: rule__FuncaoLer__Group__1__Impl : ( '(' ) ;
    public final void rule__FuncaoLer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2812:1: ( ( '(' ) )
            // InternalOiArdubot.g:2813:1: ( '(' )
            {
            // InternalOiArdubot.g:2813:1: ( '(' )
            // InternalOiArdubot.g:2814:2: '('
            {
             before(grammarAccess.getFuncaoLerAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFuncaoLerAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FuncaoLer__Group__1__Impl"


    // $ANTLR start "rule__FuncaoLer__Group__2"
    // InternalOiArdubot.g:2823:1: rule__FuncaoLer__Group__2 : rule__FuncaoLer__Group__2__Impl rule__FuncaoLer__Group__3 ;
    public final void rule__FuncaoLer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2827:1: ( rule__FuncaoLer__Group__2__Impl rule__FuncaoLer__Group__3 )
            // InternalOiArdubot.g:2828:2: rule__FuncaoLer__Group__2__Impl rule__FuncaoLer__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__FuncaoLer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncaoLer__Group__3();

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
    // $ANTLR end "rule__FuncaoLer__Group__2"


    // $ANTLR start "rule__FuncaoLer__Group__2__Impl"
    // InternalOiArdubot.g:2835:1: rule__FuncaoLer__Group__2__Impl : ( ')' ) ;
    public final void rule__FuncaoLer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2839:1: ( ( ')' ) )
            // InternalOiArdubot.g:2840:1: ( ')' )
            {
            // InternalOiArdubot.g:2840:1: ( ')' )
            // InternalOiArdubot.g:2841:2: ')'
            {
             before(grammarAccess.getFuncaoLerAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFuncaoLerAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__FuncaoLer__Group__2__Impl"


    // $ANTLR start "rule__FuncaoLer__Group__3"
    // InternalOiArdubot.g:2850:1: rule__FuncaoLer__Group__3 : rule__FuncaoLer__Group__3__Impl ;
    public final void rule__FuncaoLer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2854:1: ( rule__FuncaoLer__Group__3__Impl )
            // InternalOiArdubot.g:2855:2: rule__FuncaoLer__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncaoLer__Group__3__Impl();

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
    // $ANTLR end "rule__FuncaoLer__Group__3"


    // $ANTLR start "rule__FuncaoLer__Group__3__Impl"
    // InternalOiArdubot.g:2861:1: rule__FuncaoLer__Group__3__Impl : ( ';' ) ;
    public final void rule__FuncaoLer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2865:1: ( ( ';' ) )
            // InternalOiArdubot.g:2866:1: ( ';' )
            {
            // InternalOiArdubot.g:2866:1: ( ';' )
            // InternalOiArdubot.g:2867:2: ';'
            {
             before(grammarAccess.getFuncaoLerAccess().getSemicolonKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFuncaoLerAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__FuncaoLer__Group__3__Impl"


    // $ANTLR start "rule__LerDigital__Group__0"
    // InternalOiArdubot.g:2877:1: rule__LerDigital__Group__0 : rule__LerDigital__Group__0__Impl rule__LerDigital__Group__1 ;
    public final void rule__LerDigital__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2881:1: ( rule__LerDigital__Group__0__Impl rule__LerDigital__Group__1 )
            // InternalOiArdubot.g:2882:2: rule__LerDigital__Group__0__Impl rule__LerDigital__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__LerDigital__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LerDigital__Group__1();

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
    // $ANTLR end "rule__LerDigital__Group__0"


    // $ANTLR start "rule__LerDigital__Group__0__Impl"
    // InternalOiArdubot.g:2889:1: rule__LerDigital__Group__0__Impl : ( ( rule__LerDigital__AtribuicaoAssignment_0 ) ) ;
    public final void rule__LerDigital__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2893:1: ( ( ( rule__LerDigital__AtribuicaoAssignment_0 ) ) )
            // InternalOiArdubot.g:2894:1: ( ( rule__LerDigital__AtribuicaoAssignment_0 ) )
            {
            // InternalOiArdubot.g:2894:1: ( ( rule__LerDigital__AtribuicaoAssignment_0 ) )
            // InternalOiArdubot.g:2895:2: ( rule__LerDigital__AtribuicaoAssignment_0 )
            {
             before(grammarAccess.getLerDigitalAccess().getAtribuicaoAssignment_0()); 
            // InternalOiArdubot.g:2896:2: ( rule__LerDigital__AtribuicaoAssignment_0 )
            // InternalOiArdubot.g:2896:3: rule__LerDigital__AtribuicaoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LerDigital__AtribuicaoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLerDigitalAccess().getAtribuicaoAssignment_0()); 

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
    // $ANTLR end "rule__LerDigital__Group__0__Impl"


    // $ANTLR start "rule__LerDigital__Group__1"
    // InternalOiArdubot.g:2904:1: rule__LerDigital__Group__1 : rule__LerDigital__Group__1__Impl ;
    public final void rule__LerDigital__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2908:1: ( rule__LerDigital__Group__1__Impl )
            // InternalOiArdubot.g:2909:2: rule__LerDigital__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LerDigital__Group__1__Impl();

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
    // $ANTLR end "rule__LerDigital__Group__1"


    // $ANTLR start "rule__LerDigital__Group__1__Impl"
    // InternalOiArdubot.g:2915:1: rule__LerDigital__Group__1__Impl : ( ( rule__LerDigital__LerAssignment_1 ) ) ;
    public final void rule__LerDigital__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2919:1: ( ( ( rule__LerDigital__LerAssignment_1 ) ) )
            // InternalOiArdubot.g:2920:1: ( ( rule__LerDigital__LerAssignment_1 ) )
            {
            // InternalOiArdubot.g:2920:1: ( ( rule__LerDigital__LerAssignment_1 ) )
            // InternalOiArdubot.g:2921:2: ( rule__LerDigital__LerAssignment_1 )
            {
             before(grammarAccess.getLerDigitalAccess().getLerAssignment_1()); 
            // InternalOiArdubot.g:2922:2: ( rule__LerDigital__LerAssignment_1 )
            // InternalOiArdubot.g:2922:3: rule__LerDigital__LerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LerDigital__LerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLerDigitalAccess().getLerAssignment_1()); 

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
    // $ANTLR end "rule__LerDigital__Group__1__Impl"


    // $ANTLR start "rule__FuncaoLerDigital__Group__0"
    // InternalOiArdubot.g:2931:1: rule__FuncaoLerDigital__Group__0 : rule__FuncaoLerDigital__Group__0__Impl rule__FuncaoLerDigital__Group__1 ;
    public final void rule__FuncaoLerDigital__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2935:1: ( rule__FuncaoLerDigital__Group__0__Impl rule__FuncaoLerDigital__Group__1 )
            // InternalOiArdubot.g:2936:2: rule__FuncaoLerDigital__Group__0__Impl rule__FuncaoLerDigital__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__FuncaoLerDigital__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncaoLerDigital__Group__1();

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
    // $ANTLR end "rule__FuncaoLerDigital__Group__0"


    // $ANTLR start "rule__FuncaoLerDigital__Group__0__Impl"
    // InternalOiArdubot.g:2943:1: rule__FuncaoLerDigital__Group__0__Impl : ( 'lerDigital' ) ;
    public final void rule__FuncaoLerDigital__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2947:1: ( ( 'lerDigital' ) )
            // InternalOiArdubot.g:2948:1: ( 'lerDigital' )
            {
            // InternalOiArdubot.g:2948:1: ( 'lerDigital' )
            // InternalOiArdubot.g:2949:2: 'lerDigital'
            {
             before(grammarAccess.getFuncaoLerDigitalAccess().getLerDigitalKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFuncaoLerDigitalAccess().getLerDigitalKeyword_0()); 

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
    // $ANTLR end "rule__FuncaoLerDigital__Group__0__Impl"


    // $ANTLR start "rule__FuncaoLerDigital__Group__1"
    // InternalOiArdubot.g:2958:1: rule__FuncaoLerDigital__Group__1 : rule__FuncaoLerDigital__Group__1__Impl rule__FuncaoLerDigital__Group__2 ;
    public final void rule__FuncaoLerDigital__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2962:1: ( rule__FuncaoLerDigital__Group__1__Impl rule__FuncaoLerDigital__Group__2 )
            // InternalOiArdubot.g:2963:2: rule__FuncaoLerDigital__Group__1__Impl rule__FuncaoLerDigital__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__FuncaoLerDigital__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncaoLerDigital__Group__2();

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
    // $ANTLR end "rule__FuncaoLerDigital__Group__1"


    // $ANTLR start "rule__FuncaoLerDigital__Group__1__Impl"
    // InternalOiArdubot.g:2970:1: rule__FuncaoLerDigital__Group__1__Impl : ( '(' ) ;
    public final void rule__FuncaoLerDigital__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2974:1: ( ( '(' ) )
            // InternalOiArdubot.g:2975:1: ( '(' )
            {
            // InternalOiArdubot.g:2975:1: ( '(' )
            // InternalOiArdubot.g:2976:2: '('
            {
             before(grammarAccess.getFuncaoLerDigitalAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFuncaoLerDigitalAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FuncaoLerDigital__Group__1__Impl"


    // $ANTLR start "rule__FuncaoLerDigital__Group__2"
    // InternalOiArdubot.g:2985:1: rule__FuncaoLerDigital__Group__2 : rule__FuncaoLerDigital__Group__2__Impl rule__FuncaoLerDigital__Group__3 ;
    public final void rule__FuncaoLerDigital__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:2989:1: ( rule__FuncaoLerDigital__Group__2__Impl rule__FuncaoLerDigital__Group__3 )
            // InternalOiArdubot.g:2990:2: rule__FuncaoLerDigital__Group__2__Impl rule__FuncaoLerDigital__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__FuncaoLerDigital__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncaoLerDigital__Group__3();

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
    // $ANTLR end "rule__FuncaoLerDigital__Group__2"


    // $ANTLR start "rule__FuncaoLerDigital__Group__2__Impl"
    // InternalOiArdubot.g:2997:1: rule__FuncaoLerDigital__Group__2__Impl : ( ( rule__FuncaoLerDigital__PortaAssignment_2 ) ) ;
    public final void rule__FuncaoLerDigital__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3001:1: ( ( ( rule__FuncaoLerDigital__PortaAssignment_2 ) ) )
            // InternalOiArdubot.g:3002:1: ( ( rule__FuncaoLerDigital__PortaAssignment_2 ) )
            {
            // InternalOiArdubot.g:3002:1: ( ( rule__FuncaoLerDigital__PortaAssignment_2 ) )
            // InternalOiArdubot.g:3003:2: ( rule__FuncaoLerDigital__PortaAssignment_2 )
            {
             before(grammarAccess.getFuncaoLerDigitalAccess().getPortaAssignment_2()); 
            // InternalOiArdubot.g:3004:2: ( rule__FuncaoLerDigital__PortaAssignment_2 )
            // InternalOiArdubot.g:3004:3: rule__FuncaoLerDigital__PortaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FuncaoLerDigital__PortaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFuncaoLerDigitalAccess().getPortaAssignment_2()); 

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
    // $ANTLR end "rule__FuncaoLerDigital__Group__2__Impl"


    // $ANTLR start "rule__FuncaoLerDigital__Group__3"
    // InternalOiArdubot.g:3012:1: rule__FuncaoLerDigital__Group__3 : rule__FuncaoLerDigital__Group__3__Impl rule__FuncaoLerDigital__Group__4 ;
    public final void rule__FuncaoLerDigital__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3016:1: ( rule__FuncaoLerDigital__Group__3__Impl rule__FuncaoLerDigital__Group__4 )
            // InternalOiArdubot.g:3017:2: rule__FuncaoLerDigital__Group__3__Impl rule__FuncaoLerDigital__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__FuncaoLerDigital__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncaoLerDigital__Group__4();

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
    // $ANTLR end "rule__FuncaoLerDigital__Group__3"


    // $ANTLR start "rule__FuncaoLerDigital__Group__3__Impl"
    // InternalOiArdubot.g:3024:1: rule__FuncaoLerDigital__Group__3__Impl : ( ')' ) ;
    public final void rule__FuncaoLerDigital__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3028:1: ( ( ')' ) )
            // InternalOiArdubot.g:3029:1: ( ')' )
            {
            // InternalOiArdubot.g:3029:1: ( ')' )
            // InternalOiArdubot.g:3030:2: ')'
            {
             before(grammarAccess.getFuncaoLerDigitalAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFuncaoLerDigitalAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__FuncaoLerDigital__Group__3__Impl"


    // $ANTLR start "rule__FuncaoLerDigital__Group__4"
    // InternalOiArdubot.g:3039:1: rule__FuncaoLerDigital__Group__4 : rule__FuncaoLerDigital__Group__4__Impl ;
    public final void rule__FuncaoLerDigital__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3043:1: ( rule__FuncaoLerDigital__Group__4__Impl )
            // InternalOiArdubot.g:3044:2: rule__FuncaoLerDigital__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncaoLerDigital__Group__4__Impl();

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
    // $ANTLR end "rule__FuncaoLerDigital__Group__4"


    // $ANTLR start "rule__FuncaoLerDigital__Group__4__Impl"
    // InternalOiArdubot.g:3050:1: rule__FuncaoLerDigital__Group__4__Impl : ( ';' ) ;
    public final void rule__FuncaoLerDigital__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3054:1: ( ( ';' ) )
            // InternalOiArdubot.g:3055:1: ( ';' )
            {
            // InternalOiArdubot.g:3055:1: ( ';' )
            // InternalOiArdubot.g:3056:2: ';'
            {
             before(grammarAccess.getFuncaoLerDigitalAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFuncaoLerDigitalAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__FuncaoLerDigital__Group__4__Impl"


    // $ANTLR start "rule__LerAnalogica__Group__0"
    // InternalOiArdubot.g:3066:1: rule__LerAnalogica__Group__0 : rule__LerAnalogica__Group__0__Impl rule__LerAnalogica__Group__1 ;
    public final void rule__LerAnalogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3070:1: ( rule__LerAnalogica__Group__0__Impl rule__LerAnalogica__Group__1 )
            // InternalOiArdubot.g:3071:2: rule__LerAnalogica__Group__0__Impl rule__LerAnalogica__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__LerAnalogica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LerAnalogica__Group__1();

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
    // $ANTLR end "rule__LerAnalogica__Group__0"


    // $ANTLR start "rule__LerAnalogica__Group__0__Impl"
    // InternalOiArdubot.g:3078:1: rule__LerAnalogica__Group__0__Impl : ( ( rule__LerAnalogica__AtribuicaoAssignment_0 ) ) ;
    public final void rule__LerAnalogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3082:1: ( ( ( rule__LerAnalogica__AtribuicaoAssignment_0 ) ) )
            // InternalOiArdubot.g:3083:1: ( ( rule__LerAnalogica__AtribuicaoAssignment_0 ) )
            {
            // InternalOiArdubot.g:3083:1: ( ( rule__LerAnalogica__AtribuicaoAssignment_0 ) )
            // InternalOiArdubot.g:3084:2: ( rule__LerAnalogica__AtribuicaoAssignment_0 )
            {
             before(grammarAccess.getLerAnalogicaAccess().getAtribuicaoAssignment_0()); 
            // InternalOiArdubot.g:3085:2: ( rule__LerAnalogica__AtribuicaoAssignment_0 )
            // InternalOiArdubot.g:3085:3: rule__LerAnalogica__AtribuicaoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LerAnalogica__AtribuicaoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLerAnalogicaAccess().getAtribuicaoAssignment_0()); 

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
    // $ANTLR end "rule__LerAnalogica__Group__0__Impl"


    // $ANTLR start "rule__LerAnalogica__Group__1"
    // InternalOiArdubot.g:3093:1: rule__LerAnalogica__Group__1 : rule__LerAnalogica__Group__1__Impl ;
    public final void rule__LerAnalogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3097:1: ( rule__LerAnalogica__Group__1__Impl )
            // InternalOiArdubot.g:3098:2: rule__LerAnalogica__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LerAnalogica__Group__1__Impl();

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
    // $ANTLR end "rule__LerAnalogica__Group__1"


    // $ANTLR start "rule__LerAnalogica__Group__1__Impl"
    // InternalOiArdubot.g:3104:1: rule__LerAnalogica__Group__1__Impl : ( ( rule__LerAnalogica__LerAssignment_1 ) ) ;
    public final void rule__LerAnalogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3108:1: ( ( ( rule__LerAnalogica__LerAssignment_1 ) ) )
            // InternalOiArdubot.g:3109:1: ( ( rule__LerAnalogica__LerAssignment_1 ) )
            {
            // InternalOiArdubot.g:3109:1: ( ( rule__LerAnalogica__LerAssignment_1 ) )
            // InternalOiArdubot.g:3110:2: ( rule__LerAnalogica__LerAssignment_1 )
            {
             before(grammarAccess.getLerAnalogicaAccess().getLerAssignment_1()); 
            // InternalOiArdubot.g:3111:2: ( rule__LerAnalogica__LerAssignment_1 )
            // InternalOiArdubot.g:3111:3: rule__LerAnalogica__LerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LerAnalogica__LerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLerAnalogicaAccess().getLerAssignment_1()); 

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
    // $ANTLR end "rule__LerAnalogica__Group__1__Impl"


    // $ANTLR start "rule__FuncaoLerAnalogica__Group__0"
    // InternalOiArdubot.g:3120:1: rule__FuncaoLerAnalogica__Group__0 : rule__FuncaoLerAnalogica__Group__0__Impl rule__FuncaoLerAnalogica__Group__1 ;
    public final void rule__FuncaoLerAnalogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3124:1: ( rule__FuncaoLerAnalogica__Group__0__Impl rule__FuncaoLerAnalogica__Group__1 )
            // InternalOiArdubot.g:3125:2: rule__FuncaoLerAnalogica__Group__0__Impl rule__FuncaoLerAnalogica__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__FuncaoLerAnalogica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncaoLerAnalogica__Group__1();

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
    // $ANTLR end "rule__FuncaoLerAnalogica__Group__0"


    // $ANTLR start "rule__FuncaoLerAnalogica__Group__0__Impl"
    // InternalOiArdubot.g:3132:1: rule__FuncaoLerAnalogica__Group__0__Impl : ( 'lerAnalogica' ) ;
    public final void rule__FuncaoLerAnalogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3136:1: ( ( 'lerAnalogica' ) )
            // InternalOiArdubot.g:3137:1: ( 'lerAnalogica' )
            {
            // InternalOiArdubot.g:3137:1: ( 'lerAnalogica' )
            // InternalOiArdubot.g:3138:2: 'lerAnalogica'
            {
             before(grammarAccess.getFuncaoLerAnalogicaAccess().getLerAnalogicaKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFuncaoLerAnalogicaAccess().getLerAnalogicaKeyword_0()); 

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
    // $ANTLR end "rule__FuncaoLerAnalogica__Group__0__Impl"


    // $ANTLR start "rule__FuncaoLerAnalogica__Group__1"
    // InternalOiArdubot.g:3147:1: rule__FuncaoLerAnalogica__Group__1 : rule__FuncaoLerAnalogica__Group__1__Impl rule__FuncaoLerAnalogica__Group__2 ;
    public final void rule__FuncaoLerAnalogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3151:1: ( rule__FuncaoLerAnalogica__Group__1__Impl rule__FuncaoLerAnalogica__Group__2 )
            // InternalOiArdubot.g:3152:2: rule__FuncaoLerAnalogica__Group__1__Impl rule__FuncaoLerAnalogica__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__FuncaoLerAnalogica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncaoLerAnalogica__Group__2();

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
    // $ANTLR end "rule__FuncaoLerAnalogica__Group__1"


    // $ANTLR start "rule__FuncaoLerAnalogica__Group__1__Impl"
    // InternalOiArdubot.g:3159:1: rule__FuncaoLerAnalogica__Group__1__Impl : ( '(' ) ;
    public final void rule__FuncaoLerAnalogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3163:1: ( ( '(' ) )
            // InternalOiArdubot.g:3164:1: ( '(' )
            {
            // InternalOiArdubot.g:3164:1: ( '(' )
            // InternalOiArdubot.g:3165:2: '('
            {
             before(grammarAccess.getFuncaoLerAnalogicaAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFuncaoLerAnalogicaAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FuncaoLerAnalogica__Group__1__Impl"


    // $ANTLR start "rule__FuncaoLerAnalogica__Group__2"
    // InternalOiArdubot.g:3174:1: rule__FuncaoLerAnalogica__Group__2 : rule__FuncaoLerAnalogica__Group__2__Impl rule__FuncaoLerAnalogica__Group__3 ;
    public final void rule__FuncaoLerAnalogica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3178:1: ( rule__FuncaoLerAnalogica__Group__2__Impl rule__FuncaoLerAnalogica__Group__3 )
            // InternalOiArdubot.g:3179:2: rule__FuncaoLerAnalogica__Group__2__Impl rule__FuncaoLerAnalogica__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__FuncaoLerAnalogica__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncaoLerAnalogica__Group__3();

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
    // $ANTLR end "rule__FuncaoLerAnalogica__Group__2"


    // $ANTLR start "rule__FuncaoLerAnalogica__Group__2__Impl"
    // InternalOiArdubot.g:3186:1: rule__FuncaoLerAnalogica__Group__2__Impl : ( ( rule__FuncaoLerAnalogica__PortaAssignment_2 ) ) ;
    public final void rule__FuncaoLerAnalogica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3190:1: ( ( ( rule__FuncaoLerAnalogica__PortaAssignment_2 ) ) )
            // InternalOiArdubot.g:3191:1: ( ( rule__FuncaoLerAnalogica__PortaAssignment_2 ) )
            {
            // InternalOiArdubot.g:3191:1: ( ( rule__FuncaoLerAnalogica__PortaAssignment_2 ) )
            // InternalOiArdubot.g:3192:2: ( rule__FuncaoLerAnalogica__PortaAssignment_2 )
            {
             before(grammarAccess.getFuncaoLerAnalogicaAccess().getPortaAssignment_2()); 
            // InternalOiArdubot.g:3193:2: ( rule__FuncaoLerAnalogica__PortaAssignment_2 )
            // InternalOiArdubot.g:3193:3: rule__FuncaoLerAnalogica__PortaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FuncaoLerAnalogica__PortaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFuncaoLerAnalogicaAccess().getPortaAssignment_2()); 

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
    // $ANTLR end "rule__FuncaoLerAnalogica__Group__2__Impl"


    // $ANTLR start "rule__FuncaoLerAnalogica__Group__3"
    // InternalOiArdubot.g:3201:1: rule__FuncaoLerAnalogica__Group__3 : rule__FuncaoLerAnalogica__Group__3__Impl rule__FuncaoLerAnalogica__Group__4 ;
    public final void rule__FuncaoLerAnalogica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3205:1: ( rule__FuncaoLerAnalogica__Group__3__Impl rule__FuncaoLerAnalogica__Group__4 )
            // InternalOiArdubot.g:3206:2: rule__FuncaoLerAnalogica__Group__3__Impl rule__FuncaoLerAnalogica__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__FuncaoLerAnalogica__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncaoLerAnalogica__Group__4();

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
    // $ANTLR end "rule__FuncaoLerAnalogica__Group__3"


    // $ANTLR start "rule__FuncaoLerAnalogica__Group__3__Impl"
    // InternalOiArdubot.g:3213:1: rule__FuncaoLerAnalogica__Group__3__Impl : ( ')' ) ;
    public final void rule__FuncaoLerAnalogica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3217:1: ( ( ')' ) )
            // InternalOiArdubot.g:3218:1: ( ')' )
            {
            // InternalOiArdubot.g:3218:1: ( ')' )
            // InternalOiArdubot.g:3219:2: ')'
            {
             before(grammarAccess.getFuncaoLerAnalogicaAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFuncaoLerAnalogicaAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__FuncaoLerAnalogica__Group__3__Impl"


    // $ANTLR start "rule__FuncaoLerAnalogica__Group__4"
    // InternalOiArdubot.g:3228:1: rule__FuncaoLerAnalogica__Group__4 : rule__FuncaoLerAnalogica__Group__4__Impl ;
    public final void rule__FuncaoLerAnalogica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3232:1: ( rule__FuncaoLerAnalogica__Group__4__Impl )
            // InternalOiArdubot.g:3233:2: rule__FuncaoLerAnalogica__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncaoLerAnalogica__Group__4__Impl();

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
    // $ANTLR end "rule__FuncaoLerAnalogica__Group__4"


    // $ANTLR start "rule__FuncaoLerAnalogica__Group__4__Impl"
    // InternalOiArdubot.g:3239:1: rule__FuncaoLerAnalogica__Group__4__Impl : ( ';' ) ;
    public final void rule__FuncaoLerAnalogica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3243:1: ( ( ';' ) )
            // InternalOiArdubot.g:3244:1: ( ';' )
            {
            // InternalOiArdubot.g:3244:1: ( ';' )
            // InternalOiArdubot.g:3245:2: ';'
            {
             before(grammarAccess.getFuncaoLerAnalogicaAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFuncaoLerAnalogicaAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__FuncaoLerAnalogica__Group__4__Impl"


    // $ANTLR start "rule__Escrever__Group__0"
    // InternalOiArdubot.g:3255:1: rule__Escrever__Group__0 : rule__Escrever__Group__0__Impl rule__Escrever__Group__1 ;
    public final void rule__Escrever__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3259:1: ( rule__Escrever__Group__0__Impl rule__Escrever__Group__1 )
            // InternalOiArdubot.g:3260:2: rule__Escrever__Group__0__Impl rule__Escrever__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Escrever__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escrever__Group__1();

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
    // $ANTLR end "rule__Escrever__Group__0"


    // $ANTLR start "rule__Escrever__Group__0__Impl"
    // InternalOiArdubot.g:3267:1: rule__Escrever__Group__0__Impl : ( 'escrever' ) ;
    public final void rule__Escrever__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3271:1: ( ( 'escrever' ) )
            // InternalOiArdubot.g:3272:1: ( 'escrever' )
            {
            // InternalOiArdubot.g:3272:1: ( 'escrever' )
            // InternalOiArdubot.g:3273:2: 'escrever'
            {
             before(grammarAccess.getEscreverAccess().getEscreverKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEscreverAccess().getEscreverKeyword_0()); 

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
    // $ANTLR end "rule__Escrever__Group__0__Impl"


    // $ANTLR start "rule__Escrever__Group__1"
    // InternalOiArdubot.g:3282:1: rule__Escrever__Group__1 : rule__Escrever__Group__1__Impl rule__Escrever__Group__2 ;
    public final void rule__Escrever__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3286:1: ( rule__Escrever__Group__1__Impl rule__Escrever__Group__2 )
            // InternalOiArdubot.g:3287:2: rule__Escrever__Group__1__Impl rule__Escrever__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Escrever__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escrever__Group__2();

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
    // $ANTLR end "rule__Escrever__Group__1"


    // $ANTLR start "rule__Escrever__Group__1__Impl"
    // InternalOiArdubot.g:3294:1: rule__Escrever__Group__1__Impl : ( ( rule__Escrever__MensagemAssignment_1 ) ) ;
    public final void rule__Escrever__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3298:1: ( ( ( rule__Escrever__MensagemAssignment_1 ) ) )
            // InternalOiArdubot.g:3299:1: ( ( rule__Escrever__MensagemAssignment_1 ) )
            {
            // InternalOiArdubot.g:3299:1: ( ( rule__Escrever__MensagemAssignment_1 ) )
            // InternalOiArdubot.g:3300:2: ( rule__Escrever__MensagemAssignment_1 )
            {
             before(grammarAccess.getEscreverAccess().getMensagemAssignment_1()); 
            // InternalOiArdubot.g:3301:2: ( rule__Escrever__MensagemAssignment_1 )
            // InternalOiArdubot.g:3301:3: rule__Escrever__MensagemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Escrever__MensagemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEscreverAccess().getMensagemAssignment_1()); 

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
    // $ANTLR end "rule__Escrever__Group__1__Impl"


    // $ANTLR start "rule__Escrever__Group__2"
    // InternalOiArdubot.g:3309:1: rule__Escrever__Group__2 : rule__Escrever__Group__2__Impl ;
    public final void rule__Escrever__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3313:1: ( rule__Escrever__Group__2__Impl )
            // InternalOiArdubot.g:3314:2: rule__Escrever__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Escrever__Group__2__Impl();

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
    // $ANTLR end "rule__Escrever__Group__2"


    // $ANTLR start "rule__Escrever__Group__2__Impl"
    // InternalOiArdubot.g:3320:1: rule__Escrever__Group__2__Impl : ( ';' ) ;
    public final void rule__Escrever__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3324:1: ( ( ';' ) )
            // InternalOiArdubot.g:3325:1: ( ';' )
            {
            // InternalOiArdubot.g:3325:1: ( ';' )
            // InternalOiArdubot.g:3326:2: ';'
            {
             before(grammarAccess.getEscreverAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEscreverAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Escrever__Group__2__Impl"


    // $ANTLR start "rule__Tela__Group__0"
    // InternalOiArdubot.g:3336:1: rule__Tela__Group__0 : rule__Tela__Group__0__Impl rule__Tela__Group__1 ;
    public final void rule__Tela__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3340:1: ( rule__Tela__Group__0__Impl rule__Tela__Group__1 )
            // InternalOiArdubot.g:3341:2: rule__Tela__Group__0__Impl rule__Tela__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Tela__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tela__Group__1();

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
    // $ANTLR end "rule__Tela__Group__0"


    // $ANTLR start "rule__Tela__Group__0__Impl"
    // InternalOiArdubot.g:3348:1: rule__Tela__Group__0__Impl : ( 'tela' ) ;
    public final void rule__Tela__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3352:1: ( ( 'tela' ) )
            // InternalOiArdubot.g:3353:1: ( 'tela' )
            {
            // InternalOiArdubot.g:3353:1: ( 'tela' )
            // InternalOiArdubot.g:3354:2: 'tela'
            {
             before(grammarAccess.getTelaAccess().getTelaKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTelaAccess().getTelaKeyword_0()); 

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
    // $ANTLR end "rule__Tela__Group__0__Impl"


    // $ANTLR start "rule__Tela__Group__1"
    // InternalOiArdubot.g:3363:1: rule__Tela__Group__1 : rule__Tela__Group__1__Impl rule__Tela__Group__2 ;
    public final void rule__Tela__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3367:1: ( rule__Tela__Group__1__Impl rule__Tela__Group__2 )
            // InternalOiArdubot.g:3368:2: rule__Tela__Group__1__Impl rule__Tela__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Tela__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tela__Group__2();

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
    // $ANTLR end "rule__Tela__Group__1"


    // $ANTLR start "rule__Tela__Group__1__Impl"
    // InternalOiArdubot.g:3375:1: rule__Tela__Group__1__Impl : ( ( rule__Tela__MensagemAssignment_1 ) ) ;
    public final void rule__Tela__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3379:1: ( ( ( rule__Tela__MensagemAssignment_1 ) ) )
            // InternalOiArdubot.g:3380:1: ( ( rule__Tela__MensagemAssignment_1 ) )
            {
            // InternalOiArdubot.g:3380:1: ( ( rule__Tela__MensagemAssignment_1 ) )
            // InternalOiArdubot.g:3381:2: ( rule__Tela__MensagemAssignment_1 )
            {
             before(grammarAccess.getTelaAccess().getMensagemAssignment_1()); 
            // InternalOiArdubot.g:3382:2: ( rule__Tela__MensagemAssignment_1 )
            // InternalOiArdubot.g:3382:3: rule__Tela__MensagemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tela__MensagemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTelaAccess().getMensagemAssignment_1()); 

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
    // $ANTLR end "rule__Tela__Group__1__Impl"


    // $ANTLR start "rule__Tela__Group__2"
    // InternalOiArdubot.g:3390:1: rule__Tela__Group__2 : rule__Tela__Group__2__Impl ;
    public final void rule__Tela__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3394:1: ( rule__Tela__Group__2__Impl )
            // InternalOiArdubot.g:3395:2: rule__Tela__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tela__Group__2__Impl();

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
    // $ANTLR end "rule__Tela__Group__2"


    // $ANTLR start "rule__Tela__Group__2__Impl"
    // InternalOiArdubot.g:3401:1: rule__Tela__Group__2__Impl : ( ';' ) ;
    public final void rule__Tela__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3405:1: ( ( ';' ) )
            // InternalOiArdubot.g:3406:1: ( ';' )
            {
            // InternalOiArdubot.g:3406:1: ( ';' )
            // InternalOiArdubot.g:3407:2: ';'
            {
             before(grammarAccess.getTelaAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTelaAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Tela__Group__2__Impl"


    // $ANTLR start "rule__Bip__Group__0"
    // InternalOiArdubot.g:3417:1: rule__Bip__Group__0 : rule__Bip__Group__0__Impl rule__Bip__Group__1 ;
    public final void rule__Bip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3421:1: ( rule__Bip__Group__0__Impl rule__Bip__Group__1 )
            // InternalOiArdubot.g:3422:2: rule__Bip__Group__0__Impl rule__Bip__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Bip__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bip__Group__1();

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
    // $ANTLR end "rule__Bip__Group__0"


    // $ANTLR start "rule__Bip__Group__0__Impl"
    // InternalOiArdubot.g:3429:1: rule__Bip__Group__0__Impl : ( 'bip' ) ;
    public final void rule__Bip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3433:1: ( ( 'bip' ) )
            // InternalOiArdubot.g:3434:1: ( 'bip' )
            {
            // InternalOiArdubot.g:3434:1: ( 'bip' )
            // InternalOiArdubot.g:3435:2: 'bip'
            {
             before(grammarAccess.getBipAccess().getBipKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBipAccess().getBipKeyword_0()); 

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
    // $ANTLR end "rule__Bip__Group__0__Impl"


    // $ANTLR start "rule__Bip__Group__1"
    // InternalOiArdubot.g:3444:1: rule__Bip__Group__1 : rule__Bip__Group__1__Impl rule__Bip__Group__2 ;
    public final void rule__Bip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3448:1: ( rule__Bip__Group__1__Impl rule__Bip__Group__2 )
            // InternalOiArdubot.g:3449:2: rule__Bip__Group__1__Impl rule__Bip__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Bip__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bip__Group__2();

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
    // $ANTLR end "rule__Bip__Group__1"


    // $ANTLR start "rule__Bip__Group__1__Impl"
    // InternalOiArdubot.g:3456:1: rule__Bip__Group__1__Impl : ( '(' ) ;
    public final void rule__Bip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3460:1: ( ( '(' ) )
            // InternalOiArdubot.g:3461:1: ( '(' )
            {
            // InternalOiArdubot.g:3461:1: ( '(' )
            // InternalOiArdubot.g:3462:2: '('
            {
             before(grammarAccess.getBipAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBipAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Bip__Group__1__Impl"


    // $ANTLR start "rule__Bip__Group__2"
    // InternalOiArdubot.g:3471:1: rule__Bip__Group__2 : rule__Bip__Group__2__Impl rule__Bip__Group__3 ;
    public final void rule__Bip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3475:1: ( rule__Bip__Group__2__Impl rule__Bip__Group__3 )
            // InternalOiArdubot.g:3476:2: rule__Bip__Group__2__Impl rule__Bip__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Bip__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bip__Group__3();

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
    // $ANTLR end "rule__Bip__Group__2"


    // $ANTLR start "rule__Bip__Group__2__Impl"
    // InternalOiArdubot.g:3483:1: rule__Bip__Group__2__Impl : ( ( rule__Bip__TipoAssignment_2 ) ) ;
    public final void rule__Bip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3487:1: ( ( ( rule__Bip__TipoAssignment_2 ) ) )
            // InternalOiArdubot.g:3488:1: ( ( rule__Bip__TipoAssignment_2 ) )
            {
            // InternalOiArdubot.g:3488:1: ( ( rule__Bip__TipoAssignment_2 ) )
            // InternalOiArdubot.g:3489:2: ( rule__Bip__TipoAssignment_2 )
            {
             before(grammarAccess.getBipAccess().getTipoAssignment_2()); 
            // InternalOiArdubot.g:3490:2: ( rule__Bip__TipoAssignment_2 )
            // InternalOiArdubot.g:3490:3: rule__Bip__TipoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Bip__TipoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBipAccess().getTipoAssignment_2()); 

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
    // $ANTLR end "rule__Bip__Group__2__Impl"


    // $ANTLR start "rule__Bip__Group__3"
    // InternalOiArdubot.g:3498:1: rule__Bip__Group__3 : rule__Bip__Group__3__Impl rule__Bip__Group__4 ;
    public final void rule__Bip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3502:1: ( rule__Bip__Group__3__Impl rule__Bip__Group__4 )
            // InternalOiArdubot.g:3503:2: rule__Bip__Group__3__Impl rule__Bip__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Bip__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bip__Group__4();

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
    // $ANTLR end "rule__Bip__Group__3"


    // $ANTLR start "rule__Bip__Group__3__Impl"
    // InternalOiArdubot.g:3510:1: rule__Bip__Group__3__Impl : ( ')' ) ;
    public final void rule__Bip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3514:1: ( ( ')' ) )
            // InternalOiArdubot.g:3515:1: ( ')' )
            {
            // InternalOiArdubot.g:3515:1: ( ')' )
            // InternalOiArdubot.g:3516:2: ')'
            {
             before(grammarAccess.getBipAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBipAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Bip__Group__3__Impl"


    // $ANTLR start "rule__Bip__Group__4"
    // InternalOiArdubot.g:3525:1: rule__Bip__Group__4 : rule__Bip__Group__4__Impl ;
    public final void rule__Bip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3529:1: ( rule__Bip__Group__4__Impl )
            // InternalOiArdubot.g:3530:2: rule__Bip__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bip__Group__4__Impl();

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
    // $ANTLR end "rule__Bip__Group__4"


    // $ANTLR start "rule__Bip__Group__4__Impl"
    // InternalOiArdubot.g:3536:1: rule__Bip__Group__4__Impl : ( ';' ) ;
    public final void rule__Bip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3540:1: ( ( ';' ) )
            // InternalOiArdubot.g:3541:1: ( ';' )
            {
            // InternalOiArdubot.g:3541:1: ( ';' )
            // InternalOiArdubot.g:3542:2: ';'
            {
             before(grammarAccess.getBipAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBipAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Bip__Group__4__Impl"


    // $ANTLR start "rule__Ligar__Group__0"
    // InternalOiArdubot.g:3552:1: rule__Ligar__Group__0 : rule__Ligar__Group__0__Impl rule__Ligar__Group__1 ;
    public final void rule__Ligar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3556:1: ( rule__Ligar__Group__0__Impl rule__Ligar__Group__1 )
            // InternalOiArdubot.g:3557:2: rule__Ligar__Group__0__Impl rule__Ligar__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Ligar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligar__Group__1();

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
    // $ANTLR end "rule__Ligar__Group__0"


    // $ANTLR start "rule__Ligar__Group__0__Impl"
    // InternalOiArdubot.g:3564:1: rule__Ligar__Group__0__Impl : ( 'ligar' ) ;
    public final void rule__Ligar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3568:1: ( ( 'ligar' ) )
            // InternalOiArdubot.g:3569:1: ( 'ligar' )
            {
            // InternalOiArdubot.g:3569:1: ( 'ligar' )
            // InternalOiArdubot.g:3570:2: 'ligar'
            {
             before(grammarAccess.getLigarAccess().getLigarKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLigarAccess().getLigarKeyword_0()); 

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
    // $ANTLR end "rule__Ligar__Group__0__Impl"


    // $ANTLR start "rule__Ligar__Group__1"
    // InternalOiArdubot.g:3579:1: rule__Ligar__Group__1 : rule__Ligar__Group__1__Impl rule__Ligar__Group__2 ;
    public final void rule__Ligar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3583:1: ( rule__Ligar__Group__1__Impl rule__Ligar__Group__2 )
            // InternalOiArdubot.g:3584:2: rule__Ligar__Group__1__Impl rule__Ligar__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Ligar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligar__Group__2();

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
    // $ANTLR end "rule__Ligar__Group__1"


    // $ANTLR start "rule__Ligar__Group__1__Impl"
    // InternalOiArdubot.g:3591:1: rule__Ligar__Group__1__Impl : ( '(' ) ;
    public final void rule__Ligar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3595:1: ( ( '(' ) )
            // InternalOiArdubot.g:3596:1: ( '(' )
            {
            // InternalOiArdubot.g:3596:1: ( '(' )
            // InternalOiArdubot.g:3597:2: '('
            {
             before(grammarAccess.getLigarAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLigarAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Ligar__Group__1__Impl"


    // $ANTLR start "rule__Ligar__Group__2"
    // InternalOiArdubot.g:3606:1: rule__Ligar__Group__2 : rule__Ligar__Group__2__Impl rule__Ligar__Group__3 ;
    public final void rule__Ligar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3610:1: ( rule__Ligar__Group__2__Impl rule__Ligar__Group__3 )
            // InternalOiArdubot.g:3611:2: rule__Ligar__Group__2__Impl rule__Ligar__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Ligar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligar__Group__3();

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
    // $ANTLR end "rule__Ligar__Group__2"


    // $ANTLR start "rule__Ligar__Group__2__Impl"
    // InternalOiArdubot.g:3618:1: rule__Ligar__Group__2__Impl : ( ( rule__Ligar__TipoPortaAssignment_2 ) ) ;
    public final void rule__Ligar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3622:1: ( ( ( rule__Ligar__TipoPortaAssignment_2 ) ) )
            // InternalOiArdubot.g:3623:1: ( ( rule__Ligar__TipoPortaAssignment_2 ) )
            {
            // InternalOiArdubot.g:3623:1: ( ( rule__Ligar__TipoPortaAssignment_2 ) )
            // InternalOiArdubot.g:3624:2: ( rule__Ligar__TipoPortaAssignment_2 )
            {
             before(grammarAccess.getLigarAccess().getTipoPortaAssignment_2()); 
            // InternalOiArdubot.g:3625:2: ( rule__Ligar__TipoPortaAssignment_2 )
            // InternalOiArdubot.g:3625:3: rule__Ligar__TipoPortaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ligar__TipoPortaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLigarAccess().getTipoPortaAssignment_2()); 

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
    // $ANTLR end "rule__Ligar__Group__2__Impl"


    // $ANTLR start "rule__Ligar__Group__3"
    // InternalOiArdubot.g:3633:1: rule__Ligar__Group__3 : rule__Ligar__Group__3__Impl rule__Ligar__Group__4 ;
    public final void rule__Ligar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3637:1: ( rule__Ligar__Group__3__Impl rule__Ligar__Group__4 )
            // InternalOiArdubot.g:3638:2: rule__Ligar__Group__3__Impl rule__Ligar__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Ligar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligar__Group__4();

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
    // $ANTLR end "rule__Ligar__Group__3"


    // $ANTLR start "rule__Ligar__Group__3__Impl"
    // InternalOiArdubot.g:3645:1: rule__Ligar__Group__3__Impl : ( ',' ) ;
    public final void rule__Ligar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3649:1: ( ( ',' ) )
            // InternalOiArdubot.g:3650:1: ( ',' )
            {
            // InternalOiArdubot.g:3650:1: ( ',' )
            // InternalOiArdubot.g:3651:2: ','
            {
             before(grammarAccess.getLigarAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLigarAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Ligar__Group__3__Impl"


    // $ANTLR start "rule__Ligar__Group__4"
    // InternalOiArdubot.g:3660:1: rule__Ligar__Group__4 : rule__Ligar__Group__4__Impl rule__Ligar__Group__5 ;
    public final void rule__Ligar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3664:1: ( rule__Ligar__Group__4__Impl rule__Ligar__Group__5 )
            // InternalOiArdubot.g:3665:2: rule__Ligar__Group__4__Impl rule__Ligar__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Ligar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligar__Group__5();

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
    // $ANTLR end "rule__Ligar__Group__4"


    // $ANTLR start "rule__Ligar__Group__4__Impl"
    // InternalOiArdubot.g:3672:1: rule__Ligar__Group__4__Impl : ( ( rule__Ligar__PortaAssignment_4 ) ) ;
    public final void rule__Ligar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3676:1: ( ( ( rule__Ligar__PortaAssignment_4 ) ) )
            // InternalOiArdubot.g:3677:1: ( ( rule__Ligar__PortaAssignment_4 ) )
            {
            // InternalOiArdubot.g:3677:1: ( ( rule__Ligar__PortaAssignment_4 ) )
            // InternalOiArdubot.g:3678:2: ( rule__Ligar__PortaAssignment_4 )
            {
             before(grammarAccess.getLigarAccess().getPortaAssignment_4()); 
            // InternalOiArdubot.g:3679:2: ( rule__Ligar__PortaAssignment_4 )
            // InternalOiArdubot.g:3679:3: rule__Ligar__PortaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Ligar__PortaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLigarAccess().getPortaAssignment_4()); 

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
    // $ANTLR end "rule__Ligar__Group__4__Impl"


    // $ANTLR start "rule__Ligar__Group__5"
    // InternalOiArdubot.g:3687:1: rule__Ligar__Group__5 : rule__Ligar__Group__5__Impl rule__Ligar__Group__6 ;
    public final void rule__Ligar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3691:1: ( rule__Ligar__Group__5__Impl rule__Ligar__Group__6 )
            // InternalOiArdubot.g:3692:2: rule__Ligar__Group__5__Impl rule__Ligar__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Ligar__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligar__Group__6();

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
    // $ANTLR end "rule__Ligar__Group__5"


    // $ANTLR start "rule__Ligar__Group__5__Impl"
    // InternalOiArdubot.g:3699:1: rule__Ligar__Group__5__Impl : ( ')' ) ;
    public final void rule__Ligar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3703:1: ( ( ')' ) )
            // InternalOiArdubot.g:3704:1: ( ')' )
            {
            // InternalOiArdubot.g:3704:1: ( ')' )
            // InternalOiArdubot.g:3705:2: ')'
            {
             before(grammarAccess.getLigarAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLigarAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Ligar__Group__5__Impl"


    // $ANTLR start "rule__Ligar__Group__6"
    // InternalOiArdubot.g:3714:1: rule__Ligar__Group__6 : rule__Ligar__Group__6__Impl ;
    public final void rule__Ligar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3718:1: ( rule__Ligar__Group__6__Impl )
            // InternalOiArdubot.g:3719:2: rule__Ligar__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ligar__Group__6__Impl();

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
    // $ANTLR end "rule__Ligar__Group__6"


    // $ANTLR start "rule__Ligar__Group__6__Impl"
    // InternalOiArdubot.g:3725:1: rule__Ligar__Group__6__Impl : ( ';' ) ;
    public final void rule__Ligar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3729:1: ( ( ';' ) )
            // InternalOiArdubot.g:3730:1: ( ';' )
            {
            // InternalOiArdubot.g:3730:1: ( ';' )
            // InternalOiArdubot.g:3731:2: ';'
            {
             before(grammarAccess.getLigarAccess().getSemicolonKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLigarAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Ligar__Group__6__Impl"


    // $ANTLR start "rule__Desligar__Group__0"
    // InternalOiArdubot.g:3741:1: rule__Desligar__Group__0 : rule__Desligar__Group__0__Impl rule__Desligar__Group__1 ;
    public final void rule__Desligar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3745:1: ( rule__Desligar__Group__0__Impl rule__Desligar__Group__1 )
            // InternalOiArdubot.g:3746:2: rule__Desligar__Group__0__Impl rule__Desligar__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Desligar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Desligar__Group__1();

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
    // $ANTLR end "rule__Desligar__Group__0"


    // $ANTLR start "rule__Desligar__Group__0__Impl"
    // InternalOiArdubot.g:3753:1: rule__Desligar__Group__0__Impl : ( 'desligar' ) ;
    public final void rule__Desligar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3757:1: ( ( 'desligar' ) )
            // InternalOiArdubot.g:3758:1: ( 'desligar' )
            {
            // InternalOiArdubot.g:3758:1: ( 'desligar' )
            // InternalOiArdubot.g:3759:2: 'desligar'
            {
             before(grammarAccess.getDesligarAccess().getDesligarKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDesligarAccess().getDesligarKeyword_0()); 

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
    // $ANTLR end "rule__Desligar__Group__0__Impl"


    // $ANTLR start "rule__Desligar__Group__1"
    // InternalOiArdubot.g:3768:1: rule__Desligar__Group__1 : rule__Desligar__Group__1__Impl rule__Desligar__Group__2 ;
    public final void rule__Desligar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3772:1: ( rule__Desligar__Group__1__Impl rule__Desligar__Group__2 )
            // InternalOiArdubot.g:3773:2: rule__Desligar__Group__1__Impl rule__Desligar__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Desligar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Desligar__Group__2();

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
    // $ANTLR end "rule__Desligar__Group__1"


    // $ANTLR start "rule__Desligar__Group__1__Impl"
    // InternalOiArdubot.g:3780:1: rule__Desligar__Group__1__Impl : ( '(' ) ;
    public final void rule__Desligar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3784:1: ( ( '(' ) )
            // InternalOiArdubot.g:3785:1: ( '(' )
            {
            // InternalOiArdubot.g:3785:1: ( '(' )
            // InternalOiArdubot.g:3786:2: '('
            {
             before(grammarAccess.getDesligarAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDesligarAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Desligar__Group__1__Impl"


    // $ANTLR start "rule__Desligar__Group__2"
    // InternalOiArdubot.g:3795:1: rule__Desligar__Group__2 : rule__Desligar__Group__2__Impl rule__Desligar__Group__3 ;
    public final void rule__Desligar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3799:1: ( rule__Desligar__Group__2__Impl rule__Desligar__Group__3 )
            // InternalOiArdubot.g:3800:2: rule__Desligar__Group__2__Impl rule__Desligar__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Desligar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Desligar__Group__3();

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
    // $ANTLR end "rule__Desligar__Group__2"


    // $ANTLR start "rule__Desligar__Group__2__Impl"
    // InternalOiArdubot.g:3807:1: rule__Desligar__Group__2__Impl : ( ( rule__Desligar__TipoPortaAssignment_2 ) ) ;
    public final void rule__Desligar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3811:1: ( ( ( rule__Desligar__TipoPortaAssignment_2 ) ) )
            // InternalOiArdubot.g:3812:1: ( ( rule__Desligar__TipoPortaAssignment_2 ) )
            {
            // InternalOiArdubot.g:3812:1: ( ( rule__Desligar__TipoPortaAssignment_2 ) )
            // InternalOiArdubot.g:3813:2: ( rule__Desligar__TipoPortaAssignment_2 )
            {
             before(grammarAccess.getDesligarAccess().getTipoPortaAssignment_2()); 
            // InternalOiArdubot.g:3814:2: ( rule__Desligar__TipoPortaAssignment_2 )
            // InternalOiArdubot.g:3814:3: rule__Desligar__TipoPortaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Desligar__TipoPortaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDesligarAccess().getTipoPortaAssignment_2()); 

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
    // $ANTLR end "rule__Desligar__Group__2__Impl"


    // $ANTLR start "rule__Desligar__Group__3"
    // InternalOiArdubot.g:3822:1: rule__Desligar__Group__3 : rule__Desligar__Group__3__Impl rule__Desligar__Group__4 ;
    public final void rule__Desligar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3826:1: ( rule__Desligar__Group__3__Impl rule__Desligar__Group__4 )
            // InternalOiArdubot.g:3827:2: rule__Desligar__Group__3__Impl rule__Desligar__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Desligar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Desligar__Group__4();

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
    // $ANTLR end "rule__Desligar__Group__3"


    // $ANTLR start "rule__Desligar__Group__3__Impl"
    // InternalOiArdubot.g:3834:1: rule__Desligar__Group__3__Impl : ( ',' ) ;
    public final void rule__Desligar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3838:1: ( ( ',' ) )
            // InternalOiArdubot.g:3839:1: ( ',' )
            {
            // InternalOiArdubot.g:3839:1: ( ',' )
            // InternalOiArdubot.g:3840:2: ','
            {
             before(grammarAccess.getDesligarAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDesligarAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Desligar__Group__3__Impl"


    // $ANTLR start "rule__Desligar__Group__4"
    // InternalOiArdubot.g:3849:1: rule__Desligar__Group__4 : rule__Desligar__Group__4__Impl rule__Desligar__Group__5 ;
    public final void rule__Desligar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3853:1: ( rule__Desligar__Group__4__Impl rule__Desligar__Group__5 )
            // InternalOiArdubot.g:3854:2: rule__Desligar__Group__4__Impl rule__Desligar__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Desligar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Desligar__Group__5();

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
    // $ANTLR end "rule__Desligar__Group__4"


    // $ANTLR start "rule__Desligar__Group__4__Impl"
    // InternalOiArdubot.g:3861:1: rule__Desligar__Group__4__Impl : ( ( rule__Desligar__PortaAssignment_4 ) ) ;
    public final void rule__Desligar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3865:1: ( ( ( rule__Desligar__PortaAssignment_4 ) ) )
            // InternalOiArdubot.g:3866:1: ( ( rule__Desligar__PortaAssignment_4 ) )
            {
            // InternalOiArdubot.g:3866:1: ( ( rule__Desligar__PortaAssignment_4 ) )
            // InternalOiArdubot.g:3867:2: ( rule__Desligar__PortaAssignment_4 )
            {
             before(grammarAccess.getDesligarAccess().getPortaAssignment_4()); 
            // InternalOiArdubot.g:3868:2: ( rule__Desligar__PortaAssignment_4 )
            // InternalOiArdubot.g:3868:3: rule__Desligar__PortaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Desligar__PortaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDesligarAccess().getPortaAssignment_4()); 

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
    // $ANTLR end "rule__Desligar__Group__4__Impl"


    // $ANTLR start "rule__Desligar__Group__5"
    // InternalOiArdubot.g:3876:1: rule__Desligar__Group__5 : rule__Desligar__Group__5__Impl rule__Desligar__Group__6 ;
    public final void rule__Desligar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3880:1: ( rule__Desligar__Group__5__Impl rule__Desligar__Group__6 )
            // InternalOiArdubot.g:3881:2: rule__Desligar__Group__5__Impl rule__Desligar__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Desligar__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Desligar__Group__6();

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
    // $ANTLR end "rule__Desligar__Group__5"


    // $ANTLR start "rule__Desligar__Group__5__Impl"
    // InternalOiArdubot.g:3888:1: rule__Desligar__Group__5__Impl : ( ')' ) ;
    public final void rule__Desligar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3892:1: ( ( ')' ) )
            // InternalOiArdubot.g:3893:1: ( ')' )
            {
            // InternalOiArdubot.g:3893:1: ( ')' )
            // InternalOiArdubot.g:3894:2: ')'
            {
             before(grammarAccess.getDesligarAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDesligarAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Desligar__Group__5__Impl"


    // $ANTLR start "rule__Desligar__Group__6"
    // InternalOiArdubot.g:3903:1: rule__Desligar__Group__6 : rule__Desligar__Group__6__Impl ;
    public final void rule__Desligar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3907:1: ( rule__Desligar__Group__6__Impl )
            // InternalOiArdubot.g:3908:2: rule__Desligar__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Desligar__Group__6__Impl();

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
    // $ANTLR end "rule__Desligar__Group__6"


    // $ANTLR start "rule__Desligar__Group__6__Impl"
    // InternalOiArdubot.g:3914:1: rule__Desligar__Group__6__Impl : ( ';' ) ;
    public final void rule__Desligar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3918:1: ( ( ';' ) )
            // InternalOiArdubot.g:3919:1: ( ';' )
            {
            // InternalOiArdubot.g:3919:1: ( ';' )
            // InternalOiArdubot.g:3920:2: ';'
            {
             before(grammarAccess.getDesligarAccess().getSemicolonKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDesligarAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Desligar__Group__6__Impl"


    // $ANTLR start "rule__Servo__Group__0"
    // InternalOiArdubot.g:3930:1: rule__Servo__Group__0 : rule__Servo__Group__0__Impl rule__Servo__Group__1 ;
    public final void rule__Servo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3934:1: ( rule__Servo__Group__0__Impl rule__Servo__Group__1 )
            // InternalOiArdubot.g:3935:2: rule__Servo__Group__0__Impl rule__Servo__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Servo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servo__Group__1();

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
    // $ANTLR end "rule__Servo__Group__0"


    // $ANTLR start "rule__Servo__Group__0__Impl"
    // InternalOiArdubot.g:3942:1: rule__Servo__Group__0__Impl : ( 'girarServo' ) ;
    public final void rule__Servo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3946:1: ( ( 'girarServo' ) )
            // InternalOiArdubot.g:3947:1: ( 'girarServo' )
            {
            // InternalOiArdubot.g:3947:1: ( 'girarServo' )
            // InternalOiArdubot.g:3948:2: 'girarServo'
            {
             before(grammarAccess.getServoAccess().getGirarServoKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getServoAccess().getGirarServoKeyword_0()); 

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
    // $ANTLR end "rule__Servo__Group__0__Impl"


    // $ANTLR start "rule__Servo__Group__1"
    // InternalOiArdubot.g:3957:1: rule__Servo__Group__1 : rule__Servo__Group__1__Impl rule__Servo__Group__2 ;
    public final void rule__Servo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3961:1: ( rule__Servo__Group__1__Impl rule__Servo__Group__2 )
            // InternalOiArdubot.g:3962:2: rule__Servo__Group__1__Impl rule__Servo__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Servo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servo__Group__2();

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
    // $ANTLR end "rule__Servo__Group__1"


    // $ANTLR start "rule__Servo__Group__1__Impl"
    // InternalOiArdubot.g:3969:1: rule__Servo__Group__1__Impl : ( '(' ) ;
    public final void rule__Servo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3973:1: ( ( '(' ) )
            // InternalOiArdubot.g:3974:1: ( '(' )
            {
            // InternalOiArdubot.g:3974:1: ( '(' )
            // InternalOiArdubot.g:3975:2: '('
            {
             before(grammarAccess.getServoAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getServoAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Servo__Group__1__Impl"


    // $ANTLR start "rule__Servo__Group__2"
    // InternalOiArdubot.g:3984:1: rule__Servo__Group__2 : rule__Servo__Group__2__Impl rule__Servo__Group__3 ;
    public final void rule__Servo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:3988:1: ( rule__Servo__Group__2__Impl rule__Servo__Group__3 )
            // InternalOiArdubot.g:3989:2: rule__Servo__Group__2__Impl rule__Servo__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Servo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servo__Group__3();

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
    // $ANTLR end "rule__Servo__Group__2"


    // $ANTLR start "rule__Servo__Group__2__Impl"
    // InternalOiArdubot.g:3996:1: rule__Servo__Group__2__Impl : ( ( rule__Servo__PortaAssignment_2 ) ) ;
    public final void rule__Servo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4000:1: ( ( ( rule__Servo__PortaAssignment_2 ) ) )
            // InternalOiArdubot.g:4001:1: ( ( rule__Servo__PortaAssignment_2 ) )
            {
            // InternalOiArdubot.g:4001:1: ( ( rule__Servo__PortaAssignment_2 ) )
            // InternalOiArdubot.g:4002:2: ( rule__Servo__PortaAssignment_2 )
            {
             before(grammarAccess.getServoAccess().getPortaAssignment_2()); 
            // InternalOiArdubot.g:4003:2: ( rule__Servo__PortaAssignment_2 )
            // InternalOiArdubot.g:4003:3: rule__Servo__PortaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Servo__PortaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServoAccess().getPortaAssignment_2()); 

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
    // $ANTLR end "rule__Servo__Group__2__Impl"


    // $ANTLR start "rule__Servo__Group__3"
    // InternalOiArdubot.g:4011:1: rule__Servo__Group__3 : rule__Servo__Group__3__Impl rule__Servo__Group__4 ;
    public final void rule__Servo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4015:1: ( rule__Servo__Group__3__Impl rule__Servo__Group__4 )
            // InternalOiArdubot.g:4016:2: rule__Servo__Group__3__Impl rule__Servo__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Servo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servo__Group__4();

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
    // $ANTLR end "rule__Servo__Group__3"


    // $ANTLR start "rule__Servo__Group__3__Impl"
    // InternalOiArdubot.g:4023:1: rule__Servo__Group__3__Impl : ( ',' ) ;
    public final void rule__Servo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4027:1: ( ( ',' ) )
            // InternalOiArdubot.g:4028:1: ( ',' )
            {
            // InternalOiArdubot.g:4028:1: ( ',' )
            // InternalOiArdubot.g:4029:2: ','
            {
             before(grammarAccess.getServoAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getServoAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Servo__Group__3__Impl"


    // $ANTLR start "rule__Servo__Group__4"
    // InternalOiArdubot.g:4038:1: rule__Servo__Group__4 : rule__Servo__Group__4__Impl rule__Servo__Group__5 ;
    public final void rule__Servo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4042:1: ( rule__Servo__Group__4__Impl rule__Servo__Group__5 )
            // InternalOiArdubot.g:4043:2: rule__Servo__Group__4__Impl rule__Servo__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Servo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servo__Group__5();

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
    // $ANTLR end "rule__Servo__Group__4"


    // $ANTLR start "rule__Servo__Group__4__Impl"
    // InternalOiArdubot.g:4050:1: rule__Servo__Group__4__Impl : ( ( rule__Servo__PosicaoAssignment_4 ) ) ;
    public final void rule__Servo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4054:1: ( ( ( rule__Servo__PosicaoAssignment_4 ) ) )
            // InternalOiArdubot.g:4055:1: ( ( rule__Servo__PosicaoAssignment_4 ) )
            {
            // InternalOiArdubot.g:4055:1: ( ( rule__Servo__PosicaoAssignment_4 ) )
            // InternalOiArdubot.g:4056:2: ( rule__Servo__PosicaoAssignment_4 )
            {
             before(grammarAccess.getServoAccess().getPosicaoAssignment_4()); 
            // InternalOiArdubot.g:4057:2: ( rule__Servo__PosicaoAssignment_4 )
            // InternalOiArdubot.g:4057:3: rule__Servo__PosicaoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Servo__PosicaoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServoAccess().getPosicaoAssignment_4()); 

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
    // $ANTLR end "rule__Servo__Group__4__Impl"


    // $ANTLR start "rule__Servo__Group__5"
    // InternalOiArdubot.g:4065:1: rule__Servo__Group__5 : rule__Servo__Group__5__Impl rule__Servo__Group__6 ;
    public final void rule__Servo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4069:1: ( rule__Servo__Group__5__Impl rule__Servo__Group__6 )
            // InternalOiArdubot.g:4070:2: rule__Servo__Group__5__Impl rule__Servo__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Servo__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servo__Group__6();

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
    // $ANTLR end "rule__Servo__Group__5"


    // $ANTLR start "rule__Servo__Group__5__Impl"
    // InternalOiArdubot.g:4077:1: rule__Servo__Group__5__Impl : ( ')' ) ;
    public final void rule__Servo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4081:1: ( ( ')' ) )
            // InternalOiArdubot.g:4082:1: ( ')' )
            {
            // InternalOiArdubot.g:4082:1: ( ')' )
            // InternalOiArdubot.g:4083:2: ')'
            {
             before(grammarAccess.getServoAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getServoAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Servo__Group__5__Impl"


    // $ANTLR start "rule__Servo__Group__6"
    // InternalOiArdubot.g:4092:1: rule__Servo__Group__6 : rule__Servo__Group__6__Impl ;
    public final void rule__Servo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4096:1: ( rule__Servo__Group__6__Impl )
            // InternalOiArdubot.g:4097:2: rule__Servo__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servo__Group__6__Impl();

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
    // $ANTLR end "rule__Servo__Group__6"


    // $ANTLR start "rule__Servo__Group__6__Impl"
    // InternalOiArdubot.g:4103:1: rule__Servo__Group__6__Impl : ( ';' ) ;
    public final void rule__Servo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4107:1: ( ( ';' ) )
            // InternalOiArdubot.g:4108:1: ( ';' )
            {
            // InternalOiArdubot.g:4108:1: ( ';' )
            // InternalOiArdubot.g:4109:2: ';'
            {
             before(grammarAccess.getServoAccess().getSemicolonKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServoAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Servo__Group__6__Impl"


    // $ANTLR start "rule__MotorDC__Group__0"
    // InternalOiArdubot.g:4119:1: rule__MotorDC__Group__0 : rule__MotorDC__Group__0__Impl rule__MotorDC__Group__1 ;
    public final void rule__MotorDC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4123:1: ( rule__MotorDC__Group__0__Impl rule__MotorDC__Group__1 )
            // InternalOiArdubot.g:4124:2: rule__MotorDC__Group__0__Impl rule__MotorDC__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__MotorDC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MotorDC__Group__1();

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
    // $ANTLR end "rule__MotorDC__Group__0"


    // $ANTLR start "rule__MotorDC__Group__0__Impl"
    // InternalOiArdubot.g:4131:1: rule__MotorDC__Group__0__Impl : ( 'motorDC' ) ;
    public final void rule__MotorDC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4135:1: ( ( 'motorDC' ) )
            // InternalOiArdubot.g:4136:1: ( 'motorDC' )
            {
            // InternalOiArdubot.g:4136:1: ( 'motorDC' )
            // InternalOiArdubot.g:4137:2: 'motorDC'
            {
             before(grammarAccess.getMotorDCAccess().getMotorDCKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMotorDCAccess().getMotorDCKeyword_0()); 

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
    // $ANTLR end "rule__MotorDC__Group__0__Impl"


    // $ANTLR start "rule__MotorDC__Group__1"
    // InternalOiArdubot.g:4146:1: rule__MotorDC__Group__1 : rule__MotorDC__Group__1__Impl rule__MotorDC__Group__2 ;
    public final void rule__MotorDC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4150:1: ( rule__MotorDC__Group__1__Impl rule__MotorDC__Group__2 )
            // InternalOiArdubot.g:4151:2: rule__MotorDC__Group__1__Impl rule__MotorDC__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__MotorDC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MotorDC__Group__2();

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
    // $ANTLR end "rule__MotorDC__Group__1"


    // $ANTLR start "rule__MotorDC__Group__1__Impl"
    // InternalOiArdubot.g:4158:1: rule__MotorDC__Group__1__Impl : ( '(' ) ;
    public final void rule__MotorDC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4162:1: ( ( '(' ) )
            // InternalOiArdubot.g:4163:1: ( '(' )
            {
            // InternalOiArdubot.g:4163:1: ( '(' )
            // InternalOiArdubot.g:4164:2: '('
            {
             before(grammarAccess.getMotorDCAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMotorDCAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__MotorDC__Group__1__Impl"


    // $ANTLR start "rule__MotorDC__Group__2"
    // InternalOiArdubot.g:4173:1: rule__MotorDC__Group__2 : rule__MotorDC__Group__2__Impl rule__MotorDC__Group__3 ;
    public final void rule__MotorDC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4177:1: ( rule__MotorDC__Group__2__Impl rule__MotorDC__Group__3 )
            // InternalOiArdubot.g:4178:2: rule__MotorDC__Group__2__Impl rule__MotorDC__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__MotorDC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MotorDC__Group__3();

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
    // $ANTLR end "rule__MotorDC__Group__2"


    // $ANTLR start "rule__MotorDC__Group__2__Impl"
    // InternalOiArdubot.g:4185:1: rule__MotorDC__Group__2__Impl : ( ( rule__MotorDC__EstadoAssignment_2 ) ) ;
    public final void rule__MotorDC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4189:1: ( ( ( rule__MotorDC__EstadoAssignment_2 ) ) )
            // InternalOiArdubot.g:4190:1: ( ( rule__MotorDC__EstadoAssignment_2 ) )
            {
            // InternalOiArdubot.g:4190:1: ( ( rule__MotorDC__EstadoAssignment_2 ) )
            // InternalOiArdubot.g:4191:2: ( rule__MotorDC__EstadoAssignment_2 )
            {
             before(grammarAccess.getMotorDCAccess().getEstadoAssignment_2()); 
            // InternalOiArdubot.g:4192:2: ( rule__MotorDC__EstadoAssignment_2 )
            // InternalOiArdubot.g:4192:3: rule__MotorDC__EstadoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MotorDC__EstadoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMotorDCAccess().getEstadoAssignment_2()); 

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
    // $ANTLR end "rule__MotorDC__Group__2__Impl"


    // $ANTLR start "rule__MotorDC__Group__3"
    // InternalOiArdubot.g:4200:1: rule__MotorDC__Group__3 : rule__MotorDC__Group__3__Impl rule__MotorDC__Group__4 ;
    public final void rule__MotorDC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4204:1: ( rule__MotorDC__Group__3__Impl rule__MotorDC__Group__4 )
            // InternalOiArdubot.g:4205:2: rule__MotorDC__Group__3__Impl rule__MotorDC__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__MotorDC__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MotorDC__Group__4();

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
    // $ANTLR end "rule__MotorDC__Group__3"


    // $ANTLR start "rule__MotorDC__Group__3__Impl"
    // InternalOiArdubot.g:4212:1: rule__MotorDC__Group__3__Impl : ( ',' ) ;
    public final void rule__MotorDC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4216:1: ( ( ',' ) )
            // InternalOiArdubot.g:4217:1: ( ',' )
            {
            // InternalOiArdubot.g:4217:1: ( ',' )
            // InternalOiArdubot.g:4218:2: ','
            {
             before(grammarAccess.getMotorDCAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMotorDCAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__MotorDC__Group__3__Impl"


    // $ANTLR start "rule__MotorDC__Group__4"
    // InternalOiArdubot.g:4227:1: rule__MotorDC__Group__4 : rule__MotorDC__Group__4__Impl rule__MotorDC__Group__5 ;
    public final void rule__MotorDC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4231:1: ( rule__MotorDC__Group__4__Impl rule__MotorDC__Group__5 )
            // InternalOiArdubot.g:4232:2: rule__MotorDC__Group__4__Impl rule__MotorDC__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__MotorDC__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MotorDC__Group__5();

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
    // $ANTLR end "rule__MotorDC__Group__4"


    // $ANTLR start "rule__MotorDC__Group__4__Impl"
    // InternalOiArdubot.g:4239:1: rule__MotorDC__Group__4__Impl : ( ( rule__MotorDC__DirecaoAssignment_4 ) ) ;
    public final void rule__MotorDC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4243:1: ( ( ( rule__MotorDC__DirecaoAssignment_4 ) ) )
            // InternalOiArdubot.g:4244:1: ( ( rule__MotorDC__DirecaoAssignment_4 ) )
            {
            // InternalOiArdubot.g:4244:1: ( ( rule__MotorDC__DirecaoAssignment_4 ) )
            // InternalOiArdubot.g:4245:2: ( rule__MotorDC__DirecaoAssignment_4 )
            {
             before(grammarAccess.getMotorDCAccess().getDirecaoAssignment_4()); 
            // InternalOiArdubot.g:4246:2: ( rule__MotorDC__DirecaoAssignment_4 )
            // InternalOiArdubot.g:4246:3: rule__MotorDC__DirecaoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MotorDC__DirecaoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMotorDCAccess().getDirecaoAssignment_4()); 

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
    // $ANTLR end "rule__MotorDC__Group__4__Impl"


    // $ANTLR start "rule__MotorDC__Group__5"
    // InternalOiArdubot.g:4254:1: rule__MotorDC__Group__5 : rule__MotorDC__Group__5__Impl rule__MotorDC__Group__6 ;
    public final void rule__MotorDC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4258:1: ( rule__MotorDC__Group__5__Impl rule__MotorDC__Group__6 )
            // InternalOiArdubot.g:4259:2: rule__MotorDC__Group__5__Impl rule__MotorDC__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__MotorDC__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MotorDC__Group__6();

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
    // $ANTLR end "rule__MotorDC__Group__5"


    // $ANTLR start "rule__MotorDC__Group__5__Impl"
    // InternalOiArdubot.g:4266:1: rule__MotorDC__Group__5__Impl : ( ')' ) ;
    public final void rule__MotorDC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4270:1: ( ( ')' ) )
            // InternalOiArdubot.g:4271:1: ( ')' )
            {
            // InternalOiArdubot.g:4271:1: ( ')' )
            // InternalOiArdubot.g:4272:2: ')'
            {
             before(grammarAccess.getMotorDCAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMotorDCAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__MotorDC__Group__5__Impl"


    // $ANTLR start "rule__MotorDC__Group__6"
    // InternalOiArdubot.g:4281:1: rule__MotorDC__Group__6 : rule__MotorDC__Group__6__Impl ;
    public final void rule__MotorDC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4285:1: ( rule__MotorDC__Group__6__Impl )
            // InternalOiArdubot.g:4286:2: rule__MotorDC__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MotorDC__Group__6__Impl();

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
    // $ANTLR end "rule__MotorDC__Group__6"


    // $ANTLR start "rule__MotorDC__Group__6__Impl"
    // InternalOiArdubot.g:4292:1: rule__MotorDC__Group__6__Impl : ( ';' ) ;
    public final void rule__MotorDC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4296:1: ( ( ';' ) )
            // InternalOiArdubot.g:4297:1: ( ';' )
            {
            // InternalOiArdubot.g:4297:1: ( ';' )
            // InternalOiArdubot.g:4298:2: ';'
            {
             before(grammarAccess.getMotorDCAccess().getSemicolonKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMotorDCAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__MotorDC__Group__6__Impl"


    // $ANTLR start "rule__Andar__Group__0"
    // InternalOiArdubot.g:4308:1: rule__Andar__Group__0 : rule__Andar__Group__0__Impl rule__Andar__Group__1 ;
    public final void rule__Andar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4312:1: ( rule__Andar__Group__0__Impl rule__Andar__Group__1 )
            // InternalOiArdubot.g:4313:2: rule__Andar__Group__0__Impl rule__Andar__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Andar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Andar__Group__1();

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
    // $ANTLR end "rule__Andar__Group__0"


    // $ANTLR start "rule__Andar__Group__0__Impl"
    // InternalOiArdubot.g:4320:1: rule__Andar__Group__0__Impl : ( 'andar' ) ;
    public final void rule__Andar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4324:1: ( ( 'andar' ) )
            // InternalOiArdubot.g:4325:1: ( 'andar' )
            {
            // InternalOiArdubot.g:4325:1: ( 'andar' )
            // InternalOiArdubot.g:4326:2: 'andar'
            {
             before(grammarAccess.getAndarAccess().getAndarKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAndarAccess().getAndarKeyword_0()); 

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
    // $ANTLR end "rule__Andar__Group__0__Impl"


    // $ANTLR start "rule__Andar__Group__1"
    // InternalOiArdubot.g:4335:1: rule__Andar__Group__1 : rule__Andar__Group__1__Impl rule__Andar__Group__2 ;
    public final void rule__Andar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4339:1: ( rule__Andar__Group__1__Impl rule__Andar__Group__2 )
            // InternalOiArdubot.g:4340:2: rule__Andar__Group__1__Impl rule__Andar__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Andar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Andar__Group__2();

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
    // $ANTLR end "rule__Andar__Group__1"


    // $ANTLR start "rule__Andar__Group__1__Impl"
    // InternalOiArdubot.g:4347:1: rule__Andar__Group__1__Impl : ( '(' ) ;
    public final void rule__Andar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4351:1: ( ( '(' ) )
            // InternalOiArdubot.g:4352:1: ( '(' )
            {
            // InternalOiArdubot.g:4352:1: ( '(' )
            // InternalOiArdubot.g:4353:2: '('
            {
             before(grammarAccess.getAndarAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAndarAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Andar__Group__1__Impl"


    // $ANTLR start "rule__Andar__Group__2"
    // InternalOiArdubot.g:4362:1: rule__Andar__Group__2 : rule__Andar__Group__2__Impl rule__Andar__Group__3 ;
    public final void rule__Andar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4366:1: ( rule__Andar__Group__2__Impl rule__Andar__Group__3 )
            // InternalOiArdubot.g:4367:2: rule__Andar__Group__2__Impl rule__Andar__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Andar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Andar__Group__3();

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
    // $ANTLR end "rule__Andar__Group__2"


    // $ANTLR start "rule__Andar__Group__2__Impl"
    // InternalOiArdubot.g:4374:1: rule__Andar__Group__2__Impl : ( ( rule__Andar__PortaAssignment_2 ) ) ;
    public final void rule__Andar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4378:1: ( ( ( rule__Andar__PortaAssignment_2 ) ) )
            // InternalOiArdubot.g:4379:1: ( ( rule__Andar__PortaAssignment_2 ) )
            {
            // InternalOiArdubot.g:4379:1: ( ( rule__Andar__PortaAssignment_2 ) )
            // InternalOiArdubot.g:4380:2: ( rule__Andar__PortaAssignment_2 )
            {
             before(grammarAccess.getAndarAccess().getPortaAssignment_2()); 
            // InternalOiArdubot.g:4381:2: ( rule__Andar__PortaAssignment_2 )
            // InternalOiArdubot.g:4381:3: rule__Andar__PortaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Andar__PortaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAndarAccess().getPortaAssignment_2()); 

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
    // $ANTLR end "rule__Andar__Group__2__Impl"


    // $ANTLR start "rule__Andar__Group__3"
    // InternalOiArdubot.g:4389:1: rule__Andar__Group__3 : rule__Andar__Group__3__Impl rule__Andar__Group__4 ;
    public final void rule__Andar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4393:1: ( rule__Andar__Group__3__Impl rule__Andar__Group__4 )
            // InternalOiArdubot.g:4394:2: rule__Andar__Group__3__Impl rule__Andar__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Andar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Andar__Group__4();

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
    // $ANTLR end "rule__Andar__Group__3"


    // $ANTLR start "rule__Andar__Group__3__Impl"
    // InternalOiArdubot.g:4401:1: rule__Andar__Group__3__Impl : ( ',' ) ;
    public final void rule__Andar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4405:1: ( ( ',' ) )
            // InternalOiArdubot.g:4406:1: ( ',' )
            {
            // InternalOiArdubot.g:4406:1: ( ',' )
            // InternalOiArdubot.g:4407:2: ','
            {
             before(grammarAccess.getAndarAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAndarAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Andar__Group__3__Impl"


    // $ANTLR start "rule__Andar__Group__4"
    // InternalOiArdubot.g:4416:1: rule__Andar__Group__4 : rule__Andar__Group__4__Impl rule__Andar__Group__5 ;
    public final void rule__Andar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4420:1: ( rule__Andar__Group__4__Impl rule__Andar__Group__5 )
            // InternalOiArdubot.g:4421:2: rule__Andar__Group__4__Impl rule__Andar__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Andar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Andar__Group__5();

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
    // $ANTLR end "rule__Andar__Group__4"


    // $ANTLR start "rule__Andar__Group__4__Impl"
    // InternalOiArdubot.g:4428:1: rule__Andar__Group__4__Impl : ( ( rule__Andar__VelocidadeAssignment_4 ) ) ;
    public final void rule__Andar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4432:1: ( ( ( rule__Andar__VelocidadeAssignment_4 ) ) )
            // InternalOiArdubot.g:4433:1: ( ( rule__Andar__VelocidadeAssignment_4 ) )
            {
            // InternalOiArdubot.g:4433:1: ( ( rule__Andar__VelocidadeAssignment_4 ) )
            // InternalOiArdubot.g:4434:2: ( rule__Andar__VelocidadeAssignment_4 )
            {
             before(grammarAccess.getAndarAccess().getVelocidadeAssignment_4()); 
            // InternalOiArdubot.g:4435:2: ( rule__Andar__VelocidadeAssignment_4 )
            // InternalOiArdubot.g:4435:3: rule__Andar__VelocidadeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Andar__VelocidadeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAndarAccess().getVelocidadeAssignment_4()); 

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
    // $ANTLR end "rule__Andar__Group__4__Impl"


    // $ANTLR start "rule__Andar__Group__5"
    // InternalOiArdubot.g:4443:1: rule__Andar__Group__5 : rule__Andar__Group__5__Impl rule__Andar__Group__6 ;
    public final void rule__Andar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4447:1: ( rule__Andar__Group__5__Impl rule__Andar__Group__6 )
            // InternalOiArdubot.g:4448:2: rule__Andar__Group__5__Impl rule__Andar__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Andar__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Andar__Group__6();

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
    // $ANTLR end "rule__Andar__Group__5"


    // $ANTLR start "rule__Andar__Group__5__Impl"
    // InternalOiArdubot.g:4455:1: rule__Andar__Group__5__Impl : ( ',' ) ;
    public final void rule__Andar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4459:1: ( ( ',' ) )
            // InternalOiArdubot.g:4460:1: ( ',' )
            {
            // InternalOiArdubot.g:4460:1: ( ',' )
            // InternalOiArdubot.g:4461:2: ','
            {
             before(grammarAccess.getAndarAccess().getCommaKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAndarAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__Andar__Group__5__Impl"


    // $ANTLR start "rule__Andar__Group__6"
    // InternalOiArdubot.g:4470:1: rule__Andar__Group__6 : rule__Andar__Group__6__Impl rule__Andar__Group__7 ;
    public final void rule__Andar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4474:1: ( rule__Andar__Group__6__Impl rule__Andar__Group__7 )
            // InternalOiArdubot.g:4475:2: rule__Andar__Group__6__Impl rule__Andar__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Andar__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Andar__Group__7();

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
    // $ANTLR end "rule__Andar__Group__6"


    // $ANTLR start "rule__Andar__Group__6__Impl"
    // InternalOiArdubot.g:4482:1: rule__Andar__Group__6__Impl : ( ( rule__Andar__DirecaoAssignment_6 ) ) ;
    public final void rule__Andar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4486:1: ( ( ( rule__Andar__DirecaoAssignment_6 ) ) )
            // InternalOiArdubot.g:4487:1: ( ( rule__Andar__DirecaoAssignment_6 ) )
            {
            // InternalOiArdubot.g:4487:1: ( ( rule__Andar__DirecaoAssignment_6 ) )
            // InternalOiArdubot.g:4488:2: ( rule__Andar__DirecaoAssignment_6 )
            {
             before(grammarAccess.getAndarAccess().getDirecaoAssignment_6()); 
            // InternalOiArdubot.g:4489:2: ( rule__Andar__DirecaoAssignment_6 )
            // InternalOiArdubot.g:4489:3: rule__Andar__DirecaoAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Andar__DirecaoAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAndarAccess().getDirecaoAssignment_6()); 

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
    // $ANTLR end "rule__Andar__Group__6__Impl"


    // $ANTLR start "rule__Andar__Group__7"
    // InternalOiArdubot.g:4497:1: rule__Andar__Group__7 : rule__Andar__Group__7__Impl rule__Andar__Group__8 ;
    public final void rule__Andar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4501:1: ( rule__Andar__Group__7__Impl rule__Andar__Group__8 )
            // InternalOiArdubot.g:4502:2: rule__Andar__Group__7__Impl rule__Andar__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Andar__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Andar__Group__8();

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
    // $ANTLR end "rule__Andar__Group__7"


    // $ANTLR start "rule__Andar__Group__7__Impl"
    // InternalOiArdubot.g:4509:1: rule__Andar__Group__7__Impl : ( ')' ) ;
    public final void rule__Andar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4513:1: ( ( ')' ) )
            // InternalOiArdubot.g:4514:1: ( ')' )
            {
            // InternalOiArdubot.g:4514:1: ( ')' )
            // InternalOiArdubot.g:4515:2: ')'
            {
             before(grammarAccess.getAndarAccess().getRightParenthesisKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAndarAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__Andar__Group__7__Impl"


    // $ANTLR start "rule__Andar__Group__8"
    // InternalOiArdubot.g:4524:1: rule__Andar__Group__8 : rule__Andar__Group__8__Impl ;
    public final void rule__Andar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4528:1: ( rule__Andar__Group__8__Impl )
            // InternalOiArdubot.g:4529:2: rule__Andar__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Andar__Group__8__Impl();

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
    // $ANTLR end "rule__Andar__Group__8"


    // $ANTLR start "rule__Andar__Group__8__Impl"
    // InternalOiArdubot.g:4535:1: rule__Andar__Group__8__Impl : ( ';' ) ;
    public final void rule__Andar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4539:1: ( ( ';' ) )
            // InternalOiArdubot.g:4540:1: ( ';' )
            {
            // InternalOiArdubot.g:4540:1: ( ';' )
            // InternalOiArdubot.g:4541:2: ';'
            {
             before(grammarAccess.getAndarAccess().getSemicolonKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAndarAccess().getSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__Andar__Group__8__Impl"


    // $ANTLR start "rule__Parar__Group__0"
    // InternalOiArdubot.g:4551:1: rule__Parar__Group__0 : rule__Parar__Group__0__Impl rule__Parar__Group__1 ;
    public final void rule__Parar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4555:1: ( rule__Parar__Group__0__Impl rule__Parar__Group__1 )
            // InternalOiArdubot.g:4556:2: rule__Parar__Group__0__Impl rule__Parar__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Parar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parar__Group__1();

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
    // $ANTLR end "rule__Parar__Group__0"


    // $ANTLR start "rule__Parar__Group__0__Impl"
    // InternalOiArdubot.g:4563:1: rule__Parar__Group__0__Impl : ( 'parar' ) ;
    public final void rule__Parar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4567:1: ( ( 'parar' ) )
            // InternalOiArdubot.g:4568:1: ( 'parar' )
            {
            // InternalOiArdubot.g:4568:1: ( 'parar' )
            // InternalOiArdubot.g:4569:2: 'parar'
            {
             before(grammarAccess.getPararAccess().getPararKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPararAccess().getPararKeyword_0()); 

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
    // $ANTLR end "rule__Parar__Group__0__Impl"


    // $ANTLR start "rule__Parar__Group__1"
    // InternalOiArdubot.g:4578:1: rule__Parar__Group__1 : rule__Parar__Group__1__Impl rule__Parar__Group__2 ;
    public final void rule__Parar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4582:1: ( rule__Parar__Group__1__Impl rule__Parar__Group__2 )
            // InternalOiArdubot.g:4583:2: rule__Parar__Group__1__Impl rule__Parar__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Parar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parar__Group__2();

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
    // $ANTLR end "rule__Parar__Group__1"


    // $ANTLR start "rule__Parar__Group__1__Impl"
    // InternalOiArdubot.g:4590:1: rule__Parar__Group__1__Impl : ( '(' ) ;
    public final void rule__Parar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4594:1: ( ( '(' ) )
            // InternalOiArdubot.g:4595:1: ( '(' )
            {
            // InternalOiArdubot.g:4595:1: ( '(' )
            // InternalOiArdubot.g:4596:2: '('
            {
             before(grammarAccess.getPararAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPararAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Parar__Group__1__Impl"


    // $ANTLR start "rule__Parar__Group__2"
    // InternalOiArdubot.g:4605:1: rule__Parar__Group__2 : rule__Parar__Group__2__Impl rule__Parar__Group__3 ;
    public final void rule__Parar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4609:1: ( rule__Parar__Group__2__Impl rule__Parar__Group__3 )
            // InternalOiArdubot.g:4610:2: rule__Parar__Group__2__Impl rule__Parar__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Parar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parar__Group__3();

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
    // $ANTLR end "rule__Parar__Group__2"


    // $ANTLR start "rule__Parar__Group__2__Impl"
    // InternalOiArdubot.g:4617:1: rule__Parar__Group__2__Impl : ( ( rule__Parar__PortaAssignment_2 ) ) ;
    public final void rule__Parar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4621:1: ( ( ( rule__Parar__PortaAssignment_2 ) ) )
            // InternalOiArdubot.g:4622:1: ( ( rule__Parar__PortaAssignment_2 ) )
            {
            // InternalOiArdubot.g:4622:1: ( ( rule__Parar__PortaAssignment_2 ) )
            // InternalOiArdubot.g:4623:2: ( rule__Parar__PortaAssignment_2 )
            {
             before(grammarAccess.getPararAccess().getPortaAssignment_2()); 
            // InternalOiArdubot.g:4624:2: ( rule__Parar__PortaAssignment_2 )
            // InternalOiArdubot.g:4624:3: rule__Parar__PortaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parar__PortaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPararAccess().getPortaAssignment_2()); 

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
    // $ANTLR end "rule__Parar__Group__2__Impl"


    // $ANTLR start "rule__Parar__Group__3"
    // InternalOiArdubot.g:4632:1: rule__Parar__Group__3 : rule__Parar__Group__3__Impl rule__Parar__Group__4 ;
    public final void rule__Parar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4636:1: ( rule__Parar__Group__3__Impl rule__Parar__Group__4 )
            // InternalOiArdubot.g:4637:2: rule__Parar__Group__3__Impl rule__Parar__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Parar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parar__Group__4();

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
    // $ANTLR end "rule__Parar__Group__3"


    // $ANTLR start "rule__Parar__Group__3__Impl"
    // InternalOiArdubot.g:4644:1: rule__Parar__Group__3__Impl : ( ')' ) ;
    public final void rule__Parar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4648:1: ( ( ')' ) )
            // InternalOiArdubot.g:4649:1: ( ')' )
            {
            // InternalOiArdubot.g:4649:1: ( ')' )
            // InternalOiArdubot.g:4650:2: ')'
            {
             before(grammarAccess.getPararAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPararAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Parar__Group__3__Impl"


    // $ANTLR start "rule__Parar__Group__4"
    // InternalOiArdubot.g:4659:1: rule__Parar__Group__4 : rule__Parar__Group__4__Impl ;
    public final void rule__Parar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4663:1: ( rule__Parar__Group__4__Impl )
            // InternalOiArdubot.g:4664:2: rule__Parar__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parar__Group__4__Impl();

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
    // $ANTLR end "rule__Parar__Group__4"


    // $ANTLR start "rule__Parar__Group__4__Impl"
    // InternalOiArdubot.g:4670:1: rule__Parar__Group__4__Impl : ( ';' ) ;
    public final void rule__Parar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4674:1: ( ( ';' ) )
            // InternalOiArdubot.g:4675:1: ( ';' )
            {
            // InternalOiArdubot.g:4675:1: ( ';' )
            // InternalOiArdubot.g:4676:2: ';'
            {
             before(grammarAccess.getPararAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPararAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Parar__Group__4__Impl"


    // $ANTLR start "rule__Para__Group__0"
    // InternalOiArdubot.g:4686:1: rule__Para__Group__0 : rule__Para__Group__0__Impl rule__Para__Group__1 ;
    public final void rule__Para__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4690:1: ( rule__Para__Group__0__Impl rule__Para__Group__1 )
            // InternalOiArdubot.g:4691:2: rule__Para__Group__0__Impl rule__Para__Group__1
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
    // InternalOiArdubot.g:4698:1: rule__Para__Group__0__Impl : ( 'para' ) ;
    public final void rule__Para__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4702:1: ( ( 'para' ) )
            // InternalOiArdubot.g:4703:1: ( 'para' )
            {
            // InternalOiArdubot.g:4703:1: ( 'para' )
            // InternalOiArdubot.g:4704:2: 'para'
            {
             before(grammarAccess.getParaAccess().getParaKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalOiArdubot.g:4713:1: rule__Para__Group__1 : rule__Para__Group__1__Impl rule__Para__Group__2 ;
    public final void rule__Para__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4717:1: ( rule__Para__Group__1__Impl rule__Para__Group__2 )
            // InternalOiArdubot.g:4718:2: rule__Para__Group__1__Impl rule__Para__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalOiArdubot.g:4725:1: rule__Para__Group__1__Impl : ( ( rule__Para__VariavelAssignment_1 ) ) ;
    public final void rule__Para__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4729:1: ( ( ( rule__Para__VariavelAssignment_1 ) ) )
            // InternalOiArdubot.g:4730:1: ( ( rule__Para__VariavelAssignment_1 ) )
            {
            // InternalOiArdubot.g:4730:1: ( ( rule__Para__VariavelAssignment_1 ) )
            // InternalOiArdubot.g:4731:2: ( rule__Para__VariavelAssignment_1 )
            {
             before(grammarAccess.getParaAccess().getVariavelAssignment_1()); 
            // InternalOiArdubot.g:4732:2: ( rule__Para__VariavelAssignment_1 )
            // InternalOiArdubot.g:4732:3: rule__Para__VariavelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Para__VariavelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParaAccess().getVariavelAssignment_1()); 

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
    // InternalOiArdubot.g:4740:1: rule__Para__Group__2 : rule__Para__Group__2__Impl rule__Para__Group__3 ;
    public final void rule__Para__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4744:1: ( rule__Para__Group__2__Impl rule__Para__Group__3 )
            // InternalOiArdubot.g:4745:2: rule__Para__Group__2__Impl rule__Para__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalOiArdubot.g:4752:1: rule__Para__Group__2__Impl : ( 'de' ) ;
    public final void rule__Para__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4756:1: ( ( 'de' ) )
            // InternalOiArdubot.g:4757:1: ( 'de' )
            {
            // InternalOiArdubot.g:4757:1: ( 'de' )
            // InternalOiArdubot.g:4758:2: 'de'
            {
             before(grammarAccess.getParaAccess().getDeKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getDeKeyword_2()); 

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
    // InternalOiArdubot.g:4767:1: rule__Para__Group__3 : rule__Para__Group__3__Impl rule__Para__Group__4 ;
    public final void rule__Para__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4771:1: ( rule__Para__Group__3__Impl rule__Para__Group__4 )
            // InternalOiArdubot.g:4772:2: rule__Para__Group__3__Impl rule__Para__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalOiArdubot.g:4779:1: rule__Para__Group__3__Impl : ( ( rule__Para__DeAssignment_3 ) ) ;
    public final void rule__Para__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4783:1: ( ( ( rule__Para__DeAssignment_3 ) ) )
            // InternalOiArdubot.g:4784:1: ( ( rule__Para__DeAssignment_3 ) )
            {
            // InternalOiArdubot.g:4784:1: ( ( rule__Para__DeAssignment_3 ) )
            // InternalOiArdubot.g:4785:2: ( rule__Para__DeAssignment_3 )
            {
             before(grammarAccess.getParaAccess().getDeAssignment_3()); 
            // InternalOiArdubot.g:4786:2: ( rule__Para__DeAssignment_3 )
            // InternalOiArdubot.g:4786:3: rule__Para__DeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Para__DeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParaAccess().getDeAssignment_3()); 

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
    // InternalOiArdubot.g:4794:1: rule__Para__Group__4 : rule__Para__Group__4__Impl rule__Para__Group__5 ;
    public final void rule__Para__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4798:1: ( rule__Para__Group__4__Impl rule__Para__Group__5 )
            // InternalOiArdubot.g:4799:2: rule__Para__Group__4__Impl rule__Para__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalOiArdubot.g:4806:1: rule__Para__Group__4__Impl : ( 'ate' ) ;
    public final void rule__Para__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4810:1: ( ( 'ate' ) )
            // InternalOiArdubot.g:4811:1: ( 'ate' )
            {
            // InternalOiArdubot.g:4811:1: ( 'ate' )
            // InternalOiArdubot.g:4812:2: 'ate'
            {
             before(grammarAccess.getParaAccess().getAteKeyword_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getAteKeyword_4()); 

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
    // InternalOiArdubot.g:4821:1: rule__Para__Group__5 : rule__Para__Group__5__Impl rule__Para__Group__6 ;
    public final void rule__Para__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4825:1: ( rule__Para__Group__5__Impl rule__Para__Group__6 )
            // InternalOiArdubot.g:4826:2: rule__Para__Group__5__Impl rule__Para__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalOiArdubot.g:4833:1: rule__Para__Group__5__Impl : ( ( rule__Para__AteAssignment_5 ) ) ;
    public final void rule__Para__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4837:1: ( ( ( rule__Para__AteAssignment_5 ) ) )
            // InternalOiArdubot.g:4838:1: ( ( rule__Para__AteAssignment_5 ) )
            {
            // InternalOiArdubot.g:4838:1: ( ( rule__Para__AteAssignment_5 ) )
            // InternalOiArdubot.g:4839:2: ( rule__Para__AteAssignment_5 )
            {
             before(grammarAccess.getParaAccess().getAteAssignment_5()); 
            // InternalOiArdubot.g:4840:2: ( rule__Para__AteAssignment_5 )
            // InternalOiArdubot.g:4840:3: rule__Para__AteAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Para__AteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getParaAccess().getAteAssignment_5()); 

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
    // InternalOiArdubot.g:4848:1: rule__Para__Group__6 : rule__Para__Group__6__Impl rule__Para__Group__7 ;
    public final void rule__Para__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4852:1: ( rule__Para__Group__6__Impl rule__Para__Group__7 )
            // InternalOiArdubot.g:4853:2: rule__Para__Group__6__Impl rule__Para__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalOiArdubot.g:4860:1: rule__Para__Group__6__Impl : ( 'faca' ) ;
    public final void rule__Para__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4864:1: ( ( 'faca' ) )
            // InternalOiArdubot.g:4865:1: ( 'faca' )
            {
            // InternalOiArdubot.g:4865:1: ( 'faca' )
            // InternalOiArdubot.g:4866:2: 'faca'
            {
             before(grammarAccess.getParaAccess().getFacaKeyword_6()); 
            match(input,49,FOLLOW_2); 
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
    // InternalOiArdubot.g:4875:1: rule__Para__Group__7 : rule__Para__Group__7__Impl rule__Para__Group__8 ;
    public final void rule__Para__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4879:1: ( rule__Para__Group__7__Impl rule__Para__Group__8 )
            // InternalOiArdubot.g:4880:2: rule__Para__Group__7__Impl rule__Para__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalOiArdubot.g:4887:1: rule__Para__Group__7__Impl : ( ( rule__Para__CodeAssignment_7 )* ) ;
    public final void rule__Para__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4891:1: ( ( ( rule__Para__CodeAssignment_7 )* ) )
            // InternalOiArdubot.g:4892:1: ( ( rule__Para__CodeAssignment_7 )* )
            {
            // InternalOiArdubot.g:4892:1: ( ( rule__Para__CodeAssignment_7 )* )
            // InternalOiArdubot.g:4893:2: ( rule__Para__CodeAssignment_7 )*
            {
             before(grammarAccess.getParaAccess().getCodeAssignment_7()); 
            // InternalOiArdubot.g:4894:2: ( rule__Para__CodeAssignment_7 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=24 && LA23_0<=25)||(LA23_0>=36 && LA23_0<=39)||(LA23_0>=41 && LA23_0<=46)||LA23_0==50||(LA23_0>=52 && LA23_0<=53)||LA23_0==56||LA23_0==60||LA23_0==64) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOiArdubot.g:4894:3: rule__Para__CodeAssignment_7
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Para__CodeAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getParaAccess().getCodeAssignment_7()); 

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
    // InternalOiArdubot.g:4902:1: rule__Para__Group__8 : rule__Para__Group__8__Impl ;
    public final void rule__Para__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4906:1: ( rule__Para__Group__8__Impl )
            // InternalOiArdubot.g:4907:2: rule__Para__Group__8__Impl
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
    // InternalOiArdubot.g:4913:1: rule__Para__Group__8__Impl : ( ( rule__Para__FimparaAssignment_8 ) ) ;
    public final void rule__Para__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4917:1: ( ( ( rule__Para__FimparaAssignment_8 ) ) )
            // InternalOiArdubot.g:4918:1: ( ( rule__Para__FimparaAssignment_8 ) )
            {
            // InternalOiArdubot.g:4918:1: ( ( rule__Para__FimparaAssignment_8 ) )
            // InternalOiArdubot.g:4919:2: ( rule__Para__FimparaAssignment_8 )
            {
             before(grammarAccess.getParaAccess().getFimparaAssignment_8()); 
            // InternalOiArdubot.g:4920:2: ( rule__Para__FimparaAssignment_8 )
            // InternalOiArdubot.g:4920:3: rule__Para__FimparaAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Para__FimparaAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getParaAccess().getFimparaAssignment_8()); 

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


    // $ANTLR start "rule__Enquanto__Group__0"
    // InternalOiArdubot.g:4929:1: rule__Enquanto__Group__0 : rule__Enquanto__Group__0__Impl rule__Enquanto__Group__1 ;
    public final void rule__Enquanto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4933:1: ( rule__Enquanto__Group__0__Impl rule__Enquanto__Group__1 )
            // InternalOiArdubot.g:4934:2: rule__Enquanto__Group__0__Impl rule__Enquanto__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Enquanto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enquanto__Group__1();

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
    // $ANTLR end "rule__Enquanto__Group__0"


    // $ANTLR start "rule__Enquanto__Group__0__Impl"
    // InternalOiArdubot.g:4941:1: rule__Enquanto__Group__0__Impl : ( 'enquanto' ) ;
    public final void rule__Enquanto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4945:1: ( ( 'enquanto' ) )
            // InternalOiArdubot.g:4946:1: ( 'enquanto' )
            {
            // InternalOiArdubot.g:4946:1: ( 'enquanto' )
            // InternalOiArdubot.g:4947:2: 'enquanto'
            {
             before(grammarAccess.getEnquantoAccess().getEnquantoKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getEnquantoAccess().getEnquantoKeyword_0()); 

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
    // $ANTLR end "rule__Enquanto__Group__0__Impl"


    // $ANTLR start "rule__Enquanto__Group__1"
    // InternalOiArdubot.g:4956:1: rule__Enquanto__Group__1 : rule__Enquanto__Group__1__Impl rule__Enquanto__Group__2 ;
    public final void rule__Enquanto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4960:1: ( rule__Enquanto__Group__1__Impl rule__Enquanto__Group__2 )
            // InternalOiArdubot.g:4961:2: rule__Enquanto__Group__1__Impl rule__Enquanto__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Enquanto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enquanto__Group__2();

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
    // $ANTLR end "rule__Enquanto__Group__1"


    // $ANTLR start "rule__Enquanto__Group__1__Impl"
    // InternalOiArdubot.g:4968:1: rule__Enquanto__Group__1__Impl : ( '(' ) ;
    public final void rule__Enquanto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4972:1: ( ( '(' ) )
            // InternalOiArdubot.g:4973:1: ( '(' )
            {
            // InternalOiArdubot.g:4973:1: ( '(' )
            // InternalOiArdubot.g:4974:2: '('
            {
             before(grammarAccess.getEnquantoAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEnquantoAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Enquanto__Group__1__Impl"


    // $ANTLR start "rule__Enquanto__Group__2"
    // InternalOiArdubot.g:4983:1: rule__Enquanto__Group__2 : rule__Enquanto__Group__2__Impl rule__Enquanto__Group__3 ;
    public final void rule__Enquanto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4987:1: ( rule__Enquanto__Group__2__Impl rule__Enquanto__Group__3 )
            // InternalOiArdubot.g:4988:2: rule__Enquanto__Group__2__Impl rule__Enquanto__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Enquanto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enquanto__Group__3();

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
    // $ANTLR end "rule__Enquanto__Group__2"


    // $ANTLR start "rule__Enquanto__Group__2__Impl"
    // InternalOiArdubot.g:4995:1: rule__Enquanto__Group__2__Impl : ( ( rule__Enquanto__ValorEsquerdaAssignment_2 ) ) ;
    public final void rule__Enquanto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:4999:1: ( ( ( rule__Enquanto__ValorEsquerdaAssignment_2 ) ) )
            // InternalOiArdubot.g:5000:1: ( ( rule__Enquanto__ValorEsquerdaAssignment_2 ) )
            {
            // InternalOiArdubot.g:5000:1: ( ( rule__Enquanto__ValorEsquerdaAssignment_2 ) )
            // InternalOiArdubot.g:5001:2: ( rule__Enquanto__ValorEsquerdaAssignment_2 )
            {
             before(grammarAccess.getEnquantoAccess().getValorEsquerdaAssignment_2()); 
            // InternalOiArdubot.g:5002:2: ( rule__Enquanto__ValorEsquerdaAssignment_2 )
            // InternalOiArdubot.g:5002:3: rule__Enquanto__ValorEsquerdaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Enquanto__ValorEsquerdaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnquantoAccess().getValorEsquerdaAssignment_2()); 

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
    // $ANTLR end "rule__Enquanto__Group__2__Impl"


    // $ANTLR start "rule__Enquanto__Group__3"
    // InternalOiArdubot.g:5010:1: rule__Enquanto__Group__3 : rule__Enquanto__Group__3__Impl rule__Enquanto__Group__4 ;
    public final void rule__Enquanto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5014:1: ( rule__Enquanto__Group__3__Impl rule__Enquanto__Group__4 )
            // InternalOiArdubot.g:5015:2: rule__Enquanto__Group__3__Impl rule__Enquanto__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Enquanto__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enquanto__Group__4();

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
    // $ANTLR end "rule__Enquanto__Group__3"


    // $ANTLR start "rule__Enquanto__Group__3__Impl"
    // InternalOiArdubot.g:5022:1: rule__Enquanto__Group__3__Impl : ( ( rule__Enquanto__RelacaoAssignment_3 ) ) ;
    public final void rule__Enquanto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5026:1: ( ( ( rule__Enquanto__RelacaoAssignment_3 ) ) )
            // InternalOiArdubot.g:5027:1: ( ( rule__Enquanto__RelacaoAssignment_3 ) )
            {
            // InternalOiArdubot.g:5027:1: ( ( rule__Enquanto__RelacaoAssignment_3 ) )
            // InternalOiArdubot.g:5028:2: ( rule__Enquanto__RelacaoAssignment_3 )
            {
             before(grammarAccess.getEnquantoAccess().getRelacaoAssignment_3()); 
            // InternalOiArdubot.g:5029:2: ( rule__Enquanto__RelacaoAssignment_3 )
            // InternalOiArdubot.g:5029:3: rule__Enquanto__RelacaoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Enquanto__RelacaoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnquantoAccess().getRelacaoAssignment_3()); 

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
    // $ANTLR end "rule__Enquanto__Group__3__Impl"


    // $ANTLR start "rule__Enquanto__Group__4"
    // InternalOiArdubot.g:5037:1: rule__Enquanto__Group__4 : rule__Enquanto__Group__4__Impl rule__Enquanto__Group__5 ;
    public final void rule__Enquanto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5041:1: ( rule__Enquanto__Group__4__Impl rule__Enquanto__Group__5 )
            // InternalOiArdubot.g:5042:2: rule__Enquanto__Group__4__Impl rule__Enquanto__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Enquanto__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enquanto__Group__5();

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
    // $ANTLR end "rule__Enquanto__Group__4"


    // $ANTLR start "rule__Enquanto__Group__4__Impl"
    // InternalOiArdubot.g:5049:1: rule__Enquanto__Group__4__Impl : ( ( rule__Enquanto__ValorDireitaAssignment_4 ) ) ;
    public final void rule__Enquanto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5053:1: ( ( ( rule__Enquanto__ValorDireitaAssignment_4 ) ) )
            // InternalOiArdubot.g:5054:1: ( ( rule__Enquanto__ValorDireitaAssignment_4 ) )
            {
            // InternalOiArdubot.g:5054:1: ( ( rule__Enquanto__ValorDireitaAssignment_4 ) )
            // InternalOiArdubot.g:5055:2: ( rule__Enquanto__ValorDireitaAssignment_4 )
            {
             before(grammarAccess.getEnquantoAccess().getValorDireitaAssignment_4()); 
            // InternalOiArdubot.g:5056:2: ( rule__Enquanto__ValorDireitaAssignment_4 )
            // InternalOiArdubot.g:5056:3: rule__Enquanto__ValorDireitaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Enquanto__ValorDireitaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnquantoAccess().getValorDireitaAssignment_4()); 

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
    // $ANTLR end "rule__Enquanto__Group__4__Impl"


    // $ANTLR start "rule__Enquanto__Group__5"
    // InternalOiArdubot.g:5064:1: rule__Enquanto__Group__5 : rule__Enquanto__Group__5__Impl rule__Enquanto__Group__6 ;
    public final void rule__Enquanto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5068:1: ( rule__Enquanto__Group__5__Impl rule__Enquanto__Group__6 )
            // InternalOiArdubot.g:5069:2: rule__Enquanto__Group__5__Impl rule__Enquanto__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Enquanto__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enquanto__Group__6();

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
    // $ANTLR end "rule__Enquanto__Group__5"


    // $ANTLR start "rule__Enquanto__Group__5__Impl"
    // InternalOiArdubot.g:5076:1: rule__Enquanto__Group__5__Impl : ( ')' ) ;
    public final void rule__Enquanto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5080:1: ( ( ')' ) )
            // InternalOiArdubot.g:5081:1: ( ')' )
            {
            // InternalOiArdubot.g:5081:1: ( ')' )
            // InternalOiArdubot.g:5082:2: ')'
            {
             before(grammarAccess.getEnquantoAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEnquantoAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Enquanto__Group__5__Impl"


    // $ANTLR start "rule__Enquanto__Group__6"
    // InternalOiArdubot.g:5091:1: rule__Enquanto__Group__6 : rule__Enquanto__Group__6__Impl rule__Enquanto__Group__7 ;
    public final void rule__Enquanto__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5095:1: ( rule__Enquanto__Group__6__Impl rule__Enquanto__Group__7 )
            // InternalOiArdubot.g:5096:2: rule__Enquanto__Group__6__Impl rule__Enquanto__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Enquanto__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enquanto__Group__7();

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
    // $ANTLR end "rule__Enquanto__Group__6"


    // $ANTLR start "rule__Enquanto__Group__6__Impl"
    // InternalOiArdubot.g:5103:1: rule__Enquanto__Group__6__Impl : ( 'faca' ) ;
    public final void rule__Enquanto__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5107:1: ( ( 'faca' ) )
            // InternalOiArdubot.g:5108:1: ( 'faca' )
            {
            // InternalOiArdubot.g:5108:1: ( 'faca' )
            // InternalOiArdubot.g:5109:2: 'faca'
            {
             before(grammarAccess.getEnquantoAccess().getFacaKeyword_6()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getEnquantoAccess().getFacaKeyword_6()); 

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
    // $ANTLR end "rule__Enquanto__Group__6__Impl"


    // $ANTLR start "rule__Enquanto__Group__7"
    // InternalOiArdubot.g:5118:1: rule__Enquanto__Group__7 : rule__Enquanto__Group__7__Impl rule__Enquanto__Group__8 ;
    public final void rule__Enquanto__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5122:1: ( rule__Enquanto__Group__7__Impl rule__Enquanto__Group__8 )
            // InternalOiArdubot.g:5123:2: rule__Enquanto__Group__7__Impl rule__Enquanto__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__Enquanto__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enquanto__Group__8();

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
    // $ANTLR end "rule__Enquanto__Group__7"


    // $ANTLR start "rule__Enquanto__Group__7__Impl"
    // InternalOiArdubot.g:5130:1: rule__Enquanto__Group__7__Impl : ( ( rule__Enquanto__CodeAssignment_7 )* ) ;
    public final void rule__Enquanto__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5134:1: ( ( ( rule__Enquanto__CodeAssignment_7 )* ) )
            // InternalOiArdubot.g:5135:1: ( ( rule__Enquanto__CodeAssignment_7 )* )
            {
            // InternalOiArdubot.g:5135:1: ( ( rule__Enquanto__CodeAssignment_7 )* )
            // InternalOiArdubot.g:5136:2: ( rule__Enquanto__CodeAssignment_7 )*
            {
             before(grammarAccess.getEnquantoAccess().getCodeAssignment_7()); 
            // InternalOiArdubot.g:5137:2: ( rule__Enquanto__CodeAssignment_7 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||(LA24_0>=24 && LA24_0<=25)||(LA24_0>=36 && LA24_0<=39)||(LA24_0>=41 && LA24_0<=46)||LA24_0==50||(LA24_0>=52 && LA24_0<=53)||LA24_0==56||LA24_0==60||LA24_0==64) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOiArdubot.g:5137:3: rule__Enquanto__CodeAssignment_7
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Enquanto__CodeAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getEnquantoAccess().getCodeAssignment_7()); 

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
    // $ANTLR end "rule__Enquanto__Group__7__Impl"


    // $ANTLR start "rule__Enquanto__Group__8"
    // InternalOiArdubot.g:5145:1: rule__Enquanto__Group__8 : rule__Enquanto__Group__8__Impl ;
    public final void rule__Enquanto__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5149:1: ( rule__Enquanto__Group__8__Impl )
            // InternalOiArdubot.g:5150:2: rule__Enquanto__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enquanto__Group__8__Impl();

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
    // $ANTLR end "rule__Enquanto__Group__8"


    // $ANTLR start "rule__Enquanto__Group__8__Impl"
    // InternalOiArdubot.g:5156:1: rule__Enquanto__Group__8__Impl : ( 'fimenquanto' ) ;
    public final void rule__Enquanto__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5160:1: ( ( 'fimenquanto' ) )
            // InternalOiArdubot.g:5161:1: ( 'fimenquanto' )
            {
            // InternalOiArdubot.g:5161:1: ( 'fimenquanto' )
            // InternalOiArdubot.g:5162:2: 'fimenquanto'
            {
             before(grammarAccess.getEnquantoAccess().getFimenquantoKeyword_8()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getEnquantoAccess().getFimenquantoKeyword_8()); 

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
    // $ANTLR end "rule__Enquanto__Group__8__Impl"


    // $ANTLR start "rule__Repita__Group__0"
    // InternalOiArdubot.g:5172:1: rule__Repita__Group__0 : rule__Repita__Group__0__Impl rule__Repita__Group__1 ;
    public final void rule__Repita__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5176:1: ( rule__Repita__Group__0__Impl rule__Repita__Group__1 )
            // InternalOiArdubot.g:5177:2: rule__Repita__Group__0__Impl rule__Repita__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Repita__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repita__Group__1();

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
    // $ANTLR end "rule__Repita__Group__0"


    // $ANTLR start "rule__Repita__Group__0__Impl"
    // InternalOiArdubot.g:5184:1: rule__Repita__Group__0__Impl : ( 'repita' ) ;
    public final void rule__Repita__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5188:1: ( ( 'repita' ) )
            // InternalOiArdubot.g:5189:1: ( 'repita' )
            {
            // InternalOiArdubot.g:5189:1: ( 'repita' )
            // InternalOiArdubot.g:5190:2: 'repita'
            {
             before(grammarAccess.getRepitaAccess().getRepitaKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRepitaAccess().getRepitaKeyword_0()); 

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
    // $ANTLR end "rule__Repita__Group__0__Impl"


    // $ANTLR start "rule__Repita__Group__1"
    // InternalOiArdubot.g:5199:1: rule__Repita__Group__1 : rule__Repita__Group__1__Impl rule__Repita__Group__2 ;
    public final void rule__Repita__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5203:1: ( rule__Repita__Group__1__Impl rule__Repita__Group__2 )
            // InternalOiArdubot.g:5204:2: rule__Repita__Group__1__Impl rule__Repita__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Repita__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repita__Group__2();

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
    // $ANTLR end "rule__Repita__Group__1"


    // $ANTLR start "rule__Repita__Group__1__Impl"
    // InternalOiArdubot.g:5211:1: rule__Repita__Group__1__Impl : ( ( rule__Repita__CodeAssignment_1 )* ) ;
    public final void rule__Repita__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5215:1: ( ( ( rule__Repita__CodeAssignment_1 )* ) )
            // InternalOiArdubot.g:5216:1: ( ( rule__Repita__CodeAssignment_1 )* )
            {
            // InternalOiArdubot.g:5216:1: ( ( rule__Repita__CodeAssignment_1 )* )
            // InternalOiArdubot.g:5217:2: ( rule__Repita__CodeAssignment_1 )*
            {
             before(grammarAccess.getRepitaAccess().getCodeAssignment_1()); 
            // InternalOiArdubot.g:5218:2: ( rule__Repita__CodeAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=24 && LA25_0<=25)||(LA25_0>=36 && LA25_0<=39)||(LA25_0>=41 && LA25_0<=46)||LA25_0==50||(LA25_0>=52 && LA25_0<=53)||LA25_0==56||LA25_0==60||LA25_0==64) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalOiArdubot.g:5218:3: rule__Repita__CodeAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Repita__CodeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getRepitaAccess().getCodeAssignment_1()); 

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
    // $ANTLR end "rule__Repita__Group__1__Impl"


    // $ANTLR start "rule__Repita__Group__2"
    // InternalOiArdubot.g:5226:1: rule__Repita__Group__2 : rule__Repita__Group__2__Impl rule__Repita__Group__3 ;
    public final void rule__Repita__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5230:1: ( rule__Repita__Group__2__Impl rule__Repita__Group__3 )
            // InternalOiArdubot.g:5231:2: rule__Repita__Group__2__Impl rule__Repita__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Repita__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repita__Group__3();

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
    // $ANTLR end "rule__Repita__Group__2"


    // $ANTLR start "rule__Repita__Group__2__Impl"
    // InternalOiArdubot.g:5238:1: rule__Repita__Group__2__Impl : ( 'ate' ) ;
    public final void rule__Repita__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5242:1: ( ( 'ate' ) )
            // InternalOiArdubot.g:5243:1: ( 'ate' )
            {
            // InternalOiArdubot.g:5243:1: ( 'ate' )
            // InternalOiArdubot.g:5244:2: 'ate'
            {
             before(grammarAccess.getRepitaAccess().getAteKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRepitaAccess().getAteKeyword_2()); 

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
    // $ANTLR end "rule__Repita__Group__2__Impl"


    // $ANTLR start "rule__Repita__Group__3"
    // InternalOiArdubot.g:5253:1: rule__Repita__Group__3 : rule__Repita__Group__3__Impl rule__Repita__Group__4 ;
    public final void rule__Repita__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5257:1: ( rule__Repita__Group__3__Impl rule__Repita__Group__4 )
            // InternalOiArdubot.g:5258:2: rule__Repita__Group__3__Impl rule__Repita__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Repita__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repita__Group__4();

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
    // $ANTLR end "rule__Repita__Group__3"


    // $ANTLR start "rule__Repita__Group__3__Impl"
    // InternalOiArdubot.g:5265:1: rule__Repita__Group__3__Impl : ( '(' ) ;
    public final void rule__Repita__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5269:1: ( ( '(' ) )
            // InternalOiArdubot.g:5270:1: ( '(' )
            {
            // InternalOiArdubot.g:5270:1: ( '(' )
            // InternalOiArdubot.g:5271:2: '('
            {
             before(grammarAccess.getRepitaAccess().getLeftParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRepitaAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Repita__Group__3__Impl"


    // $ANTLR start "rule__Repita__Group__4"
    // InternalOiArdubot.g:5280:1: rule__Repita__Group__4 : rule__Repita__Group__4__Impl rule__Repita__Group__5 ;
    public final void rule__Repita__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5284:1: ( rule__Repita__Group__4__Impl rule__Repita__Group__5 )
            // InternalOiArdubot.g:5285:2: rule__Repita__Group__4__Impl rule__Repita__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Repita__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repita__Group__5();

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
    // $ANTLR end "rule__Repita__Group__4"


    // $ANTLR start "rule__Repita__Group__4__Impl"
    // InternalOiArdubot.g:5292:1: rule__Repita__Group__4__Impl : ( ( rule__Repita__ValorEsquerdaAssignment_4 ) ) ;
    public final void rule__Repita__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5296:1: ( ( ( rule__Repita__ValorEsquerdaAssignment_4 ) ) )
            // InternalOiArdubot.g:5297:1: ( ( rule__Repita__ValorEsquerdaAssignment_4 ) )
            {
            // InternalOiArdubot.g:5297:1: ( ( rule__Repita__ValorEsquerdaAssignment_4 ) )
            // InternalOiArdubot.g:5298:2: ( rule__Repita__ValorEsquerdaAssignment_4 )
            {
             before(grammarAccess.getRepitaAccess().getValorEsquerdaAssignment_4()); 
            // InternalOiArdubot.g:5299:2: ( rule__Repita__ValorEsquerdaAssignment_4 )
            // InternalOiArdubot.g:5299:3: rule__Repita__ValorEsquerdaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Repita__ValorEsquerdaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRepitaAccess().getValorEsquerdaAssignment_4()); 

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
    // $ANTLR end "rule__Repita__Group__4__Impl"


    // $ANTLR start "rule__Repita__Group__5"
    // InternalOiArdubot.g:5307:1: rule__Repita__Group__5 : rule__Repita__Group__5__Impl rule__Repita__Group__6 ;
    public final void rule__Repita__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5311:1: ( rule__Repita__Group__5__Impl rule__Repita__Group__6 )
            // InternalOiArdubot.g:5312:2: rule__Repita__Group__5__Impl rule__Repita__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Repita__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repita__Group__6();

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
    // $ANTLR end "rule__Repita__Group__5"


    // $ANTLR start "rule__Repita__Group__5__Impl"
    // InternalOiArdubot.g:5319:1: rule__Repita__Group__5__Impl : ( ( rule__Repita__RelacaoAssignment_5 ) ) ;
    public final void rule__Repita__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5323:1: ( ( ( rule__Repita__RelacaoAssignment_5 ) ) )
            // InternalOiArdubot.g:5324:1: ( ( rule__Repita__RelacaoAssignment_5 ) )
            {
            // InternalOiArdubot.g:5324:1: ( ( rule__Repita__RelacaoAssignment_5 ) )
            // InternalOiArdubot.g:5325:2: ( rule__Repita__RelacaoAssignment_5 )
            {
             before(grammarAccess.getRepitaAccess().getRelacaoAssignment_5()); 
            // InternalOiArdubot.g:5326:2: ( rule__Repita__RelacaoAssignment_5 )
            // InternalOiArdubot.g:5326:3: rule__Repita__RelacaoAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Repita__RelacaoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRepitaAccess().getRelacaoAssignment_5()); 

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
    // $ANTLR end "rule__Repita__Group__5__Impl"


    // $ANTLR start "rule__Repita__Group__6"
    // InternalOiArdubot.g:5334:1: rule__Repita__Group__6 : rule__Repita__Group__6__Impl rule__Repita__Group__7 ;
    public final void rule__Repita__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5338:1: ( rule__Repita__Group__6__Impl rule__Repita__Group__7 )
            // InternalOiArdubot.g:5339:2: rule__Repita__Group__6__Impl rule__Repita__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Repita__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repita__Group__7();

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
    // $ANTLR end "rule__Repita__Group__6"


    // $ANTLR start "rule__Repita__Group__6__Impl"
    // InternalOiArdubot.g:5346:1: rule__Repita__Group__6__Impl : ( ( rule__Repita__ValorDireitaAssignment_6 ) ) ;
    public final void rule__Repita__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5350:1: ( ( ( rule__Repita__ValorDireitaAssignment_6 ) ) )
            // InternalOiArdubot.g:5351:1: ( ( rule__Repita__ValorDireitaAssignment_6 ) )
            {
            // InternalOiArdubot.g:5351:1: ( ( rule__Repita__ValorDireitaAssignment_6 ) )
            // InternalOiArdubot.g:5352:2: ( rule__Repita__ValorDireitaAssignment_6 )
            {
             before(grammarAccess.getRepitaAccess().getValorDireitaAssignment_6()); 
            // InternalOiArdubot.g:5353:2: ( rule__Repita__ValorDireitaAssignment_6 )
            // InternalOiArdubot.g:5353:3: rule__Repita__ValorDireitaAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Repita__ValorDireitaAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRepitaAccess().getValorDireitaAssignment_6()); 

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
    // $ANTLR end "rule__Repita__Group__6__Impl"


    // $ANTLR start "rule__Repita__Group__7"
    // InternalOiArdubot.g:5361:1: rule__Repita__Group__7 : rule__Repita__Group__7__Impl ;
    public final void rule__Repita__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5365:1: ( rule__Repita__Group__7__Impl )
            // InternalOiArdubot.g:5366:2: rule__Repita__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Repita__Group__7__Impl();

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
    // $ANTLR end "rule__Repita__Group__7"


    // $ANTLR start "rule__Repita__Group__7__Impl"
    // InternalOiArdubot.g:5372:1: rule__Repita__Group__7__Impl : ( ')' ) ;
    public final void rule__Repita__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5376:1: ( ( ')' ) )
            // InternalOiArdubot.g:5377:1: ( ')' )
            {
            // InternalOiArdubot.g:5377:1: ( ')' )
            // InternalOiArdubot.g:5378:2: ')'
            {
             before(grammarAccess.getRepitaAccess().getRightParenthesisKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRepitaAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__Repita__Group__7__Impl"


    // $ANTLR start "rule__Se__Group__0"
    // InternalOiArdubot.g:5388:1: rule__Se__Group__0 : rule__Se__Group__0__Impl rule__Se__Group__1 ;
    public final void rule__Se__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5392:1: ( rule__Se__Group__0__Impl rule__Se__Group__1 )
            // InternalOiArdubot.g:5393:2: rule__Se__Group__0__Impl rule__Se__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Se__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Se__Group__1();

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
    // $ANTLR end "rule__Se__Group__0"


    // $ANTLR start "rule__Se__Group__0__Impl"
    // InternalOiArdubot.g:5400:1: rule__Se__Group__0__Impl : ( 'se' ) ;
    public final void rule__Se__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5404:1: ( ( 'se' ) )
            // InternalOiArdubot.g:5405:1: ( 'se' )
            {
            // InternalOiArdubot.g:5405:1: ( 'se' )
            // InternalOiArdubot.g:5406:2: 'se'
            {
             before(grammarAccess.getSeAccess().getSeKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getSeAccess().getSeKeyword_0()); 

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
    // $ANTLR end "rule__Se__Group__0__Impl"


    // $ANTLR start "rule__Se__Group__1"
    // InternalOiArdubot.g:5415:1: rule__Se__Group__1 : rule__Se__Group__1__Impl rule__Se__Group__2 ;
    public final void rule__Se__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5419:1: ( rule__Se__Group__1__Impl rule__Se__Group__2 )
            // InternalOiArdubot.g:5420:2: rule__Se__Group__1__Impl rule__Se__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Se__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Se__Group__2();

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
    // $ANTLR end "rule__Se__Group__1"


    // $ANTLR start "rule__Se__Group__1__Impl"
    // InternalOiArdubot.g:5427:1: rule__Se__Group__1__Impl : ( ( rule__Se__ValorEsquerdaAssignment_1 ) ) ;
    public final void rule__Se__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5431:1: ( ( ( rule__Se__ValorEsquerdaAssignment_1 ) ) )
            // InternalOiArdubot.g:5432:1: ( ( rule__Se__ValorEsquerdaAssignment_1 ) )
            {
            // InternalOiArdubot.g:5432:1: ( ( rule__Se__ValorEsquerdaAssignment_1 ) )
            // InternalOiArdubot.g:5433:2: ( rule__Se__ValorEsquerdaAssignment_1 )
            {
             before(grammarAccess.getSeAccess().getValorEsquerdaAssignment_1()); 
            // InternalOiArdubot.g:5434:2: ( rule__Se__ValorEsquerdaAssignment_1 )
            // InternalOiArdubot.g:5434:3: rule__Se__ValorEsquerdaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Se__ValorEsquerdaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSeAccess().getValorEsquerdaAssignment_1()); 

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
    // $ANTLR end "rule__Se__Group__1__Impl"


    // $ANTLR start "rule__Se__Group__2"
    // InternalOiArdubot.g:5442:1: rule__Se__Group__2 : rule__Se__Group__2__Impl rule__Se__Group__3 ;
    public final void rule__Se__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5446:1: ( rule__Se__Group__2__Impl rule__Se__Group__3 )
            // InternalOiArdubot.g:5447:2: rule__Se__Group__2__Impl rule__Se__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Se__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Se__Group__3();

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
    // $ANTLR end "rule__Se__Group__2"


    // $ANTLR start "rule__Se__Group__2__Impl"
    // InternalOiArdubot.g:5454:1: rule__Se__Group__2__Impl : ( ( rule__Se__RelacaoAssignment_2 ) ) ;
    public final void rule__Se__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5458:1: ( ( ( rule__Se__RelacaoAssignment_2 ) ) )
            // InternalOiArdubot.g:5459:1: ( ( rule__Se__RelacaoAssignment_2 ) )
            {
            // InternalOiArdubot.g:5459:1: ( ( rule__Se__RelacaoAssignment_2 ) )
            // InternalOiArdubot.g:5460:2: ( rule__Se__RelacaoAssignment_2 )
            {
             before(grammarAccess.getSeAccess().getRelacaoAssignment_2()); 
            // InternalOiArdubot.g:5461:2: ( rule__Se__RelacaoAssignment_2 )
            // InternalOiArdubot.g:5461:3: rule__Se__RelacaoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Se__RelacaoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSeAccess().getRelacaoAssignment_2()); 

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
    // $ANTLR end "rule__Se__Group__2__Impl"


    // $ANTLR start "rule__Se__Group__3"
    // InternalOiArdubot.g:5469:1: rule__Se__Group__3 : rule__Se__Group__3__Impl rule__Se__Group__4 ;
    public final void rule__Se__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5473:1: ( rule__Se__Group__3__Impl rule__Se__Group__4 )
            // InternalOiArdubot.g:5474:2: rule__Se__Group__3__Impl rule__Se__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Se__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Se__Group__4();

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
    // $ANTLR end "rule__Se__Group__3"


    // $ANTLR start "rule__Se__Group__3__Impl"
    // InternalOiArdubot.g:5481:1: rule__Se__Group__3__Impl : ( ( rule__Se__ValorDireitaAssignment_3 ) ) ;
    public final void rule__Se__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5485:1: ( ( ( rule__Se__ValorDireitaAssignment_3 ) ) )
            // InternalOiArdubot.g:5486:1: ( ( rule__Se__ValorDireitaAssignment_3 ) )
            {
            // InternalOiArdubot.g:5486:1: ( ( rule__Se__ValorDireitaAssignment_3 ) )
            // InternalOiArdubot.g:5487:2: ( rule__Se__ValorDireitaAssignment_3 )
            {
             before(grammarAccess.getSeAccess().getValorDireitaAssignment_3()); 
            // InternalOiArdubot.g:5488:2: ( rule__Se__ValorDireitaAssignment_3 )
            // InternalOiArdubot.g:5488:3: rule__Se__ValorDireitaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Se__ValorDireitaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSeAccess().getValorDireitaAssignment_3()); 

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
    // $ANTLR end "rule__Se__Group__3__Impl"


    // $ANTLR start "rule__Se__Group__4"
    // InternalOiArdubot.g:5496:1: rule__Se__Group__4 : rule__Se__Group__4__Impl rule__Se__Group__5 ;
    public final void rule__Se__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5500:1: ( rule__Se__Group__4__Impl rule__Se__Group__5 )
            // InternalOiArdubot.g:5501:2: rule__Se__Group__4__Impl rule__Se__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Se__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Se__Group__5();

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
    // $ANTLR end "rule__Se__Group__4"


    // $ANTLR start "rule__Se__Group__4__Impl"
    // InternalOiArdubot.g:5508:1: rule__Se__Group__4__Impl : ( 'entao' ) ;
    public final void rule__Se__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5512:1: ( ( 'entao' ) )
            // InternalOiArdubot.g:5513:1: ( 'entao' )
            {
            // InternalOiArdubot.g:5513:1: ( 'entao' )
            // InternalOiArdubot.g:5514:2: 'entao'
            {
             before(grammarAccess.getSeAccess().getEntaoKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSeAccess().getEntaoKeyword_4()); 

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
    // $ANTLR end "rule__Se__Group__4__Impl"


    // $ANTLR start "rule__Se__Group__5"
    // InternalOiArdubot.g:5523:1: rule__Se__Group__5 : rule__Se__Group__5__Impl rule__Se__Group__6 ;
    public final void rule__Se__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5527:1: ( rule__Se__Group__5__Impl rule__Se__Group__6 )
            // InternalOiArdubot.g:5528:2: rule__Se__Group__5__Impl rule__Se__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__Se__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Se__Group__6();

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
    // $ANTLR end "rule__Se__Group__5"


    // $ANTLR start "rule__Se__Group__5__Impl"
    // InternalOiArdubot.g:5535:1: rule__Se__Group__5__Impl : ( ( rule__Se__CodeAssignment_5 )* ) ;
    public final void rule__Se__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5539:1: ( ( ( rule__Se__CodeAssignment_5 )* ) )
            // InternalOiArdubot.g:5540:1: ( ( rule__Se__CodeAssignment_5 )* )
            {
            // InternalOiArdubot.g:5540:1: ( ( rule__Se__CodeAssignment_5 )* )
            // InternalOiArdubot.g:5541:2: ( rule__Se__CodeAssignment_5 )*
            {
             before(grammarAccess.getSeAccess().getCodeAssignment_5()); 
            // InternalOiArdubot.g:5542:2: ( rule__Se__CodeAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||(LA26_0>=24 && LA26_0<=25)||(LA26_0>=36 && LA26_0<=39)||(LA26_0>=41 && LA26_0<=46)||LA26_0==50||(LA26_0>=52 && LA26_0<=53)||LA26_0==56||LA26_0==60||LA26_0==64) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalOiArdubot.g:5542:3: rule__Se__CodeAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Se__CodeAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSeAccess().getCodeAssignment_5()); 

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
    // $ANTLR end "rule__Se__Group__5__Impl"


    // $ANTLR start "rule__Se__Group__6"
    // InternalOiArdubot.g:5550:1: rule__Se__Group__6 : rule__Se__Group__6__Impl rule__Se__Group__7 ;
    public final void rule__Se__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5554:1: ( rule__Se__Group__6__Impl rule__Se__Group__7 )
            // InternalOiArdubot.g:5555:2: rule__Se__Group__6__Impl rule__Se__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__Se__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Se__Group__7();

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
    // $ANTLR end "rule__Se__Group__6"


    // $ANTLR start "rule__Se__Group__6__Impl"
    // InternalOiArdubot.g:5562:1: rule__Se__Group__6__Impl : ( ( rule__Se__SenaoAssignment_6 )? ) ;
    public final void rule__Se__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5566:1: ( ( ( rule__Se__SenaoAssignment_6 )? ) )
            // InternalOiArdubot.g:5567:1: ( ( rule__Se__SenaoAssignment_6 )? )
            {
            // InternalOiArdubot.g:5567:1: ( ( rule__Se__SenaoAssignment_6 )? )
            // InternalOiArdubot.g:5568:2: ( rule__Se__SenaoAssignment_6 )?
            {
             before(grammarAccess.getSeAccess().getSenaoAssignment_6()); 
            // InternalOiArdubot.g:5569:2: ( rule__Se__SenaoAssignment_6 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==55) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOiArdubot.g:5569:3: rule__Se__SenaoAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Se__SenaoAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSeAccess().getSenaoAssignment_6()); 

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
    // $ANTLR end "rule__Se__Group__6__Impl"


    // $ANTLR start "rule__Se__Group__7"
    // InternalOiArdubot.g:5577:1: rule__Se__Group__7 : rule__Se__Group__7__Impl ;
    public final void rule__Se__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5581:1: ( rule__Se__Group__7__Impl )
            // InternalOiArdubot.g:5582:2: rule__Se__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Se__Group__7__Impl();

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
    // $ANTLR end "rule__Se__Group__7"


    // $ANTLR start "rule__Se__Group__7__Impl"
    // InternalOiArdubot.g:5588:1: rule__Se__Group__7__Impl : ( ( rule__Se__FimseAssignment_7 ) ) ;
    public final void rule__Se__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5592:1: ( ( ( rule__Se__FimseAssignment_7 ) ) )
            // InternalOiArdubot.g:5593:1: ( ( rule__Se__FimseAssignment_7 ) )
            {
            // InternalOiArdubot.g:5593:1: ( ( rule__Se__FimseAssignment_7 ) )
            // InternalOiArdubot.g:5594:2: ( rule__Se__FimseAssignment_7 )
            {
             before(grammarAccess.getSeAccess().getFimseAssignment_7()); 
            // InternalOiArdubot.g:5595:2: ( rule__Se__FimseAssignment_7 )
            // InternalOiArdubot.g:5595:3: rule__Se__FimseAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Se__FimseAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSeAccess().getFimseAssignment_7()); 

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
    // $ANTLR end "rule__Se__Group__7__Impl"


    // $ANTLR start "rule__Senao__Group__0"
    // InternalOiArdubot.g:5604:1: rule__Senao__Group__0 : rule__Senao__Group__0__Impl rule__Senao__Group__1 ;
    public final void rule__Senao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5608:1: ( rule__Senao__Group__0__Impl rule__Senao__Group__1 )
            // InternalOiArdubot.g:5609:2: rule__Senao__Group__0__Impl rule__Senao__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalOiArdubot.g:5616:1: rule__Senao__Group__0__Impl : ( 'senao' ) ;
    public final void rule__Senao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5620:1: ( ( 'senao' ) )
            // InternalOiArdubot.g:5621:1: ( 'senao' )
            {
            // InternalOiArdubot.g:5621:1: ( 'senao' )
            // InternalOiArdubot.g:5622:2: 'senao'
            {
             before(grammarAccess.getSenaoAccess().getSenaoKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSenaoAccess().getSenaoKeyword_0()); 

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
    // InternalOiArdubot.g:5631:1: rule__Senao__Group__1 : rule__Senao__Group__1__Impl ;
    public final void rule__Senao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5635:1: ( rule__Senao__Group__1__Impl )
            // InternalOiArdubot.g:5636:2: rule__Senao__Group__1__Impl
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
    // InternalOiArdubot.g:5642:1: rule__Senao__Group__1__Impl : ( ( rule__Senao__CodeAssignment_1 )* ) ;
    public final void rule__Senao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5646:1: ( ( ( rule__Senao__CodeAssignment_1 )* ) )
            // InternalOiArdubot.g:5647:1: ( ( rule__Senao__CodeAssignment_1 )* )
            {
            // InternalOiArdubot.g:5647:1: ( ( rule__Senao__CodeAssignment_1 )* )
            // InternalOiArdubot.g:5648:2: ( rule__Senao__CodeAssignment_1 )*
            {
             before(grammarAccess.getSenaoAccess().getCodeAssignment_1()); 
            // InternalOiArdubot.g:5649:2: ( rule__Senao__CodeAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=24 && LA28_0<=25)||(LA28_0>=36 && LA28_0<=39)||(LA28_0>=41 && LA28_0<=46)||LA28_0==50||(LA28_0>=52 && LA28_0<=53)||LA28_0==56||LA28_0==60||LA28_0==64) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalOiArdubot.g:5649:3: rule__Senao__CodeAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Senao__CodeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSenaoAccess().getCodeAssignment_1()); 

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


    // $ANTLR start "rule__Escolha__Group__0"
    // InternalOiArdubot.g:5658:1: rule__Escolha__Group__0 : rule__Escolha__Group__0__Impl rule__Escolha__Group__1 ;
    public final void rule__Escolha__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5662:1: ( rule__Escolha__Group__0__Impl rule__Escolha__Group__1 )
            // InternalOiArdubot.g:5663:2: rule__Escolha__Group__0__Impl rule__Escolha__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Escolha__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escolha__Group__1();

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
    // $ANTLR end "rule__Escolha__Group__0"


    // $ANTLR start "rule__Escolha__Group__0__Impl"
    // InternalOiArdubot.g:5670:1: rule__Escolha__Group__0__Impl : ( 'escolha' ) ;
    public final void rule__Escolha__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5674:1: ( ( 'escolha' ) )
            // InternalOiArdubot.g:5675:1: ( 'escolha' )
            {
            // InternalOiArdubot.g:5675:1: ( 'escolha' )
            // InternalOiArdubot.g:5676:2: 'escolha'
            {
             before(grammarAccess.getEscolhaAccess().getEscolhaKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getEscolhaAccess().getEscolhaKeyword_0()); 

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
    // $ANTLR end "rule__Escolha__Group__0__Impl"


    // $ANTLR start "rule__Escolha__Group__1"
    // InternalOiArdubot.g:5685:1: rule__Escolha__Group__1 : rule__Escolha__Group__1__Impl rule__Escolha__Group__2 ;
    public final void rule__Escolha__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5689:1: ( rule__Escolha__Group__1__Impl rule__Escolha__Group__2 )
            // InternalOiArdubot.g:5690:2: rule__Escolha__Group__1__Impl rule__Escolha__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Escolha__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escolha__Group__2();

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
    // $ANTLR end "rule__Escolha__Group__1"


    // $ANTLR start "rule__Escolha__Group__1__Impl"
    // InternalOiArdubot.g:5697:1: rule__Escolha__Group__1__Impl : ( ( rule__Escolha__ValorAssignment_1 ) ) ;
    public final void rule__Escolha__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5701:1: ( ( ( rule__Escolha__ValorAssignment_1 ) ) )
            // InternalOiArdubot.g:5702:1: ( ( rule__Escolha__ValorAssignment_1 ) )
            {
            // InternalOiArdubot.g:5702:1: ( ( rule__Escolha__ValorAssignment_1 ) )
            // InternalOiArdubot.g:5703:2: ( rule__Escolha__ValorAssignment_1 )
            {
             before(grammarAccess.getEscolhaAccess().getValorAssignment_1()); 
            // InternalOiArdubot.g:5704:2: ( rule__Escolha__ValorAssignment_1 )
            // InternalOiArdubot.g:5704:3: rule__Escolha__ValorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Escolha__ValorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEscolhaAccess().getValorAssignment_1()); 

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
    // $ANTLR end "rule__Escolha__Group__1__Impl"


    // $ANTLR start "rule__Escolha__Group__2"
    // InternalOiArdubot.g:5712:1: rule__Escolha__Group__2 : rule__Escolha__Group__2__Impl rule__Escolha__Group__3 ;
    public final void rule__Escolha__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5716:1: ( rule__Escolha__Group__2__Impl rule__Escolha__Group__3 )
            // InternalOiArdubot.g:5717:2: rule__Escolha__Group__2__Impl rule__Escolha__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Escolha__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escolha__Group__3();

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
    // $ANTLR end "rule__Escolha__Group__2"


    // $ANTLR start "rule__Escolha__Group__2__Impl"
    // InternalOiArdubot.g:5724:1: rule__Escolha__Group__2__Impl : ( ( ( rule__Escolha__CasosAssignment_2 ) ) ( ( rule__Escolha__CasosAssignment_2 )* ) ) ;
    public final void rule__Escolha__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5728:1: ( ( ( ( rule__Escolha__CasosAssignment_2 ) ) ( ( rule__Escolha__CasosAssignment_2 )* ) ) )
            // InternalOiArdubot.g:5729:1: ( ( ( rule__Escolha__CasosAssignment_2 ) ) ( ( rule__Escolha__CasosAssignment_2 )* ) )
            {
            // InternalOiArdubot.g:5729:1: ( ( ( rule__Escolha__CasosAssignment_2 ) ) ( ( rule__Escolha__CasosAssignment_2 )* ) )
            // InternalOiArdubot.g:5730:2: ( ( rule__Escolha__CasosAssignment_2 ) ) ( ( rule__Escolha__CasosAssignment_2 )* )
            {
            // InternalOiArdubot.g:5730:2: ( ( rule__Escolha__CasosAssignment_2 ) )
            // InternalOiArdubot.g:5731:3: ( rule__Escolha__CasosAssignment_2 )
            {
             before(grammarAccess.getEscolhaAccess().getCasosAssignment_2()); 
            // InternalOiArdubot.g:5732:3: ( rule__Escolha__CasosAssignment_2 )
            // InternalOiArdubot.g:5732:4: rule__Escolha__CasosAssignment_2
            {
            pushFollow(FOLLOW_38);
            rule__Escolha__CasosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEscolhaAccess().getCasosAssignment_2()); 

            }

            // InternalOiArdubot.g:5735:2: ( ( rule__Escolha__CasosAssignment_2 )* )
            // InternalOiArdubot.g:5736:3: ( rule__Escolha__CasosAssignment_2 )*
            {
             before(grammarAccess.getEscolhaAccess().getCasosAssignment_2()); 
            // InternalOiArdubot.g:5737:3: ( rule__Escolha__CasosAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==58) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOiArdubot.g:5737:4: rule__Escolha__CasosAssignment_2
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Escolha__CasosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getEscolhaAccess().getCasosAssignment_2()); 

            }


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
    // $ANTLR end "rule__Escolha__Group__2__Impl"


    // $ANTLR start "rule__Escolha__Group__3"
    // InternalOiArdubot.g:5746:1: rule__Escolha__Group__3 : rule__Escolha__Group__3__Impl ;
    public final void rule__Escolha__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5750:1: ( rule__Escolha__Group__3__Impl )
            // InternalOiArdubot.g:5751:2: rule__Escolha__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Escolha__Group__3__Impl();

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
    // $ANTLR end "rule__Escolha__Group__3"


    // $ANTLR start "rule__Escolha__Group__3__Impl"
    // InternalOiArdubot.g:5757:1: rule__Escolha__Group__3__Impl : ( 'fimescolha' ) ;
    public final void rule__Escolha__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5761:1: ( ( 'fimescolha' ) )
            // InternalOiArdubot.g:5762:1: ( 'fimescolha' )
            {
            // InternalOiArdubot.g:5762:1: ( 'fimescolha' )
            // InternalOiArdubot.g:5763:2: 'fimescolha'
            {
             before(grammarAccess.getEscolhaAccess().getFimescolhaKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getEscolhaAccess().getFimescolhaKeyword_3()); 

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
    // $ANTLR end "rule__Escolha__Group__3__Impl"


    // $ANTLR start "rule__Caso__Group__0"
    // InternalOiArdubot.g:5773:1: rule__Caso__Group__0 : rule__Caso__Group__0__Impl rule__Caso__Group__1 ;
    public final void rule__Caso__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5777:1: ( rule__Caso__Group__0__Impl rule__Caso__Group__1 )
            // InternalOiArdubot.g:5778:2: rule__Caso__Group__0__Impl rule__Caso__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Caso__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Caso__Group__1();

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
    // $ANTLR end "rule__Caso__Group__0"


    // $ANTLR start "rule__Caso__Group__0__Impl"
    // InternalOiArdubot.g:5785:1: rule__Caso__Group__0__Impl : ( 'caso' ) ;
    public final void rule__Caso__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5789:1: ( ( 'caso' ) )
            // InternalOiArdubot.g:5790:1: ( 'caso' )
            {
            // InternalOiArdubot.g:5790:1: ( 'caso' )
            // InternalOiArdubot.g:5791:2: 'caso'
            {
             before(grammarAccess.getCasoAccess().getCasoKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getCasoAccess().getCasoKeyword_0()); 

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
    // $ANTLR end "rule__Caso__Group__0__Impl"


    // $ANTLR start "rule__Caso__Group__1"
    // InternalOiArdubot.g:5800:1: rule__Caso__Group__1 : rule__Caso__Group__1__Impl rule__Caso__Group__2 ;
    public final void rule__Caso__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5804:1: ( rule__Caso__Group__1__Impl rule__Caso__Group__2 )
            // InternalOiArdubot.g:5805:2: rule__Caso__Group__1__Impl rule__Caso__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Caso__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Caso__Group__2();

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
    // $ANTLR end "rule__Caso__Group__1"


    // $ANTLR start "rule__Caso__Group__1__Impl"
    // InternalOiArdubot.g:5812:1: rule__Caso__Group__1__Impl : ( ( rule__Caso__ValorAssignment_1 ) ) ;
    public final void rule__Caso__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5816:1: ( ( ( rule__Caso__ValorAssignment_1 ) ) )
            // InternalOiArdubot.g:5817:1: ( ( rule__Caso__ValorAssignment_1 ) )
            {
            // InternalOiArdubot.g:5817:1: ( ( rule__Caso__ValorAssignment_1 ) )
            // InternalOiArdubot.g:5818:2: ( rule__Caso__ValorAssignment_1 )
            {
             before(grammarAccess.getCasoAccess().getValorAssignment_1()); 
            // InternalOiArdubot.g:5819:2: ( rule__Caso__ValorAssignment_1 )
            // InternalOiArdubot.g:5819:3: rule__Caso__ValorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Caso__ValorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCasoAccess().getValorAssignment_1()); 

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
    // $ANTLR end "rule__Caso__Group__1__Impl"


    // $ANTLR start "rule__Caso__Group__2"
    // InternalOiArdubot.g:5827:1: rule__Caso__Group__2 : rule__Caso__Group__2__Impl rule__Caso__Group__3 ;
    public final void rule__Caso__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5831:1: ( rule__Caso__Group__2__Impl rule__Caso__Group__3 )
            // InternalOiArdubot.g:5832:2: rule__Caso__Group__2__Impl rule__Caso__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Caso__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Caso__Group__3();

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
    // $ANTLR end "rule__Caso__Group__2"


    // $ANTLR start "rule__Caso__Group__2__Impl"
    // InternalOiArdubot.g:5839:1: rule__Caso__Group__2__Impl : ( 'faca' ) ;
    public final void rule__Caso__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5843:1: ( ( 'faca' ) )
            // InternalOiArdubot.g:5844:1: ( 'faca' )
            {
            // InternalOiArdubot.g:5844:1: ( 'faca' )
            // InternalOiArdubot.g:5845:2: 'faca'
            {
             before(grammarAccess.getCasoAccess().getFacaKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCasoAccess().getFacaKeyword_2()); 

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
    // $ANTLR end "rule__Caso__Group__2__Impl"


    // $ANTLR start "rule__Caso__Group__3"
    // InternalOiArdubot.g:5854:1: rule__Caso__Group__3 : rule__Caso__Group__3__Impl rule__Caso__Group__4 ;
    public final void rule__Caso__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5858:1: ( rule__Caso__Group__3__Impl rule__Caso__Group__4 )
            // InternalOiArdubot.g:5859:2: rule__Caso__Group__3__Impl rule__Caso__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Caso__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Caso__Group__4();

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
    // $ANTLR end "rule__Caso__Group__3"


    // $ANTLR start "rule__Caso__Group__3__Impl"
    // InternalOiArdubot.g:5866:1: rule__Caso__Group__3__Impl : ( ( rule__Caso__CodigoAssignment_3 ) ) ;
    public final void rule__Caso__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5870:1: ( ( ( rule__Caso__CodigoAssignment_3 ) ) )
            // InternalOiArdubot.g:5871:1: ( ( rule__Caso__CodigoAssignment_3 ) )
            {
            // InternalOiArdubot.g:5871:1: ( ( rule__Caso__CodigoAssignment_3 ) )
            // InternalOiArdubot.g:5872:2: ( rule__Caso__CodigoAssignment_3 )
            {
             before(grammarAccess.getCasoAccess().getCodigoAssignment_3()); 
            // InternalOiArdubot.g:5873:2: ( rule__Caso__CodigoAssignment_3 )
            // InternalOiArdubot.g:5873:3: rule__Caso__CodigoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Caso__CodigoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCasoAccess().getCodigoAssignment_3()); 

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
    // $ANTLR end "rule__Caso__Group__3__Impl"


    // $ANTLR start "rule__Caso__Group__4"
    // InternalOiArdubot.g:5881:1: rule__Caso__Group__4 : rule__Caso__Group__4__Impl ;
    public final void rule__Caso__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5885:1: ( rule__Caso__Group__4__Impl )
            // InternalOiArdubot.g:5886:2: rule__Caso__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Caso__Group__4__Impl();

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
    // $ANTLR end "rule__Caso__Group__4"


    // $ANTLR start "rule__Caso__Group__4__Impl"
    // InternalOiArdubot.g:5892:1: rule__Caso__Group__4__Impl : ( 'fimcaso' ) ;
    public final void rule__Caso__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5896:1: ( ( 'fimcaso' ) )
            // InternalOiArdubot.g:5897:1: ( 'fimcaso' )
            {
            // InternalOiArdubot.g:5897:1: ( 'fimcaso' )
            // InternalOiArdubot.g:5898:2: 'fimcaso'
            {
             before(grammarAccess.getCasoAccess().getFimcasoKeyword_4()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getCasoAccess().getFimcasoKeyword_4()); 

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
    // $ANTLR end "rule__Caso__Group__4__Impl"


    // $ANTLR start "rule__Funcao__Group__0"
    // InternalOiArdubot.g:5908:1: rule__Funcao__Group__0 : rule__Funcao__Group__0__Impl rule__Funcao__Group__1 ;
    public final void rule__Funcao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5912:1: ( rule__Funcao__Group__0__Impl rule__Funcao__Group__1 )
            // InternalOiArdubot.g:5913:2: rule__Funcao__Group__0__Impl rule__Funcao__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Funcao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcao__Group__1();

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
    // $ANTLR end "rule__Funcao__Group__0"


    // $ANTLR start "rule__Funcao__Group__0__Impl"
    // InternalOiArdubot.g:5920:1: rule__Funcao__Group__0__Impl : ( 'funcao' ) ;
    public final void rule__Funcao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5924:1: ( ( 'funcao' ) )
            // InternalOiArdubot.g:5925:1: ( 'funcao' )
            {
            // InternalOiArdubot.g:5925:1: ( 'funcao' )
            // InternalOiArdubot.g:5926:2: 'funcao'
            {
             before(grammarAccess.getFuncaoAccess().getFuncaoKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getFuncaoAccess().getFuncaoKeyword_0()); 

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
    // $ANTLR end "rule__Funcao__Group__0__Impl"


    // $ANTLR start "rule__Funcao__Group__1"
    // InternalOiArdubot.g:5935:1: rule__Funcao__Group__1 : rule__Funcao__Group__1__Impl rule__Funcao__Group__2 ;
    public final void rule__Funcao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5939:1: ( rule__Funcao__Group__1__Impl rule__Funcao__Group__2 )
            // InternalOiArdubot.g:5940:2: rule__Funcao__Group__1__Impl rule__Funcao__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Funcao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcao__Group__2();

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
    // $ANTLR end "rule__Funcao__Group__1"


    // $ANTLR start "rule__Funcao__Group__1__Impl"
    // InternalOiArdubot.g:5947:1: rule__Funcao__Group__1__Impl : ( ( rule__Funcao__NameAssignment_1 ) ) ;
    public final void rule__Funcao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5951:1: ( ( ( rule__Funcao__NameAssignment_1 ) ) )
            // InternalOiArdubot.g:5952:1: ( ( rule__Funcao__NameAssignment_1 ) )
            {
            // InternalOiArdubot.g:5952:1: ( ( rule__Funcao__NameAssignment_1 ) )
            // InternalOiArdubot.g:5953:2: ( rule__Funcao__NameAssignment_1 )
            {
             before(grammarAccess.getFuncaoAccess().getNameAssignment_1()); 
            // InternalOiArdubot.g:5954:2: ( rule__Funcao__NameAssignment_1 )
            // InternalOiArdubot.g:5954:3: rule__Funcao__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Funcao__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncaoAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Funcao__Group__1__Impl"


    // $ANTLR start "rule__Funcao__Group__2"
    // InternalOiArdubot.g:5962:1: rule__Funcao__Group__2 : rule__Funcao__Group__2__Impl rule__Funcao__Group__3 ;
    public final void rule__Funcao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5966:1: ( rule__Funcao__Group__2__Impl rule__Funcao__Group__3 )
            // InternalOiArdubot.g:5967:2: rule__Funcao__Group__2__Impl rule__Funcao__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Funcao__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcao__Group__3();

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
    // $ANTLR end "rule__Funcao__Group__2"


    // $ANTLR start "rule__Funcao__Group__2__Impl"
    // InternalOiArdubot.g:5974:1: rule__Funcao__Group__2__Impl : ( ( rule__Funcao__ParametroAssignment_2 )? ) ;
    public final void rule__Funcao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5978:1: ( ( ( rule__Funcao__ParametroAssignment_2 )? ) )
            // InternalOiArdubot.g:5979:1: ( ( rule__Funcao__ParametroAssignment_2 )? )
            {
            // InternalOiArdubot.g:5979:1: ( ( rule__Funcao__ParametroAssignment_2 )? )
            // InternalOiArdubot.g:5980:2: ( rule__Funcao__ParametroAssignment_2 )?
            {
             before(grammarAccess.getFuncaoAccess().getParametroAssignment_2()); 
            // InternalOiArdubot.g:5981:2: ( rule__Funcao__ParametroAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOiArdubot.g:5981:3: rule__Funcao__ParametroAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Funcao__ParametroAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFuncaoAccess().getParametroAssignment_2()); 

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
    // $ANTLR end "rule__Funcao__Group__2__Impl"


    // $ANTLR start "rule__Funcao__Group__3"
    // InternalOiArdubot.g:5989:1: rule__Funcao__Group__3 : rule__Funcao__Group__3__Impl rule__Funcao__Group__4 ;
    public final void rule__Funcao__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:5993:1: ( rule__Funcao__Group__3__Impl rule__Funcao__Group__4 )
            // InternalOiArdubot.g:5994:2: rule__Funcao__Group__3__Impl rule__Funcao__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Funcao__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcao__Group__4();

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
    // $ANTLR end "rule__Funcao__Group__3"


    // $ANTLR start "rule__Funcao__Group__3__Impl"
    // InternalOiArdubot.g:6001:1: rule__Funcao__Group__3__Impl : ( ':' ) ;
    public final void rule__Funcao__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6005:1: ( ( ':' ) )
            // InternalOiArdubot.g:6006:1: ( ':' )
            {
            // InternalOiArdubot.g:6006:1: ( ':' )
            // InternalOiArdubot.g:6007:2: ':'
            {
             before(grammarAccess.getFuncaoAccess().getColonKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getFuncaoAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Funcao__Group__3__Impl"


    // $ANTLR start "rule__Funcao__Group__4"
    // InternalOiArdubot.g:6016:1: rule__Funcao__Group__4 : rule__Funcao__Group__4__Impl rule__Funcao__Group__5 ;
    public final void rule__Funcao__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6020:1: ( rule__Funcao__Group__4__Impl rule__Funcao__Group__5 )
            // InternalOiArdubot.g:6021:2: rule__Funcao__Group__4__Impl rule__Funcao__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__Funcao__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcao__Group__5();

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
    // $ANTLR end "rule__Funcao__Group__4"


    // $ANTLR start "rule__Funcao__Group__4__Impl"
    // InternalOiArdubot.g:6028:1: rule__Funcao__Group__4__Impl : ( ( rule__Funcao__TipoAssignment_4 ) ) ;
    public final void rule__Funcao__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6032:1: ( ( ( rule__Funcao__TipoAssignment_4 ) ) )
            // InternalOiArdubot.g:6033:1: ( ( rule__Funcao__TipoAssignment_4 ) )
            {
            // InternalOiArdubot.g:6033:1: ( ( rule__Funcao__TipoAssignment_4 ) )
            // InternalOiArdubot.g:6034:2: ( rule__Funcao__TipoAssignment_4 )
            {
             before(grammarAccess.getFuncaoAccess().getTipoAssignment_4()); 
            // InternalOiArdubot.g:6035:2: ( rule__Funcao__TipoAssignment_4 )
            // InternalOiArdubot.g:6035:3: rule__Funcao__TipoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Funcao__TipoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFuncaoAccess().getTipoAssignment_4()); 

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
    // $ANTLR end "rule__Funcao__Group__4__Impl"


    // $ANTLR start "rule__Funcao__Group__5"
    // InternalOiArdubot.g:6043:1: rule__Funcao__Group__5 : rule__Funcao__Group__5__Impl rule__Funcao__Group__6 ;
    public final void rule__Funcao__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6047:1: ( rule__Funcao__Group__5__Impl rule__Funcao__Group__6 )
            // InternalOiArdubot.g:6048:2: rule__Funcao__Group__5__Impl rule__Funcao__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__Funcao__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcao__Group__6();

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
    // $ANTLR end "rule__Funcao__Group__5"


    // $ANTLR start "rule__Funcao__Group__5__Impl"
    // InternalOiArdubot.g:6055:1: rule__Funcao__Group__5__Impl : ( ( rule__Funcao__CodigoAssignment_5 )* ) ;
    public final void rule__Funcao__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6059:1: ( ( ( rule__Funcao__CodigoAssignment_5 )* ) )
            // InternalOiArdubot.g:6060:1: ( ( rule__Funcao__CodigoAssignment_5 )* )
            {
            // InternalOiArdubot.g:6060:1: ( ( rule__Funcao__CodigoAssignment_5 )* )
            // InternalOiArdubot.g:6061:2: ( rule__Funcao__CodigoAssignment_5 )*
            {
             before(grammarAccess.getFuncaoAccess().getCodigoAssignment_5()); 
            // InternalOiArdubot.g:6062:2: ( rule__Funcao__CodigoAssignment_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=24 && LA31_0<=25)||(LA31_0>=36 && LA31_0<=39)||(LA31_0>=41 && LA31_0<=46)||LA31_0==50||(LA31_0>=52 && LA31_0<=53)||LA31_0==56||LA31_0==60||LA31_0==64) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOiArdubot.g:6062:3: rule__Funcao__CodigoAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Funcao__CodigoAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getFuncaoAccess().getCodigoAssignment_5()); 

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
    // $ANTLR end "rule__Funcao__Group__5__Impl"


    // $ANTLR start "rule__Funcao__Group__6"
    // InternalOiArdubot.g:6070:1: rule__Funcao__Group__6 : rule__Funcao__Group__6__Impl rule__Funcao__Group__7 ;
    public final void rule__Funcao__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6074:1: ( rule__Funcao__Group__6__Impl rule__Funcao__Group__7 )
            // InternalOiArdubot.g:6075:2: rule__Funcao__Group__6__Impl rule__Funcao__Group__7
            {
            pushFollow(FOLLOW_42);
            rule__Funcao__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcao__Group__7();

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
    // $ANTLR end "rule__Funcao__Group__6"


    // $ANTLR start "rule__Funcao__Group__6__Impl"
    // InternalOiArdubot.g:6082:1: rule__Funcao__Group__6__Impl : ( ( rule__Funcao__Group_6__0 )? ) ;
    public final void rule__Funcao__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6086:1: ( ( ( rule__Funcao__Group_6__0 )? ) )
            // InternalOiArdubot.g:6087:1: ( ( rule__Funcao__Group_6__0 )? )
            {
            // InternalOiArdubot.g:6087:1: ( ( rule__Funcao__Group_6__0 )? )
            // InternalOiArdubot.g:6088:2: ( rule__Funcao__Group_6__0 )?
            {
             before(grammarAccess.getFuncaoAccess().getGroup_6()); 
            // InternalOiArdubot.g:6089:2: ( rule__Funcao__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==63) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOiArdubot.g:6089:3: rule__Funcao__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Funcao__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFuncaoAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Funcao__Group__6__Impl"


    // $ANTLR start "rule__Funcao__Group__7"
    // InternalOiArdubot.g:6097:1: rule__Funcao__Group__7 : rule__Funcao__Group__7__Impl ;
    public final void rule__Funcao__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6101:1: ( rule__Funcao__Group__7__Impl )
            // InternalOiArdubot.g:6102:2: rule__Funcao__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Funcao__Group__7__Impl();

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
    // $ANTLR end "rule__Funcao__Group__7"


    // $ANTLR start "rule__Funcao__Group__7__Impl"
    // InternalOiArdubot.g:6108:1: rule__Funcao__Group__7__Impl : ( 'fimfuncao' ) ;
    public final void rule__Funcao__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6112:1: ( ( 'fimfuncao' ) )
            // InternalOiArdubot.g:6113:1: ( 'fimfuncao' )
            {
            // InternalOiArdubot.g:6113:1: ( 'fimfuncao' )
            // InternalOiArdubot.g:6114:2: 'fimfuncao'
            {
             before(grammarAccess.getFuncaoAccess().getFimfuncaoKeyword_7()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getFuncaoAccess().getFimfuncaoKeyword_7()); 

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
    // $ANTLR end "rule__Funcao__Group__7__Impl"


    // $ANTLR start "rule__Funcao__Group_6__0"
    // InternalOiArdubot.g:6124:1: rule__Funcao__Group_6__0 : rule__Funcao__Group_6__0__Impl rule__Funcao__Group_6__1 ;
    public final void rule__Funcao__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6128:1: ( rule__Funcao__Group_6__0__Impl rule__Funcao__Group_6__1 )
            // InternalOiArdubot.g:6129:2: rule__Funcao__Group_6__0__Impl rule__Funcao__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Funcao__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcao__Group_6__1();

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
    // $ANTLR end "rule__Funcao__Group_6__0"


    // $ANTLR start "rule__Funcao__Group_6__0__Impl"
    // InternalOiArdubot.g:6136:1: rule__Funcao__Group_6__0__Impl : ( 'retorne' ) ;
    public final void rule__Funcao__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6140:1: ( ( 'retorne' ) )
            // InternalOiArdubot.g:6141:1: ( 'retorne' )
            {
            // InternalOiArdubot.g:6141:1: ( 'retorne' )
            // InternalOiArdubot.g:6142:2: 'retorne'
            {
             before(grammarAccess.getFuncaoAccess().getRetorneKeyword_6_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getFuncaoAccess().getRetorneKeyword_6_0()); 

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
    // $ANTLR end "rule__Funcao__Group_6__0__Impl"


    // $ANTLR start "rule__Funcao__Group_6__1"
    // InternalOiArdubot.g:6151:1: rule__Funcao__Group_6__1 : rule__Funcao__Group_6__1__Impl rule__Funcao__Group_6__2 ;
    public final void rule__Funcao__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6155:1: ( rule__Funcao__Group_6__1__Impl rule__Funcao__Group_6__2 )
            // InternalOiArdubot.g:6156:2: rule__Funcao__Group_6__1__Impl rule__Funcao__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__Funcao__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcao__Group_6__2();

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
    // $ANTLR end "rule__Funcao__Group_6__1"


    // $ANTLR start "rule__Funcao__Group_6__1__Impl"
    // InternalOiArdubot.g:6163:1: rule__Funcao__Group_6__1__Impl : ( ( rule__Funcao__RetornoAssignment_6_1 ) ) ;
    public final void rule__Funcao__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6167:1: ( ( ( rule__Funcao__RetornoAssignment_6_1 ) ) )
            // InternalOiArdubot.g:6168:1: ( ( rule__Funcao__RetornoAssignment_6_1 ) )
            {
            // InternalOiArdubot.g:6168:1: ( ( rule__Funcao__RetornoAssignment_6_1 ) )
            // InternalOiArdubot.g:6169:2: ( rule__Funcao__RetornoAssignment_6_1 )
            {
             before(grammarAccess.getFuncaoAccess().getRetornoAssignment_6_1()); 
            // InternalOiArdubot.g:6170:2: ( rule__Funcao__RetornoAssignment_6_1 )
            // InternalOiArdubot.g:6170:3: rule__Funcao__RetornoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Funcao__RetornoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncaoAccess().getRetornoAssignment_6_1()); 

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
    // $ANTLR end "rule__Funcao__Group_6__1__Impl"


    // $ANTLR start "rule__Funcao__Group_6__2"
    // InternalOiArdubot.g:6178:1: rule__Funcao__Group_6__2 : rule__Funcao__Group_6__2__Impl ;
    public final void rule__Funcao__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6182:1: ( rule__Funcao__Group_6__2__Impl )
            // InternalOiArdubot.g:6183:2: rule__Funcao__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Funcao__Group_6__2__Impl();

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
    // $ANTLR end "rule__Funcao__Group_6__2"


    // $ANTLR start "rule__Funcao__Group_6__2__Impl"
    // InternalOiArdubot.g:6189:1: rule__Funcao__Group_6__2__Impl : ( ';' ) ;
    public final void rule__Funcao__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6193:1: ( ( ';' ) )
            // InternalOiArdubot.g:6194:1: ( ';' )
            {
            // InternalOiArdubot.g:6194:1: ( ';' )
            // InternalOiArdubot.g:6195:2: ';'
            {
             before(grammarAccess.getFuncaoAccess().getSemicolonKeyword_6_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFuncaoAccess().getSemicolonKeyword_6_2()); 

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
    // $ANTLR end "rule__Funcao__Group_6__2__Impl"


    // $ANTLR start "rule__Parametro__Group__0"
    // InternalOiArdubot.g:6205:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6209:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // InternalOiArdubot.g:6210:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Parametro__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__1();

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
    // $ANTLR end "rule__Parametro__Group__0"


    // $ANTLR start "rule__Parametro__Group__0__Impl"
    // InternalOiArdubot.g:6217:1: rule__Parametro__Group__0__Impl : ( '(' ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6221:1: ( ( '(' ) )
            // InternalOiArdubot.g:6222:1: ( '(' )
            {
            // InternalOiArdubot.g:6222:1: ( '(' )
            // InternalOiArdubot.g:6223:2: '('
            {
             before(grammarAccess.getParametroAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getParametroAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Parametro__Group__0__Impl"


    // $ANTLR start "rule__Parametro__Group__1"
    // InternalOiArdubot.g:6232:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl rule__Parametro__Group__2 ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6236:1: ( rule__Parametro__Group__1__Impl rule__Parametro__Group__2 )
            // InternalOiArdubot.g:6237:2: rule__Parametro__Group__1__Impl rule__Parametro__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Parametro__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__2();

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
    // $ANTLR end "rule__Parametro__Group__1"


    // $ANTLR start "rule__Parametro__Group__1__Impl"
    // InternalOiArdubot.g:6244:1: rule__Parametro__Group__1__Impl : ( ( rule__Parametro__ValorAssignment_1 )* ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6248:1: ( ( ( rule__Parametro__ValorAssignment_1 )* ) )
            // InternalOiArdubot.g:6249:1: ( ( rule__Parametro__ValorAssignment_1 )* )
            {
            // InternalOiArdubot.g:6249:1: ( ( rule__Parametro__ValorAssignment_1 )* )
            // InternalOiArdubot.g:6250:2: ( rule__Parametro__ValorAssignment_1 )*
            {
             before(grammarAccess.getParametroAccess().getValorAssignment_1()); 
            // InternalOiArdubot.g:6251:2: ( rule__Parametro__ValorAssignment_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=24 && LA33_0<=25)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalOiArdubot.g:6251:3: rule__Parametro__ValorAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Parametro__ValorAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getParametroAccess().getValorAssignment_1()); 

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
    // $ANTLR end "rule__Parametro__Group__1__Impl"


    // $ANTLR start "rule__Parametro__Group__2"
    // InternalOiArdubot.g:6259:1: rule__Parametro__Group__2 : rule__Parametro__Group__2__Impl ;
    public final void rule__Parametro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6263:1: ( rule__Parametro__Group__2__Impl )
            // InternalOiArdubot.g:6264:2: rule__Parametro__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group__2__Impl();

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
    // $ANTLR end "rule__Parametro__Group__2"


    // $ANTLR start "rule__Parametro__Group__2__Impl"
    // InternalOiArdubot.g:6270:1: rule__Parametro__Group__2__Impl : ( ')' ) ;
    public final void rule__Parametro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6274:1: ( ( ')' ) )
            // InternalOiArdubot.g:6275:1: ( ')' )
            {
            // InternalOiArdubot.g:6275:1: ( ')' )
            // InternalOiArdubot.g:6276:2: ')'
            {
             before(grammarAccess.getParametroAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getParametroAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Parametro__Group__2__Impl"


    // $ANTLR start "rule__Espera__Group__0"
    // InternalOiArdubot.g:6286:1: rule__Espera__Group__0 : rule__Espera__Group__0__Impl rule__Espera__Group__1 ;
    public final void rule__Espera__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6290:1: ( rule__Espera__Group__0__Impl rule__Espera__Group__1 )
            // InternalOiArdubot.g:6291:2: rule__Espera__Group__0__Impl rule__Espera__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Espera__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Espera__Group__1();

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
    // $ANTLR end "rule__Espera__Group__0"


    // $ANTLR start "rule__Espera__Group__0__Impl"
    // InternalOiArdubot.g:6298:1: rule__Espera__Group__0__Impl : ( 'esperar' ) ;
    public final void rule__Espera__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6302:1: ( ( 'esperar' ) )
            // InternalOiArdubot.g:6303:1: ( 'esperar' )
            {
            // InternalOiArdubot.g:6303:1: ( 'esperar' )
            // InternalOiArdubot.g:6304:2: 'esperar'
            {
             before(grammarAccess.getEsperaAccess().getEsperarKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getEsperaAccess().getEsperarKeyword_0()); 

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
    // $ANTLR end "rule__Espera__Group__0__Impl"


    // $ANTLR start "rule__Espera__Group__1"
    // InternalOiArdubot.g:6313:1: rule__Espera__Group__1 : rule__Espera__Group__1__Impl rule__Espera__Group__2 ;
    public final void rule__Espera__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6317:1: ( rule__Espera__Group__1__Impl rule__Espera__Group__2 )
            // InternalOiArdubot.g:6318:2: rule__Espera__Group__1__Impl rule__Espera__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Espera__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Espera__Group__2();

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
    // $ANTLR end "rule__Espera__Group__1"


    // $ANTLR start "rule__Espera__Group__1__Impl"
    // InternalOiArdubot.g:6325:1: rule__Espera__Group__1__Impl : ( '(' ) ;
    public final void rule__Espera__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6329:1: ( ( '(' ) )
            // InternalOiArdubot.g:6330:1: ( '(' )
            {
            // InternalOiArdubot.g:6330:1: ( '(' )
            // InternalOiArdubot.g:6331:2: '('
            {
             before(grammarAccess.getEsperaAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEsperaAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Espera__Group__1__Impl"


    // $ANTLR start "rule__Espera__Group__2"
    // InternalOiArdubot.g:6340:1: rule__Espera__Group__2 : rule__Espera__Group__2__Impl rule__Espera__Group__3 ;
    public final void rule__Espera__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6344:1: ( rule__Espera__Group__2__Impl rule__Espera__Group__3 )
            // InternalOiArdubot.g:6345:2: rule__Espera__Group__2__Impl rule__Espera__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Espera__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Espera__Group__3();

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
    // $ANTLR end "rule__Espera__Group__2"


    // $ANTLR start "rule__Espera__Group__2__Impl"
    // InternalOiArdubot.g:6352:1: rule__Espera__Group__2__Impl : ( ( rule__Espera__ValorAssignment_2 ) ) ;
    public final void rule__Espera__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6356:1: ( ( ( rule__Espera__ValorAssignment_2 ) ) )
            // InternalOiArdubot.g:6357:1: ( ( rule__Espera__ValorAssignment_2 ) )
            {
            // InternalOiArdubot.g:6357:1: ( ( rule__Espera__ValorAssignment_2 ) )
            // InternalOiArdubot.g:6358:2: ( rule__Espera__ValorAssignment_2 )
            {
             before(grammarAccess.getEsperaAccess().getValorAssignment_2()); 
            // InternalOiArdubot.g:6359:2: ( rule__Espera__ValorAssignment_2 )
            // InternalOiArdubot.g:6359:3: rule__Espera__ValorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Espera__ValorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEsperaAccess().getValorAssignment_2()); 

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
    // $ANTLR end "rule__Espera__Group__2__Impl"


    // $ANTLR start "rule__Espera__Group__3"
    // InternalOiArdubot.g:6367:1: rule__Espera__Group__3 : rule__Espera__Group__3__Impl rule__Espera__Group__4 ;
    public final void rule__Espera__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6371:1: ( rule__Espera__Group__3__Impl rule__Espera__Group__4 )
            // InternalOiArdubot.g:6372:2: rule__Espera__Group__3__Impl rule__Espera__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Espera__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Espera__Group__4();

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
    // $ANTLR end "rule__Espera__Group__3"


    // $ANTLR start "rule__Espera__Group__3__Impl"
    // InternalOiArdubot.g:6379:1: rule__Espera__Group__3__Impl : ( ')' ) ;
    public final void rule__Espera__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6383:1: ( ( ')' ) )
            // InternalOiArdubot.g:6384:1: ( ')' )
            {
            // InternalOiArdubot.g:6384:1: ( ')' )
            // InternalOiArdubot.g:6385:2: ')'
            {
             before(grammarAccess.getEsperaAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEsperaAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Espera__Group__3__Impl"


    // $ANTLR start "rule__Espera__Group__4"
    // InternalOiArdubot.g:6394:1: rule__Espera__Group__4 : rule__Espera__Group__4__Impl ;
    public final void rule__Espera__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6398:1: ( rule__Espera__Group__4__Impl )
            // InternalOiArdubot.g:6399:2: rule__Espera__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Espera__Group__4__Impl();

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
    // $ANTLR end "rule__Espera__Group__4"


    // $ANTLR start "rule__Espera__Group__4__Impl"
    // InternalOiArdubot.g:6405:1: rule__Espera__Group__4__Impl : ( ';' ) ;
    public final void rule__Espera__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6409:1: ( ( ';' ) )
            // InternalOiArdubot.g:6410:1: ( ';' )
            {
            // InternalOiArdubot.g:6410:1: ( ';' )
            // InternalOiArdubot.g:6411:2: ';'
            {
             before(grammarAccess.getEsperaAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEsperaAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Espera__Group__4__Impl"


    // $ANTLR start "rule__Model__VarAssignment_0"
    // InternalOiArdubot.g:6421:1: rule__Model__VarAssignment_0 : ( ( 'Variaveis' ) ) ;
    public final void rule__Model__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6425:1: ( ( ( 'Variaveis' ) ) )
            // InternalOiArdubot.g:6426:2: ( ( 'Variaveis' ) )
            {
            // InternalOiArdubot.g:6426:2: ( ( 'Variaveis' ) )
            // InternalOiArdubot.g:6427:3: ( 'Variaveis' )
            {
             before(grammarAccess.getModelAccess().getVarVariaveisKeyword_0_0()); 
            // InternalOiArdubot.g:6428:3: ( 'Variaveis' )
            // InternalOiArdubot.g:6429:4: 'Variaveis'
            {
             before(grammarAccess.getModelAccess().getVarVariaveisKeyword_0_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalOiArdubot.g:6440:1: rule__Model__VariaveisAssignment_1 : ( ruleVariavel ) ;
    public final void rule__Model__VariaveisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6444:1: ( ( ruleVariavel ) )
            // InternalOiArdubot.g:6445:2: ( ruleVariavel )
            {
            // InternalOiArdubot.g:6445:2: ( ruleVariavel )
            // InternalOiArdubot.g:6446:3: ruleVariavel
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


    // $ANTLR start "rule__Model__ConstantesAssignment_2"
    // InternalOiArdubot.g:6455:1: rule__Model__ConstantesAssignment_2 : ( ruleConstante ) ;
    public final void rule__Model__ConstantesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6459:1: ( ( ruleConstante ) )
            // InternalOiArdubot.g:6460:2: ( ruleConstante )
            {
            // InternalOiArdubot.g:6460:2: ( ruleConstante )
            // InternalOiArdubot.g:6461:3: ruleConstante
            {
             before(grammarAccess.getModelAccess().getConstantesConstanteParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstante();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConstantesConstanteParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__ConstantesAssignment_2"


    // $ANTLR start "rule__Model__IniAssignment_3"
    // InternalOiArdubot.g:6470:1: rule__Model__IniAssignment_3 : ( ( 'Inicio' ) ) ;
    public final void rule__Model__IniAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6474:1: ( ( ( 'Inicio' ) ) )
            // InternalOiArdubot.g:6475:2: ( ( 'Inicio' ) )
            {
            // InternalOiArdubot.g:6475:2: ( ( 'Inicio' ) )
            // InternalOiArdubot.g:6476:3: ( 'Inicio' )
            {
             before(grammarAccess.getModelAccess().getIniInicioKeyword_3_0()); 
            // InternalOiArdubot.g:6477:3: ( 'Inicio' )
            // InternalOiArdubot.g:6478:4: 'Inicio'
            {
             before(grammarAccess.getModelAccess().getIniInicioKeyword_3_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getIniInicioKeyword_3_0()); 

            }

             after(grammarAccess.getModelAccess().getIniInicioKeyword_3_0()); 

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
    // $ANTLR end "rule__Model__IniAssignment_3"


    // $ANTLR start "rule__Model__CodigoAssignment_4"
    // InternalOiArdubot.g:6489:1: rule__Model__CodigoAssignment_4 : ( ruleImplementacao ) ;
    public final void rule__Model__CodigoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6493:1: ( ( ruleImplementacao ) )
            // InternalOiArdubot.g:6494:2: ( ruleImplementacao )
            {
            // InternalOiArdubot.g:6494:2: ( ruleImplementacao )
            // InternalOiArdubot.g:6495:3: ruleImplementacao
            {
             before(grammarAccess.getModelAccess().getCodigoImplementacaoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleImplementacao();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCodigoImplementacaoParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__CodigoAssignment_4"


    // $ANTLR start "rule__Model__FimAssignment_5"
    // InternalOiArdubot.g:6504:1: rule__Model__FimAssignment_5 : ( ( 'Fim' ) ) ;
    public final void rule__Model__FimAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6508:1: ( ( ( 'Fim' ) ) )
            // InternalOiArdubot.g:6509:2: ( ( 'Fim' ) )
            {
            // InternalOiArdubot.g:6509:2: ( ( 'Fim' ) )
            // InternalOiArdubot.g:6510:3: ( 'Fim' )
            {
             before(grammarAccess.getModelAccess().getFimFimKeyword_5_0()); 
            // InternalOiArdubot.g:6511:3: ( 'Fim' )
            // InternalOiArdubot.g:6512:4: 'Fim'
            {
             before(grammarAccess.getModelAccess().getFimFimKeyword_5_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFimFimKeyword_5_0()); 

            }

             after(grammarAccess.getModelAccess().getFimFimKeyword_5_0()); 

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
    // $ANTLR end "rule__Model__FimAssignment_5"


    // $ANTLR start "rule__Codigo__CodeAssignment"
    // InternalOiArdubot.g:6523:1: rule__Codigo__CodeAssignment : ( ruleImplementacao ) ;
    public final void rule__Codigo__CodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6527:1: ( ( ruleImplementacao ) )
            // InternalOiArdubot.g:6528:2: ( ruleImplementacao )
            {
            // InternalOiArdubot.g:6528:2: ( ruleImplementacao )
            // InternalOiArdubot.g:6529:3: ruleImplementacao
            {
             before(grammarAccess.getCodigoAccess().getCodeImplementacaoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleImplementacao();

            state._fsp--;

             after(grammarAccess.getCodigoAccess().getCodeImplementacaoParserRuleCall_0()); 

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
    // $ANTLR end "rule__Codigo__CodeAssignment"


    // $ANTLR start "rule__Porta__NameAssignment"
    // InternalOiArdubot.g:6538:1: rule__Porta__NameAssignment : ( ( rule__Porta__NameAlternatives_0 ) ) ;
    public final void rule__Porta__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6542:1: ( ( ( rule__Porta__NameAlternatives_0 ) ) )
            // InternalOiArdubot.g:6543:2: ( ( rule__Porta__NameAlternatives_0 ) )
            {
            // InternalOiArdubot.g:6543:2: ( ( rule__Porta__NameAlternatives_0 ) )
            // InternalOiArdubot.g:6544:3: ( rule__Porta__NameAlternatives_0 )
            {
             before(grammarAccess.getPortaAccess().getNameAlternatives_0()); 
            // InternalOiArdubot.g:6545:3: ( rule__Porta__NameAlternatives_0 )
            // InternalOiArdubot.g:6545:4: rule__Porta__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Porta__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPortaAccess().getNameAlternatives_0()); 

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
    // $ANTLR end "rule__Porta__NameAssignment"


    // $ANTLR start "rule__PortaAnalogica__ValorAssignment"
    // InternalOiArdubot.g:6553:1: rule__PortaAnalogica__ValorAssignment : ( ruleAnalogicaOuId ) ;
    public final void rule__PortaAnalogica__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6557:1: ( ( ruleAnalogicaOuId ) )
            // InternalOiArdubot.g:6558:2: ( ruleAnalogicaOuId )
            {
            // InternalOiArdubot.g:6558:2: ( ruleAnalogicaOuId )
            // InternalOiArdubot.g:6559:3: ruleAnalogicaOuId
            {
             before(grammarAccess.getPortaAnalogicaAccess().getValorAnalogicaOuIdParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnalogicaOuId();

            state._fsp--;

             after(grammarAccess.getPortaAnalogicaAccess().getValorAnalogicaOuIdParserRuleCall_0()); 

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
    // $ANTLR end "rule__PortaAnalogica__ValorAssignment"


    // $ANTLR start "rule__PortaDigital__ValorAssignment"
    // InternalOiArdubot.g:6568:1: rule__PortaDigital__ValorAssignment : ( ruleDigitalOuId ) ;
    public final void rule__PortaDigital__ValorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6572:1: ( ( ruleDigitalOuId ) )
            // InternalOiArdubot.g:6573:2: ( ruleDigitalOuId )
            {
            // InternalOiArdubot.g:6573:2: ( ruleDigitalOuId )
            // InternalOiArdubot.g:6574:3: ruleDigitalOuId
            {
             before(grammarAccess.getPortaDigitalAccess().getValorDigitalOuIdParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDigitalOuId();

            state._fsp--;

             after(grammarAccess.getPortaDigitalAccess().getValorDigitalOuIdParserRuleCall_0()); 

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
    // $ANTLR end "rule__PortaDigital__ValorAssignment"


    // $ANTLR start "rule__ReceberValor__TipoAssignment"
    // InternalOiArdubot.g:6583:1: rule__ReceberValor__TipoAssignment : ( ( rule__ReceberValor__TipoAlternatives_0 ) ) ;
    public final void rule__ReceberValor__TipoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6587:1: ( ( ( rule__ReceberValor__TipoAlternatives_0 ) ) )
            // InternalOiArdubot.g:6588:2: ( ( rule__ReceberValor__TipoAlternatives_0 ) )
            {
            // InternalOiArdubot.g:6588:2: ( ( rule__ReceberValor__TipoAlternatives_0 ) )
            // InternalOiArdubot.g:6589:3: ( rule__ReceberValor__TipoAlternatives_0 )
            {
             before(grammarAccess.getReceberValorAccess().getTipoAlternatives_0()); 
            // InternalOiArdubot.g:6590:3: ( rule__ReceberValor__TipoAlternatives_0 )
            // InternalOiArdubot.g:6590:4: rule__ReceberValor__TipoAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ReceberValor__TipoAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getReceberValorAccess().getTipoAlternatives_0()); 

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
    // $ANTLR end "rule__ReceberValor__TipoAssignment"


    // $ANTLR start "rule__ExistenteVariavelRecebe__NameAssignment_0"
    // InternalOiArdubot.g:6598:1: rule__ExistenteVariavelRecebe__NameAssignment_0 : ( ruleValorReferencia ) ;
    public final void rule__ExistenteVariavelRecebe__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6602:1: ( ( ruleValorReferencia ) )
            // InternalOiArdubot.g:6603:2: ( ruleValorReferencia )
            {
            // InternalOiArdubot.g:6603:2: ( ruleValorReferencia )
            // InternalOiArdubot.g:6604:3: ruleValorReferencia
            {
             before(grammarAccess.getExistenteVariavelRecebeAccess().getNameValorReferenciaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValorReferencia();

            state._fsp--;

             after(grammarAccess.getExistenteVariavelRecebeAccess().getNameValorReferenciaParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ExistenteVariavelRecebe__NameAssignment_0"


    // $ANTLR start "rule__VariavelNome__TipoAssignment_0"
    // InternalOiArdubot.g:6613:1: rule__VariavelNome__TipoAssignment_0 : ( ruleTipo ) ;
    public final void rule__VariavelNome__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6617:1: ( ( ruleTipo ) )
            // InternalOiArdubot.g:6618:2: ( ruleTipo )
            {
            // InternalOiArdubot.g:6618:2: ( ruleTipo )
            // InternalOiArdubot.g:6619:3: ruleTipo
            {
             before(grammarAccess.getVariavelNomeAccess().getTipoTipoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipo();

            state._fsp--;

             after(grammarAccess.getVariavelNomeAccess().getTipoTipoEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__VariavelNome__TipoAssignment_0"


    // $ANTLR start "rule__VariavelNome__NameAssignment_1"
    // InternalOiArdubot.g:6628:1: rule__VariavelNome__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariavelNome__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6632:1: ( ( RULE_ID ) )
            // InternalOiArdubot.g:6633:2: ( RULE_ID )
            {
            // InternalOiArdubot.g:6633:2: ( RULE_ID )
            // InternalOiArdubot.g:6634:3: RULE_ID
            {
             before(grammarAccess.getVariavelNomeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariavelNomeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariavelNome__NameAssignment_1"


    // $ANTLR start "rule__VariavelOuPorta__NameAssignment"
    // InternalOiArdubot.g:6643:1: rule__VariavelOuPorta__NameAssignment : ( rulePorta ) ;
    public final void rule__VariavelOuPorta__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6647:1: ( ( rulePorta ) )
            // InternalOiArdubot.g:6648:2: ( rulePorta )
            {
            // InternalOiArdubot.g:6648:2: ( rulePorta )
            // InternalOiArdubot.g:6649:3: rulePorta
            {
             before(grammarAccess.getVariavelOuPortaAccess().getNamePortaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePorta();

            state._fsp--;

             after(grammarAccess.getVariavelOuPortaAccess().getNamePortaParserRuleCall_0()); 

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
    // $ANTLR end "rule__VariavelOuPorta__NameAssignment"


    // $ANTLR start "rule__Nome__NameAssignment"
    // InternalOiArdubot.g:6658:1: rule__Nome__NameAssignment : ( RULE_ID ) ;
    public final void rule__Nome__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6662:1: ( ( RULE_ID ) )
            // InternalOiArdubot.g:6663:2: ( RULE_ID )
            {
            // InternalOiArdubot.g:6663:2: ( RULE_ID )
            // InternalOiArdubot.g:6664:3: RULE_ID
            {
             before(grammarAccess.getNomeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNomeAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Nome__NameAssignment"


    // $ANTLR start "rule__Texto__NameAssignment"
    // InternalOiArdubot.g:6673:1: rule__Texto__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Texto__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6677:1: ( ( RULE_STRING ) )
            // InternalOiArdubot.g:6678:2: ( RULE_STRING )
            {
            // InternalOiArdubot.g:6678:2: ( RULE_STRING )
            // InternalOiArdubot.g:6679:3: RULE_STRING
            {
             before(grammarAccess.getTextoAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextoAccess().getNameSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Texto__NameAssignment"


    // $ANTLR start "rule__Inteiro__NameAssignment"
    // InternalOiArdubot.g:6688:1: rule__Inteiro__NameAssignment : ( RULE_INT ) ;
    public final void rule__Inteiro__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6692:1: ( ( RULE_INT ) )
            // InternalOiArdubot.g:6693:2: ( RULE_INT )
            {
            // InternalOiArdubot.g:6693:2: ( RULE_INT )
            // InternalOiArdubot.g:6694:3: RULE_INT
            {
             before(grammarAccess.getInteiroAccess().getNameINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInteiroAccess().getNameINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Inteiro__NameAssignment"


    // $ANTLR start "rule__Variavel__VariavelNomeAssignment_0"
    // InternalOiArdubot.g:6703:1: rule__Variavel__VariavelNomeAssignment_0 : ( ruleVariavelNome ) ;
    public final void rule__Variavel__VariavelNomeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6707:1: ( ( ruleVariavelNome ) )
            // InternalOiArdubot.g:6708:2: ( ruleVariavelNome )
            {
            // InternalOiArdubot.g:6708:2: ( ruleVariavelNome )
            // InternalOiArdubot.g:6709:3: ruleVariavelNome
            {
             before(grammarAccess.getVariavelAccess().getVariavelNomeVariavelNomeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelNome();

            state._fsp--;

             after(grammarAccess.getVariavelAccess().getVariavelNomeVariavelNomeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Variavel__VariavelNomeAssignment_0"


    // $ANTLR start "rule__Variavel__ValorAssignment_1_1"
    // InternalOiArdubot.g:6718:1: rule__Variavel__ValorAssignment_1_1 : ( ruleVariavelValor ) ;
    public final void rule__Variavel__ValorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6722:1: ( ( ruleVariavelValor ) )
            // InternalOiArdubot.g:6723:2: ( ruleVariavelValor )
            {
            // InternalOiArdubot.g:6723:2: ( ruleVariavelValor )
            // InternalOiArdubot.g:6724:3: ruleVariavelValor
            {
             before(grammarAccess.getVariavelAccess().getValorVariavelValorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelValor();

            state._fsp--;

             after(grammarAccess.getVariavelAccess().getValorVariavelValorParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Variavel__ValorAssignment_1_1"


    // $ANTLR start "rule__VariavelExistente__AtribuicaoAssignment_0"
    // InternalOiArdubot.g:6733:1: rule__VariavelExistente__AtribuicaoAssignment_0 : ( ruleExistenteVariavelRecebe ) ;
    public final void rule__VariavelExistente__AtribuicaoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6737:1: ( ( ruleExistenteVariavelRecebe ) )
            // InternalOiArdubot.g:6738:2: ( ruleExistenteVariavelRecebe )
            {
            // InternalOiArdubot.g:6738:2: ( ruleExistenteVariavelRecebe )
            // InternalOiArdubot.g:6739:3: ruleExistenteVariavelRecebe
            {
             before(grammarAccess.getVariavelExistenteAccess().getAtribuicaoExistenteVariavelRecebeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExistenteVariavelRecebe();

            state._fsp--;

             after(grammarAccess.getVariavelExistenteAccess().getAtribuicaoExistenteVariavelRecebeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__VariavelExistente__AtribuicaoAssignment_0"


    // $ANTLR start "rule__VariavelExistente__ValorAssignment_1"
    // InternalOiArdubot.g:6748:1: rule__VariavelExistente__ValorAssignment_1 : ( ruleVariavelValor ) ;
    public final void rule__VariavelExistente__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6752:1: ( ( ruleVariavelValor ) )
            // InternalOiArdubot.g:6753:2: ( ruleVariavelValor )
            {
            // InternalOiArdubot.g:6753:2: ( ruleVariavelValor )
            // InternalOiArdubot.g:6754:3: ruleVariavelValor
            {
             before(grammarAccess.getVariavelExistenteAccess().getValorVariavelValorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelValor();

            state._fsp--;

             after(grammarAccess.getVariavelExistenteAccess().getValorVariavelValorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariavelExistente__ValorAssignment_1"


    // $ANTLR start "rule__ConstanteVariavel__TipoAssignment_0"
    // InternalOiArdubot.g:6763:1: rule__ConstanteVariavel__TipoAssignment_0 : ( ruleTipo ) ;
    public final void rule__ConstanteVariavel__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6767:1: ( ( ruleTipo ) )
            // InternalOiArdubot.g:6768:2: ( ruleTipo )
            {
            // InternalOiArdubot.g:6768:2: ( ruleTipo )
            // InternalOiArdubot.g:6769:3: ruleTipo
            {
             before(grammarAccess.getConstanteVariavelAccess().getTipoTipoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipo();

            state._fsp--;

             after(grammarAccess.getConstanteVariavelAccess().getTipoTipoEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__ConstanteVariavel__TipoAssignment_0"


    // $ANTLR start "rule__ConstanteVariavel__VariavelNomeAssignment_1"
    // InternalOiArdubot.g:6778:1: rule__ConstanteVariavel__VariavelNomeAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConstanteVariavel__VariavelNomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6782:1: ( ( RULE_ID ) )
            // InternalOiArdubot.g:6783:2: ( RULE_ID )
            {
            // InternalOiArdubot.g:6783:2: ( RULE_ID )
            // InternalOiArdubot.g:6784:3: RULE_ID
            {
             before(grammarAccess.getConstanteVariavelAccess().getVariavelNomeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstanteVariavelAccess().getVariavelNomeIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConstanteVariavel__VariavelNomeAssignment_1"


    // $ANTLR start "rule__ConstanteVariavel__ValorAssignment_3"
    // InternalOiArdubot.g:6793:1: rule__ConstanteVariavel__ValorAssignment_3 : ( ruleVariavelValor ) ;
    public final void rule__ConstanteVariavel__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6797:1: ( ( ruleVariavelValor ) )
            // InternalOiArdubot.g:6798:2: ( ruleVariavelValor )
            {
            // InternalOiArdubot.g:6798:2: ( ruleVariavelValor )
            // InternalOiArdubot.g:6799:3: ruleVariavelValor
            {
             before(grammarAccess.getConstanteVariavelAccess().getValorVariavelValorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelValor();

            state._fsp--;

             after(grammarAccess.getConstanteVariavelAccess().getValorVariavelValorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ConstanteVariavel__ValorAssignment_3"


    // $ANTLR start "rule__Constante__VariavelAssignment_1"
    // InternalOiArdubot.g:6808:1: rule__Constante__VariavelAssignment_1 : ( ruleConstanteVariavel ) ;
    public final void rule__Constante__VariavelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6812:1: ( ( ruleConstanteVariavel ) )
            // InternalOiArdubot.g:6813:2: ( ruleConstanteVariavel )
            {
            // InternalOiArdubot.g:6813:2: ( ruleConstanteVariavel )
            // InternalOiArdubot.g:6814:3: ruleConstanteVariavel
            {
             before(grammarAccess.getConstanteAccess().getVariavelConstanteVariavelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstanteVariavel();

            state._fsp--;

             after(grammarAccess.getConstanteAccess().getVariavelConstanteVariavelParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constante__VariavelAssignment_1"


    // $ANTLR start "rule__Logico__RelationAssignment"
    // InternalOiArdubot.g:6823:1: rule__Logico__RelationAssignment : ( ( rule__Logico__RelationAlternatives_0 ) ) ;
    public final void rule__Logico__RelationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6827:1: ( ( ( rule__Logico__RelationAlternatives_0 ) ) )
            // InternalOiArdubot.g:6828:2: ( ( rule__Logico__RelationAlternatives_0 ) )
            {
            // InternalOiArdubot.g:6828:2: ( ( rule__Logico__RelationAlternatives_0 ) )
            // InternalOiArdubot.g:6829:3: ( rule__Logico__RelationAlternatives_0 )
            {
             before(grammarAccess.getLogicoAccess().getRelationAlternatives_0()); 
            // InternalOiArdubot.g:6830:3: ( rule__Logico__RelationAlternatives_0 )
            // InternalOiArdubot.g:6830:4: rule__Logico__RelationAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Logico__RelationAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getLogicoAccess().getRelationAlternatives_0()); 

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
    // $ANTLR end "rule__Logico__RelationAssignment"


    // $ANTLR start "rule__Ler__AtribuicaoAssignment_0"
    // InternalOiArdubot.g:6838:1: rule__Ler__AtribuicaoAssignment_0 : ( ruleReceberValor ) ;
    public final void rule__Ler__AtribuicaoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6842:1: ( ( ruleReceberValor ) )
            // InternalOiArdubot.g:6843:2: ( ruleReceberValor )
            {
            // InternalOiArdubot.g:6843:2: ( ruleReceberValor )
            // InternalOiArdubot.g:6844:3: ruleReceberValor
            {
             before(grammarAccess.getLerAccess().getAtribuicaoReceberValorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReceberValor();

            state._fsp--;

             after(grammarAccess.getLerAccess().getAtribuicaoReceberValorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Ler__AtribuicaoAssignment_0"


    // $ANTLR start "rule__Ler__LerAssignment_1"
    // InternalOiArdubot.g:6853:1: rule__Ler__LerAssignment_1 : ( ruleFuncaoLer ) ;
    public final void rule__Ler__LerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6857:1: ( ( ruleFuncaoLer ) )
            // InternalOiArdubot.g:6858:2: ( ruleFuncaoLer )
            {
            // InternalOiArdubot.g:6858:2: ( ruleFuncaoLer )
            // InternalOiArdubot.g:6859:3: ruleFuncaoLer
            {
             before(grammarAccess.getLerAccess().getLerFuncaoLerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncaoLer();

            state._fsp--;

             after(grammarAccess.getLerAccess().getLerFuncaoLerParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ler__LerAssignment_1"


    // $ANTLR start "rule__LerDigital__AtribuicaoAssignment_0"
    // InternalOiArdubot.g:6868:1: rule__LerDigital__AtribuicaoAssignment_0 : ( ruleReceberValor ) ;
    public final void rule__LerDigital__AtribuicaoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6872:1: ( ( ruleReceberValor ) )
            // InternalOiArdubot.g:6873:2: ( ruleReceberValor )
            {
            // InternalOiArdubot.g:6873:2: ( ruleReceberValor )
            // InternalOiArdubot.g:6874:3: ruleReceberValor
            {
             before(grammarAccess.getLerDigitalAccess().getAtribuicaoReceberValorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReceberValor();

            state._fsp--;

             after(grammarAccess.getLerDigitalAccess().getAtribuicaoReceberValorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LerDigital__AtribuicaoAssignment_0"


    // $ANTLR start "rule__LerDigital__LerAssignment_1"
    // InternalOiArdubot.g:6883:1: rule__LerDigital__LerAssignment_1 : ( ruleFuncaoLerDigital ) ;
    public final void rule__LerDigital__LerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6887:1: ( ( ruleFuncaoLerDigital ) )
            // InternalOiArdubot.g:6888:2: ( ruleFuncaoLerDigital )
            {
            // InternalOiArdubot.g:6888:2: ( ruleFuncaoLerDigital )
            // InternalOiArdubot.g:6889:3: ruleFuncaoLerDigital
            {
             before(grammarAccess.getLerDigitalAccess().getLerFuncaoLerDigitalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncaoLerDigital();

            state._fsp--;

             after(grammarAccess.getLerDigitalAccess().getLerFuncaoLerDigitalParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LerDigital__LerAssignment_1"


    // $ANTLR start "rule__FuncaoLerDigital__PortaAssignment_2"
    // InternalOiArdubot.g:6898:1: rule__FuncaoLerDigital__PortaAssignment_2 : ( rulePorta ) ;
    public final void rule__FuncaoLerDigital__PortaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6902:1: ( ( rulePorta ) )
            // InternalOiArdubot.g:6903:2: ( rulePorta )
            {
            // InternalOiArdubot.g:6903:2: ( rulePorta )
            // InternalOiArdubot.g:6904:3: rulePorta
            {
             before(grammarAccess.getFuncaoLerDigitalAccess().getPortaPortaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePorta();

            state._fsp--;

             after(grammarAccess.getFuncaoLerDigitalAccess().getPortaPortaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FuncaoLerDigital__PortaAssignment_2"


    // $ANTLR start "rule__LerAnalogica__AtribuicaoAssignment_0"
    // InternalOiArdubot.g:6913:1: rule__LerAnalogica__AtribuicaoAssignment_0 : ( ruleReceberValor ) ;
    public final void rule__LerAnalogica__AtribuicaoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6917:1: ( ( ruleReceberValor ) )
            // InternalOiArdubot.g:6918:2: ( ruleReceberValor )
            {
            // InternalOiArdubot.g:6918:2: ( ruleReceberValor )
            // InternalOiArdubot.g:6919:3: ruleReceberValor
            {
             before(grammarAccess.getLerAnalogicaAccess().getAtribuicaoReceberValorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReceberValor();

            state._fsp--;

             after(grammarAccess.getLerAnalogicaAccess().getAtribuicaoReceberValorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LerAnalogica__AtribuicaoAssignment_0"


    // $ANTLR start "rule__LerAnalogica__LerAssignment_1"
    // InternalOiArdubot.g:6928:1: rule__LerAnalogica__LerAssignment_1 : ( ruleFuncaoLerAnalogica ) ;
    public final void rule__LerAnalogica__LerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6932:1: ( ( ruleFuncaoLerAnalogica ) )
            // InternalOiArdubot.g:6933:2: ( ruleFuncaoLerAnalogica )
            {
            // InternalOiArdubot.g:6933:2: ( ruleFuncaoLerAnalogica )
            // InternalOiArdubot.g:6934:3: ruleFuncaoLerAnalogica
            {
             before(grammarAccess.getLerAnalogicaAccess().getLerFuncaoLerAnalogicaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncaoLerAnalogica();

            state._fsp--;

             after(grammarAccess.getLerAnalogicaAccess().getLerFuncaoLerAnalogicaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LerAnalogica__LerAssignment_1"


    // $ANTLR start "rule__FuncaoLerAnalogica__PortaAssignment_2"
    // InternalOiArdubot.g:6943:1: rule__FuncaoLerAnalogica__PortaAssignment_2 : ( rulePorta ) ;
    public final void rule__FuncaoLerAnalogica__PortaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6947:1: ( ( rulePorta ) )
            // InternalOiArdubot.g:6948:2: ( rulePorta )
            {
            // InternalOiArdubot.g:6948:2: ( rulePorta )
            // InternalOiArdubot.g:6949:3: rulePorta
            {
             before(grammarAccess.getFuncaoLerAnalogicaAccess().getPortaPortaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePorta();

            state._fsp--;

             after(grammarAccess.getFuncaoLerAnalogicaAccess().getPortaPortaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FuncaoLerAnalogica__PortaAssignment_2"


    // $ANTLR start "rule__Escrever__MensagemAssignment_1"
    // InternalOiArdubot.g:6958:1: rule__Escrever__MensagemAssignment_1 : ( ruleConteudoEscrever ) ;
    public final void rule__Escrever__MensagemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6962:1: ( ( ruleConteudoEscrever ) )
            // InternalOiArdubot.g:6963:2: ( ruleConteudoEscrever )
            {
            // InternalOiArdubot.g:6963:2: ( ruleConteudoEscrever )
            // InternalOiArdubot.g:6964:3: ruleConteudoEscrever
            {
             before(grammarAccess.getEscreverAccess().getMensagemConteudoEscreverParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConteudoEscrever();

            state._fsp--;

             after(grammarAccess.getEscreverAccess().getMensagemConteudoEscreverParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Escrever__MensagemAssignment_1"


    // $ANTLR start "rule__Tela__MensagemAssignment_1"
    // InternalOiArdubot.g:6973:1: rule__Tela__MensagemAssignment_1 : ( ruleDisplayValor ) ;
    public final void rule__Tela__MensagemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6977:1: ( ( ruleDisplayValor ) )
            // InternalOiArdubot.g:6978:2: ( ruleDisplayValor )
            {
            // InternalOiArdubot.g:6978:2: ( ruleDisplayValor )
            // InternalOiArdubot.g:6979:3: ruleDisplayValor
            {
             before(grammarAccess.getTelaAccess().getMensagemDisplayValorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDisplayValor();

            state._fsp--;

             after(grammarAccess.getTelaAccess().getMensagemDisplayValorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Tela__MensagemAssignment_1"


    // $ANTLR start "rule__Bip__TipoAssignment_2"
    // InternalOiArdubot.g:6988:1: rule__Bip__TipoAssignment_2 : ( ruleTipoBip ) ;
    public final void rule__Bip__TipoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:6992:1: ( ( ruleTipoBip ) )
            // InternalOiArdubot.g:6993:2: ( ruleTipoBip )
            {
            // InternalOiArdubot.g:6993:2: ( ruleTipoBip )
            // InternalOiArdubot.g:6994:3: ruleTipoBip
            {
             before(grammarAccess.getBipAccess().getTipoTipoBipParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoBip();

            state._fsp--;

             after(grammarAccess.getBipAccess().getTipoTipoBipParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Bip__TipoAssignment_2"


    // $ANTLR start "rule__Ligar__TipoPortaAssignment_2"
    // InternalOiArdubot.g:7003:1: rule__Ligar__TipoPortaAssignment_2 : ( ruleTipoPorta ) ;
    public final void rule__Ligar__TipoPortaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7007:1: ( ( ruleTipoPorta ) )
            // InternalOiArdubot.g:7008:2: ( ruleTipoPorta )
            {
            // InternalOiArdubot.g:7008:2: ( ruleTipoPorta )
            // InternalOiArdubot.g:7009:3: ruleTipoPorta
            {
             before(grammarAccess.getLigarAccess().getTipoPortaTipoPortaEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoPorta();

            state._fsp--;

             after(grammarAccess.getLigarAccess().getTipoPortaTipoPortaEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Ligar__TipoPortaAssignment_2"


    // $ANTLR start "rule__Ligar__PortaAssignment_4"
    // InternalOiArdubot.g:7018:1: rule__Ligar__PortaAssignment_4 : ( rulePorta ) ;
    public final void rule__Ligar__PortaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7022:1: ( ( rulePorta ) )
            // InternalOiArdubot.g:7023:2: ( rulePorta )
            {
            // InternalOiArdubot.g:7023:2: ( rulePorta )
            // InternalOiArdubot.g:7024:3: rulePorta
            {
             before(grammarAccess.getLigarAccess().getPortaPortaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePorta();

            state._fsp--;

             after(grammarAccess.getLigarAccess().getPortaPortaParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Ligar__PortaAssignment_4"


    // $ANTLR start "rule__Desligar__TipoPortaAssignment_2"
    // InternalOiArdubot.g:7033:1: rule__Desligar__TipoPortaAssignment_2 : ( ruleTipoPorta ) ;
    public final void rule__Desligar__TipoPortaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7037:1: ( ( ruleTipoPorta ) )
            // InternalOiArdubot.g:7038:2: ( ruleTipoPorta )
            {
            // InternalOiArdubot.g:7038:2: ( ruleTipoPorta )
            // InternalOiArdubot.g:7039:3: ruleTipoPorta
            {
             before(grammarAccess.getDesligarAccess().getTipoPortaTipoPortaEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoPorta();

            state._fsp--;

             after(grammarAccess.getDesligarAccess().getTipoPortaTipoPortaEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Desligar__TipoPortaAssignment_2"


    // $ANTLR start "rule__Desligar__PortaAssignment_4"
    // InternalOiArdubot.g:7048:1: rule__Desligar__PortaAssignment_4 : ( rulePorta ) ;
    public final void rule__Desligar__PortaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7052:1: ( ( rulePorta ) )
            // InternalOiArdubot.g:7053:2: ( rulePorta )
            {
            // InternalOiArdubot.g:7053:2: ( rulePorta )
            // InternalOiArdubot.g:7054:3: rulePorta
            {
             before(grammarAccess.getDesligarAccess().getPortaPortaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePorta();

            state._fsp--;

             after(grammarAccess.getDesligarAccess().getPortaPortaParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Desligar__PortaAssignment_4"


    // $ANTLR start "rule__Servo__PortaAssignment_2"
    // InternalOiArdubot.g:7063:1: rule__Servo__PortaAssignment_2 : ( ruleVariavelOuPorta ) ;
    public final void rule__Servo__PortaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7067:1: ( ( ruleVariavelOuPorta ) )
            // InternalOiArdubot.g:7068:2: ( ruleVariavelOuPorta )
            {
            // InternalOiArdubot.g:7068:2: ( ruleVariavelOuPorta )
            // InternalOiArdubot.g:7069:3: ruleVariavelOuPorta
            {
             before(grammarAccess.getServoAccess().getPortaVariavelOuPortaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelOuPorta();

            state._fsp--;

             after(grammarAccess.getServoAccess().getPortaVariavelOuPortaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Servo__PortaAssignment_2"


    // $ANTLR start "rule__Servo__PosicaoAssignment_4"
    // InternalOiArdubot.g:7078:1: rule__Servo__PosicaoAssignment_4 : ( RULE_INT ) ;
    public final void rule__Servo__PosicaoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7082:1: ( ( RULE_INT ) )
            // InternalOiArdubot.g:7083:2: ( RULE_INT )
            {
            // InternalOiArdubot.g:7083:2: ( RULE_INT )
            // InternalOiArdubot.g:7084:3: RULE_INT
            {
             before(grammarAccess.getServoAccess().getPosicaoINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getServoAccess().getPosicaoINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Servo__PosicaoAssignment_4"


    // $ANTLR start "rule__MotorDC__EstadoAssignment_2"
    // InternalOiArdubot.g:7093:1: rule__MotorDC__EstadoAssignment_2 : ( RULE_INT ) ;
    public final void rule__MotorDC__EstadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7097:1: ( ( RULE_INT ) )
            // InternalOiArdubot.g:7098:2: ( RULE_INT )
            {
            // InternalOiArdubot.g:7098:2: ( RULE_INT )
            // InternalOiArdubot.g:7099:3: RULE_INT
            {
             before(grammarAccess.getMotorDCAccess().getEstadoINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMotorDCAccess().getEstadoINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__MotorDC__EstadoAssignment_2"


    // $ANTLR start "rule__MotorDC__DirecaoAssignment_4"
    // InternalOiArdubot.g:7108:1: rule__MotorDC__DirecaoAssignment_4 : ( ruleDirecao ) ;
    public final void rule__MotorDC__DirecaoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7112:1: ( ( ruleDirecao ) )
            // InternalOiArdubot.g:7113:2: ( ruleDirecao )
            {
            // InternalOiArdubot.g:7113:2: ( ruleDirecao )
            // InternalOiArdubot.g:7114:3: ruleDirecao
            {
             before(grammarAccess.getMotorDCAccess().getDirecaoDirecaoEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDirecao();

            state._fsp--;

             after(grammarAccess.getMotorDCAccess().getDirecaoDirecaoEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__MotorDC__DirecaoAssignment_4"


    // $ANTLR start "rule__Andar__PortaAssignment_2"
    // InternalOiArdubot.g:7123:1: rule__Andar__PortaAssignment_2 : ( ruleVariavelOuPorta ) ;
    public final void rule__Andar__PortaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7127:1: ( ( ruleVariavelOuPorta ) )
            // InternalOiArdubot.g:7128:2: ( ruleVariavelOuPorta )
            {
            // InternalOiArdubot.g:7128:2: ( ruleVariavelOuPorta )
            // InternalOiArdubot.g:7129:3: ruleVariavelOuPorta
            {
             before(grammarAccess.getAndarAccess().getPortaVariavelOuPortaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelOuPorta();

            state._fsp--;

             after(grammarAccess.getAndarAccess().getPortaVariavelOuPortaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Andar__PortaAssignment_2"


    // $ANTLR start "rule__Andar__VelocidadeAssignment_4"
    // InternalOiArdubot.g:7138:1: rule__Andar__VelocidadeAssignment_4 : ( RULE_INT ) ;
    public final void rule__Andar__VelocidadeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7142:1: ( ( RULE_INT ) )
            // InternalOiArdubot.g:7143:2: ( RULE_INT )
            {
            // InternalOiArdubot.g:7143:2: ( RULE_INT )
            // InternalOiArdubot.g:7144:3: RULE_INT
            {
             before(grammarAccess.getAndarAccess().getVelocidadeINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAndarAccess().getVelocidadeINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Andar__VelocidadeAssignment_4"


    // $ANTLR start "rule__Andar__DirecaoAssignment_6"
    // InternalOiArdubot.g:7153:1: rule__Andar__DirecaoAssignment_6 : ( ruleDirecao ) ;
    public final void rule__Andar__DirecaoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7157:1: ( ( ruleDirecao ) )
            // InternalOiArdubot.g:7158:2: ( ruleDirecao )
            {
            // InternalOiArdubot.g:7158:2: ( ruleDirecao )
            // InternalOiArdubot.g:7159:3: ruleDirecao
            {
             before(grammarAccess.getAndarAccess().getDirecaoDirecaoEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDirecao();

            state._fsp--;

             after(grammarAccess.getAndarAccess().getDirecaoDirecaoEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__Andar__DirecaoAssignment_6"


    // $ANTLR start "rule__Parar__PortaAssignment_2"
    // InternalOiArdubot.g:7168:1: rule__Parar__PortaAssignment_2 : ( rulePorta ) ;
    public final void rule__Parar__PortaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7172:1: ( ( rulePorta ) )
            // InternalOiArdubot.g:7173:2: ( rulePorta )
            {
            // InternalOiArdubot.g:7173:2: ( rulePorta )
            // InternalOiArdubot.g:7174:3: rulePorta
            {
             before(grammarAccess.getPararAccess().getPortaPortaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePorta();

            state._fsp--;

             after(grammarAccess.getPararAccess().getPortaPortaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Parar__PortaAssignment_2"


    // $ANTLR start "rule__Para__VariavelAssignment_1"
    // InternalOiArdubot.g:7183:1: rule__Para__VariavelAssignment_1 : ( RULE_ID ) ;
    public final void rule__Para__VariavelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7187:1: ( ( RULE_ID ) )
            // InternalOiArdubot.g:7188:2: ( RULE_ID )
            {
            // InternalOiArdubot.g:7188:2: ( RULE_ID )
            // InternalOiArdubot.g:7189:3: RULE_ID
            {
             before(grammarAccess.getParaAccess().getVariavelIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getVariavelIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Para__VariavelAssignment_1"


    // $ANTLR start "rule__Para__DeAssignment_3"
    // InternalOiArdubot.g:7198:1: rule__Para__DeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Para__DeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7202:1: ( ( RULE_INT ) )
            // InternalOiArdubot.g:7203:2: ( RULE_INT )
            {
            // InternalOiArdubot.g:7203:2: ( RULE_INT )
            // InternalOiArdubot.g:7204:3: RULE_INT
            {
             before(grammarAccess.getParaAccess().getDeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getDeINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Para__DeAssignment_3"


    // $ANTLR start "rule__Para__AteAssignment_5"
    // InternalOiArdubot.g:7213:1: rule__Para__AteAssignment_5 : ( RULE_INT ) ;
    public final void rule__Para__AteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7217:1: ( ( RULE_INT ) )
            // InternalOiArdubot.g:7218:2: ( RULE_INT )
            {
            // InternalOiArdubot.g:7218:2: ( RULE_INT )
            // InternalOiArdubot.g:7219:3: RULE_INT
            {
             before(grammarAccess.getParaAccess().getAteINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getParaAccess().getAteINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Para__AteAssignment_5"


    // $ANTLR start "rule__Para__CodeAssignment_7"
    // InternalOiArdubot.g:7228:1: rule__Para__CodeAssignment_7 : ( ruleImplementacao ) ;
    public final void rule__Para__CodeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7232:1: ( ( ruleImplementacao ) )
            // InternalOiArdubot.g:7233:2: ( ruleImplementacao )
            {
            // InternalOiArdubot.g:7233:2: ( ruleImplementacao )
            // InternalOiArdubot.g:7234:3: ruleImplementacao
            {
             before(grammarAccess.getParaAccess().getCodeImplementacaoParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleImplementacao();

            state._fsp--;

             after(grammarAccess.getParaAccess().getCodeImplementacaoParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Para__CodeAssignment_7"


    // $ANTLR start "rule__Para__FimparaAssignment_8"
    // InternalOiArdubot.g:7243:1: rule__Para__FimparaAssignment_8 : ( ruleFimPara ) ;
    public final void rule__Para__FimparaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7247:1: ( ( ruleFimPara ) )
            // InternalOiArdubot.g:7248:2: ( ruleFimPara )
            {
            // InternalOiArdubot.g:7248:2: ( ruleFimPara )
            // InternalOiArdubot.g:7249:3: ruleFimPara
            {
             before(grammarAccess.getParaAccess().getFimparaFimParaParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFimPara();

            state._fsp--;

             after(grammarAccess.getParaAccess().getFimparaFimParaParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Para__FimparaAssignment_8"


    // $ANTLR start "rule__FimPara__NameAssignment"
    // InternalOiArdubot.g:7258:1: rule__FimPara__NameAssignment : ( ( 'fimpara' ) ) ;
    public final void rule__FimPara__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7262:1: ( ( ( 'fimpara' ) ) )
            // InternalOiArdubot.g:7263:2: ( ( 'fimpara' ) )
            {
            // InternalOiArdubot.g:7263:2: ( ( 'fimpara' ) )
            // InternalOiArdubot.g:7264:3: ( 'fimpara' )
            {
             before(grammarAccess.getFimParaAccess().getNameFimparaKeyword_0()); 
            // InternalOiArdubot.g:7265:3: ( 'fimpara' )
            // InternalOiArdubot.g:7266:4: 'fimpara'
            {
             before(grammarAccess.getFimParaAccess().getNameFimparaKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFimParaAccess().getNameFimparaKeyword_0()); 

            }

             after(grammarAccess.getFimParaAccess().getNameFimparaKeyword_0()); 

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
    // $ANTLR end "rule__FimPara__NameAssignment"


    // $ANTLR start "rule__Enquanto__ValorEsquerdaAssignment_2"
    // InternalOiArdubot.g:7277:1: rule__Enquanto__ValorEsquerdaAssignment_2 : ( ruleVariavelValor ) ;
    public final void rule__Enquanto__ValorEsquerdaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7281:1: ( ( ruleVariavelValor ) )
            // InternalOiArdubot.g:7282:2: ( ruleVariavelValor )
            {
            // InternalOiArdubot.g:7282:2: ( ruleVariavelValor )
            // InternalOiArdubot.g:7283:3: ruleVariavelValor
            {
             before(grammarAccess.getEnquantoAccess().getValorEsquerdaVariavelValorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelValor();

            state._fsp--;

             after(grammarAccess.getEnquantoAccess().getValorEsquerdaVariavelValorParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Enquanto__ValorEsquerdaAssignment_2"


    // $ANTLR start "rule__Enquanto__RelacaoAssignment_3"
    // InternalOiArdubot.g:7292:1: rule__Enquanto__RelacaoAssignment_3 : ( ruleLogico ) ;
    public final void rule__Enquanto__RelacaoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7296:1: ( ( ruleLogico ) )
            // InternalOiArdubot.g:7297:2: ( ruleLogico )
            {
            // InternalOiArdubot.g:7297:2: ( ruleLogico )
            // InternalOiArdubot.g:7298:3: ruleLogico
            {
             before(grammarAccess.getEnquantoAccess().getRelacaoLogicoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLogico();

            state._fsp--;

             after(grammarAccess.getEnquantoAccess().getRelacaoLogicoParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Enquanto__RelacaoAssignment_3"


    // $ANTLR start "rule__Enquanto__ValorDireitaAssignment_4"
    // InternalOiArdubot.g:7307:1: rule__Enquanto__ValorDireitaAssignment_4 : ( ruleVariavelValor ) ;
    public final void rule__Enquanto__ValorDireitaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7311:1: ( ( ruleVariavelValor ) )
            // InternalOiArdubot.g:7312:2: ( ruleVariavelValor )
            {
            // InternalOiArdubot.g:7312:2: ( ruleVariavelValor )
            // InternalOiArdubot.g:7313:3: ruleVariavelValor
            {
             before(grammarAccess.getEnquantoAccess().getValorDireitaVariavelValorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelValor();

            state._fsp--;

             after(grammarAccess.getEnquantoAccess().getValorDireitaVariavelValorParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Enquanto__ValorDireitaAssignment_4"


    // $ANTLR start "rule__Enquanto__CodeAssignment_7"
    // InternalOiArdubot.g:7322:1: rule__Enquanto__CodeAssignment_7 : ( ruleImplementacao ) ;
    public final void rule__Enquanto__CodeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7326:1: ( ( ruleImplementacao ) )
            // InternalOiArdubot.g:7327:2: ( ruleImplementacao )
            {
            // InternalOiArdubot.g:7327:2: ( ruleImplementacao )
            // InternalOiArdubot.g:7328:3: ruleImplementacao
            {
             before(grammarAccess.getEnquantoAccess().getCodeImplementacaoParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleImplementacao();

            state._fsp--;

             after(grammarAccess.getEnquantoAccess().getCodeImplementacaoParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Enquanto__CodeAssignment_7"


    // $ANTLR start "rule__Repita__CodeAssignment_1"
    // InternalOiArdubot.g:7337:1: rule__Repita__CodeAssignment_1 : ( ruleImplementacao ) ;
    public final void rule__Repita__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7341:1: ( ( ruleImplementacao ) )
            // InternalOiArdubot.g:7342:2: ( ruleImplementacao )
            {
            // InternalOiArdubot.g:7342:2: ( ruleImplementacao )
            // InternalOiArdubot.g:7343:3: ruleImplementacao
            {
             before(grammarAccess.getRepitaAccess().getCodeImplementacaoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImplementacao();

            state._fsp--;

             after(grammarAccess.getRepitaAccess().getCodeImplementacaoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Repita__CodeAssignment_1"


    // $ANTLR start "rule__Repita__ValorEsquerdaAssignment_4"
    // InternalOiArdubot.g:7352:1: rule__Repita__ValorEsquerdaAssignment_4 : ( ruleVariavelValor ) ;
    public final void rule__Repita__ValorEsquerdaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7356:1: ( ( ruleVariavelValor ) )
            // InternalOiArdubot.g:7357:2: ( ruleVariavelValor )
            {
            // InternalOiArdubot.g:7357:2: ( ruleVariavelValor )
            // InternalOiArdubot.g:7358:3: ruleVariavelValor
            {
             before(grammarAccess.getRepitaAccess().getValorEsquerdaVariavelValorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelValor();

            state._fsp--;

             after(grammarAccess.getRepitaAccess().getValorEsquerdaVariavelValorParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Repita__ValorEsquerdaAssignment_4"


    // $ANTLR start "rule__Repita__RelacaoAssignment_5"
    // InternalOiArdubot.g:7367:1: rule__Repita__RelacaoAssignment_5 : ( ruleLogico ) ;
    public final void rule__Repita__RelacaoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7371:1: ( ( ruleLogico ) )
            // InternalOiArdubot.g:7372:2: ( ruleLogico )
            {
            // InternalOiArdubot.g:7372:2: ( ruleLogico )
            // InternalOiArdubot.g:7373:3: ruleLogico
            {
             before(grammarAccess.getRepitaAccess().getRelacaoLogicoParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLogico();

            state._fsp--;

             after(grammarAccess.getRepitaAccess().getRelacaoLogicoParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Repita__RelacaoAssignment_5"


    // $ANTLR start "rule__Repita__ValorDireitaAssignment_6"
    // InternalOiArdubot.g:7382:1: rule__Repita__ValorDireitaAssignment_6 : ( ruleVariavelValor ) ;
    public final void rule__Repita__ValorDireitaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7386:1: ( ( ruleVariavelValor ) )
            // InternalOiArdubot.g:7387:2: ( ruleVariavelValor )
            {
            // InternalOiArdubot.g:7387:2: ( ruleVariavelValor )
            // InternalOiArdubot.g:7388:3: ruleVariavelValor
            {
             before(grammarAccess.getRepitaAccess().getValorDireitaVariavelValorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelValor();

            state._fsp--;

             after(grammarAccess.getRepitaAccess().getValorDireitaVariavelValorParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Repita__ValorDireitaAssignment_6"


    // $ANTLR start "rule__Se__ValorEsquerdaAssignment_1"
    // InternalOiArdubot.g:7397:1: rule__Se__ValorEsquerdaAssignment_1 : ( ruleVariavelValor ) ;
    public final void rule__Se__ValorEsquerdaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7401:1: ( ( ruleVariavelValor ) )
            // InternalOiArdubot.g:7402:2: ( ruleVariavelValor )
            {
            // InternalOiArdubot.g:7402:2: ( ruleVariavelValor )
            // InternalOiArdubot.g:7403:3: ruleVariavelValor
            {
             before(grammarAccess.getSeAccess().getValorEsquerdaVariavelValorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelValor();

            state._fsp--;

             after(grammarAccess.getSeAccess().getValorEsquerdaVariavelValorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Se__ValorEsquerdaAssignment_1"


    // $ANTLR start "rule__Se__RelacaoAssignment_2"
    // InternalOiArdubot.g:7412:1: rule__Se__RelacaoAssignment_2 : ( ruleLogico ) ;
    public final void rule__Se__RelacaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7416:1: ( ( ruleLogico ) )
            // InternalOiArdubot.g:7417:2: ( ruleLogico )
            {
            // InternalOiArdubot.g:7417:2: ( ruleLogico )
            // InternalOiArdubot.g:7418:3: ruleLogico
            {
             before(grammarAccess.getSeAccess().getRelacaoLogicoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogico();

            state._fsp--;

             after(grammarAccess.getSeAccess().getRelacaoLogicoParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Se__RelacaoAssignment_2"


    // $ANTLR start "rule__Se__ValorDireitaAssignment_3"
    // InternalOiArdubot.g:7427:1: rule__Se__ValorDireitaAssignment_3 : ( ruleVariavelValor ) ;
    public final void rule__Se__ValorDireitaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7431:1: ( ( ruleVariavelValor ) )
            // InternalOiArdubot.g:7432:2: ( ruleVariavelValor )
            {
            // InternalOiArdubot.g:7432:2: ( ruleVariavelValor )
            // InternalOiArdubot.g:7433:3: ruleVariavelValor
            {
             before(grammarAccess.getSeAccess().getValorDireitaVariavelValorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelValor();

            state._fsp--;

             after(grammarAccess.getSeAccess().getValorDireitaVariavelValorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Se__ValorDireitaAssignment_3"


    // $ANTLR start "rule__Se__CodeAssignment_5"
    // InternalOiArdubot.g:7442:1: rule__Se__CodeAssignment_5 : ( ruleImplementacao ) ;
    public final void rule__Se__CodeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7446:1: ( ( ruleImplementacao ) )
            // InternalOiArdubot.g:7447:2: ( ruleImplementacao )
            {
            // InternalOiArdubot.g:7447:2: ( ruleImplementacao )
            // InternalOiArdubot.g:7448:3: ruleImplementacao
            {
             before(grammarAccess.getSeAccess().getCodeImplementacaoParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleImplementacao();

            state._fsp--;

             after(grammarAccess.getSeAccess().getCodeImplementacaoParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Se__CodeAssignment_5"


    // $ANTLR start "rule__Se__SenaoAssignment_6"
    // InternalOiArdubot.g:7457:1: rule__Se__SenaoAssignment_6 : ( ruleSenao ) ;
    public final void rule__Se__SenaoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7461:1: ( ( ruleSenao ) )
            // InternalOiArdubot.g:7462:2: ( ruleSenao )
            {
            // InternalOiArdubot.g:7462:2: ( ruleSenao )
            // InternalOiArdubot.g:7463:3: ruleSenao
            {
             before(grammarAccess.getSeAccess().getSenaoSenaoParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSenao();

            state._fsp--;

             after(grammarAccess.getSeAccess().getSenaoSenaoParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Se__SenaoAssignment_6"


    // $ANTLR start "rule__Se__FimseAssignment_7"
    // InternalOiArdubot.g:7472:1: rule__Se__FimseAssignment_7 : ( ruleFimse ) ;
    public final void rule__Se__FimseAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7476:1: ( ( ruleFimse ) )
            // InternalOiArdubot.g:7477:2: ( ruleFimse )
            {
            // InternalOiArdubot.g:7477:2: ( ruleFimse )
            // InternalOiArdubot.g:7478:3: ruleFimse
            {
             before(grammarAccess.getSeAccess().getFimseFimseParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleFimse();

            state._fsp--;

             after(grammarAccess.getSeAccess().getFimseFimseParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Se__FimseAssignment_7"


    // $ANTLR start "rule__Fimse__NameAssignment"
    // InternalOiArdubot.g:7487:1: rule__Fimse__NameAssignment : ( ( 'fimse' ) ) ;
    public final void rule__Fimse__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7491:1: ( ( ( 'fimse' ) ) )
            // InternalOiArdubot.g:7492:2: ( ( 'fimse' ) )
            {
            // InternalOiArdubot.g:7492:2: ( ( 'fimse' ) )
            // InternalOiArdubot.g:7493:3: ( 'fimse' )
            {
             before(grammarAccess.getFimseAccess().getNameFimseKeyword_0()); 
            // InternalOiArdubot.g:7494:3: ( 'fimse' )
            // InternalOiArdubot.g:7495:4: 'fimse'
            {
             before(grammarAccess.getFimseAccess().getNameFimseKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getFimseAccess().getNameFimseKeyword_0()); 

            }

             after(grammarAccess.getFimseAccess().getNameFimseKeyword_0()); 

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
    // $ANTLR end "rule__Fimse__NameAssignment"


    // $ANTLR start "rule__Senao__CodeAssignment_1"
    // InternalOiArdubot.g:7506:1: rule__Senao__CodeAssignment_1 : ( ruleImplementacao ) ;
    public final void rule__Senao__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7510:1: ( ( ruleImplementacao ) )
            // InternalOiArdubot.g:7511:2: ( ruleImplementacao )
            {
            // InternalOiArdubot.g:7511:2: ( ruleImplementacao )
            // InternalOiArdubot.g:7512:3: ruleImplementacao
            {
             before(grammarAccess.getSenaoAccess().getCodeImplementacaoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImplementacao();

            state._fsp--;

             after(grammarAccess.getSenaoAccess().getCodeImplementacaoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Senao__CodeAssignment_1"


    // $ANTLR start "rule__Escolha__ValorAssignment_1"
    // InternalOiArdubot.g:7521:1: rule__Escolha__ValorAssignment_1 : ( ruleValorReferencia ) ;
    public final void rule__Escolha__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7525:1: ( ( ruleValorReferencia ) )
            // InternalOiArdubot.g:7526:2: ( ruleValorReferencia )
            {
            // InternalOiArdubot.g:7526:2: ( ruleValorReferencia )
            // InternalOiArdubot.g:7527:3: ruleValorReferencia
            {
             before(grammarAccess.getEscolhaAccess().getValorValorReferenciaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValorReferencia();

            state._fsp--;

             after(grammarAccess.getEscolhaAccess().getValorValorReferenciaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Escolha__ValorAssignment_1"


    // $ANTLR start "rule__Escolha__CasosAssignment_2"
    // InternalOiArdubot.g:7536:1: rule__Escolha__CasosAssignment_2 : ( ruleCaso ) ;
    public final void rule__Escolha__CasosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7540:1: ( ( ruleCaso ) )
            // InternalOiArdubot.g:7541:2: ( ruleCaso )
            {
            // InternalOiArdubot.g:7541:2: ( ruleCaso )
            // InternalOiArdubot.g:7542:3: ruleCaso
            {
             before(grammarAccess.getEscolhaAccess().getCasosCasoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCaso();

            state._fsp--;

             after(grammarAccess.getEscolhaAccess().getCasosCasoParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Escolha__CasosAssignment_2"


    // $ANTLR start "rule__Caso__ValorAssignment_1"
    // InternalOiArdubot.g:7551:1: rule__Caso__ValorAssignment_1 : ( ruleTextoOuNumero ) ;
    public final void rule__Caso__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7555:1: ( ( ruleTextoOuNumero ) )
            // InternalOiArdubot.g:7556:2: ( ruleTextoOuNumero )
            {
            // InternalOiArdubot.g:7556:2: ( ruleTextoOuNumero )
            // InternalOiArdubot.g:7557:3: ruleTextoOuNumero
            {
             before(grammarAccess.getCasoAccess().getValorTextoOuNumeroParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextoOuNumero();

            state._fsp--;

             after(grammarAccess.getCasoAccess().getValorTextoOuNumeroParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Caso__ValorAssignment_1"


    // $ANTLR start "rule__Caso__CodigoAssignment_3"
    // InternalOiArdubot.g:7566:1: rule__Caso__CodigoAssignment_3 : ( ruleCodigo ) ;
    public final void rule__Caso__CodigoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7570:1: ( ( ruleCodigo ) )
            // InternalOiArdubot.g:7571:2: ( ruleCodigo )
            {
            // InternalOiArdubot.g:7571:2: ( ruleCodigo )
            // InternalOiArdubot.g:7572:3: ruleCodigo
            {
             before(grammarAccess.getCasoAccess().getCodigoCodigoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCodigo();

            state._fsp--;

             after(grammarAccess.getCasoAccess().getCodigoCodigoParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Caso__CodigoAssignment_3"


    // $ANTLR start "rule__Funcao__NameAssignment_1"
    // InternalOiArdubot.g:7581:1: rule__Funcao__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Funcao__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7585:1: ( ( RULE_ID ) )
            // InternalOiArdubot.g:7586:2: ( RULE_ID )
            {
            // InternalOiArdubot.g:7586:2: ( RULE_ID )
            // InternalOiArdubot.g:7587:3: RULE_ID
            {
             before(grammarAccess.getFuncaoAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFuncaoAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Funcao__NameAssignment_1"


    // $ANTLR start "rule__Funcao__ParametroAssignment_2"
    // InternalOiArdubot.g:7596:1: rule__Funcao__ParametroAssignment_2 : ( ruleParametro ) ;
    public final void rule__Funcao__ParametroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7600:1: ( ( ruleParametro ) )
            // InternalOiArdubot.g:7601:2: ( ruleParametro )
            {
            // InternalOiArdubot.g:7601:2: ( ruleParametro )
            // InternalOiArdubot.g:7602:3: ruleParametro
            {
             before(grammarAccess.getFuncaoAccess().getParametroParametroParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getFuncaoAccess().getParametroParametroParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Funcao__ParametroAssignment_2"


    // $ANTLR start "rule__Funcao__TipoAssignment_4"
    // InternalOiArdubot.g:7611:1: rule__Funcao__TipoAssignment_4 : ( ruleTipo ) ;
    public final void rule__Funcao__TipoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7615:1: ( ( ruleTipo ) )
            // InternalOiArdubot.g:7616:2: ( ruleTipo )
            {
            // InternalOiArdubot.g:7616:2: ( ruleTipo )
            // InternalOiArdubot.g:7617:3: ruleTipo
            {
             before(grammarAccess.getFuncaoAccess().getTipoTipoEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTipo();

            state._fsp--;

             after(grammarAccess.getFuncaoAccess().getTipoTipoEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Funcao__TipoAssignment_4"


    // $ANTLR start "rule__Funcao__CodigoAssignment_5"
    // InternalOiArdubot.g:7626:1: rule__Funcao__CodigoAssignment_5 : ( ruleImplementacao ) ;
    public final void rule__Funcao__CodigoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7630:1: ( ( ruleImplementacao ) )
            // InternalOiArdubot.g:7631:2: ( ruleImplementacao )
            {
            // InternalOiArdubot.g:7631:2: ( ruleImplementacao )
            // InternalOiArdubot.g:7632:3: ruleImplementacao
            {
             before(grammarAccess.getFuncaoAccess().getCodigoImplementacaoParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleImplementacao();

            state._fsp--;

             after(grammarAccess.getFuncaoAccess().getCodigoImplementacaoParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Funcao__CodigoAssignment_5"


    // $ANTLR start "rule__Funcao__RetornoAssignment_6_1"
    // InternalOiArdubot.g:7641:1: rule__Funcao__RetornoAssignment_6_1 : ( ruleVariavelValor ) ;
    public final void rule__Funcao__RetornoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7645:1: ( ( ruleVariavelValor ) )
            // InternalOiArdubot.g:7646:2: ( ruleVariavelValor )
            {
            // InternalOiArdubot.g:7646:2: ( ruleVariavelValor )
            // InternalOiArdubot.g:7647:3: ruleVariavelValor
            {
             before(grammarAccess.getFuncaoAccess().getRetornoVariavelValorParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelValor();

            state._fsp--;

             after(grammarAccess.getFuncaoAccess().getRetornoVariavelValorParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Funcao__RetornoAssignment_6_1"


    // $ANTLR start "rule__Parametro__ValorAssignment_1"
    // InternalOiArdubot.g:7656:1: rule__Parametro__ValorAssignment_1 : ( ruleVariavelNome ) ;
    public final void rule__Parametro__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7660:1: ( ( ruleVariavelNome ) )
            // InternalOiArdubot.g:7661:2: ( ruleVariavelNome )
            {
            // InternalOiArdubot.g:7661:2: ( ruleVariavelNome )
            // InternalOiArdubot.g:7662:3: ruleVariavelNome
            {
             before(grammarAccess.getParametroAccess().getValorVariavelNomeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavelNome();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getValorVariavelNomeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parametro__ValorAssignment_1"


    // $ANTLR start "rule__Espera__ValorAssignment_2"
    // InternalOiArdubot.g:7671:1: rule__Espera__ValorAssignment_2 : ( RULE_INT ) ;
    public final void rule__Espera__ValorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOiArdubot.g:7675:1: ( ( RULE_INT ) )
            // InternalOiArdubot.g:7676:2: ( RULE_INT )
            {
            // InternalOiArdubot.g:7676:2: ( RULE_INT )
            // InternalOiArdubot.g:7677:3: RULE_INT
            {
             before(grammarAccess.getEsperaAccess().getValorINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEsperaAccess().getValorINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Espera__ValorAssignment_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\34\10\uffff\2\4\7\uffff\1\4\1\34\4\uffff\1\37";
    static final String dfa_3s = "\1\100\1\uffff\1\34\10\uffff\2\4\7\uffff\1\43\1\34\4\uffff\1\43";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\14\1\15\1\16\1\17\1\20\1\23\1\24\2\uffff\1\2\1\13\1\22\1\21\1\uffff";
    static final String dfa_5s = "\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\23\uffff\1\13\1\14\12\uffff\1\21\1\3\1\6\1\4\1\uffff\1\5\1\15\1\16\1\22\1\23\1\10\3\uffff\1\11\1\uffff\1\12\1\1\2\uffff\1\7\3\uffff\1\17\3\uffff\1\20",
            "",
            "\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25",
            "\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\26\27\uffff\1\27\2\uffff\1\31\1\30",
            "\1\32",
            "",
            "",
            "",
            "",
            "\1\27\2\uffff\1\31\1\30"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1500:1: rule__Implementacao__Alternatives : ( ( ruleSe ) | ( ruleVariavelExistente ) | ( ruleTela ) | ( ruleLigar ) | ( ruleDesligar ) | ( ruleBip ) | ( ruleEscolha ) | ( rulePara ) | ( ruleEnquanto ) | ( ruleRepita ) | ( ruleLer ) | ( ruleServo ) | ( ruleMotorDC ) | ( ruleFuncao ) | ( ruleEspera ) | ( ruleEscrever ) | ( ruleLerDigital ) | ( ruleLerAnalogica ) | ( ruleAndar ) | ( ruleParar ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x11347EF003000012L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000043000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x11347EF003000010L,0x0000000000000009L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x11347EF003000010L,0x0000000000000011L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x113C7EF003000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x11357EF003000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x11B47EF003000010L,0x0000000000000021L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x11347EF003000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000100000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xD1347EF003000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000203000010L});

}