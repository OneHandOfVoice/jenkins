package com.jrq.jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jrq")
public class JrqController {

    @GetMapping("/index")
    public String jenkins(String name){
        return "成功返回:"+name;
    }

    @GetMapping("/login")
    public String login(String name){
        return "成功登录sdfad:"+name;
    }



}
