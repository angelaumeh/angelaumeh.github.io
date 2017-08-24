package com.oreilly.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    //when I hit localhost:8080/hello, this method will work
    //if there is a name value in the URL (?name), it will be grabbed and put in (not required tho)
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello"; //thymeleaf: name of the template you want to return
    }

    @GetMapping("/goodbye")
    public String sayGoodbye(@RequestParam(value = "name", required = false, defaultValue = "y'all") String name, Model model) {
        model.addAttribute("name", name);
        return "goodbye"; //thymeleaf: name of the template you want to return
    }
}
