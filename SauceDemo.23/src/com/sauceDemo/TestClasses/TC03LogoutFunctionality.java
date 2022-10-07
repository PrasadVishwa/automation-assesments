package com.sauceDemo.TestClasses;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMclasses.HomePage;



public class TC03LogoutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogoutFunctionality()
	{
		HomePage hp = new HomePage(driver);
		hp.clickmenuButton();
		System.out.println("Click on menu Button");
		
		hp.clicklogoutButton();
		System.out.println("Click on Logout Button");
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		
		
		
		
		
		
		
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
