package com.sjh001.springboot3001.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import java.util.Date;
import java.util.HashMap;
public class JWTutil  {
    private static final String KEY = "com.sjh.www.123";
    public static String getToken(HashMap hashMap){
        return JWT.create()
                .withClaim("user",hashMap)
                .withExpiresAt(new Date(System.currentTimeMillis()+1000*60*60))
                .sign(Algorithm.HMAC256(KEY));
    }
    public static boolean isToken(String token){
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(KEY)).build();
        try {
            jwtVerifier.verify(token);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
