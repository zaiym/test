package com.pde.disk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "hello : " + name;
    }
}
