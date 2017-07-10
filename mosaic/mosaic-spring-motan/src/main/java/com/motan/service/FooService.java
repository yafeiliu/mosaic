package com.motan.service;

import com.weibo.api.motan.transport.async.MotanAsync;

/**
 * Created by 刘亚飞 on 2017/6/29.
 */

@MotanAsync
public interface FooService {
    public String hello(String name);
}
