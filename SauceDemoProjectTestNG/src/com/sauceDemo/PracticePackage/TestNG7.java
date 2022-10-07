package com.sauceDemo.PracticePackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG7 
{
	SoftAssert soft = new SoftAssert();
	
	@Test
	public void verifyLogin()
	{
		//example of soft assertion
		//s1
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = "ABC";
		
		soft.assertEquals(actualUrl, expectedUrl,"url not matched");            //fail
		
		//s2
		String expetedTitle = "SauceDemo";
		String actualTitle = "SauceDemo";
		soft.assertEquals(actualTitle, expetedTitle,"title not matched");       //pass
		
		soft.assertAll();
	
	}
	
	@Test
	public void verifyProduct()
	{
		String expectedTitle = "BagPack";
		String actualTitle = "Pack";
		
		soft.assertEquals(actualTitle, expectedTitle,"product title not matched");
	
	    soft.assertAll();
	    
	}
	@Test
	public void sampleTest()
	{
		int a = 50;
		int b = 60;
		Assert.assertTrue(a<=b);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
