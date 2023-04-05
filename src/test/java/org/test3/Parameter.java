package org.test3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	@Parameters({"userName","passWord"})
	@Test
	
	private void test(String s,String s1) {
		System.out.println(s);
		System.out.println(s1);
	}
}
