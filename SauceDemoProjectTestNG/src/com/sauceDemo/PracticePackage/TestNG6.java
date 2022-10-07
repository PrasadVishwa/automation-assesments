package com.sauceDemo.PracticePackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 
{
	@Test
	public void verifyLogin()
	{
		//example for Hard assertion
		//s1
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = "ABC";
		Assert.assertEquals(actualURL, expectedURL);          //fail
		
		//s2
		String expectedTitle = "SauceDemo";
		String actualTitle = "sauceDemo";
		
		Assert.assertEquals(actualTitle, expectedTitle);

	}
 
	@Test
	public void verifyProduct()
	{
		String expectedTitle = "BagPack";
		String actualTitle = "BagPack";
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	

}
