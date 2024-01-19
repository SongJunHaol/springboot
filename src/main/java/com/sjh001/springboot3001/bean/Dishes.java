package com.sjh001.springboot3001.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dishes {
    private Integer id;
    private String categer;
    private String description;
    private String name;
    private double price;
    private Integer status;
}
