package com.sjh001.springboot3001.controller;

import com.sjh001.springboot3001.bean.Result;
import com.sjh001.springboot3001.bean.User;
import com.sjh001.springboot3001.mapper.UserMapper;
import com.sjh001.springboot3001.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollController {
    @Autowired
    private UserService userService;
    @PostMapping("/enroll")
    public Result<String> enroll(String username,String nickname, String password){
        if(username!=null&&nickname!=null&&password!=null){
            User u = userService.findByUser(username);
            if(u==null){
                int i = userService.insertUser(username,nickname,password);
                return Result.success(i==1 ? "操作成功" : "服务器内部错误");
            }else{
                return Result.error("用户已经存在");
            }
        }else {
            return Result.error("缺少参数");
        }
    }


    @PostMapping("/login")
    public Result login(@Pattern(regexp = "^\\S{3,16}$")String username,
                        @Pattern(regexp = "^\\S{3,16}$")String password, HttpServletRequest httpServletRequest){
        User u = userService.findByUser(username);
        System.out.println("ip"+httpServletRequest.getRemoteAddr().toString());
        if(u==null){
            return Result.error("用户名不存在");
        }
        if(password.equals(u.getPassword())){
            return Result.success("token");
        }
        return Result.error("用户名或密码错误");
    }

}
