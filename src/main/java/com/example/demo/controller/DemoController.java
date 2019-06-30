package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/example1")
    private String example1(HttpServletRequest request, Map<String, Object> map) {

        return "web_demo1";
    }
}
