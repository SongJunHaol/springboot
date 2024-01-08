package com.sjh001.springboot3001.ws;


import com.sjh001.springboot3001.config.GetHttpSesstionConfig;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.*;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@ServerEndpoint(value = "/ws/{sid}" )
public class MyWebScoket {
    //该集合需要是静态的，在类加载的时候执行，改类是多类的，如果不是静态的可能每个实例都需要有个map集合，
    private static final Map<String, Session> map = new HashMap();

    //链接建立时触发
    @OnOpen
    public void onOpen(Session session , @PathParam("sid") String sid){
        System.out.println("客户端建立链接");
        map.put(sid,session);
    }

    //接收到游览器发送的数据时候出发
    @OnMessage
    public  void onMwssage(String message,@PathParam("sid") String sid){
        System.out.println("收到客户端"+sid+"的消息"+message);
    }

    //链接关闭时候触发
    @OnClose
    public  void onClose(@PathParam("sid") String sid){
        System.out.println("链接断开"+sid);
        map.remove(sid);
    }


    public void sendToAllClient(String message){
        Collection<Session> values = map.values();
        for(Session session : values){
            try {
                session.getBasicRemote().sendText(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
