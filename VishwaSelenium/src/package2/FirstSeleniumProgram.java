package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver",
//   			 "C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
//
//	   		WebDriver driver=  new ChromeDriver();
//
//	   		driver.get("https://www.facebook.com");
//	   		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.findElement(By.name("field-keywords")).sendKeys("tablelamp");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).click();
		
	   		
	   		
	}

}
