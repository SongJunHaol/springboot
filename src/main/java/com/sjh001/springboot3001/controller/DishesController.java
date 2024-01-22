package com.sjh001.springboot3001.controller;

import com.sjh001.springboot3001.bean.Result;
import com.sjh001.springboot3001.dto.DishesDTO;
import com.sjh001.springboot3001.service.impl.DishesServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DishesController {
    @Autowired
    DishesServiceImpl dishesServiceImpl;

    @PostMapping("/addDishesAndFiavors")
    public Result addDishesAndFiavors(@RequestBody DishesDTO dishesDTO){
        log.info(dishesDTO.toString());
        dishesServiceImpl.addDishes(dishesDTO);
        return Result.success(dishesDTO);
    }
}
