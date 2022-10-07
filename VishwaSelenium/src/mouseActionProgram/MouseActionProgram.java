package mouseActionProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionProgram {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Prasad\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://kite.zerodha.com/");

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// username
		WebElement username = driver.findElement(By.xpath("//input[@id='userid']"));
		username.sendKeys("QZP268");

		// password
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("vishwa@9229");

		
		
		//WebElement interface-->Click method
		
		// Login
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
//		loginButton.click();
//      Login button -mouse action --> click --> Actions class
		
		Actions act = new Actions(driver);
		act.click(loginButton).perform();
		System.out.println("Click on Login-Button");
		
	
		// M-Pin
		WebElement mpin = driver.findElement(By.xpath("//input[@id='pin']"));
		mpin.sendKeys("021998");

		// Continue-Button
		WebElement continueB = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		continueB.click();

	}

}
