package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee1 {
public static void main(String[] args) throws IOException {
	File excelLoc = new File("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\Book1.xlsx");
	
	FileInputStream fIn=new FileInputStream(excelLoc);
	
	Workbook w=new XSSFWorkbook(fIn);
	
	Sheet s = w.getSheet("Data");
	
	Row r = s.getRow(2);
	
	Cell c = r.getCell(0);
	System.out.println(c);
	
	int rows = s.getPhysicalNumberOfRows();
	System.out.println(rows);
	
	int cells = r.getPhysicalNumberOfCells();
	System.out.println(cells);
	
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r1 = s.getRow(i);
		
		for (int j = 0; j < r1.getPhysicalNumberOfCells(); j++) {
			Cell c1 = r1.getCell(j);
			
			System.out.println(c1);
		}
	}
	
}
}
