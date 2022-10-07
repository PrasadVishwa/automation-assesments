package handled;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ClickmeButton = driver.findElement(By.xpath("(//button[text()='Click me'])[1]"));
		ClickmeButton.click();
		System.out.println("Click");
		//Alert will come
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
//		alt.accept();
		alt.dismiss();
		
		Thread.sleep(4000);
		
		WebElement clickmeButton3 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickmeButton3.click();
		
		alt.sendKeys("Rahul");
		alt.getText();
		System.out.println(alt.getText());
		alt.accept();
		
		
		
		
		//Authentication  pop up
		
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		
//		//concatenatiion
//		
//		String start = "https://";
//		String url ="he-internet.herokuapp.com/basic_auth";
//		
//		String username = "admin";
//		String password = "admin";
//		
//		String finalURl = start + username  + ":" + password +"@"+url;
//		
//		System.out.println(finalURl);
//		driver.get(finalURl);
		
		
		
		
		
		
	}

}
