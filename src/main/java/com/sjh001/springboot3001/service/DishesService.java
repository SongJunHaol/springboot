package com.sjh001.springboot3001.service;

import com.sjh001.springboot3001.bean.Result;
import com.sjh001.springboot3001.dto.DishesDTO;
import org.springframework.stereotype.Service;

@Service
public interface DishesService {
    public void addDishes(DishesDTO dishesDTO);
}
