package automationPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 
{
  public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
	
//	WebDriver driver = new ChromeDriver();
//	driver.get("http://www.google.com");
//	driver.manage().window().maximize();
	
	//maaximize--method chaining
//	driver.manage().window().maximize(); 
	
	
//	driver.get(null);
//	driver.close();
//	driver.quit();
	
	//maximize
//	driver.maximize() //NO such method available near to webdriver
	  
	//ex.
//	int x = driver.manage();
	//method is of ---> WebDriver
	//return -->Option interface
	
	  
//	 Options o = driver.manage();              //Seperatly use of mange, window, maximize
//	 Window w = o.window();
//	 w.maximize();
	  
	  
//	  WebDriver driver = new ChromeDriver();           //chrome
//	  driver.manage().window().maximize();              //maximize
//	  
//	  driver.get("http://www.facebook.com");          //open facebook
//	  
//	  //10.
//	  String url = driver.getCurrentUrl();         //https://www.facebook.com/
//			  System.out.println(url);
//	  
//	  //11.
//			  String webTitle = driver.getTitle();    //Facebook – log in or sign up
//			  System.out.println(webTitle);
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
}
