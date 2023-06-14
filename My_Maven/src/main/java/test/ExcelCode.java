package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
	public static FileInputStream f; //file fetch
		public static XSSFWorkbook w; //Taking details of Workbook
		public static XSSFSheet s; //Taking sheet from the workbook
		
		public static String readStringData(int i,int j) throws IOException
		{
			f = new FileInputStream("C:\\Users\\abhij\\OneDrive\\Desktop\\ExcelRead.xlsx");
			w = new XSSFWorkbook(f);
			s = w.getSheet("Sheet1"); //fetching sheet(method getSheet)
			
			Row r = s.getRow(i); //fetching row
			Cell c = r.getCell(j); //fetching column
			
			return c.getStringCellValue(); // fetching cell's string value
		}
		
		public static double readIntegerData(int i, int j) throws IOException
		{
			f = new FileInputStream("C:\\Users\\abhij\\OneDrive\\Desktop\\ExcelRead.xlsx");
			w = new XSSFWorkbook(f);
			s = w.getSheet("Sheet1"); //fetching sheet(method getSheet)
			
			Row r = s.getRow(i); //fetching row
			Cell c = r.getCell(j); //fetching column
			
			return c.getNumericCellValue();
		}

}
