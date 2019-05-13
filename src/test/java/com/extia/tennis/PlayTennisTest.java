package com.extia.tennis;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.extia.tennis.core.impl.PlayTennisImpl;

/**
 * Unit test for Tennis App.
 */
public class PlayTennisTest {
	
	private PlayTennisImpl playTennisImpl;
	
	@Before
	public void initialisePlayers() {
		playTennisImpl = new PlayTennisImpl("firstPlayer", "secondPlayer");
	}
	
	/**
	 * Test the initial Scores of the players
	 * 
	 */
	@Test
	public void testInitialPalyersScores() {
		assertTrue(playTennisImpl.getPlayer(1).getScore() == 0);
		assertTrue(playTennisImpl.getPlayer(2).getScore() == 0);
	}
	
	/**
	 * Test that the score increment by 15 when it's under 30 points
	 * 
	 */
	@Test
	public void testScoreIncrementUnderThirty() {
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		assertTrue(playTennisImpl.getPlayer(1).getScore() == 15);
	}
	
	/**
	 * Test that the score increment by 10 when it equals 30 points
	 * 
	 */
	@Test
	public void testScoreIncrementOverThirty() {
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		assertTrue(playTennisImpl.getPlayer(1).getScore() == 40);
	}
	
	/**
	 * Test that after a whole set Player1 is the winner
	 * 
	 */
	@Test
	public void testPlayerOneIsWinner() {
		playWholeGame();
		assertTrue(playTennisImpl.whosWinner().equals(playTennisImpl.getPlayer(1)));
	}
	
	/**
	 * This part simulate a whole set to be used to test the winner
	 * 
	 */
	private void playWholeGame() {
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
	}

}
