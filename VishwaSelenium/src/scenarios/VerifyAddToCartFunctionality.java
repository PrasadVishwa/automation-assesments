package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAddToCartFunctionality 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		System.out.println("1.Properties aer set for chrome browser");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("2. Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("3.Maximize the Browser");

		driver.get("https://www.saucedemo.com/");
		System.out.println("4.Open the URL- SAUCEDEMO");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("5.Apply wait");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		System.out.println("6.Enter the userName");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("secret_sauce");
		System.out.println("7.Enter the passWord");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		System.out.println("8.Click on login Button");

		WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		addToCartButton.click();
		System.out.println("9.Click on add to cart button");
		
		WebElement cartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartButton.click();
		System.out.println("10.Click on cart button");
		
		Thread.sleep(3000);
		System.out.println("11.Wait of 3-seconds");
		
		driver.navigate().back();
		System.out.println("12.navigate back ");
		
		WebElement cornerButton = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		cornerButton.click();
		System.out.println("13.Click on corner button");
		
		WebElement logOutButton = driver.findElement(By.xpath("//a[text()='Logout']"));
		logOutButton.click();
		System.out.println("14.Click on logout button");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
}
}
