package com.lby.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description
 * @Param springboot-shiro-mybatisplus-demo
 * @Author liangby3@asiainfo.com
 * @Date 2021/7/19 16:39
 **/

@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;
    private String avatar;
}