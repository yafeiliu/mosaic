package com.mosaic.spring_boot_starter_hello;

/**
 * Created by 刘亚飞 on 2017/5/27.
 */
public class HelloService {
    private String msg;

    public String sayHellp() {
        return "hello" + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
