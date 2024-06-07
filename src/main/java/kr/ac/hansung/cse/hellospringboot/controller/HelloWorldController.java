package kr.ac.hansung.cse.hellospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloWorldController {

    @GetMapping("/")
    public String sayHello() {
        return "index";
    }
}
