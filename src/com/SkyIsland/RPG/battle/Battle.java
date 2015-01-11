package com.SkyIsland.RPG.battle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.SkyIsland.GameSuite.display.Leafs.TextLeaf;
import com.SkyIsland.GameSuite.display.console.TextDisplay;
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
	
	private Player activePlayer;
	
	private TextDisplay display;
	
	public Battle() {
		teams = new HashSet<Team>();
		inProgress = false;
	}
	
	public void registerTeam(Team team) {
		teams.add(team);
	}
	
	public void start() {
		if (inProgress) {
			display.display(new TextLeaf(10, "Start Fail: Already in progress!", "Battle couldn't start because it already has!"));
			return;
		}
		if (teams.isEmpty() || teams.size() < 2) {
			display.display(new TextLeaf(10, "Start Fail: Not enough teams!", "Battle couldn't start because there aren't enough teams!"));
			return;
		}
		
		inProgress = true;
		
		Set<Player> players = new HashSet<Player>();
		
		Iterator<Team> it = teams.iterator();
		Team first = null, cur = null, prev = null;
		while (it.hasNext()) {
			cur = it.next();
			
			players.addAll(cur.getPlayerList());
			
			if (prev == null) {
				first = cur;
				prev = cur;
			}
			else {
				cur.setEnemy(prev);
				prev = cur;
			}
		}
		
		//finish the chain
		first.setEnemy(cur);
		
		turner = new TurnControl(players);	
		
		activePlayer = turner.getNext();
		
		activePlayer.startTurn();
	}
	
	public boolean registerTurnEnd(Player player) {
		if (player == null) {
			return false;
		}
		
		if (player.getID() != activePlayer.getID()) {
			return false;
		}
		
		//our simple check worked out, so proceed
		
		activePlayer = turner.getNext();
		
		activePlayer.startTurn();
		
		TextLeaf info = new TextLeaf(10, "Turn Start: " + activePlayer.getID(), activePlayer.getName() + " has started their turn!");

		display.display(info);
		
		return true;
	}
	
	
	public void setDisplay(TextDisplay disp) {
		this.display = disp;
	}
	
	public TextDisplay getDisplay() {
		return this.display;
	}
	
	
}
