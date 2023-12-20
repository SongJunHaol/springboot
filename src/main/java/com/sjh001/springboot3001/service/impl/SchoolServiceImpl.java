package com.sjh001.springboot3001.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sjh001.springboot3001.bean.Result;
import com.sjh001.springboot3001.bean.School;
import com.sjh001.springboot3001.dto.EmployeeDTO;
import com.sjh001.springboot3001.mapper.SchoolMapper;
import com.sjh001.springboot3001.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    @Override
    public School getSchool(String name) {
        return schoolMapper.getSchool(name);
    }

    @Override
    public Result getSchool1(EmployeeDTO employeeDTO) {
        System.out.println(employeeDTO.getPage());
        System.out.println(employeeDTO.getClassname());
        System.out.println(employeeDTO.getPageSize());

        //开始分页查询
        PageHelper.startPage(employeeDTO.getPage(),employeeDTO.getPageSize());

        Page<School> page = schoolMapper.getSchool1(employeeDTO);

        return Result.success(employeeDTO);
    }
}
