package com.sjh001.springboot3001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
//开启任务调度（定时器）
@EnableScheduling
public class Springboot3001Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3001Application.class, args);
    }

}
