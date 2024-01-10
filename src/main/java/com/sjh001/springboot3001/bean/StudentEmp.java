package com.sjh001.springboot3001.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEmp {
    private String modulename;
    private String examscore;
    private String homeworkscore;
    private String bonuspoint;
    private String finalscore;
    private String credit;
    private String pubdate;
}
