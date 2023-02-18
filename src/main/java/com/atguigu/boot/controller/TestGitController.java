package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGitController {
    @RequestMapping("/hello")
    public String testGit(){
        return "hello,world!!!";
    }
}
