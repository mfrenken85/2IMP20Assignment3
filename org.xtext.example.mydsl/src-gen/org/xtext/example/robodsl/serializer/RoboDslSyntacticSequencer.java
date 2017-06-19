/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.robodsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.robodsl.services.RoboDslGrammarAccess;

@SuppressWarnings("all")
public class RoboDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RoboDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Full_Heading_Mark_WallAhead_FullKeyword_1_or_MarkKeyword_1_or___HeadingKeyword_1___EastKeyword_2_1_or_NorthKeyword_2_0_or_SouthKeyword_2_2_or_WestKeyword_2_3_____or___WallKeyword_1_AheadKeyword_2__;
	protected AbstractElementAlias match_Heading_EastKeyword_2_1_or_NorthKeyword_2_0_or_SouthKeyword_2_2_or_WestKeyword_2_3;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RoboDslGrammarAccess) access;
		match_Full_Heading_Mark_WallAhead_FullKeyword_1_or_MarkKeyword_1_or___HeadingKeyword_1___EastKeyword_2_1_or_NorthKeyword_2_0_or_SouthKeyword_2_2_or_WestKeyword_2_3_____or___WallKeyword_1_AheadKeyword_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getHeadingAccess().getHeadingKeyword_1()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getHeadingAccess().getEastKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getHeadingAccess().getNorthKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getHeadingAccess().getSouthKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getHeadingAccess().getWestKeyword_2_3()))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWallAheadAccess().getWallKeyword_1()), new TokenAlias(false, false, grammarAccess.getWallAheadAccess().getAheadKeyword_2())), new TokenAlias(false, false, grammarAccess.getFullAccess().getFullKeyword_1()), new TokenAlias(false, false, grammarAccess.getMarkAccess().getMarkKeyword_1()));
		match_Heading_EastKeyword_2_1_or_NorthKeyword_2_0_or_SouthKeyword_2_2_or_WestKeyword_2_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getHeadingAccess().getEastKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getHeadingAccess().getNorthKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getHeadingAccess().getSouthKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getHeadingAccess().getWestKeyword_2_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Full_Heading_Mark_WallAhead_FullKeyword_1_or_MarkKeyword_1_or___HeadingKeyword_1___EastKeyword_2_1_or_NorthKeyword_2_0_or_SouthKeyword_2_2_or_WestKeyword_2_3_____or___WallKeyword_1_AheadKeyword_2__.equals(syntax))
				emit_Full_Heading_Mark_WallAhead_FullKeyword_1_or_MarkKeyword_1_or___HeadingKeyword_1___EastKeyword_2_1_or_NorthKeyword_2_0_or_SouthKeyword_2_2_or_WestKeyword_2_3_____or___WallKeyword_1_AheadKeyword_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Heading_EastKeyword_2_1_or_NorthKeyword_2_0_or_SouthKeyword_2_2_or_WestKeyword_2_3.equals(syntax))
				emit_Heading_EastKeyword_2_1_or_NorthKeyword_2_0_or_SouthKeyword_2_2_or_WestKeyword_2_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('heading' ('south' | 'east' | 'north' | 'west')) | ('wall' 'ahead') | 'mark' | 'full'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Full_Heading_Mark_WallAhead_FullKeyword_1_or_MarkKeyword_1_or___HeadingKeyword_1___EastKeyword_2_1_or_NorthKeyword_2_0_or_SouthKeyword_2_2_or_WestKeyword_2_3_____or___WallKeyword_1_AheadKeyword_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'north' | 'east' | 'south' | 'west'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'heading' (ambiguity) (rule start)
	 */
	protected void emit_Heading_EastKeyword_2_1_or_NorthKeyword_2_0_or_SouthKeyword_2_2_or_WestKeyword_2_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}