package com.baby.controller;

import com.baby.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 刘亚飞 on 2017/6/28.
 */
@RestController
public class UserController {

    @RequestMapping("/")
    public User getUser() {
        return new User("刘", 24);
    }
}
