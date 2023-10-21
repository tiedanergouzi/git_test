package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Helloworld {
    @RequestMapping("/helloworld")
    public String hello(){
        return "hello world" + "第二次"  + "第三次";
    }
}
