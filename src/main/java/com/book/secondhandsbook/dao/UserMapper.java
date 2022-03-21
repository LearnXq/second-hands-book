package com.book.secondhandsbook.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.book.secondhandsbook.entry.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用户表mapper
 * @author hxq
 * @date 2022/3/21
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据用户名和密码查找用户
     * @param username
     * @param password
     * @return
     */
    User getUser(@Param("username") String username, @Param("password") String password);

}
