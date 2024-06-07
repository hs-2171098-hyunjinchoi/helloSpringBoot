package kr.ac.hansung.cse.hellospringboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${app.professor}")
    private String professor;

    @Value("${app.course}")
    private String course;

    @GetMapping("/")
    public String sayHello(Model model) {

        logger.debug("proffesor name: {}", professor);
        logger.debug("course name: {}", course);

        model.addAttribute("msg", "Hello World");
        return "index";
    }
}
