package com.SkyIsland.GameSuite.input;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
	 * As long as this KeyMap has been applied to the active {@link com.SkyIsland.GameSuite.input.Input Input}
	 * and no map has overridden this mapping by being applied later, the passed Key's 
	 * {@link com.SkyIsland.GameSuite.input.Key#pressed() pressed()} and 
	 * {@link com.SkyIsland.GameSuite.input.Key#released() released()} method will be called.
	 * @param event
	 * @param key
	 */
	public void register(KeyEvent event, Key key) {
		map.put(event, key);
	}
	
	public Key getKey(KeyEvent event) {
		if (event == null) {
			return null;
		}
		return map.get(event);
	}
	
	public Set<KeyEvent> getKeyEvents() {
		return map.keySet();
	}

}
