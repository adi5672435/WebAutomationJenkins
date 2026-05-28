package com.testautomation.Utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {

	public String readExcel(String fileName, int row, int col) {
		FileInputStream fileInputStream = null;
		Workbook workbook = null;
		String cellValue = null;
		DataFormatter formatter = new DataFormatter();

		try {
			fileInputStream = new FileInputStream(new File(fileName));

			if (fileName.endsWith(".xlsx")) {
				workbook = new XSSFWorkbook(fileInputStream);
			} else {
				throw new IOException("Unsupported Excel file type");
			}

			Sheet sheet = workbook.getSheetAt(0);

			Row sheetRow = sheet.getRow(row);

			if (sheetRow != null) {
				Cell cell = sheetRow.getCell(col);

				if (cell != null) {

					//                    switch (cell.getCellType()) {
					//                        case STRING:
					//                            cellValue = cell.getStringCellValue();
					//                            break;
					//                        case NUMERIC:
					//                            cellValue = String.valueOf(cell.getNumericCellValue());
					//                            break;
					//                        case BOOLEAN:
					//                            cellValue = String.valueOf(cell.getBooleanCellValue());
					//                            break;
					//                        default:
					//                            cellValue = "Invalid cell type";
					//                    }

					try {
						cellValue = cell.getStringCellValue();
					}catch(Exception e) {
						cellValue = formatter.formatCellValue(cell);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return cellValue;
	}
}
