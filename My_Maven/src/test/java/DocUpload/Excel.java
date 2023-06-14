package DocUpload;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	public static String readUserName(int i, int j) throws IOException
	{
		f = new FileInputStream("C:\\Users\\abhij\\OneDrive\\Desktop\\Password.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("Credentials");
		
		Row r = s.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();
	}
	
	public static String readPassword(int i,int j) throws IOException
	{
		f = new FileInputStream("C:\\Users\\abhij\\OneDrive\\Desktop\\Password.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("Credentials");
		
		Row r = s.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();
	}
	

}
