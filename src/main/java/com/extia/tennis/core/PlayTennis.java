package com.extia.tennis.core;

import com.extia.tennis.model.Player;

public interface PlayTennis {
	
	public Player whosWinner();
	public void winPoint(Player player);
	public void getCurrentGameState();

}
