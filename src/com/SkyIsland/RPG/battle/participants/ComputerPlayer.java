package com.SkyIsland.RPG.battle.participants;

import com.SkyIsland.RPG.battle.participants.AI.AI;

public class ComputerPlayer extends Player {
	
	private AI ai;
	
	public ComputerPlayer(int ID, String name) {
		super(ID, name);
		//TODO add default AI
	}
	
	public ComputerPlayer(int ID, String name, AI ai) {
		this(ID, name);
		this.ai = ai;
	}
	
	public void startTurn() {
		//TODO get turn from AI
	}

}
