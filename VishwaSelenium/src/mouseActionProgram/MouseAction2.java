package mouseActionProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction2 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Prasad\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/buttons");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act = new Actions(driver);
		
		//1.
		//It's a dynamic element so find out its relative or absolute xpath and then perform action
		// on it
		
		WebElement singleClickButton = driver.findElement(By.xpath("(//html//body//div//div//div//div//div//button)[4]"));
		act.click(singleClickButton).perform();
		System.out.println("Single click action performed");
		
		Thread.sleep(5000);
		
		//2.
		WebElement rightClickButton = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
		act.contextClick(rightClickButton).perform();
		System.out.println("right click performed");
		
		Thread.sleep(5000);
		
		//3.
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(doubleclickbutton).perform();
		System.out.println("Double click perform");
		

		
	}

}
