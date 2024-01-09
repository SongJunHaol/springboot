package com.sjh001.springboot3001;

import com.sjh001.springboot3001.config.AllOssProperties;
import com.sjh001.springboot3001.service.UserService;
import jakarta.validation.constraints.Pattern;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class Springboot3001ApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private AllOssProperties allOssProperties;


    @Test
    void contextLoads() {

        log.info(allOssProperties.getS1());
        log.info(allOssProperties.getS2());
        log.info(allOssProperties.getS3());
        log.info(allOssProperties.getS4());
    }

}
