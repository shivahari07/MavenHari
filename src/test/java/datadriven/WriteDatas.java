package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatas {
	
	public static void writeData() throws IOException {
		
		File f = new File(".\\Excel\\New.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		/*Sheet createSheet = wb.createSheet("MultipleData");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Employeeid");*/
		wb.createSheet("MultipleData").createRow(0).createCell(0).setCellValue("EMP Name");
		wb.getSheet("MultipleData").getRow(0).createCell(1).setCellValue("id");
		wb.getSheet("MultipleData").createRow(1).createCell(0).setCellValue("Hari");
		wb.getSheet("MultipleData").getRow(1).createCell(1).setCellValue("100");
		wb.getSheet("MultipleData").createRow(2).createCell(0).setCellValue("Moses");
		wb.getSheet("MultipleData").getRow(2).createCell(1).setCellValue("101");
		wb.getSheet("MultipleData").createRow(3).createCell(0).setCellValue("God");
		wb.getSheet("MultipleData").getRow(3).createCell(1).setCellValue("103");

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.exit(0);
		System.out.println("done");
		wb.close();

	}
	public static void main(String[] args) throws IOException {
		writeData();
	}

}
