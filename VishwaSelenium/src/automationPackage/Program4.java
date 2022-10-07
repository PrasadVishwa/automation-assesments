package automationPackage;

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
	  driver.get("http://www.facebook.com");
	  
	  //Current URL
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	  
	  String title = driver.getTitle();
	  System.out.println(title);
	  
	  //Browser minimize
	  driver.manage().window().maximize();
	  
	  //Browser size set
	  Dimension d = new Dimension(300, 500);
	                          //W     H
	  
	  driver.manage().window().setSize(d);
	  
	  //Browser position set
	  
	  Point p = new Point(200,400);
	                    //X  Y
	  driver.manage().window().setPosition(p);
	  
	  
	  
	  
	  
	
}
}
