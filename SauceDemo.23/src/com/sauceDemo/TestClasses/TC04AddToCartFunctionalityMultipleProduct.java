package com.sauceDemo.TestClasses;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sauceDemo.POMclasses.HomePage;

import junit.framework.Assert;

public class TC04AddToCartFunctionalityMultipleProduct extends TestBaseClass 
{

	@Test
	public void verifyAddToCartfunctionalityMultipleProduct() 
	{
		//homepage
		HomePage hp = new HomePage(driver);
		hp.clickaddToCartButton();
		System.out.println("Click on cart button");
		
		
		//scenario
		String actualvalue = driver.findElement(By.className("shopping_cart_badge")).getText();
		System.out.println(actualvalue);
		String expectedvalue = "6";
		
		
		if(actualvalue.equals(expectedvalue))
		{
			System.out.println("addtocart-6 test case is pass");
		}
		else
		{
			System.out.println("addtocart-6 test case is pass");
		}
		
		
	}
	
	
	
	
	
	
	
}
