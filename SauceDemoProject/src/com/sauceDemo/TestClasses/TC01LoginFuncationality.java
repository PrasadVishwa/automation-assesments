package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.LoginPage;

public class TC01LoginFuncationality 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("1.Chrome Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("2.Maximize the Browser");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("3.Open the Url saucedemo");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("4.Apply wait");
		
		//login to page
		
		LoginPage lp = new LoginPage(driver);
		
		lp.sendUserName();
		System.out.println("5.Enter the Username");
		lp.sendPassword();
		System.out.println("6.Enter the Password");
		lp.clickLoginButton();
		System.out.println("7.Click on Login Button");
	
		
		String expectedHomePageUrl = "https://www.saucedemo.com/inventory.html";
		
		String actualHomePageUrl = driver.getCurrentUrl();
		
		System.out.println("8.Checking the login test case");
		
		
		if(expectedHomePageUrl.equals(actualHomePageUrl))
		{
			System.out.println("9.Login test passed-we have successfully login on sauce demo website");
		}
		else
		{
			System.out.println("9.Login test Failed");
		}
		
		
		
	}
}
