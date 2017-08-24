package com.oreilly.controllers;

import com.oreilly.pojo.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/rest")
    public Greeting greet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting("Hello, " + name);
    }
}
