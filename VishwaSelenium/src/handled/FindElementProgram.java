package handled;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		
		//find -Element--> multiple  elements --> 6 elements
		
		List<WebElement> addToCartButton = driver.findElements(By.xpath("//button[text()='Add to cart']"));
//		addToCartButton.get(0).click();
//		System.out.println(addToCartButton);
		
		
		for(int i=0;i<addToCartButton.size(); i++)
		{
			addToCartButton.get(i).click();
			Thread.sleep(2000);
		}
		
		System.out.println(addToCartButton);
		
		
		
		
	}

}
