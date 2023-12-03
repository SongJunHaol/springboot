package com.sjh001.springboot3001.service;

import com.sjh001.springboot3001.bean.User;

public interface UserService {
    //根据用户名查询用户
    public User findByUser(String username);

    //注册接口
    public int insertUser(String username,String nickname, String password);
}
