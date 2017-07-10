package com.motan.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 刘亚飞 on 2017/6/29.
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
        //同步调用
        FooService service = (FooService) ctx.getBean("remoteService");
        System.out.println(service.hello("motan"));

    }
}
