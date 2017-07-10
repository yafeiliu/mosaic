package com.motan.service;

/**
 * Created by 刘亚飞 on 2017/6/29.
 */
public class FooServiceImpl implements FooService {
    @Override
    public String hello(String name) {
        System.out.println(name + " invoked rpc service");
        return "hello " + name;
    }
}
