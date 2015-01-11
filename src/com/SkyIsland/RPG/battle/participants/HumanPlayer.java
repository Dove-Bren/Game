package com.SkyIsland.RPG.battle.participants;

import java.util.List;
import java.util.Random;

import com.SkyIsland.GameSuite.display.Leafs.TextLeaf;

public class HumanPlayer extends Player {
	
	private int health;
	
	public HumanPlayer(int ID, String name) {
		super(ID, name);
		health = 10;
	}

	@Override
	public void startTurn() {
		//TODO whuuuut to do? get from input!
		
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
			while (true) {
				
			}
		}
	}
	
	
}
