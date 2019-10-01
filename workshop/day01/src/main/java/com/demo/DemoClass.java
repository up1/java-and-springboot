package com.demo;

public class DemoClass extends Object {

    private int i;
    private int j;

    public DemoClass() {
        this(0);
    }

    public DemoClass(int i) {
        this(i, 0);
    }

    public DemoClass(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "DemoClass{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        System.out.println(demoClass.toString()); // com.demo.DemoClass@7852e922
    }
}
