package com.extia.tennis.model;

public class Player {
	
	private String 	name;
	private Integer score;
	
	public Player() {
		this.score = 0;
	}
	
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}
	
	public Integer getScore() {
		return this.score;
	}
	
	public void addPoints(Integer points) {
		if (points == TennisRules.ADV.getValue() 
				|| points == TennisRules.DEUCE.getValue() 
				|| points == TennisRules.INITIAL.getValue()) {
			this.score = points;
		} else {
			this.score += points;
		}
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
