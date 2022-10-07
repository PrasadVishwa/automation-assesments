package automationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathProgram2 
{
	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver", 
	    		"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
	    System.out.println("1.Propertites are set for chrome browser");
	    
	    
	    WebDriver driver = new ChromeDriver();
	    System.out.println("Browser is open");
	    Thread.sleep(2000);
	    
	    driver.manage().window().maximize();
	    System.out.println("maximize the Browser");
	    Thread.sleep(2000);
	    
	    driver.get("https://www.saucedemo.com/");
		System.out.println("open the website- Saucedemo");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("(//input[contains(@class,'input_error form_input')])[1]"));
		username.sendKeys("problem_user");
		Thread.sleep(2000);
		System.out.println("username fill up ");
		
		
		WebElement password = driver.findElement(By.xpath("(//input[contains(@class,'input_error form_input')])[2]"));
		password.sendKeys("secret_sauce");
		System.out.println("Password Enter ");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		System.out.println("Click on login button");
		Thread.sleep(2000);
		
		WebElement addtocart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		addtocart.click();
		Thread.sleep(2000);
		System.out.println("bag add in cart");
		
		WebElement cartButton = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
		cartButton.click();
		System.out.println("open cart button");
		Thread.sleep(2000);
		
		WebElement checkout = driver.findElement(By.xpath("//button[contains(text(),'Checkout')]"));
		checkout.click();
		System.out.println("open check out tab");
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("(//input[contains(@class,'input_error form_input')])[1]"));
		firstname.sendKeys("Prasad");
//		Thread.sleep(2000);
		System.out.println("Fill up the Firstname block");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[contains(@class,'input_error form_input')])[2]"));
		lastname.sendKeys("Patil");
//		Thread.sleep(2000);
		System.out.println("fill up the lastname block");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
