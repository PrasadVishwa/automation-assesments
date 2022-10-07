package automationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFilpcart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		System.out.println("1.Propertites are set for chrome browser");
		Thread.sleep(2000);
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("maximize the Browser");
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		System.out.println("open the website- Filpcart");
		
		
		WebElement Login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		Thread.sleep(2000);
		Login.click();
		System.out.println("Click on login button and open new page");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJ')]"));
		username.sendKeys("9823448794");
		Thread.sleep(2000);
		System.out.println("Eneter a username");
		
		
		
		
	}

}
