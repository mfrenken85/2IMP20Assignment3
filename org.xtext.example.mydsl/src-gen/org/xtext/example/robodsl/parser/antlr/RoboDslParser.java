/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.robodsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.robodsl.parser.antlr.internal.InternalRoboDslParser;
import org.xtext.example.robodsl.services.RoboDslGrammarAccess;

public class RoboDslParser extends AbstractAntlrParser {

	@Inject
	private RoboDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRoboDslParser createParser(XtextTokenStream stream) {
		return new InternalRoboDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "EScript";
	}

	public RoboDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RoboDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
