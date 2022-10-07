package com.kite.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.kite.POMClasses.LoginPage;

public class TC01LoginFunctionality 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser is opened");
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		System.out.println("URl is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//login to page
		LoginPage lp = new LoginPage(driver);
		lp.sendUserName();
		System.out.println("UserName is Entered");
		
		lp.sendPassWord();
		System.out.println("Password is Entered");
		
		lp.clickloginButton();
		System.out.println("Click on Login Button");
		
		lp.sendPin();
		System.out.println("Pin is Entered");
	
		lp.clickcontinueButton();
		System.out.println("Click on Continue Button");
	
		//scenario
		
		String expectedurl = "https://kite.zerodha.com/dashboard";
		String actualurl = driver.getCurrentUrl();
		
		if(expectedurl.equals(actualurl))
		{
			System.out.println("login test is passed");
		}
		else
		{
			System.out.println("login test is failed");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
