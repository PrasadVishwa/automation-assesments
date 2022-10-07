package synchronizations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver", 
				"C:\\Prasad\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://kite.zerodha.com/");

		// username
		WebElement username = driver.findElement(By.xpath("//input[@id='userid']"));
		username.sendKeys("QZP268");

		// password
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	
		//Explicit-WAit
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(password));
		
		password.sendKeys("vishwa@9229");
		
		
		
		// Login
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	
		//Explicit-Wait
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		
		loginButton.click();

		
		Thread.sleep(5000);
		// M-Pin
		WebElement mpin = driver.findElement(By.xpath("//input[@id='pin']"));
		mpin.sendKeys("021998");

		// Continue-Button
		WebElement continueB = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		continueB.click();
		System.out.println("End of program");
		

	}
}
