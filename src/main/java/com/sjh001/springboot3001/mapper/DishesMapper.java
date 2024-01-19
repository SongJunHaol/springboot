package com.sjh001.springboot3001.mapper;

import com.sjh001.springboot3001.bean.Dishes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishesMapper {
    Integer insertDishes(Dishes dishes);
}
