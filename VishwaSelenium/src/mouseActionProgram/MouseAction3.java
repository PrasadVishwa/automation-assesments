package mouseActionProgram;
//moveToElementProgram

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseAction3 {
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement username = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
		username.sendKeys("standard_user");

		WebElement password = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		
		//Actions Class
		//Jacket Element
		Thread.sleep(5000);
		
		WebElement jacketElement = driver.findElement(By.xpath("//a[@id='item_5_img_link']"));
		
		Actions act = new Actions(driver);
//		act.moveToElement(jacketElement).click().perform();
		
		//With the help of Build method
//		Action ac = act.click(jacketElement).build();
//		ac.perform();
		
		//OR
		
		act.click(jacketElement).build().perform();
		
	}

}
