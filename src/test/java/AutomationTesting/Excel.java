package AutomationTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//C:\Users\2372553\Downloads\RoyalCaribbean 1 (2)\RoyalCaribbean\Excel\d.xlsx


public class Excel {
	public static String te() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Excel\\d.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int totalRows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();

		XSSFRow currentrow=sheet.getRow(1);


		XSSFCell cell=currentrow.getCell(1);


		String search = cell.toString();
		workbook.close();
		file.close();
		return search;
	}
	public static String me() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Excel\\d.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");


		XSSFRow currentrow1=sheet.getRow(1);
		XSSFCell cell1=currentrow1.getCell(0);
		String URL = cell1.toString();
		workbook.close();
		file.close();
		return URL;
	}

}

