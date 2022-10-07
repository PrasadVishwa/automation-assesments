package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.LoginPage;

public class TC04AddToCartFunctionalityMultipleProduct 
{
	public static void main(String[] args) throws InterruptedException 
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
		
		//TC04
		hp.clickaddToCartButton();
		System.out.println("Click on AddToCart Button");
		
		//scenarios
		String expectedButtonText = "Remove";
		String actualButtonText = hp.getaddToCartButton();
		
		if(expectedButtonText.equals(actualButtonText))
		{
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("test case failed");
		}

		
		
		
		
		
		
	}

}
