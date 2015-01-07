package com.SkyIsland.RPG.battle.participants;

import java.util.LinkedList;
import java.util.List;

public class Team {
	
	private String name;
	
	private List<Player> players;
	
	public Team(String name) {
		this.name = name;
		players = new LinkedList<Player>();
	}
	
	public List<Player> getPlayerList() {
		return this.players;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addPlayer(Player player) {
		this.players.add(player);
	}
	
	
}
