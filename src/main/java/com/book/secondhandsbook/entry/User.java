package com.book.secondhandsbook.entry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户表
 * @author hxq
 * @date 2022/3/21
 */
@Data
@TableName(value = "t_user")
public class User {

    /**
     * 主键id
     */
    @TableId(type= IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 角色
     */
    private String role;
}
