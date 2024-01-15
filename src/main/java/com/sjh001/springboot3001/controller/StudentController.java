package com.sjh001.springboot3001.controller;

import com.sjh001.springboot3001.bean.Result;
import com.sjh001.springboot3001.bean.Student;
import com.sjh001.springboot3001.mapper.SchoolMapper;
import com.sjh001.springboot3001.mapper.StudentMapper;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/getstudent")
    public Result getStudent(@RequestParam(defaultValue = "01") String classname){
//        List<Student> s = studentMapper.idGetStudnet("20200607"+classname+"__");
//        System.out.println(Result.success(s));
//        return  Result.success(studentMapper.idGetStudnet("20200607"+classname+"__"));
//        return studentMapper.idGetStudnet("20200607"+classname+"__");
        return Result.success(studentMapper.idGetStudnet("20200607"+classname+"__"));
    }

    @PostMapping("/setUser")
    public Result setUser(){
        int i = studentMapper.setUser("sjh1","sjh1");

        if(i==1){
            return Result.success();
        }else {
            return Result.error("注册失败");
        }
    }
}
