package com.sauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sauceDemo.POMclasses.HomePage;


//@Listeners(com.sauceDemo.UtilityClasses.Listener.class)
public class TC02AddToCartFunctinalitySingleProduct extends TestBaseClass
{
	
	@Test
	public void verifyAddToCartFunctionality()
	{
	HomePage hp = new HomePage(driver);
	
	//single elements
	hp.clickbagButton();
	log.info("Clisk on bag button");

	
	//Scenario --> single product bagButton

	String expectedUrl = "https://www.saucedemo.com/inventory.html";
	String actualUrl = driver.getCurrentUrl();
	
	log.info("Apply the assertions");
	Assert.assertEquals(expectedUrl, actualUrl);
	log.info("Checking the results");
	
//	if(expectedUrl.equals(actualUrl))
//	{
//		System.out.println("Add to cart test case is passed");
//	}
//	else
//	{
//		System.out.println("Add to cart test case is failed");
//	}

}
}