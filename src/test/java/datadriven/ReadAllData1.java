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

public class ReadAllData1 {

	private static void readAllData() throws IOException {// FileNotFound/IoExcep
		File f = new File(".\\Excel\\DDSelenium.xlsx");
		FileInputStream fis = new FileInputStream(f); // addThrowsdec
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberofrows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberofrows; i++) {
			Row row = sheetAt.getRow(i);

			int numberofcells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberofcells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					//System.out.println(numericCellValue);
					int data = (int) numericCellValue;
					System.out.print(data);
				}
				
			}

		}
		wb.close();
	}

	public static void main(String[] args) throws Exception {
		readAllData();
	}
}
