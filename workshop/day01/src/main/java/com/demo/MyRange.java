package com.demo;

public class MyRange {
    private static final int ASCII_OF_ZERO = 48;
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean startWithInclude() {
        return this.input.startsWith("[");
    }

    public int getStartNumber() {
        int number = this.input.charAt(1);
        if(startWithInclude()) {
            return number - ASCII_OF_ZERO;
        }
        return number - ASCII_OF_ZERO + 1;
    }
}
