package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterization {
	
	public static void main (String[] args) throws IOException {
		
		String path = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\Excel-Study\\Book1.xlsx";
	
		File infile = new File(path);
		
		FileInputStream exfile = new FileInputStream (infile);
		
		XSSFWorkbook wbook = new XSSFWorkbook (exfile); 
		
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(16);
		
		double column = row.getCell(5).getNumericCellValue();
		
		String column1 = row.getCell(4).getStringCellValue();
		System.out.println(column1+" = "+column);
	}

}
