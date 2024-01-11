package com.sjh001.springboot3001.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sjh001.springboot3001.bean.PageResult;
import com.sjh001.springboot3001.bean.StudentEmp;
import com.sjh001.springboot3001.dto.StudentEmpDTO;
import com.sjh001.springboot3001.mapper.StudentMapper;
import com.sjh001.springboot3001.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentMapper studentMapper;

    @Override
    public PageResult getStudentExam(StudentEmpDTO studentEmpDTO) {
        PageHelper.startPage(studentEmpDTO.getPage(),studentEmpDTO.getPageSize());
        Page<StudentEmp> page = studentMapper.getStudentExam(studentEmpDTO);
        return new  PageResult(page.getTotal(),page.getResult());
    }
}
