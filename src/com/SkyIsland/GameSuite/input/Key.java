package com.SkyIsland.GameSuite.input;

/**
 * 
 * @author Skyler
 *
 */
public interface Key {
	
	/**
	 * Called when the input corresponding to this key is pressed.<br />
	 * Keys must be registered with a {@link com.SkyIsland.GameSuite.input.KeyMap KeyMap}, which 
	 * must then be registered with the {@link com.SkyIsland.GameSuite.input.Input Input} being used.
	 */	
	public void pressed();
	
	/**
	 * Called when the keyboard issues a key-release code for the corresponding key.<br />
	 * Keys must be registered with a {@link com.SkyIsland.GameSuite.input.KeyMap KeyMap}, which 
	 * must then be registered with the {@link com.SkyIsland.GameSuite.input.Input Input} being used.
	 */
	public void released();
}
