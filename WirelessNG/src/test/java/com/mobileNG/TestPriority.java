package com.mobileNG;

import org.testng.annotations.Test;

public class TestPriority {
	@Test(priority=0,invocationCount=1, enabled=true)
	void dog()
	{
		System.out.println("bow bow");
	}
	@Test(priority=1,invocationCount=2,enabled=true)
	void cat()
	{
		System.out.println("mew mew");
	}
	@Test(priority=2,invocationCount=1,enabled=false)
void Horse()
{
System.out.println("hee hee");	
}
}
