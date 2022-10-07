package screenShotPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass2 
{
	static WebDriver driver;
	
	public static void screenshotMethod() throws IOException
	{
		TakesScreenshot t = (TakesScreenshot) driver;
		File sourceFile = t.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\ScreenShot\\"+"LoginPage.jpg");
		FileHandler.copy(sourceFile, destFile);
		
	}
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		//ScreenShot
		int a = 50;             //int
		double b = (double)a;   //double
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		screenshotMethod();        //Method
		System.out.println("Login Page ScreenShot Taken");
		
		//Homepage code
		//Username
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("9823448794");
		
		//Password 
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("vishwa@9229");
		
		//Login Button
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();
		
		//Homepage Screenshot
		screenshotMethod();               //method
		System.out.println("Home page Screenshot taken");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
