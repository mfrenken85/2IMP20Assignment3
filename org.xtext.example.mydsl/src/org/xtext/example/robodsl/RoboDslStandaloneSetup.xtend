/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.robodsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RoboDslStandaloneSetup extends RoboDslStandaloneSetupGenerated {

	def static void doSetup() {
		new RoboDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}