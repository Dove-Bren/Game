package com.SkyIsland.RPG;

import com.SkyIsland.GameSuite.display.Display;
import com.SkyIsland.GameSuite.display.console.TextDisplay;
import com.SkyIsland.RPG.battle.Battle;
import com.SkyIsland.RPG.battle.participants.ComputerPlayer;
import com.SkyIsland.RPG.battle.participants.HumanPlayer;
import com.SkyIsland.RPG.battle.participants.Player;
import com.SkyIsland.RPG.battle.participants.Team;

public class Driver {

	public static Display display;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextDisplay tDisp;
		tDisp = new TextDisplay();
		
		Battle bat = new Battle();
		
		bat.setDisplay(tDisp);
		
		//one human player
		Player play;
		Team team;
		
		team = new Team(bat, "Player Team");
		
		play = new HumanPlayer(1, "Player1");
		team.addPlayer(play);
		
		team = new Team(bat, "Computer Team");
		
		play = new ComputerPlayer(2, "CPU 1");
		team.addPlayer(play);
		
		bat.start();
		
	}

}
