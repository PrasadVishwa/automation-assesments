package automationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathProgram1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		System.out.println("1.Propertites are set for chrome browser");

		WebDriver driver = new ChromeDriver();
		System.out.println("2. Browser is opened");

		driver.manage().window().maximize();
		System.out.println("3. Maximize the Browser");

		driver.get("https://www.instagram.com/?hl=en");
		System.out.println("4.open home page of instagram");
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]"));
		username.sendKeys("pra_sad_9229");
		System.out.println("5.enter username");
		
		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		password.sendKeys("shweta99");
		System.out.println("6.enter password");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		loginbutton.click();
		System.out.println("7.click on login button and show invalid password");
		
		WebElement forgotP = driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]"));
		forgotP.click();
		System.out.println("8.open forgot password link");
		
		WebElement newacc = driver.findElement(By.xpath("//a[contains(Text(),'Create New Account')]"));
		newacc.click();
		System.out.println("9.open create new account page");
		
		
		
		
		
		
		
		

	}

}
