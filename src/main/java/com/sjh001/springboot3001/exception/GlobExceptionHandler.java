package com.sjh001.springboot3001.exception;

import com.sjh001.springboot3001.bean.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

@RestControllerAdvice
public class GlobExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result handlerExection(Exception e){
//        e.printStackTrace();
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(TokenException.class)
    public Result handlerExection(TokenException e){
//        e.printStackTrace();
        return Result.error(e.getMessage());
    }
    @ExceptionHandler(UserException.class)
    public Result handlerExection(UserException e){
//        e.printStackTrace();
        return Result.error(e.getMessage());
    }

}
