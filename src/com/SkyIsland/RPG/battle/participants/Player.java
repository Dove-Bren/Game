package com.SkyIsland.RPG.battle.participants;

public abstract class Player {
	
	protected String name;
	
	protected int ID;
	
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
	
	public abstract void startTurn();
	
}
