/**
 * 
 */
package com.sellabs.practice;

/**
 * @author Prosenjit
 *
 */
public class BrowserHandle {

	public BrowserHandle(Browser browser) {
		// TODO Auto-generated constructor stub
		switch (browser) {
		case CHROME:
			System.out.println("Chrome launches");
			break;
		case FIREFOX:
			System.out.println("firefox launches");
			break;
		case EDGE:
			System.out.println("edge launches");
			break;
		default:
			System.out.println("===========");
			break;
		}

	}

}
