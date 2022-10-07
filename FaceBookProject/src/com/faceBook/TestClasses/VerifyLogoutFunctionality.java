package com.faceBook.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.faceBook.POMClasses.HomePage;
import com.faceBook.POMClasses.LoginPage;

public class VerifyLogoutFunctionality 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser is opened");
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("URl is Opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Login to page
		
				LoginPage lp = new LoginPage(driver);
				lp.sendUserName();
				System.out.println("Username is Entered");
				lp.sendpassWord();
				System.out.println("Password is Entered");
				lp.clickloginButton();
				System.out.println("Click on LoginButton");
				
		//homePage
				
				HomePage hp = new HomePage(driver);
				hp.clickaccountButton();
				System.out.println("click on Account Button");
				hp.clicklogoutButton();
				System.out.println("Click on logout button");
				
				String expectedHomePageTitle = "Facebook";
				String actualHomePageTitle = driver.getTitle();
				
				if(expectedHomePageTitle.equals(actualHomePageTitle))
				{
					System.out.println("LogOut test case is passed");
				}
				else
				{
					System.out.println("LogOut test case is failed");
				}
			
		
		
		
		
		
		
	}

}
