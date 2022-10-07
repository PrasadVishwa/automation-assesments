package automationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.chrome.driver", 
			  "C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  System.out.println("Chrome Driver open");
	  
	  driver.manage().window().maximize();
	  
	  System.out.println("maximize the tab");
	  
	  driver.get("https://kite.zerodha.com/");
	  
	  System.out.println("open kite login tab");
	  
	  //Username
	  
	  WebElement username = driver.findElement(By.xpath("//input[@id='userid']"));
	  username.sendKeys("QZP268");
	  
	  //Password
	  WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	  password.sendKeys("vishwa@9229");
	  
	  //login-Button
	  WebElement loginbutton = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	  loginbutton.click();
	  Thread.sleep(2000);
	  
	  //M-Pin
	  WebElement mpin = driver.findElement(By.xpath("//input[@id='pin']"));
	  mpin.sendKeys("021998");
	  
	  WebElement continuee = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	  continuee.click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
	}

}
