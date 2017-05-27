package com.mosaic.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by 刘亚飞 on 2017/5/27.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
