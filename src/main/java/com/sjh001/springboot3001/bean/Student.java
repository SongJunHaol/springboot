package com.sjh001.springboot3001.bean;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String studentid;
    private String studentno;
    private String studentName;
    private String sex;
}
