package com.sjh001.springboot3001;
import com.sjh001.springboot3001.config.AllOssProperties;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.DigestUtils;

import java.io.File;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.util.UUID;
@Slf4j
@SpringBootTest
public class UserTest01 {
    @Test
    public void Test001(){
//        log.info();
        System.out.println(UUID.randomUUID());
//        File file = new File("F:\\dev\\git\\img");
//        if (!file.exists()) {
//            file.mkdirs();
//        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("fdsffdf");
        stringBuffer.append("\\");
        stringBuffer.append("fdskafd");
        System.out.println(stringBuffer);

    }


    @Test
    public void Test002(){
        String s1 = "admin";
        s1 = DigestUtils.md5DigestAsHex(s1.getBytes());
        log.info(s1);
    }
    @Test
    public void Test003(){
        log.info(String.valueOf(LocalDateTime.now()));
    }

}
