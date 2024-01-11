package com.sjh001.springboot3001;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class RedisTest {


    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void redisTest(){
        System.out.println(redisTemplate);
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("name","张三");
        String s = (String) valueOperations.get("name");
        System.out.println(s);
    }

}
