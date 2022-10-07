package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.sauceDemo.POMclasses.LoginPage;

public class TestBaseClass {
   public static WebDriver driver; // declare globally
    Logger log;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUpMethod(String browserName) 
	{
		
		log = Logger.getLogger("sauceDemo5");
		PropertyConfigurator.configure("log4j.properties");
		
		
		if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\prasa\\eclipse-workspace\\sauceDemo5\\drivers\\geckodriver.exe");

			driver = new FirefoxDriver(); // intialize
			log.info("firefox Browser is opened");
		}
		else if (browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\prasa\\eclipse-workspace\\sauceDemo5\\drivers\\chromedriver.exe");

			driver = new ChromeDriver(); // intialize
			log.info("Chrome Browser is opened");
		} 
		else 
		{
			System.out.println("Show the error");
		}

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		log.info("URL is opened");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Login to page
		LoginPage lp = new LoginPage(driver);
		lp.senduserName();
		log.info("Username is Entered");

		lp.SendpassWord();
		log.info("Password is Entered");

		lp.clickLoginButton();
		log.info("Click on Login Button");

	}

	@AfterMethod
	public void tearDownmethod() 
	{
		driver.quit();
		log.info("Program end");
	}

}
