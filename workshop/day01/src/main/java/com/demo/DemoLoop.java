package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoLoop {

    public static void main(String[] args) {
        DemoLoop demoLoop = new DemoLoop();
        demoLoop.simple();
    }

    private void simple() {
//        String[] names = {"A","b", "C" };
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//
//        for (String name: names) {
//            System.out.println(name);
//        }

        List<String> datas = new ArrayList<>();
        datas.add("Data 1");
        datas.add("Data 2");
        datas.add("Data 3");

        datas.stream()
                .filter(e-> e.endsWith("3"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        datas.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);
        datas.forEach(System.out::println);
    }

}
