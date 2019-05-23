package com.triki.tennis.core.impl;

import com.triki.tennis.core.PlayTennisGame;
import com.triki.tennis.model.Player;
import com.triki.tennis.model.TennisRules;

/**
 * This an implementation of Sprint 1, User Story 2
 * 
 * @author triki
 *
 */
public class PlayTennisGameImpl implements PlayTennisGame{
	
	/**
	 * Constants of Rules
	 */
	final int DEUCE 		= 50;
	final int ADV			= 60;
	final int INITIAL_SCORE	= 00;
	
	private Player player1;
	private Player player2;
	private Player winner;
	
	public PlayTennisGameImpl() {}
	
	public PlayTennisGameImpl(String firstPlayer, String secondPlayer) {
		player1 = new Player(firstPlayer);
		player2 = new Player(secondPlayer);
	}
	
	public Player getPlayer(int playerNumber) {
		if (playerNumber == 1)
			return player1;
		else return player2;
	}

	public Player whosWinner() {
		if (winner == null) {
			System.out.println("No player has won yet");
			return null;
		} else {
			System.out.println("The player " + winner.getName() + " is the winner of the game");
			return winner;
		}
	}

	public void winPoint(Player player) {
		Player currentPlayer = getCurrentPlayer(player);
		
		switch (currentPlayer.getGameScore()) {
		case ADV:{
			winner = currentPlayer;
			player1.addPoints(INITIAL_SCORE);
			player2.addPoints(INITIAL_SCORE);
		}
			break;
		case DEUCE:{
			updateGameScore(currentPlayer, false);
			currentPlayer.addPoints(TennisRules.ADV.getValue());
		}
			break;
		case 40:{
			updateGameScore(currentPlayer, false);
		}
			break;
		case 30:{
			currentPlayer.addPoints(10);
			updateGameScore(currentPlayer, true);
		} 
			break;
		default:{
			currentPlayer.addPoints(15);
		}
			break;
		}
	}
	
	private void updateGameScore(Player currentPlayer, boolean wasThirty) {
		Player otherPalyer = currentPlayer.equals(player1)? player2 : player1;
		
		if (currentPlayer.getGameScore() == 40 && otherPalyer.getGameScore() < 40 && !wasThirty) {
			winner = currentPlayer;
			player1.addPoints(INITIAL_SCORE);
			player2.addPoints(INITIAL_SCORE);
		} else if ((currentPlayer.getGameScore() == 40 && otherPalyer.getGameScore() == 40)
				|| (currentPlayer.getGameScore() == 40 && otherPalyer.getGameScore() == ADV)) {
			currentPlayer.addPoints(TennisRules.DEUCE.getValue());
			otherPalyer.addPoints(TennisRules.DEUCE.getValue());
		} else if (currentPlayer.getGameScore() == DEUCE){
			otherPalyer.addPoints(-10);
		}
	}

	private Player getCurrentPlayer(Player player) {
		if (player.equals(player1)) {
			return player1;
		} else {
			return player2;
		}
	}

	public void getCurrentSetState() {
		System.out.println(player1.getName() + " has " + player1.getGameScore() + " points");
		System.out.println(player2.getName() + " has " + player2.getGameScore() + " points");
	}

}