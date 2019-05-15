package com.extia.tennis.sp1.us2;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.extia.tennis.core.impl.sp1.PlayTennisImpl;
import com.extia.tennis.model.TennisRules;

/**
 * Unit test for Tennis App.
 */
public class PlayTennisTest {
	
	private PlayTennisImpl playTennisImpl;
	
	@Before
	public void initialisePlayers() {
		playTennisImpl = new PlayTennisImpl("firstPlayer", "secondPlayer");
		initialiseGame();
	}
	
	/**
	 * Test that the Scores of the players
	 * passes to DEUCE when both reach 40
	 * 
	 */
	@Test
	public void test_DEUCE_Both_Palyers() {
		playTennisImpl.winPoint(playTennisImpl.getPlayer(2));
		assertTrue(playTennisImpl.getPlayer(1).getScore() == TennisRules.DEUCE.getValue());
		assertTrue(playTennisImpl.getPlayer(2).getScore() == TennisRules.DEUCE.getValue());
	}
	
	/**
	 * Test that the Scores of the first player
	 * passes to ADV and second player passes to 40
	 * 
	 */
	@Test
	public void test_ADV_first_Fourty_Second() {
		playTennisImpl.winPoint(playTennisImpl.getPlayer(2));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		assertTrue(playTennisImpl.getPlayer(1).getScore() == TennisRules.ADV.getValue());
		assertTrue(playTennisImpl.getPlayer(2).getScore() == 40);
	}
	
	/**
	 * Test that the Scores of the players
	 * passes to DEUCE when second win point
	 * 
	 */
	@Test
	public void test_back_DEUCE_second_win_Point() {
		playTennisImpl.winPoint(playTennisImpl.getPlayer(2));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(2));
		assertTrue(playTennisImpl.getPlayer(1).getScore() == TennisRules.DEUCE.getValue());
		assertTrue(playTennisImpl.getPlayer(2).getScore() == TennisRules.DEUCE.getValue());
	}
	
	/**
	 * Test that after a whole set Player2 is the winner
	 * 
	 */
	@Test
	public void test_second_Player_Winner() {
		playTennisImpl.winPoint(playTennisImpl.getPlayer(2));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(2));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(2));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(2));
		assertTrue(playTennisImpl.whosWinner().equals(playTennisImpl.getPlayer(2)));
	}
	
	/**
	 * This part simulate a set until player1 has 30 points 
	 * and player2 has 40 points
	 * 
	 */
	private void initialiseGame() {
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(1));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(2));
		playTennisImpl.winPoint(playTennisImpl.getPlayer(2));
	}

}
