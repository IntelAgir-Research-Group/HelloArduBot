/*
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.fb;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class OiArduBotStandaloneSetup extends OiArduBotStandaloneSetupGenerated {

	public static void doSetup() {
		new OiArduBotStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
