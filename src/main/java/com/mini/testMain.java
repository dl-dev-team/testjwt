package com.mini;

import com.mini.utils.DateUtil;
import com.mini.utils.JwtTokenProvider;
import io.jsonwebtoken.Claims;

import java.util.Date;

public class testMain {
    public static void main(String[] args) {
        // md5("7981798723412342134"); > 签名
        // 密钥 12345678
        JwtTokenProvider jwtTokenProvider = new JwtTokenProvider("12345678");
        UserClaims claims = new UserClaims();
        claims.setUserName("Tony");
        claims.setEmail("tony@qq.com");
        claims.setScope(new String[] {"api1","api2"});
        claims.setExpiration(DateUtil.dateAdd(new Date(),2,"H"));

        String token = jwtTokenProvider.createToken(claims);

        System.out.println("生成的token：" + token);
        Claims userClaims = jwtTokenProvider.parseToken(token);
        System.out.println("解析出来的Toekn内容：" + userClaims);

    }
}