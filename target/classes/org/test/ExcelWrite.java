package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws IOException {
	File excelLoc=new File("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\New.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet s = w.createSheet();
	Row r = s.createRow(2);
	Cell c = r.createCell(2);
	c.setCellValue("Java");
    
	FileOutputStream fOut=new FileOutputStream(excelLoc);
	w.write(fOut);
	System.out.println("Done");
	
}
}
