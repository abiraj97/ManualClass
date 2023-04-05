package org.test3;

import org.testng.annotations.Test;

public class DataProvider {

	
	  @Test(dataProvider="res")
	
	 private void Data(String s,String s1) {
		System.out.println(s);
		System.out.println(s1);
	}
	  @org.testng.annotations.DataProvider(name="res")
	  private Object[][] Data(){
			  
			 return new Object[][] {{"raj","raj@123"},{"arul","arul@123"},{"abi","abi@123"}};
}
}