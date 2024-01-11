package com.sjh001.springboot3001.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEmp {
    private String studentName;
    private String studentno;
    private String modulename;
    private String empname;
    private String expressscore;
    private String examscore;
    private String homeworkscore;
    private String bonuspoint;
    private String score;
    private String pubdate;
}
