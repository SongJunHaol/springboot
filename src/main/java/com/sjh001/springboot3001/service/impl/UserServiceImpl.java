package com.sjh001.springboot3001.service.impl;

import com.sjh001.springboot3001.bean.User;
import com.sjh001.springboot3001.mapper.UserMapper;
import com.sjh001.springboot3001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUser(String username) {
        return userMapper.usernameFindByUser(username);
    }

    @Override
    public int insertUser(String username, String nickname,  String password) {
        return userMapper.insetUser(username,nickname,password);
    }
}