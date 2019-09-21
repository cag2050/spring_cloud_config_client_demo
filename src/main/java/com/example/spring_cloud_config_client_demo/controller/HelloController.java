package com.example.spring_cloud_config_client_demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${neo.hello}")
    String hello;

    @RequestMapping("/hello")
    String hello() {
        return this.hello;
    }
}
