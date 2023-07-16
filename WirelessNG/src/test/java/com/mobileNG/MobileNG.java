package com.mobileNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nokia.NokiaBase;



public class MobileNG extends NokiaBase{
	@Test
	void loginICICIBank()
	{
	driver.findElement(By.linkText("LOGIN")).click();
	Reporter.log("LOGIN");
	}

}
