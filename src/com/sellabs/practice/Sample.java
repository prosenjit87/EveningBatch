/**
 * 
 */
package com.sellabs.practice;

/**
 * @author Prosenjit
 *
 */
public class Sample extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("selenium");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Sample s = new Sample();
		s.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("testing");
			Thread.sleep(500);
		}

	}

}
