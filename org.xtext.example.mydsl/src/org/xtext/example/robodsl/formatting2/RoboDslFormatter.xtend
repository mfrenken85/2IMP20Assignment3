/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.robodsl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.robodsl.services.RoboDslGrammarAccess
import roboEMF.Command
import roboEMF.CommandMain
import roboEMF.EScript
import roboEMF.MainBody

class RoboDslFormatter extends AbstractFormatter2 {
	
	@Inject extension RoboDslGrammarAccess

	def dispatch void format(EScript eScript, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		eScript.getMainbody.format;
	}

	def dispatch void format(MainBody mainBody, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (CommandMain commandMain : mainBody.getCommandmain()) {
			commandMain.format;
		}
		for (Command command : mainBody.getCommand()) {
			command.format;
		}
	}
	
	// TODO: implement for SubBody, DropMarkCmd, PickMarkCmd, DestroyWallCmd, BuildWallCmd, IfStatement, WhileStatement, RepeateStatement, Heading
}