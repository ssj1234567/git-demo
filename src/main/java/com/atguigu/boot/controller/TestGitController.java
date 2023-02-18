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
        System.out.println("master修改了代码！！！");
        System.out.println("hot-fix修改了代码aaa!!!");
        System.out.println("push test");
        System.out.println("刚刚重新使用了ssh 推送代码");
        return "hello,world!!!";
    }
}
