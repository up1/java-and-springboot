package com.example.demorest.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

//    @RequestMapping(method = RequestMethod.GET, path = "/hello/{name}")
    @GetMapping("/hello/{name}")
    public HelloResponse sayHi(@PathVariable String name) {
        String message = helloService.process(name);
        return new HelloResponse(message);
    }

    @GetMapping("/hello")
    public String sayHi2(@RequestParam String name) {
        return "Hello " + name;
    }

}
