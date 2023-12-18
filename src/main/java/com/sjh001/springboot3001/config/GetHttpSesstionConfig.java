package com.sjh001.springboot3001.config;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.HandshakeResponse;
import jakarta.websocket.Session;
import jakarta.websocket.server.HandshakeRequest;
import jakarta.websocket.server.ServerEndpointConfig;


/*
* 获取到sesstion 将sesstion交给Endpoint维护。
* */
public class GetHttpSesstionConfig extends ServerEndpointConfig.Configurator {
    @Override
    public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
        //获取到当前的sesstion
        HttpSession httpSession = (HttpSession) request.getHttpSession();

        //将当前的sesstion存起来。
        sec.getUserProperties().put(HttpSession.class.getName(),httpSession);
    }
}
