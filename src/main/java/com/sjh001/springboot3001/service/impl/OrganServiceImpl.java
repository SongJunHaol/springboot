package com.sjh001.springboot3001.service.impl;

import com.github.pagehelper.PageHelper;
import com.sjh001.springboot3001.bean.Organ;
import com.sjh001.springboot3001.dto.OrganDTO;
import com.sjh001.springboot3001.mapper.OrganMapper;
import com.sjh001.springboot3001.service.OrganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganServiceImpl implements OrganService {

    @Autowired
    private OrganMapper organMapper;


    @Override
    public List<Organ> getOrgan(OrganDTO organDTO) {
        PageHelper.startPage(organDTO.getPage(), organDTO.getPageSize());
        return organMapper.getOrgan(organDTO);

    }
}
