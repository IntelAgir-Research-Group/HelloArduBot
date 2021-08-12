package br.edu.utfpr.oiardubot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.edu.utfpr.oiardubot.services.OiArdubotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOiArdubotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANALOGICA", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_CONSTANTENOME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Variaveis'", "'Inicio'", "'Fim'", "'<-'", "';'", "'CONSTANTE'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'ler'", "'('", "')'", "'lerDigital'", "'lerAnalogica'", "'escrever'", "'tela'", "'bip'", "'curto'", "'medio'", "'longo'", "'ligar'", "','", "'desligar'", "'girarServo'", "'motorDC'", "'andar'", "'parar'", "'para'", "'de'", "'ate'", "'faca'", "'fimpara'", "'enquanto'", "'fimenquanto'", "'repita'", "'se'", "'entao'", "'fimse'", "'senao'", "'escolha'", "'fimescolha'", "'caso'", "'fimcaso'", "'funcao'", "':'", "'retorne'", "'fimfuncao'", "'esperar'", "'DIGITAL'", "'ANALOGICA'", "'Texto'", "'Numero'", "'FRENTE'", "'TRAS'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_ANALOGICA=4;
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

        public InternalOiArdubotParser(TokenStream input, OiArdubotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected OiArdubotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalOiArdubot.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOiArdubot.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalOiArdubot.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOiArdubot.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_var_0_0= 'Variaveis' ) )? ( (lv_variaveis_1_0= ruleVariavel ) )* ( (lv_constantes_2_0= ruleConstante ) )* ( (lv_ini_3_0= 'Inicio' ) ) ( (lv_codigo_4_0= ruleImplementacao ) )* ( (lv_fim_5_0= 'Fim' ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token lv_ini_3_0=null;
        Token lv_fim_5_0=null;
        EObject lv_variaveis_1_0 = null;

        EObject lv_constantes_2_0 = null;

        EObject lv_codigo_4_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:78:2: ( ( ( (lv_var_0_0= 'Variaveis' ) )? ( (lv_variaveis_1_0= ruleVariavel ) )* ( (lv_constantes_2_0= ruleConstante ) )* ( (lv_ini_3_0= 'Inicio' ) ) ( (lv_codigo_4_0= ruleImplementacao ) )* ( (lv_fim_5_0= 'Fim' ) ) ) )
            // InternalOiArdubot.g:79:2: ( ( (lv_var_0_0= 'Variaveis' ) )? ( (lv_variaveis_1_0= ruleVariavel ) )* ( (lv_constantes_2_0= ruleConstante ) )* ( (lv_ini_3_0= 'Inicio' ) ) ( (lv_codigo_4_0= ruleImplementacao ) )* ( (lv_fim_5_0= 'Fim' ) ) )
            {
            // InternalOiArdubot.g:79:2: ( ( (lv_var_0_0= 'Variaveis' ) )? ( (lv_variaveis_1_0= ruleVariavel ) )* ( (lv_constantes_2_0= ruleConstante ) )* ( (lv_ini_3_0= 'Inicio' ) ) ( (lv_codigo_4_0= ruleImplementacao ) )* ( (lv_fim_5_0= 'Fim' ) ) )
            // InternalOiArdubot.g:80:3: ( (lv_var_0_0= 'Variaveis' ) )? ( (lv_variaveis_1_0= ruleVariavel ) )* ( (lv_constantes_2_0= ruleConstante ) )* ( (lv_ini_3_0= 'Inicio' ) ) ( (lv_codigo_4_0= ruleImplementacao ) )* ( (lv_fim_5_0= 'Fim' ) )
            {
            // InternalOiArdubot.g:80:3: ( (lv_var_0_0= 'Variaveis' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOiArdubot.g:81:4: (lv_var_0_0= 'Variaveis' )
                    {
                    // InternalOiArdubot.g:81:4: (lv_var_0_0= 'Variaveis' )
                    // InternalOiArdubot.g:82:5: lv_var_0_0= 'Variaveis'
                    {
                    lv_var_0_0=(Token)match(input,13,FOLLOW_3); 

                    					newLeafNode(lv_var_0_0, grammarAccess.getModelAccess().getVarVariaveisKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					addWithLastConsumed(current, "var", lv_var_0_0, "Variaveis");
                    				

                    }


                    }
                    break;

            }

            // InternalOiArdubot.g:94:3: ( (lv_variaveis_1_0= ruleVariavel ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=66 && LA2_0<=67)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOiArdubot.g:95:4: (lv_variaveis_1_0= ruleVariavel )
            	    {
            	    // InternalOiArdubot.g:95:4: (lv_variaveis_1_0= ruleVariavel )
            	    // InternalOiArdubot.g:96:5: lv_variaveis_1_0= ruleVariavel
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVariaveisVariavelParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_variaveis_1_0=ruleVariavel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variaveis",
            	    						lv_variaveis_1_0,
            	    						"br.edu.utfpr.oiardubot.OiArdubot.Variavel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalOiArdubot.g:113:3: ( (lv_constantes_2_0= ruleConstante ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOiArdubot.g:114:4: (lv_constantes_2_0= ruleConstante )
            	    {
            	    // InternalOiArdubot.g:114:4: (lv_constantes_2_0= ruleConstante )
            	    // InternalOiArdubot.g:115:5: lv_constantes_2_0= ruleConstante
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getConstantesConstanteParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_constantes_2_0=ruleConstante();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constantes",
            	    						lv_constantes_2_0,
            	    						"br.edu.utfpr.oiardubot.OiArdubot.Constante");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalOiArdubot.g:132:3: ( (lv_ini_3_0= 'Inicio' ) )
            // InternalOiArdubot.g:133:4: (lv_ini_3_0= 'Inicio' )
            {
            // InternalOiArdubot.g:133:4: (lv_ini_3_0= 'Inicio' )
            // InternalOiArdubot.g:134:5: lv_ini_3_0= 'Inicio'
            {
            lv_ini_3_0=(Token)match(input,14,FOLLOW_5); 

            					newLeafNode(lv_ini_3_0, grammarAccess.getModelAccess().getIniInicioKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					addWithLastConsumed(current, "ini", lv_ini_3_0, "Inicio");
            				

            }


            }

            // InternalOiArdubot.g:146:3: ( (lv_codigo_4_0= ruleImplementacao ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=30 && LA4_0<=32)||LA4_0==36||(LA4_0>=38 && LA4_0<=43)||LA4_0==48||(LA4_0>=50 && LA4_0<=51)||LA4_0==55||LA4_0==59||LA4_0==63||(LA4_0>=66 && LA4_0<=67)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOiArdubot.g:147:4: (lv_codigo_4_0= ruleImplementacao )
            	    {
            	    // InternalOiArdubot.g:147:4: (lv_codigo_4_0= ruleImplementacao )
            	    // InternalOiArdubot.g:148:5: lv_codigo_4_0= ruleImplementacao
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getCodigoImplementacaoParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_codigo_4_0=ruleImplementacao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"codigo",
            	    						lv_codigo_4_0,
            	    						"br.edu.utfpr.oiardubot.OiArdubot.Implementacao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalOiArdubot.g:165:3: ( (lv_fim_5_0= 'Fim' ) )
            // InternalOiArdubot.g:166:4: (lv_fim_5_0= 'Fim' )
            {
            // InternalOiArdubot.g:166:4: (lv_fim_5_0= 'Fim' )
            // InternalOiArdubot.g:167:5: lv_fim_5_0= 'Fim'
            {
            lv_fim_5_0=(Token)match(input,15,FOLLOW_2); 

            					newLeafNode(lv_fim_5_0, grammarAccess.getModelAccess().getFimFimKeyword_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					addWithLastConsumed(current, "fim", lv_fim_5_0, "Fim");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCodigo"
    // InternalOiArdubot.g:183:1: entryRuleCodigo returns [EObject current=null] : iv_ruleCodigo= ruleCodigo EOF ;
    public final EObject entryRuleCodigo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodigo = null;


        try {
            // InternalOiArdubot.g:183:47: (iv_ruleCodigo= ruleCodigo EOF )
            // InternalOiArdubot.g:184:2: iv_ruleCodigo= ruleCodigo EOF
            {
             newCompositeNode(grammarAccess.getCodigoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodigo=ruleCodigo();

            state._fsp--;

             current =iv_ruleCodigo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodigo"


    // $ANTLR start "ruleCodigo"
    // InternalOiArdubot.g:190:1: ruleCodigo returns [EObject current=null] : ( (lv_code_0_0= ruleImplementacao ) )* ;
    public final EObject ruleCodigo() throws RecognitionException {
        EObject current = null;

        EObject lv_code_0_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:196:2: ( ( (lv_code_0_0= ruleImplementacao ) )* )
            // InternalOiArdubot.g:197:2: ( (lv_code_0_0= ruleImplementacao ) )*
            {
            // InternalOiArdubot.g:197:2: ( (lv_code_0_0= ruleImplementacao ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=30 && LA5_0<=32)||LA5_0==36||(LA5_0>=38 && LA5_0<=43)||LA5_0==48||(LA5_0>=50 && LA5_0<=51)||LA5_0==55||LA5_0==59||LA5_0==63||(LA5_0>=66 && LA5_0<=67)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOiArdubot.g:198:3: (lv_code_0_0= ruleImplementacao )
            	    {
            	    // InternalOiArdubot.g:198:3: (lv_code_0_0= ruleImplementacao )
            	    // InternalOiArdubot.g:199:4: lv_code_0_0= ruleImplementacao
            	    {

            	    				newCompositeNode(grammarAccess.getCodigoAccess().getCodeImplementacaoParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_6);
            	    lv_code_0_0=ruleImplementacao();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getCodigoRule());
            	    				}
            	    				add(
            	    					current,
            	    					"code",
            	    					lv_code_0_0,
            	    					"br.edu.utfpr.oiardubot.OiArdubot.Implementacao");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodigo"


    // $ANTLR start "entryRuleImplementacao"
    // InternalOiArdubot.g:219:1: entryRuleImplementacao returns [EObject current=null] : iv_ruleImplementacao= ruleImplementacao EOF ;
    public final EObject entryRuleImplementacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementacao = null;


        try {
            // InternalOiArdubot.g:219:54: (iv_ruleImplementacao= ruleImplementacao EOF )
            // InternalOiArdubot.g:220:2: iv_ruleImplementacao= ruleImplementacao EOF
            {
             newCompositeNode(grammarAccess.getImplementacaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementacao=ruleImplementacao();

            state._fsp--;

             current =iv_ruleImplementacao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplementacao"


    // $ANTLR start "ruleImplementacao"
    // InternalOiArdubot.g:226:1: ruleImplementacao returns [EObject current=null] : (this_Se_0= ruleSe | this_VariavelExistente_1= ruleVariavelExistente | this_Tela_2= ruleTela | this_Ligar_3= ruleLigar | this_Desligar_4= ruleDesligar | this_Bip_5= ruleBip | this_Escolha_6= ruleEscolha | this_Para_7= rulePara | this_Enquanto_8= ruleEnquanto | this_Repita_9= ruleRepita | this_Ler_10= ruleLer | this_Servo_11= ruleServo | this_MotorDC_12= ruleMotorDC | this_Funcao_13= ruleFuncao | this_Espera_14= ruleEspera | this_Escrever_15= ruleEscrever | this_LerDigital_16= ruleLerDigital | this_LerAnalogica_17= ruleLerAnalogica | this_Andar_18= ruleAndar | this_Parar_19= ruleParar ) ;
    public final EObject ruleImplementacao() throws RecognitionException {
        EObject current = null;

        EObject this_Se_0 = null;

        EObject this_VariavelExistente_1 = null;

        EObject this_Tela_2 = null;

        EObject this_Ligar_3 = null;

        EObject this_Desligar_4 = null;

        EObject this_Bip_5 = null;

        EObject this_Escolha_6 = null;

        EObject this_Para_7 = null;

        EObject this_Enquanto_8 = null;

        EObject this_Repita_9 = null;

        EObject this_Ler_10 = null;

        EObject this_Servo_11 = null;

        EObject this_MotorDC_12 = null;

        EObject this_Funcao_13 = null;

        EObject this_Espera_14 = null;

        EObject this_Escrever_15 = null;

        EObject this_LerDigital_16 = null;

        EObject this_LerAnalogica_17 = null;

        EObject this_Andar_18 = null;

        EObject this_Parar_19 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:232:2: ( (this_Se_0= ruleSe | this_VariavelExistente_1= ruleVariavelExistente | this_Tela_2= ruleTela | this_Ligar_3= ruleLigar | this_Desligar_4= ruleDesligar | this_Bip_5= ruleBip | this_Escolha_6= ruleEscolha | this_Para_7= rulePara | this_Enquanto_8= ruleEnquanto | this_Repita_9= ruleRepita | this_Ler_10= ruleLer | this_Servo_11= ruleServo | this_MotorDC_12= ruleMotorDC | this_Funcao_13= ruleFuncao | this_Espera_14= ruleEspera | this_Escrever_15= ruleEscrever | this_LerDigital_16= ruleLerDigital | this_LerAnalogica_17= ruleLerAnalogica | this_Andar_18= ruleAndar | this_Parar_19= ruleParar ) )
            // InternalOiArdubot.g:233:2: (this_Se_0= ruleSe | this_VariavelExistente_1= ruleVariavelExistente | this_Tela_2= ruleTela | this_Ligar_3= ruleLigar | this_Desligar_4= ruleDesligar | this_Bip_5= ruleBip | this_Escolha_6= ruleEscolha | this_Para_7= rulePara | this_Enquanto_8= ruleEnquanto | this_Repita_9= ruleRepita | this_Ler_10= ruleLer | this_Servo_11= ruleServo | this_MotorDC_12= ruleMotorDC | this_Funcao_13= ruleFuncao | this_Espera_14= ruleEspera | this_Escrever_15= ruleEscrever | this_LerDigital_16= ruleLerDigital | this_LerAnalogica_17= ruleLerAnalogica | this_Andar_18= ruleAndar | this_Parar_19= ruleParar )
            {
            // InternalOiArdubot.g:233:2: (this_Se_0= ruleSe | this_VariavelExistente_1= ruleVariavelExistente | this_Tela_2= ruleTela | this_Ligar_3= ruleLigar | this_Desligar_4= ruleDesligar | this_Bip_5= ruleBip | this_Escolha_6= ruleEscolha | this_Para_7= rulePara | this_Enquanto_8= ruleEnquanto | this_Repita_9= ruleRepita | this_Ler_10= ruleLer | this_Servo_11= ruleServo | this_MotorDC_12= ruleMotorDC | this_Funcao_13= ruleFuncao | this_Espera_14= ruleEspera | this_Escrever_15= ruleEscrever | this_LerDigital_16= ruleLerDigital | this_LerAnalogica_17= ruleLerAnalogica | this_Andar_18= ruleAndar | this_Parar_19= ruleParar )
            int alt6=20;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalOiArdubot.g:234:3: this_Se_0= ruleSe
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getSeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Se_0=ruleSe();

                    state._fsp--;


                    			current = this_Se_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:243:3: this_VariavelExistente_1= ruleVariavelExistente
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getVariavelExistenteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariavelExistente_1=ruleVariavelExistente();

                    state._fsp--;


                    			current = this_VariavelExistente_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOiArdubot.g:252:3: this_Tela_2= ruleTela
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getTelaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tela_2=ruleTela();

                    state._fsp--;


                    			current = this_Tela_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOiArdubot.g:261:3: this_Ligar_3= ruleLigar
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getLigarParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ligar_3=ruleLigar();

                    state._fsp--;


                    			current = this_Ligar_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOiArdubot.g:270:3: this_Desligar_4= ruleDesligar
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getDesligarParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Desligar_4=ruleDesligar();

                    state._fsp--;


                    			current = this_Desligar_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOiArdubot.g:279:3: this_Bip_5= ruleBip
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getBipParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bip_5=ruleBip();

                    state._fsp--;


                    			current = this_Bip_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOiArdubot.g:288:3: this_Escolha_6= ruleEscolha
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getEscolhaParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Escolha_6=ruleEscolha();

                    state._fsp--;


                    			current = this_Escolha_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOiArdubot.g:297:3: this_Para_7= rulePara
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getParaParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Para_7=rulePara();

                    state._fsp--;


                    			current = this_Para_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalOiArdubot.g:306:3: this_Enquanto_8= ruleEnquanto
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getEnquantoParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enquanto_8=ruleEnquanto();

                    state._fsp--;


                    			current = this_Enquanto_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalOiArdubot.g:315:3: this_Repita_9= ruleRepita
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getRepitaParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repita_9=ruleRepita();

                    state._fsp--;


                    			current = this_Repita_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalOiArdubot.g:324:3: this_Ler_10= ruleLer
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getLerParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ler_10=ruleLer();

                    state._fsp--;


                    			current = this_Ler_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalOiArdubot.g:333:3: this_Servo_11= ruleServo
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getServoParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Servo_11=ruleServo();

                    state._fsp--;


                    			current = this_Servo_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalOiArdubot.g:342:3: this_MotorDC_12= ruleMotorDC
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getMotorDCParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_MotorDC_12=ruleMotorDC();

                    state._fsp--;


                    			current = this_MotorDC_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalOiArdubot.g:351:3: this_Funcao_13= ruleFuncao
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getFuncaoParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Funcao_13=ruleFuncao();

                    state._fsp--;


                    			current = this_Funcao_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalOiArdubot.g:360:3: this_Espera_14= ruleEspera
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getEsperaParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_Espera_14=ruleEspera();

                    state._fsp--;


                    			current = this_Espera_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalOiArdubot.g:369:3: this_Escrever_15= ruleEscrever
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getEscreverParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_Escrever_15=ruleEscrever();

                    state._fsp--;


                    			current = this_Escrever_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalOiArdubot.g:378:3: this_LerDigital_16= ruleLerDigital
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getLerDigitalParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_LerDigital_16=ruleLerDigital();

                    state._fsp--;


                    			current = this_LerDigital_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalOiArdubot.g:387:3: this_LerAnalogica_17= ruleLerAnalogica
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getLerAnalogicaParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_LerAnalogica_17=ruleLerAnalogica();

                    state._fsp--;


                    			current = this_LerAnalogica_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalOiArdubot.g:396:3: this_Andar_18= ruleAndar
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getAndarParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_Andar_18=ruleAndar();

                    state._fsp--;


                    			current = this_Andar_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalOiArdubot.g:405:3: this_Parar_19= ruleParar
                    {

                    			newCompositeNode(grammarAccess.getImplementacaoAccess().getPararParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parar_19=ruleParar();

                    state._fsp--;


                    			current = this_Parar_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementacao"


    // $ANTLR start "entryRulePorta"
    // InternalOiArdubot.g:417:1: entryRulePorta returns [EObject current=null] : iv_rulePorta= rulePorta EOF ;
    public final EObject entryRulePorta() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePorta = null;


        try {
            // InternalOiArdubot.g:417:46: (iv_rulePorta= rulePorta EOF )
            // InternalOiArdubot.g:418:2: iv_rulePorta= rulePorta EOF
            {
             newCompositeNode(grammarAccess.getPortaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePorta=rulePorta();

            state._fsp--;

             current =iv_rulePorta; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePorta"


    // $ANTLR start "rulePorta"
    // InternalOiArdubot.g:424:1: rulePorta returns [EObject current=null] : ( ( (lv_name_0_1= rulePortaDigital | lv_name_0_2= rulePortaAnalogica ) ) ) ;
    public final EObject rulePorta() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_1 = null;

        EObject lv_name_0_2 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:430:2: ( ( ( (lv_name_0_1= rulePortaDigital | lv_name_0_2= rulePortaAnalogica ) ) ) )
            // InternalOiArdubot.g:431:2: ( ( (lv_name_0_1= rulePortaDigital | lv_name_0_2= rulePortaAnalogica ) ) )
            {
            // InternalOiArdubot.g:431:2: ( ( (lv_name_0_1= rulePortaDigital | lv_name_0_2= rulePortaAnalogica ) ) )
            // InternalOiArdubot.g:432:3: ( (lv_name_0_1= rulePortaDigital | lv_name_0_2= rulePortaAnalogica ) )
            {
            // InternalOiArdubot.g:432:3: ( (lv_name_0_1= rulePortaDigital | lv_name_0_2= rulePortaAnalogica ) )
            // InternalOiArdubot.g:433:4: (lv_name_0_1= rulePortaDigital | lv_name_0_2= rulePortaAnalogica )
            {
            // InternalOiArdubot.g:433:4: (lv_name_0_1= rulePortaDigital | lv_name_0_2= rulePortaAnalogica )
            int alt7=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case RULE_ANALOGICA:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalOiArdubot.g:434:5: lv_name_0_1= rulePortaDigital
                    {

                    					newCompositeNode(grammarAccess.getPortaAccess().getNamePortaDigitalParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_1=rulePortaDigital();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPortaRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"br.edu.utfpr.oiardubot.OiArdubot.PortaDigital");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:450:5: lv_name_0_2= rulePortaAnalogica
                    {

                    					newCompositeNode(grammarAccess.getPortaAccess().getNamePortaAnalogicaParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_2=rulePortaAnalogica();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPortaRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_2,
                    						"br.edu.utfpr.oiardubot.OiArdubot.PortaAnalogica");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePorta"


    // $ANTLR start "entryRulePortaAnalogica"
    // InternalOiArdubot.g:471:1: entryRulePortaAnalogica returns [EObject current=null] : iv_rulePortaAnalogica= rulePortaAnalogica EOF ;
    public final EObject entryRulePortaAnalogica() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortaAnalogica = null;


        try {
            // InternalOiArdubot.g:471:55: (iv_rulePortaAnalogica= rulePortaAnalogica EOF )
            // InternalOiArdubot.g:472:2: iv_rulePortaAnalogica= rulePortaAnalogica EOF
            {
             newCompositeNode(grammarAccess.getPortaAnalogicaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortaAnalogica=rulePortaAnalogica();

            state._fsp--;

             current =iv_rulePortaAnalogica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePortaAnalogica"


    // $ANTLR start "rulePortaAnalogica"
    // InternalOiArdubot.g:478:1: rulePortaAnalogica returns [EObject current=null] : ( (lv_valor_0_0= ruleAnalogicaOuId ) ) ;
    public final EObject rulePortaAnalogica() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:484:2: ( ( (lv_valor_0_0= ruleAnalogicaOuId ) ) )
            // InternalOiArdubot.g:485:2: ( (lv_valor_0_0= ruleAnalogicaOuId ) )
            {
            // InternalOiArdubot.g:485:2: ( (lv_valor_0_0= ruleAnalogicaOuId ) )
            // InternalOiArdubot.g:486:3: (lv_valor_0_0= ruleAnalogicaOuId )
            {
            // InternalOiArdubot.g:486:3: (lv_valor_0_0= ruleAnalogicaOuId )
            // InternalOiArdubot.g:487:4: lv_valor_0_0= ruleAnalogicaOuId
            {

            				newCompositeNode(grammarAccess.getPortaAnalogicaAccess().getValorAnalogicaOuIdParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_valor_0_0=ruleAnalogicaOuId();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPortaAnalogicaRule());
            				}
            				set(
            					current,
            					"valor",
            					lv_valor_0_0,
            					"br.edu.utfpr.oiardubot.OiArdubot.AnalogicaOuId");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortaAnalogica"


    // $ANTLR start "entryRuleAnalogicaOuId"
    // InternalOiArdubot.g:507:1: entryRuleAnalogicaOuId returns [String current=null] : iv_ruleAnalogicaOuId= ruleAnalogicaOuId EOF ;
    public final String entryRuleAnalogicaOuId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnalogicaOuId = null;


        try {
            // InternalOiArdubot.g:507:53: (iv_ruleAnalogicaOuId= ruleAnalogicaOuId EOF )
            // InternalOiArdubot.g:508:2: iv_ruleAnalogicaOuId= ruleAnalogicaOuId EOF
            {
             newCompositeNode(grammarAccess.getAnalogicaOuIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalogicaOuId=ruleAnalogicaOuId();

            state._fsp--;

             current =iv_ruleAnalogicaOuId.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalogicaOuId"


    // $ANTLR start "ruleAnalogicaOuId"
    // InternalOiArdubot.g:514:1: ruleAnalogicaOuId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANALOGICA_0= RULE_ANALOGICA | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAnalogicaOuId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANALOGICA_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:520:2: ( (this_ANALOGICA_0= RULE_ANALOGICA | this_ID_1= RULE_ID ) )
            // InternalOiArdubot.g:521:2: (this_ANALOGICA_0= RULE_ANALOGICA | this_ID_1= RULE_ID )
            {
            // InternalOiArdubot.g:521:2: (this_ANALOGICA_0= RULE_ANALOGICA | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ANALOGICA) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOiArdubot.g:522:3: this_ANALOGICA_0= RULE_ANALOGICA
                    {
                    this_ANALOGICA_0=(Token)match(input,RULE_ANALOGICA,FOLLOW_2); 

                    			current.merge(this_ANALOGICA_0);
                    		

                    			newLeafNode(this_ANALOGICA_0, grammarAccess.getAnalogicaOuIdAccess().getANALOGICATerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:530:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getAnalogicaOuIdAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalogicaOuId"


    // $ANTLR start "entryRulePortaDigital"
    // InternalOiArdubot.g:541:1: entryRulePortaDigital returns [EObject current=null] : iv_rulePortaDigital= rulePortaDigital EOF ;
    public final EObject entryRulePortaDigital() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortaDigital = null;


        try {
            // InternalOiArdubot.g:541:53: (iv_rulePortaDigital= rulePortaDigital EOF )
            // InternalOiArdubot.g:542:2: iv_rulePortaDigital= rulePortaDigital EOF
            {
             newCompositeNode(grammarAccess.getPortaDigitalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortaDigital=rulePortaDigital();

            state._fsp--;

             current =iv_rulePortaDigital; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePortaDigital"


    // $ANTLR start "rulePortaDigital"
    // InternalOiArdubot.g:548:1: rulePortaDigital returns [EObject current=null] : ( (lv_valor_0_0= ruleDigitalOuId ) ) ;
    public final EObject rulePortaDigital() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_0_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:554:2: ( ( (lv_valor_0_0= ruleDigitalOuId ) ) )
            // InternalOiArdubot.g:555:2: ( (lv_valor_0_0= ruleDigitalOuId ) )
            {
            // InternalOiArdubot.g:555:2: ( (lv_valor_0_0= ruleDigitalOuId ) )
            // InternalOiArdubot.g:556:3: (lv_valor_0_0= ruleDigitalOuId )
            {
            // InternalOiArdubot.g:556:3: (lv_valor_0_0= ruleDigitalOuId )
            // InternalOiArdubot.g:557:4: lv_valor_0_0= ruleDigitalOuId
            {

            				newCompositeNode(grammarAccess.getPortaDigitalAccess().getValorDigitalOuIdParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_valor_0_0=ruleDigitalOuId();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPortaDigitalRule());
            				}
            				set(
            					current,
            					"valor",
            					lv_valor_0_0,
            					"br.edu.utfpr.oiardubot.OiArdubot.DigitalOuId");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortaDigital"


    // $ANTLR start "entryRuleDigitalOuId"
    // InternalOiArdubot.g:577:1: entryRuleDigitalOuId returns [String current=null] : iv_ruleDigitalOuId= ruleDigitalOuId EOF ;
    public final String entryRuleDigitalOuId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDigitalOuId = null;


        try {
            // InternalOiArdubot.g:577:51: (iv_ruleDigitalOuId= ruleDigitalOuId EOF )
            // InternalOiArdubot.g:578:2: iv_ruleDigitalOuId= ruleDigitalOuId EOF
            {
             newCompositeNode(grammarAccess.getDigitalOuIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDigitalOuId=ruleDigitalOuId();

            state._fsp--;

             current =iv_ruleDigitalOuId.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDigitalOuId"


    // $ANTLR start "ruleDigitalOuId"
    // InternalOiArdubot.g:584:1: ruleDigitalOuId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDigitalOuId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:590:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) )
            // InternalOiArdubot.g:591:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            {
            // InternalOiArdubot.g:591:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOiArdubot.g:592:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getDigitalOuIdAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:600:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getDigitalOuIdAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDigitalOuId"


    // $ANTLR start "entryRuleReceberValor"
    // InternalOiArdubot.g:611:1: entryRuleReceberValor returns [EObject current=null] : iv_ruleReceberValor= ruleReceberValor EOF ;
    public final EObject entryRuleReceberValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceberValor = null;


        try {
            // InternalOiArdubot.g:611:53: (iv_ruleReceberValor= ruleReceberValor EOF )
            // InternalOiArdubot.g:612:2: iv_ruleReceberValor= ruleReceberValor EOF
            {
             newCompositeNode(grammarAccess.getReceberValorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReceberValor=ruleReceberValor();

            state._fsp--;

             current =iv_ruleReceberValor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReceberValor"


    // $ANTLR start "ruleReceberValor"
    // InternalOiArdubot.g:618:1: ruleReceberValor returns [EObject current=null] : ( ( (lv_tipo_0_1= ruleExistenteVariavelRecebe | lv_tipo_0_2= ruleNovaVariavelRecebe ) ) ) ;
    public final EObject ruleReceberValor() throws RecognitionException {
        EObject current = null;

        EObject lv_tipo_0_1 = null;

        EObject lv_tipo_0_2 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:624:2: ( ( ( (lv_tipo_0_1= ruleExistenteVariavelRecebe | lv_tipo_0_2= ruleNovaVariavelRecebe ) ) ) )
            // InternalOiArdubot.g:625:2: ( ( (lv_tipo_0_1= ruleExistenteVariavelRecebe | lv_tipo_0_2= ruleNovaVariavelRecebe ) ) )
            {
            // InternalOiArdubot.g:625:2: ( ( (lv_tipo_0_1= ruleExistenteVariavelRecebe | lv_tipo_0_2= ruleNovaVariavelRecebe ) ) )
            // InternalOiArdubot.g:626:3: ( (lv_tipo_0_1= ruleExistenteVariavelRecebe | lv_tipo_0_2= ruleNovaVariavelRecebe ) )
            {
            // InternalOiArdubot.g:626:3: ( (lv_tipo_0_1= ruleExistenteVariavelRecebe | lv_tipo_0_2= ruleNovaVariavelRecebe ) )
            // InternalOiArdubot.g:627:4: (lv_tipo_0_1= ruleExistenteVariavelRecebe | lv_tipo_0_2= ruleNovaVariavelRecebe )
            {
            // InternalOiArdubot.g:627:4: (lv_tipo_0_1= ruleExistenteVariavelRecebe | lv_tipo_0_2= ruleNovaVariavelRecebe )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=66 && LA10_0<=67)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOiArdubot.g:628:5: lv_tipo_0_1= ruleExistenteVariavelRecebe
                    {

                    					newCompositeNode(grammarAccess.getReceberValorAccess().getTipoExistenteVariavelRecebeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tipo_0_1=ruleExistenteVariavelRecebe();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReceberValorRule());
                    					}
                    					set(
                    						current,
                    						"tipo",
                    						lv_tipo_0_1,
                    						"br.edu.utfpr.oiardubot.OiArdubot.ExistenteVariavelRecebe");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:644:5: lv_tipo_0_2= ruleNovaVariavelRecebe
                    {

                    					newCompositeNode(grammarAccess.getReceberValorAccess().getTipoNovaVariavelRecebeParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tipo_0_2=ruleNovaVariavelRecebe();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReceberValorRule());
                    					}
                    					set(
                    						current,
                    						"tipo",
                    						lv_tipo_0_2,
                    						"br.edu.utfpr.oiardubot.OiArdubot.NovaVariavelRecebe");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReceberValor"


    // $ANTLR start "entryRuleExistenteVariavelRecebe"
    // InternalOiArdubot.g:665:1: entryRuleExistenteVariavelRecebe returns [EObject current=null] : iv_ruleExistenteVariavelRecebe= ruleExistenteVariavelRecebe EOF ;
    public final EObject entryRuleExistenteVariavelRecebe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistenteVariavelRecebe = null;


        try {
            // InternalOiArdubot.g:665:64: (iv_ruleExistenteVariavelRecebe= ruleExistenteVariavelRecebe EOF )
            // InternalOiArdubot.g:666:2: iv_ruleExistenteVariavelRecebe= ruleExistenteVariavelRecebe EOF
            {
             newCompositeNode(grammarAccess.getExistenteVariavelRecebeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistenteVariavelRecebe=ruleExistenteVariavelRecebe();

            state._fsp--;

             current =iv_ruleExistenteVariavelRecebe; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistenteVariavelRecebe"


    // $ANTLR start "ruleExistenteVariavelRecebe"
    // InternalOiArdubot.g:672:1: ruleExistenteVariavelRecebe returns [EObject current=null] : ( ( (lv_name_0_0= ruleValorReferencia ) ) otherlv_1= '<-' ) ;
    public final EObject ruleExistenteVariavelRecebe() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:678:2: ( ( ( (lv_name_0_0= ruleValorReferencia ) ) otherlv_1= '<-' ) )
            // InternalOiArdubot.g:679:2: ( ( (lv_name_0_0= ruleValorReferencia ) ) otherlv_1= '<-' )
            {
            // InternalOiArdubot.g:679:2: ( ( (lv_name_0_0= ruleValorReferencia ) ) otherlv_1= '<-' )
            // InternalOiArdubot.g:680:3: ( (lv_name_0_0= ruleValorReferencia ) ) otherlv_1= '<-'
            {
            // InternalOiArdubot.g:680:3: ( (lv_name_0_0= ruleValorReferencia ) )
            // InternalOiArdubot.g:681:4: (lv_name_0_0= ruleValorReferencia )
            {
            // InternalOiArdubot.g:681:4: (lv_name_0_0= ruleValorReferencia )
            // InternalOiArdubot.g:682:5: lv_name_0_0= ruleValorReferencia
            {

            					newCompositeNode(grammarAccess.getExistenteVariavelRecebeAccess().getNameValorReferenciaParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_0_0=ruleValorReferencia();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExistenteVariavelRecebeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.ValorReferencia");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getExistenteVariavelRecebeAccess().getLessThanSignHyphenMinusKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistenteVariavelRecebe"


    // $ANTLR start "entryRuleValorReferencia"
    // InternalOiArdubot.g:707:1: entryRuleValorReferencia returns [String current=null] : iv_ruleValorReferencia= ruleValorReferencia EOF ;
    public final String entryRuleValorReferencia() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValorReferencia = null;


        try {
            // InternalOiArdubot.g:707:55: (iv_ruleValorReferencia= ruleValorReferencia EOF )
            // InternalOiArdubot.g:708:2: iv_ruleValorReferencia= ruleValorReferencia EOF
            {
             newCompositeNode(grammarAccess.getValorReferenciaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValorReferencia=ruleValorReferencia();

            state._fsp--;

             current =iv_ruleValorReferencia.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValorReferencia"


    // $ANTLR start "ruleValorReferencia"
    // InternalOiArdubot.g:714:1: ruleValorReferencia returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValorReferencia() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:720:2: (this_ID_0= RULE_ID )
            // InternalOiArdubot.g:721:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getValorReferenciaAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValorReferencia"


    // $ANTLR start "entryRuleNovaVariavelRecebe"
    // InternalOiArdubot.g:731:1: entryRuleNovaVariavelRecebe returns [EObject current=null] : iv_ruleNovaVariavelRecebe= ruleNovaVariavelRecebe EOF ;
    public final EObject entryRuleNovaVariavelRecebe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNovaVariavelRecebe = null;


        try {
            // InternalOiArdubot.g:731:59: (iv_ruleNovaVariavelRecebe= ruleNovaVariavelRecebe EOF )
            // InternalOiArdubot.g:732:2: iv_ruleNovaVariavelRecebe= ruleNovaVariavelRecebe EOF
            {
             newCompositeNode(grammarAccess.getNovaVariavelRecebeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNovaVariavelRecebe=ruleNovaVariavelRecebe();

            state._fsp--;

             current =iv_ruleNovaVariavelRecebe; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNovaVariavelRecebe"


    // $ANTLR start "ruleNovaVariavelRecebe"
    // InternalOiArdubot.g:738:1: ruleNovaVariavelRecebe returns [EObject current=null] : (this_VariavelNome_0= ruleVariavelNome otherlv_1= '<-' ) ;
    public final EObject ruleNovaVariavelRecebe() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_VariavelNome_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:744:2: ( (this_VariavelNome_0= ruleVariavelNome otherlv_1= '<-' ) )
            // InternalOiArdubot.g:745:2: (this_VariavelNome_0= ruleVariavelNome otherlv_1= '<-' )
            {
            // InternalOiArdubot.g:745:2: (this_VariavelNome_0= ruleVariavelNome otherlv_1= '<-' )
            // InternalOiArdubot.g:746:3: this_VariavelNome_0= ruleVariavelNome otherlv_1= '<-'
            {

            			newCompositeNode(grammarAccess.getNovaVariavelRecebeAccess().getVariavelNomeParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_VariavelNome_0=ruleVariavelNome();

            state._fsp--;


            			current = this_VariavelNome_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNovaVariavelRecebeAccess().getLessThanSignHyphenMinusKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNovaVariavelRecebe"


    // $ANTLR start "entryRuleVariavelNome"
    // InternalOiArdubot.g:762:1: entryRuleVariavelNome returns [EObject current=null] : iv_ruleVariavelNome= ruleVariavelNome EOF ;
    public final EObject entryRuleVariavelNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariavelNome = null;


        try {
            // InternalOiArdubot.g:762:53: (iv_ruleVariavelNome= ruleVariavelNome EOF )
            // InternalOiArdubot.g:763:2: iv_ruleVariavelNome= ruleVariavelNome EOF
            {
             newCompositeNode(grammarAccess.getVariavelNomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariavelNome=ruleVariavelNome();

            state._fsp--;

             current =iv_ruleVariavelNome; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariavelNome"


    // $ANTLR start "ruleVariavelNome"
    // InternalOiArdubot.g:769:1: ruleVariavelNome returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariavelNome() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_tipo_0_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:775:2: ( ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalOiArdubot.g:776:2: ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalOiArdubot.g:776:2: ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalOiArdubot.g:777:3: ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalOiArdubot.g:777:3: ( (lv_tipo_0_0= ruleTipo ) )
            // InternalOiArdubot.g:778:4: (lv_tipo_0_0= ruleTipo )
            {
            // InternalOiArdubot.g:778:4: (lv_tipo_0_0= ruleTipo )
            // InternalOiArdubot.g:779:5: lv_tipo_0_0= ruleTipo
            {

            					newCompositeNode(grammarAccess.getVariavelNomeAccess().getTipoTipoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_tipo_0_0=ruleTipo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariavelNomeRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Tipo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:796:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOiArdubot.g:797:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOiArdubot.g:797:4: (lv_name_1_0= RULE_ID )
            // InternalOiArdubot.g:798:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariavelNomeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariavelNomeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariavelNome"


    // $ANTLR start "entryRuleVariavelOuPorta"
    // InternalOiArdubot.g:818:1: entryRuleVariavelOuPorta returns [EObject current=null] : iv_ruleVariavelOuPorta= ruleVariavelOuPorta EOF ;
    public final EObject entryRuleVariavelOuPorta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariavelOuPorta = null;


        try {
            // InternalOiArdubot.g:818:56: (iv_ruleVariavelOuPorta= ruleVariavelOuPorta EOF )
            // InternalOiArdubot.g:819:2: iv_ruleVariavelOuPorta= ruleVariavelOuPorta EOF
            {
             newCompositeNode(grammarAccess.getVariavelOuPortaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariavelOuPorta=ruleVariavelOuPorta();

            state._fsp--;

             current =iv_ruleVariavelOuPorta; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariavelOuPorta"


    // $ANTLR start "ruleVariavelOuPorta"
    // InternalOiArdubot.g:825:1: ruleVariavelOuPorta returns [EObject current=null] : ( (lv_name_0_0= rulePorta ) ) ;
    public final EObject ruleVariavelOuPorta() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:831:2: ( ( (lv_name_0_0= rulePorta ) ) )
            // InternalOiArdubot.g:832:2: ( (lv_name_0_0= rulePorta ) )
            {
            // InternalOiArdubot.g:832:2: ( (lv_name_0_0= rulePorta ) )
            // InternalOiArdubot.g:833:3: (lv_name_0_0= rulePorta )
            {
            // InternalOiArdubot.g:833:3: (lv_name_0_0= rulePorta )
            // InternalOiArdubot.g:834:4: lv_name_0_0= rulePorta
            {

            				newCompositeNode(grammarAccess.getVariavelOuPortaAccess().getNamePortaParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=rulePorta();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getVariavelOuPortaRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"br.edu.utfpr.oiardubot.OiArdubot.Porta");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariavelOuPorta"


    // $ANTLR start "entryRuleVariavelOuNumero"
    // InternalOiArdubot.g:854:1: entryRuleVariavelOuNumero returns [String current=null] : iv_ruleVariavelOuNumero= ruleVariavelOuNumero EOF ;
    public final String entryRuleVariavelOuNumero() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariavelOuNumero = null;


        try {
            // InternalOiArdubot.g:854:56: (iv_ruleVariavelOuNumero= ruleVariavelOuNumero EOF )
            // InternalOiArdubot.g:855:2: iv_ruleVariavelOuNumero= ruleVariavelOuNumero EOF
            {
             newCompositeNode(grammarAccess.getVariavelOuNumeroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariavelOuNumero=ruleVariavelOuNumero();

            state._fsp--;

             current =iv_ruleVariavelOuNumero.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariavelOuNumero"


    // $ANTLR start "ruleVariavelOuNumero"
    // InternalOiArdubot.g:861:1: ruleVariavelOuNumero returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleVariavelOuNumero() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:867:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // InternalOiArdubot.g:868:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // InternalOiArdubot.g:868:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalOiArdubot.g:869:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getVariavelOuNumeroAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:877:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getVariavelOuNumeroAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariavelOuNumero"


    // $ANTLR start "entryRuleNome"
    // InternalOiArdubot.g:888:1: entryRuleNome returns [EObject current=null] : iv_ruleNome= ruleNome EOF ;
    public final EObject entryRuleNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNome = null;


        try {
            // InternalOiArdubot.g:888:45: (iv_ruleNome= ruleNome EOF )
            // InternalOiArdubot.g:889:2: iv_ruleNome= ruleNome EOF
            {
             newCompositeNode(grammarAccess.getNomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNome=ruleNome();

            state._fsp--;

             current =iv_ruleNome; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNome"


    // $ANTLR start "ruleNome"
    // InternalOiArdubot.g:895:1: ruleNome returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNome() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:901:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalOiArdubot.g:902:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalOiArdubot.g:902:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalOiArdubot.g:903:3: (lv_name_0_0= RULE_ID )
            {
            // InternalOiArdubot.g:903:3: (lv_name_0_0= RULE_ID )
            // InternalOiArdubot.g:904:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getNomeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNomeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNome"


    // $ANTLR start "entryRuleConteudoEscrever"
    // InternalOiArdubot.g:923:1: entryRuleConteudoEscrever returns [EObject current=null] : iv_ruleConteudoEscrever= ruleConteudoEscrever EOF ;
    public final EObject entryRuleConteudoEscrever() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConteudoEscrever = null;


        try {
            // InternalOiArdubot.g:923:57: (iv_ruleConteudoEscrever= ruleConteudoEscrever EOF )
            // InternalOiArdubot.g:924:2: iv_ruleConteudoEscrever= ruleConteudoEscrever EOF
            {
             newCompositeNode(grammarAccess.getConteudoEscreverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConteudoEscrever=ruleConteudoEscrever();

            state._fsp--;

             current =iv_ruleConteudoEscrever; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConteudoEscrever"


    // $ANTLR start "ruleConteudoEscrever"
    // InternalOiArdubot.g:930:1: ruleConteudoEscrever returns [EObject current=null] : (this_Nome_0= ruleNome | this_Texto_1= ruleTexto | this_Inteiro_2= ruleInteiro ) ;
    public final EObject ruleConteudoEscrever() throws RecognitionException {
        EObject current = null;

        EObject this_Nome_0 = null;

        EObject this_Texto_1 = null;

        EObject this_Inteiro_2 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:936:2: ( (this_Nome_0= ruleNome | this_Texto_1= ruleTexto | this_Inteiro_2= ruleInteiro ) )
            // InternalOiArdubot.g:937:2: (this_Nome_0= ruleNome | this_Texto_1= ruleTexto | this_Inteiro_2= ruleInteiro )
            {
            // InternalOiArdubot.g:937:2: (this_Nome_0= ruleNome | this_Texto_1= ruleTexto | this_Inteiro_2= ruleInteiro )
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
                    // InternalOiArdubot.g:938:3: this_Nome_0= ruleNome
                    {

                    			newCompositeNode(grammarAccess.getConteudoEscreverAccess().getNomeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Nome_0=ruleNome();

                    state._fsp--;


                    			current = this_Nome_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:947:3: this_Texto_1= ruleTexto
                    {

                    			newCompositeNode(grammarAccess.getConteudoEscreverAccess().getTextoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Texto_1=ruleTexto();

                    state._fsp--;


                    			current = this_Texto_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOiArdubot.g:956:3: this_Inteiro_2= ruleInteiro
                    {

                    			newCompositeNode(grammarAccess.getConteudoEscreverAccess().getInteiroParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Inteiro_2=ruleInteiro();

                    state._fsp--;


                    			current = this_Inteiro_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConteudoEscrever"


    // $ANTLR start "entryRuleTexto"
    // InternalOiArdubot.g:968:1: entryRuleTexto returns [EObject current=null] : iv_ruleTexto= ruleTexto EOF ;
    public final EObject entryRuleTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexto = null;


        try {
            // InternalOiArdubot.g:968:46: (iv_ruleTexto= ruleTexto EOF )
            // InternalOiArdubot.g:969:2: iv_ruleTexto= ruleTexto EOF
            {
             newCompositeNode(grammarAccess.getTextoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTexto=ruleTexto();

            state._fsp--;

             current =iv_ruleTexto; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTexto"


    // $ANTLR start "ruleTexto"
    // InternalOiArdubot.g:975:1: ruleTexto returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleTexto() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:981:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalOiArdubot.g:982:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalOiArdubot.g:982:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalOiArdubot.g:983:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalOiArdubot.g:983:3: (lv_name_0_0= RULE_STRING )
            // InternalOiArdubot.g:984:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTextoAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextoRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTexto"


    // $ANTLR start "entryRuleInteiro"
    // InternalOiArdubot.g:1003:1: entryRuleInteiro returns [EObject current=null] : iv_ruleInteiro= ruleInteiro EOF ;
    public final EObject entryRuleInteiro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteiro = null;


        try {
            // InternalOiArdubot.g:1003:48: (iv_ruleInteiro= ruleInteiro EOF )
            // InternalOiArdubot.g:1004:2: iv_ruleInteiro= ruleInteiro EOF
            {
             newCompositeNode(grammarAccess.getInteiroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteiro=ruleInteiro();

            state._fsp--;

             current =iv_ruleInteiro; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteiro"


    // $ANTLR start "ruleInteiro"
    // InternalOiArdubot.g:1010:1: ruleInteiro returns [EObject current=null] : ( (lv_name_0_0= RULE_INT ) ) ;
    public final EObject ruleInteiro() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:1016:2: ( ( (lv_name_0_0= RULE_INT ) ) )
            // InternalOiArdubot.g:1017:2: ( (lv_name_0_0= RULE_INT ) )
            {
            // InternalOiArdubot.g:1017:2: ( (lv_name_0_0= RULE_INT ) )
            // InternalOiArdubot.g:1018:3: (lv_name_0_0= RULE_INT )
            {
            // InternalOiArdubot.g:1018:3: (lv_name_0_0= RULE_INT )
            // InternalOiArdubot.g:1019:4: lv_name_0_0= RULE_INT
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getInteiroAccess().getNameINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInteiroRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteiro"


    // $ANTLR start "entryRuleTextoOuNumero"
    // InternalOiArdubot.g:1038:1: entryRuleTextoOuNumero returns [String current=null] : iv_ruleTextoOuNumero= ruleTextoOuNumero EOF ;
    public final String entryRuleTextoOuNumero() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTextoOuNumero = null;


        try {
            // InternalOiArdubot.g:1038:53: (iv_ruleTextoOuNumero= ruleTextoOuNumero EOF )
            // InternalOiArdubot.g:1039:2: iv_ruleTextoOuNumero= ruleTextoOuNumero EOF
            {
             newCompositeNode(grammarAccess.getTextoOuNumeroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextoOuNumero=ruleTextoOuNumero();

            state._fsp--;

             current =iv_ruleTextoOuNumero.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextoOuNumero"


    // $ANTLR start "ruleTextoOuNumero"
    // InternalOiArdubot.g:1045:1: ruleTextoOuNumero returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleTextoOuNumero() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:1051:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT ) )
            // InternalOiArdubot.g:1052:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT )
            {
            // InternalOiArdubot.g:1052:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOiArdubot.g:1053:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getTextoOuNumeroAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1061:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getTextoOuNumeroAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextoOuNumero"


    // $ANTLR start "entryRuleValorLiteral"
    // InternalOiArdubot.g:1072:1: entryRuleValorLiteral returns [String current=null] : iv_ruleValorLiteral= ruleValorLiteral EOF ;
    public final String entryRuleValorLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValorLiteral = null;


        try {
            // InternalOiArdubot.g:1072:52: (iv_ruleValorLiteral= ruleValorLiteral EOF )
            // InternalOiArdubot.g:1073:2: iv_ruleValorLiteral= ruleValorLiteral EOF
            {
             newCompositeNode(grammarAccess.getValorLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValorLiteral=ruleValorLiteral();

            state._fsp--;

             current =iv_ruleValorLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValorLiteral"


    // $ANTLR start "ruleValorLiteral"
    // InternalOiArdubot.g:1079:1: ruleValorLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TextoOuNumero_0= ruleTextoOuNumero | this_ANALOGICA_1= RULE_ANALOGICA ) ;
    public final AntlrDatatypeRuleToken ruleValorLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANALOGICA_1=null;
        AntlrDatatypeRuleToken this_TextoOuNumero_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1085:2: ( (this_TextoOuNumero_0= ruleTextoOuNumero | this_ANALOGICA_1= RULE_ANALOGICA ) )
            // InternalOiArdubot.g:1086:2: (this_TextoOuNumero_0= ruleTextoOuNumero | this_ANALOGICA_1= RULE_ANALOGICA )
            {
            // InternalOiArdubot.g:1086:2: (this_TextoOuNumero_0= ruleTextoOuNumero | this_ANALOGICA_1= RULE_ANALOGICA )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_STRING)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ANALOGICA) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalOiArdubot.g:1087:3: this_TextoOuNumero_0= ruleTextoOuNumero
                    {

                    			newCompositeNode(grammarAccess.getValorLiteralAccess().getTextoOuNumeroParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextoOuNumero_0=ruleTextoOuNumero();

                    state._fsp--;


                    			current.merge(this_TextoOuNumero_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1098:3: this_ANALOGICA_1= RULE_ANALOGICA
                    {
                    this_ANALOGICA_1=(Token)match(input,RULE_ANALOGICA,FOLLOW_2); 

                    			current.merge(this_ANALOGICA_1);
                    		

                    			newLeafNode(this_ANALOGICA_1, grammarAccess.getValorLiteralAccess().getANALOGICATerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValorLiteral"


    // $ANTLR start "entryRuleVariavelValor"
    // InternalOiArdubot.g:1109:1: entryRuleVariavelValor returns [String current=null] : iv_ruleVariavelValor= ruleVariavelValor EOF ;
    public final String entryRuleVariavelValor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariavelValor = null;


        try {
            // InternalOiArdubot.g:1109:53: (iv_ruleVariavelValor= ruleVariavelValor EOF )
            // InternalOiArdubot.g:1110:2: iv_ruleVariavelValor= ruleVariavelValor EOF
            {
             newCompositeNode(grammarAccess.getVariavelValorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariavelValor=ruleVariavelValor();

            state._fsp--;

             current =iv_ruleVariavelValor.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariavelValor"


    // $ANTLR start "ruleVariavelValor"
    // InternalOiArdubot.g:1116:1: ruleVariavelValor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValorLiteral_0= ruleValorLiteral | this_ValorReferencia_1= ruleValorReferencia ) ;
    public final AntlrDatatypeRuleToken ruleVariavelValor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ValorLiteral_0 = null;

        AntlrDatatypeRuleToken this_ValorReferencia_1 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1122:2: ( (this_ValorLiteral_0= ruleValorLiteral | this_ValorReferencia_1= ruleValorReferencia ) )
            // InternalOiArdubot.g:1123:2: (this_ValorLiteral_0= ruleValorLiteral | this_ValorReferencia_1= ruleValorReferencia )
            {
            // InternalOiArdubot.g:1123:2: (this_ValorLiteral_0= ruleValorLiteral | this_ValorReferencia_1= ruleValorReferencia )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ANALOGICA||(LA15_0>=RULE_INT && LA15_0<=RULE_STRING)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalOiArdubot.g:1124:3: this_ValorLiteral_0= ruleValorLiteral
                    {

                    			newCompositeNode(grammarAccess.getVariavelValorAccess().getValorLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValorLiteral_0=ruleValorLiteral();

                    state._fsp--;


                    			current.merge(this_ValorLiteral_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1135:3: this_ValorReferencia_1= ruleValorReferencia
                    {

                    			newCompositeNode(grammarAccess.getVariavelValorAccess().getValorReferenciaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValorReferencia_1=ruleValorReferencia();

                    state._fsp--;


                    			current.merge(this_ValorReferencia_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariavelValor"


    // $ANTLR start "entryRuleDisplayValor"
    // InternalOiArdubot.g:1149:1: entryRuleDisplayValor returns [String current=null] : iv_ruleDisplayValor= ruleDisplayValor EOF ;
    public final String entryRuleDisplayValor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDisplayValor = null;


        try {
            // InternalOiArdubot.g:1149:52: (iv_ruleDisplayValor= ruleDisplayValor EOF )
            // InternalOiArdubot.g:1150:2: iv_ruleDisplayValor= ruleDisplayValor EOF
            {
             newCompositeNode(grammarAccess.getDisplayValorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisplayValor=ruleDisplayValor();

            state._fsp--;

             current =iv_ruleDisplayValor.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisplayValor"


    // $ANTLR start "ruleDisplayValor"
    // InternalOiArdubot.g:1156:1: ruleDisplayValor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDisplayValor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:1162:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
            // InternalOiArdubot.g:1163:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
            {
            // InternalOiArdubot.g:1163:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case RULE_INT:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalOiArdubot.g:1164:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getDisplayValorAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1172:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getDisplayValorAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOiArdubot.g:1180:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getDisplayValorAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisplayValor"


    // $ANTLR start "entryRuleVariavel"
    // InternalOiArdubot.g:1191:1: entryRuleVariavel returns [EObject current=null] : iv_ruleVariavel= ruleVariavel EOF ;
    public final EObject entryRuleVariavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariavel = null;


        try {
            // InternalOiArdubot.g:1191:49: (iv_ruleVariavel= ruleVariavel EOF )
            // InternalOiArdubot.g:1192:2: iv_ruleVariavel= ruleVariavel EOF
            {
             newCompositeNode(grammarAccess.getVariavelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariavel=ruleVariavel();

            state._fsp--;

             current =iv_ruleVariavel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariavel"


    // $ANTLR start "ruleVariavel"
    // InternalOiArdubot.g:1198:1: ruleVariavel returns [EObject current=null] : ( ( (lv_variavelNome_0_0= ruleVariavelNome ) ) (otherlv_1= '<-' ( (lv_valor_2_0= ruleVariavelValor ) ) )? otherlv_3= ';' ) ;
    public final EObject ruleVariavel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variavelNome_0_0 = null;

        AntlrDatatypeRuleToken lv_valor_2_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1204:2: ( ( ( (lv_variavelNome_0_0= ruleVariavelNome ) ) (otherlv_1= '<-' ( (lv_valor_2_0= ruleVariavelValor ) ) )? otherlv_3= ';' ) )
            // InternalOiArdubot.g:1205:2: ( ( (lv_variavelNome_0_0= ruleVariavelNome ) ) (otherlv_1= '<-' ( (lv_valor_2_0= ruleVariavelValor ) ) )? otherlv_3= ';' )
            {
            // InternalOiArdubot.g:1205:2: ( ( (lv_variavelNome_0_0= ruleVariavelNome ) ) (otherlv_1= '<-' ( (lv_valor_2_0= ruleVariavelValor ) ) )? otherlv_3= ';' )
            // InternalOiArdubot.g:1206:3: ( (lv_variavelNome_0_0= ruleVariavelNome ) ) (otherlv_1= '<-' ( (lv_valor_2_0= ruleVariavelValor ) ) )? otherlv_3= ';'
            {
            // InternalOiArdubot.g:1206:3: ( (lv_variavelNome_0_0= ruleVariavelNome ) )
            // InternalOiArdubot.g:1207:4: (lv_variavelNome_0_0= ruleVariavelNome )
            {
            // InternalOiArdubot.g:1207:4: (lv_variavelNome_0_0= ruleVariavelNome )
            // InternalOiArdubot.g:1208:5: lv_variavelNome_0_0= ruleVariavelNome
            {

            					newCompositeNode(grammarAccess.getVariavelAccess().getVariavelNomeVariavelNomeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_variavelNome_0_0=ruleVariavelNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariavelRule());
            					}
            					set(
            						current,
            						"variavelNome",
            						lv_variavelNome_0_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.VariavelNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:1225:3: (otherlv_1= '<-' ( (lv_valor_2_0= ruleVariavelValor ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOiArdubot.g:1226:4: otherlv_1= '<-' ( (lv_valor_2_0= ruleVariavelValor ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getVariavelAccess().getLessThanSignHyphenMinusKeyword_1_0());
                    			
                    // InternalOiArdubot.g:1230:4: ( (lv_valor_2_0= ruleVariavelValor ) )
                    // InternalOiArdubot.g:1231:5: (lv_valor_2_0= ruleVariavelValor )
                    {
                    // InternalOiArdubot.g:1231:5: (lv_valor_2_0= ruleVariavelValor )
                    // InternalOiArdubot.g:1232:6: lv_valor_2_0= ruleVariavelValor
                    {

                    						newCompositeNode(grammarAccess.getVariavelAccess().getValorVariavelValorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_valor_2_0=ruleVariavelValor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariavelRule());
                    						}
                    						set(
                    							current,
                    							"valor",
                    							lv_valor_2_0,
                    							"br.edu.utfpr.oiardubot.OiArdubot.VariavelValor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getVariavelAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariavel"


    // $ANTLR start "entryRuleVariavelExistente"
    // InternalOiArdubot.g:1258:1: entryRuleVariavelExistente returns [EObject current=null] : iv_ruleVariavelExistente= ruleVariavelExistente EOF ;
    public final EObject entryRuleVariavelExistente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariavelExistente = null;


        try {
            // InternalOiArdubot.g:1258:58: (iv_ruleVariavelExistente= ruleVariavelExistente EOF )
            // InternalOiArdubot.g:1259:2: iv_ruleVariavelExistente= ruleVariavelExistente EOF
            {
             newCompositeNode(grammarAccess.getVariavelExistenteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariavelExistente=ruleVariavelExistente();

            state._fsp--;

             current =iv_ruleVariavelExistente; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariavelExistente"


    // $ANTLR start "ruleVariavelExistente"
    // InternalOiArdubot.g:1265:1: ruleVariavelExistente returns [EObject current=null] : ( ( (lv_atribuicao_0_0= ruleExistenteVariavelRecebe ) ) ( (lv_valor_1_0= ruleVariavelValor ) ) otherlv_2= ';' ) ;
    public final EObject ruleVariavelExistente() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_atribuicao_0_0 = null;

        AntlrDatatypeRuleToken lv_valor_1_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1271:2: ( ( ( (lv_atribuicao_0_0= ruleExistenteVariavelRecebe ) ) ( (lv_valor_1_0= ruleVariavelValor ) ) otherlv_2= ';' ) )
            // InternalOiArdubot.g:1272:2: ( ( (lv_atribuicao_0_0= ruleExistenteVariavelRecebe ) ) ( (lv_valor_1_0= ruleVariavelValor ) ) otherlv_2= ';' )
            {
            // InternalOiArdubot.g:1272:2: ( ( (lv_atribuicao_0_0= ruleExistenteVariavelRecebe ) ) ( (lv_valor_1_0= ruleVariavelValor ) ) otherlv_2= ';' )
            // InternalOiArdubot.g:1273:3: ( (lv_atribuicao_0_0= ruleExistenteVariavelRecebe ) ) ( (lv_valor_1_0= ruleVariavelValor ) ) otherlv_2= ';'
            {
            // InternalOiArdubot.g:1273:3: ( (lv_atribuicao_0_0= ruleExistenteVariavelRecebe ) )
            // InternalOiArdubot.g:1274:4: (lv_atribuicao_0_0= ruleExistenteVariavelRecebe )
            {
            // InternalOiArdubot.g:1274:4: (lv_atribuicao_0_0= ruleExistenteVariavelRecebe )
            // InternalOiArdubot.g:1275:5: lv_atribuicao_0_0= ruleExistenteVariavelRecebe
            {

            					newCompositeNode(grammarAccess.getVariavelExistenteAccess().getAtribuicaoExistenteVariavelRecebeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_atribuicao_0_0=ruleExistenteVariavelRecebe();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariavelExistenteRule());
            					}
            					set(
            						current,
            						"atribuicao",
            						lv_atribuicao_0_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.ExistenteVariavelRecebe");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:1292:3: ( (lv_valor_1_0= ruleVariavelValor ) )
            // InternalOiArdubot.g:1293:4: (lv_valor_1_0= ruleVariavelValor )
            {
            // InternalOiArdubot.g:1293:4: (lv_valor_1_0= ruleVariavelValor )
            // InternalOiArdubot.g:1294:5: lv_valor_1_0= ruleVariavelValor
            {

            					newCompositeNode(grammarAccess.getVariavelExistenteAccess().getValorVariavelValorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_valor_1_0=ruleVariavelValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariavelExistenteRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_1_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.VariavelValor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getVariavelExistenteAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariavelExistente"


    // $ANTLR start "entryRuleConstanteVariavel"
    // InternalOiArdubot.g:1319:1: entryRuleConstanteVariavel returns [EObject current=null] : iv_ruleConstanteVariavel= ruleConstanteVariavel EOF ;
    public final EObject entryRuleConstanteVariavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstanteVariavel = null;


        try {
            // InternalOiArdubot.g:1319:58: (iv_ruleConstanteVariavel= ruleConstanteVariavel EOF )
            // InternalOiArdubot.g:1320:2: iv_ruleConstanteVariavel= ruleConstanteVariavel EOF
            {
             newCompositeNode(grammarAccess.getConstanteVariavelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstanteVariavel=ruleConstanteVariavel();

            state._fsp--;

             current =iv_ruleConstanteVariavel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstanteVariavel"


    // $ANTLR start "ruleConstanteVariavel"
    // InternalOiArdubot.g:1326:1: ruleConstanteVariavel returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_variavelNome_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleVariavelValor ) ) otherlv_4= ';' ) ;
    public final EObject ruleConstanteVariavel() throws RecognitionException {
        EObject current = null;

        Token lv_variavelNome_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_valor_3_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1332:2: ( ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_variavelNome_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleVariavelValor ) ) otherlv_4= ';' ) )
            // InternalOiArdubot.g:1333:2: ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_variavelNome_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleVariavelValor ) ) otherlv_4= ';' )
            {
            // InternalOiArdubot.g:1333:2: ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_variavelNome_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleVariavelValor ) ) otherlv_4= ';' )
            // InternalOiArdubot.g:1334:3: ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_variavelNome_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleVariavelValor ) ) otherlv_4= ';'
            {
            // InternalOiArdubot.g:1334:3: ( (lv_tipo_0_0= ruleTipo ) )
            // InternalOiArdubot.g:1335:4: (lv_tipo_0_0= ruleTipo )
            {
            // InternalOiArdubot.g:1335:4: (lv_tipo_0_0= ruleTipo )
            // InternalOiArdubot.g:1336:5: lv_tipo_0_0= ruleTipo
            {

            					newCompositeNode(grammarAccess.getConstanteVariavelAccess().getTipoTipoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_tipo_0_0=ruleTipo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstanteVariavelRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Tipo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:1353:3: ( (lv_variavelNome_1_0= RULE_ID ) )
            // InternalOiArdubot.g:1354:4: (lv_variavelNome_1_0= RULE_ID )
            {
            // InternalOiArdubot.g:1354:4: (lv_variavelNome_1_0= RULE_ID )
            // InternalOiArdubot.g:1355:5: lv_variavelNome_1_0= RULE_ID
            {
            lv_variavelNome_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_variavelNome_1_0, grammarAccess.getConstanteVariavelAccess().getVariavelNomeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstanteVariavelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variavelNome",
            						lv_variavelNome_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConstanteVariavelAccess().getLessThanSignHyphenMinusKeyword_2());
            		
            // InternalOiArdubot.g:1375:3: ( (lv_valor_3_0= ruleVariavelValor ) )
            // InternalOiArdubot.g:1376:4: (lv_valor_3_0= ruleVariavelValor )
            {
            // InternalOiArdubot.g:1376:4: (lv_valor_3_0= ruleVariavelValor )
            // InternalOiArdubot.g:1377:5: lv_valor_3_0= ruleVariavelValor
            {

            					newCompositeNode(grammarAccess.getConstanteVariavelAccess().getValorVariavelValorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_valor_3_0=ruleVariavelValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstanteVariavelRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_3_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.VariavelValor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConstanteVariavelAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstanteVariavel"


    // $ANTLR start "entryRuleConstante"
    // InternalOiArdubot.g:1402:1: entryRuleConstante returns [EObject current=null] : iv_ruleConstante= ruleConstante EOF ;
    public final EObject entryRuleConstante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstante = null;


        try {
            // InternalOiArdubot.g:1402:50: (iv_ruleConstante= ruleConstante EOF )
            // InternalOiArdubot.g:1403:2: iv_ruleConstante= ruleConstante EOF
            {
             newCompositeNode(grammarAccess.getConstanteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstante=ruleConstante();

            state._fsp--;

             current =iv_ruleConstante; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstante"


    // $ANTLR start "ruleConstante"
    // InternalOiArdubot.g:1409:1: ruleConstante returns [EObject current=null] : (otherlv_0= 'CONSTANTE' ( (lv_variavel_1_0= ruleConstanteVariavel ) ) ) ;
    public final EObject ruleConstante() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_variavel_1_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1415:2: ( (otherlv_0= 'CONSTANTE' ( (lv_variavel_1_0= ruleConstanteVariavel ) ) ) )
            // InternalOiArdubot.g:1416:2: (otherlv_0= 'CONSTANTE' ( (lv_variavel_1_0= ruleConstanteVariavel ) ) )
            {
            // InternalOiArdubot.g:1416:2: (otherlv_0= 'CONSTANTE' ( (lv_variavel_1_0= ruleConstanteVariavel ) ) )
            // InternalOiArdubot.g:1417:3: otherlv_0= 'CONSTANTE' ( (lv_variavel_1_0= ruleConstanteVariavel ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getConstanteAccess().getCONSTANTEKeyword_0());
            		
            // InternalOiArdubot.g:1421:3: ( (lv_variavel_1_0= ruleConstanteVariavel ) )
            // InternalOiArdubot.g:1422:4: (lv_variavel_1_0= ruleConstanteVariavel )
            {
            // InternalOiArdubot.g:1422:4: (lv_variavel_1_0= ruleConstanteVariavel )
            // InternalOiArdubot.g:1423:5: lv_variavel_1_0= ruleConstanteVariavel
            {

            					newCompositeNode(grammarAccess.getConstanteAccess().getVariavelConstanteVariavelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_variavel_1_0=ruleConstanteVariavel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstanteRule());
            					}
            					set(
            						current,
            						"variavel",
            						lv_variavel_1_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.ConstanteVariavel");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstante"


    // $ANTLR start "entryRuleLogico"
    // InternalOiArdubot.g:1444:1: entryRuleLogico returns [EObject current=null] : iv_ruleLogico= ruleLogico EOF ;
    public final EObject entryRuleLogico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogico = null;


        try {
            // InternalOiArdubot.g:1444:47: (iv_ruleLogico= ruleLogico EOF )
            // InternalOiArdubot.g:1445:2: iv_ruleLogico= ruleLogico EOF
            {
             newCompositeNode(grammarAccess.getLogicoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogico=ruleLogico();

            state._fsp--;

             current =iv_ruleLogico; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogico"


    // $ANTLR start "ruleLogico"
    // InternalOiArdubot.g:1451:1: ruleLogico returns [EObject current=null] : ( ( (lv_relation_0_1= '=' | lv_relation_0_2= '<>' | lv_relation_0_3= '<' | lv_relation_0_4= '<=' | lv_relation_0_5= '>=' | lv_relation_0_6= '>' ) ) ) ;
    public final EObject ruleLogico() throws RecognitionException {
        EObject current = null;

        Token lv_relation_0_1=null;
        Token lv_relation_0_2=null;
        Token lv_relation_0_3=null;
        Token lv_relation_0_4=null;
        Token lv_relation_0_5=null;
        Token lv_relation_0_6=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:1457:2: ( ( ( (lv_relation_0_1= '=' | lv_relation_0_2= '<>' | lv_relation_0_3= '<' | lv_relation_0_4= '<=' | lv_relation_0_5= '>=' | lv_relation_0_6= '>' ) ) ) )
            // InternalOiArdubot.g:1458:2: ( ( (lv_relation_0_1= '=' | lv_relation_0_2= '<>' | lv_relation_0_3= '<' | lv_relation_0_4= '<=' | lv_relation_0_5= '>=' | lv_relation_0_6= '>' ) ) )
            {
            // InternalOiArdubot.g:1458:2: ( ( (lv_relation_0_1= '=' | lv_relation_0_2= '<>' | lv_relation_0_3= '<' | lv_relation_0_4= '<=' | lv_relation_0_5= '>=' | lv_relation_0_6= '>' ) ) )
            // InternalOiArdubot.g:1459:3: ( (lv_relation_0_1= '=' | lv_relation_0_2= '<>' | lv_relation_0_3= '<' | lv_relation_0_4= '<=' | lv_relation_0_5= '>=' | lv_relation_0_6= '>' ) )
            {
            // InternalOiArdubot.g:1459:3: ( (lv_relation_0_1= '=' | lv_relation_0_2= '<>' | lv_relation_0_3= '<' | lv_relation_0_4= '<=' | lv_relation_0_5= '>=' | lv_relation_0_6= '>' ) )
            // InternalOiArdubot.g:1460:4: (lv_relation_0_1= '=' | lv_relation_0_2= '<>' | lv_relation_0_3= '<' | lv_relation_0_4= '<=' | lv_relation_0_5= '>=' | lv_relation_0_6= '>' )
            {
            // InternalOiArdubot.g:1460:4: (lv_relation_0_1= '=' | lv_relation_0_2= '<>' | lv_relation_0_3= '<' | lv_relation_0_4= '<=' | lv_relation_0_5= '>=' | lv_relation_0_6= '>' )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt18=1;
                }
                break;
            case 20:
                {
                alt18=2;
                }
                break;
            case 21:
                {
                alt18=3;
                }
                break;
            case 22:
                {
                alt18=4;
                }
                break;
            case 23:
                {
                alt18=5;
                }
                break;
            case 24:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalOiArdubot.g:1461:5: lv_relation_0_1= '='
                    {
                    lv_relation_0_1=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_relation_0_1, grammarAccess.getLogicoAccess().getRelationEqualsSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicoRule());
                    					}
                    					setWithLastConsumed(current, "relation", lv_relation_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:1472:5: lv_relation_0_2= '<>'
                    {
                    lv_relation_0_2=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_relation_0_2, grammarAccess.getLogicoAccess().getRelationLessThanSignGreaterThanSignKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicoRule());
                    					}
                    					setWithLastConsumed(current, "relation", lv_relation_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalOiArdubot.g:1483:5: lv_relation_0_3= '<'
                    {
                    lv_relation_0_3=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_relation_0_3, grammarAccess.getLogicoAccess().getRelationLessThanSignKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicoRule());
                    					}
                    					setWithLastConsumed(current, "relation", lv_relation_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalOiArdubot.g:1494:5: lv_relation_0_4= '<='
                    {
                    lv_relation_0_4=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_relation_0_4, grammarAccess.getLogicoAccess().getRelationLessThanSignEqualsSignKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicoRule());
                    					}
                    					setWithLastConsumed(current, "relation", lv_relation_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalOiArdubot.g:1505:5: lv_relation_0_5= '>='
                    {
                    lv_relation_0_5=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_relation_0_5, grammarAccess.getLogicoAccess().getRelationGreaterThanSignEqualsSignKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicoRule());
                    					}
                    					setWithLastConsumed(current, "relation", lv_relation_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalOiArdubot.g:1516:5: lv_relation_0_6= '>'
                    {
                    lv_relation_0_6=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_relation_0_6, grammarAccess.getLogicoAccess().getRelationGreaterThanSignKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicoRule());
                    					}
                    					setWithLastConsumed(current, "relation", lv_relation_0_6, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogico"


    // $ANTLR start "entryRuleLer"
    // InternalOiArdubot.g:1532:1: entryRuleLer returns [EObject current=null] : iv_ruleLer= ruleLer EOF ;
    public final EObject entryRuleLer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLer = null;


        try {
            // InternalOiArdubot.g:1532:44: (iv_ruleLer= ruleLer EOF )
            // InternalOiArdubot.g:1533:2: iv_ruleLer= ruleLer EOF
            {
             newCompositeNode(grammarAccess.getLerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLer=ruleLer();

            state._fsp--;

             current =iv_ruleLer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLer"


    // $ANTLR start "ruleLer"
    // InternalOiArdubot.g:1539:1: ruleLer returns [EObject current=null] : ( ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLer ) ) ) ;
    public final EObject ruleLer() throws RecognitionException {
        EObject current = null;

        EObject lv_atribuicao_0_0 = null;

        AntlrDatatypeRuleToken lv_ler_1_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1545:2: ( ( ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLer ) ) ) )
            // InternalOiArdubot.g:1546:2: ( ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLer ) ) )
            {
            // InternalOiArdubot.g:1546:2: ( ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLer ) ) )
            // InternalOiArdubot.g:1547:3: ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLer ) )
            {
            // InternalOiArdubot.g:1547:3: ( (lv_atribuicao_0_0= ruleReceberValor ) )
            // InternalOiArdubot.g:1548:4: (lv_atribuicao_0_0= ruleReceberValor )
            {
            // InternalOiArdubot.g:1548:4: (lv_atribuicao_0_0= ruleReceberValor )
            // InternalOiArdubot.g:1549:5: lv_atribuicao_0_0= ruleReceberValor
            {

            					newCompositeNode(grammarAccess.getLerAccess().getAtribuicaoReceberValorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_atribuicao_0_0=ruleReceberValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLerRule());
            					}
            					set(
            						current,
            						"atribuicao",
            						lv_atribuicao_0_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.ReceberValor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:1566:3: ( (lv_ler_1_0= ruleFuncaoLer ) )
            // InternalOiArdubot.g:1567:4: (lv_ler_1_0= ruleFuncaoLer )
            {
            // InternalOiArdubot.g:1567:4: (lv_ler_1_0= ruleFuncaoLer )
            // InternalOiArdubot.g:1568:5: lv_ler_1_0= ruleFuncaoLer
            {

            					newCompositeNode(grammarAccess.getLerAccess().getLerFuncaoLerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ler_1_0=ruleFuncaoLer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLerRule());
            					}
            					set(
            						current,
            						"ler",
            						lv_ler_1_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.FuncaoLer");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLer"


    // $ANTLR start "entryRuleFuncaoLer"
    // InternalOiArdubot.g:1589:1: entryRuleFuncaoLer returns [String current=null] : iv_ruleFuncaoLer= ruleFuncaoLer EOF ;
    public final String entryRuleFuncaoLer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFuncaoLer = null;


        try {
            // InternalOiArdubot.g:1589:49: (iv_ruleFuncaoLer= ruleFuncaoLer EOF )
            // InternalOiArdubot.g:1590:2: iv_ruleFuncaoLer= ruleFuncaoLer EOF
            {
             newCompositeNode(grammarAccess.getFuncaoLerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncaoLer=ruleFuncaoLer();

            state._fsp--;

             current =iv_ruleFuncaoLer.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncaoLer"


    // $ANTLR start "ruleFuncaoLer"
    // InternalOiArdubot.g:1596:1: ruleFuncaoLer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ler' kw= '(' kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleFuncaoLer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:1602:2: ( (kw= 'ler' kw= '(' kw= ')' kw= ';' ) )
            // InternalOiArdubot.g:1603:2: (kw= 'ler' kw= '(' kw= ')' kw= ';' )
            {
            // InternalOiArdubot.g:1603:2: (kw= 'ler' kw= '(' kw= ')' kw= ';' )
            // InternalOiArdubot.g:1604:3: kw= 'ler' kw= '(' kw= ')' kw= ';'
            {
            kw=(Token)match(input,25,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFuncaoLerAccess().getLerKeyword_0());
            		
            kw=(Token)match(input,26,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFuncaoLerAccess().getLeftParenthesisKeyword_1());
            		
            kw=(Token)match(input,27,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFuncaoLerAccess().getRightParenthesisKeyword_2());
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFuncaoLerAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncaoLer"


    // $ANTLR start "entryRuleLerDigital"
    // InternalOiArdubot.g:1628:1: entryRuleLerDigital returns [EObject current=null] : iv_ruleLerDigital= ruleLerDigital EOF ;
    public final EObject entryRuleLerDigital() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLerDigital = null;


        try {
            // InternalOiArdubot.g:1628:51: (iv_ruleLerDigital= ruleLerDigital EOF )
            // InternalOiArdubot.g:1629:2: iv_ruleLerDigital= ruleLerDigital EOF
            {
             newCompositeNode(grammarAccess.getLerDigitalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLerDigital=ruleLerDigital();

            state._fsp--;

             current =iv_ruleLerDigital; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLerDigital"


    // $ANTLR start "ruleLerDigital"
    // InternalOiArdubot.g:1635:1: ruleLerDigital returns [EObject current=null] : ( ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLerDigital ) ) ) ;
    public final EObject ruleLerDigital() throws RecognitionException {
        EObject current = null;

        EObject lv_atribuicao_0_0 = null;

        EObject lv_ler_1_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1641:2: ( ( ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLerDigital ) ) ) )
            // InternalOiArdubot.g:1642:2: ( ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLerDigital ) ) )
            {
            // InternalOiArdubot.g:1642:2: ( ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLerDigital ) ) )
            // InternalOiArdubot.g:1643:3: ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLerDigital ) )
            {
            // InternalOiArdubot.g:1643:3: ( (lv_atribuicao_0_0= ruleReceberValor ) )
            // InternalOiArdubot.g:1644:4: (lv_atribuicao_0_0= ruleReceberValor )
            {
            // InternalOiArdubot.g:1644:4: (lv_atribuicao_0_0= ruleReceberValor )
            // InternalOiArdubot.g:1645:5: lv_atribuicao_0_0= ruleReceberValor
            {

            					newCompositeNode(grammarAccess.getLerDigitalAccess().getAtribuicaoReceberValorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_atribuicao_0_0=ruleReceberValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLerDigitalRule());
            					}
            					set(
            						current,
            						"atribuicao",
            						lv_atribuicao_0_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.ReceberValor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:1662:3: ( (lv_ler_1_0= ruleFuncaoLerDigital ) )
            // InternalOiArdubot.g:1663:4: (lv_ler_1_0= ruleFuncaoLerDigital )
            {
            // InternalOiArdubot.g:1663:4: (lv_ler_1_0= ruleFuncaoLerDigital )
            // InternalOiArdubot.g:1664:5: lv_ler_1_0= ruleFuncaoLerDigital
            {

            					newCompositeNode(grammarAccess.getLerDigitalAccess().getLerFuncaoLerDigitalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ler_1_0=ruleFuncaoLerDigital();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLerDigitalRule());
            					}
            					set(
            						current,
            						"ler",
            						lv_ler_1_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.FuncaoLerDigital");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLerDigital"


    // $ANTLR start "entryRuleFuncaoLerDigital"
    // InternalOiArdubot.g:1685:1: entryRuleFuncaoLerDigital returns [EObject current=null] : iv_ruleFuncaoLerDigital= ruleFuncaoLerDigital EOF ;
    public final EObject entryRuleFuncaoLerDigital() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncaoLerDigital = null;


        try {
            // InternalOiArdubot.g:1685:57: (iv_ruleFuncaoLerDigital= ruleFuncaoLerDigital EOF )
            // InternalOiArdubot.g:1686:2: iv_ruleFuncaoLerDigital= ruleFuncaoLerDigital EOF
            {
             newCompositeNode(grammarAccess.getFuncaoLerDigitalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncaoLerDigital=ruleFuncaoLerDigital();

            state._fsp--;

             current =iv_ruleFuncaoLerDigital; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncaoLerDigital"


    // $ANTLR start "ruleFuncaoLerDigital"
    // InternalOiArdubot.g:1692:1: ruleFuncaoLerDigital returns [EObject current=null] : (otherlv_0= 'lerDigital' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleFuncaoLerDigital() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_porta_2_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1698:2: ( (otherlv_0= 'lerDigital' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalOiArdubot.g:1699:2: (otherlv_0= 'lerDigital' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalOiArdubot.g:1699:2: (otherlv_0= 'lerDigital' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalOiArdubot.g:1700:3: otherlv_0= 'lerDigital' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncaoLerDigitalAccess().getLerDigitalKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncaoLerDigitalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOiArdubot.g:1708:3: ( (lv_porta_2_0= rulePorta ) )
            // InternalOiArdubot.g:1709:4: (lv_porta_2_0= rulePorta )
            {
            // InternalOiArdubot.g:1709:4: (lv_porta_2_0= rulePorta )
            // InternalOiArdubot.g:1710:5: lv_porta_2_0= rulePorta
            {

            					newCompositeNode(grammarAccess.getFuncaoLerDigitalAccess().getPortaPortaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_porta_2_0=rulePorta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncaoLerDigitalRule());
            					}
            					set(
            						current,
            						"porta",
            						lv_porta_2_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Porta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncaoLerDigitalAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFuncaoLerDigitalAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncaoLerDigital"


    // $ANTLR start "entryRuleLerAnalogica"
    // InternalOiArdubot.g:1739:1: entryRuleLerAnalogica returns [EObject current=null] : iv_ruleLerAnalogica= ruleLerAnalogica EOF ;
    public final EObject entryRuleLerAnalogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLerAnalogica = null;


        try {
            // InternalOiArdubot.g:1739:53: (iv_ruleLerAnalogica= ruleLerAnalogica EOF )
            // InternalOiArdubot.g:1740:2: iv_ruleLerAnalogica= ruleLerAnalogica EOF
            {
             newCompositeNode(grammarAccess.getLerAnalogicaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLerAnalogica=ruleLerAnalogica();

            state._fsp--;

             current =iv_ruleLerAnalogica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLerAnalogica"


    // $ANTLR start "ruleLerAnalogica"
    // InternalOiArdubot.g:1746:1: ruleLerAnalogica returns [EObject current=null] : ( ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLerAnalogica ) ) ) ;
    public final EObject ruleLerAnalogica() throws RecognitionException {
        EObject current = null;

        EObject lv_atribuicao_0_0 = null;

        EObject lv_ler_1_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1752:2: ( ( ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLerAnalogica ) ) ) )
            // InternalOiArdubot.g:1753:2: ( ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLerAnalogica ) ) )
            {
            // InternalOiArdubot.g:1753:2: ( ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLerAnalogica ) ) )
            // InternalOiArdubot.g:1754:3: ( (lv_atribuicao_0_0= ruleReceberValor ) ) ( (lv_ler_1_0= ruleFuncaoLerAnalogica ) )
            {
            // InternalOiArdubot.g:1754:3: ( (lv_atribuicao_0_0= ruleReceberValor ) )
            // InternalOiArdubot.g:1755:4: (lv_atribuicao_0_0= ruleReceberValor )
            {
            // InternalOiArdubot.g:1755:4: (lv_atribuicao_0_0= ruleReceberValor )
            // InternalOiArdubot.g:1756:5: lv_atribuicao_0_0= ruleReceberValor
            {

            					newCompositeNode(grammarAccess.getLerAnalogicaAccess().getAtribuicaoReceberValorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_atribuicao_0_0=ruleReceberValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLerAnalogicaRule());
            					}
            					set(
            						current,
            						"atribuicao",
            						lv_atribuicao_0_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.ReceberValor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:1773:3: ( (lv_ler_1_0= ruleFuncaoLerAnalogica ) )
            // InternalOiArdubot.g:1774:4: (lv_ler_1_0= ruleFuncaoLerAnalogica )
            {
            // InternalOiArdubot.g:1774:4: (lv_ler_1_0= ruleFuncaoLerAnalogica )
            // InternalOiArdubot.g:1775:5: lv_ler_1_0= ruleFuncaoLerAnalogica
            {

            					newCompositeNode(grammarAccess.getLerAnalogicaAccess().getLerFuncaoLerAnalogicaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ler_1_0=ruleFuncaoLerAnalogica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLerAnalogicaRule());
            					}
            					set(
            						current,
            						"ler",
            						lv_ler_1_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.FuncaoLerAnalogica");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLerAnalogica"


    // $ANTLR start "entryRuleFuncaoLerAnalogica"
    // InternalOiArdubot.g:1796:1: entryRuleFuncaoLerAnalogica returns [EObject current=null] : iv_ruleFuncaoLerAnalogica= ruleFuncaoLerAnalogica EOF ;
    public final EObject entryRuleFuncaoLerAnalogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncaoLerAnalogica = null;


        try {
            // InternalOiArdubot.g:1796:59: (iv_ruleFuncaoLerAnalogica= ruleFuncaoLerAnalogica EOF )
            // InternalOiArdubot.g:1797:2: iv_ruleFuncaoLerAnalogica= ruleFuncaoLerAnalogica EOF
            {
             newCompositeNode(grammarAccess.getFuncaoLerAnalogicaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncaoLerAnalogica=ruleFuncaoLerAnalogica();

            state._fsp--;

             current =iv_ruleFuncaoLerAnalogica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncaoLerAnalogica"


    // $ANTLR start "ruleFuncaoLerAnalogica"
    // InternalOiArdubot.g:1803:1: ruleFuncaoLerAnalogica returns [EObject current=null] : (otherlv_0= 'lerAnalogica' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleFuncaoLerAnalogica() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_porta_2_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1809:2: ( (otherlv_0= 'lerAnalogica' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalOiArdubot.g:1810:2: (otherlv_0= 'lerAnalogica' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalOiArdubot.g:1810:2: (otherlv_0= 'lerAnalogica' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalOiArdubot.g:1811:3: otherlv_0= 'lerAnalogica' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncaoLerAnalogicaAccess().getLerAnalogicaKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getFuncaoLerAnalogicaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOiArdubot.g:1819:3: ( (lv_porta_2_0= rulePorta ) )
            // InternalOiArdubot.g:1820:4: (lv_porta_2_0= rulePorta )
            {
            // InternalOiArdubot.g:1820:4: (lv_porta_2_0= rulePorta )
            // InternalOiArdubot.g:1821:5: lv_porta_2_0= rulePorta
            {

            					newCompositeNode(grammarAccess.getFuncaoLerAnalogicaAccess().getPortaPortaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_porta_2_0=rulePorta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncaoLerAnalogicaRule());
            					}
            					set(
            						current,
            						"porta",
            						lv_porta_2_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Porta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncaoLerAnalogicaAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFuncaoLerAnalogicaAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncaoLerAnalogica"


    // $ANTLR start "entryRuleEscrever"
    // InternalOiArdubot.g:1850:1: entryRuleEscrever returns [EObject current=null] : iv_ruleEscrever= ruleEscrever EOF ;
    public final EObject entryRuleEscrever() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscrever = null;


        try {
            // InternalOiArdubot.g:1850:49: (iv_ruleEscrever= ruleEscrever EOF )
            // InternalOiArdubot.g:1851:2: iv_ruleEscrever= ruleEscrever EOF
            {
             newCompositeNode(grammarAccess.getEscreverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEscrever=ruleEscrever();

            state._fsp--;

             current =iv_ruleEscrever; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEscrever"


    // $ANTLR start "ruleEscrever"
    // InternalOiArdubot.g:1857:1: ruleEscrever returns [EObject current=null] : (otherlv_0= 'escrever' ( (lv_mensagem_1_0= ruleConteudoEscrever ) ) otherlv_2= ';' ) ;
    public final EObject ruleEscrever() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_mensagem_1_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1863:2: ( (otherlv_0= 'escrever' ( (lv_mensagem_1_0= ruleConteudoEscrever ) ) otherlv_2= ';' ) )
            // InternalOiArdubot.g:1864:2: (otherlv_0= 'escrever' ( (lv_mensagem_1_0= ruleConteudoEscrever ) ) otherlv_2= ';' )
            {
            // InternalOiArdubot.g:1864:2: (otherlv_0= 'escrever' ( (lv_mensagem_1_0= ruleConteudoEscrever ) ) otherlv_2= ';' )
            // InternalOiArdubot.g:1865:3: otherlv_0= 'escrever' ( (lv_mensagem_1_0= ruleConteudoEscrever ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getEscreverAccess().getEscreverKeyword_0());
            		
            // InternalOiArdubot.g:1869:3: ( (lv_mensagem_1_0= ruleConteudoEscrever ) )
            // InternalOiArdubot.g:1870:4: (lv_mensagem_1_0= ruleConteudoEscrever )
            {
            // InternalOiArdubot.g:1870:4: (lv_mensagem_1_0= ruleConteudoEscrever )
            // InternalOiArdubot.g:1871:5: lv_mensagem_1_0= ruleConteudoEscrever
            {

            					newCompositeNode(grammarAccess.getEscreverAccess().getMensagemConteudoEscreverParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_mensagem_1_0=ruleConteudoEscrever();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEscreverRule());
            					}
            					set(
            						current,
            						"mensagem",
            						lv_mensagem_1_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.ConteudoEscrever");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEscreverAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscrever"


    // $ANTLR start "entryRuleTela"
    // InternalOiArdubot.g:1896:1: entryRuleTela returns [EObject current=null] : iv_ruleTela= ruleTela EOF ;
    public final EObject entryRuleTela() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTela = null;


        try {
            // InternalOiArdubot.g:1896:45: (iv_ruleTela= ruleTela EOF )
            // InternalOiArdubot.g:1897:2: iv_ruleTela= ruleTela EOF
            {
             newCompositeNode(grammarAccess.getTelaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTela=ruleTela();

            state._fsp--;

             current =iv_ruleTela; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTela"


    // $ANTLR start "ruleTela"
    // InternalOiArdubot.g:1903:1: ruleTela returns [EObject current=null] : (otherlv_0= 'tela' ( (lv_mensagem_1_0= ruleDisplayValor ) ) otherlv_2= ';' ) ;
    public final EObject ruleTela() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_mensagem_1_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1909:2: ( (otherlv_0= 'tela' ( (lv_mensagem_1_0= ruleDisplayValor ) ) otherlv_2= ';' ) )
            // InternalOiArdubot.g:1910:2: (otherlv_0= 'tela' ( (lv_mensagem_1_0= ruleDisplayValor ) ) otherlv_2= ';' )
            {
            // InternalOiArdubot.g:1910:2: (otherlv_0= 'tela' ( (lv_mensagem_1_0= ruleDisplayValor ) ) otherlv_2= ';' )
            // InternalOiArdubot.g:1911:3: otherlv_0= 'tela' ( (lv_mensagem_1_0= ruleDisplayValor ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTelaAccess().getTelaKeyword_0());
            		
            // InternalOiArdubot.g:1915:3: ( (lv_mensagem_1_0= ruleDisplayValor ) )
            // InternalOiArdubot.g:1916:4: (lv_mensagem_1_0= ruleDisplayValor )
            {
            // InternalOiArdubot.g:1916:4: (lv_mensagem_1_0= ruleDisplayValor )
            // InternalOiArdubot.g:1917:5: lv_mensagem_1_0= ruleDisplayValor
            {

            					newCompositeNode(grammarAccess.getTelaAccess().getMensagemDisplayValorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_mensagem_1_0=ruleDisplayValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTelaRule());
            					}
            					set(
            						current,
            						"mensagem",
            						lv_mensagem_1_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.DisplayValor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTelaAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTela"


    // $ANTLR start "entryRuleBip"
    // InternalOiArdubot.g:1942:1: entryRuleBip returns [EObject current=null] : iv_ruleBip= ruleBip EOF ;
    public final EObject entryRuleBip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBip = null;


        try {
            // InternalOiArdubot.g:1942:44: (iv_ruleBip= ruleBip EOF )
            // InternalOiArdubot.g:1943:2: iv_ruleBip= ruleBip EOF
            {
             newCompositeNode(grammarAccess.getBipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBip=ruleBip();

            state._fsp--;

             current =iv_ruleBip; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBip"


    // $ANTLR start "ruleBip"
    // InternalOiArdubot.g:1949:1: ruleBip returns [EObject current=null] : (otherlv_0= 'bip' otherlv_1= '(' ( (lv_tipo_2_0= ruleTipoBip ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleBip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_tipo_2_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:1955:2: ( (otherlv_0= 'bip' otherlv_1= '(' ( (lv_tipo_2_0= ruleTipoBip ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalOiArdubot.g:1956:2: (otherlv_0= 'bip' otherlv_1= '(' ( (lv_tipo_2_0= ruleTipoBip ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalOiArdubot.g:1956:2: (otherlv_0= 'bip' otherlv_1= '(' ( (lv_tipo_2_0= ruleTipoBip ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalOiArdubot.g:1957:3: otherlv_0= 'bip' otherlv_1= '(' ( (lv_tipo_2_0= ruleTipoBip ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getBipAccess().getBipKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getBipAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOiArdubot.g:1965:3: ( (lv_tipo_2_0= ruleTipoBip ) )
            // InternalOiArdubot.g:1966:4: (lv_tipo_2_0= ruleTipoBip )
            {
            // InternalOiArdubot.g:1966:4: (lv_tipo_2_0= ruleTipoBip )
            // InternalOiArdubot.g:1967:5: lv_tipo_2_0= ruleTipoBip
            {

            					newCompositeNode(grammarAccess.getBipAccess().getTipoTipoBipParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_tipo_2_0=ruleTipoBip();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBipRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_2_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.TipoBip");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getBipAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBipAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBip"


    // $ANTLR start "entryRuleTipoBip"
    // InternalOiArdubot.g:1996:1: entryRuleTipoBip returns [String current=null] : iv_ruleTipoBip= ruleTipoBip EOF ;
    public final String entryRuleTipoBip() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoBip = null;


        try {
            // InternalOiArdubot.g:1996:47: (iv_ruleTipoBip= ruleTipoBip EOF )
            // InternalOiArdubot.g:1997:2: iv_ruleTipoBip= ruleTipoBip EOF
            {
             newCompositeNode(grammarAccess.getTipoBipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoBip=ruleTipoBip();

            state._fsp--;

             current =iv_ruleTipoBip.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoBip"


    // $ANTLR start "ruleTipoBip"
    // InternalOiArdubot.g:2003:1: ruleTipoBip returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'curto' | kw= 'medio' | kw= 'longo' ) ;
    public final AntlrDatatypeRuleToken ruleTipoBip() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:2009:2: ( (kw= 'curto' | kw= 'medio' | kw= 'longo' ) )
            // InternalOiArdubot.g:2010:2: (kw= 'curto' | kw= 'medio' | kw= 'longo' )
            {
            // InternalOiArdubot.g:2010:2: (kw= 'curto' | kw= 'medio' | kw= 'longo' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 34:
                {
                alt19=2;
                }
                break;
            case 35:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalOiArdubot.g:2011:3: kw= 'curto'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoBipAccess().getCurtoKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:2017:3: kw= 'medio'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoBipAccess().getMedioKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOiArdubot.g:2023:3: kw= 'longo'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoBipAccess().getLongoKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoBip"


    // $ANTLR start "entryRuleLigar"
    // InternalOiArdubot.g:2032:1: entryRuleLigar returns [EObject current=null] : iv_ruleLigar= ruleLigar EOF ;
    public final EObject entryRuleLigar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLigar = null;


        try {
            // InternalOiArdubot.g:2032:46: (iv_ruleLigar= ruleLigar EOF )
            // InternalOiArdubot.g:2033:2: iv_ruleLigar= ruleLigar EOF
            {
             newCompositeNode(grammarAccess.getLigarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLigar=ruleLigar();

            state._fsp--;

             current =iv_ruleLigar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLigar"


    // $ANTLR start "ruleLigar"
    // InternalOiArdubot.g:2039:1: ruleLigar returns [EObject current=null] : (otherlv_0= 'ligar' otherlv_1= '(' ( (lv_tipoPorta_2_0= ruleTipoPorta ) ) otherlv_3= ',' ( (lv_porta_4_0= rulePorta ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleLigar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_tipoPorta_2_0 = null;

        EObject lv_porta_4_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:2045:2: ( (otherlv_0= 'ligar' otherlv_1= '(' ( (lv_tipoPorta_2_0= ruleTipoPorta ) ) otherlv_3= ',' ( (lv_porta_4_0= rulePorta ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalOiArdubot.g:2046:2: (otherlv_0= 'ligar' otherlv_1= '(' ( (lv_tipoPorta_2_0= ruleTipoPorta ) ) otherlv_3= ',' ( (lv_porta_4_0= rulePorta ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalOiArdubot.g:2046:2: (otherlv_0= 'ligar' otherlv_1= '(' ( (lv_tipoPorta_2_0= ruleTipoPorta ) ) otherlv_3= ',' ( (lv_porta_4_0= rulePorta ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalOiArdubot.g:2047:3: otherlv_0= 'ligar' otherlv_1= '(' ( (lv_tipoPorta_2_0= ruleTipoPorta ) ) otherlv_3= ',' ( (lv_porta_4_0= rulePorta ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getLigarAccess().getLigarKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getLigarAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOiArdubot.g:2055:3: ( (lv_tipoPorta_2_0= ruleTipoPorta ) )
            // InternalOiArdubot.g:2056:4: (lv_tipoPorta_2_0= ruleTipoPorta )
            {
            // InternalOiArdubot.g:2056:4: (lv_tipoPorta_2_0= ruleTipoPorta )
            // InternalOiArdubot.g:2057:5: lv_tipoPorta_2_0= ruleTipoPorta
            {

            					newCompositeNode(grammarAccess.getLigarAccess().getTipoPortaTipoPortaEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_tipoPorta_2_0=ruleTipoPorta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLigarRule());
            					}
            					set(
            						current,
            						"tipoPorta",
            						lv_tipoPorta_2_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.TipoPorta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getLigarAccess().getCommaKeyword_3());
            		
            // InternalOiArdubot.g:2078:3: ( (lv_porta_4_0= rulePorta ) )
            // InternalOiArdubot.g:2079:4: (lv_porta_4_0= rulePorta )
            {
            // InternalOiArdubot.g:2079:4: (lv_porta_4_0= rulePorta )
            // InternalOiArdubot.g:2080:5: lv_porta_4_0= rulePorta
            {

            					newCompositeNode(grammarAccess.getLigarAccess().getPortaPortaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_porta_4_0=rulePorta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLigarRule());
            					}
            					set(
            						current,
            						"porta",
            						lv_porta_4_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Porta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getLigarAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLigarAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLigar"


    // $ANTLR start "entryRuleDesligar"
    // InternalOiArdubot.g:2109:1: entryRuleDesligar returns [EObject current=null] : iv_ruleDesligar= ruleDesligar EOF ;
    public final EObject entryRuleDesligar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesligar = null;


        try {
            // InternalOiArdubot.g:2109:49: (iv_ruleDesligar= ruleDesligar EOF )
            // InternalOiArdubot.g:2110:2: iv_ruleDesligar= ruleDesligar EOF
            {
             newCompositeNode(grammarAccess.getDesligarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesligar=ruleDesligar();

            state._fsp--;

             current =iv_ruleDesligar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesligar"


    // $ANTLR start "ruleDesligar"
    // InternalOiArdubot.g:2116:1: ruleDesligar returns [EObject current=null] : (otherlv_0= 'desligar' otherlv_1= '(' ( (lv_tipoPorta_2_0= ruleTipoPorta ) ) otherlv_3= ',' ( (lv_porta_4_0= rulePorta ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleDesligar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_tipoPorta_2_0 = null;

        EObject lv_porta_4_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:2122:2: ( (otherlv_0= 'desligar' otherlv_1= '(' ( (lv_tipoPorta_2_0= ruleTipoPorta ) ) otherlv_3= ',' ( (lv_porta_4_0= rulePorta ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalOiArdubot.g:2123:2: (otherlv_0= 'desligar' otherlv_1= '(' ( (lv_tipoPorta_2_0= ruleTipoPorta ) ) otherlv_3= ',' ( (lv_porta_4_0= rulePorta ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalOiArdubot.g:2123:2: (otherlv_0= 'desligar' otherlv_1= '(' ( (lv_tipoPorta_2_0= ruleTipoPorta ) ) otherlv_3= ',' ( (lv_porta_4_0= rulePorta ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalOiArdubot.g:2124:3: otherlv_0= 'desligar' otherlv_1= '(' ( (lv_tipoPorta_2_0= ruleTipoPorta ) ) otherlv_3= ',' ( (lv_porta_4_0= rulePorta ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDesligarAccess().getDesligarKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDesligarAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOiArdubot.g:2132:3: ( (lv_tipoPorta_2_0= ruleTipoPorta ) )
            // InternalOiArdubot.g:2133:4: (lv_tipoPorta_2_0= ruleTipoPorta )
            {
            // InternalOiArdubot.g:2133:4: (lv_tipoPorta_2_0= ruleTipoPorta )
            // InternalOiArdubot.g:2134:5: lv_tipoPorta_2_0= ruleTipoPorta
            {

            					newCompositeNode(grammarAccess.getDesligarAccess().getTipoPortaTipoPortaEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_tipoPorta_2_0=ruleTipoPorta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDesligarRule());
            					}
            					set(
            						current,
            						"tipoPorta",
            						lv_tipoPorta_2_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.TipoPorta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getDesligarAccess().getCommaKeyword_3());
            		
            // InternalOiArdubot.g:2155:3: ( (lv_porta_4_0= rulePorta ) )
            // InternalOiArdubot.g:2156:4: (lv_porta_4_0= rulePorta )
            {
            // InternalOiArdubot.g:2156:4: (lv_porta_4_0= rulePorta )
            // InternalOiArdubot.g:2157:5: lv_porta_4_0= rulePorta
            {

            					newCompositeNode(grammarAccess.getDesligarAccess().getPortaPortaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_porta_4_0=rulePorta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDesligarRule());
            					}
            					set(
            						current,
            						"porta",
            						lv_porta_4_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Porta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getDesligarAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDesligarAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesligar"


    // $ANTLR start "entryRuleServo"
    // InternalOiArdubot.g:2186:1: entryRuleServo returns [EObject current=null] : iv_ruleServo= ruleServo EOF ;
    public final EObject entryRuleServo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServo = null;


        try {
            // InternalOiArdubot.g:2186:46: (iv_ruleServo= ruleServo EOF )
            // InternalOiArdubot.g:2187:2: iv_ruleServo= ruleServo EOF
            {
             newCompositeNode(grammarAccess.getServoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServo=ruleServo();

            state._fsp--;

             current =iv_ruleServo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServo"


    // $ANTLR start "ruleServo"
    // InternalOiArdubot.g:2193:1: ruleServo returns [EObject current=null] : (otherlv_0= 'girarServo' otherlv_1= '(' ( (lv_porta_2_0= ruleVariavelOuPorta ) ) otherlv_3= ',' ( (lv_posicao_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleServo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_posicao_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_porta_2_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:2199:2: ( (otherlv_0= 'girarServo' otherlv_1= '(' ( (lv_porta_2_0= ruleVariavelOuPorta ) ) otherlv_3= ',' ( (lv_posicao_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalOiArdubot.g:2200:2: (otherlv_0= 'girarServo' otherlv_1= '(' ( (lv_porta_2_0= ruleVariavelOuPorta ) ) otherlv_3= ',' ( (lv_posicao_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalOiArdubot.g:2200:2: (otherlv_0= 'girarServo' otherlv_1= '(' ( (lv_porta_2_0= ruleVariavelOuPorta ) ) otherlv_3= ',' ( (lv_posicao_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalOiArdubot.g:2201:3: otherlv_0= 'girarServo' otherlv_1= '(' ( (lv_porta_2_0= ruleVariavelOuPorta ) ) otherlv_3= ',' ( (lv_posicao_4_0= RULE_INT ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getServoAccess().getGirarServoKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getServoAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOiArdubot.g:2209:3: ( (lv_porta_2_0= ruleVariavelOuPorta ) )
            // InternalOiArdubot.g:2210:4: (lv_porta_2_0= ruleVariavelOuPorta )
            {
            // InternalOiArdubot.g:2210:4: (lv_porta_2_0= ruleVariavelOuPorta )
            // InternalOiArdubot.g:2211:5: lv_porta_2_0= ruleVariavelOuPorta
            {

            					newCompositeNode(grammarAccess.getServoAccess().getPortaVariavelOuPortaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_porta_2_0=ruleVariavelOuPorta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServoRule());
            					}
            					set(
            						current,
            						"porta",
            						lv_porta_2_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.VariavelOuPorta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getServoAccess().getCommaKeyword_3());
            		
            // InternalOiArdubot.g:2232:3: ( (lv_posicao_4_0= RULE_INT ) )
            // InternalOiArdubot.g:2233:4: (lv_posicao_4_0= RULE_INT )
            {
            // InternalOiArdubot.g:2233:4: (lv_posicao_4_0= RULE_INT )
            // InternalOiArdubot.g:2234:5: lv_posicao_4_0= RULE_INT
            {
            lv_posicao_4_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_posicao_4_0, grammarAccess.getServoAccess().getPosicaoINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"posicao",
            						lv_posicao_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getServoAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getServoAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServo"


    // $ANTLR start "entryRuleMotorDC"
    // InternalOiArdubot.g:2262:1: entryRuleMotorDC returns [EObject current=null] : iv_ruleMotorDC= ruleMotorDC EOF ;
    public final EObject entryRuleMotorDC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotorDC = null;


        try {
            // InternalOiArdubot.g:2262:48: (iv_ruleMotorDC= ruleMotorDC EOF )
            // InternalOiArdubot.g:2263:2: iv_ruleMotorDC= ruleMotorDC EOF
            {
             newCompositeNode(grammarAccess.getMotorDCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMotorDC=ruleMotorDC();

            state._fsp--;

             current =iv_ruleMotorDC; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMotorDC"


    // $ANTLR start "ruleMotorDC"
    // InternalOiArdubot.g:2269:1: ruleMotorDC returns [EObject current=null] : (otherlv_0= 'motorDC' otherlv_1= '(' ( (lv_estado_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_direcao_4_0= ruleDirecao ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleMotorDC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_estado_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_direcao_4_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:2275:2: ( (otherlv_0= 'motorDC' otherlv_1= '(' ( (lv_estado_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_direcao_4_0= ruleDirecao ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalOiArdubot.g:2276:2: (otherlv_0= 'motorDC' otherlv_1= '(' ( (lv_estado_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_direcao_4_0= ruleDirecao ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalOiArdubot.g:2276:2: (otherlv_0= 'motorDC' otherlv_1= '(' ( (lv_estado_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_direcao_4_0= ruleDirecao ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalOiArdubot.g:2277:3: otherlv_0= 'motorDC' otherlv_1= '(' ( (lv_estado_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_direcao_4_0= ruleDirecao ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMotorDCAccess().getMotorDCKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getMotorDCAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOiArdubot.g:2285:3: ( (lv_estado_2_0= RULE_INT ) )
            // InternalOiArdubot.g:2286:4: (lv_estado_2_0= RULE_INT )
            {
            // InternalOiArdubot.g:2286:4: (lv_estado_2_0= RULE_INT )
            // InternalOiArdubot.g:2287:5: lv_estado_2_0= RULE_INT
            {
            lv_estado_2_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_estado_2_0, grammarAccess.getMotorDCAccess().getEstadoINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMotorDCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"estado",
            						lv_estado_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getMotorDCAccess().getCommaKeyword_3());
            		
            // InternalOiArdubot.g:2307:3: ( (lv_direcao_4_0= ruleDirecao ) )
            // InternalOiArdubot.g:2308:4: (lv_direcao_4_0= ruleDirecao )
            {
            // InternalOiArdubot.g:2308:4: (lv_direcao_4_0= ruleDirecao )
            // InternalOiArdubot.g:2309:5: lv_direcao_4_0= ruleDirecao
            {

            					newCompositeNode(grammarAccess.getMotorDCAccess().getDirecaoDirecaoEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_direcao_4_0=ruleDirecao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMotorDCRule());
            					}
            					set(
            						current,
            						"direcao",
            						lv_direcao_4_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Direcao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getMotorDCAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMotorDCAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMotorDC"


    // $ANTLR start "entryRuleAndar"
    // InternalOiArdubot.g:2338:1: entryRuleAndar returns [EObject current=null] : iv_ruleAndar= ruleAndar EOF ;
    public final EObject entryRuleAndar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndar = null;


        try {
            // InternalOiArdubot.g:2338:46: (iv_ruleAndar= ruleAndar EOF )
            // InternalOiArdubot.g:2339:2: iv_ruleAndar= ruleAndar EOF
            {
             newCompositeNode(grammarAccess.getAndarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndar=ruleAndar();

            state._fsp--;

             current =iv_ruleAndar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndar"


    // $ANTLR start "ruleAndar"
    // InternalOiArdubot.g:2345:1: ruleAndar returns [EObject current=null] : (otherlv_0= 'andar' otherlv_1= '(' ( (lv_porta_2_0= ruleVariavelOuPorta ) ) otherlv_3= ',' ( (lv_velocidade_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_direcao_6_0= ruleDirecao ) ) otherlv_7= ')' otherlv_8= ';' ) ;
    public final EObject ruleAndar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_velocidade_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_porta_2_0 = null;

        Enumerator lv_direcao_6_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:2351:2: ( (otherlv_0= 'andar' otherlv_1= '(' ( (lv_porta_2_0= ruleVariavelOuPorta ) ) otherlv_3= ',' ( (lv_velocidade_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_direcao_6_0= ruleDirecao ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalOiArdubot.g:2352:2: (otherlv_0= 'andar' otherlv_1= '(' ( (lv_porta_2_0= ruleVariavelOuPorta ) ) otherlv_3= ',' ( (lv_velocidade_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_direcao_6_0= ruleDirecao ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalOiArdubot.g:2352:2: (otherlv_0= 'andar' otherlv_1= '(' ( (lv_porta_2_0= ruleVariavelOuPorta ) ) otherlv_3= ',' ( (lv_velocidade_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_direcao_6_0= ruleDirecao ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalOiArdubot.g:2353:3: otherlv_0= 'andar' otherlv_1= '(' ( (lv_porta_2_0= ruleVariavelOuPorta ) ) otherlv_3= ',' ( (lv_velocidade_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_direcao_6_0= ruleDirecao ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAndarAccess().getAndarKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getAndarAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOiArdubot.g:2361:3: ( (lv_porta_2_0= ruleVariavelOuPorta ) )
            // InternalOiArdubot.g:2362:4: (lv_porta_2_0= ruleVariavelOuPorta )
            {
            // InternalOiArdubot.g:2362:4: (lv_porta_2_0= ruleVariavelOuPorta )
            // InternalOiArdubot.g:2363:5: lv_porta_2_0= ruleVariavelOuPorta
            {

            					newCompositeNode(grammarAccess.getAndarAccess().getPortaVariavelOuPortaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_porta_2_0=ruleVariavelOuPorta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndarRule());
            					}
            					set(
            						current,
            						"porta",
            						lv_porta_2_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.VariavelOuPorta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getAndarAccess().getCommaKeyword_3());
            		
            // InternalOiArdubot.g:2384:3: ( (lv_velocidade_4_0= RULE_INT ) )
            // InternalOiArdubot.g:2385:4: (lv_velocidade_4_0= RULE_INT )
            {
            // InternalOiArdubot.g:2385:4: (lv_velocidade_4_0= RULE_INT )
            // InternalOiArdubot.g:2386:5: lv_velocidade_4_0= RULE_INT
            {
            lv_velocidade_4_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_velocidade_4_0, grammarAccess.getAndarAccess().getVelocidadeINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAndarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"velocidade",
            						lv_velocidade_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getAndarAccess().getCommaKeyword_5());
            		
            // InternalOiArdubot.g:2406:3: ( (lv_direcao_6_0= ruleDirecao ) )
            // InternalOiArdubot.g:2407:4: (lv_direcao_6_0= ruleDirecao )
            {
            // InternalOiArdubot.g:2407:4: (lv_direcao_6_0= ruleDirecao )
            // InternalOiArdubot.g:2408:5: lv_direcao_6_0= ruleDirecao
            {

            					newCompositeNode(grammarAccess.getAndarAccess().getDirecaoDirecaoEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_direcao_6_0=ruleDirecao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndarRule());
            					}
            					set(
            						current,
            						"direcao",
            						lv_direcao_6_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Direcao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getAndarAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAndarAccess().getSemicolonKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndar"


    // $ANTLR start "entryRuleParar"
    // InternalOiArdubot.g:2437:1: entryRuleParar returns [EObject current=null] : iv_ruleParar= ruleParar EOF ;
    public final EObject entryRuleParar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParar = null;


        try {
            // InternalOiArdubot.g:2437:46: (iv_ruleParar= ruleParar EOF )
            // InternalOiArdubot.g:2438:2: iv_ruleParar= ruleParar EOF
            {
             newCompositeNode(grammarAccess.getPararRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParar=ruleParar();

            state._fsp--;

             current =iv_ruleParar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParar"


    // $ANTLR start "ruleParar"
    // InternalOiArdubot.g:2444:1: ruleParar returns [EObject current=null] : (otherlv_0= 'parar' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleParar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_porta_2_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:2450:2: ( (otherlv_0= 'parar' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalOiArdubot.g:2451:2: (otherlv_0= 'parar' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalOiArdubot.g:2451:2: (otherlv_0= 'parar' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalOiArdubot.g:2452:3: otherlv_0= 'parar' otherlv_1= '(' ( (lv_porta_2_0= rulePorta ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPararAccess().getPararKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPararAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOiArdubot.g:2460:3: ( (lv_porta_2_0= rulePorta ) )
            // InternalOiArdubot.g:2461:4: (lv_porta_2_0= rulePorta )
            {
            // InternalOiArdubot.g:2461:4: (lv_porta_2_0= rulePorta )
            // InternalOiArdubot.g:2462:5: lv_porta_2_0= rulePorta
            {

            					newCompositeNode(grammarAccess.getPararAccess().getPortaPortaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_porta_2_0=rulePorta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPararRule());
            					}
            					set(
            						current,
            						"porta",
            						lv_porta_2_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Porta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getPararAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPararAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParar"


    // $ANTLR start "entryRulePara"
    // InternalOiArdubot.g:2491:1: entryRulePara returns [EObject current=null] : iv_rulePara= rulePara EOF ;
    public final EObject entryRulePara() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePara = null;


        try {
            // InternalOiArdubot.g:2491:45: (iv_rulePara= rulePara EOF )
            // InternalOiArdubot.g:2492:2: iv_rulePara= rulePara EOF
            {
             newCompositeNode(grammarAccess.getParaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePara=rulePara();

            state._fsp--;

             current =iv_rulePara; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePara"


    // $ANTLR start "rulePara"
    // InternalOiArdubot.g:2498:1: rulePara returns [EObject current=null] : (otherlv_0= 'para' ( (lv_variavel_1_0= RULE_ID ) ) otherlv_2= 'de' ( (lv_de_3_0= RULE_INT ) ) otherlv_4= 'ate' ( (lv_ate_5_0= RULE_INT ) ) otherlv_6= 'faca' ( (lv_code_7_0= ruleImplementacao ) )* ( (lv_fimpara_8_0= ruleFimPara ) ) ) ;
    public final EObject rulePara() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variavel_1_0=null;
        Token otherlv_2=null;
        Token lv_de_3_0=null;
        Token otherlv_4=null;
        Token lv_ate_5_0=null;
        Token otherlv_6=null;
        EObject lv_code_7_0 = null;

        EObject lv_fimpara_8_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:2504:2: ( (otherlv_0= 'para' ( (lv_variavel_1_0= RULE_ID ) ) otherlv_2= 'de' ( (lv_de_3_0= RULE_INT ) ) otherlv_4= 'ate' ( (lv_ate_5_0= RULE_INT ) ) otherlv_6= 'faca' ( (lv_code_7_0= ruleImplementacao ) )* ( (lv_fimpara_8_0= ruleFimPara ) ) ) )
            // InternalOiArdubot.g:2505:2: (otherlv_0= 'para' ( (lv_variavel_1_0= RULE_ID ) ) otherlv_2= 'de' ( (lv_de_3_0= RULE_INT ) ) otherlv_4= 'ate' ( (lv_ate_5_0= RULE_INT ) ) otherlv_6= 'faca' ( (lv_code_7_0= ruleImplementacao ) )* ( (lv_fimpara_8_0= ruleFimPara ) ) )
            {
            // InternalOiArdubot.g:2505:2: (otherlv_0= 'para' ( (lv_variavel_1_0= RULE_ID ) ) otherlv_2= 'de' ( (lv_de_3_0= RULE_INT ) ) otherlv_4= 'ate' ( (lv_ate_5_0= RULE_INT ) ) otherlv_6= 'faca' ( (lv_code_7_0= ruleImplementacao ) )* ( (lv_fimpara_8_0= ruleFimPara ) ) )
            // InternalOiArdubot.g:2506:3: otherlv_0= 'para' ( (lv_variavel_1_0= RULE_ID ) ) otherlv_2= 'de' ( (lv_de_3_0= RULE_INT ) ) otherlv_4= 'ate' ( (lv_ate_5_0= RULE_INT ) ) otherlv_6= 'faca' ( (lv_code_7_0= ruleImplementacao ) )* ( (lv_fimpara_8_0= ruleFimPara ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getParaAccess().getParaKeyword_0());
            		
            // InternalOiArdubot.g:2510:3: ( (lv_variavel_1_0= RULE_ID ) )
            // InternalOiArdubot.g:2511:4: (lv_variavel_1_0= RULE_ID )
            {
            // InternalOiArdubot.g:2511:4: (lv_variavel_1_0= RULE_ID )
            // InternalOiArdubot.g:2512:5: lv_variavel_1_0= RULE_ID
            {
            lv_variavel_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_variavel_1_0, grammarAccess.getParaAccess().getVariavelIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variavel",
            						lv_variavel_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getParaAccess().getDeKeyword_2());
            		
            // InternalOiArdubot.g:2532:3: ( (lv_de_3_0= RULE_INT ) )
            // InternalOiArdubot.g:2533:4: (lv_de_3_0= RULE_INT )
            {
            // InternalOiArdubot.g:2533:4: (lv_de_3_0= RULE_INT )
            // InternalOiArdubot.g:2534:5: lv_de_3_0= RULE_INT
            {
            lv_de_3_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_de_3_0, grammarAccess.getParaAccess().getDeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"de",
            						lv_de_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getParaAccess().getAteKeyword_4());
            		
            // InternalOiArdubot.g:2554:3: ( (lv_ate_5_0= RULE_INT ) )
            // InternalOiArdubot.g:2555:4: (lv_ate_5_0= RULE_INT )
            {
            // InternalOiArdubot.g:2555:4: (lv_ate_5_0= RULE_INT )
            // InternalOiArdubot.g:2556:5: lv_ate_5_0= RULE_INT
            {
            lv_ate_5_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_ate_5_0, grammarAccess.getParaAccess().getAteINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ate",
            						lv_ate_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,46,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getParaAccess().getFacaKeyword_6());
            		
            // InternalOiArdubot.g:2576:3: ( (lv_code_7_0= ruleImplementacao ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=30 && LA20_0<=32)||LA20_0==36||(LA20_0>=38 && LA20_0<=43)||LA20_0==48||(LA20_0>=50 && LA20_0<=51)||LA20_0==55||LA20_0==59||LA20_0==63||(LA20_0>=66 && LA20_0<=67)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOiArdubot.g:2577:4: (lv_code_7_0= ruleImplementacao )
            	    {
            	    // InternalOiArdubot.g:2577:4: (lv_code_7_0= ruleImplementacao )
            	    // InternalOiArdubot.g:2578:5: lv_code_7_0= ruleImplementacao
            	    {

            	    					newCompositeNode(grammarAccess.getParaAccess().getCodeImplementacaoParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_code_7_0=ruleImplementacao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"code",
            	    						lv_code_7_0,
            	    						"br.edu.utfpr.oiardubot.OiArdubot.Implementacao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalOiArdubot.g:2595:3: ( (lv_fimpara_8_0= ruleFimPara ) )
            // InternalOiArdubot.g:2596:4: (lv_fimpara_8_0= ruleFimPara )
            {
            // InternalOiArdubot.g:2596:4: (lv_fimpara_8_0= ruleFimPara )
            // InternalOiArdubot.g:2597:5: lv_fimpara_8_0= ruleFimPara
            {

            					newCompositeNode(grammarAccess.getParaAccess().getFimparaFimParaParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_fimpara_8_0=ruleFimPara();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParaRule());
            					}
            					set(
            						current,
            						"fimpara",
            						lv_fimpara_8_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.FimPara");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePara"


    // $ANTLR start "entryRuleFimPara"
    // InternalOiArdubot.g:2618:1: entryRuleFimPara returns [EObject current=null] : iv_ruleFimPara= ruleFimPara EOF ;
    public final EObject entryRuleFimPara() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFimPara = null;


        try {
            // InternalOiArdubot.g:2618:48: (iv_ruleFimPara= ruleFimPara EOF )
            // InternalOiArdubot.g:2619:2: iv_ruleFimPara= ruleFimPara EOF
            {
             newCompositeNode(grammarAccess.getFimParaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFimPara=ruleFimPara();

            state._fsp--;

             current =iv_ruleFimPara; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFimPara"


    // $ANTLR start "ruleFimPara"
    // InternalOiArdubot.g:2625:1: ruleFimPara returns [EObject current=null] : ( (lv_name_0_0= 'fimpara' ) ) ;
    public final EObject ruleFimPara() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:2631:2: ( ( (lv_name_0_0= 'fimpara' ) ) )
            // InternalOiArdubot.g:2632:2: ( (lv_name_0_0= 'fimpara' ) )
            {
            // InternalOiArdubot.g:2632:2: ( (lv_name_0_0= 'fimpara' ) )
            // InternalOiArdubot.g:2633:3: (lv_name_0_0= 'fimpara' )
            {
            // InternalOiArdubot.g:2633:3: (lv_name_0_0= 'fimpara' )
            // InternalOiArdubot.g:2634:4: lv_name_0_0= 'fimpara'
            {
            lv_name_0_0=(Token)match(input,47,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFimParaAccess().getNameFimparaKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFimParaRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "fimpara");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFimPara"


    // $ANTLR start "entryRuleEnquanto"
    // InternalOiArdubot.g:2649:1: entryRuleEnquanto returns [EObject current=null] : iv_ruleEnquanto= ruleEnquanto EOF ;
    public final EObject entryRuleEnquanto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnquanto = null;


        try {
            // InternalOiArdubot.g:2649:49: (iv_ruleEnquanto= ruleEnquanto EOF )
            // InternalOiArdubot.g:2650:2: iv_ruleEnquanto= ruleEnquanto EOF
            {
             newCompositeNode(grammarAccess.getEnquantoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnquanto=ruleEnquanto();

            state._fsp--;

             current =iv_ruleEnquanto; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnquanto"


    // $ANTLR start "ruleEnquanto"
    // InternalOiArdubot.g:2656:1: ruleEnquanto returns [EObject current=null] : (otherlv_0= 'enquanto' otherlv_1= '(' ( (lv_valorEsquerda_2_0= ruleVariavelValor ) ) ( (lv_relacao_3_0= ruleLogico ) ) ( (lv_valorDireita_4_0= ruleVariavelValor ) ) otherlv_5= ')' otherlv_6= 'faca' ( (lv_code_7_0= ruleImplementacao ) )* otherlv_8= 'fimenquanto' ) ;
    public final EObject ruleEnquanto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_valorEsquerda_2_0 = null;

        EObject lv_relacao_3_0 = null;

        AntlrDatatypeRuleToken lv_valorDireita_4_0 = null;

        EObject lv_code_7_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:2662:2: ( (otherlv_0= 'enquanto' otherlv_1= '(' ( (lv_valorEsquerda_2_0= ruleVariavelValor ) ) ( (lv_relacao_3_0= ruleLogico ) ) ( (lv_valorDireita_4_0= ruleVariavelValor ) ) otherlv_5= ')' otherlv_6= 'faca' ( (lv_code_7_0= ruleImplementacao ) )* otherlv_8= 'fimenquanto' ) )
            // InternalOiArdubot.g:2663:2: (otherlv_0= 'enquanto' otherlv_1= '(' ( (lv_valorEsquerda_2_0= ruleVariavelValor ) ) ( (lv_relacao_3_0= ruleLogico ) ) ( (lv_valorDireita_4_0= ruleVariavelValor ) ) otherlv_5= ')' otherlv_6= 'faca' ( (lv_code_7_0= ruleImplementacao ) )* otherlv_8= 'fimenquanto' )
            {
            // InternalOiArdubot.g:2663:2: (otherlv_0= 'enquanto' otherlv_1= '(' ( (lv_valorEsquerda_2_0= ruleVariavelValor ) ) ( (lv_relacao_3_0= ruleLogico ) ) ( (lv_valorDireita_4_0= ruleVariavelValor ) ) otherlv_5= ')' otherlv_6= 'faca' ( (lv_code_7_0= ruleImplementacao ) )* otherlv_8= 'fimenquanto' )
            // InternalOiArdubot.g:2664:3: otherlv_0= 'enquanto' otherlv_1= '(' ( (lv_valorEsquerda_2_0= ruleVariavelValor ) ) ( (lv_relacao_3_0= ruleLogico ) ) ( (lv_valorDireita_4_0= ruleVariavelValor ) ) otherlv_5= ')' otherlv_6= 'faca' ( (lv_code_7_0= ruleImplementacao ) )* otherlv_8= 'fimenquanto'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEnquantoAccess().getEnquantoKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEnquantoAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOiArdubot.g:2672:3: ( (lv_valorEsquerda_2_0= ruleVariavelValor ) )
            // InternalOiArdubot.g:2673:4: (lv_valorEsquerda_2_0= ruleVariavelValor )
            {
            // InternalOiArdubot.g:2673:4: (lv_valorEsquerda_2_0= ruleVariavelValor )
            // InternalOiArdubot.g:2674:5: lv_valorEsquerda_2_0= ruleVariavelValor
            {

            					newCompositeNode(grammarAccess.getEnquantoAccess().getValorEsquerdaVariavelValorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_valorEsquerda_2_0=ruleVariavelValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnquantoRule());
            					}
            					set(
            						current,
            						"valorEsquerda",
            						lv_valorEsquerda_2_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.VariavelValor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:2691:3: ( (lv_relacao_3_0= ruleLogico ) )
            // InternalOiArdubot.g:2692:4: (lv_relacao_3_0= ruleLogico )
            {
            // InternalOiArdubot.g:2692:4: (lv_relacao_3_0= ruleLogico )
            // InternalOiArdubot.g:2693:5: lv_relacao_3_0= ruleLogico
            {

            					newCompositeNode(grammarAccess.getEnquantoAccess().getRelacaoLogicoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_relacao_3_0=ruleLogico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnquantoRule());
            					}
            					set(
            						current,
            						"relacao",
            						lv_relacao_3_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Logico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:2710:3: ( (lv_valorDireita_4_0= ruleVariavelValor ) )
            // InternalOiArdubot.g:2711:4: (lv_valorDireita_4_0= ruleVariavelValor )
            {
            // InternalOiArdubot.g:2711:4: (lv_valorDireita_4_0= ruleVariavelValor )
            // InternalOiArdubot.g:2712:5: lv_valorDireita_4_0= ruleVariavelValor
            {

            					newCompositeNode(grammarAccess.getEnquantoAccess().getValorDireitaVariavelValorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_valorDireita_4_0=ruleVariavelValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnquantoRule());
            					}
            					set(
            						current,
            						"valorDireita",
            						lv_valorDireita_4_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.VariavelValor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getEnquantoAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,46,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getEnquantoAccess().getFacaKeyword_6());
            		
            // InternalOiArdubot.g:2737:3: ( (lv_code_7_0= ruleImplementacao ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=30 && LA21_0<=32)||LA21_0==36||(LA21_0>=38 && LA21_0<=43)||LA21_0==48||(LA21_0>=50 && LA21_0<=51)||LA21_0==55||LA21_0==59||LA21_0==63||(LA21_0>=66 && LA21_0<=67)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOiArdubot.g:2738:4: (lv_code_7_0= ruleImplementacao )
            	    {
            	    // InternalOiArdubot.g:2738:4: (lv_code_7_0= ruleImplementacao )
            	    // InternalOiArdubot.g:2739:5: lv_code_7_0= ruleImplementacao
            	    {

            	    					newCompositeNode(grammarAccess.getEnquantoAccess().getCodeImplementacaoParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_code_7_0=ruleImplementacao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnquantoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"code",
            	    						lv_code_7_0,
            	    						"br.edu.utfpr.oiardubot.OiArdubot.Implementacao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_8=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEnquantoAccess().getFimenquantoKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnquanto"


    // $ANTLR start "entryRuleRepita"
    // InternalOiArdubot.g:2764:1: entryRuleRepita returns [EObject current=null] : iv_ruleRepita= ruleRepita EOF ;
    public final EObject entryRuleRepita() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepita = null;


        try {
            // InternalOiArdubot.g:2764:47: (iv_ruleRepita= ruleRepita EOF )
            // InternalOiArdubot.g:2765:2: iv_ruleRepita= ruleRepita EOF
            {
             newCompositeNode(grammarAccess.getRepitaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepita=ruleRepita();

            state._fsp--;

             current =iv_ruleRepita; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepita"


    // $ANTLR start "ruleRepita"
    // InternalOiArdubot.g:2771:1: ruleRepita returns [EObject current=null] : (otherlv_0= 'repita' ( (lv_code_1_0= ruleImplementacao ) )* otherlv_2= 'ate' otherlv_3= '(' ( (lv_valorEsquerda_4_0= ruleVariavelValor ) ) ( (lv_relacao_5_0= ruleLogico ) ) ( (lv_valorDireita_6_0= ruleVariavelValor ) ) otherlv_7= ')' ) ;
    public final EObject ruleRepita() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_code_1_0 = null;

        AntlrDatatypeRuleToken lv_valorEsquerda_4_0 = null;

        EObject lv_relacao_5_0 = null;

        AntlrDatatypeRuleToken lv_valorDireita_6_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:2777:2: ( (otherlv_0= 'repita' ( (lv_code_1_0= ruleImplementacao ) )* otherlv_2= 'ate' otherlv_3= '(' ( (lv_valorEsquerda_4_0= ruleVariavelValor ) ) ( (lv_relacao_5_0= ruleLogico ) ) ( (lv_valorDireita_6_0= ruleVariavelValor ) ) otherlv_7= ')' ) )
            // InternalOiArdubot.g:2778:2: (otherlv_0= 'repita' ( (lv_code_1_0= ruleImplementacao ) )* otherlv_2= 'ate' otherlv_3= '(' ( (lv_valorEsquerda_4_0= ruleVariavelValor ) ) ( (lv_relacao_5_0= ruleLogico ) ) ( (lv_valorDireita_6_0= ruleVariavelValor ) ) otherlv_7= ')' )
            {
            // InternalOiArdubot.g:2778:2: (otherlv_0= 'repita' ( (lv_code_1_0= ruleImplementacao ) )* otherlv_2= 'ate' otherlv_3= '(' ( (lv_valorEsquerda_4_0= ruleVariavelValor ) ) ( (lv_relacao_5_0= ruleLogico ) ) ( (lv_valorDireita_6_0= ruleVariavelValor ) ) otherlv_7= ')' )
            // InternalOiArdubot.g:2779:3: otherlv_0= 'repita' ( (lv_code_1_0= ruleImplementacao ) )* otherlv_2= 'ate' otherlv_3= '(' ( (lv_valorEsquerda_4_0= ruleVariavelValor ) ) ( (lv_relacao_5_0= ruleLogico ) ) ( (lv_valorDireita_6_0= ruleVariavelValor ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getRepitaAccess().getRepitaKeyword_0());
            		
            // InternalOiArdubot.g:2783:3: ( (lv_code_1_0= ruleImplementacao ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=30 && LA22_0<=32)||LA22_0==36||(LA22_0>=38 && LA22_0<=43)||LA22_0==48||(LA22_0>=50 && LA22_0<=51)||LA22_0==55||LA22_0==59||LA22_0==63||(LA22_0>=66 && LA22_0<=67)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOiArdubot.g:2784:4: (lv_code_1_0= ruleImplementacao )
            	    {
            	    // InternalOiArdubot.g:2784:4: (lv_code_1_0= ruleImplementacao )
            	    // InternalOiArdubot.g:2785:5: lv_code_1_0= ruleImplementacao
            	    {

            	    					newCompositeNode(grammarAccess.getRepitaAccess().getCodeImplementacaoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_code_1_0=ruleImplementacao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepitaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"code",
            	    						lv_code_1_0,
            	    						"br.edu.utfpr.oiardubot.OiArdubot.Implementacao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_2=(Token)match(input,45,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getRepitaAccess().getAteKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRepitaAccess().getLeftParenthesisKeyword_3());
            		
            // InternalOiArdubot.g:2810:3: ( (lv_valorEsquerda_4_0= ruleVariavelValor ) )
            // InternalOiArdubot.g:2811:4: (lv_valorEsquerda_4_0= ruleVariavelValor )
            {
            // InternalOiArdubot.g:2811:4: (lv_valorEsquerda_4_0= ruleVariavelValor )
            // InternalOiArdubot.g:2812:5: lv_valorEsquerda_4_0= ruleVariavelValor
            {

            					newCompositeNode(grammarAccess.getRepitaAccess().getValorEsquerdaVariavelValorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_valorEsquerda_4_0=ruleVariavelValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepitaRule());
            					}
            					set(
            						current,
            						"valorEsquerda",
            						lv_valorEsquerda_4_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.VariavelValor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:2829:3: ( (lv_relacao_5_0= ruleLogico ) )
            // InternalOiArdubot.g:2830:4: (lv_relacao_5_0= ruleLogico )
            {
            // InternalOiArdubot.g:2830:4: (lv_relacao_5_0= ruleLogico )
            // InternalOiArdubot.g:2831:5: lv_relacao_5_0= ruleLogico
            {

            					newCompositeNode(grammarAccess.getRepitaAccess().getRelacaoLogicoParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_relacao_5_0=ruleLogico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepitaRule());
            					}
            					set(
            						current,
            						"relacao",
            						lv_relacao_5_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Logico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:2848:3: ( (lv_valorDireita_6_0= ruleVariavelValor ) )
            // InternalOiArdubot.g:2849:4: (lv_valorDireita_6_0= ruleVariavelValor )
            {
            // InternalOiArdubot.g:2849:4: (lv_valorDireita_6_0= ruleVariavelValor )
            // InternalOiArdubot.g:2850:5: lv_valorDireita_6_0= ruleVariavelValor
            {

            					newCompositeNode(grammarAccess.getRepitaAccess().getValorDireitaVariavelValorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_valorDireita_6_0=ruleVariavelValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepitaRule());
            					}
            					set(
            						current,
            						"valorDireita",
            						lv_valorDireita_6_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.VariavelValor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRepitaAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepita"


    // $ANTLR start "entryRuleSe"
    // InternalOiArdubot.g:2875:1: entryRuleSe returns [EObject current=null] : iv_ruleSe= ruleSe EOF ;
    public final EObject entryRuleSe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSe = null;


        try {
            // InternalOiArdubot.g:2875:43: (iv_ruleSe= ruleSe EOF )
            // InternalOiArdubot.g:2876:2: iv_ruleSe= ruleSe EOF
            {
             newCompositeNode(grammarAccess.getSeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSe=ruleSe();

            state._fsp--;

             current =iv_ruleSe; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSe"


    // $ANTLR start "ruleSe"
    // InternalOiArdubot.g:2882:1: ruleSe returns [EObject current=null] : (otherlv_0= 'se' ( (lv_valorEsquerda_1_0= ruleVariavelValor ) ) ( (lv_relacao_2_0= ruleLogico ) ) ( (lv_valorDireita_3_0= ruleVariavelValor ) ) otherlv_4= 'entao' ( (lv_code_5_0= ruleImplementacao ) )* ( (lv_senao_6_0= ruleSenao ) )? ( (lv_fimse_7_0= ruleFimse ) ) ) ;
    public final EObject ruleSe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_valorEsquerda_1_0 = null;

        EObject lv_relacao_2_0 = null;

        AntlrDatatypeRuleToken lv_valorDireita_3_0 = null;

        EObject lv_code_5_0 = null;

        EObject lv_senao_6_0 = null;

        EObject lv_fimse_7_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:2888:2: ( (otherlv_0= 'se' ( (lv_valorEsquerda_1_0= ruleVariavelValor ) ) ( (lv_relacao_2_0= ruleLogico ) ) ( (lv_valorDireita_3_0= ruleVariavelValor ) ) otherlv_4= 'entao' ( (lv_code_5_0= ruleImplementacao ) )* ( (lv_senao_6_0= ruleSenao ) )? ( (lv_fimse_7_0= ruleFimse ) ) ) )
            // InternalOiArdubot.g:2889:2: (otherlv_0= 'se' ( (lv_valorEsquerda_1_0= ruleVariavelValor ) ) ( (lv_relacao_2_0= ruleLogico ) ) ( (lv_valorDireita_3_0= ruleVariavelValor ) ) otherlv_4= 'entao' ( (lv_code_5_0= ruleImplementacao ) )* ( (lv_senao_6_0= ruleSenao ) )? ( (lv_fimse_7_0= ruleFimse ) ) )
            {
            // InternalOiArdubot.g:2889:2: (otherlv_0= 'se' ( (lv_valorEsquerda_1_0= ruleVariavelValor ) ) ( (lv_relacao_2_0= ruleLogico ) ) ( (lv_valorDireita_3_0= ruleVariavelValor ) ) otherlv_4= 'entao' ( (lv_code_5_0= ruleImplementacao ) )* ( (lv_senao_6_0= ruleSenao ) )? ( (lv_fimse_7_0= ruleFimse ) ) )
            // InternalOiArdubot.g:2890:3: otherlv_0= 'se' ( (lv_valorEsquerda_1_0= ruleVariavelValor ) ) ( (lv_relacao_2_0= ruleLogico ) ) ( (lv_valorDireita_3_0= ruleVariavelValor ) ) otherlv_4= 'entao' ( (lv_code_5_0= ruleImplementacao ) )* ( (lv_senao_6_0= ruleSenao ) )? ( (lv_fimse_7_0= ruleFimse ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSeAccess().getSeKeyword_0());
            		
            // InternalOiArdubot.g:2894:3: ( (lv_valorEsquerda_1_0= ruleVariavelValor ) )
            // InternalOiArdubot.g:2895:4: (lv_valorEsquerda_1_0= ruleVariavelValor )
            {
            // InternalOiArdubot.g:2895:4: (lv_valorEsquerda_1_0= ruleVariavelValor )
            // InternalOiArdubot.g:2896:5: lv_valorEsquerda_1_0= ruleVariavelValor
            {

            					newCompositeNode(grammarAccess.getSeAccess().getValorEsquerdaVariavelValorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_valorEsquerda_1_0=ruleVariavelValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeRule());
            					}
            					set(
            						current,
            						"valorEsquerda",
            						lv_valorEsquerda_1_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.VariavelValor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:2913:3: ( (lv_relacao_2_0= ruleLogico ) )
            // InternalOiArdubot.g:2914:4: (lv_relacao_2_0= ruleLogico )
            {
            // InternalOiArdubot.g:2914:4: (lv_relacao_2_0= ruleLogico )
            // InternalOiArdubot.g:2915:5: lv_relacao_2_0= ruleLogico
            {

            					newCompositeNode(grammarAccess.getSeAccess().getRelacaoLogicoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_relacao_2_0=ruleLogico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeRule());
            					}
            					set(
            						current,
            						"relacao",
            						lv_relacao_2_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Logico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:2932:3: ( (lv_valorDireita_3_0= ruleVariavelValor ) )
            // InternalOiArdubot.g:2933:4: (lv_valorDireita_3_0= ruleVariavelValor )
            {
            // InternalOiArdubot.g:2933:4: (lv_valorDireita_3_0= ruleVariavelValor )
            // InternalOiArdubot.g:2934:5: lv_valorDireita_3_0= ruleVariavelValor
            {

            					newCompositeNode(grammarAccess.getSeAccess().getValorDireitaVariavelValorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_valorDireita_3_0=ruleVariavelValor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeRule());
            					}
            					set(
            						current,
            						"valorDireita",
            						lv_valorDireita_3_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.VariavelValor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,52,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getSeAccess().getEntaoKeyword_4());
            		
            // InternalOiArdubot.g:2955:3: ( (lv_code_5_0= ruleImplementacao ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=30 && LA23_0<=32)||LA23_0==36||(LA23_0>=38 && LA23_0<=43)||LA23_0==48||(LA23_0>=50 && LA23_0<=51)||LA23_0==55||LA23_0==59||LA23_0==63||(LA23_0>=66 && LA23_0<=67)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOiArdubot.g:2956:4: (lv_code_5_0= ruleImplementacao )
            	    {
            	    // InternalOiArdubot.g:2956:4: (lv_code_5_0= ruleImplementacao )
            	    // InternalOiArdubot.g:2957:5: lv_code_5_0= ruleImplementacao
            	    {

            	    					newCompositeNode(grammarAccess.getSeAccess().getCodeImplementacaoParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_code_5_0=ruleImplementacao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"code",
            	    						lv_code_5_0,
            	    						"br.edu.utfpr.oiardubot.OiArdubot.Implementacao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalOiArdubot.g:2974:3: ( (lv_senao_6_0= ruleSenao ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOiArdubot.g:2975:4: (lv_senao_6_0= ruleSenao )
                    {
                    // InternalOiArdubot.g:2975:4: (lv_senao_6_0= ruleSenao )
                    // InternalOiArdubot.g:2976:5: lv_senao_6_0= ruleSenao
                    {

                    					newCompositeNode(grammarAccess.getSeAccess().getSenaoSenaoParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_33);
                    lv_senao_6_0=ruleSenao();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSeRule());
                    					}
                    					set(
                    						current,
                    						"senao",
                    						lv_senao_6_0,
                    						"br.edu.utfpr.oiardubot.OiArdubot.Senao");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOiArdubot.g:2993:3: ( (lv_fimse_7_0= ruleFimse ) )
            // InternalOiArdubot.g:2994:4: (lv_fimse_7_0= ruleFimse )
            {
            // InternalOiArdubot.g:2994:4: (lv_fimse_7_0= ruleFimse )
            // InternalOiArdubot.g:2995:5: lv_fimse_7_0= ruleFimse
            {

            					newCompositeNode(grammarAccess.getSeAccess().getFimseFimseParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_fimse_7_0=ruleFimse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeRule());
            					}
            					set(
            						current,
            						"fimse",
            						lv_fimse_7_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Fimse");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSe"


    // $ANTLR start "entryRuleFimse"
    // InternalOiArdubot.g:3016:1: entryRuleFimse returns [EObject current=null] : iv_ruleFimse= ruleFimse EOF ;
    public final EObject entryRuleFimse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFimse = null;


        try {
            // InternalOiArdubot.g:3016:46: (iv_ruleFimse= ruleFimse EOF )
            // InternalOiArdubot.g:3017:2: iv_ruleFimse= ruleFimse EOF
            {
             newCompositeNode(grammarAccess.getFimseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFimse=ruleFimse();

            state._fsp--;

             current =iv_ruleFimse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFimse"


    // $ANTLR start "ruleFimse"
    // InternalOiArdubot.g:3023:1: ruleFimse returns [EObject current=null] : ( (lv_name_0_0= 'fimse' ) ) ;
    public final EObject ruleFimse() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:3029:2: ( ( (lv_name_0_0= 'fimse' ) ) )
            // InternalOiArdubot.g:3030:2: ( (lv_name_0_0= 'fimse' ) )
            {
            // InternalOiArdubot.g:3030:2: ( (lv_name_0_0= 'fimse' ) )
            // InternalOiArdubot.g:3031:3: (lv_name_0_0= 'fimse' )
            {
            // InternalOiArdubot.g:3031:3: (lv_name_0_0= 'fimse' )
            // InternalOiArdubot.g:3032:4: lv_name_0_0= 'fimse'
            {
            lv_name_0_0=(Token)match(input,53,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFimseAccess().getNameFimseKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFimseRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "fimse");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFimse"


    // $ANTLR start "entryRuleSenao"
    // InternalOiArdubot.g:3047:1: entryRuleSenao returns [EObject current=null] : iv_ruleSenao= ruleSenao EOF ;
    public final EObject entryRuleSenao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenao = null;


        try {
            // InternalOiArdubot.g:3047:46: (iv_ruleSenao= ruleSenao EOF )
            // InternalOiArdubot.g:3048:2: iv_ruleSenao= ruleSenao EOF
            {
             newCompositeNode(grammarAccess.getSenaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSenao=ruleSenao();

            state._fsp--;

             current =iv_ruleSenao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSenao"


    // $ANTLR start "ruleSenao"
    // InternalOiArdubot.g:3054:1: ruleSenao returns [EObject current=null] : (otherlv_0= 'senao' ( (lv_code_1_0= ruleImplementacao ) )* ) ;
    public final EObject ruleSenao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_code_1_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:3060:2: ( (otherlv_0= 'senao' ( (lv_code_1_0= ruleImplementacao ) )* ) )
            // InternalOiArdubot.g:3061:2: (otherlv_0= 'senao' ( (lv_code_1_0= ruleImplementacao ) )* )
            {
            // InternalOiArdubot.g:3061:2: (otherlv_0= 'senao' ( (lv_code_1_0= ruleImplementacao ) )* )
            // InternalOiArdubot.g:3062:3: otherlv_0= 'senao' ( (lv_code_1_0= ruleImplementacao ) )*
            {
            otherlv_0=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSenaoAccess().getSenaoKeyword_0());
            		
            // InternalOiArdubot.g:3066:3: ( (lv_code_1_0= ruleImplementacao ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=30 && LA25_0<=32)||LA25_0==36||(LA25_0>=38 && LA25_0<=43)||LA25_0==48||(LA25_0>=50 && LA25_0<=51)||LA25_0==55||LA25_0==59||LA25_0==63||(LA25_0>=66 && LA25_0<=67)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalOiArdubot.g:3067:4: (lv_code_1_0= ruleImplementacao )
            	    {
            	    // InternalOiArdubot.g:3067:4: (lv_code_1_0= ruleImplementacao )
            	    // InternalOiArdubot.g:3068:5: lv_code_1_0= ruleImplementacao
            	    {

            	    					newCompositeNode(grammarAccess.getSenaoAccess().getCodeImplementacaoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_code_1_0=ruleImplementacao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSenaoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"code",
            	    						lv_code_1_0,
            	    						"br.edu.utfpr.oiardubot.OiArdubot.Implementacao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSenao"


    // $ANTLR start "entryRuleEscolha"
    // InternalOiArdubot.g:3089:1: entryRuleEscolha returns [EObject current=null] : iv_ruleEscolha= ruleEscolha EOF ;
    public final EObject entryRuleEscolha() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscolha = null;


        try {
            // InternalOiArdubot.g:3089:48: (iv_ruleEscolha= ruleEscolha EOF )
            // InternalOiArdubot.g:3090:2: iv_ruleEscolha= ruleEscolha EOF
            {
             newCompositeNode(grammarAccess.getEscolhaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEscolha=ruleEscolha();

            state._fsp--;

             current =iv_ruleEscolha; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEscolha"


    // $ANTLR start "ruleEscolha"
    // InternalOiArdubot.g:3096:1: ruleEscolha returns [EObject current=null] : (otherlv_0= 'escolha' ( (lv_valor_1_0= ruleValorReferencia ) ) ( (lv_casos_2_0= ruleCaso ) )+ otherlv_3= 'fimescolha' ) ;
    public final EObject ruleEscolha() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_valor_1_0 = null;

        EObject lv_casos_2_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:3102:2: ( (otherlv_0= 'escolha' ( (lv_valor_1_0= ruleValorReferencia ) ) ( (lv_casos_2_0= ruleCaso ) )+ otherlv_3= 'fimescolha' ) )
            // InternalOiArdubot.g:3103:2: (otherlv_0= 'escolha' ( (lv_valor_1_0= ruleValorReferencia ) ) ( (lv_casos_2_0= ruleCaso ) )+ otherlv_3= 'fimescolha' )
            {
            // InternalOiArdubot.g:3103:2: (otherlv_0= 'escolha' ( (lv_valor_1_0= ruleValorReferencia ) ) ( (lv_casos_2_0= ruleCaso ) )+ otherlv_3= 'fimescolha' )
            // InternalOiArdubot.g:3104:3: otherlv_0= 'escolha' ( (lv_valor_1_0= ruleValorReferencia ) ) ( (lv_casos_2_0= ruleCaso ) )+ otherlv_3= 'fimescolha'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEscolhaAccess().getEscolhaKeyword_0());
            		
            // InternalOiArdubot.g:3108:3: ( (lv_valor_1_0= ruleValorReferencia ) )
            // InternalOiArdubot.g:3109:4: (lv_valor_1_0= ruleValorReferencia )
            {
            // InternalOiArdubot.g:3109:4: (lv_valor_1_0= ruleValorReferencia )
            // InternalOiArdubot.g:3110:5: lv_valor_1_0= ruleValorReferencia
            {

            					newCompositeNode(grammarAccess.getEscolhaAccess().getValorValorReferenciaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_valor_1_0=ruleValorReferencia();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEscolhaRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_1_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.ValorReferencia");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:3127:3: ( (lv_casos_2_0= ruleCaso ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==57) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalOiArdubot.g:3128:4: (lv_casos_2_0= ruleCaso )
            	    {
            	    // InternalOiArdubot.g:3128:4: (lv_casos_2_0= ruleCaso )
            	    // InternalOiArdubot.g:3129:5: lv_casos_2_0= ruleCaso
            	    {

            	    					newCompositeNode(grammarAccess.getEscolhaAccess().getCasosCasoParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_casos_2_0=ruleCaso();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEscolhaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"casos",
            	    						lv_casos_2_0,
            	    						"br.edu.utfpr.oiardubot.OiArdubot.Caso");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_3=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEscolhaAccess().getFimescolhaKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscolha"


    // $ANTLR start "entryRuleCaso"
    // InternalOiArdubot.g:3154:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // InternalOiArdubot.g:3154:45: (iv_ruleCaso= ruleCaso EOF )
            // InternalOiArdubot.g:3155:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaso"


    // $ANTLR start "ruleCaso"
    // InternalOiArdubot.g:3161:1: ruleCaso returns [EObject current=null] : (otherlv_0= 'caso' ( (lv_valor_1_0= ruleTextoOuNumero ) ) otherlv_2= 'faca' ( (lv_codigo_3_0= ruleCodigo ) ) otherlv_4= 'fimcaso' ) ;
    public final EObject ruleCaso() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_valor_1_0 = null;

        EObject lv_codigo_3_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:3167:2: ( (otherlv_0= 'caso' ( (lv_valor_1_0= ruleTextoOuNumero ) ) otherlv_2= 'faca' ( (lv_codigo_3_0= ruleCodigo ) ) otherlv_4= 'fimcaso' ) )
            // InternalOiArdubot.g:3168:2: (otherlv_0= 'caso' ( (lv_valor_1_0= ruleTextoOuNumero ) ) otherlv_2= 'faca' ( (lv_codigo_3_0= ruleCodigo ) ) otherlv_4= 'fimcaso' )
            {
            // InternalOiArdubot.g:3168:2: (otherlv_0= 'caso' ( (lv_valor_1_0= ruleTextoOuNumero ) ) otherlv_2= 'faca' ( (lv_codigo_3_0= ruleCodigo ) ) otherlv_4= 'fimcaso' )
            // InternalOiArdubot.g:3169:3: otherlv_0= 'caso' ( (lv_valor_1_0= ruleTextoOuNumero ) ) otherlv_2= 'faca' ( (lv_codigo_3_0= ruleCodigo ) ) otherlv_4= 'fimcaso'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getCasoAccess().getCasoKeyword_0());
            		
            // InternalOiArdubot.g:3173:3: ( (lv_valor_1_0= ruleTextoOuNumero ) )
            // InternalOiArdubot.g:3174:4: (lv_valor_1_0= ruleTextoOuNumero )
            {
            // InternalOiArdubot.g:3174:4: (lv_valor_1_0= ruleTextoOuNumero )
            // InternalOiArdubot.g:3175:5: lv_valor_1_0= ruleTextoOuNumero
            {

            					newCompositeNode(grammarAccess.getCasoAccess().getValorTextoOuNumeroParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_valor_1_0=ruleTextoOuNumero();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCasoRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_1_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.TextoOuNumero");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getCasoAccess().getFacaKeyword_2());
            		
            // InternalOiArdubot.g:3196:3: ( (lv_codigo_3_0= ruleCodigo ) )
            // InternalOiArdubot.g:3197:4: (lv_codigo_3_0= ruleCodigo )
            {
            // InternalOiArdubot.g:3197:4: (lv_codigo_3_0= ruleCodigo )
            // InternalOiArdubot.g:3198:5: lv_codigo_3_0= ruleCodigo
            {

            					newCompositeNode(grammarAccess.getCasoAccess().getCodigoCodigoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
            lv_codigo_3_0=ruleCodigo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCasoRule());
            					}
            					add(
            						current,
            						"codigo",
            						lv_codigo_3_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Codigo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCasoAccess().getFimcasoKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaso"


    // $ANTLR start "entryRuleFuncao"
    // InternalOiArdubot.g:3223:1: entryRuleFuncao returns [EObject current=null] : iv_ruleFuncao= ruleFuncao EOF ;
    public final EObject entryRuleFuncao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncao = null;


        try {
            // InternalOiArdubot.g:3223:47: (iv_ruleFuncao= ruleFuncao EOF )
            // InternalOiArdubot.g:3224:2: iv_ruleFuncao= ruleFuncao EOF
            {
             newCompositeNode(grammarAccess.getFuncaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncao=ruleFuncao();

            state._fsp--;

             current =iv_ruleFuncao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncao"


    // $ANTLR start "ruleFuncao"
    // InternalOiArdubot.g:3230:1: ruleFuncao returns [EObject current=null] : (otherlv_0= 'funcao' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parametro_2_0= ruleParametro ) )? otherlv_3= ':' ( (lv_tipo_4_0= ruleTipo ) ) ( (lv_codigo_5_0= ruleImplementacao ) )* (otherlv_6= 'retorne' ( (lv_retorno_7_0= ruleVariavelValor ) ) otherlv_8= ';' )? otherlv_9= 'fimfuncao' ) ;
    public final EObject ruleFuncao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_parametro_2_0 = null;

        Enumerator lv_tipo_4_0 = null;

        EObject lv_codigo_5_0 = null;

        AntlrDatatypeRuleToken lv_retorno_7_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:3236:2: ( (otherlv_0= 'funcao' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parametro_2_0= ruleParametro ) )? otherlv_3= ':' ( (lv_tipo_4_0= ruleTipo ) ) ( (lv_codigo_5_0= ruleImplementacao ) )* (otherlv_6= 'retorne' ( (lv_retorno_7_0= ruleVariavelValor ) ) otherlv_8= ';' )? otherlv_9= 'fimfuncao' ) )
            // InternalOiArdubot.g:3237:2: (otherlv_0= 'funcao' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parametro_2_0= ruleParametro ) )? otherlv_3= ':' ( (lv_tipo_4_0= ruleTipo ) ) ( (lv_codigo_5_0= ruleImplementacao ) )* (otherlv_6= 'retorne' ( (lv_retorno_7_0= ruleVariavelValor ) ) otherlv_8= ';' )? otherlv_9= 'fimfuncao' )
            {
            // InternalOiArdubot.g:3237:2: (otherlv_0= 'funcao' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parametro_2_0= ruleParametro ) )? otherlv_3= ':' ( (lv_tipo_4_0= ruleTipo ) ) ( (lv_codigo_5_0= ruleImplementacao ) )* (otherlv_6= 'retorne' ( (lv_retorno_7_0= ruleVariavelValor ) ) otherlv_8= ';' )? otherlv_9= 'fimfuncao' )
            // InternalOiArdubot.g:3238:3: otherlv_0= 'funcao' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parametro_2_0= ruleParametro ) )? otherlv_3= ':' ( (lv_tipo_4_0= ruleTipo ) ) ( (lv_codigo_5_0= ruleImplementacao ) )* (otherlv_6= 'retorne' ( (lv_retorno_7_0= ruleVariavelValor ) ) otherlv_8= ';' )? otherlv_9= 'fimfuncao'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFuncaoAccess().getFuncaoKeyword_0());
            		
            // InternalOiArdubot.g:3242:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOiArdubot.g:3243:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOiArdubot.g:3243:4: (lv_name_1_0= RULE_ID )
            // InternalOiArdubot.g:3244:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFuncaoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncaoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOiArdubot.g:3260:3: ( (lv_parametro_2_0= ruleParametro ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOiArdubot.g:3261:4: (lv_parametro_2_0= ruleParametro )
                    {
                    // InternalOiArdubot.g:3261:4: (lv_parametro_2_0= ruleParametro )
                    // InternalOiArdubot.g:3262:5: lv_parametro_2_0= ruleParametro
                    {

                    					newCompositeNode(grammarAccess.getFuncaoAccess().getParametroParametroParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_40);
                    lv_parametro_2_0=ruleParametro();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFuncaoRule());
                    					}
                    					set(
                    						current,
                    						"parametro",
                    						lv_parametro_2_0,
                    						"br.edu.utfpr.oiardubot.OiArdubot.Parametro");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,60,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncaoAccess().getColonKeyword_3());
            		
            // InternalOiArdubot.g:3283:3: ( (lv_tipo_4_0= ruleTipo ) )
            // InternalOiArdubot.g:3284:4: (lv_tipo_4_0= ruleTipo )
            {
            // InternalOiArdubot.g:3284:4: (lv_tipo_4_0= ruleTipo )
            // InternalOiArdubot.g:3285:5: lv_tipo_4_0= ruleTipo
            {

            					newCompositeNode(grammarAccess.getFuncaoAccess().getTipoTipoEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_41);
            lv_tipo_4_0=ruleTipo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncaoRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_4_0,
            						"br.edu.utfpr.oiardubot.OiArdubot.Tipo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArdubot.g:3302:3: ( (lv_codigo_5_0= ruleImplementacao ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=30 && LA28_0<=32)||LA28_0==36||(LA28_0>=38 && LA28_0<=43)||LA28_0==48||(LA28_0>=50 && LA28_0<=51)||LA28_0==55||LA28_0==59||LA28_0==63||(LA28_0>=66 && LA28_0<=67)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalOiArdubot.g:3303:4: (lv_codigo_5_0= ruleImplementacao )
            	    {
            	    // InternalOiArdubot.g:3303:4: (lv_codigo_5_0= ruleImplementacao )
            	    // InternalOiArdubot.g:3304:5: lv_codigo_5_0= ruleImplementacao
            	    {

            	    					newCompositeNode(grammarAccess.getFuncaoAccess().getCodigoImplementacaoParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_codigo_5_0=ruleImplementacao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuncaoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"codigo",
            	    						lv_codigo_5_0,
            	    						"br.edu.utfpr.oiardubot.OiArdubot.Implementacao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalOiArdubot.g:3321:3: (otherlv_6= 'retorne' ( (lv_retorno_7_0= ruleVariavelValor ) ) otherlv_8= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==61) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOiArdubot.g:3322:4: otherlv_6= 'retorne' ( (lv_retorno_7_0= ruleVariavelValor ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getFuncaoAccess().getRetorneKeyword_6_0());
                    			
                    // InternalOiArdubot.g:3326:4: ( (lv_retorno_7_0= ruleVariavelValor ) )
                    // InternalOiArdubot.g:3327:5: (lv_retorno_7_0= ruleVariavelValor )
                    {
                    // InternalOiArdubot.g:3327:5: (lv_retorno_7_0= ruleVariavelValor )
                    // InternalOiArdubot.g:3328:6: lv_retorno_7_0= ruleVariavelValor
                    {

                    						newCompositeNode(grammarAccess.getFuncaoAccess().getRetornoVariavelValorParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_retorno_7_0=ruleVariavelValor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncaoRule());
                    						}
                    						set(
                    							current,
                    							"retorno",
                    							lv_retorno_7_0,
                    							"br.edu.utfpr.oiardubot.OiArdubot.VariavelValor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_42); 

                    				newLeafNode(otherlv_8, grammarAccess.getFuncaoAccess().getSemicolonKeyword_6_2());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFuncaoAccess().getFimfuncaoKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncao"


    // $ANTLR start "entryRuleParametro"
    // InternalOiArdubot.g:3358:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalOiArdubot.g:3358:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalOiArdubot.g:3359:2: iv_ruleParametro= ruleParametro EOF
            {
             newCompositeNode(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametro=ruleParametro();

            state._fsp--;

             current =iv_ruleParametro; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalOiArdubot.g:3365:1: ruleParametro returns [EObject current=null] : (otherlv_0= '(' ( (lv_valor_1_0= ruleVariavelNome ) )* otherlv_2= ')' ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_valor_1_0 = null;



        	enterRule();

        try {
            // InternalOiArdubot.g:3371:2: ( (otherlv_0= '(' ( (lv_valor_1_0= ruleVariavelNome ) )* otherlv_2= ')' ) )
            // InternalOiArdubot.g:3372:2: (otherlv_0= '(' ( (lv_valor_1_0= ruleVariavelNome ) )* otherlv_2= ')' )
            {
            // InternalOiArdubot.g:3372:2: (otherlv_0= '(' ( (lv_valor_1_0= ruleVariavelNome ) )* otherlv_2= ')' )
            // InternalOiArdubot.g:3373:3: otherlv_0= '(' ( (lv_valor_1_0= ruleVariavelNome ) )* otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getParametroAccess().getLeftParenthesisKeyword_0());
            		
            // InternalOiArdubot.g:3377:3: ( (lv_valor_1_0= ruleVariavelNome ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=66 && LA30_0<=67)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalOiArdubot.g:3378:4: (lv_valor_1_0= ruleVariavelNome )
            	    {
            	    // InternalOiArdubot.g:3378:4: (lv_valor_1_0= ruleVariavelNome )
            	    // InternalOiArdubot.g:3379:5: lv_valor_1_0= ruleVariavelNome
            	    {

            	    					newCompositeNode(grammarAccess.getParametroAccess().getValorVariavelNomeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_valor_1_0=ruleVariavelNome();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParametroRule());
            	    					}
            	    					add(
            	    						current,
            	    						"valor",
            	    						lv_valor_1_0,
            	    						"br.edu.utfpr.oiardubot.OiArdubot.VariavelNome");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParametroAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleEspera"
    // InternalOiArdubot.g:3404:1: entryRuleEspera returns [EObject current=null] : iv_ruleEspera= ruleEspera EOF ;
    public final EObject entryRuleEspera() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEspera = null;


        try {
            // InternalOiArdubot.g:3404:47: (iv_ruleEspera= ruleEspera EOF )
            // InternalOiArdubot.g:3405:2: iv_ruleEspera= ruleEspera EOF
            {
             newCompositeNode(grammarAccess.getEsperaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEspera=ruleEspera();

            state._fsp--;

             current =iv_ruleEspera; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEspera"


    // $ANTLR start "ruleEspera"
    // InternalOiArdubot.g:3411:1: ruleEspera returns [EObject current=null] : (otherlv_0= 'esperar' otherlv_1= '(' ( (lv_valor_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleEspera() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_valor_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:3417:2: ( (otherlv_0= 'esperar' otherlv_1= '(' ( (lv_valor_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalOiArdubot.g:3418:2: (otherlv_0= 'esperar' otherlv_1= '(' ( (lv_valor_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalOiArdubot.g:3418:2: (otherlv_0= 'esperar' otherlv_1= '(' ( (lv_valor_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalOiArdubot.g:3419:3: otherlv_0= 'esperar' otherlv_1= '(' ( (lv_valor_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEsperaAccess().getEsperarKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getEsperaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOiArdubot.g:3427:3: ( (lv_valor_2_0= RULE_INT ) )
            // InternalOiArdubot.g:3428:4: (lv_valor_2_0= RULE_INT )
            {
            // InternalOiArdubot.g:3428:4: (lv_valor_2_0= RULE_INT )
            // InternalOiArdubot.g:3429:5: lv_valor_2_0= RULE_INT
            {
            lv_valor_2_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_valor_2_0, grammarAccess.getEsperaAccess().getValorINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEsperaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valor",
            						lv_valor_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEsperaAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEsperaAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEspera"


    // $ANTLR start "ruleTipoPorta"
    // InternalOiArdubot.g:3457:1: ruleTipoPorta returns [Enumerator current=null] : ( (enumLiteral_0= 'DIGITAL' ) | (enumLiteral_1= 'ANALOGICA' ) ) ;
    public final Enumerator ruleTipoPorta() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:3463:2: ( ( (enumLiteral_0= 'DIGITAL' ) | (enumLiteral_1= 'ANALOGICA' ) ) )
            // InternalOiArdubot.g:3464:2: ( (enumLiteral_0= 'DIGITAL' ) | (enumLiteral_1= 'ANALOGICA' ) )
            {
            // InternalOiArdubot.g:3464:2: ( (enumLiteral_0= 'DIGITAL' ) | (enumLiteral_1= 'ANALOGICA' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==64) ) {
                alt31=1;
            }
            else if ( (LA31_0==65) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalOiArdubot.g:3465:3: (enumLiteral_0= 'DIGITAL' )
                    {
                    // InternalOiArdubot.g:3465:3: (enumLiteral_0= 'DIGITAL' )
                    // InternalOiArdubot.g:3466:4: enumLiteral_0= 'DIGITAL'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getTipoPortaAccess().getDIGITALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoPortaAccess().getDIGITALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:3473:3: (enumLiteral_1= 'ANALOGICA' )
                    {
                    // InternalOiArdubot.g:3473:3: (enumLiteral_1= 'ANALOGICA' )
                    // InternalOiArdubot.g:3474:4: enumLiteral_1= 'ANALOGICA'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getTipoPortaAccess().getANALOGICAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoPortaAccess().getANALOGICAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoPorta"


    // $ANTLR start "ruleTipo"
    // InternalOiArdubot.g:3484:1: ruleTipo returns [Enumerator current=null] : ( (enumLiteral_0= 'Texto' ) | (enumLiteral_1= 'Numero' ) ) ;
    public final Enumerator ruleTipo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:3490:2: ( ( (enumLiteral_0= 'Texto' ) | (enumLiteral_1= 'Numero' ) ) )
            // InternalOiArdubot.g:3491:2: ( (enumLiteral_0= 'Texto' ) | (enumLiteral_1= 'Numero' ) )
            {
            // InternalOiArdubot.g:3491:2: ( (enumLiteral_0= 'Texto' ) | (enumLiteral_1= 'Numero' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==66) ) {
                alt32=1;
            }
            else if ( (LA32_0==67) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalOiArdubot.g:3492:3: (enumLiteral_0= 'Texto' )
                    {
                    // InternalOiArdubot.g:3492:3: (enumLiteral_0= 'Texto' )
                    // InternalOiArdubot.g:3493:4: enumLiteral_0= 'Texto'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getTipoAccess().getTextoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoAccess().getTextoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:3500:3: (enumLiteral_1= 'Numero' )
                    {
                    // InternalOiArdubot.g:3500:3: (enumLiteral_1= 'Numero' )
                    // InternalOiArdubot.g:3501:4: enumLiteral_1= 'Numero'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getTipoAccess().getNumeroEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoAccess().getNumeroEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipo"


    // $ANTLR start "ruleDirecao"
    // InternalOiArdubot.g:3511:1: ruleDirecao returns [Enumerator current=null] : ( (enumLiteral_0= 'FRENTE' ) | (enumLiteral_1= 'TRAS' ) ) ;
    public final Enumerator ruleDirecao() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOiArdubot.g:3517:2: ( ( (enumLiteral_0= 'FRENTE' ) | (enumLiteral_1= 'TRAS' ) ) )
            // InternalOiArdubot.g:3518:2: ( (enumLiteral_0= 'FRENTE' ) | (enumLiteral_1= 'TRAS' ) )
            {
            // InternalOiArdubot.g:3518:2: ( (enumLiteral_0= 'FRENTE' ) | (enumLiteral_1= 'TRAS' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==68) ) {
                alt33=1;
            }
            else if ( (LA33_0==69) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalOiArdubot.g:3519:3: (enumLiteral_0= 'FRENTE' )
                    {
                    // InternalOiArdubot.g:3519:3: (enumLiteral_0= 'FRENTE' )
                    // InternalOiArdubot.g:3520:4: enumLiteral_0= 'FRENTE'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getDirecaoAccess().getFRENTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirecaoAccess().getFRENTEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArdubot.g:3527:3: (enumLiteral_1= 'TRAS' )
                    {
                    // InternalOiArdubot.g:3527:3: (enumLiteral_1= 'TRAS' )
                    // InternalOiArdubot.g:3528:4: enumLiteral_1= 'TRAS'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getDirecaoAccess().getTRASEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirecaoAccess().getTRASEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirecao"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\5\1\uffff\1\20\10\uffff\2\5\7\uffff\1\4\1\20\4\uffff\1\31";
    static final String dfa_3s = "\1\103\1\uffff\1\20\10\uffff\2\5\7\uffff\1\35\1\20\4\uffff\1\35";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\14\1\15\1\16\1\17\1\20\1\23\1\24\2\uffff\1\2\1\22\1\13\1\21\1\uffff";
    static final String dfa_5s = "\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\30\uffff\1\21\1\3\1\6\3\uffff\1\4\1\uffff\1\5\1\15\1\16\1\22\1\23\1\10\4\uffff\1\11\1\uffff\1\12\1\1\3\uffff\1\7\3\uffff\1\17\3\uffff\1\20\2\uffff\1\13\1\14",
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
            "\4\26\21\uffff\1\30\2\uffff\1\31\1\27",
            "\1\32",
            "",
            "",
            "",
            "",
            "\1\30\2\uffff\1\31\1\27"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "233:2: (this_Se_0= ruleSe | this_VariavelExistente_1= ruleVariavelExistente | this_Tela_2= ruleTela | this_Ligar_3= ruleLigar | this_Desligar_4= ruleDesligar | this_Bip_5= ruleBip | this_Escolha_6= ruleEscolha | this_Para_7= rulePara | this_Enquanto_8= ruleEnquanto | this_Repita_9= ruleRepita | this_Ler_10= ruleLer | this_Servo_11= ruleServo | this_MotorDC_12= ruleMotorDC | this_Funcao_13= ruleFuncao | this_Espera_14= ruleEspera | this_Escrever_15= ruleEscrever | this_LerDigital_16= ruleLerDigital | this_LerAnalogica_17= ruleLerAnalogica | this_Andar_18= ruleAndar | this_Parar_19= ruleParar )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000044000L,0x000000000000000CL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x888D0FD1C0008020L,0x000000000000000CL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x888D0FD1C0000022L,0x000000000000000CL});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x888D8FD1C0000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x888F0FD1C0000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x888D2FD1C0000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x88ED0FD1C0000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8C8D0FD1C0000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000004000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xE88D0FD1C0000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000008000000L,0x000000000000000CL});

}