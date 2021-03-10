package br.edu.utfpr.fb.parser.antlr.internal;

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
import br.edu.utfpr.fb.services.OiArduBotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOiArduBotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Variaveis'", "'Inicio'", "'Fim'", "'='", "';'", "'Para'", "'de'", "'ate'", "'passo'", "'Faca'", "'FimPara'", "'SeNao'", "'ler'", "'('", "','", "')'", "'alerta'", "'beep'", "'Texto'", "'Numero'", "'Simples'", "'Duplo'", "'Longo'", "'Digital'", "'Analogica'"
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

        public InternalOiArduBotParser(TokenStream input, OiArduBotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected OiArduBotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalOiArduBot.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOiArduBot.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalOiArduBot.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalOiArduBot.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_var_0_0= 'Variaveis' ) )? ( (lv_variaveis_1_0= ruleVariavel ) )* ( (lv_ini_2_0= 'Inicio' ) ) ( (lv_fim_3_0= 'Fim' ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token lv_ini_2_0=null;
        Token lv_fim_3_0=null;
        EObject lv_variaveis_1_0 = null;



        	enterRule();

        try {
            // InternalOiArduBot.g:78:2: ( ( ( (lv_var_0_0= 'Variaveis' ) )? ( (lv_variaveis_1_0= ruleVariavel ) )* ( (lv_ini_2_0= 'Inicio' ) ) ( (lv_fim_3_0= 'Fim' ) ) ) )
            // InternalOiArduBot.g:79:2: ( ( (lv_var_0_0= 'Variaveis' ) )? ( (lv_variaveis_1_0= ruleVariavel ) )* ( (lv_ini_2_0= 'Inicio' ) ) ( (lv_fim_3_0= 'Fim' ) ) )
            {
            // InternalOiArduBot.g:79:2: ( ( (lv_var_0_0= 'Variaveis' ) )? ( (lv_variaveis_1_0= ruleVariavel ) )* ( (lv_ini_2_0= 'Inicio' ) ) ( (lv_fim_3_0= 'Fim' ) ) )
            // InternalOiArduBot.g:80:3: ( (lv_var_0_0= 'Variaveis' ) )? ( (lv_variaveis_1_0= ruleVariavel ) )* ( (lv_ini_2_0= 'Inicio' ) ) ( (lv_fim_3_0= 'Fim' ) )
            {
            // InternalOiArduBot.g:80:3: ( (lv_var_0_0= 'Variaveis' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOiArduBot.g:81:4: (lv_var_0_0= 'Variaveis' )
                    {
                    // InternalOiArduBot.g:81:4: (lv_var_0_0= 'Variaveis' )
                    // InternalOiArduBot.g:82:5: lv_var_0_0= 'Variaveis'
                    {
                    lv_var_0_0=(Token)match(input,11,FOLLOW_3); 

                    					newLeafNode(lv_var_0_0, grammarAccess.getModelAccess().getVarVariaveisKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					addWithLastConsumed(current, "var", lv_var_0_0, "Variaveis");
                    				

                    }


                    }
                    break;

            }

            // InternalOiArduBot.g:94:3: ( (lv_variaveis_1_0= ruleVariavel ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=29 && LA2_0<=30)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOiArduBot.g:95:4: (lv_variaveis_1_0= ruleVariavel )
            	    {
            	    // InternalOiArduBot.g:95:4: (lv_variaveis_1_0= ruleVariavel )
            	    // InternalOiArduBot.g:96:5: lv_variaveis_1_0= ruleVariavel
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
            	    						"br.edu.utfpr.fb.OiArduBot.Variavel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalOiArduBot.g:113:3: ( (lv_ini_2_0= 'Inicio' ) )
            // InternalOiArduBot.g:114:4: (lv_ini_2_0= 'Inicio' )
            {
            // InternalOiArduBot.g:114:4: (lv_ini_2_0= 'Inicio' )
            // InternalOiArduBot.g:115:5: lv_ini_2_0= 'Inicio'
            {
            lv_ini_2_0=(Token)match(input,12,FOLLOW_4); 

            					newLeafNode(lv_ini_2_0, grammarAccess.getModelAccess().getIniInicioKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					addWithLastConsumed(current, "ini", lv_ini_2_0, "Inicio");
            				

            }


            }

            // InternalOiArduBot.g:127:3: ( (lv_fim_3_0= 'Fim' ) )
            // InternalOiArduBot.g:128:4: (lv_fim_3_0= 'Fim' )
            {
            // InternalOiArduBot.g:128:4: (lv_fim_3_0= 'Fim' )
            // InternalOiArduBot.g:129:5: lv_fim_3_0= 'Fim'
            {
            lv_fim_3_0=(Token)match(input,13,FOLLOW_2); 

            					newLeafNode(lv_fim_3_0, grammarAccess.getModelAccess().getFimFimKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					addWithLastConsumed(current, "fim", lv_fim_3_0, "Fim");
            				

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


    // $ANTLR start "entryRuleVariavel"
    // InternalOiArduBot.g:145:1: entryRuleVariavel returns [EObject current=null] : iv_ruleVariavel= ruleVariavel EOF ;
    public final EObject entryRuleVariavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariavel = null;


        try {
            // InternalOiArduBot.g:145:49: (iv_ruleVariavel= ruleVariavel EOF )
            // InternalOiArduBot.g:146:2: iv_ruleVariavel= ruleVariavel EOF
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
    // InternalOiArduBot.g:152:1: ruleVariavel returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_valor_3_0= RULE_STRING ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleVariavel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_valor_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_tipo_0_0 = null;



        	enterRule();

        try {
            // InternalOiArduBot.g:158:2: ( ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_valor_3_0= RULE_STRING ) ) )? otherlv_4= ';' ) )
            // InternalOiArduBot.g:159:2: ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_valor_3_0= RULE_STRING ) ) )? otherlv_4= ';' )
            {
            // InternalOiArduBot.g:159:2: ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_valor_3_0= RULE_STRING ) ) )? otherlv_4= ';' )
            // InternalOiArduBot.g:160:3: ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_valor_3_0= RULE_STRING ) ) )? otherlv_4= ';'
            {
            // InternalOiArduBot.g:160:3: ( (lv_tipo_0_0= ruleTipo ) )
            // InternalOiArduBot.g:161:4: (lv_tipo_0_0= ruleTipo )
            {
            // InternalOiArduBot.g:161:4: (lv_tipo_0_0= ruleTipo )
            // InternalOiArduBot.g:162:5: lv_tipo_0_0= ruleTipo
            {

            					newCompositeNode(grammarAccess.getVariavelAccess().getTipoTipoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_tipo_0_0=ruleTipo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariavelRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"br.edu.utfpr.fb.OiArduBot.Tipo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOiArduBot.g:179:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOiArduBot.g:180:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOiArduBot.g:180:4: (lv_name_1_0= RULE_ID )
            // InternalOiArduBot.g:181:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariavelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariavelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOiArduBot.g:197:3: (otherlv_2= '=' ( (lv_valor_3_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOiArduBot.g:198:4: otherlv_2= '=' ( (lv_valor_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getVariavelAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalOiArduBot.g:202:4: ( (lv_valor_3_0= RULE_STRING ) )
                    // InternalOiArduBot.g:203:5: (lv_valor_3_0= RULE_STRING )
                    {
                    // InternalOiArduBot.g:203:5: (lv_valor_3_0= RULE_STRING )
                    // InternalOiArduBot.g:204:6: lv_valor_3_0= RULE_STRING
                    {
                    lv_valor_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_valor_3_0, grammarAccess.getVariavelAccess().getValorSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariavelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valor",
                    							lv_valor_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariavelAccess().getSemicolonKeyword_3());
            		

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


    // $ANTLR start "entryRulePara"
    // InternalOiArduBot.g:229:1: entryRulePara returns [EObject current=null] : iv_rulePara= rulePara EOF ;
    public final EObject entryRulePara() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePara = null;


        try {
            // InternalOiArduBot.g:229:45: (iv_rulePara= rulePara EOF )
            // InternalOiArduBot.g:230:2: iv_rulePara= rulePara EOF
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
    // InternalOiArduBot.g:236:1: rulePara returns [EObject current=null] : (otherlv_0= 'Para' otherlv_1= 'de' ( (lv_de_2_0= RULE_INT ) ) otherlv_3= 'ate' ( (lv_ate_4_0= RULE_INT ) ) (otherlv_5= 'passo' ( (lv_passo_6_0= RULE_INT ) ) )? otherlv_7= 'Faca' ( (lv_codigoPara_8_0= RULE_STRING ) ) otherlv_9= 'FimPara' ) ;
    public final EObject rulePara() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_de_2_0=null;
        Token otherlv_3=null;
        Token lv_ate_4_0=null;
        Token otherlv_5=null;
        Token lv_passo_6_0=null;
        Token otherlv_7=null;
        Token lv_codigoPara_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalOiArduBot.g:242:2: ( (otherlv_0= 'Para' otherlv_1= 'de' ( (lv_de_2_0= RULE_INT ) ) otherlv_3= 'ate' ( (lv_ate_4_0= RULE_INT ) ) (otherlv_5= 'passo' ( (lv_passo_6_0= RULE_INT ) ) )? otherlv_7= 'Faca' ( (lv_codigoPara_8_0= RULE_STRING ) ) otherlv_9= 'FimPara' ) )
            // InternalOiArduBot.g:243:2: (otherlv_0= 'Para' otherlv_1= 'de' ( (lv_de_2_0= RULE_INT ) ) otherlv_3= 'ate' ( (lv_ate_4_0= RULE_INT ) ) (otherlv_5= 'passo' ( (lv_passo_6_0= RULE_INT ) ) )? otherlv_7= 'Faca' ( (lv_codigoPara_8_0= RULE_STRING ) ) otherlv_9= 'FimPara' )
            {
            // InternalOiArduBot.g:243:2: (otherlv_0= 'Para' otherlv_1= 'de' ( (lv_de_2_0= RULE_INT ) ) otherlv_3= 'ate' ( (lv_ate_4_0= RULE_INT ) ) (otherlv_5= 'passo' ( (lv_passo_6_0= RULE_INT ) ) )? otherlv_7= 'Faca' ( (lv_codigoPara_8_0= RULE_STRING ) ) otherlv_9= 'FimPara' )
            // InternalOiArduBot.g:244:3: otherlv_0= 'Para' otherlv_1= 'de' ( (lv_de_2_0= RULE_INT ) ) otherlv_3= 'ate' ( (lv_ate_4_0= RULE_INT ) ) (otherlv_5= 'passo' ( (lv_passo_6_0= RULE_INT ) ) )? otherlv_7= 'Faca' ( (lv_codigoPara_8_0= RULE_STRING ) ) otherlv_9= 'FimPara'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getParaAccess().getParaKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParaAccess().getDeKeyword_1());
            		
            // InternalOiArduBot.g:252:3: ( (lv_de_2_0= RULE_INT ) )
            // InternalOiArduBot.g:253:4: (lv_de_2_0= RULE_INT )
            {
            // InternalOiArduBot.g:253:4: (lv_de_2_0= RULE_INT )
            // InternalOiArduBot.g:254:5: lv_de_2_0= RULE_INT
            {
            lv_de_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_de_2_0, grammarAccess.getParaAccess().getDeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"de",
            						lv_de_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getParaAccess().getAteKeyword_3());
            		
            // InternalOiArduBot.g:274:3: ( (lv_ate_4_0= RULE_INT ) )
            // InternalOiArduBot.g:275:4: (lv_ate_4_0= RULE_INT )
            {
            // InternalOiArduBot.g:275:4: (lv_ate_4_0= RULE_INT )
            // InternalOiArduBot.g:276:5: lv_ate_4_0= RULE_INT
            {
            lv_ate_4_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_ate_4_0, grammarAccess.getParaAccess().getAteINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ate",
            						lv_ate_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalOiArduBot.g:292:3: (otherlv_5= 'passo' ( (lv_passo_6_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOiArduBot.g:293:4: otherlv_5= 'passo' ( (lv_passo_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getParaAccess().getPassoKeyword_5_0());
                    			
                    // InternalOiArduBot.g:297:4: ( (lv_passo_6_0= RULE_INT ) )
                    // InternalOiArduBot.g:298:5: (lv_passo_6_0= RULE_INT )
                    {
                    // InternalOiArduBot.g:298:5: (lv_passo_6_0= RULE_INT )
                    // InternalOiArduBot.g:299:6: lv_passo_6_0= RULE_INT
                    {
                    lv_passo_6_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_passo_6_0, grammarAccess.getParaAccess().getPassoINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"passo",
                    							lv_passo_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getParaAccess().getFacaKeyword_6());
            		
            // InternalOiArduBot.g:320:3: ( (lv_codigoPara_8_0= RULE_STRING ) )
            // InternalOiArduBot.g:321:4: (lv_codigoPara_8_0= RULE_STRING )
            {
            // InternalOiArduBot.g:321:4: (lv_codigoPara_8_0= RULE_STRING )
            // InternalOiArduBot.g:322:5: lv_codigoPara_8_0= RULE_STRING
            {
            lv_codigoPara_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_codigoPara_8_0, grammarAccess.getParaAccess().getCodigoParaSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"codigoPara",
            						lv_codigoPara_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getParaAccess().getFimParaKeyword_8());
            		

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


    // $ANTLR start "entryRuleSenao"
    // InternalOiArduBot.g:346:1: entryRuleSenao returns [EObject current=null] : iv_ruleSenao= ruleSenao EOF ;
    public final EObject entryRuleSenao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenao = null;


        try {
            // InternalOiArduBot.g:346:46: (iv_ruleSenao= ruleSenao EOF )
            // InternalOiArduBot.g:347:2: iv_ruleSenao= ruleSenao EOF
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
    // InternalOiArduBot.g:353:1: ruleSenao returns [EObject current=null] : (otherlv_0= 'SeNao' ( (lv_codigoSenao_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSenao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_codigoSenao_1_0=null;


        	enterRule();

        try {
            // InternalOiArduBot.g:359:2: ( (otherlv_0= 'SeNao' ( (lv_codigoSenao_1_0= RULE_STRING ) ) ) )
            // InternalOiArduBot.g:360:2: (otherlv_0= 'SeNao' ( (lv_codigoSenao_1_0= RULE_STRING ) ) )
            {
            // InternalOiArduBot.g:360:2: (otherlv_0= 'SeNao' ( (lv_codigoSenao_1_0= RULE_STRING ) ) )
            // InternalOiArduBot.g:361:3: otherlv_0= 'SeNao' ( (lv_codigoSenao_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSenaoAccess().getSeNaoKeyword_0());
            		
            // InternalOiArduBot.g:365:3: ( (lv_codigoSenao_1_0= RULE_STRING ) )
            // InternalOiArduBot.g:366:4: (lv_codigoSenao_1_0= RULE_STRING )
            {
            // InternalOiArduBot.g:366:4: (lv_codigoSenao_1_0= RULE_STRING )
            // InternalOiArduBot.g:367:5: lv_codigoSenao_1_0= RULE_STRING
            {
            lv_codigoSenao_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_codigoSenao_1_0, grammarAccess.getSenaoAccess().getCodigoSenaoSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSenaoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"codigoSenao",
            						lv_codigoSenao_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSenao"


    // $ANTLR start "entryRuleSensoriamento"
    // InternalOiArduBot.g:387:1: entryRuleSensoriamento returns [EObject current=null] : iv_ruleSensoriamento= ruleSensoriamento EOF ;
    public final EObject entryRuleSensoriamento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensoriamento = null;


        try {
            // InternalOiArduBot.g:387:54: (iv_ruleSensoriamento= ruleSensoriamento EOF )
            // InternalOiArduBot.g:388:2: iv_ruleSensoriamento= ruleSensoriamento EOF
            {
             newCompositeNode(grammarAccess.getSensoriamentoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensoriamento=ruleSensoriamento();

            state._fsp--;

             current =iv_ruleSensoriamento; 
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
    // $ANTLR end "entryRuleSensoriamento"


    // $ANTLR start "ruleSensoriamento"
    // InternalOiArduBot.g:394:1: ruleSensoriamento returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'ler' otherlv_3= '(' ( (lv_porta_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_tipo_6_0= ruleTipoPorta ) ) otherlv_7= ')' otherlv_8= ';' ) ;
    public final EObject ruleSensoriamento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_porta_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_tipo_6_0 = null;



        	enterRule();

        try {
            // InternalOiArduBot.g:400:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'ler' otherlv_3= '(' ( (lv_porta_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_tipo_6_0= ruleTipoPorta ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalOiArduBot.g:401:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'ler' otherlv_3= '(' ( (lv_porta_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_tipo_6_0= ruleTipoPorta ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalOiArduBot.g:401:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'ler' otherlv_3= '(' ( (lv_porta_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_tipo_6_0= ruleTipoPorta ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalOiArduBot.g:402:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'ler' otherlv_3= '(' ( (lv_porta_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_tipo_6_0= ruleTipoPorta ) ) otherlv_7= ')' otherlv_8= ';'
            {
            // InternalOiArduBot.g:402:3: ( (otherlv_0= RULE_ID ) )
            // InternalOiArduBot.g:403:4: (otherlv_0= RULE_ID )
            {
            // InternalOiArduBot.g:403:4: (otherlv_0= RULE_ID )
            // InternalOiArduBot.g:404:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensoriamentoRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getSensoriamentoAccess().getSensorVariavelCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSensoriamentoAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSensoriamentoAccess().getLerKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSensoriamentoAccess().getLeftParenthesisKeyword_3());
            		
            // InternalOiArduBot.g:427:3: ( (lv_porta_4_0= RULE_INT ) )
            // InternalOiArduBot.g:428:4: (lv_porta_4_0= RULE_INT )
            {
            // InternalOiArduBot.g:428:4: (lv_porta_4_0= RULE_INT )
            // InternalOiArduBot.g:429:5: lv_porta_4_0= RULE_INT
            {
            lv_porta_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_porta_4_0, grammarAccess.getSensoriamentoAccess().getPortaINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensoriamentoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"porta",
            						lv_porta_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getSensoriamentoAccess().getCommaKeyword_5());
            		
            // InternalOiArduBot.g:449:3: ( (lv_tipo_6_0= ruleTipoPorta ) )
            // InternalOiArduBot.g:450:4: (lv_tipo_6_0= ruleTipoPorta )
            {
            // InternalOiArduBot.g:450:4: (lv_tipo_6_0= ruleTipoPorta )
            // InternalOiArduBot.g:451:5: lv_tipo_6_0= ruleTipoPorta
            {

            					newCompositeNode(grammarAccess.getSensoriamentoAccess().getTipoTipoPortaEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_tipo_6_0=ruleTipoPorta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensoriamentoRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_6_0,
            						"br.edu.utfpr.fb.OiArduBot.TipoPorta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getSensoriamentoAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSensoriamentoAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleSensoriamento"


    // $ANTLR start "entryRuleAtuacao"
    // InternalOiArduBot.g:480:1: entryRuleAtuacao returns [EObject current=null] : iv_ruleAtuacao= ruleAtuacao EOF ;
    public final EObject entryRuleAtuacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtuacao = null;


        try {
            // InternalOiArduBot.g:480:48: (iv_ruleAtuacao= ruleAtuacao EOF )
            // InternalOiArduBot.g:481:2: iv_ruleAtuacao= ruleAtuacao EOF
            {
             newCompositeNode(grammarAccess.getAtuacaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtuacao=ruleAtuacao();

            state._fsp--;

             current =iv_ruleAtuacao; 
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
    // $ANTLR end "entryRuleAtuacao"


    // $ANTLR start "ruleAtuacao"
    // InternalOiArduBot.g:487:1: ruleAtuacao returns [EObject current=null] : ( (lv_notificacoes_0_0= ruleNotificacao ) ) ;
    public final EObject ruleAtuacao() throws RecognitionException {
        EObject current = null;

        EObject lv_notificacoes_0_0 = null;



        	enterRule();

        try {
            // InternalOiArduBot.g:493:2: ( ( (lv_notificacoes_0_0= ruleNotificacao ) ) )
            // InternalOiArduBot.g:494:2: ( (lv_notificacoes_0_0= ruleNotificacao ) )
            {
            // InternalOiArduBot.g:494:2: ( (lv_notificacoes_0_0= ruleNotificacao ) )
            // InternalOiArduBot.g:495:3: (lv_notificacoes_0_0= ruleNotificacao )
            {
            // InternalOiArduBot.g:495:3: (lv_notificacoes_0_0= ruleNotificacao )
            // InternalOiArduBot.g:496:4: lv_notificacoes_0_0= ruleNotificacao
            {

            				newCompositeNode(grammarAccess.getAtuacaoAccess().getNotificacoesNotificacaoParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_notificacoes_0_0=ruleNotificacao();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAtuacaoRule());
            				}
            				add(
            					current,
            					"notificacoes",
            					lv_notificacoes_0_0,
            					"br.edu.utfpr.fb.OiArduBot.Notificacao");
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
    // $ANTLR end "ruleAtuacao"


    // $ANTLR start "entryRuleNotificacao"
    // InternalOiArduBot.g:516:1: entryRuleNotificacao returns [EObject current=null] : iv_ruleNotificacao= ruleNotificacao EOF ;
    public final EObject entryRuleNotificacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotificacao = null;


        try {
            // InternalOiArduBot.g:516:52: (iv_ruleNotificacao= ruleNotificacao EOF )
            // InternalOiArduBot.g:517:2: iv_ruleNotificacao= ruleNotificacao EOF
            {
             newCompositeNode(grammarAccess.getNotificacaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotificacao=ruleNotificacao();

            state._fsp--;

             current =iv_ruleNotificacao; 
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
    // $ANTLR end "entryRuleNotificacao"


    // $ANTLR start "ruleNotificacao"
    // InternalOiArduBot.g:523:1: ruleNotificacao returns [EObject current=null] : ( (lv_beep_0_0= ruleBeep ) ) ;
    public final EObject ruleNotificacao() throws RecognitionException {
        EObject current = null;

        EObject lv_beep_0_0 = null;



        	enterRule();

        try {
            // InternalOiArduBot.g:529:2: ( ( (lv_beep_0_0= ruleBeep ) ) )
            // InternalOiArduBot.g:530:2: ( (lv_beep_0_0= ruleBeep ) )
            {
            // InternalOiArduBot.g:530:2: ( (lv_beep_0_0= ruleBeep ) )
            // InternalOiArduBot.g:531:3: (lv_beep_0_0= ruleBeep )
            {
            // InternalOiArduBot.g:531:3: (lv_beep_0_0= ruleBeep )
            // InternalOiArduBot.g:532:4: lv_beep_0_0= ruleBeep
            {

            				newCompositeNode(grammarAccess.getNotificacaoAccess().getBeepBeepParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_beep_0_0=ruleBeep();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNotificacaoRule());
            				}
            				add(
            					current,
            					"beep",
            					lv_beep_0_0,
            					"br.edu.utfpr.fb.OiArduBot.Beep");
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
    // $ANTLR end "ruleNotificacao"


    // $ANTLR start "entryRuleBeep"
    // InternalOiArduBot.g:552:1: entryRuleBeep returns [EObject current=null] : iv_ruleBeep= ruleBeep EOF ;
    public final EObject entryRuleBeep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeep = null;


        try {
            // InternalOiArduBot.g:552:45: (iv_ruleBeep= ruleBeep EOF )
            // InternalOiArduBot.g:553:2: iv_ruleBeep= ruleBeep EOF
            {
             newCompositeNode(grammarAccess.getBeepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBeep=ruleBeep();

            state._fsp--;

             current =iv_ruleBeep; 
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
    // $ANTLR end "entryRuleBeep"


    // $ANTLR start "ruleBeep"
    // InternalOiArduBot.g:559:1: ruleBeep returns [EObject current=null] : (otherlv_0= 'alerta' otherlv_1= '(' otherlv_2= 'beep' otherlv_3= ',' ( (lv_tipo_4_0= ruleTipoBeep ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleBeep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_tipo_4_0 = null;



        	enterRule();

        try {
            // InternalOiArduBot.g:565:2: ( (otherlv_0= 'alerta' otherlv_1= '(' otherlv_2= 'beep' otherlv_3= ',' ( (lv_tipo_4_0= ruleTipoBeep ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalOiArduBot.g:566:2: (otherlv_0= 'alerta' otherlv_1= '(' otherlv_2= 'beep' otherlv_3= ',' ( (lv_tipo_4_0= ruleTipoBeep ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalOiArduBot.g:566:2: (otherlv_0= 'alerta' otherlv_1= '(' otherlv_2= 'beep' otherlv_3= ',' ( (lv_tipo_4_0= ruleTipoBeep ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalOiArduBot.g:567:3: otherlv_0= 'alerta' otherlv_1= '(' otherlv_2= 'beep' otherlv_3= ',' ( (lv_tipo_4_0= ruleTipoBeep ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getBeepAccess().getAlertaKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getBeepAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getBeepAccess().getBeepKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getBeepAccess().getCommaKeyword_3());
            		
            // InternalOiArduBot.g:583:3: ( (lv_tipo_4_0= ruleTipoBeep ) )
            // InternalOiArduBot.g:584:4: (lv_tipo_4_0= ruleTipoBeep )
            {
            // InternalOiArduBot.g:584:4: (lv_tipo_4_0= ruleTipoBeep )
            // InternalOiArduBot.g:585:5: lv_tipo_4_0= ruleTipoBeep
            {

            					newCompositeNode(grammarAccess.getBeepAccess().getTipoTipoBeepEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_tipo_4_0=ruleTipoBeep();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeepRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_4_0,
            						"br.edu.utfpr.fb.OiArduBot.TipoBeep");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getBeepAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBeepAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleBeep"


    // $ANTLR start "ruleTipo"
    // InternalOiArduBot.g:614:1: ruleTipo returns [Enumerator current=null] : ( (enumLiteral_0= 'Texto' ) | (enumLiteral_1= 'Numero' ) ) ;
    public final Enumerator ruleTipo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOiArduBot.g:620:2: ( ( (enumLiteral_0= 'Texto' ) | (enumLiteral_1= 'Numero' ) ) )
            // InternalOiArduBot.g:621:2: ( (enumLiteral_0= 'Texto' ) | (enumLiteral_1= 'Numero' ) )
            {
            // InternalOiArduBot.g:621:2: ( (enumLiteral_0= 'Texto' ) | (enumLiteral_1= 'Numero' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOiArduBot.g:622:3: (enumLiteral_0= 'Texto' )
                    {
                    // InternalOiArduBot.g:622:3: (enumLiteral_0= 'Texto' )
                    // InternalOiArduBot.g:623:4: enumLiteral_0= 'Texto'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTipoAccess().getTextoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoAccess().getTextoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArduBot.g:630:3: (enumLiteral_1= 'Numero' )
                    {
                    // InternalOiArduBot.g:630:3: (enumLiteral_1= 'Numero' )
                    // InternalOiArduBot.g:631:4: enumLiteral_1= 'Numero'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "ruleTipoBeep"
    // InternalOiArduBot.g:641:1: ruleTipoBeep returns [Enumerator current=null] : ( (enumLiteral_0= 'Simples' ) | (enumLiteral_1= 'Duplo' ) | (enumLiteral_2= 'Longo' ) ) ;
    public final Enumerator ruleTipoBeep() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOiArduBot.g:647:2: ( ( (enumLiteral_0= 'Simples' ) | (enumLiteral_1= 'Duplo' ) | (enumLiteral_2= 'Longo' ) ) )
            // InternalOiArduBot.g:648:2: ( (enumLiteral_0= 'Simples' ) | (enumLiteral_1= 'Duplo' ) | (enumLiteral_2= 'Longo' ) )
            {
            // InternalOiArduBot.g:648:2: ( (enumLiteral_0= 'Simples' ) | (enumLiteral_1= 'Duplo' ) | (enumLiteral_2= 'Longo' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalOiArduBot.g:649:3: (enumLiteral_0= 'Simples' )
                    {
                    // InternalOiArduBot.g:649:3: (enumLiteral_0= 'Simples' )
                    // InternalOiArduBot.g:650:4: enumLiteral_0= 'Simples'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTipoBeepAccess().getSimplesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoBeepAccess().getSimplesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArduBot.g:657:3: (enumLiteral_1= 'Duplo' )
                    {
                    // InternalOiArduBot.g:657:3: (enumLiteral_1= 'Duplo' )
                    // InternalOiArduBot.g:658:4: enumLiteral_1= 'Duplo'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTipoBeepAccess().getDuploEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoBeepAccess().getDuploEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOiArduBot.g:665:3: (enumLiteral_2= 'Longo' )
                    {
                    // InternalOiArduBot.g:665:3: (enumLiteral_2= 'Longo' )
                    // InternalOiArduBot.g:666:4: enumLiteral_2= 'Longo'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTipoBeepAccess().getLongoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoBeepAccess().getLongoEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTipoBeep"


    // $ANTLR start "ruleTipoPorta"
    // InternalOiArduBot.g:676:1: ruleTipoPorta returns [Enumerator current=null] : ( (enumLiteral_0= 'Digital' ) | (enumLiteral_1= 'Analogica' ) ) ;
    public final Enumerator ruleTipoPorta() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOiArduBot.g:682:2: ( ( (enumLiteral_0= 'Digital' ) | (enumLiteral_1= 'Analogica' ) ) )
            // InternalOiArduBot.g:683:2: ( (enumLiteral_0= 'Digital' ) | (enumLiteral_1= 'Analogica' ) )
            {
            // InternalOiArduBot.g:683:2: ( (enumLiteral_0= 'Digital' ) | (enumLiteral_1= 'Analogica' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            else if ( (LA7_0==35) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOiArduBot.g:684:3: (enumLiteral_0= 'Digital' )
                    {
                    // InternalOiArduBot.g:684:3: (enumLiteral_0= 'Digital' )
                    // InternalOiArduBot.g:685:4: enumLiteral_0= 'Digital'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTipoPortaAccess().getDigitalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoPortaAccess().getDigitalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOiArduBot.g:692:3: (enumLiteral_1= 'Analogica' )
                    {
                    // InternalOiArduBot.g:692:3: (enumLiteral_1= 'Analogica' )
                    // InternalOiArduBot.g:693:4: enumLiteral_1= 'Analogica'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTipoPortaAccess().getAnalogicaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoPortaAccess().getAnalogicaEnumLiteralDeclaration_1());
                    			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000060001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000380000000L});

}