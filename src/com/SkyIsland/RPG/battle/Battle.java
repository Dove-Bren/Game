package com.SkyIsland.RPG.battle;

import java.util.HashSet;
import java.util.Set;

import com.SkyIsland.RPG.battle.participants.Player;
import com.SkyIsland.RPG.battle.participants.Team;

/**
 * Represents an active battle going on.
 * @author Skyler
 */
public class Battle {
	
	private Set<Team> teams;
	
	private TurnControl turner;
	
	private boolean inProgress;
	
	public Battle() {
		teams = new HashSet<Team>();
		inProgress = false;
	}
	
	public void registerTeam(Team team) {
		teams.add(team);
	}
	
	public void start() {
		if (inProgress) {
			return;
		}
		
		inProgress = true;
		
		Set<Player> players = new HashSet<Player>();
		for (Team team : teams) {
			players.addAll(team.getPlayerList());
		}
		
		turner = new TurnControl(players);	
	}
	
	
	
	
}
