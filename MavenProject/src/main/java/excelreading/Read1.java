package excelreading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read1 {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sheet;
	
	public static String getString(int a, int b) throws IOException
	{
		f= new FileInputStream("‪C:\\Users\\Dell-i5\\Desktop\\ExcelWorkTest.xlsx");
		w=new XSSFWorkbook(f);
		sheet= w.getSheet("sheet1");
		XSSFRow r=sheet.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
		
	}
	public static String getInteger(int a, int b) throws IOException
	{
		f= new FileInputStream("‪C:\\Users\\Dell-i5\\Desktop\\ExcelWorkTest.xlsx");
		w=new XSSFWorkbook(f);
		sheet= w.getSheet("sheet1");
		XSSFRow r=sheet.getRow(a);
		XSSFCell c=r.getCell(b);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
		
		
	}
	

}
