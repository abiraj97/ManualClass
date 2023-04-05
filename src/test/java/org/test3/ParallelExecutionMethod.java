package org.test3;

public class ParallelExecutionMethod {

	
	   private void test1() {
		System.out.println(Thread.currentThread().getId());
		
	}
	   
	   private void test2() {
			System.out.println(Thread.currentThread().getId());
}
	   
	   private void test3() {
			System.out.println(Thread.currentThread().getId());
			
}
	   
	   private void test4() {
			System.out.println(Thread.currentThread().getId());
			
}
	   
	   private void test5() {
			System.out.println(Thread.currentThread().getId());
			
}
	   
	   private void test6() {
			System.out.println(Thread.currentThread().getId());
			
}
	   
	   private void test7() {
			System.out.println(Thread.currentThread().getId());
			
}
}
