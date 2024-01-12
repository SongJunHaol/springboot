package com.sjh001.springboot3001.mapper;

import com.sjh001.springboot3001.bean.Organ;
import com.sjh001.springboot3001.dto.OrganDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrganMapper {
    public List<Organ> getOrgan(OrganDTO organDTO);
}
