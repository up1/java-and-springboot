package com.example.demorest.hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

//    @RequestMapping(method = RequestMethod.GET, path = "/hello/{name}")
    @GetMapping("/hello/{name}")
    public HelloResponse sayHi(@PathVariable String name) {
        return new HelloResponse("Hello " + name);
    }

    @GetMapping("/hello")
    public String sayHi2(@RequestParam String name) {
        return "Hello " + name;
    }

}
