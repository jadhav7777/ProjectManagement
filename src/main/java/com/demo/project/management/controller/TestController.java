package com.demo.project.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("admin")
    private String getAdminPage(){
        return "admin";
    }

}
