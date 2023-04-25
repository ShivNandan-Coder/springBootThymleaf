package com.example.getpostdeleteApi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class StudentController {
    @RequestMapping("/hello")
    public String main(Model model) {

        model.addAttribute("message", "HelloWorld!!!!!!");

        return "hello";
    }

}
