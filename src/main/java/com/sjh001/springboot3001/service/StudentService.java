package com.sjh001.springboot3001.service;

import com.sjh001.springboot3001.bean.PageResult;
import com.sjh001.springboot3001.dto.StudentEmpDTO;

public interface StudentService {
    public PageResult getStudentExam(StudentEmpDTO studentEmpDTO);
}
