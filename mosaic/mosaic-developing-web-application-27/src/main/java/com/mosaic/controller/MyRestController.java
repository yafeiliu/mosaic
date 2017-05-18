package com.mosaic.controller;

import com.mosaic.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 刘亚飞 on 2017/5/18.
 */
@RestController
@RequestMapping(value = "/users")
public class MyRestController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public User getUser(@PathVariable String name) {
        System.out.println(name);
        return null;
    }

    @RequestMapping(value = "/{user}", method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable int age) {
        return null;
    }

    @PostMapping("/se")
    public User UserSerializer(@RequestBody User user) {
        System.out.println(user);
        return user;
    }

}