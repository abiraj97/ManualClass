package org.test3;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUNITReport {

	
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(JUNIT.class,JUNITLaunch.class);
		System.out.println("FailedCount "+r.getFailureCount());
		System.out.println("RunCount "+r.getRunCount());
		System.out.println("IgnoreCount "+r.getIgnoreCount());
		
		int passCount=r.getRunCount()-r.getFailureCount();
		System.out.println("PassCount "+passCount);
		
        List<Failure> failures = r.getFailures();
        for (Failure failure : failures) {
			System.out.println(failure);
        	
		}
	}
}
