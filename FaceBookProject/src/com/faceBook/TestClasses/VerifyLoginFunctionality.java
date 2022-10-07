package com.faceBook.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.faceBook.POMClasses.LoginPage;

public class VerifyLoginFunctionality 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Login to page
		
		LoginPage lp = new LoginPage(driver);
		lp.sendUserName();
		System.out.println("Username is Entered");
		lp.sendpassWord();
		System.out.println("Password is Entered");
		lp.clickloginButton();
		System.out.println("Click on LoginButton");
		
		//scenarios
		
		String expectedHomePageUrl = "https://www.facebook.com/";
				
		String actualHomePageUrl = driver.getCurrentUrl();
		
		if(expectedHomePageUrl.equals(actualHomePageUrl))
		{
			System.out.println("Login test is pass- we have syccessfully login on facebook website");
		}
		else
		{
			System.out.println("login test failed");
		}
		
		//scenario-2
		System.out.println("SCENARIO-2");
		String expectedHomePageUrl1 = "https://www.facebook.com/";
		
		String actualHomePageUrl1 = driver.getTitle();
		
		if(expectedHomePageUrl.equals(actualHomePageUrl))
		{
			System.out.println("Login test is pass- we have syccessfully login on facebook website");
		}
		else
		{
			System.out.println("login test failed");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
