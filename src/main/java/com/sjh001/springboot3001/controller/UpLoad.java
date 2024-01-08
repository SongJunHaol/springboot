package com.sjh001.springboot3001.controller;

import com.sjh001.springboot3001.bean.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@Slf4j
public class UpLoad {
    @PostMapping("/upload")
    public Result<String> upLoad(MultipartFile file){
        try {
            log.info(String.valueOf(file.getBytes()));
//            System.out.println(file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Result.success("图片上传成功");
    }
}
