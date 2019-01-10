package com.liyanxing.controller.test;

import com.liyanxing.project.commonuser.pojo.CommonUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试控制器
 */
@Controller
public class TestController
{
    @GetMapping("/test")
    public String test(Model model)
    {
//        model.addAttribute("msg","此用户名已被注册!");

        return "register";
    }

    @PostMapping("/getRe")
    @ResponseBody
    public String getRe(CommonUser commonUser)
    {
        return commonUser.toString();
    }
}