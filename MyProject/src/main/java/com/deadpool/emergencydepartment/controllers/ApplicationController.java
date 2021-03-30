package com.deadpool.emergencydepartment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/apply")
public class ApplicationController {

    @GetMapping
    public String showApplicationForm(Model model) {
        return "application";
    }
}
