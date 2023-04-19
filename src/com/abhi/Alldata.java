package com.abhi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Alldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\abhi\\OneDrive\\Desktop\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("abhi");
		DataFormatter format = new DataFormatter();
		try
		{
		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				String value = format.formatCellValue(row.getCell(j));
				System.out.println(value + '\t');
			}

		}
		}
		catch(NullPointerException e)
		{
			
		}
		System.out.println();

	}

}
