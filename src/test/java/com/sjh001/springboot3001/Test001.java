package com.sjh001.springboot3001;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test001 {
    @Test
    public void test001(){
        System.out.println(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(System.currentTimeMillis()));

        System.out.println(new Date(System.currentTimeMillis()));
    }


    @Test
    void TEst002(){
        
    }
}
