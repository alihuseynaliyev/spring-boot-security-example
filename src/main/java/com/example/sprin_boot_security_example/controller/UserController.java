package com.example.sprin_boot_security_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/admin")
    public String admin() {
        return "For Admin";
    }


    @GetMapping("/index")
    public String index() {
        return "Index page!";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Dashboard page";
    }


}