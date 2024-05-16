package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
	private static void wData() throws Throwable {
		File f = new File(".\\Excel\\Seleniumread.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("newdata").createRow(0).createCell(0).setCellValue("Employee_id");
		wb.getSheet("newdata").getRow(0).createCell(1).setCellValue("Employee_Name");
		wb.getSheet("newdata").createRow(1).createCell(0).setCellValue("123");
		wb.getSheet("newdata").getRow(1).createCell(1).setCellValue("HariHaran");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.exit(0);
		System.out.println("Done");
		wb.close();
	}
public static void main(String[] args) throws Throwable {
wData();
		

	}

}
