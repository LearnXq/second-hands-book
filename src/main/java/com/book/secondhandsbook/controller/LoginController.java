package com.book.secondhandsbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hxq
 * @date 2022/3/20
 */
@Controller
public class LoginController {

    /**
     * 跳转到登录页
     * @return
     */
    @GetMapping("/")
    public String loginPage(){
        return "login.html";
    }

    @GetMapping("/test")
    public String test(){
        return "test.html";
    }
}
