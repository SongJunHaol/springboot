package com.sjh001.springboot3001.mapper;

import com.sjh001.springboot3001.bean.School;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SchoolMapper {
    public School getSchool(String name);


}
