package com.book.secondhandsbook.controller;

import com.book.secondhandsbook.entry.User;
import com.book.secondhandsbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hxq
 * @date 2022/3/20
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 跳转到登录页
     * @return
     */
    @GetMapping("/")
    public String loginPage(){
        return "login.html";
    }

    /**
     * 登陆操作
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/doLogin")
    @ResponseBody
    public Map<String, Object> doLogin(String username, String password/*, HttpSession session*/) {
        User user = userService.getUser(username, password);
        Map<String, Object> map = new HashMap<>();
        System.out.println("用户登陆"+user.getUsername());
        if (user != null) {
            //把登陆成功的用户保存起来
//            session.setAttribute("loginUser", user);
            map.put("result", true);
            return map;
        } else {
            map.put("result", false);
            map.put("msg", "用户名或密码不正确");
            return map;
        }

    }

//    /**
//     * 去main页面
//     * @return
//     */
//    @GetMapping("/index")
//    public String index() {
//        return "index.html";
//    }
}
