package excelreading;

import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException 
	{
		String y= ExcelCode.getStringData(1, 0);
		System.out.println(y);
		String z= ExcelCode.getIntegerData(1, 1);
		System.out.println(z);
		String o= ExcelCode.getStringData(2, 0);
		System.out.println(o);
		String q= ExcelCode.getIntegerData(2, 1);
		System.out.println(q);
		// TODO Auto-generated method stub

	}

}
