package excelSheetProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel2 
{
	public static void main(String[] args) throws IOException 
	{
		String excelPath = "C:\\Users\\prasa\\Desktop\\Book1.xlsx";
		//excel file read
		FileInputStream file = new FileInputStream(excelPath);
		
		//workbook read -- > apache poi
	
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//Sheet read
		XSSFSheet sheet = workbook.getSheet("batch");
		
		//username1
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		System.out.println("username");                //username1
		
		//password1
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cell1 = row1.getCell(1);
		String password = cell1.getStringCellValue();
		System.out.println("password");                //password1
		
		
		//homework --> try this
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Prasad\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys(username);
		
		WebElement pass = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		user.sendKeys(password);
		
		
		
		
		
		
		
	}

}
