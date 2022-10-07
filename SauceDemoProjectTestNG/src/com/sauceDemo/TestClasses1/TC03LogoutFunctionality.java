package com.sauceDemo.TestClasses1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.PMOClasses.HomePage;
import com.sauceDemo.PMOClasses.LoginPage;

public class TC03LogoutFunctionality 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUpMethod()
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		System.out.println("Chrome Browser is Opened");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//login
		LoginPage lp = new LoginPage(driver);
		lp.senduserName();
		System.out.println("Username is Entered");

		lp.SendpassWord();
		System.out.println("Password is Entered");
		
		lp.clickLoginButton();
		System.out.println("Click on Login Button");
		
	}
	
	@Test
	public void verifyLogoutFunctionality()
	{
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
		
		
	@AfterMethod
	
	public void tearDownMethod()
	{
		driver.quit();
		System.out.println("Program end");
		
	}
		
		

}
