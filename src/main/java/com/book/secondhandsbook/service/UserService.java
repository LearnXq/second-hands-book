package com.book.secondhandsbook.service;

import com.book.secondhandsbook.entry.User;

/**
 * 用户表service层
 * @author hxq
 * @date 2022/3/21
 */
public interface UserService {
    User getUser(String username, String password);

    void saveUser(User user);
}
