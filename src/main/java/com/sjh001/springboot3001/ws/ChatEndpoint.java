package com.sjh001.springboot3001.ws;

import com.sjh001.springboot3001.config.GetHttpSesstionConfig;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ServerEndpoint(value = "/chat",configurator = GetHttpSesstionConfig.class)
@Component
public class ChatEndpoint {


    //该集合需要是静态的，在类加载的时候执行，改类是多类的，如果不是静态的可能每个实例都需要有个map集合，
    private static final Map<String,Session> map = new ConcurrentHashMap<>();
    private HttpSession httpSession;

    //链接建立时触发
    @OnOpen
    public void onOpen(Session session, EndpointConfig endpointConfig){
        //保存sesstion。
        this.httpSession = (HttpSession) endpointConfig.getUserProperties().get(HttpSession.class.getName());
        String user =(String) this.httpSession.getAttribute("user");

        //广播消息，需要将所有用户的消息推送给所有的用户。

    }

    //接收到游览器发送的数据时候出发
    @OnMessage
    public  void onMwssage(String message){

    }

    //链接关闭时候触发
    @OnClose
    public  void onClose(){

    }

}
