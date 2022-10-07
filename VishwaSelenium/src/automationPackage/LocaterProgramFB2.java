package automationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterProgramFB2 
{
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		System.out.println("1.Properties aer set for chrome browser");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("2. Browser is opened");
		
		driver.manage().window().maximize();
		
		System.out.println("3.Maximize the Browser");
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		System.out.println("4.Open the URL- OPENOURCE");
		
		//USERNAME
		WebElement username = driver.findElement(By.id("txtUsername"));
	       username.sendKeys("Admin");          
	       
	       //PAssword
	       WebElement password = driver.findElement(By.id("txtPassword"));
	       password.sendKeys("admin123");
		
	       //Login button
	       WebElement loginButton = driver.findElement(By.id("btnLogin"));
	       loginButton.click();
		
		String expectedHomepageURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		String actualHomePageURL = driver.getCurrentUrl();
		
		if(expectedHomepageURL.equals(actualHomePageURL))
		{
			System.out.println("Login test case pass -we have succesfully login on orange demo website");
			
		}
		else
		{
			System.out.println("Login test failed");
		}
		
		
		 
	}

}
