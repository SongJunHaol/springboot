package com.sjh001.springboot3001.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {
    private Integer  code; //状态码
    private String message; //提示信息
    private T data; //相应信息

    //成功的方法(携带相应数据)
    public static <E> Result<E> success(E data){

        return  new Result<>(200,"操作成功",data);
    }

    //操作成功
    public static Result success(){
        return new Result(200,"操作成功",null);
    }

    //失败的方法
    public static Result error(String message){
        return new Result(401,"操作失败",message);
    }
}
