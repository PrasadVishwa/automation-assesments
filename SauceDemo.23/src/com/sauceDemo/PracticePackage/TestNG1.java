package com.sauceDemo.PracticePackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 
{
	//pre condition
	
	@BeforeMethod
	public void setUpMethod()
	{
		System.out.println("1.Browser open-url open-login done");
	}
	
	//test scenario
	
	@Test
	public void verifyloginFunctionality()
	{
		System.out.println("2.test case is passed");
	}
	
	//post condition
	
	@AfterMethod
	public void tearDoenMethod()
	{
		System.out.println("3.logout done-url and browser close");
	}
	
	
	
	
	
	
	

}
