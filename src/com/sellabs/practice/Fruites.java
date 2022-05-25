/**
 * 
 */
package com.sellabs.practice;

/**
 * @author Prosenjit
 *
 */
public enum Fruites {
	
	MANGO("Green"), APPLE("Red"), BANANA("Yellow");
	
	private String color;
	
	private Fruites(String color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

}
