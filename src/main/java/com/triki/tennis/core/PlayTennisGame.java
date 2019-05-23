package com.triki.tennis.core;

import com.triki.tennis.model.Player;

public interface PlayTennisGame {
	
	public Player whosWinner();
	public void winPoint(Player player);
	public void getCurrentSetState();

}
