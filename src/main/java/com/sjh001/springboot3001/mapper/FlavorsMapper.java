package com.sjh001.springboot3001.mapper;

import com.sjh001.springboot3001.bean.Flavors;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FlavorsMapper {
    Integer insertFlavors(List<Flavors> flavors);
}
