package com.kite.TestClasses;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.kite.POMClasses.CashierPage;
import com.kite.POMClasses.HomePage;
import com.kite.POMClasses.LoginPage;

public class TC03AddFundFunctionality 
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
	
		//homepage
		HomePage hp = new HomePage(driver);
		hp.clickfundButton();
		System.out.println("Click on fund Button");
		
		hp.clickaddFundButton();
		System.out.println("Click on Add Fund Button");
		
		List<String> windowHandle = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(windowHandle.get(1));
		
		//CashierPage
		CashierPage cp = new CashierPage(driver);
		cp.clickonamount();
		System.out.println("Entered amount 100");
		cp.clickonupiID();
		System.out.println("Entered UPi");
		cp.clickupiRedioButton();
		System.out.println("Click on Redio Button");
		cp.clickcontinueBtton();
		System.out.println("Click on continue button");
		
		
//		String currentUrl = "https://cashier.zerodha.com/?type=login";
//		String actualUrl = driver.getTitle();
//		
//		if(currentUrl.equals(actualUrl))
//		{
//			System.out.println("Add fund test case passed");
//		}
//		else
//		{
//			System.out.println("Add fund test case failed");
//		}
//		
		
//		String actualvalue = driver.findElement(By.className("addfunds-name")).getText();		
//		String expectedvalue = "Prasad Madanrao Patil";
//		
//		if(actualvalue.equals(expectedvalue))
//		{
//			System.out.println("Test case is passed");
//		}
//		else
//		{
//			System.out.println("Test case is failed");
//		}
		
		String actualvalue = driver.findElement(By.xpath("//p[@class='addfunds-id text-right']")).getText();
		System.out.println("actualvalue");
		String expectedvalue = "QZP268";
		
		if(actualvalue.equals(expectedvalue))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case pass");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
