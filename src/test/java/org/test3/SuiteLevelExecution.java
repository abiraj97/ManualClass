package org.test3;

import org.testng.annotations.Test;

public class SuiteLevelExecution {

	@Test
	private void test1() {
		System.out.println("Test 1");
}
	
	@Test
	private void test2() {
		System.out.println("Test 2");
		
}
	
	@Test
	private void test3() {
		System.out.println("Test 3");
	
	}
		@Test
		private void test4() {
			System.out.println("Test 4");
	
}
}