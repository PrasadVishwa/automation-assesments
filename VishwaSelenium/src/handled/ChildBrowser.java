package handled;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Prasad\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// how to find address of any page
		// getWindowHandled

		String mainPageAddress = driver.getWindowHandle();

		System.out.println("mainPageAddress-"+mainPageAddress);

		//Button click
		
		WebElement seleniumButton = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		seleniumButton.click();
		
		//dont use Set
//		Set<String> allPageAddress = driver.getWindowHandles();
//		System.out.println("allPageAddress-"+allPageAddress);
		
		Set<String> allPageAddress = driver.getWindowHandles();
		
		//double --> int
		//Set --> List --> Upcasting
		
		//Use List
		List<String> allPageAdd = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(allPageAdd);
		
		//Move to Child page
		driver.switchTo().window(allPageAdd.get(1));
		
		//New tab will open
		
		WebElement countryTextBox =driver.findElement(By.xpath("//input[@id='autocomplete']"));
		countryTextBox.sendKeys("India");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
