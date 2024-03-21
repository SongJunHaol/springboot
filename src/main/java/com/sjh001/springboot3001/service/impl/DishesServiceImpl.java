package com.sjh001.springboot3001.service.impl;

import com.sjh001.springboot3001.bean.Dishes;
import com.sjh001.springboot3001.bean.Flavors;
import com.sjh001.springboot3001.bean.Result;
import com.sjh001.springboot3001.dto.DishesDTO;
import com.sjh001.springboot3001.mapper.DishesMapper;
import com.sjh001.springboot3001.mapper.FlavorsMapper;
import com.sjh001.springboot3001.service.DishesService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Service
@Slf4j
public class DishesServiceImpl implements DishesService {


    @Autowired
    private DishesMapper dishesMapper;

//    @Autowired
    @Resource
    private FlavorsMapper flavorsMapper;


    @Transactional
    @Override
    public void addDishes(DishesDTO dishesDTO) {
        Dishes dishes = new Dishes();
        BeanUtils.copyProperties(dishesDTO,dishes);

        Integer dishesSum = dishesMapper.insertDishes(dishes);
        Integer dishesId = dishes.getId();
        List<Flavors> flavors = dishesDTO.getFlavors();
        flavors.forEach((item)->{
            item.setDischid(dishesId);
        });

//        int i = 2/0;

        Integer sum = flavorsMapper.insertFlavors(flavors);

        log.info("dishesid:{}",dishesId);
        log.info("flavors:{}条",sum);
    }
}
