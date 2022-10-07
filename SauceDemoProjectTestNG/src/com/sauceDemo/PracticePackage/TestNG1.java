package com.sauceDemo.PracticePackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 
{
	//post condition
	
	@AfterMethod
	public void tearDownMethod()
	{
		System.out.println("3.Logout done-URL & Browser is close");
	}
	
	//test scenarios
	
	@Test
	public void verifyloginFunctionality()
	{
		System.out.println("2.test case is passed");
	}

	//pre condition
	
	@BeforeMethod
	public void SetUpMethod()
	{
		System.out.println("1.Browser open-URL open - Login Done");
	}
}
