package com.sjh001.springboot3001.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

public class TokenException extends RuntimeException{

    public  TokenException() {
        super("token不合法");
    }
}
