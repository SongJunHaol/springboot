package com.sjh001.springboot3001.exception;

import com.sjh001.springboot3001.bean.Result;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

import java.util.ArrayList;
import java.util.List;

@Slf4j
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
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handlerExection(MethodArgumentNotValidException e){
        List<ObjectError> eee = e.getAllErrors();
        ArrayList aa =new ArrayList();
        eee.forEach((item)->{
            int weizhi = item.toString().lastIndexOf("[");
            aa.add(item.toString().substring(item.toString().lastIndexOf("[")));
        });
        return Result.error(aa.toString());
    }



    @ExceptionHandler(ConstraintViolationException.class)
    public Result handlerExection(ConstraintViolationException e){
        return Result.error(e.getMessage());
    }


}
