package com.floatCloud.loveLearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        String returnStr = "Hello World!";
        return returnStr;
    }
}
