package com.sjh001.springboot3001.service;

import com.sjh001.springboot3001.bean.Organ;
import com.sjh001.springboot3001.dto.OrganDTO;

import java.util.List;

public interface OrganService {
    public List<Organ> getOrgan(OrganDTO organDTO);
}
