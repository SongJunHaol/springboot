package com.sjh001.springboot3001;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentStore {
    private String StudentName;
    private String sex;
    private Integer store;
    private String StudentId;
}
