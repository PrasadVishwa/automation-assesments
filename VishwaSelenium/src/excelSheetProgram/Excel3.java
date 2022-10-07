package excelSheetProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel3 
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
		
		//Case-1
//		XSSFRow row = sheet.getRow(0);
//		XSSFCell cell = row.getCell(0);
//		String data = cell.getStringCellValue();
//		System.out.println(data);
		
		//case-2
		for(int i=0; i<=3; i++)
		{
			for(int j=0; j<=1; j++)
			{
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);	
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
