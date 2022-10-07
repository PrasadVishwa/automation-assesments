package automationPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutoProgram1 
{
       public static void main(String[] args) throws InterruptedException 
       {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver();
//		//1.
//		
//		driver.get("http://www.google.com");                     //open google
//		Thread.sleep(2000);
//		
//		//2.
//		driver.navigate().to("http://www.facebook.com");              //open facebook
//		Thread.sleep(2000);
//		
//		//3.
//		driver.navigate().back();                  //Google
//		Thread.sleep(2000);
//		
//		//4.
//		driver.navigate().forward();              //facebook
//		Thread.sleep(2000);
//		
//		//5.
//		driver.navigate().refresh();             //facebook-page refresh
		
		
		WebDriver driver = new ChromeDriver();                //chrome open
		driver.get("http://www.google.com");                //google open
		Thread.sleep(2000);
		
		//6.  Browser - maximize
		
		driver.manage().window().maximize();                  // maximize tab of google
		Thread.sleep(5000);                                     //time 
		
		//7. Close the current tab
		
		driver.close();
		
		
		//8. Close the browser
		
		driver.quit();
		
		System.out.println("end of program");                  //Console-->end of program
		
		
		
		
		
		
		
		
		
		
	}
}
