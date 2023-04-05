package org.test3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {

	
	@Test(dataProvider="res")
	
	 private void Data(String s,String s1) {
		System.out.println(s);
		System.out.println(s1);
	}
	
	@DataProvider(name="res",parallel=true)
	private Object[][] DataProvider2(){
		return new Object[][] {};
		
		
	}
}
