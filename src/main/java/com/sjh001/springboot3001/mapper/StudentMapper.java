package com.sjh001.springboot3001.mapper;

import com.sjh001.springboot3001.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student> idGetStudnet(String studentid);

    public int setUser(String username,String nickname);
}
