package com.sjh001.springboot3001.service.impl;

import com.sjh001.springboot3001.bean.Grade;
import com.sjh001.springboot3001.mapper.GradeMapper;
import com.sjh001.springboot3001.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeMapper gradeMapper;
    @Override
    public List<Grade> getGrade() {
        return gradeMapper.getGrade();
    }
}
