package com.sjh001.springboot3001.ws;

import com.sjh001.springboot3001.config.GetHttpSesstionConfig;
import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;

@ServerEndpoint(value = "/chat",configurator = GetHttpSesstionConfig.class)
@Component
public class ChatEndpoint {

    //链接建立时触发
    @OnOpen
    public void onOpen(Session session, EndpointConfig endpointConfig){}

    //接收到游览器发送的数据时候出发
    @OnMessage
    public  void onMwssage(String message){}

    //链接关闭时候触发
    @OnClose
    public  void onClose(){}

}
