package com.loveCloud.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


    @RequestMapping("/")
    public String login(@RequestBody String loginStr){
        loginStr = "welcome LoveLearn";
        System.out.println("测试！");
        return loginStr;
    }
}
