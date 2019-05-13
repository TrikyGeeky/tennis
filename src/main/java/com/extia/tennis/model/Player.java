package com.extia.tennis.model;

public class Player {
	
	private String 	name;
	private Integer score;
	private boolean isWinner;
	
	public Player() {
		this.score = 0;
		this.isWinner = false;
	}
	
	public Player(String name) {
		this.score = 0;
		this.name = name;
		this.isWinner = false;
	}
	
	public Integer getScore() {
		return this.score;
	}
	
	public void addPoints(Integer points) {
		if (points != 0) {
			score += points;
		} else {
			score = points;
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
	
	/**
	 * @return the isWinner
	 */
	public boolean isWinner() {
		return isWinner;
	}

	/**
	 * @param isWinner the isWinner to set
	 */
	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
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
