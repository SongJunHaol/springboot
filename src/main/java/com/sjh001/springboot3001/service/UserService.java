package com.sjh001.springboot3001.service;

import com.sjh001.springboot3001.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    //根据用户名查询用户
    public User findByUser(String username);

    //注册接口
    public int insertUser(@Param("username") String username1, @Param("password") String nickname, String password);
}
