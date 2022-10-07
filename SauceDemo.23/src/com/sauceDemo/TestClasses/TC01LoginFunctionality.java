package com.sauceDemo.TestClasses;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMclasses.HomePage;



public class TC01LoginFunctionality extends TestBaseClass 
{

	@Test
	public void verifyLoginFunctionality() 
	{
		String expectedHomePageUrl = "https://www.saucedemo.com/inventory.html";

		String actualHomePageUrl = driver.getCurrentUrl();

		Assert.assertEquals(expectedHomePageUrl, actualHomePageUrl);
		
		
		
//		if (expectedHomePageUrl.equals(actualHomePageUrl)) 
//		{
//			System.out.println("Login test Passed- we have successfully login on sauce demo website");
//		} 
//		else 
//		{
//			System.out.println("Login Test failed");
//		}

		HomePage hp = new HomePage(driver);
		hp.clickmenuButton();
		System.out.println("Click on menu Button");

		hp.clicklogoutButton();
		System.out.println("Click on Logout Button");

	}
}
