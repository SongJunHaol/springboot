package com.sjh001.springboot3001;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.sjh001.springboot3001.util.JWTutil;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class Test001 {
    @Test
    public void test001(){
        System.out.println(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(System.currentTimeMillis()));

        System.out.println(new Date(System.currentTimeMillis()));
    }


    @Test
    void TEst002(){
        String ip = "192.168.1.1";
        String username = "宋军昊";
        String userid = "1000";
        HashMap hashMap = new HashMap();
        hashMap.put("ip",ip);
        hashMap.put("username",username);
        hashMap.put("userid",userid);
        String token = JWT.create()
                .withClaim("user",hashMap)
                .withExpiresAt(new Date(System.currentTimeMillis()+1000*60))
                .sign(Algorithm.HMAC256("song"));
        System.out.println(token);
    }

    @Test
    void Test003(){
        String s1 = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImlwIjoiMTkyLjE2OC4xLjEiLCJ1c2VyaWQiOiIxMDAwIiwidXNlcm5hbWUiOiLlrovlhpvmmIoifSwiZXhwIjoxNzAxNjA2ODkyfQ.Nsuzx7eFtqk7UWTlWpQrGLBx6o4jfMza8h31fzunYz0";
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("song")).build();

        try {
            DecodedJWT decodedJWT = jwtVerifier.verify(s1);//验证token,生成一个解析后的jwt对象
            Map map = decodedJWT.getClaims();
            System.out.println(map.get("user"));
        }catch (Exception e){
            System.out.println("token不合法");
        }
    }

    @Test
    void Test004(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7InVzZXJpcCI6IjA6MDowOjA6MDowOjA6MSIsInVzZXJuYW1lIjoxMDl9LCJleHAiOjE3MDE2MTQ0ODJ9.SGj9GEqhdGQmsIlEn1PW9HRj96TGY0kSLYNR8_1vIAU";
        boolean b = JWTutil.isToken(token);
        System.out.println(b);
    }

    @Test
    void Test005(){
        String content = "I am noob from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
    }
    @Test
    void Test006(){
        System.out.println(UUID.randomUUID());
    }
}

