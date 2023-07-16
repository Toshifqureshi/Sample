package com.mobileNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NokiaNG {
	@Test
	void raj()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.get("https://www.google.com/");
	    Reporter.log("driver.get(\"https://www.flipkart.com/\");");
	    Reporter.log(" driver.get(\"https://www.google.com/\");", true);
	    //Assert.fail();
	    }
	/*@Test
	void kam()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Reporter.log("driver.get(\"https://www.selenium.dev/\")", true);
	}*/

}
