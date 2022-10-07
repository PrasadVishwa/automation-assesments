package com.sauceDemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.LoginPage;

public class TC03LogoutFuncationality 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("1.Chrome Browser is opened");
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//login to page
		
		LoginPage lp = new LoginPage(driver);
		lp.sendUserName();
		lp.sendPassword();
		lp.clickLoginButton();
		
		//home page
		HomePage hm = new HomePage(driver);
		hm.clickSelectProduct();
		System.out.println("2.clickSelectProduct");
		hm.clickbackToProduct();
		System.out.println("3.clickbackToProduct");
		hm.clickFilterButton();
		System.out.println("4.clickFilterButton");
		hm.clickCornerButton();
		System.out.println("5.clickCornerButton");
		
		Thread.sleep(2000);
		hm.clickAboutButton();
		System.out.println("6.clickAboutButton");
		
		driver.navigate().back();
		hm.clickCornerButton();
		
		Thread.sleep(2000);
		hm.clickLogoutbutton();
		System.out.println("7.clickLogoutbutton");
		
		String expectedHomePageUrl = "https://www.saucedemo.com/";
		
		String actualHomePageUrl = driver.getCurrentUrl();
		System.out.println("8.Checking the Login Tast Case");
		
		if(expectedHomePageUrl.equals(actualHomePageUrl))
		{
			System.out.println("9.Login Test passed - we Have Successfully Login on sauce demo website");
		}
		else
		{
			System.out.println("9.Login Test failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
