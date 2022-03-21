package com.book.secondhandsbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页Controller
 * @author hxq
 * @date 2022/3/21
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    /**
     * 跳转到主页
     * @return
     */
    @RequestMapping("")
    public String index(){
        return "index.html";
    }
}
