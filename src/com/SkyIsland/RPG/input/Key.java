package com.SkyIsland.RPG.input;

/**
 * 
 * @author Skyler
 *
 */
public interface Key {
	
	/**
	 * Called when the input corresponding to this key is pressed.<br />
	 * Keys must be registered with a {@link com.SkyIsland.RPG.input.KeyMap KeyMap}, which 
	 * must then be registered with the {@link com.SkyIsland.RPG.input.Input Input} being used.
	 */	
	public void pressed();
	
	/**
	 * Called when the keyboard issues a key-release code for the corresponding key.<br />
	 * Keys must be registered with a {@link com.SkyIsland.RPG.input.KeyMap KeyMap}, which 
	 * must then be registered with the {@link com.SkyIsland.RPG.input.Input Input} being used.
	 */
	public void released();
	
	//TODO make a PRESS RELEASE AND HOLD event
}
