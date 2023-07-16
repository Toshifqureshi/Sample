package com.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;
	
	@BeforeSuite
	public void dbconfig()
	{
		System.out.println("connect to db");
	}
	@BeforeClass
	public void launchbrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("browser launced");
	}
	@BeforeMethod
	public void login()
	{
		driver.get("https://www.facebook.com");
		System.out.println("succesfully login");
		
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
		
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	System.out.println("browser closed");
	}
	@AfterSuite
	public void closeDb()
	{
		System.out.println("db closed");
		Reporter.log("driver");
	}

}
