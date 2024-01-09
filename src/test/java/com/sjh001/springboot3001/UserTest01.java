package com.sjh001.springboot3001;
import com.sjh001.springboot3001.config.AllOssProperties;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ResourceLoader;

import java.io.File;
import java.util.UUID;
@Slf4j
//@SpringBootTest
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

}
