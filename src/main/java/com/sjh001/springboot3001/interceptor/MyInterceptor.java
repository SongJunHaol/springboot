package com.sjh001.springboot3001.interceptor;

import com.sjh001.springboot3001.exception.TokenException;
import com.sjh001.springboot3001.util.JWTutil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        return HandlerInterceptor.super.preHandle(request, response, handler);
        System.out.println("请求进来了");
        String token = request.getHeader("token");
        if(token==null){
            throw new TokenException();
        }
        boolean istoken = JWTutil.isToken(token);
        System.out.println(token);
        System.out.println(istoken);
        if(istoken){
            return true;
        }else {
            response.setStatus(401);
            throw new TokenException();
//            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
        System.out.println("拦截第二部");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截第三步");
        //        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
