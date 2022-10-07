package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
  public static void main(String[] args) 
  {
	  
	  System.setProperty("webdriver.chrome.driver", 
			  "C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
	  System.out.println("1.Propertites are set for chrome browser");
	  
	  WebDriver driver = new ChromeDriver();
	  System.out.println("Browser is open");
	  
	  driver.manage().window().maximize();
	  System.out.println("Maximize the window");
	  
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  System.out.println("open the website- vctc");
	  
	  //DropDown / ListBox
	  //a
	  
	  WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	  dropdown.click();
	  
	  //b
	  Select s = new Select(dropdown);
	  
	  //c Option select
	  
//	  s.selectByIndex(1);             //Option1
	  
	  //or
	  
//	  s.selectByValue("option2");        //option2
	  
	  //OR
	  
	  s.selectByVisibleText("Option3");          //Option3
	  
	  String text = dropdown.getText();
	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
}
	
}
