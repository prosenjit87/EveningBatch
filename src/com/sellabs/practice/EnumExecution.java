/**
 * 
 */
package com.sellabs.practice;

/**
 * @author Prosenjit
 *
 */
public class EnumExecution {
	
	public static void main(String[] args) {
		Fruites val[] = Fruites.values();
		for (Fruites fruitName : val) {
			System.out.println(fruitName.getColor());
		}
	}

}
