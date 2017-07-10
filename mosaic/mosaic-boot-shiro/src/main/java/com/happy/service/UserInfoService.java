package com.happy.service;

import com.happy.bean.UserInfo;

/**
 * Created by 刘亚飞 on 2017/6/19.
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
