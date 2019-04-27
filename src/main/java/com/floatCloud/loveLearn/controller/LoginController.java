package com.floatCloud.loveLearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.floatCloud.loveLearn.common.exception.TestException;
import com.floatCloud.loveLearn.common.pojo.JsonDataDTO;
import com.floatCloud.loveLearn.dao.domain.SysUser;
import com.floatCloud.loveLearn.dao.mapper.SysUserMapper;

@Controller
public class LoginController {

    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping("/index")
    @ResponseBody
    public SysUser index(){
        SysUser sysUser = sysUserMapper.getUserSelective();
        return sysUser;
    }

    @RequestMapping("/textException.json")
    public JsonDataDTO textException(){
        throw new TestException("default error!");
        /*return JsonDataDTO.fail("hello Exception!");*/
    }

}
