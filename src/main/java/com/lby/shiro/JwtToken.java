package com.lby.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Description
 * @Param springboot-shiro-mybatisplus-demo
 * @Author liangby3@asiainfo.com
 * @Date 2021/7/19 16:34
 **/

public class JwtToken implements AuthenticationToken {
    private String token;
    public JwtToken(String token) {
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }
    @Override
    public Object getCredentials() {
        return token;
    }
}

