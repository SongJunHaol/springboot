package com.sjh001.springboot3001.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEmpDTO {
    private int page;
    private int pageSize;
    private String studentname;
    private String enrolTime;
    private String speciality;
    private String clazz;
}
