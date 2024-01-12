package com.sjh001.springboot3001.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    private String gradeid;
    private String gradeName;
    private String state;
    private String indate;
    private String makedate;
}
