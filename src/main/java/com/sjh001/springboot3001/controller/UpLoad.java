package com.sjh001.springboot3001.controller;


import com.sjh001.springboot3001.bean.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@Controller
public class UpLoad {
    @PostMapping("/upload")
    @ResponseBody
    public Result<String> upload(MultipartFile file){

        log.info("文件上传{}",file.getName());
        log.info("文件上传{}",file.getContentType());
        log.info("文件上传{}",file.getSize());
        log.info("文件上传{}",file.getOriginalFilename());

        String originalName = file.getOriginalFilename();
//        String ext = "." + FilenameUtils.getExtension(originalName);
        return Result.success("回到成功");
    }
}