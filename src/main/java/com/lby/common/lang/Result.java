package com.lby.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description
 * @Param springboot-shiro-mybatisplus-demo
 * @Author liangby3@asiainfo.com
 * @Date 2021/7/19 16:05
 **/

@Data
public class Result implements Serializable {
    private String code;// 访问状态码
    private String msg;// 提示
    private Object data;// 返回数据

    public static Result succ(Object data){
        Result m = new Result();
        m.setCode("0");
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }

    public static Result succ(String mess, Object data){
        Result m = new Result();
        m.setCode("0");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }

    public static Result fail(String mess){
        Result m = new Result();
        m.setCode("-1");
        m.setData(null);
        m.setMsg(mess);
        return m;
    }

    public static Result fail(String mess, Object data){
        Result m = new Result();
        m.setCode("-1");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }

    public static Result fail(String code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
