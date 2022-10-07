package handled;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableProgram 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Table coloum
		
		List<WebElement> coloum = driver.findElements(By.xpath("//table//tbody//tr//th"));
	System.out.println("number of coloum-"+coloum.size());
		
	for(int i=0; i<coloum.size(); i++)
	{
		System.out.println(coloum.get(i).getText());
		
	}
	
	List<WebElement> cellData = driver.findElements(By.xpath("//table//tbody//tr//td"));
	System.out.println("total data cells-"+cellData.size());
	
	for(int i=0; i<cellData.size(); i++)
	{
		System.out.println(cellData.get(i).getText());
	}
	

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
