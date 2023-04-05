package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWrite {
public static void main(String[] args) throws IOException {
	File excelLoc =new File("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\New.xlsx");
	FileInputStream fIn = new FileInputStream(excelLoc);
	Workbook w=new XSSFWorkbook(fIn);
	Sheet s = w.getSheet("Course");
	Row r = s.getRow(2);
	Cell c = r.getCell(2);
	String value = c.getStringCellValue();
	
	if (value.contains("Java")) {
		c.setCellValue("Python");
	}
	FileOutputStream fOut = new FileOutputStream(excelLoc);
	w.write(fOut);
	System.out.println("Done");
	
	
}
}
