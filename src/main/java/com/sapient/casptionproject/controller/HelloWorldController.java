package com.sapient.casptionproject.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World RESTful with Spring Boot " +
                " From Casption Project Of Sapient " +
                " By  Shubham Ghawas";
    }
}
