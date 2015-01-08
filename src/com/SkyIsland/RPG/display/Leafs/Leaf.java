package com.SkyIsland.RPG.display.Leafs;


/**
 * A Leaf is a package of information meant to be read and processed by a 
 * {@link com.SkyIsland.RPG.display.Display Display}.
 * <p>Displays will handle different Leaf objects based on how they display information.</p>
 * @author Skyler
 *
 */
public abstract class Leaf {
	
	/**
	 * A semi-unique number identifying the leaf.<br />
	 * ID's may be any number, but unique numbers for a Leaf's lifetime is suggested.
	 */
	protected int id;
	
	/**
	 * Very similar to alt text in HTML, the underlying text explanation of what's being
	 * represented that is usually only used as a last resort.
	 */
	protected String altText;
	
	
	public int getID() {
		return id;
	}
	
	public String getAltText() {
		return this.altText;
	}
}
