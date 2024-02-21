package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling2 {

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

		for (int r=1;r<=9;r++) {
			//System.out.print(r);
			XSSFRow exrow1 = exsheet.getRow(r);	

			for (int c=0;c<=1;c++) {
				//System.out.println(c);
				String data1 = exrow1.getCell(c).getStringCellValue();
				System.out.print(" " + data1);	
			}
			System.out.println();
		}
	}
}


