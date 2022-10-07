package com.sauceDemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.CartPage;
import com.sauceDemo.POMClasses.HomePage;
import com.sauceDemo.POMClasses.LoginPage;

public class TC02AddToCartFuncationality 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("1.Chrome Browser is Opened");
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//login to page
		LoginPage lp = new LoginPage(driver);
		lp.sendUserName();
		System.out.println("2.sendUserName");
		lp.sendPassword();
		System.out.println("3.sendPassword");
		lp.clickLoginButton();
		System.out.println("4.clickLoginButton");
		
		//CartPage 
		CartPage cp = new CartPage(driver);
		cp.addTocartButton();
		System.out.println("5.addTocartButton");
		
		cp.cartButton();
		System.out.println("6.cartButton");
		cp.removeButton();
		System.out.println("7.removeButton");
		cp.checkoutButton();
		System.out.println("8.checkoutButton");
		cp.cancelButton();
		System.out.println("9.cancelButton");
		cp.continueShopping();
		System.out.println("10.continueShopping");
		
		String expectedHomePageUrl ="https://www.saucedemo.com/inventory.html";
		
		String actualHomePageUrl = driver.getCurrentUrl();
		
		System.out.println("11.Checking the login test case");
		
		if(expectedHomePageUrl.equals(actualHomePageUrl))
		{
			System.out.println("12.Login Test passed- we have successfully login on sauce demo website");
		}
		else
		{
			System.out.println("12.Login Test failed");
		}
		
		
		//HomePage
		HomePage hp = new HomePage(driver);
		hp.clickCornerButton();
		System.out.println("13.clickCornerButton");
		
		Thread.sleep(2000);
		hp.clickLogoutbutton();
		System.out.println("14.clickLogoutbutton");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
