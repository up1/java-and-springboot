package com.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyRangeTest {

    @Test
    public void start_with_exclude_should_return_number() {
        MyRange myRange = new MyRange("(1,5]");
        int number = myRange.getStartNumber();
        assertEquals(2, number);
    }

    @Test
    public void start_with_include_should_return_number() {
        MyRange myRange = new MyRange("[1,5]");
        int number = myRange.getStartNumber();
        assertEquals(1, number);
    }

    @Test
    public void start_with_exclude() {
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.startWithInclude();
        assertFalse(result);
    }

    @Test
    public void start_with_include() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.startWithInclude();
        assertTrue("ต้องมีค่าเป็น true", result);
    }

}