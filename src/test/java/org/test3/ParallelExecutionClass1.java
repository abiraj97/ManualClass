package org.test3;

public class ParallelExecutionClass1 {
	
	 private void test1() {
			System.out.println(Thread.currentThread().getId());
			
		}
		   
		   private void test2() {
				System.out.println(Thread.currentThread().getId());
	}

}
