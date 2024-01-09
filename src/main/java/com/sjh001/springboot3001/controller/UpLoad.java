package com.sjh001.springboot3001.controller;

import com.sjh001.springboot3001.bean.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@Controller
@Slf4j
public class UpLoad {
    @PostMapping("/upload")
    @ResponseBody
    public Result<String> upLoad(MultipartFile file){

        String path = this.getClass().getResource("").getPath();
        System.err.println("path：" + path);

        String path3 = System.getProperty("user.dir");
        System.err.println("path3：" + path3);







        try {
            log.info(String.valueOf(file.getBytes()));
            System.out.println(file.getBytes());
            byte[] c = file.getBytes();
        } catch (IOException e) {
            System.out.println("上传失败");
        }
        return Result.success("图片上传成功");
    }
}
