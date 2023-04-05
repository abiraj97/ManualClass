package org.test3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUNIT {
   
	  @AfterClass
	  public static void afterClass() {
		System.out.println("Quit Browser");
	  }	  
		  
	    @Before
		public void before() {
			System.out.println("Start Time");
		}  
		
	    @Test
		public void after() {
			System.out.println("End Time");
		}
		
		@BeforeClass
		public static void beforeClass() {
			System.out.println("End Time");
		}
		
		@Test
		public void test1() {
			System.out.println("Test 1");
		}
		
		@Test
		public void test2() {
			System.out.println("Test 2");
		}
		
		@Test
		public void test3() {
			System.out.println("Test 3");
		}
		  
	}

