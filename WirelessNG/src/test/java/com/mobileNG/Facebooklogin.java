package com.mobileNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericutility.Baseclass;

public class Facebooklogin extends Baseclass{
	@Test
	void logintofacebook()
	{
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hey");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("hello");
		driver.findElement(By.name("login")).click();
		driver.get("https://www.google.com/");
		Reporter.log("driver.get(\"https://www.google.com/\")");
	}

}
