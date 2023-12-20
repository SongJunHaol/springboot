package com.sjh001.springboot3001.mapper;

import com.github.pagehelper.Page;
import com.sjh001.springboot3001.bean.School;
import com.sjh001.springboot3001.dto.EmployeeDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SchoolMapper {
    public School getSchool(String name);


    public Page<School> getSchool1(EmployeeDTO employeeDTO);
}
