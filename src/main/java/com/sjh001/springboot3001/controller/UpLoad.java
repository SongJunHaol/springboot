package com.sjh001.springboot3001.controller;


import com.sjh001.springboot3001.bean.Result;
import com.sjh001.springboot3001.util.UpLoadImgUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@Controller
public class UpLoad {
    @PostMapping("/upload")
    @ResponseBody
    public Result<String> upload(MultipartFile file){
        boolean b = UpLoadImgUtil.upload(file);
        if(b){
            return Result.success("上传成功");
        }
        return Result.success("上传失败");
    }
}
