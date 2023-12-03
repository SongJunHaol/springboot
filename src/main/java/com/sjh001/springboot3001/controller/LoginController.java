package com.sjh001.springboot3001.controller;

import com.sjh001.springboot3001.bean.Result;
import com.sjh001.springboot3001.bean.User;
import com.sjh001.springboot3001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;


}
