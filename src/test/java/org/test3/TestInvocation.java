package org.test3;

import org.testng.annotations.Test;

public class TestInvocation {

	@Test(priority=8)
	private void test1() {
		System.out.println("Test 1");
	}
	
	@Test(invocationCount=5)
	private void test2() {
		System.out.println("Test 2");
	}
	
	@Test(enabled=false)
	private void test3() {
		System.out.println("Test 3");
	}
	
	@Test(priority=8)
	private void test4() {
		System.out.println("Test 4");
	}
	
	@Test(enabled=false)
	private void test6() {
		System.out.println("Test 5");
	}
	
	@Test(priority=8)
	private void test5() {
		System.out.println("Test 6");
	}
}
