package com.sjh001.springboot3001.config;

import com.sjh001.springboot3001.interceptor.MyInterceptor;
import org.aopalliance.intercept.Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new MyInterceptor());
        interceptorRegistration.excludePathPatterns("/login","/enroll","log.html");
        interceptorRegistration.addPathPatterns("/*");
    }
}
//"/login","/enroll","log.html"
//"/*"