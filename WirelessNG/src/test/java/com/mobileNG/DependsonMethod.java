package com.mobileNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethod {
	@Test
	void snack()
	{
		Assert.fail();
		System.out.println("hisss");
	}

	@Test(dependsOnMethods="snack")
	void dog()
	{
		System.out.println("bho bhow");
	}
	
	@Test
	void cat()
	{
		System.out.println("mewww");
	}
	
}
