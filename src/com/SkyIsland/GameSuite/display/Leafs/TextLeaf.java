package com.SkyIsland.GameSuite.display.Leafs;

public class TextLeaf extends Leaf {
	
	private String text;
	
	public TextLeaf(int ID, String altText, String text) {
		this.id = ID;
		
		this.altText = altText;
		
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
	
}
