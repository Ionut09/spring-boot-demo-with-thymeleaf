package com.example.demo.controller;

import com.example.demo.ExampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
    @Autowired
    ExampleService exampleService;

    @GetMapping("/")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }


    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World" + exampleService.getValue() +
                "==" + exampleService.getPropertyInteger();
    }

    @PostMapping("/hello")
    public String formTarget(@RequestParam("name") String name, Model model) {
        model.addAttribute("user", name);
        return "response";
    }
}
