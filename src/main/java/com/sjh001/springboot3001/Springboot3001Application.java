package com.sjh001.springboot3001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
//开启任务调度（定时器）
@EnableScheduling
//开启事务机制
@EnableTransactionManagement
public class Springboot3001Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3001Application.class, args);
    }
}
