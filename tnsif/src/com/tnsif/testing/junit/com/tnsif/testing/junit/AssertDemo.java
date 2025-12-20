package com.tnsif.testing.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertDemo {

    @Test
    public void testForAssertEquals() {
        int actResult = 1;
        int expResult = 1;
        assertEquals(expResult, actResult);
    }

    @Test
    public void testForAssertTrue() {
        assertTrue("Hello".contains("e"));
    }

    @Test
    public void testForAssertFalse() {
        assertFalse("Hello".contains("b"));
    }

    @Test
    public void testForNull() {
        String s = null;
        assertNull(s);
    }

    @Test
    public void failTest() {
        fail("it is supposed to fail");
    }
}
