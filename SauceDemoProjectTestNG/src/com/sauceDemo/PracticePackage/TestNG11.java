package com.sauceDemo.PracticePackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG11 
{
	@Test(priority=2)
	public void blogin()
	{
		System.out.println("login");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods= {"blogin"},priority=1)
	public void alogout()
	{
		System.out.println("logout");
	}
	
	
	
	
	
	
	
	
}
