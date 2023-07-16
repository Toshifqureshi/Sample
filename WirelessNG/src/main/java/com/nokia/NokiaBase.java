package com.nokia;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NokiaBase {
	
	public WebDriver driver;
	
	@BeforeSuite
	
	public void dbconfig()
	{
		System.out.println("connect to db");
	}
	@BeforeClass
	public void  Launchbrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icicibank.com");
		System.out.println("launch the browser");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("successfully login");
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
		System.out.println("browser closed ");
	}
	@AfterSuite
	public void dbclose()
	{
		System.out.println("db close");
	}
	

}
