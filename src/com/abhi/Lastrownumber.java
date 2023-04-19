package com.abhi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lastrownumber {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\abhi\\OneDrive\\Desktop\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("abhi");
		int lastrow=sh.getLastRowNum();
		System.out.println(lastrow);
		Short lastcell=sh.getRow(0).getLastCellNum();
		System.out.println(lastcell);
		
		

	}

}
