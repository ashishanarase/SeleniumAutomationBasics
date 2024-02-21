package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling3 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\Excel-Study\\Book1.xlsx";

		//Create a object of file class
		File exfile = new File(path);

		//Create object file input stream
		FileInputStream infile = new FileInputStream(exfile);

		//Create object of XSSFWorkBook
		XSSFWorkbook wbook = new XSSFWorkbook(infile);

		//Create object for sheet
		XSSFSheet exsheet = wbook.getSheetAt(1);	//Sheet index starts from 0


		//Row1
		XSSFRow exrow = exsheet.getRow(0);			//Row index starts from 0

		//Column
		String data0 = exrow.getCell(0).getStringCellValue();
		System.out.println(data0);	

		//Row2
		XSSFRow exrow1 = exsheet.getRow(0);			//Row index starts from 0

		double data1 = exrow1.getCell(1).getNumericCellValue();
		System.out.println(data1);	
		
		//To set the data in excel file
		exsheet.getRow(0).createCell(2).setCellValue("New Cell");
		FileOutputStream fos = new FileOutputStream(exfile);
		wbook.write(fos);
		wbook.close();
	}
}


