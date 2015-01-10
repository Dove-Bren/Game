package com.SkyIsland.RPG.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * A input controlling device that takes input from some source and presents it in a standard
 * format that can be easily used.
 * <p>
 * The input </p>
 * @author Skyler
 *
 */
public abstract class Input implements KeyListener {
	
	/**
	 * Map used in getting an action out of a key event
	 */
	private static KeyMap map;
	
	public static void registerMap(KeyMap map) {
		if (map == null) {
			return;
		}
	Input.map = map;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
