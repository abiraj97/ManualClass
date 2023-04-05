package org.test;

import org.testng.annotations.Test;

public class Group2 {

	@Test(groups="Smoke")
	private void test21() {
		System.out.println("Test 21");
		
	}
	@Test(groups="Sanity")
	private void test22() {
		System.out.println("Test 22");
	}
	@Test(groups="Reg")
	private void test23() {
		System.out.println("Test 23");
	}
	@Test(groups="E2E")
	private void test24() {
		System.out.println("Test 24");
	}
}
