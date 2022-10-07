package handled;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//iframe element
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		//first switch to frame
		driver.switchTo().frame(iframe);
		
		//now u are switch to frame
	
		//now u perform action of dropdown
	
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
		dropDown.click();
		
		//dropdown handle
		Select s = new Select(dropDown);
//		s.selectByIndex(2);
		s.selectByVisibleText("Avatar");
	

		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		
		WebElement homeButton = driver.findElement(By.xpath("(//a[@id='head'])[1]"));
		homeButton.click();
		
		
		
		
		
	}

}
