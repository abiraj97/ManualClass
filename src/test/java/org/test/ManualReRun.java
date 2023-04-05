package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManualReRun {

	@Test
	private void test11() {
		System.out.println("Test 11");
		
	}
	@Test
	private void test12() {
		System.out.println("Test 12");
	}
	@Test
	private void test13() {
		Assert.assertTrue(false);
	}
	@Test
	private void test14() {
		System.out.println("Test 14");
	}
}
