package automationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorProgram1FB 
{
     
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Chrome Driver open");
		
		driver.manage().window().maximize();
		
		System.out.println("maximize the tab");
		
		driver.get("https://www.facebook.com/");

		System.out.println("open facebook open");
				
		//USername
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("9823448794");
		
		System.out.println("Enter username");
		
		//Password
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("vishwa@9229");
		
		System.out.println("Enter Password");
		
		//Login
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		System.out.println("LogButton click");
		
		
		
	}
}
