package automationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsProgram 
{
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Chrome driver open");
		
		driver.manage().window().maximize();
		
		System.out.println("Maximize the driver");
		
		driver.get("https://www.saucedemo.com/");
		
		System.out.println("open website");
		
		
		//Username
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("performance_glitch_user");                        //Action perform
		
		System.out.println("Enter username");
		
		//Password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		System.out.println("password Enter");
		
		
		//Login Button
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		System.out.println("click on log in button");
		
		String expectedHomepageUrl = "https://www.saucedemo.com/inventory.html";
		
		System.out.println("expectedHomepageUrl");
		
		String actualHomePageUrl = driver.getCurrentUrl();
		
		System.out.println("actualHomePageUrl");
		
		if(expectedHomepageUrl.equals(actualHomePageUrl))
		{
			System.out.println("login test password -we have succesfully login on sause demo website");
		}
		else
		{
			System.out.println("LOgin test failed");
		}
	
		
		
	}

}
