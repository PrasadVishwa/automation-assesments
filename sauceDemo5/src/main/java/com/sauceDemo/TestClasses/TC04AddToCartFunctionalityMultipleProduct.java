package com.sauceDemo.TestClasses;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sauceDemo.POMclasses.HomePage;


//@Listeners(com.sauceDemo.UtilityClasses.Listener.class)
public class TC04AddToCartFunctionalityMultipleProduct extends TestBaseClass 
{

	@Test
	public void verifyAddToCartfunctionalityMultipleProduct() 
	{
		//homepage
		HomePage hp = new HomePage(driver);
		hp.clickaddToCartButton();
		log.info("Click on cart button");
		
		
		//scenario
		String actualvalue = driver.findElement(By.className("shopping_cart_badge")).getText();
		log.info(actualvalue);
		String expectedvalue = "6";
		log.info("Apply the assertions ");
		Assert.assertEquals(actualvalue, expectedvalue);
		log.info("Checkind the results");
		
		
		
//		if(actualvalue.equals(expectedvalue))
//		{
//			System.out.println("addtocart-6 test case is pass");
//		}
//		else
//		{
//			System.out.println("addtocart-6 test case is pass");
//		}
		
		
	}
	
	
	
	
	
	
	
}
