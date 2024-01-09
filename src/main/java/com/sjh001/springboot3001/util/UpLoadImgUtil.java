package com.sjh001.springboot3001.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class UpLoadImgUtil {
    public static boolean upload(MultipartFile file){

        String s = System.getProperty("user.dir");

        int lio = s.lastIndexOf("\\");
        String newFileString = s.substring(0,lio);


        File file1 = new File(newFileString,"img");
        if (!file1.exists()) {
            file1.mkdirs();
        }
        String fileName = file.getOriginalFilename();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(file1);
        stringBuffer.append("\\");
        stringBuffer.append(UUID.randomUUID());
        stringBuffer.append(fileName.substring(fileName.lastIndexOf(".")));



        try (FileOutputStream fos = new FileOutputStream(String.valueOf(stringBuffer))) {
            fos.write(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


        return true;
    }
}
