package com.SkyIsland.RPG.display;

import com.SkyIsland.RPG.display.Leafs.Leaf;

/**
 * Class of objects that display pieces of information.
 * <p>Display objects are designed to take varyign pieces of data and display them in
 * custom ways. To allow for a more dynamic information to be displayed, Display objects
 * use the helper interface {@link com.SkyIsland.RPG.display.Leafs.Leaf Leaf} to pass meaningful
 * information between to different types of displays and have them recieved and processed
 * specifically for that display.</p>
 * @author Skyler
 *
 */
public interface Display {
	
	/**
	 * Takes the information passed as a Leaf and displays it defaultly.<br />
	 * @param data A {@link com.SkyIsland.RPG.display.Leafs.Leaf Leaf} containing the data to be displayed
	 */
	public void display(Leaf data);
	
	
}
