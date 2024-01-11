package com.sjh001.springboot3001;


import com.sjh001.springboot3001.bean.PageResult;
import com.sjh001.springboot3001.dto.EmployeeDTO;
import com.sjh001.springboot3001.dto.StudentEmpDTO;
import com.sjh001.springboot3001.service.impl.SchoolServiceImpl;
import com.sjh001.springboot3001.service.impl.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class StudentExamTest {


    @Autowired
    public StudentServiceImpl studentService;

    @Autowired
    public SchoolServiceImpl schoolService;

    @Test
    public void getStudnetExam(){
        StudentEmpDTO studentEmpDTO = new StudentEmpDTO();
        studentEmpDTO.setPage(1);
        studentEmpDTO.setPageSize(10);
        studentEmpDTO.setDiscipline("设计");
        studentEmpDTO.setStudentId("20200607");
//        studentEmpDTO.setSort(1);
//        log.info(String.valueOf(studentService.getStudentExam(studentEmpDTO)));
        PageResult pageResult = studentService.getStudentExam(studentEmpDTO);
    }

    @Test
    public void getSchool1(){
        EmployeeDTO employeeDTO = new EmployeeDTO();

//        schoolService.getSchool1()
    }
}
