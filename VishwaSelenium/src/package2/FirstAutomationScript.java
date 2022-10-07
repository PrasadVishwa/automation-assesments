package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationScript 
{
	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver",
//  			 "C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
//
//	   		WebDriver driver=  new ChromeDriver();
//
//	   		driver.get("https://www.google.com");       //URL Open
////	   		driver.close();                             //Browser close
//	   		
//	   		//1. for multiple chrome instances
//	   		WebDriver driver1=  new ChromeDriver();
//	   		WebDriver driver2=  new ChromeDriver();
//	   		WebDriver driver3=  new ChromeDriver();
//	   		WebDriver driver4=  new ChromeDriver();
//	   		
//	   		driver1.get("https://www.google.com"); 
//	   		driver2.get("https://www.google.com"); 
//	   		driver3.get("https://www.google.com"); 
//	   		driver4.get("https://www.google.com"); 
	   		 
		//2.Differnt Syntax
		
		System.setProperty("webdriver.chrome.driver",
	  			 "C:\\Prasad\\chromedriver_win32\\chromedriver.exe");

	   	//1.
		WebDriver driver = new ChromeDriver();           //upcasting
		driver.get("https://www.google.com");           //URL open
//		driver.close();                                 //Browser close
		
		//2.
		//WebDriver driver = new webDriver();       // not possible because interface does
		                                          //not class and if does not create constructor
	   		
	   	//3.
//		ChromeDriver driver = new ChromeDriver();  //possible 
//		driver.get("https://www.google.com");          
//		
//		//3.Mozilla Firefox Code
//
//		System.setProperty("webdriver.chrome.driver",
//	  			 "C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
//		System.setProperty("Webdriver.edge.driver","C:\\Prasad\\msedgedriver.exe" );
//		
//		WebDriver driver = new EdgeDriver();
//		
//		driver.get("https://www.google.com");       //URL Open
//		driver.close();
		
//        System.setProperty("Webdriver.gecko.driver",
//        		"C:\\Prasad\\geckodriver.exe");
//		
//		WebDriver driver = new FirefoxDriver();
//		
//		driver.get("https://www.google.com");
//		
		
	

	   		
	   		
	   		
	}

}
