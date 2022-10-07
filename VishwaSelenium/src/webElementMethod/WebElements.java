package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
	System.out.println("1.Propertites are set for chrome browser");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is open");
	
	driver.manage().window().maximize();
	System.out.println("maximize the window");
	
	driver.get("https://vctcpune.com/selenium/practice.html");
    System.out.println("open the website- vctc");
	
    //1}--isDisplayed() method
    
    WebElement hidebutton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
    hidebutton.click();
    
    WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
    boolean result = textbox.isDisplayed();
    System.out.println(result);           //false
    
    WebElement showbutton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
    showbutton.click();
    
    boolean finalresult = textbox.isDisplayed();
    System.out.println(finalresult);              //true
    
    
        //2}--isEnabled() Method
    
//    WebElement textbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
//    boolean result = textbox.isEnabled();          
//    System.out.println(result);             //true
//    textbox.sendKeys("India");
    
    //3}--isSelected() Method
    
//    WebElement radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
//    boolean result = radiobutton.isSelected();
//    System.out.println(result);                 //false
//    
//    if(result == true)
//    {
//    	System.out.println("Button is Selected");
//    }
//    else
//    {
//    	System.out.println("Button is not Selected");
//    	System.out.println("Hence select the Button");
//    }
//    radiobutton.click();
//    
//    boolean result1 = radiobutton.isSelected();
//    System.out.println("after clicking on ratio button"+ result1);
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
