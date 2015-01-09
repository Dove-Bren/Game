package com.SkyIsland.RPG.battle.participants;

import java.util.List;
import java.util.Random;

import com.SkyIsland.RPG.battle.participants.AI.AI;
import com.SkyIsland.RPG.display.Leafs.TextLeaf;

public class ComputerPlayer extends Player {
	
	private AI ai;
	
	private int health;
	
	public ComputerPlayer(int ID, String name) {
		super(ID, name);
		this.health = 5;
		//TODO add default AI
	}
	
	public ComputerPlayer(int ID, String name, AI ai) {
		this(ID, name);
		this.ai = ai;
	}
	
	public void startTurn() {
		//TODO get turn from AI
		
		team.getBattle().getDisplay().display(new TextLeaf(ID, "Turn Start: " + ID, name + " starting turn..."));
		
		List<Player> enemies = team.getEnemy().getPlayerList();
		Random rand = new Random();
		
		if (enemies.isEmpty()) {
			endTurn();
		}
		
		Player enemy = enemies.get(rand.nextInt(enemies.size()));
		
		team.getBattle().getDisplay().display(new TextLeaf(ID, "Target selected: " + enemy.getID(), enemy.getName() + " selected as target."));
		
		enemy.damage(this, rand.nextInt(3) + 1);
		
		endTurn();
		
	}
	
	private void endTurn() {
		team.getBattle().registerTurnEnd(this);
	}
	
	public int getHealth() {
		return this.health;
	}
	
	@Override
	public void damage(Player damager, int amount) {
		this.health -= amount;

		team.getBattle().getDisplay().display(new TextLeaf(ID, "Recieved damage: " + ID + " -> " + amount, getName() + " recieved " + amount + " points of damage from " + damager.getName()));
		//TODO IS DEAD?
		if (health <= 0) {
			team.getBattle().getDisplay().display(new TextLeaf(ID, "Death: " + ID, getName() + " has been slain!\n" +
					"CPU: " + health + "\tPlayer: " + ((HumanPlayer) damager).getHealth()));
			while (true) { 
				
			}
		}
	}

}
