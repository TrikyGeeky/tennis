package com.triki.tennis.model;

public enum TennisRules {

	DEUCE(50),
	ADV(60),
	INITIAL(00);
	
	private int value;
	
	private TennisRules(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
}
