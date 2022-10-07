package com.sauceDemo.PracticePackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG5 
{
	//sample example
	@Test
	public void verifyLogin()
	{
		String expectedURl = "https://www.saucedemo.com/inventory.html";
		
		String actualURL = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualURL, expectedURl);
	}

}
