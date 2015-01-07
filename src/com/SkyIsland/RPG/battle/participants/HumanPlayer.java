package com.SkyIsland.RPG.battle.participants;

import java.util.List;
import java.util.Random;

public class HumanPlayer extends Player {
	
	private int health;
	
	public HumanPlayer(int ID, String name) {
		super(ID, name);
		health = 10;
	}

	@Override
	public void startTurn() {
		//TODO whuuuut to do? get from input!
		List<Player> enemies = team.getEnemy().getPlayerList();
		Random rand = new Random();
		
		if (enemies.isEmpty()) {
			endTurn();
		}
		
		Player enemy = enemies.get(rand.nextInt(enemies.size()));
		
		enemy.damage(rand.nextInt(3) + 1);
	}
	
	private void endTurn() {
		//team.getBattle().
	}
	
	public int getHealth() {
		return this.health;
	}
	
	@Override
	public void damage(int amount) {
		this.health -= amount;
		//TODO IS DEAD?
	}
	
	
}
