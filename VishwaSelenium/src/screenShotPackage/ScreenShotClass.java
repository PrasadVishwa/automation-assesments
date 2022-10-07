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

public class ScreenShotClass 
{
////	static WebDriver driver;
//	public static void ScreenShot() throws IOException
//	{
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\ScreenShot\\"+".jpg");
//		FileHandler.copy(source, dest);
//	}
//	
//	
//	static int a = 0;
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		//ScreenShot
//		int a = 50;                //int
//		double b =(double)a;      //double
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File sourceFile = t.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\ScreenShot\\"+"LoginPage.jpg");
		
		FileHandler.copy(sourceFile, destFile);
		
	
//		TakesScreenshot t =(TakesScreenshot)driver;
//		File sourceFile = t.getScreenshotAs(OutputType.FILE);
//		File destFile = new File("C:\\ScreenShot\\"+ a++ +".jpg");
//		FileHandler.copy(source, dest);
		
		System.out.println("test");
		
		System.out.println("Login page ScreenShot Taken");
		
		//Homepage code
		//Username
		WebElement username = driver.findElement(By.id("user-name"));
	    username.sendKeys("standard_user");                //Action Perform
//	    ScreenShotClass.ScreenShot();
	     
	    //Password
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("secret_sauce");
	    
	    //Login Button
	    WebElement LoginButton = driver.findElement(By.id("login-button"));
	    LoginButton.click();
	    
		//HomePage ScreenShot
	    File sourceFile1 = t.getScreenshotAs(OutputType.FILE);
	    File destFile1 = new File("C:\\ScreenShot\\"+"Homepage.jpg");
		FileHandler.copy(sourceFile1, destFile1);
		System.out.println("Home page ScreenShot Taken");
		
		
		
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
