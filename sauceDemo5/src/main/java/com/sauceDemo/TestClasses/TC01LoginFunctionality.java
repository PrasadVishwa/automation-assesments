package com.sauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sauceDemo.POMclasses.HomePage;

//@Listeners(com.sauceDemo.UtilityClasses.Listener.class)
public class TC01LoginFunctionality extends TestBaseClass 
{

	@Test
	public void verifyLoginFunctionality() 
	{
		String expectedHomePageUrl = "https://www.saucedemo.com/inventory.html";

		String actualHomePageUrl = driver.getCurrentUrl();
        
		log.info("Apply the assertions");
		Assert.assertEquals(expectedHomePageUrl, actualHomePageUrl);
		log.info("Checking the results");
		
		
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
		log.info("Click on menu Button");

		hp.clicklogoutButton();
		log.info("Click on Logout Button");

	}
}
