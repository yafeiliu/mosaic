package com.motan.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 刘亚飞 on 2017/6/29.
 */
public class Server {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:motan_server.xml");
        System.out.println("server start...");
    }
}
