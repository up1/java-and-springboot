package com.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void sayHi_with_somkiat_should_return_Hello_somkiat() {
        Hello hello = new Hello();
        String result = hello.sayHi("somkiat");
        assertEquals("Hello somkiat", result);
    }
}