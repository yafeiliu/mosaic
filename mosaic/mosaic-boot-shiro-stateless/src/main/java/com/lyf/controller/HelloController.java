package com.lyf.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 刘亚飞 on 2017/6/15.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String params1,String params2){
        return "hello,Andy,params1="+params1+",params1="+params2;
    }

    @RequestMapping("/hello3")
    public String hello3(){
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        System.out.println(session);
        return"hello3,Andy";
    }

    @RequestMapping("/hello4")
    @RequiresRoles("admin")
    @ResponseBody
// @RequiresPermissions("userInfo:add")//权限管理;
    public String hello4(){
        return "hello4,Andy";
    }
}
