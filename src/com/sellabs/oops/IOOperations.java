/**
 * 
 */
package com.sellabs.oops;

import java.io.File;
import java.io.IOException;

/**
 * @author Prosenjit
 *
 */
public class IOOperations {

	public void ops() throws IOException {

		String loc = System.getProperty("user.dir");
//		System.out.println(loc);

		File f = new File(loc+"\\sample.txt");

		if (f.exists()) {
			System.out.println("File already exists..");
			System.out.println("Deleting the file.. " + f.delete());
		} else {
			System.out.println("File doesn't exist..creating one");
			System.out.println("File created: " + f.createNewFile());
		}

	}

	public static void main(String[] args) throws IOException {
		IOOperations iop = new IOOperations();
		iop.ops();
	}
}
