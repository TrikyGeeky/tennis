package com.triki.tennis.model;

public class Player {
	
	private String 	name;
	private Integer gameScore;
	private Integer	setScore;
	
	public Player() {
		this.gameScore 	= 0;
		this.setScore = 0;
	}
	
	public Player(String name) {
		this.gameScore 	= 0;
		this.setScore = 0;
		this.name 		= name;
	}
	
	public void addPoints(Integer points) {
		if (points == TennisRules.ADV.getValue() 
				|| points == TennisRules.DEUCE.getValue() 
				|| points == TennisRules.INITIAL.getValue()) {
			this.gameScore = points;
		} else {
			this.gameScore += points;
		}
	}
	
	public void winSet() {
		this.setScore += 1;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getGameScore() {
		return this.gameScore;
	}

	/**
	 * @return the matchScore
	 */
	public Integer getSetScore() {
		return setScore;
	}

	@Override
	public int hashCode() {
		final int prime = 11;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		else if (obj == null)
			return false;
		else {
			Player player = (Player) obj;
			return this.name.equals(player.getName());
		}
	}

}
