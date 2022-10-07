package com.sauceDemo.TestClasses1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.PMOClasses.HomePage;
import com.sauceDemo.PMOClasses.LoginPage;

public class TC02AddToCartFunctionalitySingleProduct 
{
	WebDriver driver;         
	
	@BeforeMethod
	public void setUpMethod()
	
	{
		
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver();
	System.out.println("Chrome Browser is Opened");
	
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL is opened");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//login
	LoginPage lp = new LoginPage(driver);
	lp.senduserName();
	System.out.println("Username is Entered");

	lp.SendpassWord();
	System.out.println("Password is Entered");
	
	lp.clickLoginButton();
	System.out.println("Click on Login Button");
	}

	@Test
	public void verifyAddToCartFunctionality()
	{

		HomePage hp = new HomePage(driver);
		
		//single elements
		hp.clickbagButton();

		
		//Scenario --> single product bagButton
	
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = driver.getCurrentUrl();
		
		if(expectedUrl.equals(actualUrl))
		{
			System.out.println("Add to cart test case is passed");
		}
		else
		{
			System.out.println("Add to cart test case is failed");
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
