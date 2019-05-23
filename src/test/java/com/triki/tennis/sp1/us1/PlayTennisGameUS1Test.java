package com.triki.tennis.sp1.us1;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.triki.tennis.core.impl.PlayTennisGameImpl;

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
	public void testInitialPalyersScores() {
		assertTrue(playTennisImpl.getPlayer(1).getGameScore() == 0);
		assertTrue(playTennisImpl.getPlayer(2).getGameScore() == 0);
	}
	
	/**
	 * Test that the score increment by 15 when it's under 30 points
	 * 
	 */
	@Test
	public void testScoreIncrementUnderThirty() {
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		assertTrue(playTennisImpl.getPlayer(1).getGameScore() == 15);
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
		assertTrue(playTennisImpl.getPlayer(1).getGameScore() == 40);
	}
	
	/**
	 * Test that after a whole game Player1 is the winner
	 * 
	 */
	@Test
	public void testPlayerOneIsWinner() {
		playWholeGame();
		assertTrue(playTennisImpl.whosWinner().equals(playTennisImpl.getPlayer(1)));
	}
	
	/**
	 * This part simulate a whole game to be used to test the winner
	 * 
	 */
	private void playWholeGame() {
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
	}

}
