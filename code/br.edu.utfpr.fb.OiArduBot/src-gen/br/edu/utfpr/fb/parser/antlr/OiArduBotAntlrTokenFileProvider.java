/*
 * generated by Xtext 2.25.0
 */
package br.edu.utfpr.fb.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class OiArduBotAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("br/edu/utfpr/fb/parser/antlr/internal/InternalOiArduBot.tokens");
	}
}