package com.book.secondhandsbook.controller;

import cn.hutool.core.util.StrUtil;
import com.book.secondhandsbook.entry.User;
import com.book.secondhandsbook.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户Controller
 * @author hxq
 * @date 2022/3/21
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 跳转到注册页面
     * @return
     */
    @RequestMapping("/register")
    public String register() {
        return "user/register.html";
    }

    @RequestMapping("/doRegister")
    @ResponseBody
    public Map<String, Object> doRegister(String username, String password, String name, String email) {
        Map<String, Object> map = new HashMap<>();
        boolean success = false;
        if (StrUtil.isBlank(username) || StrUtil.isBlank(password)) {
            map.put("msg", "用户名或密码不能为空！");
            map.put("result", success);
            return map;
        }
        try {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setName(name);
            user.setEmail(email);
            user.setRole("普通用户");
            userService.saveUser(user);
            map.put("msg", "注册成功");
            success = true;
        } catch (Exception e) {
            log.info("注册出错：{}", e.getMessage());
            map.put("msg", "注册出错!");
        }
        map.put("result", success);

        return map;
    }
}
