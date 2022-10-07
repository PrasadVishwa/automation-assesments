package mouseActionProgram;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpOption 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//javaScript casting
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,2000)");      //Scroll Down
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-2000)");
		
		System.out.println("End of PRogram");
		
		
		
		
	}

}
