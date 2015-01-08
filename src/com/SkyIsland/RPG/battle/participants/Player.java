package com.SkyIsland.RPG.battle.participants;

public abstract class Player {
	
	protected String name;
	
	protected int ID;
	
	protected Team team;
	
	public Player(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public Team getTeam() {
		return this.team;
	}
	
	public abstract void damage(Player damager, int amount);
	
	public abstract void startTurn();
	
}
