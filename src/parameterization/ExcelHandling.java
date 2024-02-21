package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	public static void main(String[] args) throws IOException {
		String income_sheet = "C:\\A-SQUARE\\A-SQUARE\\Personal Documents\\Accounts\\Income Sheet-2023.xlsx";
				//Create a object of file class
				File exfile = new File(income_sheet);
				
				//Create object file input stream
				FileInputStream infile = new FileInputStream(exfile);
			
				try (//Create object of XSSFWorkBook
				XSSFWorkbook new_book = new XSSFWorkbook(infile)) {
					//Create object for sheet
					XSSFSheet exsheet = new_book.getSheetAt(0);	//Sheet index starts from 0
					
					//Row1
					XSSFRow exrow = exsheet.getRow(19);			//Row index starts from 0
					
					//Column
					double data0 = exrow.getCell(11).getNumericCellValue();
					System.out.println(data0);
				}	
				
			}
		}
