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

public class ReadData1 {

	private static void Rdata() throws IOException {

		File f = new File(".\\Excel\\DDSelenium.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sA = wb.getSheetAt(0);
		Row row = sA.getRow(10);
		Cell cell = row.getCell(5);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String stringcellvalue = cell.getStringCellValue();
			System.out.println(stringcellvalue);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numcellvalue = cell.getNumericCellValue();
			int data = (int) numcellvalue;
			System.out.println(data);
			wb.close();

		}
		}
	public static void main(String[] args) throws IOException {
		Rdata();
	}

}