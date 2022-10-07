package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prasasd 
{
     public static void main(String[] args) 
     {
		System.setProperty("webDriver.gecko.driver",
				"C:\\Prasad\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		
	
		
		
	}
}
