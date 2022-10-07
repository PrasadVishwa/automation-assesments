package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.LoginPage;

public class TC03LogoutFunctionality 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser is Opened");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URl is Open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Login to page
		LoginPage lp = new LoginPage(driver);
		lp.senduserName();
		System.out.println("Username is Entered");

		lp.Sendpassword();
		System.out.println("Password is Entered");
		
		lp.clickLoginButton();
		System.out.println("Click on Login Button");
		
		//homepage object
		HomePage hp = new HomePage(driver);
		hp.clickmenuButton();
		System.out.println("Click on menu Button");
		
		hp.clicklogoutButton();
		System.out.println("Click on Logout Button");
		
		String expectedTitle = "Sawg Labs";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Logout test is Passed");
		}
		else
		{
			System.out.println("Logout test is failed");
		}
		
	
	}

	
		
}
