package com.sjh001.springboot3001;

import com.sjh001.springboot3001.service.UserService;
import jakarta.validation.constraints.Pattern;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot3001ApplicationTests {

    @Autowired
    private UserService userService;


    @Test
    void contextLoads() {
        userService.findByUser("sjh12463");
    }

}
