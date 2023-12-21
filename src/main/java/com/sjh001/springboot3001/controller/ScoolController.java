package com.sjh001.springboot3001.controller;

import com.sjh001.springboot3001.bean.Result;
import com.sjh001.springboot3001.bean.School;
import com.sjh001.springboot3001.dto.EmployeeDTO;
import com.sjh001.springboot3001.mapper.SchoolMapper;
import com.sjh001.springboot3001.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoolController {

    @Autowired
    SchoolMapper schoolMapper;
    @Autowired
    SchoolService schoolService;

    @GetMapping("/getschool")
                public School getSchool(@RequestParam("schoolname") String schoolname){

        System.out.println(schoolname);
        return schoolMapper.getSchool(schoolname);
    }


    @GetMapping("/getschoolpoage")
    public Result getschool1(EmployeeDTO employeeDTO){
        return Result.success(schoolService.getSchool1(employeeDTO));
    }

}
