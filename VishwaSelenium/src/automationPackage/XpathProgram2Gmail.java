package automationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathProgram2Gmail 
{

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", 
    		  "C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
      System.out.println("1.Propertites are set for chrome browser");
      
      WebDriver driver = new ChromeDriver();
      Thread.sleep(3000);
      System.out.println("2.Browser is open");
      
      driver.manage().window().maximize();
      Thread.sleep(3000);                       //used to pause the script
      System.out.println("3.Browser is maximize");
      
      driver.get("http://www.gmail.com");
      System.out.println("4.open gmail login page");
      
     WebElement username = driver.findElement(By.xpath("(//input[@type='email'])"));
     username.sendKeys("prasadpatilme501@gmail.com");
     Thread.sleep(3000);
     System.out.println("5.username fill up");
     
     WebElement nextbutton = driver.findElement(By.xpath("(//div[contains(@class,'VfPpkd')])[1]"));
     nextbutton.click();
     System.out.println("6.click on next button");
      
//     driver.navigate().refresh();
//     System.out.println("refresh that particular page");
     
//     driver.navigate().back();
//     System.out.println("page is backword");
      
      
      
      
      
      
      
      
      
      
      
	}
}
