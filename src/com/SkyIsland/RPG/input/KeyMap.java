package com.SkyIsland.RPG.input;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class KeyMap {
	
	/**
	 * Internal map between actual key events and the key object
	 */
	private Map<KeyEvent, Key> map;
	
	public KeyMap() {
		this.map = new HashMap<KeyEvent, Key>();
	}
	
	/**
	 * Registers the passed event to the passed key object.<br />
	 * As long as this KeyMap has been applied to the active {@link com.SkyIsland.RPG.input.Input Input}
	 * and no map has overridden this mapping by being applied later, the passed Key's 
	 * {@link com.SkyIsland.RPG.input.Key#fire() fire()} method will be called.
	 * @param event
	 * @param key
	 */
	public void register(KeyEvent event, Key key) {
		map.put(event, key);
	}
}
