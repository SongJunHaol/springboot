package com.sjh001.springboot3001.service.impl;

import com.sjh001.springboot3001.bean.School;
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
}
