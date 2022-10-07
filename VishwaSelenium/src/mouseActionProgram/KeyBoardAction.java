package mouseActionProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act = new Actions(driver);
		act.sendKeys("p").perform();
		
//		act.sendKeys(Keys.BACK_SPACE).perform();
//		act.sendKeys(Keys.ENTER).perform();
		
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		String actualresult = result.getText();
		String expectedresult = "You entered: P";
		if(actualresult.equals(expectedresult))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
		
		
	}

}
