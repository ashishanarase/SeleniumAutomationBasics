package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {
	public static void main(String[] args) throws IOException {


		String path = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\Interview Calls.xlsx";

		File exfile = new File(path);
		FileInputStream infile = new FileInputStream(exfile);
		XSSFWorkbook book = new XSSFWorkbook(infile);
		XSSFSheet sheet = book.getSheetAt(0);
		XSSFRow exrow = sheet.getRow(4);
		String data = exrow.getCell(8).getStringCellValue();
		System.out.print(data);
	}


}
