package com.SkyIsland.RPG.battle.participants;

import java.util.LinkedList;
import java.util.List;

import com.SkyIsland.RPG.battle.Battle;

public class Team {
	
	private String name;
	
	private List<Player> players;
	
	private Battle battle;
	
	private Team enemyTeam;
	
	public Team(Battle battle, String name) {
		this.name = name;
		this.battle = battle;
		battle.registerTeam(this);
		players = new LinkedList<Player>();
	}
	
	//tmp
	public void setEnemy(Team team) {
		this.enemyTeam = team;
	}
	
	public Team getEnemy() {
		return this.enemyTeam;
	}
	
	
	
	public List<Player> getPlayerList() {
		return this.players;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addPlayer(Player player) {
		this.players.add(player);
		player.setTeam(this);
	}
	
	public Battle getBattle() {
		return this.battle;
	}
	
	
}
