package kr.ac.hansung.cse.hellospringboot.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello(Model model) {
        model.addAttribute("msg", "Hello World");
        return "index";
    }
}
