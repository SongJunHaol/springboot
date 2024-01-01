package com.sjh001.springboot3001.task;

import com.sjh001.springboot3001.ws.MyWebScoket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class MyTask {
    @Autowired
    private MyWebScoket myWebScoket;


    @Scheduled(cron = "0/5 * * * * ?")
//    @Scheduled
    public void executeTask(){
//        log.info("定时任务启动了{}" , new Date());
        myWebScoket.sendToAllClient("这是服务端的消息"+new Date());
    }
}
