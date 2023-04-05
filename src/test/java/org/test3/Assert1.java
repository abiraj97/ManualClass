package org.test3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

public class Assert1 {

	
	@Test
    
    public void test11() {
      System.out.println("Test 11");
}
    
    
    @Test
    
    public void test12() {
    	junit.framework.Assert.assertTrue(false);
}

    @Test

   public void test13() {
        junit.framework.Assert.assertTrue(true);
    }

    @Test

   public void test14() {
    	 Assert.assertTrue(true);
}
}
