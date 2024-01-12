package com.sjh001.springboot3001;


import com.sjh001.springboot3001.bean.Grade;
import com.sjh001.springboot3001.bean.Organ;
import com.sjh001.springboot3001.dto.OrganDTO;
import com.sjh001.springboot3001.service.GradeService;
import com.sjh001.springboot3001.service.OrganService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class GradeTest {

    @Autowired
    GradeService gradeService;

    @Autowired
    OrganService organService;

    @Test
    public void gradeTest1(){
        List<Grade> grades = gradeService.getGrade();
        grades.forEach((item)->{
            System.out.println(item);
        });
    }

    @Test
    public void gradeTest2(){
        OrganDTO organDTO = new OrganDTO();
        organDTO.setPageSize(10);
        organDTO.setPage(1);
        organDTO.setOrginname("软件");
        organDTO.setOrginid("grade_20_fall");
        List<Organ> organs = organService.getOrgan(organDTO);
        organs.forEach((item)->{
            System.out.println(item);
        });
    }
}
