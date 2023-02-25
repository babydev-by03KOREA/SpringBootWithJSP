package com.spring.jsp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping
    public String main() {
        logger.info("main 페이지 접근");
        return "index";
    }
}
