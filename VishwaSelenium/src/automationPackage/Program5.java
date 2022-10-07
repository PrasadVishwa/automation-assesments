package automationPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		System.out.println("1.Propertites are set for chrome browser");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("2. Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("3. Maximize the Browser");
		
		driver.get("https://www.facebook.com");
		System.out.println("4. Open the URL- facebook");
		
		
		String expectedURL = "https://www.facebook.com/";
		
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		
		
		System.out.println("5. validate the URL test case");
		if(expectedURL.equals(actualURL))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		} 
		
		driver.close();
		System.out.println("6.Browser is closed");
		
		
		
		
		
		
		
	}

}
