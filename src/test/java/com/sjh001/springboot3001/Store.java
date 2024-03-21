package com.sjh001.springboot3001;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Store {
    private String name;
    private String className;
    private double shuxue;
    private double yingyu;
    private double yuwen;
    private double zhengzhi;
}
