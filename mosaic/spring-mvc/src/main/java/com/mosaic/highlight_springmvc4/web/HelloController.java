package com.mosaic.highlight_springmvc4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 刘亚飞 on 2017/5/27.
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        System.out.println("come on bab");
        return "index";
    }
}
