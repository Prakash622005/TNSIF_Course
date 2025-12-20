package com.tnsif.testing.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertDemo {
	
	@Test
	
	public void testForAssertEquals()
	{

		int actResult = 1;
		int expResult = 1;
		
		assertEquals(actResult, expResult);
		
	}

	@Test
		public void testForAssertTrue() {
			
			assertTrue("Hello".contains("u"));
		}
	
	@Test
	public void testForAssertFalse() {
		
		assertFalse("Hello".contains("b"));
	}
	
	@Test
	public void testForNull()
	{
		String s = null;
		assertNull(s);
	}
	
	
	@Test
	public void failTest() {
		fail("it is suppose to fail");
	}
	
}
	
	
