package com.sjh001.springboot3001.service;

import com.sjh001.springboot3001.bean.Result;
import com.sjh001.springboot3001.bean.School;
import com.sjh001.springboot3001.dto.EmployeeDTO;

public interface SchoolService  {
    public School getSchool(String name);

    Result getSchool1(EmployeeDTO employeeDTO);
}
