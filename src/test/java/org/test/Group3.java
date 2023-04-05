package org.test;

import org.testng.annotations.Test;

public class Group3 {

	@Test(groups="Sanity")
	private void test31() {
		System.out.println("Test 31");
		
	}
	@Test(groups="E2E")
	private void test32() {
		System.out.println("Test 32");
	}
	
}
