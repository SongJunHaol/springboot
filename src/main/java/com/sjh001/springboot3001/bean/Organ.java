package com.sjh001.springboot3001.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.NStringTypeHandler;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organ {
    private String orgname;
    private String orgId;
    private String createTime;
    private String gradeid;
}
