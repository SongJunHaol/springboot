package com.sjh001.springboot3001;

import com.sjh001.springboot3001.bean.Dishes;
import com.sjh001.springboot3001.bean.Flavors;
import com.sjh001.springboot3001.dto.DishesDTO;
import com.sjh001.springboot3001.mapper.DishesMapper;
import com.sjh001.springboot3001.mapper.FlavorsMapper;
import com.sjh001.springboot3001.service.DishesService;
import com.sjh001.springboot3001.service.impl.DishesServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
public class DishesTest {

    @Autowired
    public DishesService dishesService;

    @Autowired
    public DishesMapper dishesMapper;

    @Autowired
    public FlavorsMapper flavorsMapper;

    @Autowired
    public DishesServiceImpl dishesServiceImpl;

    @Test
    public void inserintoDishes(){
        List<Flavors> flavorsList = new ArrayList<>();
        flavorsList.add(new Flavors("沙拉"));
        flavorsList.add(new Flavors("番茄"));
        flavorsList.add(new Flavors("老干妈"));
        flavorsList.add(new Flavors("蜜汁"));
        DishesDTO dishesDTO = new DishesDTO("烤肉拌饭",15.99,"美味佳肴，好吃的不得了",flavorsList);

        dishesServiceImpl.addDishes(dishesDTO);
    }

    @Test
    public void getSchool1(){
        Dishes dishes = new Dishes();
        dishes.setDescription("打卤面卤子满条1");
        dishes.setName("面条1");
        dishes.setPrice(15.65);
        dishesMapper.insertDishes(dishes);
        log.info(String.valueOf(dishes.getId()));
    }

    @Test
    public void inserFlavorsTest(){
//        Flavors flavors = new Flavors();
//        flavors.setName("香辣");
//        flavors.setDischid("2");
        List<Flavors> flavorsList = new ArrayList<>();
        flavorsList.add(new Flavors(1,"麻辣"));
        flavorsList.add(new Flavors(1,"麻辣"));
        flavorsList.add(new Flavors(1,"麻辣"));
        flavorsMapper.insertFlavors(flavorsList);
    }
}
