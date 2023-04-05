package org.test3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeClass
	private void beforeClass() {
		System.out.println("Launch Browser");
		
	}
	
	@AfterClass
	private void afterClass() {
		System.out.println("Quit Browser");
		
	}
	
	@Test
	private void test() {
		System.out.println("Test 1");
		
	}
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("End Time");
	}
}
