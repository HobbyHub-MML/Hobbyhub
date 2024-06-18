package com.example.hobbyhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/test")
    public String home() {
        return "test";  // `test.jsp` 파일을 렌더링합니다.
    }
}