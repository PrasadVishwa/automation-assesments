package com.sauceDemo.TestClasses1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.PMOClasses.HomePage;
import com.sauceDemo.PMOClasses.LoginPage;

public class TC01LoginFunctionality 
{
	WebDriver driver;        //Declare only -globally
	
	@BeforeMethod
	public void setUpMethod()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();            //intialize
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
		
	}
	
	@Test
	
	public void verifyLoginFunctionality()
	{
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
		
	@AfterMethod
	
	public void tearDownMethod()
	{
		HomePage hp = new HomePage(driver);
		hp.clickmenuButton();
		System.out.println("Click on menu Button");
		
		hp.clicklogoutButton();
		System.out.println("Click on Logout Button");
		
		driver.quit();
		
		System.out.println("Program end");
		
		
		
	}
		
		
		
		
		
		
		
		
	}


