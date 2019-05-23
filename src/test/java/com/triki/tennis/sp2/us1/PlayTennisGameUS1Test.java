package com.triki.tennis.sp2.us1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.triki.tennis.core.impl.PlayTennisGameImpl;
import com.triki.tennis.model.Player;

/**
 * Unit test for Tennis App.
 */
public class PlayTennisGameUS1Test {
	
	private PlayTennisGameImpl playTennisImpl;
	
	@Before
	public void initialisePlayers() {
		playTennisImpl = new PlayTennisGameImpl("firstPlayer", "secondPlayer");
	}
	
	/**
	 * Test the initial Scores of the players
	 * 
	 */
	@Test
	public void testInitialPalyersMatchScores() {
		assertTrue(playTennisImpl.getPlayer(1).getSetScore() == 0);
		assertTrue(playTennisImpl.getPlayer(2).getSetScore() == 0);
	}
	
	/**
	 * Test the player's Score after winning a set
	 * 
	 */
	@Test
	public void testPalyerScoreAfterSetWin() {
		fail("initial state of test");
	}
	
	/**
	 * Test the player's Score after winning a set
	 * 
	 */
	@Test
	public void testPalyerOneWinMatchPlayerTwoUnderFive() {
		fail("initial state of test");
	}
	
	/**
	 * Test the player's Score after winning a set
	 * 
	 */
	@Test
	public void testPalyerOneDontWinMatchPlayerTwoFive() {
		fail("initial state of test");
	}
	
	/**
	 * Test the player's Score after winning a set
	 * 
	 */
	@Test
	public void testPalyerOneWinMatchPlayerTwoFive() {
		fail("initial state of test");
	}
	
	/**
	 * This part simulate a whole set to be used to test the winner
	 * 
	 */
	private void winSet(Player player) {
		for (int i=0; i<4; i++) {
			playTennisImpl.winPoint(player);
		}		
	}
	
	private void simulateGame() {
		
	}

}
