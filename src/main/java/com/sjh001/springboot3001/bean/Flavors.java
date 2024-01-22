package com.sjh001.springboot3001.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flavors {
    private String id;
    private Integer dischid;
    private String name;
    private Integer value;
    private Integer flavorsid;

    public Flavors(String name) {
        this.name = name;
    }

    public Flavors(Integer dischid, String name) {
        this.dischid = dischid;
        this.name = name;
    }
}
