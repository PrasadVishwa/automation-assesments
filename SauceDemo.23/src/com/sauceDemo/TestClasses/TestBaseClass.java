package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sauceDemo.POMclasses.LoginPage;

public class TestBaseClass {
	WebDriver driver; // declare globally

	@Parameters("browserName")
	@BeforeMethod
	public void setUpMethod(String browserName) 
	{
		if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Prasad\\geckodriver-v0.30.0-win64\\geckodriver.exe");

			driver = new FirefoxDriver(); // intialize
			System.out.println("Chrome Browser is Opened");
		}
		else if (browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver(); // intialize
			System.out.println("Chrome Browser is Opened");
		} 
		else 
		{
			System.out.println("Show the error");
		}

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		System.out.println("URL opened");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Login to page
		LoginPage lp = new LoginPage(driver);
		lp.senduserName();
		System.out.println("Username is Entered");

		lp.SendpassWord();
		System.out.println("Password is Entered");

		lp.clickLoginButton();
		System.out.println("Click on Login Button");

	}

	@AfterMethod
	public void tearDownmethod() 
	{
		driver.quit();
		System.out.println("Program end");
	}

}
