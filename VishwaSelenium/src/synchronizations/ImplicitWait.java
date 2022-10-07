package synchronizations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Prasad\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		//before url--->  run same program 
//		//Implicit Wait 
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://kite.zerodha.com/");
	
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//username
		WebElement username = driver.findElement(By.xpath("//input[@id='userid']"));
		username.sendKeys("QZP268");
		
		//password
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("vishwa@9229");
		
		//Login
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		loginButton.click();
		
		//M-Pin
		WebElement mpin = driver.findElement(By.xpath("//input[@id='pin']"));
		mpin.sendKeys("021998");
		
		//Continue-Button
		WebElement continueB = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		continueB.click();
		
		
		
		
	}
}
