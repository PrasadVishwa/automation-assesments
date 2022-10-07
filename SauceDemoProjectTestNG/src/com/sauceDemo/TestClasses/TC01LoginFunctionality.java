package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.PMOClasses.LoginPage;
import com.sauceDemo.UtilityClasses.UtilityClass;



public class TC01LoginFunctionality 
{
	@Test
	public void LoginFunctionality() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Chrome Browser is Opened");
	
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL opened");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//Login to page
	LoginPage lp = new LoginPage(driver);
	lp.senduserName();
	System.out.println("Username is Entered");

	lp.SendpassWord();
	System.out.println("Password is Entered");
	
	lp.clickLoginButton();
	System.out.println("Click on Login Button");
	
	UtilityClass.takeScreenshot(driver);
	
	
	String expectedHomePageUrl = "https://www.saucedemo.com/inventory.html";
	
	String actualHomePageUrl = driver.getCurrentUrl();
	
	if(expectedHomePageUrl.equals(actualHomePageUrl))
	{
		System.out.println("Login test Passed- we have successfully login on sauce demo website");
	}
	else
	{
		System.out.println("Login Test failed");
	}
	
	
	
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	


