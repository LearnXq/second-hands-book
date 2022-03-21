package com.book.secondhandsbook.service.impl;

import com.book.secondhandsbook.dao.UserMapper;
import com.book.secondhandsbook.entry.User;
import com.book.secondhandsbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户Service实现类
 * @author hxq
 * @date 2022/3/21
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String username, String password) {
        return userMapper.getUser(username, password);
    }

    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }
}
