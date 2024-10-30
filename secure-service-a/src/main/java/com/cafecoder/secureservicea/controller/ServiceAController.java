package com.cafecoder.secureservicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @GetMapping("/service-A")
    public String serviceA() {
        return "Service A is called";
    }
}
