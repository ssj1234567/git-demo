package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGitController {
    @RequestMapping("/hello")
    public String testGit(){
        System.out.println("代码修改了......");
        System.out.println("第三个版本.......");
        System.out.println("hot-fix修改了代码!!!");
        System.out.println("hot-fix修改了代码aaa!!!");
        return "hello,world!!!";
    }
}
