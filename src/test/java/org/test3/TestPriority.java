package org.test3;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority=8)
	private void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	private void test2() {
		System.out.println("Test 2");
	}
	
	@Test(priority=-8)
	private void test3() {
		System.out.println("Test 3");
	}
	
	@Test(priority=-15)
	private void test4() {
		System.out.println("Test 4");
	}
	
	@Test(priority=-10)
	private void test6() {
		System.out.println("Test 6");
	}
	
	@Test(priority=10)
	private void test5() {
		System.out.println("Test 5");
	}
}
