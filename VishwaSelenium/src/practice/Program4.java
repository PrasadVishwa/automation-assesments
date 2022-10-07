package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
//		//Browser size set 
//		Dimension d = new Dimension(300,600);
//		
//		driver.manage().window().setSize(d);
//				
		
		//Browser position set
		Point p = new Point(100,800);
		
		driver.manage().window().setPosition(p);
		
		
		
		
	}

}
