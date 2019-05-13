package com.extia.tennis.core.impl;

import com.extia.tennis.core.PlayTennis;
import com.extia.tennis.model.Player;

public class PlayTennisImpl implements PlayTennis{
	
	private Player player1;
	private Player player2;
	private Player winner;
	
	public PlayTennisImpl() {}
	
	public PlayTennisImpl(String firstPlayer, String secondPlayer) {
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
		if (currentPlayer.getScore() == 40) {
			winner = currentPlayer;
			player1.addPoints(0);
			player2.addPoints(0);
		} else if (currentPlayer.getScore() == 30) {
			currentPlayer.addPoints(10);
		} else currentPlayer.addPoints(15);
	}
	
	private Player getCurrentPlayer(Player player) {
		if (player.equals(player1)) {
			return player1;
		} else {
			return player2;
		}
	}

	public void getCurrentGameState() {
		System.out.println(player1.getName() + " has " + player1.getScore() + " points");
		System.out.println(player2.getName() + " has " + player2.getScore() + " points");
	}

}
