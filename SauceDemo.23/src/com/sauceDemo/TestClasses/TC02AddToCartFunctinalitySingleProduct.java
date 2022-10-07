package com.sauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMclasses.HomePage;



public class TC02AddToCartFunctinalitySingleProduct extends TestBaseClass
{
	
	@Test
	public void verifyAddToCartFunctionality()
	{
	HomePage hp = new HomePage(driver);
	
	//single elements
	hp.clickbagButton();

	
	//Scenario --> single product bagButton

	String expectedUrl = "https://www.saucedemo.com/inventory.html";
	String actualUrl = driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl, actualUrl);
	
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