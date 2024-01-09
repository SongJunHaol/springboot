package com.sjh001.springboot3001.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.alioss")
@Data
public class AllOssProperties {
    private String s1;
    private String s2;
    private String s3;
    private String s4;
}
