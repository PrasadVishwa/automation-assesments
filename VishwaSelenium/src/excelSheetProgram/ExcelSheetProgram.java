package excelSheetProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetProgram 
{
	public static void main(String[] args) throws IOException 
	{
		String excelPath = "C:\\Users\\prasa\\Desktop\\Book1.xlsx";
		
		//Excel file read
		
		FileInputStream file = new FileInputStream(excelPath);
		
		//workbook read---> apache poi
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
	
		//Sheet Read
		XSSFSheet sheet = workbook.getSheet("batch");
		
		//row read
		XSSFRow row = sheet.getRow(2);
		
		//cell read
		XSSFCell cell = row.getCell(0);
		
		//Value read -- string value -- word data
		
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		//to get the numeric value
//	double data = cell.getNumericCellValue();
		
		//Console print
		
//		System.out.println(data);
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
