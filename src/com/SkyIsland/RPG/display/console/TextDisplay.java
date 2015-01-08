package com.SkyIsland.RPG.display.console;

import java.io.OutputStream;
import java.io.PrintStream;

import com.SkyIsland.RPG.display.Display;
import com.SkyIsland.RPG.display.Leafs.Leaf;
import com.SkyIsland.RPG.display.Leafs.TextLeaf;

/**
 * Takes leaves and displays their alt text to the wrapped output stream.
 * @author Skyler
 */
public class TextDisplay implements Display {

	private PrintStream output;
	
	/**
	 * Creates a TextDisplay around standard out, as defined by<br/>
	 * <i>System.out</i>
	 */
	public TextDisplay() {
		output = System.out;
	}
	
	public TextDisplay(OutputStream outputStream) {
		output = new PrintStream(outputStream);
	}
	
	/**
	 * Takes the passed leaf and displays the text stored as {@link com.SkyIsland.RPG.display.Leafs.Leaf#altText altText}
	 */
	public void display(Leaf data) {
		output.println(data.getAltText());
	}
	
	public void display(TextLeaf data) {
		output.println(data.getText());
	}

}
