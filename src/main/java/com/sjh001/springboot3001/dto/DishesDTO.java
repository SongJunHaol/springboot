package com.sjh001.springboot3001.dto;


import com.sjh001.springboot3001.bean.Flavors;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DishesDTO {
    private Integer id;
    private String categer;
    private String description;
    private String name;
    private double price;
    private Integer status;
    List<Flavors> flavors;

    public DishesDTO(String name, double price, String description, List<Flavors> flavors) {
        this.description = description;
        this.name = name;
        this.price = price;
        this.flavors = flavors;
    }
}
