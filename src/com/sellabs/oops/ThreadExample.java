/**
 * 
 */
package com.sellabs.oops;

/**
 * @author Prosenjit
 *
 */
public class ThreadExample extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("selenium");
		}

	}
	
	public static void main(String[] args) {
		ThreadExample te = new ThreadExample();
		te.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("testing");
		}
	}

}
