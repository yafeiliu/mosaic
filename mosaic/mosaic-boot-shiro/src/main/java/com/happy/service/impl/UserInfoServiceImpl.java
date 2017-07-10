package com.happy.service.impl;

import com.happy.bean.UserInfo;
import com.happy.repository.UserInfoRepository;
import com.happy.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by 刘亚飞 on 2017/6/19.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Resource
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoRepository.findByUsername(username);
    }
}
