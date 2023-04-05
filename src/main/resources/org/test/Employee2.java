package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee2 {
public static void main(String[] args) throws IOException {
	File excelLoc=new File("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\Book2.xlsx");
	FileInputStream fIn = new FileInputStream(excelLoc);
	Workbook w=new XSSFWorkbook(fIn);
	Sheet s = w.getSheet("Data");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			
			int type = c.getCellType();
			
			if (type==1) {
				String sValue = c.getStringCellValue();
				System.out.println(sValue);
			}
			else if (type==0) {
				if (DateUtil.isCellDateFormatted(c)) {
					Date date = c.getDateCellValue();
					SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
					String dValue = sdf.format(date);
					System.out.println(dValue);
				}
				else {
					double d = c.getNumericCellValue();
					long l=(long)d;
					String nValue = String.valueOf(l);
					System.out.println(nValue);
				}
			}
		
		}
	
	}
	
}
}
