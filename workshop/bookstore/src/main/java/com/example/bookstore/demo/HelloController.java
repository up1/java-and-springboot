package com.example.bookstore.demo;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class HelloController {

    @PostMapping("/hello")
    public String createData(
            @RequestBody RequestCreateHello request) {
        return request.toString();
    }

    @GetMapping("/hello/{name}")
    public String sayHi(@PathVariable String name) throws Exception {
        if("400".equals(name)) {
            throw new IOException();
        } else if("404".equals(name)) {
            throw new Exception();
        }
        return "Hello, " + name;
    }

    @GetMapping("/hello")
    public String sayHi2(@RequestParam String name) {
        return "Hello, " + name;
    }

}

