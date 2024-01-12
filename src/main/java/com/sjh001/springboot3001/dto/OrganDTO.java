package com.sjh001.springboot3001.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganDTO {
    private int page;
    private int pageSize;
    private String orginid;
    private String orginname;
}
