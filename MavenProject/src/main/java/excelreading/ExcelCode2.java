package excelreading;

import java.io.IOException;

public class ExcelCode2 {

	public static void main(String[] args) throws IOException {
		String y = ExcelCode.getStringData(1, 0);
		System.out.println(y);
		String z = ExcelCode.getIntegerData(1, 1);
		System.out.println(z);
		// TODO Auto-generated method stub

	}

}
