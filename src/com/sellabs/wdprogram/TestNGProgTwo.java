/**
 * 
 */
package com.sellabs.wdprogram;

import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author Prosenjit
 *
 */
public class TestNGProgTwo {

	@Test(priority = 1)
	public void B() {
		Reporter.log("10", true);
	}

	@Test(priority = 3)
	public void D() {
		System.out.println("D");
	}

	@Test(priority = 2)
	public void A() {
		System.out.println("A");
	}

	@Test(priority = 4)
	public void C() {
		System.out.println("C");
	}

}
