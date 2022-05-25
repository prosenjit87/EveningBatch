/**
 * 
 */
package com.sellabs.wdprogram;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Prosenjit
 *
 */
public class ParameterExample {
	
	@Parameters({"value1", "value2"})
	@Test
	public void ops(int a, int b) {
		System.out.println("value is: "+(a+b));
	}

}
