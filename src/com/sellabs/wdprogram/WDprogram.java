/**
 * 
 */
package com.sellabs.wdprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Prosenjit
 *
 */
public class WDprogram {

	WebDriver driver;

	By downloadLink = By.linkText("Downloads");
	By serachArea = By.id("srchword");
	String url = "https://www.rediff.com/";

	public void wd() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath + "/geckodriver-v0.29.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement srchFild =  driver.findElement(serachArea);
		srchFild.clear();
		srchFild.sendKeys("cyclone");
		srchFild.submit();
		driver.quit();
		
	}

	public static void main(String[] args) {
		WDprogram wdp = new WDprogram();
		wdp.wd();
	}

}
