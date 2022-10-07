package com.sauceDemo.TestClasses;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sauceDemo.POMclasses.HomePage;


//@Listeners(com.sauceDemo.UtilityClasses.Listener.class)
public class TC03LogoutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogoutFunctionality()
	{
		HomePage hp = new HomePage(driver);
		hp.clickmenuButton();
		log.info("Click on menu Button");
		
		hp.clicklogoutButton();
		log.info("Click on Logout Button");
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		log.info("Apply the assertion");
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("Checking the results");
		
		
		
		
		
		
		
		
//		if(expectedTitle.equals(actualTitle))
//		{
//			System.out.println("Logout test is Passed");
//		}
//		else
//		{
//			System.out.println("Logout test is failed");
//		}
		
	}

}
