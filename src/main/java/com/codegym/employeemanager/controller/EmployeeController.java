package com.codegym.employeemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public ModelAndView show() {
        return new ModelAndView("views/index");
    }
}
