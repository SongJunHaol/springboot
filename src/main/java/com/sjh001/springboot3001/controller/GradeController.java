package com.sjh001.springboot3001.controller;


import com.sjh001.springboot3001.bean.Result;
import com.sjh001.springboot3001.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {
    @Autowired
    private GradeService gradeService;
    @GetMapping("/getReade")
    public Result getReade(){
        return Result.success(gradeService.getGrade());
    }


}

