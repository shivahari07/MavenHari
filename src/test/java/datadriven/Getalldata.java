package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getalldata {
	
	public static void createee() throws IOException {
File f = new File(".\\Excel\\ExcelSelenium.xlsx");
FileInputStream fis = new FileInputStream(f);
Workbook wb = new XSSFWorkbook(fis);
Sheet sheet = wb.getSheetAt(2);
int NumberOfRows = sheet.getPhysicalNumberOfRows();
System.out.println(NumberOfRows);
for(int i=0;i<NumberOfRows;i++){
	Row row = sheet.getRow(i);
	
	int NumberOfCells = row.getPhysicalNumberOfCells();
	for(int j=0;j<NumberOfCells;j++) {
		Cell cell = row.getCell(j);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if(cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data = (int) numericCellValue;
			System.out.println(data);
		}
		wb.close();
	
	
}
} 
	}
	public static void main(String[] args) throws IOException {
		createee();
	}
}


