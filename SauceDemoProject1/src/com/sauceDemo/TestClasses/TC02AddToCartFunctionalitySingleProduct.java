package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.LoginPage;

public class TC02AddToCartFunctionalitySingleProduct 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser is Opened");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//login
		LoginPage lp = new LoginPage(driver);
		lp.senduserName();
		System.out.println("Username is Entered");

		lp.Sendpassword();
		System.out.println("Password is Entered");
		
		lp.clickLoginButton();
		System.out.println("Click on Login Button");
		
		//Product select  --homepage
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

}
