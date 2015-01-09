package com.SkyIsland.RPG.battle;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.SkyIsland.RPG.battle.participants.Player;

public class TurnControl {
	
	private List<Player> turnList;
	
	private ListIterator<Player> iterator;
	
	public TurnControl(Collection<Player> players) {
		turnList = new LinkedList<Player>(players);
		Collections.shuffle(turnList);
		
		iterator = turnList.listIterator();
	}
	
	public TurnControl(Collection<Player> ... players) {
		turnList = new LinkedList<Player>();
		for (Collection<Player> p: players) {
			turnList.addAll(p);
		}
		
		Collections.shuffle(turnList);
		
		iterator = turnList.listIterator();
	}
	
	public Player getNext() {
		if (!iterator.hasNext()) {
			while (iterator.hasPrevious()) {
				iterator.previous();
			}
		}
		return iterator.next();
	}
	
}
