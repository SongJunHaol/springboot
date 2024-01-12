package com.sjh001.springboot3001.mapper;

import com.sjh001.springboot3001.bean.Grade;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GradeMapper {
    public List<Grade> getGrade();
}
