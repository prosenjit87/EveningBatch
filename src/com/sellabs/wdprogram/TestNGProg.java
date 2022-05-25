/**
 * 
 */
package com.sellabs.wdprogram;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Prosenjit
 *
 */
public class TestNGProg {

	@Test(priority = 1, testName = "TC001_Something", description = "")
	public void B() {
		System.out.println(10);
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

	@BeforeMethod
	public void precond() {
		System.out.println("before method");
	}

	@AfterMethod
	public void postcond() {
		System.out.println("after method");
	}

}
